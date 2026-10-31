package p;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h9c0 implements woa {
    public final iac0 a;
    public final woa b;
    public final LinkedHashSet c = new LinkedHashSet();
    public final i83 d = new i83(this, (byte) 9);

    public h9c0(iac0 iac0Var, woa woaVar) {
        this.a = iac0Var;
        this.b = woaVar;
    }

    public final uoa b(String str, o2u0 o2u0Var, w2k1 w2k1Var, kma kmaVar, List list, boolean z, bas basVar, sr20 sr20Var, un10 un10Var) {
        uoa uoaVarA = woa.a(this.b, str, o2u0Var, w2k1Var, kmaVar, list, z, basVar, (sn10) null, 896);
        this.c.add(uoaVarA);
        x8c0 lifecycle = this.a.getLifecycle();
        i83 i83Var = this.d;
        lifecycle.d(i83Var);
        lifecycle.a(i83Var);
        return uoaVarA;
    }

    public final void c(uoa uoaVar) {
        this.c.remove(uoaVar);
        uoaVar.u();
        this.b.c(uoaVar);
    }
}
