package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jbi0 implements mj00 {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public jbi0(lbp lbpVar, xfx xfxVar, ivp0 ivp0Var, cn3 cn3Var, vgm vgmVar, lo60 lo60Var, bhu bhuVar, i3h i3hVar) {
        this.b = lbpVar;
        this.c = xfxVar;
        this.d = ivp0Var;
        this.e = cn3Var;
        this.f = vgmVar;
        this.g = lo60Var;
        this.h = i3hVar;
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        switch (this.a) {
            case 0:
                d0r d0rVar = ji50Var.a;
                jfp jfpVar = (jfp) this.b;
                har0 har0Var = new har0(((uk00) this.f).b);
                w25 w25Var = (w25) this.h;
                boolean zQ = w25Var.Q();
                yy4 yy4Var = (yy4) this.g;
                ebi0 ebi0Var = new ebi0(har0Var, zQ, yy4Var.e(), yy4Var.c(), 6);
                w6e0 w6e0Var = new w6e0(xk00Var.a, new n0g0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 4), (Function0) this.c, xk00Var.i);
                wgp wgpVar = (wgp) jfpVar.a.c;
                gw70 gw70VarK = wgpVar.a.k();
                c8o.l(gw70VarK);
                nwt nwtVar = (nwt) wgpVar.c0.get();
                l0x0 l0x0VarB = wgpVar.B();
                vgm vgmVarD = wgpVar.a.d();
                c8o.l(vgmVarD);
                myq0 myq0VarV = wgpVar.v();
                aru0 aru0VarY = wgpVar.y();
                cua cuaVar = new cua((byte) 17);
                ycm ycmVar = (ycm) wgpVar.f0.get();
                aru0 aru0VarS = wgpVar.s();
                e9g1 e9g1VarM = wgpVar.a.m();
                c8o.l(e9g1VarM);
                obi0 obi0Var = new obi0(gw70VarK, nwtVar, l0x0VarB, vgmVarD, myq0VarV, aru0VarY, cuaVar, ycmVar, aru0VarS, e9g1VarM, (yqg) wgpVar.f.get(), new fza((byte) 11, false), wgpVar.A(), wgpVar.C(), wgpVar.u(), (clm) wgpVar.U.get(), wgpVar.z(), (iuj) wgpVar.a0.get(), (tiv0) wgpVar.D0.get(), wgpVar.w(), d0rVar, ebi0Var, w6e0Var);
                ji50Var.b.put(cbi0.class, new r3r(new bso(fdg1.m0(new pbi0((lg51) this.d, obi0Var, new uah0(this, obi0Var, (byte) 7)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new z8b0(this, (byte) 18)), ibi0.b, w25Var.I() ? ish0.X : null));
                break;
            case 1:
                nso0 nso0Var = new nso0(this, (byte) 11);
                ji50Var.b.put(rup0.class, new vw21(k8b0.b1, b7x.a, new fc3(nso0Var, (byte) 5), ibi0.h, (vu30) null));
                break;
            default:
                y6w0 y6w0Var = new y6w0(this, (byte) 21);
                ji50Var.b.put(zby0.class, new vw21(ucy0.e, b7x.a, new fc3(y6w0Var, (byte) 5), j8y0.Y, (vu30) null));
                break;
        }
        return ji50Var;
    }

    public jbi0(lbp lbpVar, l0x0 l0x0Var, wk00 wk00Var, lwp lwpVar, uk00 uk00Var, lo60 lo60Var, gw70 gw70Var, uu00 uu00Var) {
        this.b = lbpVar;
        this.c = l0x0Var;
        this.d = wk00Var;
        this.e = lwpVar;
        this.f = lo60Var;
        this.g = gw70Var;
        this.h = uu00Var;
    }

    public jbi0(jfp jfpVar, Function0 function0, lg51 lg51Var, uu0 uu0Var, uk00 uk00Var, yy4 yy4Var, w25 w25Var) {
        this.b = jfpVar;
        this.c = function0;
        this.d = lg51Var;
        this.e = uu0Var;
        this.f = uk00Var;
        this.g = yy4Var;
        this.h = w25Var;
    }
}
