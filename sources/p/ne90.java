package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum ne90 implements v190 {
    INVITE_STATUS_UNSPECIFIED(0),
    INVITE_STATUS_NONE(1),
    INVITE_STATUS_SENT(2),
    INVITE_STATUS_RECEIVED(3),
    UNRECOGNIZED(-1);

    public final int a;

    ne90(int i) {
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
