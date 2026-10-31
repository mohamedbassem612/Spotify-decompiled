package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cpx0 implements mj00 {
    public final mii0 a;
    public final jgp b;
    public final uk00 c;
    public final yy4 d;
    public final w25 e;
    public final Function0 f;
    public final hs00 g;
    public final c7s h;
    public final hl00 i;
    public final h30 j;

    public cpx0(mii0 mii0Var, jgp jgpVar, uk00 uk00Var, yy4 yy4Var, w25 w25Var, Function0 function0, hs00 hs00Var, c7s c7sVar, hl00 hl00Var, h30 h30Var) {
        this.a = mii0Var;
        this.b = jgpVar;
        this.c = uk00Var;
        this.d = yy4Var;
        this.e = w25Var;
        this.f = function0;
        this.g = hs00Var;
        this.h = c7sVar;
        this.i = hl00Var;
        this.j = h30Var;
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        bpx0 bpx0Var = new bpx0(this, ji50Var, xk00Var, (byte) 0);
        Map map = this.j.b;
        xox0 xox0Var = xox0.e;
        gbw0 gbw0Var = gbw0.T0;
        LinkedHashMap linkedHashMap = ji50Var.b;
        linkedHashMap.put(rkw0.class, new vw21(xox0Var, map, new fc3(bpx0Var, (byte) 5), gbw0Var, (vu30) null));
        bpx0 bpx0Var2 = new bpx0(this, ji50Var, xk00Var, (byte) 1);
        linkedHashMap.put(skw0.class, new vw21(xox0Var, map, new fc3(bpx0Var2, (byte) 5), gbw0.U0, (vu30) null));
        return ji50Var;
    }

    public final ohi0 b() {
        har0 har0Var = new har0(this.c.b);
        yy4 yy4Var = this.d;
        return new ohi0(har0Var, yy4Var.e(), yy4Var.c(), 112);
    }

    public final jpg0 c(epb1 epb1Var, d0r d0rVar, xk00 xk00Var) {
        p731 p731Var = xk00Var.l;
        w25 w25Var = this.e;
        boolean zA = w25Var.A();
        byte b = 10;
        hs00 hs00Var = this.g;
        if (!zA) {
            return new jpg0(new aso(f6o1.A(mii0.b(this.a, new ggx0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 2), epb1Var, xk00Var.a, b(), this.f, hs00Var, new zox0(xk00Var), new apx0(xk00Var), new y6w0(this, b), w25Var.i0() ? p731Var : null, 16), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new yox0(this, (byte) 1)), xox0.d);
        }
        ggx0 ggx0Var = new ggx0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 1);
        kko kkoVar = xk00Var.a;
        zox0 zox0Var = new zox0(xk00Var);
        apx0 apx0Var = new apx0(xk00Var);
        y6w0 y6w0Var = new y6w0(this, b);
        p731 p731Var2 = w25Var.i0() ? p731Var : null;
        ohi0 ohi0VarB = b();
        qhi0 qhi0Var = new qhi0(this.i.q());
        cgi0 cgi0Var = new cgi0(63);
        wgp wgpVar = (wgp) this.b.a.c;
        return new jpg0(new aso(f6o1.A(new r8s((kgp) wgpVar.e1.get(), wgpVar.a0, new jxa((byte) 16, false), wgpVar.B(), d0rVar, ggx0Var, kkoVar, ohi0VarB, qhi0Var, cgi0Var, this.f, hs00Var, zox0Var, apx0Var, y6w0Var, p731Var2), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new yox0(this, (byte) 0)), xox0.c);
    }
}
