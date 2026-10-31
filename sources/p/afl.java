package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class afl extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uel b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afl(uel uelVar, iu30 iu30Var, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = uelVar;
        this.c = iu30Var;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        iu30 iu30Var = this.c;
        uel uelVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                j541.a(uelVar, iu30Var, function0, b0kVar, czo1.p(1));
                break;
            default:
                j541.a(uelVar, iu30Var, function0, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
