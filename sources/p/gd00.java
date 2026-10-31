package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gd00 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gd00(hd00 hd00Var, byte b) {
        super(0);
        this.a = b;
        this.b = hd00Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hd00 hd00Var = this.b;
        switch (b) {
            case 0:
                hd00Var.e.a(hd00Var);
                break;
            default:
                hd00Var.e.d(hd00Var);
                break;
        }
        return rih1Var;
    }
}
