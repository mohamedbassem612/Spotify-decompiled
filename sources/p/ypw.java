package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ypw implements sp80 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uqw b;

    public ypw(int i, uqw uqwVar) {
        this.a = i;
        this.b = uqwVar;
    }

    @Override // p.sp80
    public final boolean a() {
        return false;
    }

    @Override // p.sp80
    public final op80 b(op80 op80Var) {
        mp80 k3h1Var = new k3h1(this.a);
        uqw uqwVar = this.b;
        return j6p1.k(k3h1Var, (op80) uqwVar.i.invoke(uqwVar.c, op80Var));
    }
}
