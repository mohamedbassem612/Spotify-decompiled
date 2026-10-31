package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ac3 implements tha1 {
    public final /* synthetic */ byte a;
    public final z6k0 b;
    public final me30 c;
    public final z9k0 d;
    public final Object e;
    public final g3d0 f;

    public ac3(wha1 wha1Var, z6k0 z6k0Var, me30 me30Var, r6h1 r6h1Var, b9q b9qVar) {
        this.a = (byte) 1;
        this.e = wha1Var;
        this.b = z6k0Var;
        this.c = me30Var;
        this.d = b9qVar.a(r6h1Var);
        this.f = new x2d0(false);
    }

    public final g3d0 a(g3d0 g3d0Var) {
        switch (this.a) {
            case 0:
                if (g3d0Var instanceof q2d0) {
                    return new q2d0(!((q2d0) g3d0Var).a);
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
            default:
                if (g3d0Var instanceof x2d0) {
                    return new x2d0(!((x2d0) g3d0Var).a);
                }
                n57.e("Cannot reverse unknown sort order: " + g3d0Var);
                return g3d0Var;
        }
    }

    public final int b() {
        switch (this.a) {
            case 0:
                return 2131962813;
            default:
                return 2131962819;
        }
    }

    public final void c(qxc0 qxc0Var) {
        byte b = this.a;
        s9k0 s9k0Var = s9k0.a;
        z9k0 z9k0Var = this.d;
        b7x b7xVar = b7x.a;
        Object obj = this.e;
        switch (b) {
            case 0:
                vha1 vha1Var = (vha1) obj;
                i8h1 i8h1Var = vha1Var.a;
                fjl0 fjl0Var = vha1Var.b;
                x6h1 x6h1VarC = fjl0Var.c.c();
                x6h1VarC.i.add(new a7h1("album_name", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC.a(), fjl0Var.b, System.currentTimeMillis()), (xj61) null);
                if (!d(qxc0Var)) {
                    z9k0.a(z9k0Var, s9k0Var);
                }
                break;
            default:
                wha1 wha1Var = (wha1) obj;
                i8h1 i8h1Var2 = wha1Var.a;
                fjl0 fjl0Var2 = wha1Var.b;
                x6h1 x6h1VarC2 = fjl0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("name", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC2.a(), fjl0Var2.b, System.currentTimeMillis()), (xj61) null);
                if (!d(qxc0Var)) {
                    z9k0.a(z9k0Var, s9k0Var);
                }
                break;
        }
    }

    public final boolean d(qxc0 qxc0Var) {
        boolean zA;
        byte b = this.a;
        z6k0 z6k0Var = this.b;
        switch (b) {
            case 0:
                Map map = qxc0Var.X;
                z6k0Var.getClass();
                zA = z6k0.a(map);
                break;
            default:
                Map map2 = qxc0Var.X;
                z6k0Var.getClass();
                zA = z6k0.a(map2);
                break;
        }
        return !zA;
    }

    public final boolean e(qxc0 qxc0Var) {
        byte b = this.a;
        me30 me30Var = this.c;
        switch (b) {
            case 0:
                if (bc3.a.contains(me30Var.a(qxc0Var.e))) {
                    return false;
                }
                return gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d, dlc0.h});
            default:
                return !gkn0.a.contains(me30Var.a(qxc0Var.e));
        }
    }

    public final g3d0 getSortOrder() {
        byte b = this.a;
        x2d0 x2d0Var = this.f;
        switch (b) {
            case 0:
                return (q2d0) x2d0Var;
            default:
                return x2d0Var;
        }
    }

    public ac3(vha1 vha1Var, z6k0 z6k0Var, me30 me30Var, r6h1 r6h1Var, b9q b9qVar) {
        this.a = (byte) 0;
        this.e = vha1Var;
        this.b = z6k0Var;
        this.c = me30Var;
        this.d = b9qVar.a(r6h1Var);
        this.f = new q2d0(false);
    }
}
