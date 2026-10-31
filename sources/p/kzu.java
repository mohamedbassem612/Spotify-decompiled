package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kzu extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzu(float f, Float f2, hzu hzuVar, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.b = f;
        this.e = f2;
        this.f = hzuVar;
        this.c = z;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.d;
                int iP = czo1.p(1);
                float f = this.b;
                d9y0.b(f, (Float) obj4, (hzu) obj3, this.c, qim0Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.d;
                int iP2 = czo1.p(1);
                float f2 = this.b;
                boolean z = this.c;
                tm80.b((y7e1) obj4, f2, z, (Function0) obj3, qim0Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzu(y7e1 y7e1Var, float f, boolean z, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.e = y7e1Var;
        this.b = f;
        this.c = z;
        this.f = function0;
        this.d = qim0Var;
    }
}
