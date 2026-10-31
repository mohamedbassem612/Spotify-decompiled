package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hu2 implements pzf0 {
    public final ynb0 a;
    public final ynb0 b;
    public final mr4 c;
    public final idd1 d = new idd1(new q30(this, (byte) 3));

    public hu2(ynb0 ynb0Var, ynb0 ynb0Var2, mr4 mr4Var) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = mr4Var;
    }

    public final zob1 a(Object obj) {
        fu2 fu2Var = (fu2) obj;
        mr4 mr4Var = this.c;
        if (!mr4Var.n()) {
            return gio1.b((Object) null);
        }
        yo2 yo2Var = (yo2) this.a.get();
        return d3p1.w(((fq2) yo2Var).y, new fu(yo2Var, fu2Var, mr4Var.m() ? 1 : 2, this, (byte) 1));
    }
}
