package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gz6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ez6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gz6(ez6 ez6Var, byte b) {
        super(3);
        this.a = b;
        this.b = ez6Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ez6 ez6Var = this.b;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, nim0Var);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(hmb0.t1);
                } else {
                    x340Var3.v0();
                }
                nko1.H(jw31VarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                String str = ez6Var.c;
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                String str2 = ez6Var.b;
                uwr uwrVar = cbx.a;
                bmq0.a(uri, (qim0) null, hcx.e, (String) null, str2, ((yex) zex.a.d).d, 0L, false, x340Var, 384, 202);
                x340Var3.r(true);
                return rih1Var;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("artist-view-header-title", nim0Var);
                String str3 = ez6Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str3, qim0VarN, cbx.d(b0kVar).e, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2040);
                return rih1Var;
        }
    }
}
