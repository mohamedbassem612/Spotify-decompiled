package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum z0z0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    OFFLINE_STATUS_NONE(0),
    OFFLINE_STATUS_AVAILABLE_OFFLINE(1),
    UNRECOGNIZED(-1);

    public final int a;

    z0z0(int i) {
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
