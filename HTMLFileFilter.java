package com.javarush.task.task32.task3209;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File file) {
        return (file.getName().toLowerCase().endsWith(".html")) || (file.getName().toLowerCase().endsWith(".htm")) || file.isDirectory();
    }

    @Override
    public String getDescription() {
        return "HTML and HTM files" ;
    }
}
