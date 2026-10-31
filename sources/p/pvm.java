package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public enum pvm implements v190 {
    CONTRIBUTION_TYPE_UNSPECIFIED(0),
    CONTRIBUTION_TYPE_NOTE(1),
    CONTRIBUTION_TYPE_COMMENT(2),
    CONTRIBUTION_TYPE_REACTION(3),
    UNRECOGNIZED(-1);

    public final int a;

    pvm(int i) {
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
