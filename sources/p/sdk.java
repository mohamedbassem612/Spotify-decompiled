package p;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sdk extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tdk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sdk(tdk tdkVar, byte b) {
        super(0);
        this.a = b;
        this.b = tdkVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tdk tdkVar = this.b;
        switch (b) {
            case 0:
                tck tckVar = tdkVar.Z;
                hrr0 hrr0Var = (hrr0) tckVar.k;
                sck sckVar = (sck) hrr0Var.getValue();
                if (sckVar != null) {
                    hrr0Var.setValue((Object) null);
                    String str = sckVar.a;
                    xab1 xab1Var = (xab1) tckVar.l;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    tckVar.l = fn31.T(cto1.q((iac0) tckVar.g), (o8n) null, 0, new bag(tckVar, str, null, (byte) 26), 3);
                }
                break;
            default:
                ((hrr0) tdkVar.Z.k).setValue((Object) null);
                break;
        }
        return rih1Var;
    }
}
