package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum k1y0 implements v190 {
    BACKEND_ERROR(0),
    PROMPT_VALIDATOR_ERROR(1),
    TERMS_AND_SERVICES_CHECKER_ERROR(2),
    RATE_LIMIT_EXCEEDED_ERROR(3),
    UNRECOGNIZED(-1);

    public final int a;

    k1y0(int i) {
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
