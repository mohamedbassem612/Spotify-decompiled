package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gzp implements u1r0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ gzp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.u1r0
    public final pbq a(iac0 iac0Var, bbr0 bbr0Var, Function0 function0, b7r0 b7r0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = (daq) ((p2p) r7qVar).c;
                return new pbq((msm0) daqVar.t9.get(), (iu30) daqVar.um.get(), iac0Var, bbr0Var, function0, b7r0Var);
            case 1:
                daq daqVar2 = (daq) ((p2p) r7qVar).c;
                return new pbq((msm0) daqVar2.t9.get(), (iu30) daqVar2.um.get(), iac0Var, bbr0Var, function0, b7r0Var);
            case 2:
                daq daqVar3 = ((thq) r7qVar).b;
                return new pbq((msm0) daqVar3.t9.get(), (iu30) daqVar3.um.get(), iac0Var, bbr0Var, function0, b7r0Var);
            case 3:
                daq daqVar4 = r7qVar.b;
                return new pbq((msm0) daqVar4.t9.get(), (iu30) daqVar4.um.get(), iac0Var, bbr0Var, function0, b7r0Var);
            case 4:
                daq daqVar5 = ((obq) r7qVar).b;
                return new pbq((msm0) daqVar5.t9.get(), (iu30) daqVar5.um.get(), iac0Var, bbr0Var, function0, b7r0Var);
            default:
                daq daqVar6 = r7qVar.b;
                return new pbq((msm0) daqVar6.t9.get(), (iu30) daqVar6.um.get(), iac0Var, bbr0Var, function0, b7r0Var);
        }
    }
}
