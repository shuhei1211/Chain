package jp.shuhei.core;import java.io.File;/** * ChainFileInterface * @author Shuhei.iwamoto * @version 1.0.0 */public interface IFChainFile<T extends IFChainFile<T>> {    /**     * delete Folder     * @param file     * @return self     */    T deleteAllDir(File file);}