package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum ocs0 implements v190 {
    LEGAL_TERM_TYPE_UNKNOWN(0),
    LEGAL_TERM_TYPE_TEXT(1),
    LEGAL_TERM_TYPE_CONSPICUOUS_TEXT(2),
    LEGAL_TERM_TYPE_CHECKBOX(3),
    LEGAL_TERM_TYPE_CONSPICUOUS_CHECKBOX(4),
    UNRECOGNIZED(-1);

    public final int a;

    ocs0(int i) {
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
