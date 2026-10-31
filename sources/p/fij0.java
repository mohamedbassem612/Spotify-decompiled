package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum fij0 implements v190 {
    ALBUM(1),
    SINGLE(2),
    COMPILATION(3),
    EP(4),
    AUDIOBOOK(5),
    PODCAST(6);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    fij0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
