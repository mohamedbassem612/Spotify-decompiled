package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bu9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ j2i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu9(Function0 function0, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = function0;
        this.c = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.c;
        Function0 function0 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                w3p1.a(function0, j2iVar, b0kVar, czo1.p(49));
                break;
            case 1:
                eso1.d(function0, j2iVar, b0kVar, czo1.p(49));
                break;
            case 2:
                rqt0.g(function0, j2iVar, b0kVar, czo1.p(49));
                break;
            case 3:
                w2g0.h(function0, j2iVar, b0kVar, czo1.p(49));
                break;
            default:
                ud11.a(function0, j2iVar, b0kVar, czo1.p(49));
                break;
        }
        return rih1Var;
    }
}
