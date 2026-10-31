package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum y831 implements v190 {
    STATE_UNSPECIFIED(0),
    STATE_NOT_STARTED(1),
    STATE_IN_PROGRESS(2),
    STATE_FINISHED(3),
    UNRECOGNIZED(-1);

    public final int a;

    y831(int i) {
        this.a = i;
    }

    public static y831 a(int i) {
        if (i == 0) {
            return STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return STATE_NOT_STARTED;
        }
        if (i == 2) {
            return STATE_IN_PROGRESS;
        }
        if (i != 3) {
            return null;
        }
        return STATE_FINISHED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
