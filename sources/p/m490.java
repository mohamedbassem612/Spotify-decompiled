package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m490 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ w9i1 c;
    public final /* synthetic */ Function0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m490(iu30 iu30Var, w9i1 w9i1Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = w9i1Var;
        this.d = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.d;
        w9i1 w9i1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new l490(w9i1Var, function0, (byte) 0));
                break;
            default:
                iu30Var.invoke(new l490(w9i1Var, function0, (byte) 1));
                break;
        }
        return rih1Var;
    }
}
