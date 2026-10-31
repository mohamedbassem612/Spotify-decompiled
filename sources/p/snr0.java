package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum snr0 implements v190 {
    alignment_unspecified(0),
    left(1),
    center(2),
    right(3),
    UNRECOGNIZED(-1);

    public final int a;

    snr0(int i) {
        this.a = i;
    }

    public static snr0 a(int i) {
        if (i == 0) {
            return alignment_unspecified;
        }
        if (i == 1) {
            return left;
        }
        if (i == 2) {
            return center;
        }
        if (i != 3) {
            return null;
        }
        return right;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
