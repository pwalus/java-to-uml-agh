package translator;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Collectors;

public class DirectoryList {

    private final File root;

    public DirectoryList(File root) {
        this.root = root;
    }

    public List<Path> getList() {
        if (root == null) {
            return null;
        }

        List<Path> paths = new ArrayList<>();
        Queue<File> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            File node = queue.remove();
            addToPaths(paths, node);

            File[] children = node.listFiles(File::isDirectory);

            if (children != null) {
                Collections.addAll(queue, children);
            }
        }

        return paths;
    }

    private void addToPaths(List<Path> paths, File node) {
        List<Path> newPaths = Arrays.stream(
            Objects.requireNonNull(node.listFiles(file -> !file.isDirectory())))
            .map(file -> Paths.get(file.getAbsolutePath()))
            .collect(Collectors.toList());

        paths.addAll(newPaths);
    }

}
