package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n680 implements m270 {
    public final Set a;

    public n680() {
        zf50 zf50Var = new zf50();
        rog0 rog0Var = (rog0) zf50Var.e;
        dm5.A(rog0Var == null, "Key strength was already set to %s", rog0Var);
        zf50Var.e = rog0.b;
        zf50Var.b = true;
        this.a = Collections.newSetFromMap(zf50Var.d());
    }

    @Override // p.m270
    public final void a(jf01 jf01Var, st60 st60Var) {
        this.a.remove(jf01Var);
    }

    @Override // p.m270
    public final void b(jf01 jf01Var) {
        this.a.add(jf01Var);
    }

    public final void c() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((jf01) it.next()).cancel();
        }
    }
}
