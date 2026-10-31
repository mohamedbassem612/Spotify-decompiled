package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lx81 extends uze1 {
    public final short c;
    public final short d;

    public lx81(uze1 uze1Var, int i, int i2) {
        super(uze1Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // p.uze1
    public final void a(owa owaVar, byte[] bArr) {
        owaVar.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
