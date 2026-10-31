package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum w80 implements v190 {
    ACTION_TYPE_UNSPECIFIED(0),
    ACTION_TYPE_PLAY(1),
    ACTION_TYPE_NAVIGATE(2),
    ACTION_TYPE_DOWNLOAD(4),
    UNRECOGNIZED(-1);

    public final int a;

    w80(int i) {
        this.a = i;
    }

    public static w80 a(int i) {
        if (i == 0) {
            return ACTION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTION_TYPE_PLAY;
        }
        if (i == 2) {
            return ACTION_TYPE_NAVIGATE;
        }
        if (i != 4) {
            return null;
        }
        return ACTION_TYPE_DOWNLOAD;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
