package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l521 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l2v0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ r6h1 d;
    public final /* synthetic */ ohd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l521(l2v0 l2v0Var, String str, r6h1 r6h1Var, ohd ohdVar, byte b) {
        super(0);
        this.a = b;
        this.b = l2v0Var;
        this.c = str;
        this.d = r6h1Var;
        this.e = ohdVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ohd ohdVar = this.e;
        r6h1 r6h1Var = this.d;
        l2v0 l2v0Var = this.b;
        String str = this.c;
        switch (b) {
            case 0:
                pvc.m(str, r6h1Var);
                p421 p421Var = (p421) l2v0Var.g;
                if (p421Var != null) {
                    p421Var.b(str);
                }
                ohdVar.resumeWith(Boolean.TRUE);
                break;
            default:
                p421 p421Var2 = (p421) l2v0Var.g;
                if (p421Var2 != null) {
                    p421Var2.b(str);
                }
                pvc.m(str, r6h1Var);
                ohdVar.resumeWith(Boolean.TRUE);
                break;
        }
        return rih1Var;
    }
}
