package p;

import com.spotify.mobius.Next;
import com.spotify.player.model.ContextTrack;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class f0x {
    public final j44 a;

    public f0x(j44 j44Var) {
        this.a = j44Var;
    }

    public static Next a(Next next, g0x g0xVar) {
        g0x g0xVar2 = (g0x) (next.d() ? next.g() : null);
        if (g0xVar2 == null) {
            g0xVar2 = g0xVar;
        }
        mmr0 mmr0VarB = b(g0xVar, g0xVar2, next.b());
        return Next.i(mmr0VarB.a, (Set) mmr0VarB.b);
    }

    public static mmr0 b(g0x g0xVar, g0x g0xVar2, Set set) {
        ad80 ad80Var = g0xVar instanceof ad80 ? (ad80) g0xVar : null;
        if (ad80Var != null && !ad80Var.i) {
            ad80 ad80Var2 = g0xVar2 instanceof ad80 ? (ad80) g0xVar2 : null;
            if (ad80Var2 != null && ad80Var2.i) {
                set = dm61.x0(new tn0(((ad80) g0xVar).a), set);
            }
        }
        if (!g0xVar.e() && g0xVar2.e() && (g0xVar2 instanceof ad80)) {
            ad80 ad80Var3 = (ad80) g0xVar2;
            set = dm61.x0(new wik1(ad80Var3.a, ad80Var3.k), set);
        }
        return new mmr0(g0xVar2, set);
    }

    public final Next c(qey0 qey0Var, g0x g0xVar) {
        a2x a2xVar;
        ju0 ju0Var = qey0Var.c;
        ji0 ji0Var = qey0Var.a;
        ContextTrack contextTrack = qey0Var.b;
        boolean z = qey0Var.d;
        if (ji0Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        j44 j44Var = this.a;
        int iA = z ? j44Var.a() : j44Var.h();
        int iOrdinal = ju0Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            a2xVar = new a2x(iA);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                eg.o();
                return null;
            }
            a2xVar = new a2x(iA);
        } else {
            a2xVar = new a2x(0L);
        }
        Set setW0 = dm61.w0(new qzw[]{new gju(1, a2xVar), new veu(), new o4w0(ji0Var)});
        if (a2xVar.a != 0) {
            setW0.add(new uc21(ji0Var));
        }
        return a(Next.i(new ad80(qey0Var.a, l4o1.r(contextTrack), contextTrack.uri(), ju0Var, Collections.singleton(a2xVar), false, false, (Object) null, false, qey0Var.e && z, g0xVar.b(), g0xVar.a(), g0xVar.c(), g0xVar.d()), setW0), g0xVar);
    }
}
