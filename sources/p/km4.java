package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum km4 implements z0z {
    US_MARKET("us_market"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_US_MARKET("non_us_market"),
    /* JADX INFO: Fake field, exist only in values array */
    EMPLOYEE_DOGFOODING_MARKET("employee_dogfooding_market"),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_AVAILABLE_IN_HEBREW("not_available_in_hebrew");

    public final String a;

    km4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
