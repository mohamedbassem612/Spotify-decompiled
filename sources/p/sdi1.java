package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sdi1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rdi1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sdi1(rdi1 rdi1Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = rdi1Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        rdi1 rdi1Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new uyh1(iu30Var, (byte) 17);
                        x340Var2.s0(objT);
                    }
                    rqo1.q(rdi1Var, (Function0) objT, (qim0) null, x340Var2, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(0, (wux) null, apo.r(-304952506, new sdi1(rdi1Var, iu30Var, b2), x340Var4), x340Var4, 3072, 7);
                }
                break;
        }
        return rih1Var;
    }
}
