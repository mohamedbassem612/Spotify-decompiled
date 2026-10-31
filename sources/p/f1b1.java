package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f1b1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1b1(boolean z, float f, Function0 function0, Function0 function1, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = f;
        this.d = function0;
        this.e = function1;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                int iP = czo1.p(1);
                nmn1.h(this.b, this.c, this.d, this.e, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.f;
                int iP2 = czo1.p(1);
                nmn1.h(this.b, this.c, this.d, this.e, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
