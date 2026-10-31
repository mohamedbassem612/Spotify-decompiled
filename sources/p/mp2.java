package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mp2 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fq2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp2(fq2 fq2Var, byte b) {
        super(1);
        this.a = b;
        this.b = fq2Var;
    }

    public final Object invoke(Object obj) {
        Object value;
        l680 k680Var;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                String str = (String) obj;
                bpb1 bpb1Var = this.b.B;
                do {
                    value = bpb1Var.getValue();
                    k680Var = (l680) value;
                    k680 k680Var2 = k680Var instanceof k680 ? (k680) k680Var : null;
                    if (k680Var2 != null) {
                        k680Var = new k680(k680Var2.a, k680Var2.b, str, k680Var2.d);
                    }
                } while (!bpb1Var.k(value, k680Var));
                break;
            default:
                this.b.I = null;
                if (((Throwable) obj) instanceof CancellationException) {
                    this.b.B.l((Object) null);
                }
                break;
        }
        return rih1.a;
    }
}
