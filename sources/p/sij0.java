package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum sij0 implements v190 {
    FULL(0),
    TRAILER(1),
    BONUS(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    sij0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
