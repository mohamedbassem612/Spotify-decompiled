package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g8n1 implements qx9 {
    public final /* synthetic */ pz40 a;

    public g8n1(pz40 pz40Var) {
        this.a = pz40Var;
    }

    @Override // p.qx9
    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        jim0 jim0Var = this.a.N0;
        jim0Var.sendMessage(jim0Var.obtainMessage(1, boolValueOf));
    }
}
