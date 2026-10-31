package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum ajj0 implements v190 {
    SEQUENTIAL(1),
    EPISODIC(2),
    RECENT(3);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    ajj0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
