package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum g7d implements v190 {
    CAMPAIGN_USER_STATE_INELIGIBLE_REASON_UNSPECIFIED(0),
    CAMPAIGN_USER_STATE_INELIGIBLE_FRAUD_SUSPECTED(1),
    CAMPAIGN_USER_STATE_INELIGIBLE_ACCOUNT_AGE(2),
    CAMPAIGN_USER_STATE_INELIGIBLE_AGE_RESTRICTION(3),
    CAMPAIGN_USER_STATE_INELIGIBLE_SOLD_OUT(4),
    CAMPAIGN_USER_STATE_INELIGIBLE_CANCELLED(5),
    CAMPAIGN_USER_STATE_INELIGIBLE_SALE_ENDED(6),
    UNRECOGNIZED(-1);

    public final int a;

    g7d(int i) {
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
