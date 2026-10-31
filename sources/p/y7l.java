package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y7l {
    public final g0l a;
    public final ark1 b;
    public final m0s c;

    public y7l(g0l g0lVar, ark1 ark1Var, m0s m0sVar) {
        this.a = g0lVar;
        this.b = ark1Var;
        this.c = m0sVar;
    }

    public final ur31 a() {
        inr inrVar = this.a;
        l0l l0lVarC = inrVar.c();
        int iA = 0;
        boolean zF = l0lVarC != null ? l0lVarC.F() : false;
        l0l l0lVarC2 = inrVar.c();
        if (l0lVarC2 != null && l0lVarC2.F() && (iA = l0lVarC2.A()) >= 24) {
            iA = 24;
        }
        l0l l0lVarC3 = inrVar.c();
        int iS = -1;
        if (l0lVarC3 != null && l0lVarC3.F()) {
            double dC = this.b.c();
            int iA2 = l0lVarC3.A();
            iS = jch0.S(dC * ((double) (iA2 < 24 ? iA2 : 24)));
        }
        return new ur31(zF, iS, iA);
    }

    public final void b(int i) {
        double dP;
        l0l l0lVarC = this.a.c();
        if (l0lVarC == null || !l0lVarC.F()) {
            return;
        }
        String str = l0lVarC.G().a;
        int iA = l0lVarC.A();
        if (iA >= 24) {
            iA = 24;
        }
        if (iA <= 0) {
            Logger.k(f4i1.c(iA, "Volume steps is lower or 0: "), new Object[0]);
            dP = 0.0d;
        } else {
            dP = ((double) yoi1.p(i, 0, iA)) / ((double) iA);
        }
        double d = dP;
        ark1.g(this.b, d, "gos_volume_set", this.c.d((int) (100.0d * d), str), 8);
    }

    public final void c(int i) {
        l0l l0lVarC = this.a.c();
        if (l0lVarC == null || !l0lVarC.F()) {
            return;
        }
        ark1 ark1Var = this.b;
        m0s m0sVar = this.c;
        if (i == -1) {
            String str = l0lVarC.G().a;
            ark1.d(ark1Var, "gos_volume_update", m0sVar.b(l0lVarC.G().a), 4);
        } else {
            if (i != 1) {
                return;
            }
            String str2 = l0lVarC.G().a;
            ark1.f(ark1Var, "gos_volume_update", m0sVar.c(l0lVarC.G().a), 4);
        }
    }
}
