package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k521 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r6h1 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k521(l2v0 l2v0Var, r6h1 r6h1Var, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = r6h1Var;
        this.c = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        r6h1 r6h1Var = this.b;
        switch (b) {
            case 0:
                pvc.k(r6h1Var);
                function0.invoke();
                break;
            default:
                pvc.k(r6h1Var);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
