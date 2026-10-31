package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gos extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ String e;
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ xb71 h;
    public final /* synthetic */ ib71 i;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gos(float f, float f2, float f3, float f4, String str, int i, String str2, xb71 xb71Var, ib71 ib71Var, String str3) {
        super(3);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = str;
        this.f = i;
        this.g = str2;
        this.h = xb71Var;
        this.i = ib71Var;
        this.t = str3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        cr31 cr31VarB;
        boolean z;
        int i;
        b0k b0kVar = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        b0k b0kVar2 = (x340) b0kVar;
        boolean zY = b0kVar2.Y(iIntValue & 1, (iIntValue & 17) != 16);
        j06 j06Var = ((x340) b0kVar2).a;
        if (zY) {
            float f = this.a;
            float f2 = this.b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(u291.a(nim0Var, f, f2), er31.b(8.0f));
            long j = u7h.b;
            qim0 qim0VarK = d9y0.k(uyn1.x(dug.f(qim0VarQ, u7h.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), 8.0f), this.c);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarK);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            float f3 = this.d;
            qim0 qim0VarV = u291.v(nim0Var, f3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarV);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, nim0Var);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM3, b0kVar2, lljVar2);
            x0d.q(iHashCode3, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, lljVar4);
            gra graVar2 = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarR = u291.r(h2cVar.a(nim0Var, graVar2), f3);
            int iC = l1d.C(this.f);
            if (iC == 0) {
                cr31VarB = er31.b(4.0f);
            } else {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                cr31VarB = er31.a;
            }
            qim0 qim0VarQ2 = i1p1.q(qim0VarR, cr31VarB);
            String str = this.g;
            if (str == null) {
                str = "";
            }
            Uri uri = Uri.parse(str);
            fwx fwxVarG = hso1.G(wsx.c, 0L, u7h.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), b0kVar2, wsx.d | 3072, 22);
            eso1.e(uri, isl.a, qim0VarQ2, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, b0kVar2, 1073741872, 0, 3576);
            b0k b0kVar3 = b0kVar2;
            xb71 xb71Var = this.h;
            if (xb71Var == null) {
                b0kVar3.i0(821740453);
                z = false;
                b0kVar3.r(false);
            } else {
                z = false;
                b0kVar3.i0(821740454);
                pwo1.g(0, xb71Var.a, xb71Var.b, b0kVar3, h2cVar.a(nim0Var, een.Y));
                b0kVar3.r(false);
            }
            b0kVar3.r(true);
            op71.g(b0kVar3, u291.r(nim0Var, 8.0f));
            String str2 = this.e;
            if (str2 == null) {
                b0kVar3.i0(-1480509356);
                b0kVar3.r(z);
            } else {
                b0kVar3.i0(-1480509355);
                uwr uwrVar = cbx.a;
                uwo1.e(str2, null, cbx.d(b0kVar3).k, cbx.a(b0kVar3).b.a, null, null, 2, false, new cjc0(2), 0, null, b0kVar3, 1572864, 0, 1714);
                b0kVar3 = b0kVar3;
                b0kVar3.r(false);
            }
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 48);
            int iHashCode4 = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM4 = b0kVar3.m();
            qim0 qim0VarE4 = zr7.E(b0kVar3, nim0Var);
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM4, b0kVar3, lljVar2);
            x0d.q(iHashCode4, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE4, b0kVar3, lljVar4);
            ib71 ib71Var = this.i;
            if (ib71Var != null) {
                int iOrdinal = ib71Var.ordinal();
                if (iOrdinal == 0) {
                    i = 2;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
            } else {
                i = 0;
            }
            if (i == 0) {
                b0kVar3.i0(1170743105);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1170743106);
                kqn1.d(i, 48, 0, b0kVar3, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                b0kVar3.r(false);
            }
            String str3 = this.t;
            if (str3 == null) {
                str3 = "open.spotify.com";
            }
            String str4 = str3;
            uwr uwrVar2 = cbx.a;
            b0k b0kVar4 = b0kVar3;
            uwo1.e(str4, null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, null, null, 2, false, new cjc0(2), 0, null, b0kVar4, 1572864, 0, 1714);
            us71.m(b0kVar4, true, true, true);
        } else {
            b0kVar2.b0();
        }
        return rih1.a;
    }
}
