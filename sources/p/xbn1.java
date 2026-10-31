package p;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class xbn1 implements ufp1, igp1, adp1 {
    public static final /* synthetic */ xbn1 a = new xbn1();
    public static final /* synthetic */ xbn1 b = new xbn1();

    public static final leo1 a(Object obj, Object obj2) {
        leo1 leo1Var = (leo1) obj;
        leo1 leo1Var2 = (leo1) obj2;
        if (!leo1Var2.isEmpty()) {
            if (!leo1Var.a) {
                if (leo1Var.isEmpty()) {
                    leo1Var = new leo1();
                } else {
                    leo1 leo1Var3 = new leo1(leo1Var);
                    leo1Var3.a = true;
                    leo1Var = leo1Var3;
                }
            }
            leo1Var.b();
            if (!leo1Var2.isEmpty()) {
                leo1Var.putAll(leo1Var2);
            }
        }
        return leo1Var;
    }

    @Override // p.ufp1
    public /* synthetic */ Object b(pno1 pno1Var) {
        byte[] bArr = xfn1.g;
        return xfn1.b((sbn1) pno1Var, ila0.L());
    }

    @Override // p.igp1
    public Object c(zxl1 zxl1Var, zxl1 zxl1Var2) {
        int i = xgp1.a;
        for (int i2 = 0; i2 < ((List) zxl1Var.b).size(); i2++) {
            q9p1 q9p1VarS = zxl1Var.s(i2);
            if (q9p1VarS.d && q9p1VarS.b == k9p1.c) {
                if (((HashMap) zxl1Var.c).get(pdp1.class) != null) {
                    bhn0.d();
                    return null;
                }
                zxl1Var.r();
                return new zfn1();
            }
        }
        k220.r("keyset doesn't contain a valid primary key");
        return null;
    }

    @Override // p.adp1
    public /* synthetic */ kap1 f(pno1 pno1Var, a2x0 a2x0Var) {
        return kgn1.a((xdn1) pno1Var, a2x0Var);
    }
}
