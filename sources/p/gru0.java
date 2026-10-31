package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum gru0 implements v190 {
    READY(0),
    PENDING(1);

    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    gru0(int i) {
        this.a = i;
    }

    public final int getNumber() {
        return this.a ? 1 : 0;
    }
}
