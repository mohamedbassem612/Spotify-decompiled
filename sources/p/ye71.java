package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ye71 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye71(xe71 xe71Var, byte b) {
        super(3);
        this.a = b;
        this.b = xe71Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xe71 xe71Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(x340Var).g;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarR = u291.r(nim0Var, 48.0f);
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = s571.Y0;
                    x340Var2.s0(objT);
                }
                qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT);
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarC);
                hzj.A.getClass();
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                String str = xe71Var.e;
                w4i1 w4i1Var = xe71Var.g;
                Uri uri = Uri.parse(str);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0VarD, 0.0f, 0.0f, 12.0f, 12.0f, 3);
                cua cuaVar = cbx.b(x340Var2).f;
                qim0 qim0VarQ = i1p1.q(qim0VarB, er31.b(4.0f));
                h2c h2cVar = h2c.a;
                eso1.e(uri, isl.a, h2cVar.a(qim0VarQ, graVar), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, true, x340Var2, 48, 48, 2040);
                String str2 = w4i1Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                Uri uri2 = Uri.parse(str2);
                String str3 = w4i1Var.a;
                String str4 = w4i1Var.b;
                long jQ = bro1.q(w4i1Var.d);
                qim0 qim0VarA = h2cVar.a(nim0Var, een.Y);
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    objT2 = s571.a1;
                    x340Var2.s0(objT2);
                }
                bmq0.a(uri2, exd0.r(qim0VarA, (iu30) objT2), hcx.c, str3, str4, jQ, 0L, false, x340Var2, 384, 192);
                x340Var2.r(true);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                uwo1.e(xe71Var.d, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                uwo1.e(xe71Var.c, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                return rih1Var;
        }
    }
}
