package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum yy10 implements v190 {
    BLOCKING(0),
    BACKGROUND_SYNC(1),
    ASYNC(2),
    PUSH_INITIATED(3),
    RECONNECT(4),
    UNRECOGNIZED(-1);

    private static final y190 internalValueMap = new lhc((byte) 10);
    private final int value;

    yy10(int i) {
        this.value = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
