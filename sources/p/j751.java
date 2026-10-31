package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j751 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ b851 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j751(xtb0 xtb0Var, b851 b851Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = xtb0Var;
        this.c = b851Var;
        this.d = function0;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Function0 function0 = this.d;
        b851 b851Var = this.c;
        xtb0 xtb0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                w0o1.f(xtb0Var, b851Var, function0, b0kVar, czo1.p(i | 1));
                break;
            default:
                w0o1.f(xtb0Var, b851Var, function0, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
