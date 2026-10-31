package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jek1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ hek1 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jek1(pt ptVar, Function0 function0, hek1 hek1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ptVar;
        this.c = function0;
        this.d = hek1Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        hek1 hek1Var = this.d;
        Function0 function0 = this.c;
        pt ptVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ptVar.s(function0, hek1Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                ptVar.t(function0, hek1Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
