package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vw10 implements rjo0, o691, q691, ias0, y560, e4a {
    public final i8h1 a;
    public final g5l0 b = new g5l0(nik1.N2.a, (byte) 24);

    public vw10(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    @Override // p.rjo0
    public final boolean a(String str) {
        return str.equals("feedback");
    }

    public final void b(String str) {
        this.a.m(this.b.n("").e().e(str), null);
    }

    @Override // p.y560
    public final tv80 c(String str) {
        return this.a.m(this.b.n("").m().j(str), null);
    }

    @Override // p.y560
    public final tv80 d(String str) {
        return this.a.m(this.b.n("").m().h(str), null);
    }

    @Override // p.ias0
    public final void f(String str, String str2) {
        this.a.m(this.b.n(str).t().i(str2), null);
    }

    @Override // p.o691
    public final String g(String str, String str2, fvf1 fvf1Var) {
        return this.a.m(this.b.n(str).A().l(Integer.valueOf((int) fvf1Var.b()), str2, Integer.valueOf((int) fvf1Var.a())), null).a.a;
    }

    @Override // p.ias0
    public final void h(String str, String str2) {
        this.a.m(this.b.n(str).t().k(str2), null);
    }

    @Override // p.q691
    public final void i(String str, String str2, fvf1 fvf1Var) {
        this.a.m(this.b.n(str).E().m(Integer.valueOf((int) fvf1Var.b()), str2, Integer.valueOf((int) fvf1Var.a())), null);
    }
}
