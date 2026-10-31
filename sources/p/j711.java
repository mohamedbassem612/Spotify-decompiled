package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum j711 implements v190 {
    REDEMPTION_STATE_UNSPECIFIED(0),
    REDEMPTION_STATE_PENDING(1),
    REDEMPTION_STATE_SUCCESS(2),
    REDEMPTION_STATE_INVALID_CODE(3),
    REDEMPTION_STATE_REDEEMED(4),
    UNRECOGNIZED(-1);

    public final int a;

    j711(int i) {
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
