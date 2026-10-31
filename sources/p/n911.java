package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum n911 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    REFERRALS_ENTRYPOINT_SURFACE_UNSPECIFIED(0),
    REFERRALS_ENTRYPOINT_SURFACE_BLEND(1),
    REFERRALS_ENTRYPOINT_SURFACE_JAM(2),
    UNRECOGNIZED(-1);

    public final int a;

    n911(int i) {
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
