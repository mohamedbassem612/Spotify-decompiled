package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum evd0 implements v190 {
    SCHEDULED(0),
    LIVE(1),
    ENDED(2),
    CANCELLED(3),
    UNRECOGNIZED(-1);

    public final int a;

    evd0(int i) {
        this.a = i;
    }

    public static evd0 a(int i) {
        if (i == 0) {
            return SCHEDULED;
        }
        if (i == 1) {
            return LIVE;
        }
        if (i == 2) {
            return ENDED;
        }
        if (i != 3) {
            return null;
        }
        return CANCELLED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
