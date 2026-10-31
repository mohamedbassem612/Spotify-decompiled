package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xve extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wve b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xve(wve wveVar, byte b) {
        super(3);
        this.a = b;
        this.b = wveVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wve wveVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarR = u291.r(nim0Var, 48.0f);
                x340 x340Var = (b0k) obj2;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = nve.c;
                    x340Var.s0(objT);
                }
                qim0 qim0VarC = i541.C(qim0VarR, (iu30) objT);
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
                hzj.A.getClass();
                if (x340Var.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                String str = wveVar.f;
                w4i1 w4i1Var = wveVar.h;
                Uri uri = Uri.parse(str);
                qim0 qim0VarQ = i1p1.q(uyn1.A(u291.d(nim0Var, 1.0f), 0.0f, 0.0f, 12.0f, 12.0f), er31.b(5.0f));
                h2c h2cVar = h2c.a;
                eso1.e(uri, isl.a, h2cVar.a(qim0VarQ, graVar), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, true, x340Var, 48, 48, 2040);
                String str2 = w4i1Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                Uri uri2 = Uri.parse(str2);
                String str3 = w4i1Var.a;
                String str4 = w4i1Var.b;
                long jQ = bro1.q(w4i1Var.d);
                qim0 qim0VarA = h2cVar.a(nim0Var, een.Y);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = nve.e;
                    x340Var.s0(objT2);
                }
                bmq0.a(uri2, exd0.r(qim0VarA, (iu30) objT2), hcx.c, str3, str4, jQ, 0L, false, x340Var, 384, 192);
                x340Var.r(true);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                uwo1.e(wveVar.e, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                uwo1.e(wveVar.d, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, (b0k) obj2, 0, 0, 1726);
                return rih1Var;
        }
    }
}
