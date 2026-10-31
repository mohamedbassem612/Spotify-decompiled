package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a14 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b14 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a14(b14 b14Var, byte b) {
        super(0);
        this.a = b;
        this.b = b14Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b14 b14Var = this.b;
        switch (b) {
            case 0:
                ((iu30) b14Var.b).invoke(s04.b);
                break;
            default:
                ((iu30) b14Var.b).invoke(s04.a);
                break;
        }
        return rih1Var;
    }
}
