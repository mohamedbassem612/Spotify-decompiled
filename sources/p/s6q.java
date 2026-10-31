package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s6q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ s6q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final rng1 a(iac0 iac0Var) {
        byte b = this.a;
        thq thqVar = this.b;
        switch (b) {
            case 0:
                daq daqVar = ((r7q) thqVar).b;
                return new rng1(iac0Var, (xm41) daqVar.l5.get(), (uu00) daqVar.a5.get());
            default:
                daq daqVar2 = thqVar.b;
                return new rng1(iac0Var, (xm41) daqVar2.l5.get(), (uu00) daqVar2.a5.get());
        }
    }
}
