package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface hdn0 extends ven0, tob1 {
    default Object getValue() {
        return Integer.valueOf(((err0) this).s());
    }

    default void setValue(Object obj) {
        ((err0) this).t(((Number) obj).intValue());
    }
}
