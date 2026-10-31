package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fzp implements rsm0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ fzp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.rsm0
    public final ssm0 a(iac0 iac0Var, bbr0 bbr0Var, Function0 function0, b7r0 b7r0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new ssm0((u1r0) ((yxo) ((p2p) r7qVar).d).U0.get(), iac0Var, bbr0Var, function0, b7r0Var);
            case 1:
                return new ssm0((u1r0) ((o0q) ((p2p) r7qVar).d).b1.get(), iac0Var, bbr0Var, function0, b7r0Var);
            case 2:
                return new ssm0((u1r0) ((v5q) ((thq) r7qVar).c).S2.get(), iac0Var, bbr0Var, function0, b7r0Var);
            case 3:
                return new ssm0((u1r0) ((s7q) r7qVar.d).U9.get(), iac0Var, bbr0Var, function0, b7r0Var);
            case 4:
                return new ssm0((u1r0) ((yxo) ((obq) r7qVar).d).X0.get(), iac0Var, bbr0Var, function0, b7r0Var);
            default:
                return new ssm0((u1r0) r7qVar.d.S0.get(), iac0Var, bbr0Var, function0, b7r0Var);
        }
    }
}
