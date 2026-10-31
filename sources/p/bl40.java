package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bl40 implements ppb1 {
    public final ppi1 a;
    public final bsd1 b;

    public bl40(ppi1 ppi1Var, bsd1 bsd1Var) {
        this.a = ppi1Var;
        this.b = bsd1Var;
    }

    @Override // p.ppb1
    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    @Override // p.ppb1
    public final boolean b(s19 s19Var) {
        if (s19Var.b != 4 || this.a.a(s19Var)) {
            return false;
        }
        ix7 ix7VarA = f19.a();
        ix7VarA.y(s19Var.c);
        ix7VarA.A(s19Var.e);
        ix7VarA.z(s19Var.f);
        this.b.b(ix7VarA.h());
        return true;
    }
}
