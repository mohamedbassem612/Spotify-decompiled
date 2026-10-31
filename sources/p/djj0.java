package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum djj0 implements v190 {
    MIXED(0),
    AUDIO(1),
    VIDEO(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    djj0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
