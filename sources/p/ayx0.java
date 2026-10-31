package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum ayx0 implements v190 {
    /* JADX INFO: Fake field, exist only in values array */
    PROMPT_INPUT_TYPE_UNSPECIFIED(0),
    PROMPT_INPUT_TYPE_VOICE(1),
    PROMPT_INPUT_TYPE_TEXT(2),
    PROMPT_INPUT_TYPE_SUGGESTED(3),
    UNRECOGNIZED(-1);

    public final int a;

    ayx0(int i) {
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
