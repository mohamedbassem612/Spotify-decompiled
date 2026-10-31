package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wt00 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt00(int i, int i2, int i3, Function0 function0, int i4) {
        super(2);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                int i = this.b;
                int i2 = this.c;
                int i3 = this.d;
                yoi1.c(i, i2, i3, (Function0) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(this.d | 1);
                rjo1.k(this.b, this.c, iP2, (b0k) obj, (qim0) obj3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt00(int i, int i2, int i3, qim0 qim0Var) {
        super(2);
        this.b = i;
        this.c = i2;
        this.e = qim0Var;
        this.d = i3;
    }
}
