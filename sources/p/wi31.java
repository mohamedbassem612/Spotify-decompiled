package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wi31 implements ni31 {
    public final String a;
    public final t45 b;

    public wi31(String str, t45 t45Var) {
        this.a = str;
        this.b = t45Var;
    }

    @Override // p.ni31
    public final Object a(String str, si31 si31Var, ri31 ri31Var) {
        return t4n1.v(this.b, f4i1.f(this.a, "-font_loading-", str), si31Var, ri31Var);
    }

    @Override // p.ni31
    public final Object b(String str, ob01 ob01Var, elu0 elu0Var) {
        return t4n1.v(this.b, f4i1.f(this.a, "-image_loading-", str), ob01Var, elu0Var);
    }

    @Override // p.ni31
    public final Object c(ob01 ob01Var, pi31 pi31Var) {
        return t4n1.v(this.b, this.a.concat("-download"), ob01Var, pi31Var);
    }
}
