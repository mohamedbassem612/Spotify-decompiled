package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public enum oig implements v190 {
    CLIENT_CAPABILITY_UNSPECIFIED(0),
    CAMPAIGN_CARD_RESERVED_SHARE_V1(1),
    UNRECOGNIZED(-1);

    public final int a;

    oig(int i) {
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
