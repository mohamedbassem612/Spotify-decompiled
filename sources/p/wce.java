package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum wce implements v190 {
    NONE(0),
    UP(1),
    DOWN(2),
    NEW(3),
    UNRECOGNIZED(-1);

    public final int a;

    wce(int i) {
        this.a = i;
    }

    public static wce a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return UP;
        }
        if (i == 2) {
            return DOWN;
        }
        if (i != 3) {
            return null;
        }
        return NEW;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
