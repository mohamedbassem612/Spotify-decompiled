package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum j8h0 implements v190 {
    MATCH_BOUNDARIES_UNSPECIFIED(0),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_BOUNDARIES_TRIMMED(1),
    MATCH_BOUNDARIES_EXPANDED(2),
    MATCH_BOUNDARIES_DYNAMIC(3),
    UNRECOGNIZED(-1);

    public final int a;

    j8h0(int i) {
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
