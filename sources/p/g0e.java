package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum g0e implements v190 {
    ACTION_UNKNOWN(0),
    ACTION_DOWNLOAD(1),
    ACTION_SAVE(2),
    ACTION_MIX(3),
    ACTION_ADD_TO_QUEUE(4),
    UNRECOGNIZED(-1);

    public final int a;

    g0e(int i) {
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
