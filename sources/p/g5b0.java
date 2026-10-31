package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g5b0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ koc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5b0(koc0 koc0Var, byte b) {
        super(1);
        this.a = b;
        this.b = koc0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        koc0 koc0Var = this.b;
        switch (b) {
            case 0:
                return new x72(((roc0) koc0Var).c(), (byte) 29);
            case 1:
                return new j5b0(((roc0) koc0Var).d(), (byte) 0);
            case 2:
                return new j5b0(((roc0) koc0Var).d(), (byte) 1);
            case 3:
                return new x880(((roc0) koc0Var).c(), (Set) obj, (byte) 17);
            default:
                return rqt0.u(new kr41(((roc0) koc0Var).d(), (byte) 9));
        }
    }
}
