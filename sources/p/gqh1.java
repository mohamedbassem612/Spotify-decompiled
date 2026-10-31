package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gqh1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xq81 b;
    public final /* synthetic */ eqh1 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqh1(xq81 xq81Var, eqh1 eqh1Var, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xq81Var;
        this.c = eqh1Var;
        this.d = function0;
        this.e = function1;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                Function0 function0 = this.e;
                int iP = czo1.p(1);
                this.b.a(this.c, this.d, function0, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                Function0 function1 = this.e;
                int iP2 = czo1.p(1);
                this.b.b(this.c, this.d, function1, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
