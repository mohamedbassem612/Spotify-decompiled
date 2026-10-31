package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n9c implements b8l1 {
    public final /* synthetic */ byte a;
    public final v7l1 b;
    public final kly0 c;

    public /* synthetic */ n9c(v7l1 v7l1Var, jly0 jly0Var, byte b) {
        this.a = b;
        this.b = v7l1Var;
        this.c = jly0Var;
    }

    public final a8l1 a(iac0 iac0Var, Function0 function0, Function0 function1) {
        switch (this.a) {
            case 0:
                return v7l1.a(this.b, iac0Var, function0, function1, new ptb(this, (byte) 5), 16);
            default:
                return v7l1.a(this.b, iac0Var, function0, function1, new ots(this, (byte) 21), 16);
        }
    }
}
