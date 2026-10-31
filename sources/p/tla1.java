package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public enum tla1 implements v190 {
    SOURCE_TOOL_UNSPECIFIED(0),
    SOURCE_TOOL_PROMPT(1),
    SOURCE_TOOL_STUDIO_AGENT(2),
    UNRECOGNIZED(-1);

    public final int a;

    tla1(int i) {
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
