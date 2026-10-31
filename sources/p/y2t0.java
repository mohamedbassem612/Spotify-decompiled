package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y2t0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2t0(int i, int i2, Function0 function0, Function0 function1, qim0 qim0Var, boolean z) {
        super(2);
        this.b = i;
        this.c = z;
        this.d = function0;
        this.e = qim0Var;
        this.f = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                two1.k(czo1.p(i | 1), this.d, this.f, (b0k) obj, this.e, this.c);
                break;
            case 1:
                ((Number) obj2).intValue();
                Function0 function0 = this.f;
                int iP = czo1.p(1);
                rqg0.n(this.b, iP, this.d, function0, (b0k) obj, this.e, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                p1p1.p(czo1.p(i | 1), this.d, this.f, (b0k) obj, this.e, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2t0(boolean z, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.c = z;
        this.d = function0;
        this.f = function1;
        this.e = qim0Var;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2t0(boolean z, Function0 function0, qim0 qim0Var, Function0 function1, int i) {
        super(2);
        this.c = z;
        this.d = function0;
        this.e = qim0Var;
        this.f = function1;
        this.b = i;
    }
}
