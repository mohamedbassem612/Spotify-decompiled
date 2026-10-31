package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lus extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mus b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lus(mus musVar, byte b) {
        super(0);
        this.a = b;
        this.b = musVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mus musVar = this.b;
        switch (b) {
            case 0:
                iu30 iu30Var = musVar.d;
                if (iu30Var != null) {
                    iu30Var.invoke(musVar);
                }
                break;
            case 1:
                Function0 function0 = musVar.n;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                Function0 function1 = musVar.e;
                if (function1 != null) {
                    function1.invoke();
                }
                break;
        }
        return rih1Var;
    }
}
