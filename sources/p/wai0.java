package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wai0 implements mj00 {
    public final /* synthetic */ byte a;
    public final w25 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public wai0(ycm ycmVar, agp agpVar, w25 w25Var, nwt nwtVar, iac0 iac0Var) {
        this.a = (byte) 1;
        this.c = ycmVar;
        this.d = agpVar;
        this.b = w25Var;
        this.e = nwtVar;
        this.f = iac0Var;
        this.g = new idd1(new l5v0(this, (byte) 29));
    }

    public static final /* synthetic */ nwt b(wai0 wai0Var) {
        return (nwt) wai0Var.e;
    }

    public static final /* synthetic */ iac0 c(wai0 wai0Var) {
        return (iac0) wai0Var.f;
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        byte b = this.a;
        w25 w25Var = this.b;
        switch (b) {
            case 0:
                cka ckaVar = ish0.f;
                d0r d0rVar = ji50Var.a;
                LinkedHashMap linkedHashMap = ji50Var.b;
                if (!w25Var.B()) {
                    vai0 vai0Var = new vai0(this, xk00Var, (byte) 0);
                    Map map = ((h30) this.g).b;
                    y7i0 y7i0Var = y7i0.t;
                    linkedHashMap.put(gai0.class, new vw21(y7i0Var, map, new fc3(vai0Var, (byte) 5), ish0.i, w25Var.I() ? ckaVar : null));
                    linkedHashMap.put(hai0.class, new vw21(y7i0Var, map, new fc3(new vai0(this, xk00Var, (byte) 1), (byte) 5), ish0.t, w25Var.I() ? ckaVar : null));
                } else {
                    linkedHashMap.put(gai0.class, new r3r(d(d0rVar, xk00Var), ish0.g, w25Var.I() ? ckaVar : null));
                    linkedHashMap.put(hai0.class, new r3r(d(d0rVar, xk00Var), ish0.h, w25Var.I() ? ckaVar : null));
                }
                break;
            default:
                d0r d0rVar2 = ji50Var.a;
                ptf1 ptf1Var = new ptf1(new sjf1(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 6), ycm.a((ycm) this.c), (byte) 27);
                agp agpVar = (agp) this.d;
                o3r o3rVar = m6j1.a;
                wgp wgpVar = (wgp) agpVar.a.c;
                gw70 gw70VarK = wgpVar.a.k();
                c8o.l(gw70VarK);
                nwt nwtVar = (nwt) wgpVar.c0.get();
                lo60 lo60VarU = wgpVar.u();
                vgm vgmVarD = wgpVar.a.d();
                c8o.l(vgmVarD);
                ji50Var.b.put(q6j1.class, new r3r(new wzq(fdg1.m0(new qlb(gw70VarK, nwtVar, lo60VarU, vgmVarD, (iuj) wgpVar.a0.get(), (Function0) wgpVar.D.get(), wgpVar.B(), d0rVar2, o3rVar, ptf1Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), nvi1.Y0), z691.h, w25Var.I() ? new cka(new dch1(this, (byte) 17), (byte) 14) : null));
                break;
        }
        return ji50Var;
    }

    public wzq d(d0r d0rVar, xk00 xk00Var) {
        egp egpVar = (egp) this.d;
        o3e0 o3e0Var = new o3e0(new uai0(xk00Var, (byte) 0), xk00Var.a, (Function0) this.f, (byte) 29);
        yy4 yy4Var = (yy4) this.e;
        kai0 kai0Var = new kai0(yy4Var.e(), yy4Var.c());
        wgp wgpVar = (wgp) egpVar.a.c;
        nwt nwtVar = (nwt) wgpVar.c0.get();
        fza fzaVar = new fza((byte) 11, false);
        km3 km3Var = new km3();
        gw70 gw70VarK = wgpVar.a.k();
        c8o.l(gw70VarK);
        lo60 lo60VarU = wgpVar.u();
        aru0 aru0VarS = wgpVar.s();
        ycm ycmVar = (ycm) wgpVar.f0.get();
        aru0 aru0VarY = wgpVar.y();
        myq0 myq0VarV = wgpVar.v();
        vgm vgmVarD = wgpVar.a.d();
        c8o.l(vgmVarD);
        return new wzq(fdg1.m0(new jd6(d0rVar, o3e0Var, kai0Var, nwtVar, fzaVar, km3Var, gw70VarK, lo60VarU, aru0VarS, ycmVar, aru0VarY, myq0VarV, vgmVarD, (dnc) wgpVar.Z.get(), wgpVar.C(), (clm) wgpVar.U.get(), wgpVar.z(), (iuj) wgpVar.a0.get()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), y7i0.h);
    }

    public jpg0 e(xk00 xk00Var, epb1 epb1Var) {
        dgp dgpVar = (dgp) this.c;
        o3e0 o3e0Var = new o3e0(new uai0(xk00Var, (byte) 1), xk00Var.a, (Function0) this.f, (byte) 29);
        yy4 yy4Var = (yy4) this.e;
        kai0 kai0Var = new kai0(yy4Var.e(), yy4Var.c());
        wgp wgpVar = (wgp) dgpVar.a.c;
        nwt nwtVar = (nwt) wgpVar.c0.get();
        fza fzaVar = new fza((byte) 11, false);
        km3 km3Var = new km3();
        gw70 gw70VarK = wgpVar.a.k();
        c8o.l(gw70VarK);
        lo60 lo60VarU = wgpVar.u();
        aru0 aru0VarS = wgpVar.s();
        ycm ycmVar = (ycm) wgpVar.f0.get();
        aru0 aru0VarY = wgpVar.y();
        myq0 myq0VarV = wgpVar.v();
        vgm vgmVarD = wgpVar.a.d();
        c8o.l(vgmVarD);
        return new jpg0(f6o1.A(new ng20(epb1Var, o3e0Var, kai0Var, nwtVar, fzaVar, km3Var, gw70VarK, lo60VarU, aru0VarS, ycmVar, aru0VarY, myq0VarV, vgmVarD, (dnc) wgpVar.Z.get(), wgpVar.C(), (clm) wgpVar.U.get(), wgpVar.z(), (iuj) wgpVar.a0.get()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), y7i0.i);
    }

    public wai0(dgp dgpVar, egp egpVar, w25 w25Var, yy4 yy4Var, Function0 function0, h30 h30Var) {
        this.a = (byte) 0;
        this.c = dgpVar;
        this.d = egpVar;
        this.b = w25Var;
        this.e = yy4Var;
        this.f = function0;
        this.g = h30Var;
    }
}
