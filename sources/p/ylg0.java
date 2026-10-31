package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ylg0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ plg0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ylg0(plg0 plg0Var, byte b) {
        super(3);
        this.a = b;
        this.b = plg0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        String str2;
        boolean z;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        plg0 plg0Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarR = u291.r(nim0Var, 80.0f);
                boolean z2 = plg0Var instanceof nlg0;
                nlg0 nlg0Var = z2 ? (nlg0) plg0Var : null;
                Uri uri = (nlg0Var == null || (str2 = nlg0Var.a.c) == null) ? Uri.EMPTY : Uri.parse(str2);
                uri.getClass();
                nlg0 nlg0Var2 = z2 ? (nlg0) plg0Var : null;
                if (nlg0Var2 == null || (str = nlg0Var2.a.b) == null) {
                    str = "";
                }
                bmq0.a(uri, qim0VarR, (hcx) null, (String) null, str, u7h.j, 0L, false, b0kVar, 12582912, 76);
                break;
            default:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                nlg0 nlg0Var3 = plg0Var instanceof nlg0 ? (nlg0) plg0Var : null;
                byte b2 = 0;
                if (nlg0Var3 == null) {
                    x340 x340Var2 = x340Var;
                    x340Var2.i0(-2014617834);
                    x340Var2.r(false);
                    z = false;
                } else if (nlg0Var3.f) {
                    x340 x340Var3 = x340Var;
                    x340Var3.i0(-2014581167);
                    x340Var3.r(false);
                    z = true;
                } else {
                    x340 x340Var4 = x340Var;
                    x340Var4.i0(-2014559673);
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = v8r.q(Boolean.FALSE);
                        x340Var4.s0(objT);
                    }
                    ven0 ven0Var = (ven0) objT;
                    boolean zI = x340Var4.i(ven0Var);
                    Object objT2 = x340Var4.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new hj6(ven0Var, null, (byte) 13);
                        x340Var4.s0(objT2);
                    }
                    qxd0.t(rih1Var, x340Var4, (vu30) objT2);
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    x340Var4.r(false);
                    z = zBooleanValue;
                }
                qim0 qim0VarR2 = u291.r(nim0Var, 80.0f);
                uwr uwrVar = cbx.a;
                fq7.g(z, qim0VarR2, xay.e(2, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6)), null, null, apo.r(791697799, new ylg0(plg0Var, b2), x340Var), x340Var, 196608, 24);
                break;
        }
        return rih1Var;
    }
}
