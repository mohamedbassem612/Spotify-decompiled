package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum pln0 implements v190 {
    NONE(0),
    CANVAS_DISABLED(1),
    LOW_DISTRACTION(2),
    DATA_SAVER(3),
    TRAIT_NOT_RESOLVED(4);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    pln0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
