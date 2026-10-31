package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum s80 implements v190 {
    CANCEL_FLOW(0),
    AVAILABLE_PLANS(1),
    INVITE_USER(2),
    EDIT_ADDRESS(3),
    PREPAID_TOPUP(4),
    RENEW_SUBSCRIPTION(5),
    CHANGE_PIN(6),
    INVITE_HELP(7),
    AUDIOBOOK_ENTRY(8),
    INVITE_OR_REMOVE_SUBACCOUNT(9),
    ADD_SUBACCOUNT(10),
    REMOVE_SUBACCOUNT(11),
    INVITE_SUBACCOUNT(12),
    ASTRO_GET_DETAILS(13),
    ASTRO_ENROLL(14),
    ASTRO_MANAGE(15),
    ASTRO_REQUEST(16),
    REMOVE_EXPIRING_ACCOUNT(17),
    MULTI_USER_PLAN_VERIFICATION(18),
    PARENTAL_CONTROLS(19),
    UNRECOGNIZED(-1);

    public final int a;

    s80(int i) {
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
