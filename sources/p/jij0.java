package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum jij0 implements v190 {
    UNKNOWN(0),
    DEFAULT(1),
    PARROT(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    jij0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
