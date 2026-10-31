package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum ml implements v190 {
    GENDER_UNKNOWN(0),
    GENDER_MALE(1),
    GENDER_FEMALE(2),
    GENDER_NON_BINARY(3),
    GENDER_OTHER(4),
    GENDER_PREFER_NOT_TO_SAY(5),
    UNRECOGNIZED(-1);

    public final int a;

    ml(int i2) {
        this.a = i2;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
