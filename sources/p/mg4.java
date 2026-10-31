package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum mg4 implements z0z {
    DISABLE("disable"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPANY("company"),
    /* JADX INFO: Fake field, exist only in values array */
    END_USER_AGREEMENT("end_user_agreement"),
    /* JADX INFO: Fake field, exist only in values array */
    INDONESIA_END_USER_AGREEMENT("indonesia_end_user_agreement");

    public final String a;

    mg4(String str) {
        this.a = str;
    }

    @Override // p.z0z
    public final String value() {
        return this.a;
    }
}
