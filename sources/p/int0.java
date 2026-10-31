package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class int0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ el9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ int0(el9 el9Var, byte b) {
        super(0);
        this.a = b;
        this.b = el9Var;
    }

    public final Object invoke() {
        byte b = this.a;
        el9 el9Var = this.b;
        switch (b) {
            case 0:
                return ycm.a((ycm) el9Var.g);
            default:
                return ((myq0) el9Var.h).e();
        }
    }
}
