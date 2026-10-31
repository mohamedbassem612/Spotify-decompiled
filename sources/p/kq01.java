package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kq01 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ eq01 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kq01(eq01 eq01Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = eq01Var;
        this.c = function0;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        Function0 function0 = this.c;
        eq01 eq01Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                wwo1.j(eq01Var, function0, b0kVar, czo1.p(b2 | 1));
                break;
            default:
                wwo1.j(eq01Var, function0, b0kVar, czo1.p(b2 | 1));
                break;
        }
        return rih1Var;
    }
}
