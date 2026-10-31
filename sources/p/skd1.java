package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class skd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wck b;
    public final /* synthetic */ u7h c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ skd1(wck wckVar, u7h u7hVar, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = wckVar;
        this.c = u7hVar;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        u7h u7hVar = this.c;
        wck wckVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                vyo1.p(wckVar, u7hVar, function0, b0kVar, czo1.p(1));
                break;
            default:
                vyo1.p(wckVar, u7hVar, function0, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
