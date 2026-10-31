package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h4s extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ faa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4s(faa0 faa0Var, byte b) {
        super(1);
        this.a = b;
        this.b = faa0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        faa0 faa0Var = this.b;
        switch (b) {
            case 0:
                faa0Var.d(new CancellationException("Reaction login session ended"));
                break;
            default:
                faa0Var.d((CancellationException) null);
                break;
        }
        return rih1Var;
    }
}
