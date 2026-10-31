package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class go7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go7(String str, String str2, String str3, byte b) {
        super(3);
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        String str = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri.getClass();
                bmq0.a(uri, (qim0) null, (hcx) null, this.c, this.d, 0L, 0L, false, b0kVar, 0, 230);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                nim0 nim0Var = nim0.a;
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
                if (str == null) {
                    str = "";
                }
                Uri uri2 = Uri.parse(str);
                qim0 qim0VarN = anm1.N("compact_creator_info_avatar", nim0Var);
                hcx hcxVar = hcx.b;
                String str2 = this.c;
                bmq0.a(uri2, qim0VarN, hcxVar, (String) null, str2, 0L, 0L, false, x340Var, 384, 232);
                uwo1.e(str2, anm1.N("compact_creator_info_text", new wnb0(1.0f, false)), cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1712);
                String str3 = this.d;
                if (str3 == null || str3.length() == 0) {
                    x340Var3.i0(-1907875877);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1908040208);
                    uwo1.e("· ".concat(str3), (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                    x340Var3.r(false);
                }
                x340Var3.r(true);
                return rih1Var;
            case 2:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                Uri uri3 = str != null ? Uri.parse(str) : Uri.EMPTY;
                uri3.getClass();
                bmq0.a(uri3, (qim0) null, (hcx) null, this.c, this.d, 0L, 0L, false, b0kVar2, 0, 230);
                return rih1Var;
            default:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(1 & iIntValue, (iIntValue & 17) != 16)) {
                    dem1.g(this.b, this.c, this.d, null, x340Var5, 0);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
        }
    }
}
