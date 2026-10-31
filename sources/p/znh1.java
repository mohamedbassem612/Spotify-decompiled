package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum znh1 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    UPDATE_ACTION_UNSPECIFIED(0),
    UPDATE_ACTION_UPDATE_AND_GENERATE(1),
    UPDATE_ACTION_UPDATE_ONLY(2),
    UNRECOGNIZED(-1);

    public final int a;

    znh1(int i) {
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
