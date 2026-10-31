package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum zbv0 implements v190 {
    DRAFT(0),
    SCHEDULED(1),
    LIVE(2),
    CLOSED(3),
    BLOCKED(4),
    UNRECOGNIZED(-1);

    public final int a;

    zbv0(int i) {
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
