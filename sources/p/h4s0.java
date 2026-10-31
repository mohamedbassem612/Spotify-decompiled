package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum h4s0 implements v190 {
    UNKNOWN_PARTY_STATUS(0),
    SCHEDULED(1),
    UPCOMING(2),
    READY(3),
    LIVE(4),
    CLOSED(5),
    ARCHIVED(6),
    SCRAPPED(7),
    UNRECOGNIZED(-1);

    public final int a;

    h4s0(int i) {
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
