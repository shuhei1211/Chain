package jp.shuhei.chain;import jp.shuhei.core.IFChainEditText;/** * ChainEditText * @author Shuhei.iwamoto * @version 1.0.0 */public class ChainEditText<T extends ChainEditText<T>> implements IFChainEditText<ChainEditText<T>> {    private static final String TAG = "ChainEditText";    private final ChainEditText self = this;}