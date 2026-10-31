package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum gnm1 implements v190 {
    YOTI_VERIFICATION_TYPE_UNKNOWN(0),
    YOTI_VERIFICATION_TYPE_ID_AND_SELFIE(1),
    YOTI_VERIFICATION_TYPE_ID_ONLY(2),
    UNRECOGNIZED(-1);

    public final int a;

    gnm1(int i) {
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
