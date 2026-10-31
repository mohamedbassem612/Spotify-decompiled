package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.nowplaying.scroll.ScrollCardType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wfc implements owo0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ wfc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // p.owo0
    public final tka0 e() {
        switch (this.a) {
            case 0:
                return rc11.a.b(pwo0.class);
            case 1:
                return rc11.a.b(swo0.class);
            case 2:
                return rc11.a.b(wwo0.class);
            case 3:
                return rc11.a.b(zwo0.class);
            case 4:
                return rc11.a.b(cxo0.class);
            case 5:
                return rc11.a.b(lxo0.class);
            case 6:
                return rc11.a.b(oxo0.class);
            default:
                return rc11.a.b(rxo0.class);
        }
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        lfo lfoVar;
        h6w h6wVar;
        ujo ujoVar;
        lfo lfoVar2;
        n0o n0oVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ji50Var.b.put(pwo0.class, new r3r(new wzq(fdg1.m0(((xvp) obj).a(ji50Var.a, 1, false), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), iub.b1), wnb.t, (vu30) null));
                break;
            case 1:
                ji50Var.b.put(swo0.class, new r3r(new wzq(fdg1.m0(((mmr) obj).a(ji50Var.a), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), rdk.d), yzj.g, (vu30) null));
                break;
            case 2:
                evp evpVar = (evp) obj;
                d0r d0rVar = ji50Var.a;
                switch (evpVar.a) {
                    case 0:
                        nwp nwpVar = (nwp) ((gbp) evpVar.b).c;
                        lzn0 lzn0Var = (lzn0) nwpVar.G.get();
                        gw70 gw70VarA0 = nwpVar.a.a0();
                        c8o.l(gw70VarA0);
                        lfoVar = new lfo((byte) 0, d0rVar, gw70VarA0, lzn0Var);
                        break;
                    default:
                        thq thqVar = (thq) evpVar.b;
                        lfoVar = new lfo((byte) 0, d0rVar, (gw70) thqVar.b.d8.get(), (lzn0) ((v5q) thqVar.c).U0.get());
                        break;
                }
                ji50Var.b.put(wwo0.class, new r3r(new wzq(fdg1.m0(lfoVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), kfo.e), ido.d, (vu30) null));
                break;
            case 3:
                fvp fvpVar = (fvp) obj;
                d0r d0rVar2 = ji50Var.a;
                switch (fvpVar.a) {
                    case 0:
                        nwp nwpVar2 = (nwp) ((gbp) fvpVar.b).c;
                        lzn0 lzn0Var2 = (lzn0) nwpVar2.G.get();
                        gw70 gw70VarA1 = nwpVar2.a.a0();
                        c8o.l(gw70VarA1);
                        h6wVar = new h6w(d0rVar2, gw70VarA1, lzn0Var2);
                        break;
                    default:
                        thq thqVar2 = (thq) fvpVar.b;
                        h6wVar = new h6w(d0rVar2, (gw70) thqVar2.b.d8.get(), (lzn0) ((v5q) thqVar2.c).U0.get());
                        break;
                }
                ji50Var.b.put(zwo0.class, new r3r(new wzq(fdg1.m0(h6wVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), j5w.b1), fdv.U0, (vu30) null));
                break;
            case 4:
                ivp ivpVar = (ivp) obj;
                d0r d0rVar3 = ji50Var.a;
                switch (ivpVar.a) {
                    case 0:
                        gw70 gw70VarA2 = ((nwp) ((gbp) ivpVar.b).c).a.a0();
                        c8o.l(gw70VarA2);
                        ujoVar = new ujo(gw70VarA2, d0rVar3);
                        break;
                    default:
                        ujoVar = new ujo((gw70) ((thq) ivpVar.b).b.d8.get(), d0rVar3);
                        break;
                }
                ji50Var.b.put(cxo0.class, new r3r(new wzq(fdg1.m0(ujoVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), jl30.X0), bp30.c, (vu30) null));
                break;
            case 5:
                l0x0 l0x0Var = (l0x0) obj;
                d0r d0rVar4 = ji50Var.a;
                a1r0 a1r0Var = (a1r0) l0x0Var.b;
                gw70 gw70Var = (gw70) l0x0Var.c;
                ji50Var.b.put(lxo0.class, new r3r(new wzq(fdg1.m0(new qlb(d0rVar4, a1r0Var, gw70Var, new qlb(d0rVar4, gw70Var, (lzn0) l0x0Var.d)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), z1f0.f), x5d0.c1, (vu30) null));
                break;
            case 6:
                nvp nvpVar = (nvp) obj;
                d0r d0rVar5 = ji50Var.a;
                switch (nvpVar.a) {
                    case 0:
                        nwp nwpVar3 = (nwp) ((gbp) nvpVar.b).c;
                        lzn0 lzn0Var3 = (lzn0) nwpVar3.G.get();
                        gw70 gw70VarA3 = nwpVar3.a.a0();
                        c8o.l(gw70VarA3);
                        lfoVar2 = new lfo((byte) 1, d0rVar5, gw70VarA3, lzn0Var3);
                        break;
                    default:
                        thq thqVar3 = (thq) nvpVar.b;
                        lfoVar2 = new lfo((byte) 1, d0rVar5, (gw70) thqVar3.b.d8.get(), (lzn0) ((v5q) thqVar3.c).U0.get());
                        break;
                }
                ji50Var.b.put(oxo0.class, new r3r(new wzq(fdg1.m0(lfoVar2, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), fii0.c1), ish0.c1, (vu30) null));
                break;
            default:
                gvp gvpVar = (gvp) obj;
                d0r d0rVar6 = ji50Var.a;
                switch (gvpVar.a) {
                    case 0:
                        nwp nwpVar4 = (nwp) ((gbp) gvpVar.b).c;
                        lzn0 lzn0Var4 = (lzn0) nwpVar4.G.get();
                        sd41 sd41Var = (sd41) ((teq) nwpVar4.a.c).ea.get();
                        c8o.l(sd41Var);
                        em0 em0Var = nwpVar4.a;
                        gw70 gw70VarA4 = em0Var.a0();
                        c8o.l(gw70VarA4);
                        yqg yqgVar = (yqg) nwpVar4.i.get();
                        c8o.l((Context) nwpVar4.b.d);
                        fod0 fod0Var = new fod0(yqgVar);
                        qaq0 qaq0Var = new qaq0(false, false, (luk) nwpVar4.g.get());
                        gw70 gw70VarA5 = em0Var.a0();
                        c8o.l(gw70VarA5);
                        RetrofitMaker retrofitMakerM0 = em0Var.M0();
                        c8o.l(retrofitMakerM0);
                        unk.a.getClass();
                        fnk fnkVar = (fnk) retrofitMakerM0.createWebgateService(fnk.class, "android-ontour-concert-friend-matcher-impl");
                        uu00 uu00VarP = em0Var.P();
                        c8o.l(uu00VarP);
                        utw0 utw0Var = new utw0(uu00VarP);
                        xh71 xh71VarX0 = em0Var.X0();
                        c8o.l(xh71VarX0);
                        i4q i4qVarI = em0Var.I();
                        c8o.l(i4qVarI);
                        v1k v1kVar = new v1k(i4qVarI, new xy40((lzn0) nwpVar4.G.get()), new bb01(wyj.C(), (byte) 8), (byte) 3);
                        a1r0 a1r0VarA0 = em0Var.A0();
                        c8o.l(a1r0VarA0);
                        lzn0 lzn0Var5 = (lzn0) nwpVar4.G.get();
                        kt91 kt91VarD1 = em0Var.d1();
                        c8o.l(kt91VarD1);
                        v1k v1kVar2 = new v1k(kt91VarD1, (Resources) nwpVar4.f.get(), wyj.C(), (byte) 4);
                        lc20 lc20VarC = wyj.C();
                        q8n q8nVarG0 = em0Var.g0();
                        c8o.l(q8nVarG0);
                        q8n q8nVarB0 = em0Var.b0();
                        c8o.l(q8nVarB0);
                        n0oVar = new n0o(lzn0Var4, sd41Var, gw70VarA4, fod0Var, qaq0Var, new lag(gw70VarA5, new cnk(fnkVar, utw0Var, xh71VarX0, v1kVar, a1r0VarA0, lzn0Var5, v1kVar2, lc20VarC, q8nVarG0, q8nVarB0), wyj.C(), new ynk((luk) nwpVar4.g.get()), (byte) 14), d0rVar6);
                        break;
                    default:
                        thq thqVar4 = (thq) gvpVar.b;
                        v5q v5qVar = (v5q) thqVar4.c;
                        lzn0 lzn0Var6 = (lzn0) v5qVar.U0.get();
                        sd41 sd41Var2 = (sd41) v5qVar.C6.get();
                        gw70 gw70Var2 = (gw70) thqVar4.b.d8.get();
                        fod0 fod0Var2 = (fod0) v5qVar.B6.get();
                        daq daqVar = v5qVar.b;
                        qaq0 qaq0Var2 = new qaq0(false, false, (luk) daqVar.L1.get());
                        gw70 gw70Var3 = (gw70) daqVar.d8.get();
                        RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar.Y3.get();
                        unk.a.getClass();
                        n0oVar = new n0o(lzn0Var6, sd41Var2, gw70Var2, fod0Var2, qaq0Var2, new lag(gw70Var3, new cnk((fnk) retrofitMaker.createWebgateService(fnk.class, "android-ontour-concert-friend-matcher-impl"), new utw0((uu00) daqVar.a5.get()), (xh71) v5qVar.i4.get(), new v1k((i4q) v5qVar.v2.get(), (xy40) v5qVar.D6.get(), new bb01(wyj.C(), (byte) 8), (byte) 3), (a1r0) v5qVar.k1.get(), (lzn0) v5qVar.U0.get(), new v1k((kt91) daqVar.f8.get(), (Resources) v5qVar.X0.get(), wyj.C(), (byte) 4), wyj.C(), (q8n) daqVar.V2.get(), (q8n) daqVar.E1.get()), wyj.C(), new ynk((luk) daqVar.L1.get()), (byte) 14), d0rVar6);
                        break;
                }
                ji50Var.b.put(rxo0.class, new r3r(new wzq(fdg1.m0(n0oVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), cwp0.c1), w0q0.g, (vu30) null));
                break;
        }
    }
}
