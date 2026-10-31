package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum kqq0 implements v190 {
    ORCHESTRATION_STACK_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    ORCHESTRATION_STACK_LIST_PLAYER(1),
    ORCHESTRATION_STACK_CONTEXT_PLAYER(2),
    ORCHESTRATION_STACK_MULTIPLAYER(3),
    ORCHESTRATION_STACK_STANDALONE(4),
    UNRECOGNIZED(-1);

    public final int a;

    kqq0(int i) {
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
