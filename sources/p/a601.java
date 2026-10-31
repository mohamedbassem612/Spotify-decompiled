package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a601 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e601 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a601(e601 e601Var, byte b) {
        super(0);
        this.a = b;
        this.b = e601Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        e601 e601Var = this.b;
        switch (b) {
            case 0:
                e601Var.b.j(0, "all");
                e601Var.g.invoke(new z401(0));
                break;
            case 1:
                e601Var.g.invoke(v401.a);
                break;
            default:
                e601Var.g.invoke(t401.a);
                break;
        }
        return rih1Var;
    }
}
