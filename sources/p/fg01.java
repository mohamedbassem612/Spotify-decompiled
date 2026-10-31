package p;

import java.io.Closeable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class fg01 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;

    public /* synthetic */ fg01(p811 p811Var, byte b) {
        this.a = b;
        this.b = p811Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                w4n1.b((Closeable) p811Var.a);
                break;
            default:
                ((Function0) p811Var.a).invoke();
                break;
        }
        return rih1Var;
    }
}
