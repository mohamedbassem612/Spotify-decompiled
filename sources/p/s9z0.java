package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s9z0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p9z0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ vu30 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9z0(p9z0 p9z0Var, Function0 function0, vu30 vu30Var, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = p9z0Var;
                this.c = function0;
                this.d = vu30Var;
                this.e = i;
                super(2);
                break;
            default:
                this.b = p9z0Var;
                this.c = function0;
                this.d = vu30Var;
                this.e = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        vu30 vu30Var = this.d;
        Function0 function0 = this.c;
        p9z0 p9z0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ijo1.a(p9z0Var, function0, vu30Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                ijo1.l(p9z0Var, function0, vu30Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
