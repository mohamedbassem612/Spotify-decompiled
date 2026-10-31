package p;

import android.text.Html;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ap7 extends hab0 implements xu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ xu30 b;
    public final /* synthetic */ k8e0 c;
    public final /* synthetic */ fp7 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ xu30 f;
    public final /* synthetic */ xu30 g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap7(fp7 fp7Var, v6v0 v6v0Var, k8e0 k8e0Var, int i, xu30 xu30Var, z070 z070Var, va81 va81Var, String str, xu30 xu30Var2, xu30 xu30Var3) {
        super(3);
        this.d = fp7Var;
        this.h = v6v0Var;
        this.c = k8e0Var;
        this.e = i;
        this.b = xu30Var;
        this.i = z070Var;
        this.t = va81Var;
        this.X = str;
        this.f = xu30Var2;
        this.g = xu30Var3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        fp7 fp7Var;
        String str;
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.i;
        Object obj7 = this.h;
        k8e0 k8e0Var = this.c;
        h2c h2cVar = h2c.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        xu30 xu30Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                boolean zY = b0kVar2.Y(iIntValue & 1, (iIntValue & 17) != 16);
                j06 j06Var = ((x340) b0kVar2).a;
                if (!zY) {
                    b0kVar2.b0();
                    return rih1Var;
                }
                v6v0 v6v0Var = (v6v0) obj7;
                z070 z070Var = (z070) obj6;
                va81 va81Var = (va81) obj5;
                String str2 = (String) obj4;
                mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
                int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM = b0kVar2.m();
                qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    b0kVar2.l(n4kVar);
                } else {
                    b0kVar2.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, b0kVar2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar3);
                nko1.F(b0kVar2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, lljVar4);
                fp7 fp7Var2 = this.d;
                fp7Var2.getClass();
                Float fValueOf = v6v0Var != null ? Float.valueOf((float) v6v0Var.c.a) : null;
                Float f = (fValueOf == null || u890.h(fValueOf, 0.0f)) ? null : fValueOf;
                int i = k8e0Var.j;
                qim0 qim0VarH = pqo.h(nim0Var, !(this.e == 1));
                if (xu30Var != null) {
                    str = "";
                    fp7Var = fp7Var2;
                } else {
                    if (z070Var != null) {
                        fp7Var = fp7Var2;
                        String string = Html.fromHtml(z070Var.a, 0).toString();
                        if (string != null) {
                            str = string;
                        }
                    } else {
                        fp7Var = fp7Var2;
                    }
                    String str3 = va81Var != null ? va81Var.d : null;
                    str = str3 == null ? "" : str3;
                }
                fp7Var.a(str2, f, str, i, this.f, qim0VarH, b0kVar2, 0);
                xu30 xu30Var2 = this.g;
                if (xu30Var2 == null) {
                    b0kVar2.i0(-1502769966);
                    b0kVar2.r(false);
                    z = true;
                } else {
                    b0kVar2.i0(-1502769965);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM2 = b0kVar2.m();
                    qim0 qim0VarE2 = zr7.E(b0kVar2, nim0Var);
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar2, lljVar);
                    nko1.H(xos0VarM2, b0kVar2, lljVar2);
                    x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                    nko1.H(qim0VarE2, b0kVar2, lljVar4);
                    z = true;
                    hrt.k(6, xu30Var2, h2cVar, b0kVar2, true);
                    b0kVar2.r(false);
                }
                b0kVar2.r(z);
                return rih1Var;
            default:
                b0k b0kVar3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (!b0kVar4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b0kVar4.b0();
                } else if (xu30Var != null) {
                    b0kVar4.i0(1966159086);
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM3 = b0kVar4.m();
                    qim0 qim0VarE3 = zr7.E(b0kVar4, nim0Var);
                    hzj.A.getClass();
                    if (((x340) b0kVar4).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0VarC2, b0kVar4, y580.O0);
                    nko1.H(xos0VarM3, b0kVar4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), b0kVar4, y580.R0);
                    nko1.F(b0kVar4);
                    nko1.H(qim0VarE3, b0kVar4, y580.Y);
                    hrt.k(6, xu30Var, h2cVar, b0kVar4, true);
                    b0kVar4.r(false);
                } else {
                    b0kVar4.i0(1966242197);
                    boolean z2 = k8e0Var.h;
                    fp7 fp7Var3 = this.d;
                    fp7Var3.b(this.e, z2, this.f, this.g, (xu30) obj7, (xu30) obj6, (xu30) obj5, (xu30) obj4, fp7Var3.b, b0kVar4, 0);
                    b0kVar4.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap7(xu30 xu30Var, k8e0 k8e0Var, fp7 fp7Var, int i, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7) {
        super(3);
        this.b = xu30Var;
        this.c = k8e0Var;
        this.d = fp7Var;
        this.e = i;
        this.f = xu30Var2;
        this.g = xu30Var3;
        this.h = xu30Var4;
        this.i = xu30Var5;
        this.t = xu30Var6;
        this.X = xu30Var7;
    }
}
