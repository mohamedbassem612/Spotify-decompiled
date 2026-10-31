package p;

import androidx.compose.ui.unit.TextUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cpr0 implements we5 {
    public final int a;
    public final int b;
    public final long c;
    public final u8e1 d;
    public final edt0 e;
    public final shc0 f;
    public final int g;
    public final int h;
    public final gbe1 i;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ cpr0(int i, int i2, long j, u8e1 u8e1Var, edt0 edt0Var, int i3, int i4, int i5) {
        long jK;
        int i6;
        int i7 = (i5 & 1) != 0 ? 0 : i;
        int i8 = (i5 & 2) != 0 ? 0 : i2;
        if ((i5 & 4) != 0) {
            wee1[] wee1VarArr = TextUnit.b;
            jK = f7p1.k();
        } else {
            jK = j;
        }
        u8e1 u8e1Var2 = (i5 & 8) != 0 ? null : u8e1Var;
        edt0 edt0Var2 = (i5 & 16) != 0 ? null : edt0Var;
        if ((i5 & 64) != 0) {
            int i9 = mhc0.b;
            cuo1.C();
            i6 = 0;
        } else {
            i6 = i3;
        }
        this(i7, i8, jK, u8e1Var2, edt0Var2, null, i6, (i5 & 128) != 0 ? 0 : i4, null);
    }

    public final cpr0 a(cpr0 cpr0Var) {
        return cpr0Var == null ? this : dpr0.a(this, cpr0Var.a, cpr0Var.b, cpr0Var.c, cpr0Var.d, cpr0Var.e, cpr0Var.f, cpr0Var.g, cpr0Var.h, cpr0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpr0)) {
            return false;
        }
        cpr0 cpr0Var = (cpr0) obj;
        if (this.a != cpr0Var.a || !z3e1.b(this.b, cpr0Var.b) || !TextUnit.a(this.c, cpr0Var.c) || !u890.j(this.d, cpr0Var.d) || !u890.j(this.e, cpr0Var.e) || !u890.j(this.f, cpr0Var.f)) {
            return false;
        }
        int i = cpr0Var.g;
        int i2 = mhc0.b;
        return this.g == i && yf70.b(this.h, cpr0Var.h) && u890.j(this.i, cpr0Var.i);
    }

    public final int hashCode() {
        int iC = (z3e1.c(this.b) + (Integer.hashCode(this.a) * 31)) * 31;
        wee1[] wee1VarArr = TextUnit.b;
        int iF = cy30.f(iC, this.c, 31);
        u8e1 u8e1Var = this.d;
        int iHashCode = (iF + (u8e1Var != null ? u8e1Var.hashCode() : 0)) * 31;
        edt0 edt0Var = this.e;
        int iHashCode2 = (iHashCode + (edt0Var != null ? edt0Var.hashCode() : 0)) * 31;
        shc0 shc0Var = this.f;
        int iHashCode3 = (iHashCode2 + (shc0Var != null ? shc0Var.hashCode() : 0)) * 31;
        int i = mhc0.b;
        int iC2 = (yf70.c(this.h) + kaa0.f(this.g, iHashCode3, 31)) * 31;
        gbe1 gbe1Var = this.i;
        return iC2 + (gbe1Var != null ? gbe1Var.hashCode() : 0);
    }

    public final String toString() {
        String strB = a0e1.b(this.a);
        String strD = z3e1.d(this.b);
        String strF = TextUnit.f(this.c);
        String strA = mhc0.a(this.g);
        String strD2 = yf70.d(this.h);
        StringBuilder sbN = gvg.n("ParagraphStyle(textAlign=", strB, ", textDirection=", strD, ", lineHeight=");
        sbN.append(strF);
        sbN.append(", textIndent=");
        sbN.append(this.d);
        sbN.append(", platformStyle=");
        sbN.append(this.e);
        sbN.append(", lineHeightStyle=");
        sbN.append(this.f);
        sbN.append(", lineBreak=");
        bb00.j(sbN, strA, ", hyphens=", strD2, ", textMotion=");
        sbN.append(this.i);
        sbN.append(")");
        return sbN.toString();
    }

    public cpr0(int i, int i2, long j, u8e1 u8e1Var, edt0 edt0Var, shc0 shc0Var, int i3, int i4, gbe1 gbe1Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = u8e1Var;
        this.e = edt0Var;
        this.f = shc0Var;
        this.g = i3;
        this.h = i4;
        this.i = gbe1Var;
        wee1[] wee1VarArr = TextUnit.b;
        if (TextUnit.a(j, f7p1.k()) || TextUnit.c(j) >= 0.0f) {
            return;
        }
        rf80.c("lineHeight can't be negative (" + TextUnit.c(j) + ")");
    }
}
