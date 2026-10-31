package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum qln0 implements v190 {
    IOS(0),
    ANDROID(1),
    DESKTOP(2);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    qln0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a;
    }
}
