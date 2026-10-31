package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kbw0 implements mj00 {
    public final vei0 a;
    public final zei0 b;
    public final t7y c;
    public final uk00 d;
    public final yy4 e;
    public final w25 f;
    public final Function0 g;
    public final h30 h;
    public final lg51 i;
    public final uu0 j;
    public final nwt k;
    public final iac0 l;
    public final c7s m;
    public final hl00 n;
    public final ojv0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f8p = new idd1(new fbw0(this, (byte) 0));
    public final p7w0 q = p7w0.h;

    public kbw0(vei0 vei0Var, zei0 zei0Var, t7y t7yVar, uk00 uk00Var, yy4 yy4Var, w25 w25Var, Function0 function0, h30 h30Var, lg51 lg51Var, uu0 uu0Var, nwt nwtVar, iac0 iac0Var, c7s c7sVar, hl00 hl00Var, ojv0 ojv0Var) {
        this.a = vei0Var;
        this.b = zei0Var;
        this.c = t7yVar;
        this.d = uk00Var;
        this.e = yy4Var;
        this.f = w25Var;
        this.g = function0;
        this.h = h30Var;
        this.i = lg51Var;
        this.j = uu0Var;
        this.k = nwtVar;
        this.l = iac0Var;
        this.m = c7sVar;
        this.n = hl00Var;
        this.o = ojv0Var;
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        d0r d0rVar = ji50Var.a;
        LinkedHashMap linkedHashMap = ji50Var.b;
        if (this.f.D()) {
            linkedHashMap.put(rei0.class, new r3r(d(d0rVar, xk00Var), gbw0.b, e()));
            linkedHashMap.put(sei0.class, new r3r(d(d0rVar, xk00Var), gbw0.c, e()));
            return ji50Var;
        }
        jbw0 jbw0Var = new jbw0(this, xk00Var, (byte) 0);
        Map map = this.h.b;
        ah20 ah20VarE = e();
        gbw0 gbw0Var = gbw0.d;
        fc3 fc3Var = new fc3(jbw0Var, (byte) 5);
        p7w0 p7w0Var = this.q;
        linkedHashMap.put(rei0.class, new vw21(p7w0Var, map, fc3Var, gbw0Var, ah20VarE));
        jbw0 jbw0Var2 = new jbw0(this, xk00Var, (byte) 1);
        ah20 ah20VarE2 = e();
        linkedHashMap.put(sei0.class, new vw21(p7w0Var, map, new fc3(jbw0Var2, (byte) 5), gbw0.e, ah20VarE2));
        return ji50Var;
    }

    public final yxb0 b(xk00 xk00Var, epb1 epb1Var) {
        kko kkoVar = xk00Var.a;
        return this.a.a(epb1Var, new p410(new t0r0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 26), kkoVar, this.o, this.g, this.f.i0() ? xk00Var.l : null, new cbw0(xk00Var, this), 64), c());
    }

    public final uei0 c() {
        har0 har0Var = new har0(this.d.b);
        Set set = jhi0.a;
        t7y t7yVar = this.c;
        boolean z = !set.contains(((lmo) t7yVar.c).a);
        boolean zD = ((yy4) t7yVar.b).d();
        w25 w25Var = this.f;
        boolean zQ = w25Var.Q();
        boolean zD2 = w25Var.d();
        yy4 yy4Var = this.e;
        return new uei0(true, har0Var, false, z, zD, zQ, zD2, yy4Var.e(), yy4Var.c(), 76);
    }

    public final wzq d(d0r d0rVar, xk00 xk00Var) {
        kko kkoVar = xk00Var.a;
        return new wzq(new bso(fdg1.m0(this.b.a(d0rVar, new p410(new t0r0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 27), kkoVar, this.o, this.g, this.f.i0() ? xk00Var.l : null, new ebw0(xk00Var, this), 64), c(), new wei0(this.n.q(), this.e.b(), 4)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ewq0(this, (byte) 13)), p7w0.g);
    }

    public final ah20 e() {
        if (this.f.I()) {
            return new ah20(new fbw0(this, (byte) 1), p7w0.i);
        }
        return null;
    }
}
