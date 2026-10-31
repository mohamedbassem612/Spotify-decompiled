package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wgr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ sgr0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wgr0(boolean z, Function0 function0, sgr0 sgr0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.d = sgr0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        sgr0 sgr0Var = this.d;
        Function0 function0 = this.c;
        boolean z = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                bzn1.h(z, function0, sgr0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                bzn1.h(z, function0, sgr0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
