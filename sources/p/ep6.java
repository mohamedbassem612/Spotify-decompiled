package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ep6 implements tyq {
    public final d0r a;
    public final sqa0 b;
    public final o3r c = w3p1.o(new l4r(new wlu(rc11.a.b(jo70.class)), 1, gn6.t, new j4r(gn6.h), gn6.X), gn6.i);
    public final js20 d = x3p1.n(new dp6(this, (byte) 0), new tsm1(this, (byte) 26), new bom1(this, (byte) 24), (o8n) null, new dp6(this, (byte) 1), 8);
    public final ia00 e = n3o1.q(this).a(oy5.P0, oy5.Q0);
    public final psw f;

    public ep6(d0r d0rVar, sqa0 sqa0Var) {
        this.a = d0rVar;
        this.b = sqa0Var;
        j2i j2iVar = x6i.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public static cp6 f(bp6 bp6Var, k1r k1rVar) {
        int i;
        boolean z = k1rVar instanceof i1r;
        i1r i1rVar = z ? (i1r) k1rVar : null;
        jo70 jo70Var = i1rVar != null ? (jo70) i1rVar.a : null;
        String str = bp6Var.a;
        String str2 = jo70Var != null ? jo70Var.a : null;
        if (str2 == null) {
            str2 = "";
        }
        if (k1rVar.equals(j1r.a)) {
            i = 1;
        } else if (z) {
            i = 2;
        } else {
            if (!(k1rVar instanceof h1r)) {
                eg.o();
                return null;
            }
            i = 3;
        }
        return new cp6(i, str, str2, bp6Var.b);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.d;
    }

    public final f4r getData() {
        return this.c;
    }
}
