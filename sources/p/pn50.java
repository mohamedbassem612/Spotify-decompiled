package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pn50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ jtl1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn50(jtl1 jtl1Var, Function0 function0, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.c = jtl1Var;
        this.d = function0;
        this.e = qim0Var;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                boolean z = this.b;
                grn1.e(czo1.p(1), this.d, (b0k) obj, this.e, this.c, z);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                n1p1.e(czo1.p(1), this.d, (b0k) obj, qim0Var, this.c, this.b);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn50(boolean z, jtl1 jtl1Var, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.b = z;
        this.c = jtl1Var;
        this.d = function0;
        this.e = qim0Var;
    }
}
