package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ri81 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ ti81 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri81(pt ptVar, ti81 ti81Var, Function0 function0, Function0 function1, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ptVar;
        this.c = ti81Var;
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
                int iP = czo1.p(9);
                this.b.l(this.c, this.d, function0, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                Function0 function1 = this.e;
                int iP2 = czo1.p(9);
                this.b.r(this.c, this.d, function1, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
