package p;

import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fbk extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Configuration b;
    public final /* synthetic */ float c;
    public final /* synthetic */ obk d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ jqm0 f;
    public final /* synthetic */ d0r g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbk(boolean z, Configuration configuration, float f, obk obkVar, iu30 iu30Var, jqm0 jqm0Var, d0r d0rVar) {
        super(3);
        this.a = z;
        this.b = configuration;
        this.c = f;
        this.d = obkVar;
        this.e = iu30Var;
        this.f = jqm0Var;
        this.g = d0rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r39v1 */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fD;
        float f;
        Function0 function0;
        iu30 iu30Var;
        b0k b0kVar;
        boolean z;
        obk obkVar;
        String str;
        boolean z2;
        ?? r14;
        b0k b0kVar2;
        obk obkVar2;
        int i;
        uwr uwrVar = cbx.a;
        i2c i2cVar = (i2c) obj;
        b0k b0kVar3 = (b0k) obj2;
        ((Number) obj3).intValue();
        x340 x340Var = (x340) b0kVar3;
        long jT = ((wat) x340Var.k(t4k.h)).t(o0c.R(((crl1) x340Var.k(t4k.u)).a()));
        boolean zEquals = d9y0.n(s3v.b(jT), s3v.a(jT)).a.equals(ltl1.b);
        if (this.a) {
            fD = i2cVar.d();
            cbx.a.getClass();
            f = ((ecx) uwr.h.getValue()).a;
        } else if (zEquals) {
            fD = i2cVar.d();
            cbx.a.getClass();
            f = ((ecx) uwr.c.getValue()).a;
        } else {
            fD = i2cVar.d();
            cbx.a.getClass();
            f = uwr.d().a;
        }
        float f2 = fD / f;
        if (!zEquals) {
            f2 = yoi1.m(new p3v(f2), new p3v(this.b.screenHeightDp * 0.5f)).a;
        }
        float f3 = f2 + 50.0f;
        float f4 = this.c;
        if (f4 < 1.0f) {
            f4 = 1.0f;
        }
        float f5 = f3 * f4;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarR = i1p1.r(anm1.N("campaign_header_image", u291.h(u291.f(nim0Var, 1.0f), f5)));
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(b0kVar3, qim0VarR);
        hzj.A.getClass();
        x340 x340Var2 = (x340) b0kVar3;
        if (x340Var2.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var2.m0();
        boolean z3 = x340Var2.S;
        Function0 function1 = hmb0.t1;
        if (z3) {
            x340Var2.l(function1);
        } else {
            x340Var2.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(gfh0VarC, b0kVar3, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, b0kVar3, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, b0kVar3, lljVar3);
        nko1.F(b0kVar3);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, b0kVar3, lljVar4);
        obk obkVar3 = this.d;
        String str2 = obkVar3.d;
        boolean z4 = obkVar3.i;
        List list = obkVar3.f;
        Uri uri = Uri.parse(str2);
        as80 as80Var = mif1.P0;
        bnx bnxVar = bnx.c;
        eso1.e(uri, isl.a, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new nux(bnxVar, bnxVar), false, false, b0kVar3, 1073741872, 0, 3512);
        qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 0.75f);
        gra graVar = een.t;
        h2c h2cVar = h2c.a;
        h4o1.e(0.0f, 0, b0kVar3, h2cVar.a(qim0VarC, graVar));
        qim0 qim0VarA = h2cVar.a(u291.f(nim0Var, 1.0f), graVar);
        gfh0 gfh0VarC2 = t1c.c(een.X, false);
        int iHashCode2 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM2 = x340Var2.m();
        qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarA);
        x340Var2.m0();
        if (x340Var2.S) {
            function0 = function1;
            x340Var2.l(function0);
        } else {
            function0 = function1;
            x340Var2.v0();
        }
        nko1.H(gfh0VarC2, b0kVar3, lljVar);
        nko1.H(xos0VarM2, b0kVar3, lljVar2);
        i3a.l(iHashCode2, b0kVar3, lljVar3, b0kVar3);
        nko1.H(qim0VarE2, b0kVar3, lljVar4);
        qim0 qim0VarF = u291.f(u291.x(0.0f, dsa0.m(b0kVar3, 2131166901), 1, nim0Var), 1.0f);
        cvx cvxVar = cbx.b(b0kVar3).b;
        qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 16.0f, 7);
        cvx cvxVar2 = cbx.b(b0kVar3).b;
        d36 d36Var = new d36(4.0f, true, new um5(false));
        era eraVar = een.P0;
        mbh mbhVarA = jbh.a(d36Var, eraVar, b0kVar3, 0);
        int iHashCode3 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM3 = x340Var2.m();
        qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarB);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(function0);
        } else {
            x340Var2.v0();
        }
        nko1.H(mbhVarA, b0kVar3, lljVar);
        nko1.H(xos0VarM3, b0kVar3, lljVar2);
        i3a.l(iHashCode3, b0kVar3, lljVar3, b0kVar3);
        nko1.H(qim0VarE3, b0kVar3, lljVar4);
        String str3 = obkVar3.b;
        cjc0 cjc0Var = new cjc0(2);
        lee1 lee1Var = cbx.d(b0kVar3).c;
        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
        cvx cvxVar3 = cbx.b(b0kVar3).b;
        Function0 function2 = function0;
        uwo1.e(str3, uyn1.z(16.0f, 0.0f, 2, qim0VarF2), lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, b0kVar3, 0, 0, 1720);
        List list2 = list;
        boolean zIsEmpty = list2.isEmpty();
        iu30 iu30Var2 = this.e;
        if (!zIsEmpty || z4) {
            x340Var2.i0(1095287547);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarF3, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            jw31 jw31VarA = ew31.a(h36.b, een.N0, b0kVar3, 0);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(b0kVar3, qim0VarB2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, b0kVar3, lljVar);
            nko1.H(xos0VarM4, b0kVar3, lljVar2);
            i3a.l(iHashCode4, b0kVar3, lljVar3, b0kVar3);
            nko1.H(qim0VarE4, b0kVar3, lljVar4);
            if (list2.isEmpty()) {
                iu30Var = iu30Var2;
                b0kVar = b0kVar3;
                z = true;
                x340Var2.i0(2001854521);
                x340Var2.r(false);
            } else {
                x340Var2.i0(2001374021);
                iu30Var = iu30Var2;
                b0kVar = b0kVar3;
                z = true;
                i1o1.e(this.f, new gqm0(list, 3), this.g, new wnb0(1.0f, true), (ipb1) null, hei.a, (xu30) null, 0, (xu30) null, b0kVar, 196616, 232);
                x340Var2.r(false);
            }
            if (z4) {
                x340Var2.i0(2001937198);
                obkVar = obkVar3;
                str = null;
                y3o1.k(new sqk0(new qxk0(new bqk0(obkVar.a, (byte) 29))), (qim0) null, apo.r(2070905747, new v0j(iu30Var, (byte) 15), b0kVar), b0kVar, 384);
                z2 = false;
                x340Var2.r(false);
            } else {
                obkVar = obkVar3;
                str = null;
                z2 = false;
                x340Var2.i0(2003085593);
                x340Var2.r(false);
            }
            x340Var2.r(z);
            x340Var2.r(z2);
            r14 = z;
        } else {
            x340Var2.i0(1097264696);
            x340Var2.r(false);
            iu30Var = iu30Var2;
            b0kVar = b0kVar3;
            obkVar = obkVar3;
            str = null;
            r14 = 1;
        }
        String str4 = obkVar.c;
        if (str4 == null || ihc1.y0(str4)) {
            str4 = str;
        }
        if (str4 == null) {
            x340Var2.i0(1097359710);
            x340Var2.r(false);
            obkVar2 = obkVar;
            b0kVar2 = b0kVar;
            i = 2;
        } else {
            x340Var2.i0(1097359711);
            b0k b0kVar4 = b0kVar;
            cjc0 cjc0Var2 = new cjc0((int) r14);
            lee1 lee1Var2 = cbx.d(b0kVar4).j;
            long j = cbx.a(b0kVar4).b.b;
            qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
            cvx cvxVar5 = cbx.b(b0kVar4).b;
            b0kVar2 = b0kVar4;
            obkVar2 = obkVar;
            i = 2;
            uwo1.e(str4, uyn1.z(16.0f, 0.0f, 2, qim0VarF4), lee1Var2, j, (a0e1) null, (iu30) null, 2, false, cjc0Var2, 0, (qx8) null, b0kVar2, 0, 0, 1712);
            x340Var2.r(false);
        }
        cvx cvxVar6 = cbx.b(b0kVar2).b;
        cvx cvxVar7 = cbx.b(b0kVar2).b;
        cvx cvxVar8 = cbx.b(b0kVar2).b;
        lyg.a(obkVar2, iu30Var, u291.D(uyn1.B(nim0Var, 16.0f, 4.0f, 16.0f, 0.0f, 8), eraVar, i), b0kVar2, 0);
        us71.m(x340Var2, true, true, true);
        return rih1.a;
    }
}
