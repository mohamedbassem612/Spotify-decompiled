package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jt90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ouz b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt90(ouz ouzVar, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ouzVar;
        this.c = function0;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        Function0 function0 = this.c;
        ouz ouzVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ouzVar.c(function0, b0kVar, czo1.p(i | 1));
                break;
            default:
                ouzVar.j(function0, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
