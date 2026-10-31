package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum eyx0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    PROMPT_SOURCE_UNSPECIFIED(0),
    PROMPT_SOURCE_SUGGESTED(1),
    PROMPT_SOURCE_FREEFORM(2),
    UNRECOGNIZED(-1);

    public final int a;

    eyx0(int i) {
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
