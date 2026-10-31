package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ni1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(int i, Function0 function0, iu30 iu30Var, iu30 iu30Var2, bih1 bih1Var, mvh1 mvh1Var, mvh1 mvh1Var2) {
        super(3);
        this.a = (byte) 4;
        this.b = mvh1Var;
        this.e = iu30Var;
        this.c = mvh1Var2;
        this.d = i;
        this.h = function0;
        this.f = iu30Var2;
        this.g = bih1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.h;
        Object obj7 = this.e;
        Object obj8 = this.b;
        Object obj9 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                boolean z = false;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj7;
                gv51 gv51Var = (gv51) obj8;
                h6q0 h6q0Var = (h6q0) obj9;
                if (((gj1) obj6).h.get(h6q0Var.a.a) != null) {
                    z = true;
                }
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(iu30Var) | x340Var2.i(h6q0Var) | x340Var2.e(i);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new mi1(iu30Var, h6q0Var, i, (byte) 1);
                    x340Var2.s0(objT);
                }
                iu30 iu30Var2 = (iu30) objT;
                o0g1 o0g1Var = new o0g1((ven0) obj5, iu30Var, (h6q0) obj9, this.d, (ven0) obj4);
                w4i1 w4i1Var = h6q0Var.a;
                String strZ = h6q0Var.b().z();
                otw.c(gv51Var, new dv51(w4i1Var, z, this.d, 2, strZ == null ? "" : strZ, iu30Var2, h6q0Var.e, o0g1Var), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                gv51 gv51Var2 = (gv51) obj8;
                h6q0 h6q0Var2 = (h6q0) obj9;
                zkn zknVar = (zkn) obj6;
                boolean zContainsKey = zknVar.g.containsKey(h6q0Var2.a.a);
                iu30 iu30Var3 = (iu30) obj7;
                x340 x340Var3 = (b0k) obj2;
                boolean zG2 = x340Var3.g(iu30Var3) | x340Var3.e(i) | x340Var3.i(h6q0Var2);
                Object objT2 = x340Var3.T();
                if (zG2 || objT2 == fkj0.X) {
                    objT2 = new mi1(iu30Var3, i, h6q0Var2, (byte) 3);
                    x340Var3.s0(objT2);
                }
                iu30 iu30Var4 = (iu30) objT2;
                t01 t01Var = new t01((ven0) obj5, zknVar, (h6q0) obj9, iu30Var3, this.d, (ven0) obj4);
                w4i1 w4i1Var2 = h6q0Var2.a;
                String strZ2 = h6q0Var2.b().z();
                otw.c(gv51Var2, new dv51(w4i1Var2, zContainsKey, this.d, 1, strZ2 == null ? "" : strZ2, iu30Var4, h6q0Var2.e, t01Var), (qim0) null, (ipb1) null, x340Var3, 0, 12);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarC = u291.c(nim0Var, 1.0f);
                drr0 drr0Var = (drr0) obj8;
                x340 x340Var4 = (b0k) obj2;
                boolean zI = x340Var4.i(drr0Var);
                j06 j06Var = x340Var4.a;
                Object objT3 = x340Var4.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new qg6(drr0Var, (byte) 20);
                    x340Var4.s0(objT3);
                }
                qim0 qim0VarN = anm1.N("quickscroll_handle", lrn1.u(qim0VarC, (iu30) objT3));
                wat watVar = (wat) obj9;
                fgz0 fgz0Var = (fgz0) obj6;
                c9n c9nVar = (c9n) obj7;
                String str = (String) obj4;
                ven0 ven0Var = (ven0) obj5;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var4.m0();
                boolean z2 = x340Var4.S;
                n4k n4kVar = hmb0.t1;
                if (z2) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var4, lljVar4);
                float fFloatValue = ((Number) fgz0Var.c.getValue()).floatValue();
                float fS = drr0Var.s();
                float f = zfz0.c;
                int iU = jch0.U((fS - watVar.X0(f)) * fFloatValue);
                fra fraVar = een.N0;
                boolean zE = x340Var4.e(i) | x340Var4.e(iU);
                Object objT4 = x340Var4.T();
                if (zE || objT4 == m4cVar) {
                    objT4 = new mun((byte) 6, i, iU);
                    x340Var4.s0(objT4);
                }
                qim0 qim0VarB = eqr0.B(nim0Var, (iu30) objT4);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var4, 0);
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(jw31VarA, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                fq7.f((!((Boolean) ven0Var.getValue()).booleanValue() || str == null || ihc1.y0(str)) ? false : true, anm1.N("quickscroll_label", nim0Var), xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, apo.r(216807605, new iww0(str, (byte) 2), x340Var4), x340Var4, 1572870, 16);
                zfz0.a((qim0) null, x340Var4, 0);
                x340Var4.r(true);
                qim0 qim0VarD = eqr0.D(zfz0.d, 0.0f, 2, h2c.a.a(u291.v(u291.c(nim0Var, 1.0f), f), een.f));
                boolean zI2 = x340Var4.i(fgz0Var) | x340Var4.i(drr0Var) | x340Var4.i(c9nVar);
                Object objT5 = x340Var4.T();
                if (zI2 || objT5 == m4cVar) {
                    objT5 = new mhg(fgz0Var, c9nVar, drr0Var, (byte) 10);
                    x340Var4.s0(objT5);
                }
                t1c.a(f8d1.b(qim0VarD, fgz0Var, (PointerInputEventHandler) objT5), x340Var4, 0);
                x340Var4.r(true);
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                cso1.p((hc01) obj8, (fd01) obj9, this.d, (iu30) obj7, (iu30) obj6, (iu30) obj5, (Function0) obj4, null, (b0k) obj2, 0);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                mvh1 mvh1Var = (mvh1) obj8;
                iu30 iu30Var5 = (iu30) obj7;
                mvh1 mvh1Var2 = (mvh1) obj9;
                Function0 function0 = (Function0) obj6;
                x340 x340Var5 = (b0k) obj2;
                iu30 iu30Var6 = (iu30) obj5;
                boolean zG3 = x340Var5.g(function0) | x340Var5.g(iu30Var6);
                Object objT6 = x340Var5.T();
                if (zG3 || objT6 == fkj0.X) {
                    objT6 = new hvw(function0, iu30Var6, (byte) 7);
                    x340Var5.s0(objT6);
                }
                eko1.h(mvh1Var, iu30Var5, mvh1Var2, this.d, (iu30) objT6, (bih1) obj4, x340Var5, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(drr0 drr0Var, wat watVar, int i, fgz0 fgz0Var, c9n c9nVar, String str, ven0 ven0Var) {
        super(3);
        this.a = (byte) 2;
        this.b = drr0Var;
        this.c = watVar;
        this.d = i;
        this.h = fgz0Var;
        this.e = c9nVar;
        this.g = str;
        this.f = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(hc01 hc01Var, fd01 fd01Var, int i, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, Function0 function0) {
        super(3);
        this.a = (byte) 3;
        this.b = hc01Var;
        this.c = fd01Var;
        this.d = i;
        this.e = iu30Var;
        this.h = iu30Var2;
        this.f = iu30Var3;
        this.g = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni1(gv51 gv51Var, h6q0 h6q0Var, Object obj, int i, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(3);
        this.a = b;
        this.b = gv51Var;
        this.c = h6q0Var;
        this.h = obj;
        this.d = i;
        this.e = iu30Var;
        this.f = ven0Var;
        this.g = ven0Var2;
    }
}
