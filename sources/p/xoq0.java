package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xoq0 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ View e;
    public final /* synthetic */ String f;
    public final /* synthetic */ long g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoq0(boolean z, boolean z2, boolean z3, Function0 function0, View view, String str, long j, String str2) {
        super(2);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = function0;
        this.e = view;
        this.f = str;
        this.g = j;
        this.h = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        fra fraVar = een.N0;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            boolean z = this.a;
            n4k n4kVar = hmb0.t1;
            b36 b36Var = h36.g;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var2.i0(686527927);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                Object objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = rfq0.g;
                    x340Var2.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarF, true, (iu30) objT);
                pm31 pm31Var = new pm31(2);
                Function0 function0 = this.d;
                boolean zG = x340Var2.g(function0);
                View view = this.e;
                boolean zI = zG | x340Var2.i(view);
                Object objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new ozp0(function0, view, (byte) 9);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarN = anm1.N(this.f, qmo1.D(qim0VarB, this.b, this.c, pm31Var, (iu30) objT2, 8));
                jw31 jw31VarA = ew31.a(b36Var, fraVar, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar4);
                nko1.H(xos0VarM, x340Var2, lljVar3);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, lljVar2);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, lljVar);
                fn31.l(this.f, this.g, this.h, x340Var2, 6);
                uwr uwrVar = cbx.a;
                ljo1.j(this.b, (iu30) null, (qim0) null, this.c, hxo1.m(cbx.a(x340Var2).b.a, cbx.a(x340Var2).b.f, cbx.a(x340Var2).b.b, cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).b.b, x340Var2, 65420), (idn0) null, x340Var2, 48, 76);
                x340Var2.r(true);
                x340Var2.r(false);
            } else {
                x340Var2.i0(687776576);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    objT3 = rfq0.h;
                    x340Var2.s0(objT3);
                }
                qim0 qim0VarB2 = s161.b(qim0VarF2, true, (iu30) objT3);
                jw31 jw31VarA2 = ew31.a(b36Var, fraVar, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarB2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA2, x340Var2, lljVar4);
                nko1.H(xos0VarM2, x340Var2, lljVar3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var2, lljVar2);
                nko1.F(x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar);
                fn31.l(this.f, this.g, this.h, x340Var2, 6);
                x340Var2.r(true);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
