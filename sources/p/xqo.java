package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xqo implements tha1 {
    public final String a;
    public final xha1 b;
    public final gqm1 c;
    public final me30 d;
    public final upp0 e;

    public xqo(String str, xha1 xha1Var, gqm1 gqm1Var, me30 me30Var, upp0 upp0Var) {
        this.a = str;
        this.b = xha1Var;
        this.c = gqm1Var;
        this.d = me30Var;
        this.e = upp0Var;
    }

    public final g3d0 a(g3d0 g3d0Var) {
        if (g3d0Var instanceof u2d0) {
            return u2d0.a;
        }
        n57.e("Cannot reverse unknown sort order: " + g3d0Var);
        return g3d0Var;
    }

    public final int b() {
        return 2131962815;
    }

    public final void c(qxc0 qxc0Var) {
        xha1 xha1Var = this.b;
        i8h1 i8h1Var = xha1Var.a;
        fjl0 fjl0Var = xha1Var.b;
        x6h1 x6h1VarC = fjl0Var.c.c();
        x6h1VarC.i.add(new a7h1("custom", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), y6h1VarA, fjl0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public final boolean e(qxc0 qxc0Var) {
        le30 le30VarA = this.d.a(qxc0Var.e);
        if (yqo.a.contains(le30VarA)) {
            return false;
        }
        if (le30VarA == le30.T0 && !this.c.a.h()) {
            return false;
        }
        this.e.getClass();
        String str = this.a;
        if (upp0.b(str)) {
            return false;
        }
        jxu0 jxu0VarC = oxu0.a.c(str);
        jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
        return !u890.j(jxu0Var != null ? jxu0Var.a : null, "offline-playable-artist");
    }

    public final g3d0 getSortOrder() {
        return u2d0.a;
    }
}
