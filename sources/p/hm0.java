package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hm0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ hux c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hm0(iu30 iu30Var, hux huxVar, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = huxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hux huxVar = this.c;
        iu30 iu30Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        p1 p1Var = new p1(iu30Var, (byte) 17);
                        x340Var2.s0(p1Var);
                        obj3 = p1Var;
                    }
                    obj3 = objT;
                    wro1.h(new gbx(z50.c, (Function0) obj3), ldx.c, (qim0) null, (max) null, yla.p(x340Var2).a(), (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1768460, new f90(huxVar, (byte) 2), x340Var2), x340Var2, 0, 6, 988);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-2031485707, new hm0(iu30Var, huxVar, z ? 1 : 0), x340Var4), x340Var4, 3078, 6);
                }
                break;
        }
        return rih1Var;
    }
}
