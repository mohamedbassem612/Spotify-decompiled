package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class on40 implements ppb1 {
    public final bsd1 a;

    public on40(bsd1 bsd1Var) {
        this.a = bsd1Var;
    }

    @Override // p.ppb1
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // p.ppb1
    public final boolean b(s19 s19Var) {
        int i = s19Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.a.d(s19Var.a);
        return true;
    }
}
