package p;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zfy extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ j2i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfy(boolean z, float f, boolean z2, boolean z3, long j, String str, j2i j2iVar) {
        super(3);
        this.a = z;
        this.b = f;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = str;
        this.g = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kbf0 kbf0VarN;
        boolean z;
        x340 x340Var;
        kbf0 kbf0VarN2;
        boolean z2;
        boolean z3;
        vu30 vu30Var = y580.Y;
        llj lljVar = y580.R0;
        llj lljVar2 = y580.N0;
        llj lljVar3 = y580.O0;
        gra graVar = een.d;
        x340 x340Var2 = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        gra graVar2 = een.h;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = x340Var2;
        boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 17) != 16);
        j06 j06Var = x340Var3.a;
        if (zY) {
            boolean z4 = this.a;
            nim0 nim0Var = nim0.a;
            oux ouxVar = oux.a;
            isl islVar = isl.a;
            n4k n4kVar = hmb0.t1;
            j2i j2iVar = this.g;
            String str = this.f;
            boolean z5 = this.d;
            float f = this.b;
            if (z4) {
                x340Var3.i0(-1847309059);
                boolean zD = x340Var3.d(f);
                boolean z6 = this.c;
                boolean zH = zD | x340Var3.h(z6);
                Object objT = x340Var3.T();
                if (zH || objT == m4cVar) {
                    float f2 = 21.0f * f;
                    float f3 = 28.0f * f;
                    float f4 = 40.0f * f;
                    float f5 = f4 / 90.0f;
                    float f6 = z6 ? ((f3 + (62.0f * f5)) / 2.0f) + 3.0f : 30.0f * f;
                    objT = new qg41(z6 ? 78.0f * f5 : 34.0f * f, f6 - f2, f2, 32.0f * f, f6, f4, f3, f4, z6 ? (56.0f * f5) + 2.0f : 24.0f * f, z6 ? (f5 * 84.0f) + 2.0f : 36.0f * f);
                    x340Var3.s0(objT);
                }
                qg41 qg41Var = (qg41) objT;
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var3).f;
                cua cuaVar2 = cbx.b(x340Var3).f;
                cua cuaVar3 = cbx.b(x340Var3).f;
                boolean zD2 = x340Var3.d(f) | x340Var3.d(4.0f);
                Object objT2 = x340Var3.T();
                if (zD2 || objT2 == m4cVar) {
                    objT2 = er31.b(4.0f * f);
                    x340Var3.s0(objT2);
                }
                cr31 cr31Var = (cr31) objT2;
                boolean zD3 = x340Var3.d(f) | x340Var3.d(2.0f) | x340Var3.d(6.0f) | x340Var3.h(z6);
                Object objT3 = x340Var3.T();
                if (zD3 || objT3 == m4cVar) {
                    objT3 = z6 ? er31.b(6.0f) : er31.b(2.0f * f);
                    x340Var3.s0(objT3);
                }
                cr31 cr31Var2 = (cr31) objT3;
                gra graVar3 = een.g;
                float f7 = qg41Var.a;
                float f8 = qg41Var.h;
                float f9 = qg41Var.g;
                qim0 qim0VarP = u291.p(nim0Var, f7);
                Object objT4 = x340Var3.T();
                if (objT4 == m4cVar) {
                    objT4 = vay.i;
                    x340Var3.s0(objT4);
                }
                qim0 qim0VarC = i541.C(qim0VarP, (iu30) objT4);
                gfh0 gfh0VarC = t1c.c(graVar3, false);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarC);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var3, lljVar3);
                nko1.H(xos0VarM, x340Var3, lljVar2);
                x0d.q(iHashCode, x340Var3, lljVar, x340Var3);
                nko1.H(qim0VarE, x340Var3, vu30Var);
                ncf0 ncf0VarG = h5p1.G(new ocf0(z6 ? 2131886130 : 2131886129), (String) null, (xu30) null, x340Var3, 0, 62);
                if (z5) {
                    x340Var3.i0(-1162009210);
                    kbf0VarN2 = zpn1.n(ncf0VarG.c(), false, false, (bcf0) null, 0.0f, 1, x340Var3, 954);
                    x340Var = x340Var3;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var3;
                    x340Var.i0(-1161843237);
                    x340Var.r(false);
                    kbf0VarN2 = null;
                }
                float f10 = kbf0VarN2 != null ? kbf0VarN2.f() : 1.0f;
                boolean z7 = kbf0VarN2 != null && kbf0VarN2.j();
                Object objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = c97.b(z5 ? 0.0f : 8.0f);
                    x340Var.s0(objT5);
                }
                o95 o95Var = (o95) objT5;
                if (z5) {
                    x340Var.i0(-1161584882);
                    Boolean boolValueOf = Boolean.valueOf(z7);
                    boolean zH2 = x340Var.h(z7) | x340Var.i(o95Var);
                    Object objT6 = x340Var.T();
                    if (zH2 || objT6 == m4cVar) {
                        z3 = false;
                        objT6 = new yfy((byte) 0, o95Var, null, z7);
                        x340Var.s0(objT6);
                    } else {
                        z3 = false;
                    }
                    qxd0.t(boolValueOf, x340Var, (vu30) objT6);
                    x340Var.r(z3);
                } else {
                    vu30Var = vu30Var;
                    f10 = f10;
                    x340Var.i0(-1161290816);
                    x340Var.r(false);
                }
                qim0 qim0VarD = eqr0.D(qg41Var.b, 0.0f, 2, nim0Var);
                boolean zI = x340Var.i(o95Var);
                Object objT7 = x340Var.T();
                if (zI || objT7 == m4cVar) {
                    objT7 = new wqe(o95Var, (byte) 6);
                    x340Var.s0(objT7);
                }
                qim0 qim0VarS = u291.s(i541.C(qim0VarD, (iu30) objT7), qg41Var.c, qg41Var.d);
                long j = this.e;
                t1c.a(dug.f(qim0VarS, u7h.b(j, 0.8f, 0.0f, 0.0f, 0.0f, 14), cr31Var), x340Var, 0);
                qim0 qim0VarS2 = u291.s(nim0Var, qg41Var.e, qg41Var.f);
                Object objT8 = x340Var.T();
                if (objT8 == m4cVar) {
                    objT8 = vay.t;
                    x340Var.s0(objT8);
                }
                t1c.a(exd0.q(qim0VarS2, (iu30) objT8), x340Var, 0);
                ddf0 ddf0VarS = e130.s(new edf0[]{e130.t(ndf0.F, new PorterDuffColorFilter(z4p1.G(j), PorterDuff.Mode.SRC_ATOP), new String[]{"**"}, x340Var, 6)}, x340Var);
                qim0 qim0VarS3 = u291.s(nim0Var, f9, f8);
                gfh0 gfh0VarC2 = t1c.c(graVar2, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarS3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar3);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar, x340Var);
                vu30 vu30Var2 = vu30Var;
                nko1.H(qim0VarE2, x340Var, vu30Var2);
                fcf0 fcf0VarC = ncf0VarG.c();
                h6m h6mVar = mif1.Q0;
                qim0 qim0VarX = lrn1.x(u291.s(nim0Var, f9, f8), z6 ? 1.0f : 0.0f);
                float f11 = f10;
                boolean zD4 = x340Var.d(f11);
                Object objT9 = x340Var.T();
                if (zD4 || objT9 == m4cVar) {
                    objT9 = new xnn((byte) 1, f11);
                    x340Var.s0(objT9);
                }
                mp10.e(fcf0VarC, (Function0) objT9, qim0VarX, false, false, false, (xc21) null, false, ddf0VarS, (tl3) null, h6mVar, false, false, (Map) null, (jj7) null, false, x340Var, 134217728, 6, 64248);
                qim0 qim0VarQ = i1p1.q(u291.s(nim0Var, qg41Var.i, qg41Var.j), cr31Var2);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarQ);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar3);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE3, x340Var, vu30Var2);
                Uri uri = str != null ? Uri.parse(str) : null;
                if (uri == null) {
                    x340Var.i0(-1676902322);
                    z2 = false;
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1676902321);
                    eso1.e(uri, islVar, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, ouxVar, false, false, x340Var, 200112, 0, 3536);
                    z2 = false;
                    x340Var.r(false);
                }
                ktd.s(j2iVar, x340Var, 0, true, true);
                x340Var.r(true);
                x340Var.r(z2);
            } else {
                x340Var3.i0(-1840519718);
                uwr uwrVar2 = cbx.a;
                cua cuaVar4 = cbx.b(x340Var3).f;
                boolean zD5 = x340Var3.d(f) | x340Var3.d(4.0f);
                Object objT10 = x340Var3.T();
                if (zD5 || objT10 == m4cVar) {
                    objT10 = er31.b(4.0f * f);
                    x340Var3.s0(objT10);
                }
                cr31 cr31Var3 = (cr31) objT10;
                gfh0 gfh0VarC4 = t1c.c(graVar2, false);
                int iHashCode4 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM4 = x340Var3.m();
                qim0 qim0VarE4 = zr7.E(x340Var3, nim0Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC4, x340Var3, lljVar3);
                nko1.H(xos0VarM4, x340Var3, lljVar2);
                x0d.q(iHashCode4, x340Var3, lljVar, x340Var3);
                nko1.H(qim0VarE4, x340Var3, vu30Var);
                ncf0 ncf0VarG2 = h5p1.G(new ocf0(2131886210), (String) null, (xu30) null, x340Var3, 0, 62);
                if (z5) {
                    x340Var3.i0(2087320477);
                    kbf0VarN = zpn1.n(ncf0VarG2.c(), true, false, (bcf0) null, 0.0f, 0, x340Var3, 1016);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(282605893);
                    Object objT11 = x340Var3.T();
                    if (objT11 == m4cVar) {
                        objT11 = us71.i(1.0f, x340Var3);
                    }
                    kbf0VarN = (drr0) objT11;
                    x340Var3.r(false);
                }
                fcf0 fcf0VarC2 = ncf0VarG2.c();
                boolean zG = x340Var3.g(kbf0VarN);
                Object objT12 = x340Var3.T();
                if (zG || objT12 == m4cVar) {
                    objT12 = new bu2(kbf0VarN, (byte) 5);
                    x340Var3.s0(objT12);
                }
                float f12 = 32.0f * f;
                mp10.e(fcf0VarC2, (Function0) objT12, u291.s(nim0Var, f12, 40.0f * f), false, false, false, (xc21) null, false, (ddf0) null, (tl3) null, (j6m) null, false, false, (Map) null, (jj7) null, false, x340Var3, 0, 0, 65528);
                qim0 qim0VarQ2 = i1p1.q(u291.s(nim0Var, 24.0f * f, f12), cr31Var3);
                gfh0 gfh0VarC5 = t1c.c(graVar, false);
                int iHashCode5 = Long.hashCode(x340Var3.T);
                xos0 xos0VarM5 = x340Var3.m();
                qim0 qim0VarE5 = zr7.E(x340Var3, qim0VarQ2);
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC5, x340Var3, lljVar3);
                nko1.H(xos0VarM5, x340Var3, lljVar2);
                x0d.q(iHashCode5, x340Var3, lljVar, x340Var3);
                nko1.H(qim0VarE5, x340Var3, vu30Var);
                Uri uri2 = str != null ? Uri.parse(str) : null;
                if (uri2 == null) {
                    x340Var3.i0(341457771);
                    z = false;
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(341457772);
                    eso1.e(uri2, islVar, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, ouxVar, false, false, x340Var3, 200112, 0, 3536);
                    z = false;
                    x340Var3.r(false);
                }
                ktd.s(j2iVar, x340Var3, 0, true, true);
                x340Var3.r(z);
            }
        } else {
            x340Var3.b0();
        }
        return rih1.a;
    }
}
