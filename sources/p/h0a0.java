package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h0a0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0a0(int i, int i2, int i3, Function0 function0, qim0 qim0Var) {
        super(2);
        this.b = i;
        this.c = i2;
        this.e = qim0Var;
        this.f = function0;
        this.d = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                int i2 = this.b;
                int i3 = this.c;
                cev0.p(i2, i3, iP, (Function0) obj3, (b0k) obj, (qim0) obj4);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                zc01.g((sb01) obj4, (hc01) obj3, this.b, this.c, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0a0(sb01 sb01Var, hc01 hc01Var, int i, int i2, int i3) {
        super(2);
        this.e = sb01Var;
        this.f = hc01Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
