package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum wc21 implements v190 {
    UNKNOWN_RENDERING(0),
    CAROUSEL(1),
    LIST(2),
    UNRECOGNIZED(-1);

    public final int a;

    wc21(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
