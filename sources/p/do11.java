package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum do11 implements v190 {
    RELATIONSHIP_TYPE_UNSPECIFIED(0),
    REMIX(1),
    EXTENDED(2),
    COVER(3),
    LIVE(4),
    UNRECOGNIZED(-1);

    public final int a;

    do11(int i) {
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
