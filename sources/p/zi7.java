package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zi7 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dj7 b;
    public final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zi7(dj7 dj7Var, Throwable th, byte b) {
        super(0);
        this.a = b;
        this.b = dj7Var;
        this.c = th;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Throwable th = this.c;
        dj7 dj7Var = this.b;
        switch (b) {
            case 0:
                dj7Var.d.add(th);
                break;
            default:
                dj7Var.a.c(th);
                break;
        }
        return rih1Var;
    }
}
