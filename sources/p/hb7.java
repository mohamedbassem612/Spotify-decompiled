package p;

import android.graphics.Color;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.base.java.logging.Logger;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hb7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb7(Uri uri, hux huxVar, boolean z, boolean z2, sfu0 sfu0Var, boolean z3) {
        super(3);
        this.e = uri;
        this.f = huxVar;
        this.b = z;
        this.c = z2;
        this.g = sfu0Var;
        this.d = z3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        long jE;
        boolean z;
        int i2;
        int i3;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        qim0 qim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = (Uri) obj6;
                hux huxVar = (hux) obj5;
                sfu0 sfu0Var = (sfu0) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                uri.getClass();
                boolean z2 = this.b;
                qim0 qim0VarE2 = aqo1.e(z2, this.d);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                eso1.e(uri, isl.a, qim0VarE2, new p3v(48.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(huxVar, huxVar), false, false, x340Var, 1073741872, 0, 3568);
                if (z2 && this.c) {
                    x340Var3.i0(1465127943);
                    aqo1.k(sfu0Var, x340Var, 6);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(1465206745);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarZ = uyn1.z(cbx.b(x340Var4).e.b, 0.0f, 2, qim0VarF);
                cvx cvxVar = cbx.b(x340Var4).b;
                String str = (String) obj6;
                Function0 function0 = (Function0) obj5;
                Function0 function1 = (Function0) obj4;
                mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var4, 0);
                x340 x340Var5 = x340Var4;
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(mbhVarA, x340Var4, y580.O0);
                nko1.H(xos0VarM2, x340Var4, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var4, y580.R0);
                nko1.F(x340Var4);
                nko1.H(qim0VarE3, x340Var4, y580.Y);
                boolean z3 = this.b;
                boolean z4 = this.c;
                boolean z5 = this.d;
                cw51.a(str, z3, z4, function0, function1, (qim0) null, z5, x340Var4, 0);
                if (z5) {
                    x340Var6.i0(1254669412);
                    b9p1.j(x340Var4, 0);
                    x340Var6.r(false);
                } else if (z3) {
                    x340Var6.i0(1254672066);
                    uwo1.e(cwl1.o0(x340Var4, 2131952874), null, cbx.d(x340Var4).j, cbx.a(x340Var4).b.b, null, null, 0, false, null, 0, null, x340Var4, 0, 0, 2034);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1254680355);
                    b9p1.c(x340Var4, 0);
                    x340Var6.r(false);
                }
                x340Var6.r(true);
                return rih1Var;
            case 2:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                x340 x340Var7 = (b0k) obj2;
                ((Number) obj3).intValue();
                o6j1 o6j1Var = (o6j1) obj6;
                m4c m4cVar = fkj0.X;
                boolean z6 = p3v.b(((i2c) obj).d(), 600.0f) > 0;
                qim0 qim0VarI = zr7.i(u291.f(qim0Var, 1.0f), new g2j1(o6j1Var, (byte) 5));
                Function0 function2 = (Function0) obj5;
                j2i j2iVar = (j2i) obj4;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var8 = x340Var7;
                int iHashCode3 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM3 = x340Var8.m();
                qim0 qim0VarE4 = zr7.E(x340Var7, qim0VarI);
                hzj.A.getClass();
                x340 x340Var9 = x340Var7;
                boolean z7 = z6;
                if (x340Var9.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(gfh0VarC2, x340Var7, lljVar4);
                nko1.H(xos0VarM3, x340Var7, lljVar3);
                i3a.l(iHashCode3, x340Var7, lljVar2, x340Var7);
                nko1.H(qim0VarE4, x340Var7, lljVar);
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var7, 0);
                int iHashCode4 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM4 = x340Var9.m();
                qim0 qim0VarE5 = zr7.E(x340Var7, qim0Var);
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(mbhVarA2, x340Var7, lljVar4);
                nko1.H(xos0VarM4, x340Var7, lljVar3);
                i3a.l(iHashCode4, x340Var7, lljVar2, x340Var7);
                nko1.H(qim0VarE5, x340Var7, lljVar);
                Object objT = x340Var9.T();
                if (objT == m4cVar) {
                    if (o6j1Var.g.length() == 0) {
                        i3 = ihc1.y0(o6j1Var.h) ? -1 : 1;
                    } else {
                        i3 = 2;
                    }
                    objT = bb00.h(i3, x340Var9);
                }
                hdn0 hdn0Var = (hdn0) objT;
                try {
                    jE = z4p1.e(Color.parseColor(o6j1Var.i));
                    i = 0;
                } catch (Throwable th) {
                    i = 0;
                    Logger.e(th, "Failed to parse color: " + o6j1Var, new Object[0]);
                    jE = u7h.f;
                }
                qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                c36 c36Var = h36.a;
                c36 c36Var2 = z7 ? h36.e : c36Var;
                long j = jE;
                fra fraVar = een.Z;
                jw31 jw31VarA = ew31.a(c36Var2, fraVar, x340Var7, i);
                int iHashCode5 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM5 = x340Var9.m();
                qim0 qim0VarE6 = zr7.E(x340Var7, qim0VarF2);
                hzj.A.getClass();
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(jw31VarA, x340Var7, lljVar4);
                nko1.H(xos0VarM5, x340Var7, lljVar3);
                i3a.l(iHashCode5, x340Var7, lljVar2, x340Var7);
                nko1.H(qim0VarE6, x340Var7, lljVar);
                boolean zG = x340Var9.g(o6j1Var.a);
                Object objT2 = x340Var9.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = (zau0) function2.invoke();
                    x340Var9.s0(objT2);
                }
                zau0 zau0Var = (zau0) objT2;
                Object objT3 = x340Var9.T();
                if (objT3 == m4cVar) {
                    objT3 = bb00.h(0, x340Var9);
                }
                err0 err0Var = (hdn0) objT3;
                lsm0 lsm0Var = o6j1Var.l;
                String str2 = o6j1Var.e;
                k6j1 k6j1Var = o6j1Var.k;
                boolean z8 = this.b;
                qim0 qim0VarH = z8 ? qim0Var : u291.h(qim0Var, 192.0f);
                boolean zI = x340Var9.i(zau0Var);
                Object objT4 = x340Var9.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new b6j1(zau0Var, (byte) 0);
                    x340Var9.s0(objT4);
                }
                Function0 function3 = (Function0) objT4;
                boolean zI2 = x340Var9.i(err0Var);
                Object objT5 = x340Var9.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new qsc1(err0Var, (byte) 6);
                    x340Var9.s0(objT5);
                }
                z5p1.b(lsm0Var, function3, str2, this.c, this.d, k6j1Var, (iu30) objT5, qim0VarH, x340Var7, 0);
                qim0 qim0VarH2 = u291.h(qim0Var, ((wat) x340Var9.k(t4k.h)).M0(err0Var.s()));
                if (!z7) {
                    qim0VarH2 = u291.d(qim0VarH2, 1.0f);
                }
                w2g0.c(qim0VarH2, (tl3) null, apo.r(1764748430, new pr10(j, o6j1Var, hdn0Var, z7, z8), x340Var7), x340Var7, 3072, 6);
                x340Var9.r(true);
                if (z8) {
                    x340Var9.i0(-958229227);
                    qim0 qim0VarF3 = u291.f(uyn1.A(qim0Var, 16.0f, 8.0f, 16.0f, 32.0f), 1.0f);
                    gfh0 gfh0VarC3 = t1c.c(z7 ? een.h : een.g, false);
                    int iHashCode6 = Long.hashCode(x340Var9.T);
                    xos0 xos0VarM6 = x340Var9.m();
                    qim0 qim0VarE7 = zr7.E(x340Var7, qim0VarF3);
                    x340Var9.m0();
                    if (x340Var9.S) {
                        x340Var9.l(n4kVar);
                    } else {
                        x340Var9.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var7, lljVar4);
                    nko1.H(xos0VarM6, x340Var7, lljVar3);
                    i3a.l(iHashCode6, x340Var7, lljVar2, x340Var7);
                    nko1.H(qim0VarE7, x340Var7, lljVar);
                    k1p1.b(o6j1Var.f, hdn0Var, j, z7, x340Var7, 0);
                    z = true;
                    x340Var9.r(true);
                    i2 = 0;
                    x340Var9.r(false);
                } else {
                    z = true;
                    i2 = 0;
                    x340Var9.i0(-957713170);
                    x340Var9.r(false);
                }
                x340Var9.r(z);
                qim0 qim0VarB = uyn1.B(u291.h(u291.f(qim0Var, 1.0f), 48.0f), 0.0f, 0.0f, 4.0f, 0.0f, 11);
                jw31 jw31VarA2 = ew31.a(c36Var, fraVar, x340Var7, i2);
                int iHashCode7 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM7 = x340Var9.m();
                qim0 qim0VarE8 = zr7.E(x340Var7, qim0VarB);
                x340Var9.m0();
                if (x340Var9.S) {
                    x340Var9.l(n4kVar);
                } else {
                    x340Var9.v0();
                }
                nko1.H(jw31VarA2, x340Var7, lljVar4);
                nko1.H(xos0VarM7, x340Var7, lljVar3);
                i3a.l(iHashCode7, x340Var7, lljVar2, x340Var7);
                nko1.H(qim0VarE8, x340Var7, lljVar);
                op71.g(x340Var7, new wnb0(1.0f, true));
                j2iVar.invoke(x340Var7, 0);
                x340Var9.r(true);
                x340Var9.r(true);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                p1p1.x((o2u0) obj6, (List) obj5, this.b, this.c, this.d, (iu30) obj4, (b0k) obj2, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb7(String str, boolean z, boolean z2, Function0 function0, Function0 function1, boolean z3) {
        super(3);
        this.e = str;
        this.b = z;
        this.c = z2;
        this.f = function0;
        this.g = function1;
        this.d = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb7(o2u0 o2u0Var, List list, boolean z, boolean z2, boolean z3, iu30 iu30Var) {
        super(3);
        this.e = o2u0Var;
        this.f = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.g = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb7(o6j1 o6j1Var, boolean z, boolean z2, boolean z3, Function0 function0, j2i j2iVar) {
        super(3);
        this.e = o6j1Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = function0;
        this.g = j2iVar;
    }
}
