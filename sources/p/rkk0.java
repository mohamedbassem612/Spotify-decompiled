package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rkk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rkk0(wj01 wj01Var, Function0 function0, boolean z, int i, int i2) {
        super(2);
        this.d = wj01Var;
        this.e = function0;
        this.b = z;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1 | this.c);
                t3p1.m((fkc1) obj4, (hvj0) obj3, this.b, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(391);
                byte b2 = this.c;
                boolean z = this.b;
                y1a1.e(z, (qim0) obj4, (vu30) obj3, (b0k) obj, iP2, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                byte b3 = this.c;
                fuo1.k((wj01) obj4, (Function0) obj3, this.b, (b0k) obj, iP3, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rkk0(fkc1 fkc1Var, hvj0 hvj0Var, boolean z, int i) {
        super(2);
        this.d = fkc1Var;
        this.e = hvj0Var;
        this.b = z;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rkk0(boolean z, qim0 qim0Var, vu30 vu30Var, int i, int i2) {
        super(2);
        this.b = z;
        this.d = qim0Var;
        this.e = vu30Var;
        this.c = i2;
    }
}
