package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fcv extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fcv(d4 d4Var, byte b) {
        super(0);
        this.a = b;
        this.b = d4Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d4 d4Var = this.b;
        switch (b) {
            case 0:
                d4Var.invoke(dcv.a);
                break;
            default:
                d4Var.invoke(dcv.b);
                break;
        }
        return rih1Var;
    }
}
