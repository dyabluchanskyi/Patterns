package strategy;

import strategy.api.CompressAlgorithm;

import java.io.File;

/**
 * User: Dmytro Iabluchanskyi
 * Date: 4/4/13
 * Time: 12:17 AM
 */
public class CompressManager {

    private CompressAlgorithm algorithm;

    public CompressManager(CompressAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(CompressAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void makeArchive(File file){
        algorithm.compress(file);
    }
}
