package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum cq0 implements v190 {
    UNKNOWN(0),
    AUDIO(1),
    VIDEO(2),
    DISPLAY(3),
    DUMMY(4),
    UNRECOGNIZED(-1);

    public final int a;

    cq0(int i) {
        this.a = i;
    }

    public static cq0 a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AUDIO;
        }
        if (i == 2) {
            return VIDEO;
        }
        if (i == 3) {
            return DISPLAY;
        }
        if (i != 4) {
            return null;
        }
        return DUMMY;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
