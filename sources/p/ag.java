package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ag extends yf {
    public static ag e;
    public y9e1 c;
    public v161 d;

    @Override // p.yf
    public final int[] f(int i) {
        int iE;
        if (m().length() > 0 && i < m().length()) {
            try {
                v161 v161Var = this.d;
                if (v161Var == null) {
                    u890.C("node");
                    throw null;
                }
                n511 n511VarG = v161Var.g();
                int iRound = Math.round(n511VarG.d - n511VarG.b);
                if (i <= 0) {
                    i = 0;
                }
                y9e1 y9e1Var = this.c;
                if (y9e1Var == null) {
                    u890.C("layoutResult");
                    throw null;
                }
                int iD = y9e1Var.b.d(i);
                y9e1 y9e1Var2 = this.c;
                if (y9e1Var2 == null) {
                    u890.C("layoutResult");
                    throw null;
                }
                float f = y9e1Var2.b.f(iD) + iRound;
                y9e1 y9e1Var3 = this.c;
                if (y9e1Var3 == null) {
                    u890.C("layoutResult");
                    throw null;
                }
                zrm0 zrm0Var = y9e1Var3.b;
                float f2 = zrm0Var.f(zrm0Var.f - 1);
                y9e1 y9e1Var4 = this.c;
                if (f < f2) {
                    if (y9e1Var4 == null) {
                        u890.C("layoutResult");
                        throw null;
                    }
                    iE = y9e1Var4.b.e(f);
                } else {
                    if (y9e1Var4 == null) {
                        u890.C("layoutResult");
                        throw null;
                    }
                    iE = y9e1Var4.b.f;
                }
                return l(i, v(iE - 1, 1) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // p.yf
    public final int[] r(int i) {
        int iE;
        if (m().length() > 0 && i > 0) {
            try {
                v161 v161Var = this.d;
                if (v161Var == null) {
                    u890.C("node");
                    throw null;
                }
                n511 n511VarG = v161Var.g();
                int iRound = Math.round(n511VarG.d - n511VarG.b);
                int length = m().length();
                if (length <= i) {
                    i = length;
                }
                y9e1 y9e1Var = this.c;
                if (y9e1Var == null) {
                    u890.C("layoutResult");
                    throw null;
                }
                int iD = y9e1Var.b.d(i);
                y9e1 y9e1Var2 = this.c;
                if (y9e1Var2 == null) {
                    u890.C("layoutResult");
                    throw null;
                }
                float f = y9e1Var2.b.f(iD) - iRound;
                if (f > 0.0f) {
                    y9e1 y9e1Var3 = this.c;
                    if (y9e1Var3 == null) {
                        u890.C("layoutResult");
                        throw null;
                    }
                    iE = y9e1Var3.b.e(f);
                } else {
                    iE = 0;
                }
                if (i == m().length() && iE < iD) {
                    iE++;
                }
                return l(v(iE, 2), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int v(int i, int i2) {
        y9e1 y9e1Var = this.c;
        if (y9e1Var == null) {
            u890.C("layoutResult");
            throw null;
        }
        int i3 = y9e1Var.i(i);
        y9e1 y9e1Var2 = this.c;
        if (y9e1Var2 == null) {
            u890.C("layoutResult");
            throw null;
        }
        int iJ = y9e1Var2.j(i3);
        y9e1 y9e1Var3 = this.c;
        if (i2 != iJ) {
            if (y9e1Var3 != null) {
                return y9e1Var3.i(i);
            }
            u890.C("layoutResult");
            throw null;
        }
        if (y9e1Var3 != null) {
            return y9e1Var3.b.c(i, false) - 1;
        }
        u890.C("layoutResult");
        throw null;
    }
}
