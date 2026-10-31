package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum a1z0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    PLAYED_STATE_NONE(0),
    PLAYED_STATE_UNPLAYED(1),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYED_STATE_IN_PROGRESS(2),
    UNRECOGNIZED(-1);

    public final int a;

    a1z0(int i) {
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
