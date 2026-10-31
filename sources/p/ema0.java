package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ema0 extends mla0 {
    public static final /* synthetic */ int d = 0;
    public final Class b;
    public final znb0 c = dm5.S(2, new bma0(this, (byte) 0));

    public ema0(Class cls) {
        this.b = cls;
    }

    public final Collection B() {
        return z6x.a;
    }

    public final Collection C() {
        return z6x.a;
    }

    public final Collection D(ajn0 ajn0Var) {
        mc11 mc11Var = ((dma0) this.c.getValue()).e;
        mma0 mma0Var = dma0.g[1];
        return ((zpi0) mc11Var.invoke()).c(ajn0Var, 8);
    }

    public final tdy0 E(int i) {
        mc11 mc11Var = ((dma0) this.c.getValue()).e;
        mma0 mma0Var = dma0.g[1];
        zpi0 zpi0Var = (zpi0) mc11Var.invoke();
        git gitVar = zpi0Var instanceof git ? (git) zpi0Var : null;
        if (gitVar != null) {
            byp bypVar = gitVar.b;
            cgy0 cgy0Var = gitVar.h;
            ggy0 ggy0Var = (ggy0) z0o1.m(cgy0Var, eka0.l, i);
            if (ggy0Var != null) {
                return (tdy0) bpi1.f(this.b, new ide0(this), ggy0Var, (zjn0) bypVar.c, new l141(cgy0Var.g), (ava) bypVar.f, q5.T0);
            }
        }
        return null;
    }

    public final w3b0 F(int i) {
        v3b0 v3b0Var = (v3b0) o7h.X0((List) ((dma0) this.c.getValue()).c.getValue());
        if (v3b0Var == null) {
            return null;
        }
        return (w3b0) o7h.t0(i, ((kja0) ulo1.q(v3b0Var.d, kja0.b)).a);
    }

    public final Class G() {
        Class cls = (Class) ((dma0) this.c.getValue()).f.getValue();
        return cls == null ? this.b : cls;
    }

    public final Collection H(ajn0 ajn0Var) {
        mc11 mc11Var = ((dma0) this.c.getValue()).e;
        mma0 mma0Var = dma0.g[1];
        return ((zpi0) mc11Var.invoke()).a(ajn0Var, 8);
    }

    public final ArrayList L() {
        List list = (List) ((dma0) this.c.getValue()).c.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((v3b0) it.next()).a, arrayList);
        }
        return arrayList;
    }

    public final ArrayList M() {
        List list = (List) ((dma0) this.c.getValue()).c.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((v3b0) it.next()).b, arrayList);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ema0) {
            return this.b.equals(((ema0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final Class n() {
        return this.b;
    }

    public final String toString() {
        return "file class " + bb11.a(this.b).a();
    }
}
