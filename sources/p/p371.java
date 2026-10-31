package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class p371 {
    public final p371 a(Map map) {
        if (this instanceof f9c1) {
            return f9c1.i((f9c1) this, map, null, 111);
        }
        if (this instanceof g9c1) {
            return g9c1.i((g9c1) this, null, map, null, 111);
        }
        if (this instanceof h9c1) {
            return h9c1.i((h9c1) this, null, map, null, 111);
        }
        if (this instanceof pz70) {
            pz70 pz70Var = (pz70) this;
            return new pz70(pz70Var.a, pz70Var.b, pz70Var.c, pz70Var.d, map, pz70Var.f, pz70Var.g);
        }
        if (this instanceof vkc0) {
            return vkc0.g((vkc0) this, map, null, 27);
        }
        if (this instanceof a6j0) {
            return a6j0.g((a6j0) this, map, null, 95);
        }
        eg.o();
        return null;
    }

    public abstract String b();

    public o371 c() {
        return new o371(null, false, false, 7);
    }

    public abstract String d();

    public abstract Map e();

    public abstract dqi1 f();
}
