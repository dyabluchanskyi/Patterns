package strategy;

import strategy.api.CompressAlgorithm;

import java.io.File;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/4/13
 * Time: 12:17 AM
 */
public class ZipAlgorithm implements CompressAlgorithm {
    @Override
    public void compress(File file) {
        System.out.println("compress file into ZIP archive");
    }
}
