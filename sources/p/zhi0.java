package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zhi0 implements mj00 {
    public final u3p a;
    public final kgp b;
    public final uk00 c;
    public final yy4 d;
    public final t7y e;
    public final w25 f;
    public final Function0 g;
    public final lg51 h;
    public final uu0 i;
    public final hl00 j;
    public final h30 k;
    public final nwt l;
    public final iac0 m;
    public final idd1 n = new idd1(new xhi0(this, (byte) 0));
    public final pfi0 o = pfi0.t;

    public zhi0(u3p u3pVar, kgp kgpVar, uk00 uk00Var, yy4 yy4Var, t7y t7yVar, w25 w25Var, Function0 function0, lg51 lg51Var, uu0 uu0Var, hl00 hl00Var, h30 h30Var, nwt nwtVar, iac0 iac0Var) {
        this.a = u3pVar;
        this.b = kgpVar;
        this.c = uk00Var;
        this.d = yy4Var;
        this.e = t7yVar;
        this.f = w25Var;
        this.g = function0;
        this.h = lg51Var;
        this.i = uu0Var;
        this.j = hl00Var;
        this.k = h30Var;
        this.l = nwtVar;
        this.m = iac0Var;
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        d0r d0rVar = ji50Var.a;
        LinkedHashMap linkedHashMap = ji50Var.b;
        if (this.f.z()) {
            linkedHashMap.put(khi0.class, new r3r(d(d0rVar, xk00Var), ish0.P0, f()));
            linkedHashMap.put(lhi0.class, new r3r(d(d0rVar, xk00Var), ish0.Q0, f()));
            return ji50Var;
        }
        yhi0 yhi0Var = new yhi0(this, xk00Var, (byte) 0);
        Map map = this.k.b;
        ah20 ah20VarF = f();
        ish0 ish0Var = ish0.R0;
        fc3 fc3Var = new fc3(yhi0Var, (byte) 5);
        pfi0 pfi0Var = this.o;
        linkedHashMap.put(khi0.class, new vw21(pfi0Var, map, fc3Var, ish0Var, ah20VarF));
        yhi0 yhi0Var2 = new yhi0(this, xk00Var, (byte) 1);
        ah20 ah20VarF2 = f();
        linkedHashMap.put(lhi0.class, new vw21(pfi0Var, map, new fc3(yhi0Var2, (byte) 5), ish0.S0, ah20VarF2));
        return ji50Var;
    }

    public final ig51 b(mhi0 mhi0Var, xpw xpwVar) {
        x360 x360Var;
        mmr0 mmr0VarM;
        String str = mhi0Var.b().b;
        smc0 smc0VarN = k4p1.n();
        Set set = jhi0.a;
        t7y t7yVar = this.e;
        if (set.contains(((lmo) t7yVar.c).a) && ((yy4) t7yVar.b).f() && (x360Var = mhi0Var.b().e) != null && (mmr0VarM = this.i.m(x360Var)) != null) {
            smc0VarN.add(new hg51((xpw) mmr0VarM.a, mmr0VarM.b, this.c.b));
        }
        smc0VarN.add(new hg51(xpwVar, mey0.a(mhi0Var.b()), 0));
        return new ig51(str, k4p1.k(smc0VarN), new yih0(mhi0Var, (byte) 13));
    }

    public final aso c(xk00 xk00Var, epb1 epb1Var) {
        return new aso(f6o1.A(new kpg0(this.h, new uah0(this, this.a.a(epb1Var, new uai0(xk00Var, (byte) 2), xk00Var.a, e(), this.g, (vu30) null, this.f.i0() ? xk00Var.l : null), (byte) 10)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new z6h0(this, (byte) 17));
    }

    public final bso d(d0r d0rVar, xk00 xk00Var) {
        gii0 gii0VarA = this.b.a(d0rVar, new phi0(xk00Var.a, new n0g0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 7), this.g, this.f.i0() ? xk00Var.l : null, (Object) null, (byte) 0), e(), new qhi0(this.j.q()));
        return new bso(fdg1.m0(new pbi0(this.h, gii0VarA, new uah0(this, gii0VarA, (byte) 11)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new z8b0(this, (byte) 23));
    }

    public final ohi0 e() {
        har0 har0Var = new har0(this.c.b);
        yy4 yy4Var = this.d;
        return new ohi0(har0Var, yy4Var.e(), yy4Var.c(), 124);
    }

    public final ah20 f() {
        if (this.f.I()) {
            return new ah20(new xhi0(this, (byte) 1), pfi0.X);
        }
        return null;
    }
}
