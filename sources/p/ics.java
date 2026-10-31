package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ics implements rjo0, o691, q691, ias0, y560 {
    public final i8h1 a;
    public final g5l0 b = new g5l0(nik1.N2.a, (byte) 22);

    public ics(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    @Override // p.rjo0
    public final boolean a(String str) {
        return str.equals("default");
    }

    @Override // p.y560
    public final tv80 c(String str) {
        return this.a.m(this.b.l("").k().i(str), null);
    }

    @Override // p.y560
    public final tv80 d(String str) {
        return this.a.m(this.b.l("").k().e(str), null);
    }

    @Override // p.ias0
    public final void f(String str, String str2) {
        this.a.m(this.b.l(str).r().h(str2), null);
    }

    @Override // p.o691
    public final String g(String str, String str2, fvf1 fvf1Var) {
        return this.a.m(this.b.l(str).y().k(Integer.valueOf((int) fvf1Var.b()), str2, Integer.valueOf((int) fvf1Var.a())), null).a.a;
    }

    @Override // p.ias0
    public final void h(String str, String str2) {
        this.a.m(this.b.l(str).r().j(str2), null);
    }

    @Override // p.q691
    public final void i(String str, String str2, fvf1 fvf1Var) {
        this.a.m(this.b.l(str).C().l(Integer.valueOf((int) fvf1Var.b()), str2, Integer.valueOf((int) fvf1Var.a())), null);
    }
}
