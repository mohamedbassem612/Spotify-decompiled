package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum j0z implements v190 {
    ENTRY_STATE_UNSPECIFIED(0),
    ENTRY_STATE_UPCOMING(1),
    ENTRY_STATE_ACTIVE(2),
    ENTRY_STATE_ENDED(3),
    ENTRY_STATE_SOLD_OUT(4),
    ENTRY_STATE_CANCELLED(5),
    ENTRY_STATE_PURCHASED(6),
    UNRECOGNIZED(-1);

    public final int a;

    j0z(int i) {
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
