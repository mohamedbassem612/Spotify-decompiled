package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ksb0 implements tob1 {
    public final byte a;
    public final short b;
    public final hrr0 c;
    public int d;

    static {
        new sjb((byte) 14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ksb0(int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
        this.c = xto.s(sjb.k(i, i2, i3), kcx0.R0);
        this.d = i;
    }

    public final void c(int i) {
        if (i != this.d) {
            this.d = i;
            this.c.setValue(sjb.k(i, this.a, this.b));
        }
    }

    @Override // p.tob1
    public final Object getValue() {
        return (tr80) this.c.getValue();
    }
}
