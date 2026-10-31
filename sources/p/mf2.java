package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mf2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf2(Integer num, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, Function0 function2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = num;
        this.c = z;
        this.d = function0;
        this.e = function1;
        this.f = qim0Var;
        this.g = function2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = this.g;
                int iP = czo1.p(1);
                si1.a(this.b, this.c, this.d, this.e, this.f, function0, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                Function0 function1 = this.g;
                int iP2 = czo1.p(1);
                si1.b(this.b, this.c, this.d, this.e, this.f, function1, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
