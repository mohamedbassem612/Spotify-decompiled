package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum mij0 implements v190 {
    TOTAL(0),
    COVERARTCP(1);

    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    mij0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a ? 1 : 0;
    }
}
