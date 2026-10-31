package p;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z060 implements fqw {
    public final j0k a;
    public final dxy b;
    public final d0r c;

    public z060(j0k j0kVar, dxy dxyVar, d0r d0rVar) {
        this.a = j0kVar;
        this.b = dxyVar;
        this.c = d0rVar;
    }

    public final laa a(fai0 fai0Var) {
        j0k j0kVar = this.a;
        jeq jeqVar = (jeq) j0kVar.y.get();
        xzq xzqVar = new xzq(((ieq) j0kVar.x.get()).a(this.c), aw50.V0);
        dxy dxyVar = this.b;
        qtw qtwVarA = f6o1.A(new ldo((bzo) dxyVar.f, new dgy(3, (Integer) null, (Integer) null)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
        d0r d0rVar = (d0r) dxyVar.b;
        o3r o3rVar = (o3r) dxyVar.g;
        return new wzq(jeq.a(jeqVar, this.c, xzqVar, p7h.M(new maa[]{new kpg0(q1o1.u(cso1.y(new bs0(d0rVar, o3rVar, oq50.c, qtwVarA), d3p1.F(d0rVar, o3rVar, ((l0k) dxyVar.c).a), oq50.d), (qim0) null, (FrameLayout.LayoutParams) null, 7), em50.T0), new xzq(((f2p) dxyVar.e).a(d0rVar), em50.U0), new xzq(((d2q) dxyVar.d).a(igu.a, d0rVar), em50.S0)}), null, 98), aw50.W0);
    }
}
