package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum hsv0 implements z0z {
    CONTROL(rca.b),
    /* JADX INFO: Fake field, exist only in values array */
    UPGRADE("upgrade"),
    /* JADX INFO: Fake field, exist only in values array */
    GET_PREMIUM("get_premium"),
    /* JADX INFO: Fake field, exist only in values array */
    TRY_PREMIUM("try_premium"),
    /* JADX INFO: Fake field, exist only in values array */
    SUBSCRIBE("subscribe"),
    /* JADX INFO: Fake field, exist only in values array */
    PLANS("plans"),
    /* JADX INFO: Fake field, exist only in values array */
    PREMIUM_PLANS("premium_plans");

    public final String a;

    hsv0(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
