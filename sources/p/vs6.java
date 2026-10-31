package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vs6 implements tha1 {
    public final String a;
    public final wha1 b;
    public final z6k0 c;
    public final me30 d;
    public final z9k0 e;
    public final s2d0 f = new s2d0(false);

    public vs6(String str, wha1 wha1Var, z6k0 z6k0Var, me30 me30Var, r6h1 r6h1Var, b9q b9qVar) {
        this.a = str;
        this.b = wha1Var;
        this.c = z6k0Var;
        this.d = me30Var;
        this.e = b9qVar.a(r6h1Var);
    }

    public final g3d0 a(g3d0 g3d0Var) {
        if (g3d0Var instanceof s2d0) {
            return new s2d0(!((s2d0) g3d0Var).a);
        }
        n57.e("Cannot reverse unknown sort order: " + g3d0Var);
        return g3d0Var;
    }

    public final int b() {
        return 2131962814;
    }

    public final void c(qxc0 qxc0Var) {
        wha1 wha1Var = this.b;
        i8h1 i8h1Var = wha1Var.a;
        fjl0 fjl0Var = wha1Var.b;
        x6h1 x6h1VarC = fjl0Var.c.c();
        x6h1VarC.i.add(new a7h1("artist_name", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), y6h1VarA, fjl0Var.b, System.currentTimeMillis()), (xj61) null);
        if (d(qxc0Var)) {
            return;
        }
        z9k0.a(this.e, s9k0.a);
    }

    public final boolean d(qxc0 qxc0Var) {
        Map map = qxc0Var.X;
        this.c.getClass();
        return !z6k0.a(map);
    }

    public final boolean e(qxc0 qxc0Var) {
        if (ws6.a.contains(this.d.a(qxc0Var.e))) {
            return false;
        }
        jxu0 jxu0VarC = oxu0.a.c(this.a);
        jxu0 jxu0Var = jxu0VarC instanceof jxu0 ? jxu0VarC : null;
        if (u890.j(jxu0Var != null ? jxu0Var.a : null, "offline-playable-artist")) {
            return false;
        }
        return gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h});
    }

    public final g3d0 getSortOrder() {
        return this.f;
    }
}
