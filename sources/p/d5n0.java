package p;

import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d5n0 implements mj00 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public /* synthetic */ d5n0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    public final ji50 a(xk00 xk00Var, ji50 ji50Var) {
        switch (this.a) {
            case 0:
                vu30 vu30Var = dbm0.e1;
                d0r d0rVar = ji50Var.a;
                LinkedHashMap linkedHashMap = ji50Var.b;
                w25 w25Var = (w25) this.f;
                if (w25Var.y()) {
                    linkedHashMap.put(bei0.class, new r3r(c(d0rVar, xk00Var), b5n0.b, w25Var.I() ? vu30Var : null));
                    wzq wzqVarC = c(d0rVar, xk00Var);
                    if (!w25Var.I()) {
                        vu30Var = null;
                    }
                    linkedHashMap.put(cei0.class, new r3r(wzqVarC, b5n0.c, vu30Var));
                } else {
                    c5n0 c5n0Var = new c5n0(this, xk00Var, (byte) 0);
                    Map map = ((h30) this.e).b;
                    k4n0 k4n0Var = k4n0.S0;
                    linkedHashMap.put(bei0.class, new vw21(k4n0Var, map, new fc3(c5n0Var, (byte) 5), b5n0.d, w25Var.I() ? vu30Var : null));
                    linkedHashMap.put(cei0.class, new vw21(k4n0Var, map, new fc3(new c5n0(this, xk00Var, (byte) 1), (byte) 5), b5n0.e, w25Var.I() ? vu30Var : null));
                }
                break;
            default:
                q081 q081Var = new q081(this, xk00Var, (byte) 0);
                boolean zE = ((otu) ((kba) this.d).b).e();
                Map map2 = ((h30) this.c).b;
                if (zE) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(map2.size()));
                    for (Map.Entry entry : map2.entrySet()) {
                        Object key = entry.getKey();
                        Set<zp21> set = (Set) entry.getValue();
                        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
                        for (zp21 yp21Var : set) {
                            if (yp21Var instanceof zp21) {
                                yp21Var = new yp21(yp21Var.a);
                            }
                            arrayList.add(yp21Var);
                        }
                        linkedHashMap2.put(key, o7h.p1(arrayList));
                    }
                    map2 = linkedHashMap2;
                }
                ji50Var.b.put(y081.class, new vw21(fft0.d1, sqg0.P(map2, new mmr0(-1, alk1.a)), new fc3(q081Var, (byte) 5), ibi0.b1, (vu30) null));
                break;
        }
        return ji50Var;
    }

    public jpg0 b(xk00 xk00Var, epb1 epb1Var) {
        fgp fgpVar = (fgp) this.b;
        w6e0 w6e0Var = new w6e0(new n0g0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 11), xk00Var.a, (Function0) this.h, new y4n0(xk00Var, this), (byte) 23);
        har0 har0Var = new har0(((uk00) this.d).b);
        yy4 yy4Var = (yy4) this.g;
        gei0 gei0Var = new gei0(har0Var, yy4Var.e(), yy4Var.c());
        wgp wgpVar = (wgp) fgpVar.a.c;
        aru0 aru0VarS = wgpVar.s();
        ycm ycmVar = (ycm) wgpVar.f0.get();
        aru0 aru0VarY = wgpVar.y();
        myq0 myq0VarV = wgpVar.v();
        gw70 gw70VarK = wgpVar.a.k();
        c8o.l(gw70VarK);
        lo60 lo60VarU = wgpVar.u();
        fza fzaVar = new fza((byte) 11, false);
        vgm vgmVarD = wgpVar.a.d();
        c8o.l(vgmVarD);
        return new jpg0(new aso(f6o1.A(new umf0(epb1Var, w6e0Var, gei0Var, aru0VarS, ycmVar, aru0VarY, myq0VarV, gw70VarK, lo60VarU, fzaVar, vgmVarD, (nwt) wgpVar.c0.get(), (dnc) wgpVar.Z.get(), wgpVar.C(), (clm) wgpVar.U.get(), wgpVar.z(), (iuj) wgpVar.a0.get()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new nrj0(this, (byte) 12)), k4n0.Q0);
    }

    public wzq c(d0r d0rVar, xk00 xk00Var) {
        ggp ggpVar = (ggp) this.c;
        w6e0 w6e0Var = new w6e0(new n0g0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 12), xk00Var.a, (Function0) this.h, new a5n0(xk00Var, this), (byte) 23);
        har0 har0Var = new har0(((uk00) this.d).b);
        yy4 yy4Var = (yy4) this.g;
        gei0 gei0Var = new gei0(har0Var, yy4Var.e(), yy4Var.c());
        wgp wgpVar = (wgp) ggpVar.a.c;
        aru0 aru0VarS = wgpVar.s();
        ycm ycmVar = (ycm) wgpVar.f0.get();
        aru0 aru0VarY = wgpVar.y();
        myq0 myq0VarV = wgpVar.v();
        qk00 qk00Var = wgpVar.a;
        gw70 gw70VarK = qk00Var.k();
        c8o.l(gw70VarK);
        lo60 lo60VarU = wgpVar.u();
        fza fzaVar = new fza((byte) 11, false);
        vgm vgmVarD = qk00Var.d();
        c8o.l(vgmVarD);
        return new wzq(new bso(fdg1.m0(new qlb(aru0VarS, ycmVar, aru0VarY, myq0VarV, gw70VarK, lo60VarU, fzaVar, vgmVarD, (nwt) wgpVar.c0.get(), (dnc) wgpVar.Z.get(), wgpVar.C(), (clm) wgpVar.U.get(), wgpVar.z(), (iuj) wgpVar.a0.get(), d0rVar, w6e0Var, gei0Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new nrj0(this, (byte) 13)), k4n0.R0);
    }
}
