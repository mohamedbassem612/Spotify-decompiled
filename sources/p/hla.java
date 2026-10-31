package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hla extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hla(p811 p811Var, byte b) {
        super(0);
        this.a = b;
        this.b = p811Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(((mjz0) p811Var.a).a);
            case 1:
                p811Var.a = null;
                return rih1Var;
            case 2:
                p811Var.a = s090.a;
                return rih1Var;
            case 3:
                p811Var.a = r090.a;
                return rih1Var;
            case 4:
                Integer num = (Integer) p811Var.a;
                p811Var.a = Integer.valueOf((num != null ? num.intValue() : 0) + 1);
                return rih1Var;
            default:
                faa0 faa0Var = (faa0) p811Var.a;
                if (faa0Var != null) {
                    faa0Var.d((CancellationException) null);
                }
                return rih1Var;
        }
    }
}
