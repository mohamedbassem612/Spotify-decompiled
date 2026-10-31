package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yf01 extends uz21 {
    public final String b;
    public final long c;
    public final ff01 d;

    public yf01(String str, long j, ff01 ff01Var) {
        this.b = str;
        this.c = j;
        this.d = ff01Var;
    }

    @Override // p.uz21
    public final long d() {
        return this.c;
    }

    @Override // p.uz21
    public final gbc d1() {
        return this.d;
    }

    @Override // p.uz21
    public final r8i0 e() {
        String str = this.b;
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
