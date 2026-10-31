package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class c46 {
    public final o36 d;
    public p6a1 a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public c46(cab cabVar) {
        this.d = new o36(this, cabVar);
    }

    public final void a(yic0 yic0Var, int i) {
        p6a1 p6a1VarJ = yic0Var.j(i);
        o36 o36Var = this.d;
        o36Var.g(p6a1VarJ, 1.0f);
        o36Var.g(yic0Var.j(i), -1.0f);
    }

    public final void b(p6a1 p6a1Var, p6a1 p6a1Var2, p6a1 p6a1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        o36 o36Var = this.d;
        if (z) {
            o36Var.g(p6a1Var, 1.0f);
            o36Var.g(p6a1Var2, -1.0f);
            o36Var.g(p6a1Var3, -1.0f);
        } else {
            o36Var.g(p6a1Var, -1.0f);
            o36Var.g(p6a1Var2, 1.0f);
            o36Var.g(p6a1Var3, 1.0f);
        }
    }

    public final void c(p6a1 p6a1Var, p6a1 p6a1Var2, p6a1 p6a1Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        o36 o36Var = this.d;
        if (z) {
            o36Var.g(p6a1Var, 1.0f);
            o36Var.g(p6a1Var2, -1.0f);
            o36Var.g(p6a1Var3, 1.0f);
        } else {
            o36Var.g(p6a1Var, -1.0f);
            o36Var.g(p6a1Var2, 1.0f);
            o36Var.g(p6a1Var3, -1.0f);
        }
    }

    public p6a1 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final p6a1 f(boolean[] zArr, p6a1 p6a1Var) {
        int i;
        o36 o36Var = this.d;
        int iD = o36Var.d();
        p6a1 p6a1Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = o36Var.f(i2);
            if (f2 < 0.0f) {
                p6a1 p6a1VarE = o36Var.e(i2);
                if ((zArr == null || !zArr[p6a1VarE.b]) && p6a1VarE != p6a1Var && (((i = p6a1VarE.Y) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    p6a1Var2 = p6a1VarE;
                }
            }
        }
        return p6a1Var2;
    }

    public final void g(p6a1 p6a1Var) {
        p6a1 p6a1Var2 = this.a;
        o36 o36Var = this.d;
        if (p6a1Var2 != null) {
            o36Var.g(p6a1Var2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float fH = o36Var.h(p6a1Var, true) * (-1.0f);
        this.a = p6a1Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = o36Var.h;
        for (int i2 = 0; i != -1 && i2 < o36Var.a; i2++) {
            float[] fArr = o36Var.g;
            fArr[i] = fArr[i] / fH;
            i = o36Var.f[i];
        }
    }

    public final void h(yic0 yic0Var, p6a1 p6a1Var, boolean z) {
        if (p6a1Var.f) {
            o36 o36Var = this.d;
            float fC = o36Var.c(p6a1Var);
            this.b = (p6a1Var.e * fC) + this.b;
            o36Var.h(p6a1Var, z);
            if (z) {
                p6a1Var.b(this);
            }
            if (o36Var.d() == 0) {
                this.e = true;
                yic0Var.a = true;
            }
        }
    }

    public void i(yic0 yic0Var, c46 c46Var, boolean z) {
        o36 o36Var = this.d;
        o36Var.getClass();
        float fC = o36Var.c(c46Var.a);
        o36Var.h(c46Var.a, z);
        o36 o36Var2 = c46Var.d;
        int iD = o36Var2.d();
        for (int i = 0; i < iD; i++) {
            p6a1 p6a1VarE = o36Var2.e(i);
            o36Var.a(p6a1VarE, o36Var2.c(p6a1VarE) * fC, z);
        }
        this.b = (c46Var.b * fC) + this.b;
        if (z) {
            c46Var.a.b(this);
        }
        if (this.a == null || o36Var.d() != 0) {
            return;
        }
        this.e = true;
        yic0Var.a = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.a == null ? "0" : "" + this.a).concat(" = ");
        if (this.b != 0.0f) {
            strConcat = strConcat + this.b;
            z = true;
        } else {
            z = false;
        }
        o36 o36Var = this.d;
        int iD = o36Var.d();
        for (int i = 0; i < iD; i++) {
            p6a1 p6a1VarE = o36Var.e(i);
            if (p6a1VarE != null) {
                float f = o36Var.f(i);
                if (f != 0.0f) {
                    String string = p6a1VarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat.concat(string) : strConcat + f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
