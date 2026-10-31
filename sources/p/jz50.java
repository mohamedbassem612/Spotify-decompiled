package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jz50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kz50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jz50(kz50 kz50Var, byte b) {
        super(2);
        this.a = b;
        this.b = kz50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kz50 kz50Var = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ven0 ven0VarH = rwq.h((bpb1) kz50Var.g, x340Var2, 0);
                    ven0 ven0VarH2 = rwq.h((bpb1) kz50Var.h, x340Var2, 0);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        obj3 = objT;
                        y11 y11Var = new y11(kz50Var, (byte) 12);
                        x340Var2.s0(y11Var);
                        obj3 = y11Var;
                    }
                    obj3 = objT;
                    ila0.j((dbp) kz50Var.f, (cce) kz50Var.b, (q9l1) kz50Var.e, (z0i) ven0VarH.getValue(), (Consumer) obj3, ((Boolean) ven0VarH2.getValue()).booleanValue(), (qim0) null, (erl1) null, x340Var2, 0, 192);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    mod.c(new ely0[]{ef.a.a((pe) kz50Var.d), oi7.a.a((gw70) kz50Var.c)}, apo.r(1921155951, new jz50(kz50Var, z ? 1 : 0), x340Var4), x340Var4, 56);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-744399185, new jz50(kz50Var, b2), x340Var6), x340Var6, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
