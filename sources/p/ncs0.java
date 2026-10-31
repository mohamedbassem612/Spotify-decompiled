package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum ncs0 implements v190 {
    INPUT_FIELD_TYPE_UNKNOWN(0),
    INPUT_FIELD_TYPE_TEXT(1),
    INPUT_FIELD_TYPE_NUMBER(2),
    INPUT_FIELD_TYPE_PHONE(3),
    INPUT_FIELD_TYPE_EMAIL(4),
    INPUT_FIELD_TYPE_HIDDEN(5),
    UNRECOGNIZED(-1);

    public final int a;

    ncs0(int i2) {
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
