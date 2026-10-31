package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rtw extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ttw b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jsw d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ d75 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rtw(ttw ttwVar, boolean z, jsw jswVar, iu30 iu30Var, d75 d75Var, byte b) {
        super(2);
        this.a = b;
        this.b = ttwVar;
        this.c = z;
        this.d = jswVar;
        this.e = iu30Var;
        this.f = d75Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                ttw ttwVar = this.b;
                ven0 ven0VarC = b2p1.C((kdn0) ttwVar.b, x340Var2);
                ven0 ven0VarC2 = b2p1.C((kdn0) ttwVar.c, x340Var2);
                ven0 ven0VarC3 = b2p1.C((kdn0) ttwVar.d, x340Var2);
                ven0 ven0VarC4 = b2p1.C((kdn0) ttwVar.e, x340Var2);
                Object value = ven0VarC.getValue();
                if (value == null) {
                    x340Var2.i0(1147185332);
                    x340Var2.r(false);
                    return rih1Var;
                }
                x340Var2.i0(1147185333);
                if (((String) ven0VarC3.getValue()) == null) {
                    eg.m("A non null reuse id should be passed from ElementViewHolder. Reach out to #blink to investigate this");
                } else {
                    if (((Function0) ven0VarC2.getValue()) != null) {
                        j2i j2iVarR = apo.r(-2084976441, new k40((Object) this.d, value, this.e, (Object) this.f, ven0VarC2, ven0VarC3, (byte) 25), x340Var2);
                        if (!this.c || ((ipb1) ven0VarC4.getValue()) == null) {
                            x340Var2.i0(906658153);
                            j2iVarR.invoke(x340Var2, 6);
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(906560286);
                            ipb1 ipb1Var = (ipb1) ven0VarC4.getValue();
                            ipb1Var.getClass();
                            String str = (String) ven0VarC3.getValue();
                            str.getClass();
                            otw.e(ipb1Var, str, j2iVarR, x340Var2, 384);
                            x340Var2.r(false);
                        }
                        x340Var2.r(false);
                        return rih1Var;
                    }
                    eg.m("A non null store provider id should be passed from ElementViewHolder. Reach out to #blink to investigate this");
                }
                return null;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(1486719130, new rtw(this.b, this.c, this.d, this.e, this.f, (byte) 0), x340Var4), x340Var4, 3078, 6);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    dio1.f(48, apo.r(1592787917, new rtw(this.b, this.c, this.d, this.e, this.f, (byte) 1), x340Var6), x340Var6, (qim0) null);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
