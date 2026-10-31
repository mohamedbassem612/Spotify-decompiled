package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum bpz implements v190 {
    DEFAULT(0),
    VIDEO(1),
    UNRECOGNIZED(-1);

    public final int a;

    bpz(int i) {
        this.a = i;
    }

    public static bpz a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return VIDEO;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
