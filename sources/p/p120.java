package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum p120 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_UNKNOWN(0),
    FIELD_EMAIL(1),
    FIELD_PASSWORD(2),
    FIELD_BIRTHDATE(3),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_DISPLAY_NAME(4),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_GENDER(5),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_EULA_AGREEMENT(6),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_PERSONAL_INFO_COLLECTION(7),
    /* JADX INFO: Fake field, exist only in values array */
    FIELD_RECAPTCHA(8),
    UNRECOGNIZED(-1);

    public final int a;

    p120(int i) {
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
