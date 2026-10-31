package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m3p implements v7l1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ m3p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.v7l1
    public final a8l1 b(iac0 iac0Var, Function0 function0, Function0 function1, Function0 function2) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new a8l1((l6k1) ((jly0) ((s3p) ((b2p) r7qVar).c).g).get(), iac0Var, function0, function1, function2);
            case 1:
                return new a8l1((l6k1) ((d4p) ((b2p) r7qVar).c).E.get(), iac0Var, function0, function1, function2);
            case 2:
                return new a8l1((l6k1) ((nwp) ((gbp) r7qVar).c).j1.get(), iac0Var, function0, function1, function2);
            case 3:
                return new a8l1((l6k1) ((thq) r7qVar).c.E9.get(), iac0Var, function0, function1, function2);
            default:
                return new a8l1((l6k1) r7qVar.d.Fa.get(), iac0Var, function0, function1, function2);
        }
    }
}
