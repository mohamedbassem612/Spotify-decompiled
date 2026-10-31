package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m521 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r6h1 b;
    public final /* synthetic */ ohd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m521(l2v0 l2v0Var, r6h1 r6h1Var, ohd ohdVar, byte b) {
        super(0);
        this.a = b;
        this.b = r6h1Var;
        this.c = ohdVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ohd ohdVar = this.c;
        r6h1 r6h1Var = this.b;
        switch (b) {
            case 0:
                pvc.k(r6h1Var);
                ohdVar.resumeWith(Boolean.FALSE);
                break;
            default:
                pvc.k(r6h1Var);
                ohdVar.resumeWith(Boolean.FALSE);
                break;
        }
        return rih1Var;
    }
}
