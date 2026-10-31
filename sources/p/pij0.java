package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum pij0 implements v190 {
    P(0),
    C(1);

    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    pij0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a ? 1 : 0;
    }
}
