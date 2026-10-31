package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class h3w0 implements mj00 {
    public final zei0 a;
    public final t7y b;
    public final uk00 c;
    public final yy4 d;
    public final w25 e;
    public final Function0 f;
    public final c7s g;
    public final hl00 h;
    public final ojv0 i;

    public h3w0(zei0 zei0Var, t7y t7yVar, uk00 uk00Var, yy4 yy4Var, w25 w25Var, Function0 function0, c7s c7sVar, hl00 hl00Var, ojv0 ojv0Var) {
        this.a = zei0Var;
        this.b = t7yVar;
        this.c = uk00Var;
        this.d = yy4Var;
        this.e = w25Var;
        this.f = function0;
        this.g = c7sVar;
        this.h = hl00Var;
        this.i = ojv0Var;
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        d0r d0rVar = ji50Var.a;
        wzq wzqVarB = b(d0rVar, xk00Var);
        vbv0 vbv0Var = vbv0.a1;
        LinkedHashMap linkedHashMap = ji50Var.b;
        linkedHashMap.put(oei0.class, new r3r(wzqVarB, vbv0Var, (vu30) null));
        linkedHashMap.put(pei0.class, new r3r(b(d0rVar, xk00Var), vbv0.b1, (vu30) null));
        return ji50Var;
    }

    public final wzq b(d0r d0rVar, xk00 xk00Var) {
        p410 p410Var = new p410(new t0r0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 25), xk00Var.a, this.i, this.f, (p731) null, new g3w0(xk00Var, this), 64);
        har0 har0Var = new har0(this.c.b);
        Set set = jhi0.a;
        t7y t7yVar = this.b;
        boolean z = !set.contains(((lmo) t7yVar.c).a);
        boolean zD = ((yy4) t7yVar.b).d();
        w25 w25Var = this.e;
        boolean zQ = w25Var.Q();
        boolean zD2 = w25Var.d();
        yy4 yy4Var = this.d;
        return new wzq(new bso(fdg1.m0(this.a.a(d0rVar, p410Var, new uei0(true, har0Var, false, z, zD, zQ, zD2, yy4Var.e(), yy4Var.c(), 76), new wei0(this.h.q(), true, yy4Var.b())), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new ewq0(this, (byte) 12)), xuv0.b1);
    }
}
