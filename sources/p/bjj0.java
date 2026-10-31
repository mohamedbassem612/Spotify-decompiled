package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum bjj0 implements v190 {
    SEQUENTIAL(1),
    EPISODIC(2),
    RECENT(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    bjj0(int i) {
        this.a = i;
    }

    public static bjj0 a(int i) {
        if (i == 1) {
            return SEQUENTIAL;
        }
        if (i == 2) {
            return EPISODIC;
        }
        if (i != 3) {
            return null;
        }
        return RECENT;
    }

    public final int getNumber() {
        return this.a;
    }
}
