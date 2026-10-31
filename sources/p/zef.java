package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zef implements nku {
    public final /* synthetic */ iac0 a;
    public final /* synthetic */ it0 b;
    public final /* synthetic */ uff c;

    public zef(iac0 iac0Var, it0 it0Var, uff uffVar) {
        this.a = iac0Var;
        this.b = it0Var;
        this.c = uffVar;
    }

    @Override // p.nku
    public final void dispose() {
        this.a.getLifecycle().d(this.b);
        this.c.G.a();
    }
}
