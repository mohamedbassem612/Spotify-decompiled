package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h14 implements wu91 {
    public final /* synthetic */ t24 a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ g14 c;

    public h14(t24 t24Var, iu30 iu30Var, g14 g14Var) {
        this.a = t24Var;
        this.b = iu30Var;
        this.c = g14Var;
    }

    @Override // p.wu91
    public final float a(float f) {
        t24 t24Var = this.a;
        float fG = t24Var.g();
        Object objQ = wm5.q(t24Var.c(), fG, f, this.b, this.c);
        if (!((Boolean) t24Var.a.invoke(objQ)).booleanValue()) {
            objQ = t24Var.h.getValue();
        }
        return t24Var.c().f(objQ) - fG;
    }

    @Override // p.wu91
    public final float b(float f, float f2) {
        return 0.0f;
    }
}
