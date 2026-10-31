package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uf01 {
    public final jf01 a;
    public final ArrayList b;
    public final int c;
    public final i25 d;
    public final ln21 e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public uf01(jf01 jf01Var, ArrayList arrayList, int i, i25 i25Var, ln21 ln21Var, int i2, int i3, int i4) {
        this.a = jf01Var;
        this.b = arrayList;
        this.c = i;
        this.d = i25Var;
        this.e = ln21Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static uf01 a(uf01 uf01Var, int i, i25 i25Var, ln21 ln21Var, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = uf01Var.c;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i25Var = uf01Var.d;
        }
        i25 i25Var2 = i25Var;
        if ((i5 & 4) != 0) {
            ln21Var = uf01Var.e;
        }
        ln21 ln21Var2 = ln21Var;
        if ((i5 & 8) != 0) {
            i2 = uf01Var.f;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = uf01Var.g;
        }
        return new uf01(uf01Var.a, uf01Var.b, i6, i25Var2, ln21Var2, i7, i3, (i5 & 32) != 0 ? uf01Var.h : i4);
    }

    public final ry21 b(ln21 ln21Var) {
        ln21 ln21Var2;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            eg.m("Check failed.");
            return null;
        }
        this.i++;
        i25 i25Var = this.d;
        if (i25Var != null) {
            zf01 zf01VarF = ((tl00) i25Var.d).f();
            ln21Var2 = ln21Var;
            l370 l370Var = ln21Var2.a;
            l370 l370Var2 = zf01VarF.j.h;
            if (l370Var.e != l370Var2.e || !u890.j(l370Var.d, l370Var2.d)) {
                jah.h("network interceptor ", arrayList.get(i - 1), " must retain the same host and port");
                return null;
            }
            if (this.i != 1) {
                jah.h("network interceptor ", arrayList.get(i - 1), " must call proceed() exactly once");
                return null;
            }
        } else {
            ln21Var2 = ln21Var;
        }
        int i2 = i + 1;
        uf01 uf01VarA = a(this, i2, null, ln21Var2, 0, 0, 0, 58);
        p090 p090Var = (p090) arrayList.get(i);
        ry21 ry21VarA = p090Var.a(uf01VarA);
        if (ry21VarA == null) {
            throw new NullPointerException("interceptor " + p090Var + " returned null");
        }
        if (i25Var == null || i2 >= arrayList.size() || uf01VarA.i == 1) {
            return ry21VarA;
        }
        jah.h("network interceptor ", p090Var, " must call proceed() exactly once");
        return null;
    }
}
