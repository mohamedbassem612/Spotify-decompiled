package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cu40 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ du40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu40(du40 du40Var, byte b) {
        super(0);
        this.a = b;
        this.b = du40Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        du40 du40Var = this.b;
        switch (b) {
            case 0:
                fn31.T(cto1.q((gj5) du40Var.g), (o8n) null, 0, new bu40(du40Var, null, (byte) 0), 3);
                break;
            default:
                fn31.T(cto1.q((gj5) du40Var.g), (o8n) null, 0, new bu40(du40Var, null, (byte) 1), 3);
                break;
        }
        return rih1Var;
    }
}
