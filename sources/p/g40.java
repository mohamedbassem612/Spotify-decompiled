package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g40 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i40 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g40(i40 i40Var, byte b) {
        super(0);
        this.a = b;
        this.b = i40Var;
    }

    public final Object invoke() {
        byte b = this.a;
        i40 i40Var = this.b;
        switch (b) {
            case 0:
                return new xgx0(i40Var.b, 1);
            case 1:
                return new xho(i40Var.a);
            default:
                return i40Var.c.e();
        }
    }
}
