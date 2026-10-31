package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum sn30 implements v190 {
    FRESH_FINDS_FORWARD_STATUS_UNSPECIFIED(0),
    FRESH_FINDS_FORWARD_STATUS_ACTIVE(1),
    FRESH_FINDS_FORWARD_STATUS_ALUMNI(2),
    UNRECOGNIZED(-1);

    public final int a;

    sn30(int i) {
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
