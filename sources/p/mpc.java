package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mpc extends uz21 {
    public final wdu b;
    public final String c;
    public final String d;
    public final ff01 e;

    public mpc(wdu wduVar, String str, String str2) {
        this.b = wduVar;
        this.c = str;
        this.d = str2;
        this.e = sj1.g(new lpc((fka1) wduVar.c.get(1), this));
    }

    @Override // p.uz21
    public final long d() {
        String str = this.d;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = w4n1.a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // p.uz21
    public final gbc d1() {
        return this.e;
    }

    @Override // p.uz21
    public final r8i0 e() {
        String str = this.c;
        if (str != null) {
            se11 se11Var = r8i0.e;
            try {
                return bmq0.w(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
