package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o4q {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ o4q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final g9s a(paj0 paj0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new g9s((q8n) ((thq) r7qVar).b.V2.get(), paj0Var);
            case 1:
                return new g9s((q8n) r7qVar.b.V2.get(), paj0Var);
            case 2:
                return new g9s((q8n) ((obq) r7qVar).b.V2.get(), paj0Var);
            default:
                return new g9s((q8n) r7qVar.b.V2.get(), paj0Var);
        }
    }
}
