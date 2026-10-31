package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum qg01 implements v190 {
    REASON_UNSPECIFIED(0),
    REASON_CONTENT_SHARING(1),
    REASON_COLLABORATIVE_PLAYLISTS(2),
    REASON_BLENDS(3),
    REASON_GROUP_SESSIONS(4),
    REASON_FAMILY(5),
    REASON_FOLLOWING(6),
    REASON_MESSAGING(7),
    REASON_WRAPPED_PARTY(8),
    UNRECOGNIZED(-1);

    public final int a;

    qg01(int i) {
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
