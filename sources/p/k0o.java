package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k0o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0o(n0o n0oVar, byte b) {
        super(1);
        this.a = b;
        this.b = n0oVar;
    }

    public final Object invoke(Object obj) {
        x010 dkmVar;
        huz dkmVar2;
        String str;
        byte b = this.a;
        n0o n0oVar = this.b;
        switch (b) {
            case 0:
                c0o c0oVar = (c0o) obj;
                x4i1 x4i1Var = c0oVar.c;
                if (x4i1Var == null || (str = x4i1Var.c) == null || str.length() == 0) {
                    cp31 cp31Var = (cp31) n0oVar.f;
                    boolean z = c0oVar.f;
                    String str2 = c0oVar.d;
                    if (str2 != null) {
                        mr20 mr20VarE = cp31Var.E(z);
                        String str3 = "";
                        if (str2.length() != 0) {
                            try {
                                String strA = f9a.a(a860.d(str2));
                                Set set = s4b1.f;
                                String strZ = uic.c(strA).z();
                                if (strZ != null) {
                                    str3 = strZ;
                                }
                            } catch (IllegalArgumentException unused) {
                            }
                        }
                        dkmVar = new x010(mr20VarE, str3.length() == 0 ? new huz((Object) null, (byte) 10) : new v3o(d3p1.H((d0r) cp31Var.c, (o3r) cp31Var.f, str3), str3, (byte) 0), new mnl(3, (lnm) null, (byte) 4), (byte) 1);
                    } else {
                        dkmVar = new dkm(cp31Var.E(z), (byte) 5);
                    }
                    dkmVar2 = new dkm(rqt0.u(new ht20(new fu20(dkmVar, new eum(cp31Var, (lnm) null, (byte) 9), (byte) 1), new cuk(cp31Var, (lnm) null, (byte) 27))), (byte) 3);
                } else {
                    bxn bxnVarW = xgc.w(x4i1Var);
                    dkmVar2 = new huz(new f0o(new bxn(bxnVarW.a, bxnVarW.b, bxnVarW.c, xgc.w(c0oVar.a).d)), (byte) 10);
                }
                return new x010(dkmVar2, new dkm(((mnk0) n0oVar.h).a, (byte) 4), new vm0(3, (lnm) null, (byte) 10), (byte) 1);
            default:
                ((qtr) obj).b(new js(n0oVar, (lnm) null, (byte) 6));
                return rih1.a;
        }
    }
}
