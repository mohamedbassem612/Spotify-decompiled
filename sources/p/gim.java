package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gim extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ him b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gim(him himVar, byte b) {
        super(2);
        this.a = b;
        this.b = himVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        him himVar = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    cfm cfmVar = himVar.b;
                    String str = himVar.f.a;
                    ve01 ve01Var = (ve01) himVar.h.f;
                    boolean zI = x340Var2.i(himVar);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        fim fimVar = new fim(himVar, (byte) 1);
                        x340Var2.s0(fimVar);
                        obj3 = fimVar;
                    }
                    Function0 function0 = (Function0) obj3;
                    boolean zI2 = x340Var2.i(himVar);
                    Object objT2 = x340Var2.T();
                    Object obj4 = objT2;
                    if (zI2 || objT2 == m4cVar) {
                        fim fimVar2 = new fim(himVar, (byte) 2);
                        x340Var2.s0(fimVar2);
                        obj4 = fimVar2;
                    }
                    otw.c(cfmVar, new jem(str, ve01Var, function0, (Function0) obj4), (qim0) null, (ipb1) null, x340Var2, 64, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    kiv kivVar = vvx.a;
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var4).b;
                    mod.b(kivVar.a(new uvx(0, (pgx) null, 0, (vzq0) null, uyn1.h(2, 4.0f, 0.0f), (tvx) null, (hw61) null, 0, (p3v) null, 495)), apo.r(-924874803, new gim(himVar, z ? 1 : 0), x340Var4), x340Var4, 56);
                }
                break;
        }
        return rih1Var;
    }
}
