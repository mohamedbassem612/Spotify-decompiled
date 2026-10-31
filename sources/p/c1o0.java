package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c1o0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1o0(res resVar, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = resVar;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        res resVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                resVar.h(function0, b0kVar, czo1.p(1));
                break;
            default:
                resVar.j(function0, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
