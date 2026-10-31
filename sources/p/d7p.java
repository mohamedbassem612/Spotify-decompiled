package p;

import android.app.Activity;
import android.content.Context;
import android.os.Parcelable;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.mobius.extras.QueueingEventSubject;
import com.spotify.player.model.Context$Metadata;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d7p implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d7p(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        toj0 toj0Var = (toj0) this.c;
        q7r0 q7r0Var = (q7r0) toj0Var.c;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) ((wsm) toj0Var.b).a.get());
        }
        if (b == 1) {
            return cwl1.C(q7r0Var);
        }
        if (b == 2) {
            return new v8p((byte) 0);
        }
        if (b == 3) {
            return u1n0.z(q7r0Var);
        }
        jah.e(b);
        return null;
    }

    private final Object b() {
        p2o0 p2o0Var = (p2o0) this.c;
        q7r0 q7r0Var = (q7r0) p2o0Var.c;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) ((ntm) p2o0Var.b).b.get());
        }
        if (b == 1) {
            return cwl1.C(q7r0Var);
        }
        if (b == 2) {
            return new v8p((byte) 1);
        }
        if (b == 3) {
            return u1n0.z(q7r0Var);
        }
        jah.e(b);
        return null;
    }

    private final Object c() {
        g1i g1iVar = (g1i) this.c;
        q7r0 q7r0Var = (q7r0) g1iVar.c;
        byte b = this.b;
        if (b == 0) {
            return new QueueingEventSubject();
        }
        if (b == 1) {
            return new x8p(this);
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        hik1 hik1Var = (hik1) ((hbn) g1iVar.b).f.get();
        c8o.l(hik1Var);
        iac0 iac0Var = q7r0Var.d.c;
        c8o.m(iac0Var);
        return hik1Var.a(iac0Var, u1n0.z(q7r0Var));
    }

    private final Object d() {
        ip31 ip31Var = (ip31) this.c;
        q7r0 q7r0Var = (q7r0) ip31Var.d;
        ddn ddnVar = (ddn) ip31Var.c;
        byte b = this.b;
        if (b == 0) {
            return cwl1.C(q7r0Var);
        }
        if (b == 1) {
            ttm0 ttm0VarE = cwl1.E(q7r0Var);
            c8o.m(ttm0VarE);
            return ttm0VarE;
        }
        if (b == 2) {
            Context context = (Context) ddnVar.a.get();
            c8o.l(context);
            ut71 ut71Var = (ut71) ddnVar.e.get();
            c8o.l(ut71Var);
            return new ycn(context, ut71Var);
        }
        if (b != 3) {
            if (b != 4) {
                jah.e(b);
                return null;
            }
            i8h1 i8h1Var = (i8h1) ddnVar.b.get();
            c8o.l(i8h1Var);
            return i8h1Var;
        }
        gw70 gw70Var = (gw70) ddnVar.c.get();
        c8o.l(gw70Var);
        oql oqlVar = new oql((d7p) ip31Var.h, (edn) ip31Var.b);
        lko lkoVar = (lko) ddnVar.j.get();
        c8o.l(lkoVar);
        agc0 agc0Var = (agc0) ddnVar.k.get();
        c8o.l(agc0Var);
        return new xcn(gw70Var, oqlVar, lkoVar, agc0Var);
    }

    private final Object e() {
        byte b = this.b;
        if (b == 0) {
            return new y8p(this);
        }
        if (b == 1) {
            return new z8p(this);
        }
        if (b == 2) {
            return new a9p(this);
        }
        if (b == 3) {
            return new b9p(this);
        }
        if (b == 4) {
            return new c9p(this);
        }
        jah.e(b);
        return null;
    }

    private final Object f() {
        f9p f9pVar = (f9p) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new f1o(this, (byte) 1);
            case 1:
                return new lyo(this, (byte) 3);
            case 2:
                return new myo(this, (byte) 3);
            case 3:
                return (yqg) ((e1o) f9pVar.t).a;
            case 4:
                return (nwt) ((e1o) f9pVar.t).i;
            case 5:
                e1o e1oVar = (e1o) f9pVar.t;
                return new clm((mr20) e1oVar.j, (c3s) e1oVar.h);
            case 6:
                d7p d7pVar = (d7p) f9pVar.O0;
                e1o e1oVar2 = (e1o) f9pVar.t;
                return bhb.o(xqu.a(d7pVar), (d7p) f9pVar.P0, xqu.a((d7p) f9pVar.Q0), (h5q) e1oVar2.o, (b7r0) e1oVar2.l, xqu.a((d7p) f9pVar.R0), xqu.a((d7p) f9pVar.S0), (ov20) e1oVar2.k, (yqg) ((d7p) f9pVar.X).get(), (iac0) e1oVar2.C, (n3d0) e1oVar2.p, (String) e1oVar2.y, new bn70((p6r0) e1oVar2.z, (lik1) e1oVar2.A, (nar0) null), (g3q0) e1oVar2.s, (upp0) e1oVar2.I, Optional.empty(), Optional.empty());
            case 7:
                return ((cyp) xqu.a((d7p) f9pVar.N0).get()).d();
            case 8:
                return (cyp) ((e1o) f9pVar.t).B;
            case 9:
                return PlayOrigin.builder("artist_playback_manager").referrerIdentifier("creator").build();
            case 10:
                return ((cyp) xqu.a((d7p) f9pVar.N0).get()).a();
            case 11:
                return (xrc0) ((e1o) f9pVar.t).m;
            case 12:
                return ((zut0) ((e1o) f9pVar.t).n).a(new lb3(xqu.a((d7p) f9pVar.N0), (byte) 4), xqu.a((d7p) f9pVar.P0));
            case 13:
                return new nyo(this, (byte) 4);
            case 14:
                return (ugn0) ((e1o) f9pVar.t).u;
            case 15:
                return null;
            case 16:
                return new oyo(this, (byte) 4);
            case 17:
                return (ku71) xqu.a((d7p) f9pVar.W0).get();
            case 18:
                e1o e1oVar3 = (e1o) f9pVar.t;
                return new ku71((dma1) e1oVar3.v, (nfa0) e1oVar3.J, new du71());
            case 19:
                return new hfw0((i8h1) ((kly0) ((e1o) f9pVar.t).r).get());
            case 20:
                return new nfw0(brt.x(), (d7p) f9pVar.X, (d7p) f9pVar.U0, (d7p) f9pVar.Y, (d7p) f9pVar.Z, (d7p) f9pVar.V0, (d7p) f9pVar.Q0, (d7p) f9pVar.X0, (jly0) f9pVar.c);
            case 21:
                e1o e1oVar4 = (e1o) f9pVar.t;
                xfx xfxVar = (xfx) e1oVar4.w;
                lzn0 lzn0Var = (lzn0) e1oVar4.d;
                return new luj(xfxVar, (gw70) e1oVar4.c, (agc0) e1oVar4.x, lzn0Var, false);
            case 22:
                return new pyo(this, (byte) 3);
            case 23:
                return new e9p(this, (byte) 0);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        u9p u9pVar = (u9p) this.c;
        w7x w7xVar = w7x.a;
        b7x b7xVar = b7x.a;
        byte b = this.b;
        switch (b) {
            case 0:
                return new m9p(this);
            case 1:
                return new cgf1();
            case 2:
                return new kc8();
            case 3:
                l1o l1oVar = (l1o) u9pVar.D;
                zle1 zle1Var = (zle1) ((i1o) u9pVar.C).C0.get();
                c8o.l(zle1Var);
                iac0 iac0VarO = u9pVar.o();
                bt6 bt6Var = (bt6) u9pVar.c.get();
                int iC = l1d.C(l1oVar.b);
                if (iC == 0) {
                    return new bme1(zle1Var, iac0VarO, bt6Var);
                }
                if (iC == 1) {
                    return oco0.a;
                }
                eg.o();
                return null;
            case 4:
                l1o l1oVar2 = (l1o) u9pVar.D;
                zle1 zle1Var2 = (zle1) ((i1o) u9pVar.C).C0.get();
                c8o.l(zle1Var2);
                iac0 iac0VarO2 = u9pVar.o();
                int iC2 = l1d.C(l1oVar2.b);
                if (iC2 == 0) {
                    return new dt6(zle1Var2, iac0VarO2);
                }
                if (iC2 == 1) {
                    return obo0.a;
                }
                eg.o();
                return null;
            case 5:
                l1o l1oVar3 = (l1o) u9pVar.D;
                zle1 zle1Var3 = (zle1) ((i1o) u9pVar.C).C0.get();
                c8o.l(zle1Var3);
                iac0 iac0VarO3 = u9pVar.o();
                int iC3 = l1d.C(l1oVar3.b);
                if (iC3 == 0) {
                    return new ame1(zle1Var3, iac0VarO3);
                }
                if (iC3 == 1) {
                    return nco0.a;
                }
                eg.o();
                return null;
            case 6:
                return cwl1.C((q7r0) u9pVar.E);
            case 7:
                return new r5b0((d0r) u9pVar.f.get());
            case 8:
                Context contextE = u9pVar.e();
                q7r0 q7r0Var = (q7r0) u9pVar.E;
                zwz0 zwz0Var = (zwz0) ((i1o) u9pVar.C).G0.get();
                c8o.l(zwz0Var);
                xf4 xf4VarC = u9pVar.c();
                l1o l1oVar4 = (l1o) u9pVar.D;
                oev0 oev0Var = new oev0(contextE);
                if (l1oVar4.b == 1 && xf4VarC.o()) {
                    fn31.T(zso1.H(q7r0Var.d.c.getLifecycle()), (o8n) null, 0, new glu0(zwz0Var.c(), oev0Var, new qa2(q7r0Var, (byte) 12), (lnm) null, (byte) 5), 3);
                }
                return oev0Var;
            case 9:
                return new n9p(this);
            case 10:
                lzn0 lzn0Var = (lzn0) ((i1o) u9pVar.C).l.get();
                c8o.l(lzn0Var);
                return lzn0Var;
            case 11:
                opv0 opv0Var = (opv0) ((i1o) u9pVar.C).w0.get();
                c8o.l(opv0Var);
                return opv0Var;
            case 12:
                return new dzo(this, (byte) 2);
            case 13:
                i1o i1oVar = (i1o) u9pVar.C;
                i1o i1oVar2 = (i1o) u9pVar.C;
                xfx xfxVarD = i1oVar.d();
                c8o.l(xfxVarD);
                lzn0 lzn0Var2 = (lzn0) ((d7p) u9pVar.G).get();
                agc0 agc0Var = (agc0) i1oVar2.z0.get();
                c8o.l(agc0Var);
                gw70 gw70VarE = i1oVar2.e();
                c8o.l(gw70VarE);
                return new d460(xfxVarD, gw70VarE, agc0Var, lzn0Var2, false);
            case 14:
                return new o9p(this);
            case 15:
                return new p9p(this);
            case 16:
                vgm vgmVar = (vgm) ((i1o) u9pVar.C).q0.get();
                c8o.l(vgmVar);
                return vgmVar;
            case 17:
                return (jr6) xqu.a((d7p) u9pVar.M).get();
            case 18:
                zeu0 zeu0Var = (zeu0) ((i1o) u9pVar.C).F0.get();
                c8o.l(zeu0Var);
                String strF = u9pVar.f();
                zwz0 zwz0Var2 = (zwz0) ((i1o) u9pVar.C).G0.get();
                c8o.l(zwz0Var2);
                ynb0 ynb0VarA = xqu.a((d7p) u9pVar.K);
                ynb0 ynb0VarA2 = xqu.a((d7p) u9pVar.L);
                String strG = u9pVar.g();
                fns fnsVar = igu.a;
                b3s b3sVar = b3s.c;
                return new jr6(zeu0Var, strF, zwz0Var2, ynb0VarA, ynb0VarA2, strG, brt.x());
            case 19:
                l1o l1oVar5 = (l1o) u9pVar.D;
                myq0 myq0Var = new myq0((q7r0) u9pVar.E);
                iac0 iac0VarO4 = u9pVar.o();
                ruz ruzVarA = u9pVar.t().a();
                b0d0 b0d0Var = (b0d0) ((i1o) u9pVar.C).I.get();
                c8o.l(b0d0Var);
                String strF2 = u9pVar.f();
                huz huzVar = new huz((Object) null, (byte) 10);
                huz huzVar2 = new huz(b7xVar, (byte) 10);
                return b0d0Var.b(strF2, new huz(w7xVar, (byte) 10), iac0VarO4, ruzVarA, huzVar, tot0.a(myq0Var.get()), huzVar2, new huz(Collections.singletonMap(Context$Metadata.KEY_REPORTING_URI, l1oVar5.a), (byte) 10));
            case 20:
                l1o l1oVar6 = (l1o) u9pVar.D;
                myq0 myq0Var2 = new myq0((q7r0) u9pVar.E);
                iac0 iac0VarO5 = u9pVar.o();
                ruz ruzVarA2 = u9pVar.t().a();
                b0d0 b0d0Var2 = (b0d0) ((i1o) u9pVar.C).I.get();
                c8o.l(b0d0Var2);
                String strG2 = u9pVar.g();
                huz huzVar3 = new huz((Object) null, (byte) 10);
                huz huzVar4 = new huz(b7xVar, (byte) 10);
                return b0d0Var2.b(strG2, new huz(w7xVar, (byte) 10), iac0VarO5, ruzVarA2, huzVar3, tot0.a(myq0Var2.get()), huzVar4, new huz(Collections.singletonMap(Context$Metadata.KEY_REPORTING_URI, l1oVar6.a), (byte) 10));
            case 21:
                return new q9p(this);
            case 22:
                i1o i1oVar3 = (i1o) u9pVar.C;
                yqg yqgVarA = i1oVar3.a();
                c8o.l(yqgVarA);
                Context contextC = i1oVar3.c();
                c8o.l(contextC);
                gw70 gw70VarE2 = i1oVar3.e();
                c8o.l(gw70VarE2);
                lzn0 lzn0Var3 = (lzn0) ((d7p) u9pVar.G).get();
                vgm vgmVar2 = (vgm) ((d7p) u9pVar.J).get();
                htr htrVar = (htr) i1oVar3.H0.get();
                c8o.l(htrVar);
                luk lukVar = (luk) i1oVar3.j.get();
                c8o.l(lukVar);
                c8o.l((ggv) i1oVar3.w.get());
                ycm ycmVar = (ycm) i1oVar3.y.get();
                c8o.l(ycmVar);
                c3s c3sVar = (c3s) i1oVar3.E0.get();
                c8o.l(c3sVar);
                nwt nwtVar = (nwt) i1oVar3.I0.get();
                c8o.l(nwtVar);
                mr20 mr20Var = (mr20) i1oVar3.J0.get();
                c8o.l(mr20Var);
                ov20 ov20Var = (ov20) i1oVar3.i.get();
                c8o.l(ov20Var);
                b7r0 b7r0Var = (b7r0) i1oVar3.d0.get();
                c8o.l(b7r0Var);
                xrc0 xrc0VarF = i1oVar3.f();
                c8o.l(xrc0VarF);
                zut0 zut0Var = (zut0) i1oVar3.L0.get();
                c8o.l(zut0Var);
                c8o.l((e7p0) i1oVar3.T0.get());
                h5q h5qVar = (h5q) i1oVar3.K0.get();
                c8o.l(h5qVar);
                n3d0 n3d0Var = (n3d0) i1oVar3.S0.get();
                c8o.l(n3d0Var);
                ojv0 ojv0Var = (ojv0) i1oVar3.R0.get();
                c8o.l(ojv0Var);
                d7p d7pVar = (d7p) u9pVar.N;
                c8o.l((w701) i1oVar3.W0.get());
                g3q0 g3q0Var = (g3q0) i1oVar3.U0.get();
                c8o.l(g3q0Var);
                e9g1 e9g1Var = (e9g1) i1oVar3.f1.get();
                c8o.l(e9g1Var);
                c8o.l((RetrofitMaker) i1oVar3.V0.get());
                ugn0 ugn0Var = (ugn0) i1oVar3.X0.get();
                c8o.l(ugn0Var);
                dma1 dma1Var = (dma1) i1oVar3.Y0.get();
                c8o.l(dma1Var);
                xfx xfxVarD2 = i1oVar3.d();
                c8o.l(xfxVarD2);
                agc0 agc0Var2 = (agc0) i1oVar3.z0.get();
                c8o.l(agc0Var2);
                String str = ((l1o) u9pVar.D).c;
                c8o.m(str);
                p6r0 p6r0VarP = u9pVar.p();
                lik1 lik1VarZ = u9pVar.z();
                cyp cypVarT = u9pVar.t();
                iac0 iac0VarO6 = u9pVar.o();
                qns0 qns0Var = (qns0) i1oVar3.a1.get();
                c8o.l(qns0Var);
                vb2 vb2Var = (vb2) i1oVar3.b1.get();
                c8o.l(vb2Var);
                yh2 yh2Var = (yh2) i1oVar3.u.get();
                c8o.l(yh2Var);
                zr00 zr00Var = (zr00) i1oVar3.e1.get();
                c8o.l(zr00Var);
                y390 y390Var = (y390) i1oVar3.v0.get();
                c8o.l(y390Var);
                upp0 upp0Var = (upp0) i1oVar3.N0.get();
                c8o.l(upp0Var);
                nfa0 nfa0Var = (nfa0) i1oVar3.Z0.get();
                c8o.l(nfa0Var);
                f9p f9pVar = new f9p(new e1o(yqgVarA, contextC, gw70VarE2, lzn0Var3, vgmVar2, htrVar, lukVar, ycmVar, c3sVar, nwtVar, mr20Var, ov20Var, b7r0Var, xrc0VarF, zut0Var, h5qVar, n3d0Var, ojv0Var, d7pVar, g3q0Var, e9g1Var, ugn0Var, dma1Var, xfxVarD2, agc0Var2, str, p6r0VarP, lik1VarZ, cypVarT, iac0VarO6, qns0Var, vb2Var, yh2Var, zr00Var, y390Var, upp0Var, nfa0Var));
                return new r2o(new f1o(f9pVar, (byte) 0), (zei0) ((jly0) f9pVar.i).get());
            case 23:
                return u1n0.z((q7r0) u9pVar.E);
            case 24:
                return u9pVar.t().d();
            case 25:
                njv0 njv0Var = (njv0) ((i1o) u9pVar.C).h1.get();
                c8o.l(njv0Var);
                return njv0Var;
            case 26:
                yqg yqgVarA2 = ((i1o) u9pVar.C).a();
                c8o.l(yqgVarA2);
                return new fiv0(yqgVarA2);
            case 27:
                return new r9p(this);
            case 28:
                return new s9p(this);
            case 29:
                return new t9p(this);
            case 30:
                h5q h5qVar2 = (h5q) ((i1o) u9pVar.C).K0.get();
                c8o.l(h5qVar2);
                return new orj1(h5qVar2, u9pVar.t(), (PlayOrigin) ((d7p) u9pVar.R).get());
            case 31:
                return new myq0((q7r0) u9pVar.E).get();
            case 32:
                return new g9p(this);
            case 33:
                return new vyo(this, (byte) 1);
            case 34:
                h9n0 h9n0Var = (h9n0) ((i1o) u9pVar.C).a.get();
                c8o.l(h9n0Var);
                return h9n0Var;
            case 35:
                xzj1 xzj1Var = (xzj1) ((i1o) u9pVar.C).b.get();
                c8o.l(xzj1Var);
                return xzj1Var;
            case 36:
                return new br0(brt.x(), (lzn0) ((d7p) u9pVar.G).get());
            case 37:
                return new h9p(this);
            case 38:
                return new i9p(this);
            case 39:
                return new j9p(this);
            case 40:
                return new k9p(this);
            case 41:
                yzc0 yzc0Var = (yzc0) ((d7p) u9pVar.K).get();
                yzc0 yzc0Var2 = (yzc0) ((d7p) u9pVar.L).get();
                zwz0 zwz0Var3 = (zwz0) ((i1o) u9pVar.C).G0.get();
                c8o.l(zwz0Var3);
                return new np6(yzc0Var, yzc0Var2, zwz0Var3);
            case 42:
                return new jyo((byte) 1);
            case 43:
                return new rzo(this, (byte) 2);
            case 44:
                return new l9p(this);
            case BetamaxPlaybackSession.MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER /* 45 */:
                return new hoc(((Boolean) ((i1o) u9pVar.C).y0.get()).booleanValue(), new goc(2131165599, 2131165598));
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object h() {
        wdm wdmVar = (wdm) this.c;
        vfo vfoVar = (vfo) wdmVar.b;
        byte b = this.b;
        switch (b) {
            case 0:
                Activity activityA = vfoVar.a();
                c8o.l(activityA);
                Activity activityA2 = vfoVar.a();
                c8o.l(activityA2);
                Context context = (Context) vfoVar.j.get();
                c8o.l(context);
                return new oe70(activityA, new k9r(activityA2, mw60.w(context, wdmVar.q(), wdmVar.s()), (pic) ((jly0) wdmVar.i).get(), (byte) 25));
            case 1:
                Activity activityA3 = vfoVar.a();
                c8o.l(activityA3);
                gw70 gw70Var = (gw70) vfoVar.n.get();
                c8o.l(gw70Var);
                hl00 hl00Var = new hl00(gw70Var, (byte) 14);
                j3a j3aVar = (j3a) vfoVar.h.get();
                c8o.l(j3aVar);
                return new fe70(activityA3, hl00Var, j3aVar);
            case 2:
                return new y9p((byte) 0);
            case 3:
                woa woaVar = (woa) vfoVar.T.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) vfoVar.S.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) vfoVar.U.get();
                c8o.l(fpaVar);
                pe peVar = (pe) vfoVar.R.get();
                c8o.l(peVar);
                boolean zBooleanValue = ((Boolean) vfoVar.V.get()).booleanValue();
                zle1 zle1Var = (zle1) vfoVar.W.get();
                c8o.l(zle1Var);
                return new k0t(woaVar, kmaVar, fpaVar, peVar, zBooleanValue, zle1Var);
            case 4:
                return new wnd1();
            case 5:
                pic picVar = new pic();
                picVar.a = true;
                return picVar;
            case 6:
                t8u0 t8u0Var = (t8u0) vfoVar.q.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) wdmVar.d, t8u0Var);
            case 7:
                skm skmVar = (skm) vfoVar.r.get();
                c8o.l(skmVar);
                return skmVar.a(((cyp) ((jly0) wdmVar.t).get()).a(), wdmVar.x(), ((cyp) ((jly0) wdmVar.t).get()).d());
            case 8:
                return new ie70(wdmVar.q(), (w470) ((jly0) wdmVar.Y).get());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object i() {
        z9p z9pVar = (z9p) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new qso((es20) ((jly0) z9pVar.f).get());
            case 1:
                return new es20((oso) ((jly0) z9pVar.b).get(), new i6b((eg40) ((d7p) z9pVar.l).get(), (byte) 25), z9pVar.c(), (c9n) ((jly0) z9pVar.e).get());
            case 2:
                return new oso();
            case 3:
                return new eg40((mh40) ((jly0) z9pVar.c).get());
            case 4:
                RetrofitMaker retrofitMaker = (RetrofitMaker) ((iso) z9pVar.j).d.get();
                c8o.l(retrofitMaker);
                return (mh40) retrofitMaker.createWebgateService(mh40.class, "android-bluejay-data-impl", wrn.d);
            case 5:
                d7p d7pVar = (d7p) z9pVar.l;
                lct lctVar = new lct();
                lctVar.a = d7pVar;
                return lctVar;
            case 6:
                d7p d7pVar2 = (d7p) z9pVar.n;
                d7p d7pVar3 = (d7p) z9pVar.o;
                d7p d7pVar4 = (d7p) z9pVar.p;
                d7p d7pVar5 = (d7p) z9pVar.q;
                lvj lvjVar = new lvj((byte) 1);
                lvjVar.b = d7pVar2;
                lvjVar.c = d7pVar3;
                lvjVar.d = d7pVar4;
                lvjVar.e = d7pVar5;
                return lvjVar;
            case 7:
                pe peVar = (pe) ((uso) z9pVar.k).d.get();
                c8o.l(peVar);
                return peVar;
            case 8:
                gw70 gw70Var = (gw70) ((uso) z9pVar.k).b.get();
                c8o.l(gw70Var);
                return gw70Var;
            case 9:
                a8e0 a8e0Var = (a8e0) ((uso) z9pVar.k).a.get();
                c8o.l(a8e0Var);
                return a8e0Var;
            case 10:
                jtl1 jtl1Var = (jtl1) ((uso) z9pVar.k).c.get();
                c8o.l(jtl1Var);
                return jtl1Var;
            case 11:
                d7p d7pVar6 = (d7p) z9pVar.s;
                d7p d7pVar7 = (d7p) z9pVar.t;
                d7p d7pVar8 = (d7p) z9pVar.u;
                d7p d7pVar9 = (d7p) z9pVar.v;
                d7p d7pVar10 = (d7p) z9pVar.w;
                d7p d7pVar11 = (d7p) z9pVar.x;
                uct uctVar = new uct();
                uctVar.a = d7pVar6;
                uctVar.b = d7pVar7;
                uctVar.c = d7pVar8;
                uctVar.d = d7pVar9;
                uctVar.e = d7pVar10;
                uctVar.f = d7pVar11;
                return uctVar;
            case 12:
                Context context = (Context) ((iso) z9pVar.j).a.get();
                c8o.l(context);
                return context;
            case 13:
                ut71 ut71Var = (ut71) ((iso) z9pVar.j).b.get();
                c8o.l(ut71Var);
                return ut71Var;
            case 14:
                mr20 mr20Var = (mr20) ((iso) z9pVar.j).c.get();
                c8o.l(mr20Var);
                return mr20Var;
            case 15:
                gtt gttVar = (gtt) ((iso) z9pVar.j).e.get();
                c8o.l(gttVar);
                return gttVar;
            case 16:
                zhe0 zhe0Var = (zhe0) ((iso) z9pVar.j).f.get();
                c8o.l(zhe0Var);
                return zhe0Var;
            case 17:
                return new whe0((coe0) ((jly0) z9pVar.d).get());
            case 18:
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) ((iso) z9pVar.j).d.get();
                c8o.l(retrofitMaker2);
                return (coe0) retrofitMaker2.createWebgateService(coe0.class, "android-bluejay-data-impl");
            case 19:
                d7p d7pVar12 = (d7p) z9pVar.n;
                d7p d7pVar13 = (d7p) z9pVar.o;
                d7p d7pVar14 = (d7p) z9pVar.p;
                d7p d7pVar15 = (d7p) z9pVar.q;
                lvj lvjVar2 = new lvj((byte) 0);
                lvjVar2.b = d7pVar12;
                lvjVar2.c = d7pVar13;
                lvjVar2.d = d7pVar14;
                lvjVar2.e = d7pVar15;
                return lvjVar2;
            case 20:
                return cto1.q(((q7r0) z9pVar.a).d.c);
            case 21:
                return new s0s();
            case 22:
                r2r r2rVar = (r2r) ((iso) z9pVar.j).h.get();
                c8o.l(r2rVar);
                return new n1n0(r2rVar);
            case 23:
                return new l2u();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object j() {
        f0a f0aVar = (f0a) this.c;
        byte b = 1;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new vyo(this, (byte) 2);
            case 1:
                h9n0 h9n0Var = ((eto) f0aVar.b).J;
                c8o.l(h9n0Var);
                return h9n0Var;
            case 2:
                xzj1 xzj1Var = ((eto) f0aVar.b).K;
                c8o.l(xzj1Var);
                return xzj1Var;
            case 3:
                return ((eto) f0aVar.b).p0;
            case 4:
                return new s7p(this, (byte) 1);
            case 5:
                return new aap(this);
            case 6:
                return new bap(this);
            case 7:
                return new p4p(this, b);
            case 8:
                return new cap(this);
            case 9:
                dvp dvpVar = ((eto) f0aVar.b).N;
                c8o.l(dvpVar);
                return dvpVar;
            case 10:
                fcq fcqVar = ((eto) f0aVar.b).O;
                c8o.l(fcqVar);
                return fcqVar;
            case 11:
                String str = ((eto) f0aVar.b).r0;
                c8o.l(str);
                f0a f0aVar2 = (f0a) ((dap) ((jly0) f0aVar.N0).get()).a.c;
                h481 h481Var = ((eto) f0aVar2.b).b0;
                c8o.l(h481Var);
                Flowable flowable = ((eto) f0aVar2.b).k;
                c8o.l(flowable);
                Set set = s4b1.f;
                String strH = uic.x(str).h();
                nqz0 nqz0Var = new nqz0(2);
                Boolean bool = Boolean.TRUE;
                t881 t881Var = new t881(new y381(new e3z((aqa0) null, (List) null, Collections.singletonMap("link", bool)), new x381((List) null, sqg0.J(new mmr0[]{new mmr0("link", bool), new mmr0("trailerUri", bool), new mmr0("playabilityRestriction", bool), new mmr0("resumeEpisodeLink", bool)})), 4));
                e481 e481Var = new e481(t881Var, (nia1) null, nqz0Var, 196605);
                return Observable.combineLatest(h481Var.c.a(h481Var.b.b(strH, j6p1.q(e481Var), t881Var), g481.a, new d061(h481Var.a, (byte) 6)).map(new lqc(e481Var.q, (byte) 24)).onErrorComplete(), new ObservableFromPublisher(flowable), bbn.W0).replay(1).f();
            case 12:
                return new dap(this);
            case 13:
                String str2 = ((eto) f0aVar.b).r0;
                c8o.l(str2);
                rcq rcqVar = ((eto) f0aVar.b).r;
                c8o.l(rcqVar);
                return new yc8(str2, (uu00) rcqVar.a.b.a5.get());
            case 14:
                return new eap(this);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object k() {
        nap napVar = (nap) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new gap(this, (byte) 0);
            case 1:
                return new hap(this);
            case 2:
                return new iap(this);
            case 3:
                return new jap(this);
            case 4:
                return new kap(this);
            case 5:
                return new bzo(this, (byte) 2);
            case 6:
                return new k0t(napVar.q, napVar.r, napVar.s, napVar.t, napVar.u.booleanValue(), napVar.v);
            case 7:
                return new lap(this);
            case 8:
                return new map(this, (byte) 0);
            case 9:
                return new yyo(this, (byte) 1);
            case 10:
                return new fap(this, (byte) 0);
            case 11:
                return new xyo(this, (byte) 1);
            case 12:
                return new vyo(this, (byte) 3);
            case 13:
                return new s7p(this, (byte) 2);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object l() {
        fvo fvoVar = (fvo) ((t7p) this.c).b;
        byte b = this.b;
        if (b == 0) {
            qz6 qz6Var = (qz6) fvoVar.c.get();
            c8o.l(qz6Var);
            return qz6Var;
        }
        if (b == 1) {
            j9a1 j9a1Var = (j9a1) fvoVar.e.get();
            c8o.l(j9a1Var);
            return j9a1Var;
        }
        if (b == 2) {
            return new oap(this);
        }
        jah.e(b);
        return null;
    }

    private final Object m() {
        pap papVar = (pap) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return (t1r) papVar.b.get();
            case 1:
                return new t1r((dma1) papVar.a.d.get());
            case 2:
                return new fal((lc4) papVar.d.get(), papVar.e, papVar.f, (q8n) papVar.a.b.get());
            case 3:
                return (lc4) papVar.a.e.get();
            case 4:
                return (ttz) papVar.a.a.get();
            case 5:
                return new dal((t2j0) papVar.a.c.get(), (lc4) papVar.d.get());
            case 6:
                t1r t1rVar = (t1r) papVar.c.get();
                k2q k2qVar = new k2q((Object) t1rVar, (Object) papVar.g, (byte) 25);
                return rqt0.u(hu20.e(hu20.e(hu20.c(yoi1.g(t1rVar.b()), new eum(k2qVar, (lnm) null, (byte) 15)), new ms4((lnm) null, k2qVar, (byte) 2)), new z1r((lnm) null, k2qVar, (byte) 2)));
            case 7:
                return hu20.c((mr20) papVar.h.get(), new jte(2, (lnm) null, (byte) 14));
            case 8:
                Observable observableI = yoi1.i((mr20) papVar.i.get(), o6x.a);
                c8o.m(observableI);
                return observableI;
            case 9:
                return (t1r) papVar.b.get();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object n() {
        uap uapVar = (uap) this.c;
        i691 i691Var = i691.a;
        byte b = 0;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                ras rasVar = (ras) uapVar.H;
                ras rasVar2 = (ras) uapVar.H;
                xfx xfxVarA0 = rasVar.a0();
                c8o.l(xfxVarA0);
                sap sapVar = (sap) uapVar.x.get();
                vy90 vy90VarE0 = rasVar2.E0();
                c8o.l(vy90VarE0);
                Flowable flowable = (Flowable) uapVar.a.get();
                fl3 fl3VarK = rasVar2.K();
                c8o.l(fl3VarK);
                yl1 yl1Var = new yl1(flowable, fl3VarK, (lik1) uapVar.o.get());
                ynb0 ynb0VarA = xqu.a((d7p) uapVar.V);
                ynb0 ynb0VarA2 = xqu.a((d7p) uapVar.W);
                FlowableMap flowableMapE = uapVar.e();
                uu00 uu00VarA = rasVar2.A();
                c8o.l(uu00VarA);
                d0r d0rVar = (d0r) uapVar.m.get();
                vbs vbsVarN = rasVar2.n();
                c8o.l(vbsVarN);
                q8n q8nVarG = rasVar2.g();
                c8o.l(q8nVarG);
                luk lukVarW = rasVar2.w();
                c8o.l(lukVarW);
                dxy dxyVar = new dxy((Object) flowableMapE, (Object) uu00VarA, (Object) d0rVar, (Object) vbsVarN, (Object) q8nVarG, (Object) new gn4(false, lukVarW), (byte) 17);
                ynb0 ynb0VarA3 = xqu.a((d7p) uapVar.X);
                Flowable flowable2 = (Flowable) uapVar.a.get();
                w9u0 w9u0Var = (w9u0) uapVar.b.get();
                ip91 ip91Var = rasVar2.y().a;
                c8o.m(ip91Var);
                jp91 jp91Var = rasVar2.y().d;
                c8o.m(jp91Var);
                mzr0 mzr0VarA = jp91Var.a((iac0) uapVar.B.get(), (lik1) uapVar.o.get(), (n6r0) uapVar.s.get());
                jo91 jo91Var = rasVar2.y().b;
                c8o.m(jo91Var);
                sas sasVarC = uapVar.c();
                g7h g7hVarE0 = rasVar2.e0();
                c8o.l(g7hVarE0);
                p410 p410Var = new p410(flowable2, w9u0Var, ip91Var, mzr0VarA, jo91Var, sasVarC, g7hVarE0, (byte) 24);
                ynb0 ynb0VarA4 = xqu.a((d7p) uapVar.Y);
                ynb0 ynb0VarA5 = xqu.a((d7p) uapVar.Z);
                ynb0 ynb0VarA6 = xqu.a((d7p) uapVar.a0);
                ynb0 ynb0VarA7 = xqu.a((d7p) uapVar.b0);
                ynb0 ynb0VarA8 = xqu.a((d7p) uapVar.c0);
                ynb0 ynb0VarA9 = xqu.a((d7p) uapVar.e0);
                ynb0 ynb0VarA10 = xqu.a((d7p) uapVar.g0);
                Flowable flowable3 = (Flowable) uapVar.a.get();
                a1r0 a1r0Var = (a1r0) ((d7p) uapVar.O).get();
                uvy uvyVarQ0 = rasVar2.q0();
                c8o.l(uvyVarQ0);
                q8n q8nVarE = rasVar2.e();
                c8o.l(q8nVarE);
                luk lukVarW2 = rasVar2.w();
                c8o.l(lukVarW2);
                duy duyVar = new duy(flowable3, a1r0Var, uvyVarQ0, q8nVarE, new wu4(false, lukVarW2));
                Flowable flowable4 = (Flowable) uapVar.a.get();
                xh71 xh71VarZ = rasVar2.z();
                c8o.l(xh71VarZ);
                fbm fbmVarL = rasVar2.L();
                c8o.l(fbmVarL);
                u601 u601VarT = rasVar2.t();
                c8o.l(u601VarT);
                hq41 hq41VarD = rasVar2.D();
                c8o.l(hq41VarD);
                me30 me30VarK = rasVar2.k();
                c8o.l(me30VarK);
                Flowable flowableF = rasVar2.f();
                c8o.l(flowableF);
                f771 f771VarO = rasVar2.O();
                c8o.l(f771VarO);
                poj0 poj0Var = new poj0(hq41VarD, me30VarK, flowableF, f771VarO, (byte) 15);
                f771 f771VarO2 = rasVar2.O();
                c8o.l(f771VarO2);
                q8n q8nVarD = rasVar2.d();
                c8o.l(q8nVarD);
                iac0 iac0Var = (iac0) uapVar.B.get();
                luk lukVarW3 = rasVar2.w();
                c8o.l(lukVarW3);
                o671 o671Var = new o671(flowable4, xh71VarZ, fbmVarL, u601VarT, poj0Var, f771VarO2, q8nVarD, iac0Var, lukVarW3);
                FlowableMap flowableMapE2 = uapVar.e();
                Flowable flowable5 = (Flowable) uapVar.f.get();
                qmg qmgVarV = rasVar2.V();
                c8o.l(qmgVarV);
                o3e0 o3e0VarW = rasVar2.W();
                oj3 oj3VarM = rasVar2.M();
                c8o.l(oj3VarM);
                v3i0 v3i0Var = new v3i0(flowableMapE2, flowable5, qmgVarV, o3e0VarW, oj3VarM);
                c9c0 c9c0VarL = rasVar2.l();
                c8o.l(c9c0VarL);
                g5p0 g5p0VarU = rasVar2.u();
                c8o.l(g5p0VarU);
                waz0 waz0VarY = rasVar2.Y();
                c8o.l(waz0VarY);
                v6z0 v6z0Var = new v6z0(c9c0VarL, g5p0VarU, waz0VarY);
                Flowable flowable6 = (Flowable) uapVar.a.get();
                d0r d0rVar2 = (d0r) uapVar.m.get();
                boolean zBooleanValue = ((Boolean) uapVar.E.get()).booleanValue();
                w9u0 w9u0Var2 = (w9u0) uapVar.b.get();
                u961 u961VarK0 = rasVar2.k0();
                ajq0 ajq0VarT0 = rasVar2.t0();
                c3s c3sVarB = rasVar2.B();
                c8o.l(c3sVarB);
                dma1 dma1VarP0 = rasVar2.P0();
                c8o.l(dma1VarP0);
                e68 e68Var = new e68(flowable6, d0rVar2, zBooleanValue, w9u0Var2, u961VarK0, ajq0VarT0, c3sVarB, new in01(dma1VarP0));
                FlowableMap flowableMapE3 = uapVar.e();
                lid lidVarL0 = rasVar2.L0();
                c8o.l(lidVarL0);
                lkd lkdVarV = mid.v(lidVarL0);
                ip91 ip91Var2 = rasVar2.y().a;
                c8o.m(ip91Var2);
                luk lukVarW4 = rasVar2.w();
                c8o.l(lukVarW4);
                vm4 vm4Var = new vm4(false, false, false, lukVarW4);
                Scheduler schedulerO = rasVar2.o();
                c8o.l(schedulerO);
                FlowableObserveOn flowableObserveOnL = Flowable.g(flowableMapE3.X(new lqr(lkdVarV, (byte) 5)), flowableMapE3.X(new pas(ip91Var2, (byte) 0)), flowableMapE3.J(u321.W0), Flowable.I(Boolean.valueOf(vm4Var.a())), new pvc((byte) 6)).L(schedulerO);
                FlowableJust flowableJustY = k9o0.y((hnl) uapVar.i.get());
                Flowable flowable7 = (Flowable) uapVar.a.get();
                o241 o241VarI = rasVar2.i();
                c8o.l(o241VarI);
                uwh uwhVarJ = rasVar2.J();
                c8o.l(uwhVarJ);
                lid lidVarL1 = rasVar2.L0();
                c8o.l(lidVarL1);
                lkd lkdVarV2 = mid.v(lidVarL1);
                pqq0 pqq0Var = (pqq0) uapVar.F.get();
                yqg yqgVarA = rasVar2.a();
                c8o.l(yqgVarA);
                Scheduler schedulerO2 = rasVar2.o();
                c8o.l(schedulerO2);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedK = ioo1.K(flowable7, o241VarI, uwhVarJ, lkdVarV2, pqq0Var, yqgVarA, schedulerO2);
                ynb0 ynb0VarA11 = xqu.a((d7p) uapVar.h0);
                ynb0 ynb0VarA12 = xqu.a(uapVar.G);
                n6r0 n6r0Var = (n6r0) uapVar.s.get();
                lik1 lik1Var = (lik1) uapVar.o.get();
                luk lukVarW5 = rasVar2.w();
                c8o.l(lukVarW5);
                return new was(xfxVarA0, sapVar, vy90VarE0, yl1Var, ynb0VarA, ynb0VarA2, dxyVar, ynb0VarA3, p410Var, ynb0VarA4, ynb0VarA5, ynb0VarA6, ynb0VarA7, ynb0VarA8, ynb0VarA9, ynb0VarA10, duyVar, o671Var, v3i0Var, v6z0Var, e68Var, flowableObserveOnL, flowableJustY, flowableDistinctUntilChangedK, ynb0VarA11, ynb0VarA12, n6r0Var, lik1Var, new vm4(false, false, false, lukVarW5), w3p0.g((jnk0) uapVar.q.get()), new vsy((Flowable) uapVar.a.get(), (w9u0) uapVar.b.get(), (d0r) uapVar.m.get(), rasVar2.v0()), xqu.a((d7p) uapVar.i0), rasVar2.a1());
            case 1:
                return new sap(this, b);
            case 2:
                return k9o0.B((q2p0) uapVar.I);
            case 3:
                return k9o0.z((q2p0) uapVar.I);
            case 4:
                return ((q2p0) uapVar.I).f();
            case 5:
                return f2u0.B(uapVar.k(), (Flowable) uapVar.d.get(), (Flowable) uapVar.e.get(), uapVar.a());
            case 6:
                jly0 jly0Var = uapVar.a;
                ras rasVar3 = (ras) uapVar.H;
                Flowable flowable8 = (Flowable) jly0Var.get();
                Scheduler schedulerO3 = rasVar3.o();
                c8o.l(schedulerO3);
                yqg yqgVarA2 = rasVar3.a();
                c8o.l(yqgVarA2);
                return f2u0.z(flowable8, schedulerO3, yqgVarA2, uapVar.a());
            case 7:
                return f2u0.y((Flowable) uapVar.a.get(), uapVar.a());
            case 8:
                return new a62((p2p0) uapVar.g.get(), (byte) 3);
            case 9:
                return ((q2p0) uapVar.I).j();
            case 10:
                return k9o0.r((q2p0) uapVar.I);
            case 11:
                return new l0y((p2p0) uapVar.g.get(), (byte) 2);
            case 12:
                return new k0y((p2p0) uapVar.g.get(), (byte) 2);
            case 13:
                return ((q2p0) uapVar.I).g();
            case 14:
                return k9o0.t((q2p0) uapVar.I);
            case 15:
                lzn0 lzn0VarC = ((ras) uapVar.H).c();
                c8o.l(lzn0VarC);
                return aan0.p(lzn0VarC);
            case 16:
                jly0 jly0Var2 = uapVar.o;
                ras rasVar4 = (ras) uapVar.H;
                lik1 lik1Var2 = (lik1) jly0Var2.get();
                ssf1 ssf1VarP = rasVar4.p();
                c8o.l(ssf1VarP);
                c3s c3sVarB2 = rasVar4.B();
                c8o.l(c3sVarB2);
                luk lukVarW6 = rasVar4.w();
                c8o.l(lukVarW6);
                an4 an4Var = new an4(false, lukVarW6);
                luk lukVarW7 = rasVar4.w();
                c8o.l(lukVarW7);
                return new cmf1(lik1Var2, ssf1VarP, c3sVarB2, an4Var, new uu4(false, lukVarW7), rasVar4.q());
            case 17:
                return ((q2p0) uapVar.I).e();
            case 18:
                jly0 jly0Var3 = uapVar.q;
                ras rasVar5 = (ras) uapVar.H;
                jnk0 jnk0Var = (jnk0) jly0Var3.get();
                gw70 gw70VarB = rasVar5.b();
                c8o.l(gw70VarB);
                d0r d0rVar3 = (d0r) uapVar.m.get();
                luk lukVarW8 = rasVar5.w();
                c8o.l(lukVarW8);
                return new yxb0(jnk0Var, gw70VarB, d0rVar3, new fn4(false, lukVarW8));
            case 19:
                Flowable flowable9 = (Flowable) uapVar.a.get();
                Flowable flowable10 = (Flowable) uapVar.d.get();
                c3s c3sVarB3 = ((ras) uapVar.H).B();
                c8o.l(c3sVarB3);
                return new jnk0(flowable9, flowable10, c3sVarB3);
            case 20:
                Flowable flowable11 = (Flowable) uapVar.a.get();
                Flowable flowable12 = (Flowable) uapVar.f.get();
                w9u0 w9u0Var3 = (w9u0) uapVar.b.get();
                o241 o241VarI2 = ((ras) uapVar.H).i();
                c8o.l(o241VarI2);
                return new ktf1(flowable11, flowable12, w9u0Var3, i691Var, o241VarI2, (d7p) uapVar.K, uapVar.c());
            case 21:
                s4p0 s4p0VarR = ((ras) uapVar.H).R();
                c8o.l(s4p0VarR);
                return w3p0.B(s4p0VarR);
            case 22:
                return ((q2p0) uapVar.I).h();
            case 23:
                return ((q2p0) uapVar.I).i();
            case 24:
                Flowable flowable13 = (Flowable) uapVar.a.get();
                Flowable flowable14 = (Flowable) uapVar.f.get();
                w9u0 w9u0Var4 = (w9u0) uapVar.b.get();
                o241 o241VarI3 = ((ras) uapVar.H).i();
                c8o.l(o241VarI3);
                return new ekf1(flowable13, flowable14, w9u0Var4, i691Var, o241VarI3, (d7p) uapVar.K, uapVar.c());
            case 25:
                return new FlowableOnBackpressureLatest((PublishProcessor) uapVar.t.get());
            case 26:
                return new PublishProcessor();
            case 27:
                return new tap(this, b);
            case 28:
                return ((ras) uapVar.H).b0();
            case 29:
                a1r0 a1r0VarC = ((ras) uapVar.H).C();
                c8o.l(a1r0VarC);
                return a1r0VarC;
            case 30:
                return w3p0.w(((ras) uapVar.H).H(), (q2p0) uapVar.I, (o2p0) uapVar.r.get());
            case 31:
                return new a4f0((Flowable) uapVar.a.get(), (Flowable) uapVar.f.get(), (w9u0) uapVar.b.get());
            case 32:
                return new ww9(uapVar.f());
            case 33:
                a1g1 a1g1Var = new a1g1(((ras) uapVar.H).F(), (byte) 11);
                Scheduler schedulerO4 = ((ras) uapVar.H).o();
                c8o.l(schedulerO4);
                return new h280(a1g1Var, schedulerO4);
            case 34:
                s4p0 s4p0VarR2 = ((ras) uapVar.H).R();
                c8o.l(s4p0VarR2);
                return w3p0.z(s4p0VarR2);
            case 35:
                s4p0 s4p0VarR3 = ((ras) uapVar.H).R();
                c8o.l(s4p0VarR3);
                return w3p0.A(s4p0VarR3);
            case 36:
                jly0 jly0Var4 = uapVar.a;
                ras rasVar6 = (ras) uapVar.H;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var4.get());
                z6k0 z6k0VarM0 = rasVar6.M0();
                c8o.l(z6k0VarM0);
                mnk0 mnk0VarM = rasVar6.m();
                c8o.l(mnk0VarM);
                rxj0 rxj0VarG0 = rasVar6.G0();
                c8o.l(rxj0VarG0);
                return new k6k0(flowableDistinctUntilChangedD, z6k0VarM0, mnk0VarM, rxj0VarG0);
            case 37:
                jly0 jly0Var5 = uapVar.a;
                ras rasVar7 = (ras) uapVar.H;
                Flowable flowable15 = (Flowable) jly0Var5.get();
                Flowable flowable16 = (Flowable) uapVar.z.get();
                w9u0 w9u0Var5 = (w9u0) uapVar.b.get();
                Consumer consumer = (Consumer) uapVar.A.get();
                luk lukVarW9 = rasVar7.w();
                c8o.l(lukVarW9);
                jn4 jn4Var = new jn4(lukVarW9);
                dma1 dma1VarM0 = rasVar7.m0();
                c8o.l(dma1VarM0);
                return new mo51(flowable15, flowable16, w9u0Var5, consumer, jn4Var, dma1VarM0);
            case 38:
                return f2u0.C(uapVar.k(), (Flowable) uapVar.y.get(), (Flowable) uapVar.e.get(), uapVar.a());
            case 39:
                jly0 jly0Var6 = uapVar.a;
                ras rasVar8 = (ras) uapVar.H;
                Flowable flowable17 = (Flowable) jly0Var6.get();
                Scheduler schedulerO5 = rasVar8.o();
                c8o.l(schedulerO5);
                yqg yqgVarA3 = rasVar8.a();
                c8o.l(yqgVarA3);
                return f2u0.A(flowable17, schedulerO5, yqgVarA3, uapVar.a());
            case 40:
                return new lrj0((q2p0) uapVar.I, (byte) 21);
            case 41:
                FlowableMap flowableMapE4 = uapVar.e();
                ras rasVar9 = (ras) uapVar.H;
                mo51 mo51Var = (mo51) ((d7p) uapVar.V).get();
                Scheduler schedulerO6 = rasVar9.o();
                c8o.l(schedulerO6);
                Flowable flowable18 = (Flowable) uapVar.a.get();
                Flowable flowable19 = (Flowable) uapVar.z.get();
                uvy uvyVarQ1 = rasVar9.q0();
                c8o.l(uvyVarQ1);
                d0r d0rVar4 = (d0r) uapVar.m.get();
                q8n q8nVarG2 = rasVar9.g();
                c8o.l(q8nVarG2);
                luk lukVarW10 = rasVar9.w();
                c8o.l(lukVarW10);
                hv4 hv4Var = new hv4(false, false, false, lukVarW10);
                dma1 dma1VarM1 = rasVar9.m0();
                c8o.l(dma1VarM1);
                acl aclVar = new acl(flowable18, flowable19, uvyVarQ1, d0rVar4, q8nVarG2, hv4Var, dma1VarM1);
                w9u0 w9u0Var6 = (w9u0) uapVar.b.get();
                Consumer consumer2 = (Consumer) uapVar.A.get();
                dma1 dma1VarM2 = rasVar9.m0();
                c8o.l(dma1VarM2);
                zr51 zr51Var = new zr51(w9u0Var6, consumer2, dma1VarM2);
                luk lukVarW11 = rasVar9.w();
                c8o.l(lukVarW11);
                y441 y441Var = new y441(schedulerO6, aclVar, zr51Var, new zu4(false, lukVarW11));
                xfx xfxVarA1 = rasVar9.a0();
                c8o.l(xfxVarA1);
                return new rt01(flowableMapE4, mo51Var, y441Var, xfxVarA1);
            case 42:
                ras rasVar10 = (ras) uapVar.H;
                ras rasVar11 = (ras) uapVar.H;
                tp91 tp91Var = rasVar10.y().e;
                c8o.m(tp91Var);
                u3q u3qVar = rasVar10.y().f;
                c8o.m(u3qVar);
                hj91 hj91VarA = j991.A(tp91Var, u3qVar.a(), new a0m((p2p0) uapVar.g.get(), (byte) 19));
                Flowable flowable20 = (Flowable) uapVar.a.get();
                xyl1 xyl1VarP0 = rasVar11.p0();
                c8o.l(xyl1VarP0);
                up41 up41Var = new up41(xyl1VarP0, (byte) 12);
                kt91 kt91VarJ = rasVar11.j();
                c8o.l(kt91VarJ);
                return new dm91(hj91VarA, flowable20, up41Var, new a78(kt91VarJ));
            case 43:
                return k9o0.v((q2p0) uapVar.I);
            case 44:
                return new s691(uapVar.k(), (Flowable) uapVar.f.get(), uapVar.g(), (w9u0) uapVar.b.get());
            case BetamaxPlaybackSession.MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER /* 45 */:
                return new k691((Flowable) uapVar.a.get(), (Flowable) uapVar.f.get(), (w9u0) uapVar.b.get(), nrq0.a, i691Var);
            case BetamaxPlaybackSession.MEDIA_TYPE_FIELD_NUMBER /* 46 */:
                return new dx0((Flowable) uapVar.a.get(), (xbu0) uapVar.C.get());
            case BetamaxPlaybackSession.MS_PLAYED_INTERNAL_FIELD_NUMBER /* 47 */:
                return k9o0.A((q2p0) uapVar.I);
            case BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER /* 48 */:
                FlowableMap flowableMapK = uapVar.k();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedJ = f2u0.j((Flowable) uapVar.a.get());
                Flowable flowableG = uapVar.g();
                Flowable flowable21 = (Flowable) uapVar.f.get();
                w9u0 w9u0Var7 = (w9u0) uapVar.b.get();
                yp91 yp91VarL = uapVar.l();
                im51 im51Var = (im51) uapVar.D.get();
                luk lukVarW12 = ((ras) uapVar.H).w();
                c8o.l(lukVarW12);
                return new am51(flowableMapK, flowableDistinctUntilChangedJ, flowableG, flowable21, w9u0Var7, yp91VarL, im51Var, new kn4(false, lukVarW12));
            case BetamaxPlaybackSession.MS_PLAYED_PER_SURFACE_FIELD_NUMBER /* 49 */:
                yqg yqgVarA4 = ((ras) uapVar.H).a();
                c8o.l(yqgVarA4);
                return new im51(yqgVarA4);
            case BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER /* 50 */:
                FlowableMap flowableMapK2 = uapVar.k();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedJ2 = f2u0.j((Flowable) uapVar.a.get());
                Flowable flowableG2 = uapVar.g();
                Flowable flowable22 = (Flowable) uapVar.f.get();
                w9u0 w9u0Var8 = (w9u0) uapVar.b.get();
                yp91 yp91VarL2 = uapVar.l();
                im51 im51Var2 = (im51) uapVar.D.get();
                luk lukVarW13 = ((ras) uapVar.H).w();
                c8o.l(lukVarW13);
                return new qm51(flowableMapK2, flowableDistinctUntilChangedJ2, flowableG2, flowable22, w9u0Var8, yp91VarL2, im51Var2, new kn4(false, lukVarW13));
            case 51:
                ras rasVar12 = (ras) uapVar.H;
                ras rasVar13 = (ras) uapVar.H;
                pta1 pta1VarI = rasVar12.I();
                c8o.l(pta1VarI);
                Observable map = pta1VarI.a().map(u9x0.P0);
                FlowableMap flowableMapE5 = uapVar.e();
                pta1 pta1VarI2 = rasVar13.I();
                c8o.l(pta1VarI2);
                ynb0 ynb0VarA13 = xqu.a((d7p) uapVar.d0);
                luk lukVarW14 = rasVar13.w();
                c8o.l(lukVarW14);
                return new bs0(map, flowableMapE5, pta1VarI2, ynb0VarA13, lukVarW14);
            case BetamaxPlaybackSession.DID_ATTEMPT_TO_PLAY_FIELD_NUMBER /* 52 */:
                dg30 dg30VarZ = ((ras) uapVar.H).Z();
                c8o.l(dg30VarZ);
                lik1 lik1Var3 = (lik1) uapVar.o.get();
                lua1 lua1VarQ = ((ras) uapVar.H).Q();
                c8o.l(lua1VarQ);
                return lua1VarQ.a(dg30VarZ, lik1Var3);
            case BetamaxPlaybackSession.MS_PLAYED_AUDIBLE_FIELD_NUMBER /* 53 */:
                Flowable flowable23 = (Flowable) uapVar.a.get();
                FlowableMap flowableMapK3 = uapVar.k();
                h991 h991VarP = ((ras) uapVar.H).P();
                c8o.l(h991VarP);
                return new bs0(flowable23, flowableMapK3, h991VarP, xqu.a((d7p) uapVar.f0));
            case BetamaxPlaybackSession.PLAYBACK_ID_FIELD_NUMBER /* 54 */:
                y991 y991VarT = ((ras) uapVar.H).T();
                c8o.l(y991VarT);
                return y991VarT;
            case BetamaxPlaybackSession.PLAYER_ID_FIELD_NUMBER /* 55 */:
                return Boolean.valueOf(((q2p0) uapVar.I).a());
            case BetamaxPlaybackSession.MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER /* 56 */:
                return k9o0.x((q2p0) uapVar.I);
            case 57:
                return ((ras) uapVar.H).i0();
            case 58:
                return new mtf((PublishProcessor) uapVar.t.get(), (byte) 1);
            case 59:
                return ((ras) uapVar.H).e1();
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object o() {
        yap yapVar = (yap) this.c;
        toj0 toj0Var = yapVar.a;
        byte b = this.b;
        if (b == 0) {
            return new yfl((fai1) ((RetrofitMaker) ((kly0) toj0Var.g).get()).createWebgateService(fai1.class, "android-devicelocation-consent-impl"), (prt) yapVar.b.get());
        }
        if (b == 1) {
            return new prt((t2j0) ((kly0) toj0Var.e).get());
        }
        if (b == 2) {
            return new kst();
        }
        if (b == 3) {
            return new gtt(new aje0((Context) ((kly0) toj0Var.b).get(), (byte) 0), (qrt) ((kly0) toj0Var.f).get(), (yqg) ((kly0) toj0Var.c).get(), (crt) yapVar.e.get(), new ptf1((gai1) ((RetrofitMaker) ((kly0) toj0Var.g).get()).createWebgateService(gai1.class, "android-devicelocation-configurationimpl"), (prt) yapVar.b.get(), (byte) 23), (vfl) yapVar.c.get(), (prt) yapVar.b.get());
        }
        if (b == 4) {
            return new crt();
        }
        jah.e(b);
        return null;
    }

    private final Object p() {
        wxo wxoVar = (wxo) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new r060(xqu.a((d7p) wxoVar.e), (byte) 0);
            case 1:
                return new avs(xqu.a((d7p) wxoVar.d));
            case 2:
                Set set = (Set) ((wtt) wxoVar.b).j.get();
                c8o.l(set);
                return set;
            case 3:
                return new tks(xqu.a((d7p) wxoVar.g), xqu.a((d7p) wxoVar.i), xqu.a((d7p) wxoVar.k));
            case 4:
                Set set2 = (Set) ((wtt) wxoVar.b).c.get();
                c8o.l(set2);
                return set2;
            case 5:
                return new nur(xqu.a((d7p) wxoVar.h));
            case 6:
                Set set3 = (Set) ((wtt) wxoVar.b).f.get();
                c8o.l(set3);
                return set3;
            case 7:
                return new aqr(xqu.a((d7p) wxoVar.j));
            case 8:
                Set set4 = (Set) ((wtt) wxoVar.b).y.get();
                c8o.l(set4);
                return set4;
            case 9:
                return new smp0(xqu.a((d7p) wxoVar.f86p), xqu.a((d7p) wxoVar.n));
            case 10:
                d7p d7pVar = (d7p) wxoVar.g;
                wtt wttVar = (wtt) wxoVar.b;
                ynb0 ynb0VarA = xqu.a(d7pVar);
                ynb0 ynb0VarA2 = xqu.a((d7p) wxoVar.m);
                gur gurVar = (gur) wttVar.m.get();
                c8o.l(gurVar);
                i8h1 i8h1VarZ = u1n0.z((q7r0) wxoVar.c);
                g0l g0lVarA = wttVar.a();
                c8o.l(g0lVarA);
                return new oks(ynb0VarA, new xtt(xqu.a((d7p) wxoVar.o), ynb0VarA2), gurVar, i8h1VarZ, g0lVarA, xqu.a((d7p) wxoVar.n));
            case 11:
                Set set5 = (Set) ((wtt) wxoVar.b).e.get();
                c8o.l(set5);
                return set5;
            case 12:
                return new uks(xqu.a((d7p) wxoVar.g));
            case 13:
                return new sev();
            case 14:
                return new res(xqu.a((d7p) wxoVar.s), xqu.a((d7p) wxoVar.t), xqu.a((d7p) wxoVar.u), xqu.a((d7p) wxoVar.z), xqu.a((d7p) wxoVar.A));
            case 15:
                return new oos(xqu.a((d7p) wxoVar.r));
            case 16:
                Set set6 = (Set) ((wtt) wxoVar.b).i.get();
                c8o.l(set6);
                return set6;
            case 17:
                g0l g0lVarA2 = ((wtt) wxoVar.b).a();
                c8o.l(g0lVarA2);
                gur gurVar2 = (gur) ((wtt) wxoVar.b).m.get();
                c8o.l(gurVar2);
                return new ker(g0lVarA2, gurVar2);
            case 18:
                fyk0 fyk0Var = (fyk0) ((wtt) wxoVar.b).x.get();
                c8o.l(fyk0Var);
                return fyk0Var;
            case 19:
                return new yp50(xqu.a((d7p) wxoVar.y), (byte) 0);
            case 20:
                return new wp50(xqu.a((d7p) wxoVar.v), xqu.a((d7p) wxoVar.w), xqu.a((d7p) wxoVar.x));
            case 21:
                bur burVar = (bur) ((wtt) wxoVar.b).C.get();
                c8o.l(burVar);
                return burVar;
            case 22:
                return new cur(xqu.a((d7p) wxoVar.u));
            case 23:
                qzs qzsVar = (qzs) ((wtt) wxoVar.b).D.get();
                c8o.l(qzsVar);
                return qzsVar;
            case 24:
                return new cb0(xqu.a((d7p) wxoVar.w), (byte) 0);
            case 25:
                wtt wttVar2 = (wtt) wxoVar.b;
                wtt wttVar3 = (wtt) wxoVar.b;
                g0l g0lVarA3 = wttVar2.a();
                c8o.l(g0lVarA3);
                f2l f2lVar = (f2l) wttVar3.g.get();
                c8o.l(f2lVar);
                efr efrVar = new efr(xqu.a((d7p) wxoVar.C), (byte) 5);
                Context context = (Context) wttVar3.h.get();
                c8o.l(context);
                Flowable flowable = (Flowable) wttVar3.v.get();
                c8o.l(flowable);
                return new rer(g0lVarA3, f2lVar, efrVar, context, flowable, xqu.a((d7p) wxoVar.k));
            case 26:
                Set set7 = (Set) ((wtt) wxoVar.b).p.get();
                c8o.l(set7);
                return set7;
            case 27:
                d8s d8sVar = (d8s) ((wtt) wxoVar.b).k.get();
                c8o.l(d8sVar);
                return d8sVar;
            case 28:
                return new s2s(xqu.a((d7p) wxoVar.l), xqu.a((d7p) wxoVar.F), xqu.a((d7p) wxoVar.G));
            case 29:
                z141 z141Var = (z141) ((wtt) wxoVar.b).q.get();
                c8o.l(z141Var);
                return z141Var;
            case 30:
                return new cb0(xqu.a((d7p) wxoVar.u), (byte) 2);
            case 31:
                ynb0 ynb0VarA3 = xqu.a((d7p) wxoVar.d);
                ynb0 ynb0VarA4 = xqu.a((d7p) wxoVar.K);
                ynb0 ynb0VarA5 = xqu.a((d7p) wxoVar.L);
                dpb dpbVar = (dpb) ((wtt) wxoVar.b).z.get();
                c8o.l(dpbVar);
                return new b0s(ynb0VarA3, ynb0VarA4, ynb0VarA5, dpbVar, xqu.a((d7p) wxoVar.M));
            case 32:
                ynb0 ynb0VarA6 = xqu.a((d7p) wxoVar.I);
                ynb0 ynb0VarA7 = xqu.a((d7p) wxoVar.u);
                ynb0 ynb0VarA8 = xqu.a((d7p) wxoVar.J);
                dpb dpbVar2 = (dpb) ((wtt) wxoVar.b).E.get();
                c8o.l(dpbVar2);
                return new rwj(ynb0VarA6, ynb0VarA7, ynb0VarA8, dpbVar2);
            case 33:
                gur gurVar3 = (gur) ((wtt) wxoVar.b).m.get();
                c8o.l(gurVar3);
                return new ojr(gurVar3);
            case 34:
                g0l g0lVarA4 = ((wtt) wxoVar.b).a();
                c8o.l(g0lVarA4);
                return new rjr(g0lVarA4);
            case 35:
                return new cx0((byte) 9);
            case 36:
                return new dwr();
            case 37:
                wtt wttVar4 = (wtt) wxoVar.b;
                wtt wttVar5 = (wtt) wxoVar.b;
                g0l g0lVarA5 = wttVar4.a();
                c8o.l(g0lVarA5);
                dpb dpbVar3 = (dpb) wttVar5.A.get();
                c8o.l(dpbVar3);
                dpb dpbVar4 = (dpb) wttVar5.B.get();
                c8o.l(dpbVar4);
                return new r0s(g0lVarA5, dpbVar3, dpbVar4);
            case 38:
                wtt wttVar6 = (wtt) wxoVar.b;
                wtt wttVar7 = (wtt) wxoVar.b;
                g0l g0lVarA6 = wttVar6.a();
                c8o.l(g0lVarA6);
                dpb dpbVar5 = (dpb) wttVar7.A.get();
                c8o.l(dpbVar5);
                dpb dpbVar6 = (dpb) wttVar7.B.get();
                c8o.l(dpbVar6);
                return new q0s(g0lVarA6, dpbVar5, dpbVar6);
            case 39:
                return new tm(xqu.a((d7p) wxoVar.v), xqu.a((d7p) wxoVar.Q), xqu.a((d7p) wxoVar.R));
            case 40:
                return new cb0(xqu.a((d7p) wxoVar.w), (byte) 1);
            case 41:
                return new ldo(xqu.a((d7p) wxoVar.v), xqu.a((d7p) wxoVar.w), (byte) 22);
            case 42:
                return new cb0(xqu.a((d7p) wxoVar.u), (byte) 3);
            case 43:
                i8h1 i8h1VarZ2 = u1n0.z((q7r0) wxoVar.c);
                l6h1 l6h1Var = (l6h1) ((q7r0) wxoVar.c).b(l6h1.class);
                c8o.m(l6h1Var);
                gw70 gw70Var = (gw70) ((wtt) wxoVar.b).t.get();
                c8o.l(gw70Var);
                return new its(i8h1VarZ2, l6h1Var, gw70Var);
            case 44:
                return pzm.h((mos) ((wtt) wxoVar.b).w.get());
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        d460 lujVar;
        e1o e1oVar;
        byte b = this.a;
        Object obj = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                tnm tnmVar = (tnm) obj;
                q7r0 q7r0Var = (q7r0) tnmVar.d;
                byj byjVar = (byj) tnmVar.c;
                if (b2 == 0) {
                    t701 t701VarL = byjVar.l();
                    c8o.l(t701VarL);
                    return new e5b0(30, Collections.singletonList(t701VarL), (List) null);
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        return cwl1.C(q7r0Var);
                    }
                    if (b2 != 3) {
                        jah.e(b2);
                        return null;
                    }
                    uu00 uu00VarA = byjVar.A();
                    c8o.l(uu00VarA);
                    xh71 xh71VarZ = byjVar.z();
                    c8o.l(xh71VarZ);
                    return new ujq0(uu00VarA, new vr51(xh71VarZ, (byte) 29));
                }
                d0r d0rVar = (d0r) ((jly0) tnmVar.f).get();
                ebg1 ebg1Var = (ebg1) byjVar.g.get();
                c8o.l(ebg1Var);
                myq0 myq0Var = new myq0(q7r0Var);
                iac0 iac0Var = q7r0Var.d.c;
                c8o.m(iac0Var);
                d0r d0rVar2 = (d0r) ((jly0) tnmVar.f).get();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                yon1.G1("READALONG_SHARE", "readalong/share", 1629, "readalong");
                itq itqVar = (itq) ((jly0) new f0a(ebg1Var.a.create(), (uot0) myq0Var, iac0Var).Q0).get();
                mhc mhcVar = new mhc((byte) 24);
                f0a f0aVar = (f0a) itqVar.a.c;
                c8o.l(((cbg1) f0aVar.b).c());
                nfb nfbVar = new nfb((byte) 17, false);
                xv81 xv81Var = new xv81((byte) 5);
                et90 et90VarU = f0aVar.u();
                cbg1 cbg1Var = (cbg1) f0aVar.b;
                qj0 qj0Var = new qj0(f0aVar.A(), f0aVar.z());
                zhy zhyVarQ = f0aVar.q();
                u710 u710VarR = f0aVar.r();
                ldo ldoVar = new ldo(f0aVar.A(), f0aVar.z());
                luk lukVarK = cbg1Var.k();
                c8o.l(lukVarK);
                boolean zA = new vz4(false, false, lukVarK).a();
                luk lukVarK2 = cbg1Var.k();
                c8o.l(lukVarK2);
                boolean zB = new vz4(false, false, lukVarK2).b();
                uag1 uag1VarI = cbg1Var.i();
                c8o.l(uag1VarI);
                tag1 tag1VarA = uag1VarI.a();
                gw70 gw70VarB = cbg1Var.b();
                c8o.l(gw70VarB);
                aeg1 aeg1Var = new aeg1(d0rVar2, mhcVar, nfbVar, xv81Var, et90VarU, qj0Var, zhyVarQ, u710VarR, ldoVar, zA, zB, tag1VarA, gw70VarB);
                e7q e7qVarN = byjVar.n();
                c8o.l(e7qVarN);
                jz51 jz51VarJ = byjVar.j();
                c8o.l(jz51VarJ);
                i8h1 i8h1VarM = byjVar.m();
                c8o.l(i8h1VarM);
                nt21 nt21Var = new nt21(i8h1VarM, new brl0(((c061) tnmVar.b).a, (byte) 15), (byte) 20);
                ujq0 ujq0Var = (ujq0) ((jly0) tnmVar.g).get();
                iac0 iac0Var2 = q7r0Var.d.c;
                c8o.m(iac0Var2);
                return new iyj(d0rVar, aeg1Var, e7qVarN, new l451(jz51VarJ, (byte) 10), new hl11(nt21Var, iac0Var2, ujq0Var, (byte) 22));
            case 1:
                uw0 uw0Var = (uw0) obj;
                switch (b2) {
                    case 0:
                        return cwl1.C((q7r0) uw0Var.f);
                    case 1:
                        return new f2p(this, (byte) 1);
                    case 2:
                        return new bzo(this, (byte) 1);
                    case 3:
                        k0t k0tVar = (k0t) ((j0k) uw0Var.d).w.get();
                        c8o.l(k0tVar);
                        return k0tVar;
                    case 4:
                        return new e7p(this, (byte) 0);
                    case 5:
                        j0k j0kVar = (j0k) uw0Var.d;
                        j0k j0kVar2 = (j0k) uw0Var.d;
                        xfx xfxVar = (xfx) j0kVar.l.get();
                        c8o.l(xfxVar);
                        lzn0 lzn0VarA = j0kVar2.a();
                        c8o.l(lzn0VarA);
                        agc0 agc0Var = (agc0) j0kVar2.m.get();
                        c8o.l(agc0Var);
                        gw70 gw70VarB2 = ((ivj) uw0Var.g).b();
                        c8o.l(gw70VarB2);
                        lujVar = new luj(xfxVar, gw70VarB2, agc0Var, lzn0VarA, false);
                        break;
                    case 6:
                        j0k j0kVar3 = (j0k) uw0Var.d;
                        q7r0 q7r0Var2 = (q7r0) uw0Var.f;
                        l0k l0kVar = (l0k) uw0Var.e;
                        pbw0 pbw0Var = (pbw0) j0kVar3.z.get();
                        c8o.l(pbw0Var);
                        AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                        p6r0 p6r0VarN = yon1.N();
                        Parcelable.Creator creator = lik1.CREATOR;
                        bn70 bn70Var = new bn70(p6r0VarN, new lik1(l0kVar.a), (nar0) null);
                        h0r0 h0r0VarB = q7r0Var2.d.b();
                        PlayOrigin playOriginBuild = PlayOrigin.builder(cwl1.D(h0r0VarB).a.a()).viewUri(cwl1.D(h0r0VarB).b.a).referrerIdentifier(q7r0Var2.a()).build();
                        String str = l0kVar.b;
                        c8o.m(str);
                        iac0 iac0Var3 = q7r0Var2.d.c;
                        c8o.m(iac0Var3);
                        e2q e2qVar = pbw0Var.a;
                        switch (e2qVar.a) {
                            case 0:
                                i2q i2qVar = (i2q) e2qVar.b;
                                daq daqVar = i2qVar.a;
                                yqg yqgVar = (yqg) daqVar.J1.get();
                                teq teqVar = i2qVar.b;
                                Context context = (Context) daqVar.x1.a;
                                gw70 gw70Var = (gw70) daqVar.d8.get();
                                lzn0 lzn0Var = (lzn0) teqVar.i.get();
                                j2q j2qVar = i2qVar.c;
                                vgm vgmVar = (vgm) j2qVar.Q0.get();
                                htr htrVar = (htr) daqVar.Lp.get();
                                luk lukVar = (luk) daqVar.L1.get();
                                ycm ycmVar = (ycm) j2qVar.Z0.get();
                                ov20 ov20Var = (ov20) daqVar.P5.get();
                                b7r0 b7r0Var = (b7r0) daqVar.p7.get();
                                xrc0 xrc0Var = (xrc0) teqVar.e1.get();
                                zut0 zut0Var = (zut0) daqVar.H9.get();
                                h5q h5qVar = (h5q) teqVar.db.get();
                                n3d0 n3d0Var = (n3d0) teqVar.T5.get();
                                i8h1 i8h1Var = (i8h1) daqVar.A5.get();
                                g3q0 g3q0Var = (g3q0) teqVar.fb.get();
                                ugn0 ugn0Var = (ugn0) daqVar.a.c3.get();
                                dma1 dma1Var = (dma1) daqVar.C5.get();
                                xfx xfxVar2 = (xfx) teqVar.q1.get();
                                agc0 agc0Var2 = (agc0) daqVar.B7.get();
                                t8u0 t8u0Var = (t8u0) daqVar.d9.get();
                                qns0 qns0Var = (qns0) daqVar.q5.get();
                                vb2 vb2Var = (vb2) teqVar.n3.get();
                                yh2 yh2Var = (yh2) teqVar.f3.get();
                                zr00 zr00Var = (zr00) daqVar.f9.get();
                                y390 y390Var = (y390) teqVar.o3.get();
                                upp0 upp0Var = (upp0) daqVar.I9.get();
                                mr20 mr20Var = (mr20) daqVar.u5.get();
                                e9g1 e9g1Var = (e9g1) teqVar.ib.get();
                                e1oVar = new e1o(yqgVar, context, gw70Var, lzn0Var, vgmVar, htrVar, lukVar, ycmVar, ov20Var, b7r0Var, xrc0Var, zut0Var, h5qVar, n3d0Var, i8h1Var, g3q0Var, ugn0Var, dma1Var, xfxVar2, agc0Var2, t8u0Var, iac0Var3, qns0Var, vb2Var, yh2Var, zr00Var, y390Var, upp0Var, mr20Var, e9g1Var, (c3s) daqVar.e6.get(), (nwt) daqVar.a.d3.get(), (nfa0) daqVar.b2.get(), str, bn70Var, playOriginBuild);
                                break;
                            default:
                                thq thqVar = (thq) e2qVar.b;
                                daq daqVar2 = thqVar.b;
                                yqg yqgVar2 = (yqg) daqVar2.J1.get();
                                teq teqVar2 = thqVar.c;
                                Context context2 = (Context) daqVar2.x1.a;
                                gw70 gw70Var2 = (gw70) daqVar2.d8.get();
                                lzn0 lzn0Var2 = (lzn0) teqVar2.i.get();
                                vgm vgmVar2 = (vgm) teqVar2.b.E.get();
                                htr htrVar2 = (htr) daqVar2.Lp.get();
                                luk lukVar2 = (luk) daqVar2.L1.get();
                                ycm ycmVar2 = (ycm) teqVar2.b.P.get();
                                ov20 ov20Var2 = (ov20) daqVar2.P5.get();
                                b7r0 b7r0Var2 = (b7r0) daqVar2.p7.get();
                                xrc0 xrc0Var2 = (xrc0) teqVar2.e1.get();
                                zut0 zut0Var2 = (zut0) daqVar2.H9.get();
                                h5q h5qVar2 = (h5q) teqVar2.db.get();
                                n3d0 n3d0Var2 = (n3d0) teqVar2.T5.get();
                                i8h1 i8h1Var2 = (i8h1) daqVar2.A5.get();
                                g3q0 g3q0Var2 = (g3q0) teqVar2.fb.get();
                                ugn0 ugn0Var2 = (ugn0) daqVar2.a.c3.get();
                                dma1 dma1Var2 = (dma1) daqVar2.C5.get();
                                xfx xfxVar3 = (xfx) teqVar2.q1.get();
                                agc0 agc0Var3 = (agc0) daqVar2.B7.get();
                                t8u0 t8u0Var2 = (t8u0) daqVar2.d9.get();
                                qns0 qns0Var2 = (qns0) daqVar2.q5.get();
                                vb2 vb2Var2 = (vb2) teqVar2.n3.get();
                                yh2 yh2Var2 = (yh2) teqVar2.f3.get();
                                zr00 zr00Var2 = (zr00) daqVar2.f9.get();
                                y390 y390Var2 = (y390) teqVar2.o3.get();
                                upp0 upp0Var2 = (upp0) daqVar2.I9.get();
                                mr20 mr20Var2 = (mr20) daqVar2.u5.get();
                                e9g1 e9g1Var2 = (e9g1) teqVar2.ib.get();
                                e1oVar = new e1o(yqgVar2, context2, gw70Var2, lzn0Var2, vgmVar2, htrVar2, lukVar2, ycmVar2, ov20Var2, b7r0Var2, xrc0Var2, zut0Var2, h5qVar2, n3d0Var2, i8h1Var2, g3q0Var2, ugn0Var2, dma1Var2, xfxVar3, agc0Var3, t8u0Var2, iac0Var3, qns0Var2, vb2Var2, yh2Var2, zr00Var2, y390Var2, upp0Var2, mr20Var2, e9g1Var2, (c3s) daqVar2.e6.get(), (nwt) daqVar2.a.d3.get(), (nfa0) daqVar2.b2.get(), str, bn70Var, playOriginBuild);
                                break;
                        }
                        wgi0 wgi0Var = (wgi0) ((jly0) new pug(e1oVar).f).get();
                        c8o.m(wgi0Var);
                        return wgi0Var;
                    case 7:
                        j0k j0kVar4 = (j0k) uw0Var.d;
                        j0k j0kVar5 = (j0k) uw0Var.d;
                        xfx xfxVar4 = (xfx) j0kVar4.l.get();
                        c8o.l(xfxVar4);
                        lzn0 lzn0VarA2 = j0kVar5.a();
                        c8o.l(lzn0VarA2);
                        agc0 agc0Var4 = (agc0) j0kVar5.m.get();
                        c8o.l(agc0Var4);
                        gw70 gw70VarB3 = ((ivj) uw0Var.g).b();
                        c8o.l(gw70VarB3);
                        lujVar = new d460(xfxVar4, gw70VarB3, agc0Var4, lzn0VarA2, false);
                        break;
                    case 8:
                        return new hoc(false, new goc(2131165289, 2131165289));
                    case 9:
                        j0k j0kVar6 = (j0k) uw0Var.d;
                        j0k j0kVar7 = (j0k) uw0Var.d;
                        yko ykoVar = (yko) j0kVar6.e.get();
                        c8o.l(ykoVar);
                        qua0 qua0Var = (ztw0) j0kVar7.s.get();
                        c8o.l(qua0Var);
                        a9q a9qVar = (a9q) j0kVar7.t.get();
                        c8o.l(a9qVar);
                        l0k l0kVar2 = (l0k) uw0Var.e;
                        return new e5b0(30, p7h.M(new qua0[]{ykoVar.a(l0kVar2.a, new ro8(l0kVar2, (lnm) null, (byte) 4)), qua0Var, a9qVar.a("composerpage")}), (List) null);
                    default:
                        jah.e(b2);
                        return null;
                }
                return lujVar;
            case 2:
                e1o e1oVar2 = (e1o) obj;
                switch (b2) {
                    case 0:
                        lzn0 lzn0Var3 = (lzn0) ((mjk) e1oVar2.a).K.get();
                        c8o.l(lzn0Var3);
                        return lzn0Var3;
                    case 1:
                        mjk mjkVar = (mjk) e1oVar2.a;
                        mjk mjkVar2 = (mjk) e1oVar2.a;
                        zpk zpkVar = (zpk) mjkVar.h.get();
                        c8o.l(zpkVar);
                        i4q i4qVar = (i4q) mjkVar2.n.get();
                        c8o.l(i4qVar);
                        boolean z = ((xrk) ((d7p) e1oVar2.e).get()).f;
                        w4h w4hVar = (w4h) mjkVar2.g.get();
                        c8o.l(w4hVar);
                        dg8 dg8Var = new dg8(w4hVar, (byte) 24);
                        uu00 uu00Var = (uu00) mjkVar2.x.get();
                        c8o.l(uu00Var);
                        kt91 kt91Var = (kt91) mjkVar2.e0.get();
                        c8o.l(kt91Var);
                        yqg yqgVar3 = (yqg) ((d7p) e1oVar2.f).get();
                        iac0 iac0VarB = e1oVar2.b();
                        q8n q8nVar = (q8n) mjkVar2.C.get();
                        c8o.l(q8nVar);
                        return new bhk(zpkVar, i4qVar, z, dg8Var, uu00Var, kt91Var, yqgVar3, iac0VarB, q8nVar);
                    case 2:
                        xrk xrkVar = (xrk) ((mjk) e1oVar2.a).i.get();
                        c8o.l(xrkVar);
                        return xrkVar;
                    case 3:
                        yqg yqgVar4 = (yqg) ((mjk) e1oVar2.a).f.get();
                        c8o.l(yqgVar4);
                        return yqgVar4;
                    case 4:
                        t8u0 t8u0Var3 = (t8u0) ((mjk) e1oVar2.a).V.get();
                        c8o.l(t8u0Var3);
                        return t8u0Var3.a(((q7r0) e1oVar2.b).d.c.getLifecycle());
                    case 5:
                        return ((cyp) ((d7p) e1oVar2.h).get()).a();
                    case 6:
                        return u1n0.z((q7r0) e1oVar2.b);
                    case 7:
                        njk njkVar = (njk) e1oVar2.c;
                        AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                        return new rxk0(yon1.N0().c, njkVar.b);
                    case 8:
                        return f7z.e((d7p) e1oVar2.l, (d7p) e1oVar2.j);
                    case 9:
                        xfx xfxVar5 = (xfx) ((mjk) e1oVar2.a).u.get();
                        c8o.l(xfxVar5);
                        return xfxVar5;
                    case 10:
                        return new n7p(this, (byte) 0);
                    case 11:
                        return new lyo(this, (byte) 2);
                    case 12:
                        return new myo(this, (byte) 2);
                    case 13:
                        nwt nwtVar = (nwt) ((mjk) e1oVar2.a).t.get();
                        c8o.l(nwtVar);
                        return nwtVar;
                    case 14:
                        mr20 mr20Var3 = (mr20) ((mjk) e1oVar2.a).W.get();
                        c8o.l(mr20Var3);
                        c3s c3sVar = (c3s) ((mjk) e1oVar2.a).D.get();
                        c8o.l(c3sVar);
                        return new clm(mr20Var3, c3sVar);
                    case 15:
                        d7p d7pVar = (d7p) e1oVar2.q;
                        njk njkVar2 = (njk) e1oVar2.c;
                        mjk mjkVar3 = (mjk) e1oVar2.a;
                        ynb0 ynb0VarA = xqu.a(d7pVar);
                        d7p d7pVar2 = (d7p) e1oVar2.r;
                        ynb0 ynb0VarA2 = xqu.a((d7p) e1oVar2.i);
                        h5q h5qVar3 = (h5q) mjkVar3.i0.get();
                        c8o.l(h5qVar3);
                        b7r0 b7r0Var3 = (b7r0) mjkVar3.R.get();
                        c8o.l(b7r0Var3);
                        ynb0 ynb0VarA3 = xqu.a((d7p) e1oVar2.s);
                        ynb0 ynb0VarA4 = xqu.a((d7p) e1oVar2.t);
                        ov20 ov20Var3 = (ov20) mjkVar3.y.get();
                        c8o.l(ov20Var3);
                        yqg yqgVar5 = (yqg) ((d7p) e1oVar2.f).get();
                        iac0 iac0VarB2 = e1oVar2.b();
                        n3d0 n3d0Var3 = (n3d0) mjkVar3.G.get();
                        c8o.l(n3d0Var3);
                        String str2 = njkVar2.c;
                        c8o.m(str2);
                        AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                        p6r0 p6r0VarR0 = yon1.R0();
                        Parcelable.Creator creator2 = lik1.CREATOR;
                        bn70 bn70Var2 = new bn70(p6r0VarR0, new lik1(njkVar2.b), (nar0) null);
                        g3q0 g3q0Var3 = (g3q0) mjkVar3.Q.get();
                        c8o.l(g3q0Var3);
                        upp0 upp0Var3 = (upp0) mjkVar3.P.get();
                        c8o.l(upp0Var3);
                        return bhb.o(ynb0VarA, d7pVar2, ynb0VarA2, h5qVar3, b7r0Var3, ynb0VarA3, ynb0VarA4, ov20Var3, yqgVar5, iac0VarB2, n3d0Var3, str2, bn70Var2, g3q0Var3, upp0Var3, Optional.empty(), Optional.empty());
                    case 16:
                        return ((cyp) ((d7p) e1oVar2.h).get()).d();
                    case 17:
                        return PlayOrigin.builder("concert-entity-playback-manager").referrerIdentifier("concert-entity").build();
                    case 18:
                        xrc0 xrc0Var3 = (xrc0) ((mjk) e1oVar2.a).F.get();
                        c8o.l(xrc0Var3);
                        return xrc0Var3;
                    case 19:
                        zut0 zut0Var3 = (zut0) ((mjk) e1oVar2.a).T.get();
                        c8o.l(zut0Var3);
                        return zut0Var3.a(new lb3(xqu.a((d7p) e1oVar2.h), (byte) 3), xqu.a((d7p) e1oVar2.r));
                    case 20:
                        return new nyo(this, (byte) 3);
                    case 21:
                        ugn0 ugn0Var3 = (ugn0) ((mjk) e1oVar2.a).Y.get();
                        c8o.l(ugn0Var3);
                        return ugn0Var3;
                    case 22:
                        return null;
                    case 23:
                        return new oyo(this, (byte) 3);
                    case 24:
                        return (ku71) xqu.a((d7p) e1oVar2.x).get();
                    case 25:
                        dma1 dma1Var3 = (dma1) ((mjk) e1oVar2.a).f0.get();
                        c8o.l(dma1Var3);
                        nfa0 nfa0Var = (nfa0) ((mjk) e1oVar2.a).s.get();
                        c8o.l(nfa0Var);
                        return new ku71(dma1Var3, nfa0Var, new du71());
                    case 26:
                        return new hfw0((i8h1) ((d7p) e1oVar2.j).get());
                    case 27:
                        q8n q8nVar2 = (q8n) ((mjk) e1oVar2.a).I.get();
                        c8o.l(q8nVar2);
                        return new nfw0(q8nVar2, (d7p) e1oVar2.f, (d7p) e1oVar2.v, (d7p) e1oVar2.o, (d7p) e1oVar2.p, (d7p) e1oVar2.w, (d7p) e1oVar2.i, (d7p) e1oVar2.A, (jly0) e1oVar2.z);
                    case 28:
                        d7p d7pVar3 = (d7p) e1oVar2.l;
                        mjk mjkVar4 = (mjk) e1oVar2.a;
                        xfx xfxVar6 = (xfx) d7pVar3.get();
                        lzn0 lzn0Var4 = (lzn0) ((d7p) e1oVar2.d).get();
                        agc0 agc0Var5 = (agc0) mjkVar4.E.get();
                        c8o.l(agc0Var5);
                        gw70 gw70Var3 = (gw70) mjkVar4.B.get();
                        c8o.l(gw70Var3);
                        return new luj(xfxVar6, gw70Var3, agc0Var5, lzn0Var4, false);
                    case 29:
                        return new pyo(this, (byte) 2);
                    case 30:
                        abu0 abu0VarF = cwl1.F((q7r0) e1oVar2.b);
                        c8o.m(abu0VarF);
                        return abu0VarF;
                    case 31:
                        return new qa2((q7r0) e1oVar2.b, (byte) 9);
                    case 32:
                        lko lkoVar = (lko) ((mjk) e1oVar2.a).p.get();
                        c8o.l(lkoVar);
                        String str3 = ((njk) e1oVar2.c).c;
                        c8o.m(str3);
                        return new jpd0(lkoVar, str3, e1oVar2.b());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 3:
                em0 em0Var = (em0) obj;
                kpk kpkVar = (kpk) em0Var.d;
                if (b2 == 0) {
                    uu00 uu00Var2 = (uu00) kpkVar.e.get();
                    c8o.l(uu00Var2);
                    q8n q8nVar3 = (q8n) kpkVar.i.get();
                    c8o.l(q8nVar3);
                    return new dpk(uu00Var2, q8nVar3);
                }
                if (b2 == 1) {
                    return new o7p(this);
                }
                if (b2 == 2) {
                    return new p7p(this);
                }
                if (b2 == 3) {
                    return u1n0.z((q7r0) em0Var.e);
                }
                if (b2 == 4) {
                    return new q7p(this, (byte) 0);
                }
                if (b2 != 5) {
                    jah.e(b2);
                    return null;
                }
                xfx xfxVar7 = (xfx) kpkVar.b.get();
                c8o.l(xfxVar7);
                lzn0 lzn0Var5 = (lzn0) kpkVar.a.get();
                c8o.l(lzn0Var5);
                return new z8x(xfxVar7, lzn0Var5);
            case 4:
                htk htkVar = (htk) ((t7p) obj).b;
                if (b2 == 0) {
                    return new s7p(this, (byte) 0);
                }
                if (b2 == 1) {
                    String str4 = htkVar.A;
                    c8o.l(str4);
                    rcq rcqVar = htkVar.c;
                    c8o.l(rcqVar);
                    return new yc8(str4, (uu00) rcqVar.a.b.a5.get());
                }
                if (b2 != 2) {
                    jah.e(b2);
                    return null;
                }
                z9n z9nVar = htkVar.d;
                c8o.l(z9nVar);
                return z9nVar;
            case 5:
                g1i g1iVar = (g1i) obj;
                if (b2 == 0) {
                    r6h1 r6h1Var = r6h1.c;
                    return new r1m0();
                }
                if (b2 == 1) {
                    return new mir0(((b2r0) ((jly0) g1iVar.e).get()).a());
                }
                if (b2 != 2) {
                    jah.e(b2);
                    return null;
                }
                c2r0 c2r0Var = (c2r0) ((buk) g1iVar.b).c.get();
                c8o.l(c2r0Var);
                auk aukVar = (auk) g1iVar.c;
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                return c2r0Var.e(aukVar, yon1.G1("START_RETRY", "start/retry", 1981, "start"), (qir0) null);
            case 6:
                cel celVar = (cel) ((k9k) obj).b;
                if (b2 == 0) {
                    RetrofitMaker retrofitMaker = (RetrofitMaker) celVar.b.get();
                    c8o.l(retrofitMaker);
                    return (qfl) retrofitMaker.createWebgateService(qfl.class, "android-bluejay-data-impl");
                }
                if (b2 == 1) {
                    return new e8p(this);
                }
                if (b2 == 2) {
                    return new f8p();
                }
                if (b2 == 3) {
                    return pzm.h((mos) celVar.e.get());
                }
                jah.e(b2);
                return null;
            case 7:
                if (b2 == 0) {
                    return new k8p(this);
                }
                if (b2 == 1) {
                    return new l8p(this);
                }
                if (b2 == 2) {
                    return cwl1.C((q7r0) ((a680) obj).b);
                }
                if (b2 == 3) {
                    return new m8p((byte) 0);
                }
                jah.e(b2);
                return null;
            case 8:
                if (b2 == 0) {
                    return new n8p(this, (byte) 0);
                }
                if (b2 == 1) {
                    return new o8p((byte) 0);
                }
                if (b2 == 2) {
                    return new p8p((byte) 0);
                }
                jah.e(b2);
                return null;
            case 9:
                h72 h72Var = (h72) obj;
                switch (b2) {
                    case 0:
                        return new q811();
                    case 1:
                        zy91 zy91Var = (zy91) ((sfm) h72Var.b).m.get();
                        c8o.l(zy91Var);
                        return zy91Var;
                    case 2:
                        jly0 jly0Var = (jly0) h72Var.e;
                        sfm sfmVar = (sfm) h72Var.b;
                        qhm qhmVar = new qhm((i3l0) jly0Var.get(), ((Boolean) sfmVar.i.get()).booleanValue());
                        lzn0 lzn0Var6 = (lzn0) sfmVar.b.get();
                        c8o.l(lzn0Var6);
                        qj0 qj0Var2 = new qj0(lzn0Var6, (i3l0) ((jly0) h72Var.e).get());
                        i3l0 i3l0Var = (i3l0) ((jly0) h72Var.e).get();
                        ym81 ym81Var = (ym81) sfmVar.h.get();
                        c8o.l(ym81Var);
                        d7p d7pVar4 = (d7p) h72Var.f;
                        nu71 nu71Var = (nu71) sfmVar.r.get();
                        c8o.l(nu71Var);
                        y441 y441Var = new y441(d7pVar4, new ogr(nu71Var, (byte) 17));
                        ynb0 ynb0VarA5 = xqu.a((d7p) h72Var.g);
                        ynb0 ynb0VarA6 = xqu.a((d7p) h72Var.i);
                        ynb0 ynb0VarA7 = xqu.a((d7p) h72Var.X);
                        q8n q8nVar4 = (q8n) sfmVar.l.get();
                        c8o.l(q8nVar4);
                        return new cfm(qhmVar, qj0Var2, i3l0Var, ym81Var, y441Var, ynb0VarA5, ynb0VarA6, ynb0VarA7, q8nVar4);
                    case 3:
                        lik1 lik1Var = (lik1) ((q811) ((jly0) h72Var.c).get()).a;
                        return new i3l0(a1l0.X, lik1Var != null ? lik1Var.a : null);
                    case 4:
                        Context context3 = (Context) ((sfm) h72Var.b).a.get();
                        c8o.l(context3);
                        nu71 nu71Var2 = (nu71) ((sfm) h72Var.b).r.get();
                        c8o.l(nu71Var2);
                        return new jn61(context3, new ogr(nu71Var2, (byte) 17));
                    case 5:
                        return new zbg((byte) 6);
                    case 6:
                        sfm sfmVar2 = (sfm) h72Var.b;
                        sfm sfmVar3 = (sfm) h72Var.b;
                        b7n b7nVar = (b7n) sfmVar2.n.get();
                        c8o.l(b7nVar);
                        Context context4 = (Context) sfmVar3.a.get();
                        c8o.l(context4);
                        no5 no5Var = new no5(context4);
                        xv61 xv61Var = (xv61) sfmVar2.o.get();
                        c8o.l(xv61Var);
                        pcl pclVar = (pcl) sfmVar2.p.get();
                        c8o.l(pclVar);
                        i9i1 i9i1Var = (i9i1) sfmVar2.q.get();
                        c8o.l(i9i1Var);
                        return new g891(new d520(b7nVar, no5Var, xv61Var, pclVar, i9i1Var, (teo0) ((jly0) h72Var.h).get()), ((Boolean) sfmVar3.i.get()).booleanValue());
                    case 7:
                        return new r8p((byte) 0);
                    case 8:
                        sfm sfmVar4 = (sfm) h72Var.b;
                        sfm sfmVar5 = (sfm) h72Var.b;
                        b7n b7nVar2 = (b7n) sfmVar4.n.get();
                        c8o.l(b7nVar2);
                        Context context5 = (Context) sfmVar5.a.get();
                        c8o.l(context5);
                        no5 no5Var2 = new no5(context5);
                        xv61 xv61Var2 = (xv61) sfmVar4.o.get();
                        c8o.l(xv61Var2);
                        pcl pclVar2 = (pcl) sfmVar4.p.get();
                        c8o.l(pclVar2);
                        i9i1 i9i1Var2 = (i9i1) sfmVar4.q.get();
                        c8o.l(i9i1Var2);
                        return new izg(new a680(b7nVar2, no5Var2, xv61Var2, pclVar2, i9i1Var2, (teo0) ((jly0) h72Var.t).get()), ((Boolean) sfmVar5.i.get()).booleanValue());
                    case 9:
                        return new r8p((byte) 1);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 10:
                h72 h72Var2 = (h72) obj;
                kim kimVar = (kim) h72Var2.b;
                switch (b2) {
                    case 0:
                        mim mimVar = (mim) h72Var2.c;
                        a1l0 a1l0VarB = h72Var2.r().b();
                        bjm target = mimVar.b.getTarget();
                        return new i3l0(a1l0VarB, target != null ? target.a : null);
                    case 1:
                        Context context6 = (Context) kimVar.b.get();
                        c8o.l(context6);
                        nu71 nu71Var3 = (nu71) kimVar.p.get();
                        c8o.l(nu71Var3);
                        return new jn61(context6, new ogr(nu71Var3, (byte) 17));
                    case 2:
                        return new zbg((byte) 6);
                    case 3:
                        b7n b7nVar3 = (b7n) kimVar.l.get();
                        c8o.l(b7nVar3);
                        Context context7 = (Context) kimVar.b.get();
                        c8o.l(context7);
                        no5 no5Var3 = new no5(context7);
                        xv61 xv61Var3 = (xv61) kimVar.m.get();
                        c8o.l(xv61Var3);
                        pcl pclVar3 = (pcl) kimVar.n.get();
                        c8o.l(pclVar3);
                        i9i1 i9i1Var3 = (i9i1) kimVar.o.get();
                        c8o.l(i9i1Var3);
                        return new g891(new d520(b7nVar3, no5Var3, xv61Var3, pclVar3, i9i1Var3, (teo0) ((jly0) h72Var2.g).get()), ((Boolean) kimVar.f.get()).booleanValue());
                    case 4:
                        return new r8p((byte) 2);
                    case 5:
                        b7n b7nVar4 = (b7n) kimVar.l.get();
                        c8o.l(b7nVar4);
                        Context context8 = (Context) kimVar.b.get();
                        c8o.l(context8);
                        no5 no5Var4 = new no5(context8);
                        xv61 xv61Var4 = (xv61) kimVar.m.get();
                        c8o.l(xv61Var4);
                        pcl pclVar4 = (pcl) kimVar.n.get();
                        c8o.l(pclVar4);
                        i9i1 i9i1Var4 = (i9i1) kimVar.o.get();
                        c8o.l(i9i1Var4);
                        return new izg(new a680(b7nVar4, no5Var4, xv61Var4, pclVar4, i9i1Var4, (teo0) ((jly0) h72Var2.i).get()), ((Boolean) kimVar.f.get()).booleanValue());
                    case 6:
                        return new r8p((byte) 3);
                    case 7:
                        return pzm.h((mos) kimVar.g.get());
                    case 8:
                        zy91 zy91Var2 = (zy91) kimVar.k.get();
                        c8o.l(zy91Var2);
                        return zy91Var2;
                    default:
                        jah.e(b2);
                        return null;
                }
            case 11:
                g1i g1iVar2 = (g1i) obj;
                lim limVar = (lim) g1iVar2.b;
                if (b2 == 0) {
                    a1r0 a1r0Var = (a1r0) limVar.d.get();
                    c8o.l(a1r0Var);
                    return new cmr(a1r0Var);
                }
                if (b2 == 1) {
                    return new eqr(xqu.a((d7p) g1iVar2.d));
                }
                if (b2 == 2) {
                    Set set = (Set) limVar.e.get();
                    c8o.l(set);
                    return set;
                }
                if (b2 == 3) {
                    return pzm.h((mos) limVar.c.get());
                }
                jah.e(b2);
                return null;
            case 12:
                return a();
            case 13:
                k9k k9kVar = (k9k) obj;
                q7r0 q7r0Var3 = (q7r0) k9kVar.c;
                if (b2 == 0) {
                    return pzm.h((mos) ((ctm) k9kVar.b).b.get());
                }
                if (b2 == 1) {
                    return cwl1.C(q7r0Var3);
                }
                if (b2 == 2) {
                    return u1n0.z(q7r0Var3);
                }
                jah.e(b2);
                return null;
            case 14:
                return b();
            case 15:
                return c();
            case 16:
                return d();
            case 17:
                return e();
            case 18:
                return f();
            case 19:
                return g();
            case 20:
                return h();
            case 21:
                return i();
            case 22:
                return j();
            case 23:
                return k();
            case 24:
                return l();
            case 25:
                return m();
            case 26:
                return n();
            case 27:
                return o();
            case 28:
                return p();
            default:
                ip31 ip31Var = (ip31) obj;
                gnu gnuVar = (gnu) ip31Var.b;
                if (b2 == 0) {
                    t8u0 t8u0Var4 = (t8u0) gnuVar.h.get();
                    c8o.l(t8u0Var4);
                    return kmq0.x((q7r0) ip31Var.c, t8u0Var4);
                }
                if (b2 == 1) {
                    ar51 ar51Var = (ar51) gnuVar.i.get();
                    c8o.l(ar51Var);
                    return ar51Var.a(((cyp) ((jly0) ip31Var.d).get()).a());
                }
                if (b2 == 2) {
                    Flowable flowableA = gnuVar.a();
                    c8o.l(flowableA);
                    tdf0 tdf0Var = (tdf0) gnuVar.m.get();
                    c8o.l(tdf0Var);
                    wdf0 wdf0Var = (wdf0) gnuVar.n.get();
                    c8o.l(wdf0Var);
                    return new tnu(wdf0Var, flowableA, tdf0Var);
                }
                if (b2 == 3) {
                    return new ibp(this);
                }
                if (b2 == 4) {
                    return new jbp(this);
                }
                if (b2 != 5) {
                    jah.e(b2);
                    return null;
                }
                knu knuVar = lnu.a;
                xm41 xm41Var = (xm41) gnuVar.j.get();
                c8o.l(xm41Var);
                knuVar.getClass();
                return (nw80) eth.z(xm41Var, wiu.P0);
        }
    }
}
