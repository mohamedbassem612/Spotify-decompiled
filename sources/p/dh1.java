package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dh1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ yg1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh1(tob1 tob1Var, yg1 yg1Var, byte b) {
        super(2);
        this.a = b;
        this.b = tob1Var;
        this.c = yg1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yg1 yg1Var = this.c;
        tob1 tob1Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    fq7.g(((Boolean) tob1Var.getValue()).booleanValue(), (qim0) null, (bby) null, (ln00) null, (String) null, apo.r(356309551, new ch1(yg1Var, (byte) 0), x340Var2), x340Var2, 196608, 30);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    uwr uwrVar = cbx.a;
                    bzn1.e((qim0) null, apo.r(136780119, new dh1(tob1Var, yg1Var, b2), x340Var4), false, (vu30) null, new qgr0(cbx.a(x340Var4).a.c), (ngr0) null, (ygr0) null, (Function0) null, x340Var4, 48, 237);
                }
                break;
        }
        return rih1Var;
    }
}
