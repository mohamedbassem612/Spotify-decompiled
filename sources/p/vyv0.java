package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vyv0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyv0(String str, vnr0 vnr0Var, tlc1 tlc1Var, float f) {
        super(3);
        this.c = str;
        this.d = vnr0Var;
        this.e = tlc1Var;
        this.b = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                syv0 syv0Var = (syv0) obj6;
                jlv0 jlv0Var = new jlv0(syv0Var.d, syv0Var.h);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, this.b, 12.0f, 3);
                iu30 iu30Var = (iu30) obj5;
                x340 x340Var2 = x340Var;
                ss50 ss50Var = (ss50) obj4;
                boolean zG = x340Var2.g(iu30Var) | x340Var2.i(syv0Var) | x340Var2.i(ss50Var);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = new d4v0(iu30Var, syv0Var, ss50Var, (byte) 3);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                boolean zG2 = x340Var2.g(iu30Var) | x340Var2.i(syv0Var);
                Object objT2 = x340Var2.T();
                if (zG2 || objT2 == m4cVar) {
                    objT2 = new tyv0(iu30Var, syv0Var, (byte) 1);
                    x340Var2.s0(objT2);
                }
                ucp1.e(jlv0Var, qim0VarB, function0, (Function0) objT2, (iu30) null, x340Var2, 0);
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                String str = (String) obj6;
                vnr0 vnr0Var = (vnr0) obj5;
                tlc1 tlc1Var = (tlc1) obj4;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarD);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                boolean z = x340Var5.S;
                n4k n4kVar = hmb0.t1;
                if (z) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var3, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var3, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var3, lljVar3);
                nko1.F(x340Var3);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var3, lljVar4);
                h2c h2cVar = h2c.a;
                qim0 qim0VarB2 = h2cVar.b(nim0Var);
                Uri uri = Uri.parse(str);
                uwr uwrVar2 = cbx.a;
                i9h i9hVar = new i9h(cbx.a(x340Var3).a.b.a());
                eso1.e(uri, isl.a, qim0VarB2, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new pux(i9hVar, i9hVar), false, false, x340Var3, 1073938480, 0, 3544);
                qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 0.6f);
                gra graVar2 = een.h;
                qim0 qim0VarA = h2cVar.a(qim0VarC, graVar2);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var5.T);
                xos0 xos0VarM2 = x340Var5.m();
                qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarA);
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(gfh0VarC2, x340Var3, lljVar);
                nko1.H(xos0VarM2, x340Var3, lljVar2);
                i3a.l(iHashCode2, x340Var3, lljVar3, x340Var3);
                nko1.H(qim0VarE2, x340Var3, lljVar4);
                Object objT3 = x340Var5.T();
                if (objT3 == fkj0.X) {
                    objT3 = xt21.S0;
                    x340Var5.s0(objT3);
                }
                qgo1.f(gqg0.a(vnr0Var, tlc1Var.N0(this.b)), uyn1.B(h2cVar.a(s161.a(nim0Var, (iu30) objT3), graVar2), 16.0f, 0.0f, 16.0f, 0.0f, 10), (a0e1) null, 0, false, (iu30) null, x340Var3, 8, 60);
                x340Var5.r(true);
                x340Var5.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vyv0(syv0 syv0Var, float f, iu30 iu30Var, ss50 ss50Var) {
        super(3);
        this.c = syv0Var;
        this.b = f;
        this.d = iu30Var;
        this.e = ss50Var;
    }
}
