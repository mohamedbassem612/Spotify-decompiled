package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class gd31 implements htf {
    public final iu30 a;
    public final String b;

    public gd31(String str, iu30 iu30Var) {
        this.a = iu30Var;
        this.b = "must return ".concat(str);
    }

    @Override // p.htf
    public final boolean a(c8a0 c8a0Var) {
        return u890.j(c8a0Var.h, this.a.invoke(kht.e(c8a0Var)));
    }

    @Override // p.htf
    public final /* bridge */ String b(c8a0 c8a0Var) {
        return gxo1.k(this, c8a0Var);
    }

    @Override // p.htf
    public final String getDescription() {
        return this.b;
    }
}
