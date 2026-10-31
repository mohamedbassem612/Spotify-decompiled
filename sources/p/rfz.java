package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rfz extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfz(Function0 function0, Function0 function1, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.c = function0;
        this.d = function1;
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
                ern1.e(czo1.p(1), this.c, this.d, (b0k) obj, this.e, z);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                o1p1.m(czo1.p(1), this.c, this.d, (b0k) obj, qim0Var, this.b);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfz(boolean z, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.b = z;
        this.c = function0;
        this.d = function1;
        this.e = qim0Var;
    }
}
