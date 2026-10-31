package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c9u0 implements woa {
    public final woa a;
    public final /* synthetic */ r0s0 b;

    public c9u0(r0s0 r0s0Var, woa woaVar) {
        this.b = r0s0Var;
        this.a = woaVar;
    }

    public final uoa b(String str, o2u0 o2u0Var, w2k1 w2k1Var, kma kmaVar, List list, boolean z, bas basVar, sr20 sr20Var, un10 un10Var) {
        r0s0 r0s0Var = this.b;
        b291 b291Var = (b291) r0s0Var.c;
        uoa uoaVarA = woa.a(this.a, str, o2u0Var, w2k1Var, kmaVar == null ? (kma) r0s0Var.d : kmaVar, o7h.N0(b291Var, o7h.N0((List) r0s0Var.b, list)), z, basVar, (sn10) null, 896);
        Iterator it = b291Var.iterator();
        while (it.hasNext()) {
            ((taq) it.next()).a = uoaVarA;
        }
        return uoaVarA;
    }

    public final void c(uoa uoaVar) {
        this.a.c(uoaVar);
    }
}
