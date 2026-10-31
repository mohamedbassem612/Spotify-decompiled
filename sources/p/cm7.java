package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public enum cm7 implements v190 {
    UNKNOWN_ATTRIBUTE(0),
    DERIVATIVE(1),
    OWNED_BY_USER(2),
    MADE_FOR_USER(3),
    EXPLICIT_CONTENT(4),
    PAY_WALLED(5),
    GENERATIVE(6),
    GEN_SESSION_HINT_FREE(7),
    UNRECOGNIZED(-1);

    public final int a;

    cm7(int i) {
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
