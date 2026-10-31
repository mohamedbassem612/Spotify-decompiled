package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ezg1 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ j2i g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Function0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ezg1(float f, j2i j2iVar, j2i j2iVar2, iu30 iu30Var, iu30 iu30Var2, boolean z, j2i j2iVar3, Function0 function0, Function0 function1) {
        super(2);
        this.a = f;
        this.b = j2iVar;
        this.c = j2iVar2;
        this.d = iu30Var;
        this.e = iu30Var2;
        this.f = z;
        this.g = j2iVar3;
        this.h = function0;
        this.i = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        zc30 zc30Var;
        q5t0 q5t0VarH;
        tlc1 tlc1Var = (tlc1) obj;
        long j = ((hjl) obj2).a;
        int iI0 = tlc1Var.i0(16.0f);
        int iI1 = tlc1Var.i0(this.a);
        int iI2 = tlc1Var.i0(16.0f);
        int iI3 = tlc1Var.i0(300.0f);
        int iH = hjl.h(j) - iI2;
        int i = iH < 0 ? 0 : iH;
        q5t0 q5t0VarH2 = ((afh0) o7h.q0(tlc1Var.P("title", this.b))).H(hjl.b(j, 0, 0, 0, i, 3));
        afh0 afh0Var = (afh0) o7h.q0(tlc1Var.P("body", this.c));
        int i2 = i - q5t0VarH2.b;
        if (i2 < 0) {
            i2 = 0;
        }
        q5t0 q5t0VarH3 = afh0Var.H(hjl.b(j, 0, 0, 0, i2, 3));
        int i3 = hjl.i(j);
        int iH2 = hjl.h(j);
        int i4 = q5t0VarH2.b;
        zc30 zc30Var2 = zc30.c;
        zc30 zc30Var3 = zc30.a;
        if (iI3 > i3 || i4 + iI3 + iI1 > iH2) {
            zc30Var = zc30Var3;
        } else {
            zc30Var = (iI3 > hjl.i(j) || (((q5t0VarH2.b + q5t0VarH3.b) + iI3) + iI0) + iI2 > hjl.h(j)) ? zc30.b : zc30Var2;
        }
        this.d.invoke(zc30Var);
        int i5 = q5t0VarH2.b;
        int iMax = Math.max((zc30Var == zc30Var3 ? 0 : iI1 + iI3) + i5, i5 + (zc30Var == zc30Var2 ? iI0 + iI3 : 0) + iI2 + q5t0VarH3.b);
        int iH3 = (hjl.h(j) - iMax) / 2;
        if (iH3 < 0) {
            iH3 = 0;
        }
        this.e.invoke(Integer.valueOf(iH3 + iMax));
        if (this.f || zc30Var == zc30Var3) {
            q5t0VarH = null;
        } else {
            afh0 afh0Var2 = (afh0) o7h.q0(tlc1Var.P("foregroundAnimation", this.g));
            if (!((iI3 >= 0) & (iI3 >= 0))) {
                sf80.a("width and height must be >= 0");
            }
            q5t0VarH = afh0Var2.H(jjl.h(iI3, iI3, iI3, iI3));
        }
        return tlc1Var.S(hjl.i(j), hjl.h(j), b7x.a, new dzg1(this.h, zc30Var, this.i, iI1, iI0, q5t0VarH, q5t0VarH2, iI2, q5t0VarH3, j));
    }
}
