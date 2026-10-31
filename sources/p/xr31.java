package p;

import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xr31 extends zso1 {
    public final nma0 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public int e;

    public xr31(nma0 nma0Var, LinkedHashMap linkedHashMap) {
        this.b = nma0Var;
        this.c = linkedHashMap;
        kl1 kl1Var = j761.a;
        this.d = new LinkedHashMap();
        this.e = -1;
    }

    public final void D(h661 h661Var, int i) {
        this.e = i;
    }

    public final void F(Object obj) {
        e0(obj);
    }

    public final void J() {
        e0(null);
    }

    public final kl1 c() {
        return j761.a;
    }

    public final void e0(Object obj) {
        String strE = this.b.getDescriptor().e(this.e);
        n4h n4hVar = (apn0) this.c.get(strE);
        if (n4hVar != null) {
            this.d.put(strE, n4hVar instanceof n4h ? n4hVar.h(obj) : Collections.singletonList(n4hVar.f(obj)));
        } else {
            bhn0.f(f4i1.f("Cannot find NavType for argument ", strE, ". Please provide NavType through typeMap."));
        }
    }

    public final void i(nma0 nma0Var, Object obj) {
        e0(obj);
    }
}
