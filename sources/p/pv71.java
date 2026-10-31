package p;

import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pv71 implements d6f0 {
    public final /* synthetic */ d6f0 a;
    public final c9n b;
    public elb0 e;
    public elb0 f;
    public final hrr0 c = xto.t(Boolean.FALSE);
    public final l5v0 d = new l5v0(this, (byte) 17);
    public final err0 g = apo.q(0);
    public final wdn0 h = new wdn0();
    public final dw91 i = xto.r();
    public int t = -1;

    public pv71(d6f0 d6f0Var, c9n c9nVar) {
        this.a = d6f0Var;
        this.b = c9nVar;
    }

    public static ov71 d(Object obj, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(800730162);
        x340Var.i0(-148945892);
        boolean zG = x340Var.g(obj);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new ov71(obj);
            x340Var.s0(objT);
        }
        ov71 ov71Var = (ov71) objT;
        ov71Var.b.setValue(lv71.a);
        x340Var.r(false);
        x340Var.r(false);
        return ov71Var;
    }

    public static qim0 e(pv71 pv71Var, ov71 ov71Var, cd5 cd5Var) {
        nv71.a.getClass();
        return zr7.i(nim0.a, new kj21(ov71Var, cd5Var.a(), pv71Var, sv71.b, (byte) 9));
    }

    @Override // p.d6f0
    public final elb0 a(elb0 elb0Var) {
        return this.a.a(elb0Var);
    }

    @Override // p.d6f0
    public final long b(elb0 elb0Var, elb0 elb0Var2) {
        return this.a.b(elb0Var, elb0Var2);
    }

    public final boolean c() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final void f() {
        boolean z;
        Collection<xs71> collectionD = this.i.b().d().d();
        loop0: while (true) {
            z = false;
            for (xs71 xs71Var : collectionD) {
                xs71Var.f();
                if (z || (xs71Var.a() && (xs71Var.d() || xs71Var.e()))) {
                    z = true;
                }
            }
            break loop0;
        }
        if (z != c()) {
            this.c.setValue(Boolean.valueOf(z));
            if (z) {
                return;
            }
            for (xs71 xs71Var2 : collectionD) {
                if (xs71Var2.c().size() <= 1 || !zs71.a(xs71Var2.c())) {
                    xs71Var2.c.y();
                }
            }
        }
    }
}
