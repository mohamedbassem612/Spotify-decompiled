package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zua extends uze1 {
    public final short c;
    public final short d;

    public zua(uze1 uze1Var, int i, int i2) {
        super(uze1Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // p.uze1
    public final void a(owa owaVar, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                owaVar.b(31, 5);
                if (s > 62) {
                    owaVar.b(s - 31, 16);
                } else if (i == 0) {
                    owaVar.b(Math.min((int) s, 31), 5);
                } else {
                    owaVar.b(s - 31, 5);
                }
            }
            owaVar.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        short s = this.c;
        sb.append((int) s);
        sb.append("::");
        sb.append((s + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
