package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e7o implements owo0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ e7o(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.owo0
    public final tka0 e() {
        switch (this.a) {
            case 0:
                return rc11.a.b(vwo0.class);
            case 1:
                return rc11.a.b(axo0.class);
            case 2:
                return rc11.a.b(kxo0.class);
            case 3:
                return rc11.a.b(nxo0.class);
            case 4:
                return rc11.a.b(pxo0.class);
            default:
                return rc11.a.b(txo0.class);
        }
    }

    @Override // p.owo0
    public final void f(ji50 ji50Var) {
        el9 el9Var;
        qsy qsyVar;
        ezg0 ezg0Var;
        n0o n0oVar;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                cvp cvpVar = (cvp) obj2;
                d0r d0rVar = ji50Var.a;
                kko kkoVar = (kko) obj;
                switch (cvpVar.a) {
                    case 0:
                        nwp nwpVar = (nwp) ((gbp) cvpVar.b).c;
                        lzn0 lzn0Var = (lzn0) nwpVar.G.get();
                        a1r0 a1r0VarA0 = nwpVar.a.A0();
                        c8o.l(a1r0VarA0);
                        el9Var = new el9(lzn0Var, a1r0VarA0, (dvp) nwpVar.w0.get(), new bw2(new ze4(false, (luk) nwpVar.g.get())), d0rVar, kkoVar);
                        break;
                    default:
                        v5q v5qVar = (v5q) ((thq) cvpVar.b).c;
                        el9Var = new el9((lzn0) v5qVar.U0.get(), (a1r0) v5qVar.k1.get(), (dvp) v5qVar.m7.get(), (bw2) v5qVar.n7.get(), d0rVar, kkoVar);
                        break;
                }
                ji50Var.b.put(vwo0.class, new r3r(new wzq(fdg1.m0(el9Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), h4o.Y0), wmn.S0, (vu30) null));
                break;
            case 1:
                d0r d0rVar2 = ji50Var.a;
                lik1 lik1Var = nik1.d6;
                hvp hvpVar = (hvp) ((qmr) obj2).b;
                switch (hvpVar.a) {
                    case 0:
                        nwp nwpVar2 = (nwp) ((gbp) hvpVar.b).c;
                        lzn0 lzn0Var2 = (lzn0) nwpVar2.G.get();
                        a1r0 a1r0VarA1 = nwpVar2.a.A0();
                        c8o.l(a1r0VarA1);
                        t8u0 t8u0Var = (t8u0) nwpVar2.m.get();
                        Flowable flowable = (Flowable) nwpVar2.l.get();
                        uu00 uu00VarP = nwpVar2.a.P();
                        c8o.l(uu00VarP);
                        vbs vbsVarQ0 = nwpVar2.a.q0();
                        c8o.l(vbsVarQ0);
                        e7p0 e7p0Var = (e7p0) nwpVar2.E.get();
                        b7r0 b7r0Var = (b7r0) ((daq) nwpVar2.a.b).p7.get();
                        c8o.l(b7r0Var);
                        Scheduler scheduler = (Scheduler) nwpVar2.s.get();
                        yqg yqgVar = (yqg) nwpVar2.i.get();
                        yqg yqgVar2 = (yqg) nwpVar2.i.get();
                        em0 em0Var = nwpVar2.a;
                        gw70 gw70VarA0 = em0Var.a0();
                        c8o.l(gw70VarA0);
                        f6g1 f6g1Var = (f6g1) ((teq) em0Var.c).I8.get();
                        c8o.l(f6g1Var);
                        zs11 zs11Var = new zs11(yqgVar2, gw70VarA0, f6g1Var);
                        em0 em0Var2 = nwpVar2.a;
                        teq teqVar = (teq) em0Var2.c;
                        w390 w390Var = (w390) teqVar.nf.get();
                        c8o.l(w390Var);
                        yh2 yh2Var = (yh2) teqVar.f3.get();
                        c8o.l(yh2Var);
                        vb2 vb2Var = (vb2) nwpVar2.R.get();
                        y5v0 y5v0Var = (y5v0) teqVar.T4.get();
                        c8o.l(y5v0Var);
                        t740 t740Var = (t740) teqVar.Ec.get();
                        c8o.l(t740Var);
                        x290 x290Var = new x290(new hup(nwpVar2.c));
                        i1r0 i1r0Var = (i1r0) teqVar.y3.get();
                        c8o.l(i1r0Var);
                        o78 o78Var = (o78) teqVar.K3.get();
                        c8o.l(o78Var);
                        uu00 uu00VarP2 = em0Var2.P();
                        c8o.l(uu00VarP2);
                        daq daqVar = (daq) em0Var2.b;
                        kv00 kv00Var = (kv00) daqVar.Ec.get();
                        c8o.l(kv00Var);
                        ll30 ll30Var = (ll30) nwpVar2.A0.get();
                        lzn0 lzn0Var3 = (lzn0) nwpVar2.G.get();
                        RetrofitMaker retrofitMakerM0 = em0Var2.M0();
                        c8o.l(retrofitMakerM0);
                        knm knmVarM = k0i1.m(retrofitMakerM0);
                        Context context = (Context) nwpVar2.b.d;
                        c8o.l(context);
                        h2i1 h2i1Var = new h2i1(new yfu(knmVarM, new wpv0(context, new oh4((luk) nwpVar2.g.get())), (byte) 19), new hf41((byte) 3));
                        a1r0 a1r0VarA2 = em0Var2.A0();
                        c8o.l(a1r0VarA2);
                        x1i1 x1i1Var = new x1i1(h2i1Var, new dn81(a1r0VarA2, (byte) 28), (lzn0) nwpVar2.G.get());
                        c9c0 c9c0VarD0 = em0Var2.d0();
                        c8o.l(c9c0VarD0);
                        g0l g0lVar = (g0l) daqVar.E5.get();
                        c8o.l(g0lVar);
                        b9q b9qVar = (b9q) daqVar.br.get();
                        c8o.l(b9qVar);
                        h9k0 h9k0Var = (h9k0) teqVar.pf.get();
                        c8o.l(h9k0Var);
                        kt91 kt91VarD1 = em0Var2.d1();
                        c8o.l(kt91VarD1);
                        yqg yqgVar3 = (yqg) nwpVar2.i.get();
                        xrc0 xrc0Var = (xrc0) teqVar.e1.get();
                        c8o.l(xrc0Var);
                        e7p0 e7p0Var2 = (e7p0) nwpVar2.E.get();
                        h5q h5qVar = (h5q) teqVar.db.get();
                        c8o.l(h5qVar);
                        b7r0 b7r0Var2 = (b7r0) daqVar.p7.get();
                        c8o.l(b7r0Var2);
                        Flowable flowable2 = (Flowable) nwpVar2.l.get();
                        q8n q8nVarG0 = em0Var2.g0();
                        c8o.l(q8nVarG0);
                        r0s0 r0s0VarZ = new toj0(new f9p(w390Var, yh2Var, vb2Var, y5v0Var, t740Var, x290Var, i1r0Var, o78Var, uu00VarP2, kv00Var, ll30Var, lzn0Var3, x1i1Var, c9c0VarD0, g0lVar, b9qVar, h9k0Var, kt91VarD1, yqgVar3, xrc0Var, e7p0Var2, h5qVar, b7r0Var2, flowable2, q8nVarG0)).z();
                        a5m a5mVar = new a5m();
                        lc20 lc20VarV = vwn.v(new abm(nwpVar2.B0), Optional.of(daqVar.j2()));
                        t0b t0bVar = new t0b((byte) 2);
                        z6k0 z6k0VarK0 = em0Var2.k0();
                        c8o.l(z6k0VarK0);
                        rxj0 rxj0VarJ0 = em0Var2.j0();
                        c8o.l(rxj0VarJ0);
                        jbk0 jbk0Var = (jbk0) teqVar.a6.get();
                        c8o.l(jbk0Var);
                        zwp zwpVarG = npp0.g(new byp(r0s0VarZ, a5mVar, lc20VarV, t0bVar, z6k0VarK0, rxj0VarJ0, jbk0Var, (ll30) nwpVar2.A0.get(), (q8n) nwpVar2.A.get()));
                        ycm ycmVar = (ycm) ((teq) nwpVar2.a.c).b.P.get();
                        c8o.l(ycmVar);
                        xh71 xh71VarX0 = nwpVar2.a.X0();
                        c8o.l(xh71VarX0);
                        k9q k9qVar = (k9q) ((daq) nwpVar2.a.b).yr.get();
                        c8o.l(k9qVar);
                        xd0 xd0Var = (xd0) ((daq) nwpVar2.a.b).Tp.get();
                        c8o.l(xd0Var);
                        boolean zBooleanValue = ((Boolean) ((daq) nwpVar2.a.b).So.get()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((daq) nwpVar2.a.b).zr.get()).booleanValue();
                        uvy uvyVarO = nwpVar2.a.O();
                        c8o.l(uvyVarO);
                        xrc0 xrc0Var2 = (xrc0) ((teq) nwpVar2.a.c).e1.get();
                        c8o.l(xrc0Var2);
                        qsyVar = new qsy(lik1Var, lzn0Var2, a1r0VarA1, t8u0Var, flowable, uu00VarP, vbsVarQ0, e7p0Var, b7r0Var, scheduler, yqgVar, zs11Var, zwpVarG, ycmVar, xh71VarX0, k9qVar, xd0Var, zBooleanValue, zBooleanValue2, uvyVarO, xrc0Var2);
                        break;
                    default:
                        thq thqVar = (thq) hvpVar.b;
                        v5q v5qVar2 = (v5q) thqVar.c;
                        lzn0 lzn0Var4 = (lzn0) v5qVar2.U0.get();
                        a1r0 a1r0Var = (a1r0) v5qVar2.k1.get();
                        daq daqVar2 = thqVar.b;
                        qsyVar = new qsy(lik1Var, lzn0Var4, a1r0Var, (t8u0) daqVar2.d9.get(), (Flowable) daqVar2.D5.get(), (uu00) daqVar2.a5.get(), (vbs) daqVar2.wf.get(), (e7p0) v5qVar2.P4.get(), (b7r0) daqVar2.p7.get(), (Scheduler) daqVar2.z1.get(), (yqg) daqVar2.J1.get(), (zs11) v5qVar2.w7.get(), (zwp) v5qVar2.K7.get(), (ycm) v5qVar2.M8.get(), (xh71) v5qVar2.i4.get(), (k9q) daqVar2.yr.get(), (xd0) daqVar2.Tp.get(), ((Boolean) daqVar2.So.get()).booleanValue(), ((Boolean) daqVar2.zr.get()).booleanValue(), (uvy) daqVar2.cf.get(), (xrc0) daqVar2.f5.get());
                        break;
                }
                t7p t7pVar = (t7p) ((tdp) ((jly0) new t7p(qsyVar).d).get()).a.c;
                lik1 lik1Var2 = ((qsy) t7pVar.b).a;
                ogr ogrVarV = g7y.v((udp) ((jly0) t7pVar.a).get());
                fjb fjbVar = new fjb((byte) 9);
                qdp qdpVar = (qdp) ((jly0) t7pVar.c).get();
                qsy qsyVar2 = (qsy) t7pVar.b;
                xd0 xd0Var2 = qsyVar2.p;
                c8o.l(xd0Var2);
                Flowable flowable3 = qsyVar2.e;
                c8o.l(flowable3);
                Scheduler scheduler2 = qsyVar2.u;
                c8o.l(scheduler2);
                yqg yqgVar4 = qsyVar2.j;
                c8o.l(yqgVar4);
                kl1 kl1Var = new kl1(xd0Var2, flowable3, scheduler2, yqgVar4, qsyVar2.q);
                k9q k9qVar2 = qsyVar2.o;
                c8o.l(k9qVar2);
                lzn0 lzn0Var5 = qsyVar2.b;
                c8o.l(lzn0Var5);
                a1r0 a1r0Var2 = qsyVar2.c;
                c8o.l(a1r0Var2);
                ji50Var.b.put(axo0.class, new r3r(new wzq(fdg1.m0(new psy(d0rVar2, lik1Var2, ogrVarV, fjbVar, qdpVar, kl1Var, k9qVar2, new w460(lzn0Var5, true, true, false, a1r0Var2, 40)), (ViewGroup.LayoutParams) null, ScrollCardType.ENTITY_SEGMENTS, 1), new nty(this, (byte) 1)), yty.e, (vu30) null));
                break;
            case 2:
                s2c0 s2c0Var = new s2c0(this, (byte) 17);
                Set set = sud0.a;
                ji50Var.b.put(kxo0.class, r4o1.Q(god0.P0, set, s2c0Var, x5d0.P0));
                break;
            case 3:
                jvp jvpVar = (jvp) obj2;
                d0r d0rVar3 = ji50Var.a;
                w9u0 w9u0Var = (w9u0) obj;
                switch (jvpVar.a) {
                    case 0:
                        nwp nwpVar3 = (nwp) ((gbp) jvpVar.b).c;
                        joe joeVarJ = nwpVar3.j();
                        a1r0 a1r0VarA3 = nwpVar3.a.A0();
                        c8o.l(a1r0VarA3);
                        Flowable flowable4 = (Flowable) nwpVar3.l.get();
                        mr4 mr4VarF = nwpVar3.f();
                        kvp kvpVar = (kvp) nwpVar3.J0.get();
                        mpa1 mpa1Var = (mpa1) nwpVar3.K0.get();
                        em0 em0Var3 = nwpVar3.a;
                        g38 g38Var = (g38) ((daq) em0Var3.b).rl.get();
                        c8o.l(g38Var);
                        tra0 tra0Var = (tra0) nwpVar3.O0.get();
                        yo2 yo2Var = (yo2) nwpVar3.L0.get();
                        pe peVarG = em0Var3.g();
                        c8o.l(peVarG);
                        gbp gbpVar = nwpVar3.P0;
                        teq teqVar2 = (teq) em0Var3.c;
                        u9b u9bVar = (u9b) teqVar2.u4.get();
                        c8o.l(u9bVar);
                        r9b r9bVarJ = fva.j(gbpVar, u9bVar);
                        u9b u9bVar2 = (u9b) teqVar2.u4.get();
                        c8o.l(u9bVar2);
                        ezg0Var = new ezg0(joeVarJ, a1r0VarA3, flowable4, mr4VarF, kvpVar, w9u0Var, mpa1Var, g38Var, tra0Var, yo2Var, peVarG, new i5w0(new d9p0(r9bVarJ, u9bVar2, (Resources) nwpVar3.f.get())), d0rVar3);
                        break;
                    default:
                        thq thqVar2 = (thq) jvpVar.b;
                        v5q v5qVar3 = (v5q) thqVar2.c;
                        joe joeVar = (joe) v5qVar3.X8.get();
                        a1r0 a1r0Var3 = (a1r0) v5qVar3.k1.get();
                        daq daqVar3 = thqVar2.b;
                        ezg0Var = new ezg0(joeVar, a1r0Var3, (Flowable) daqVar3.D5.get(), (mr4) daqVar3.ri.get(), (kvp) v5qVar3.U4.get(), w9u0Var, (mpa1) v5qVar3.W4.get(), (g38) daqVar3.rl.get(), (tra0) v5qVar3.a9.get(), (yo2) daqVar3.tq.get(), (pe) daqVar3.p9.get(), new i5w0(new d9p0(fva.j(v5qVar3.h6, (u9b) v5qVar3.i6.get()), (u9b) v5qVar3.i6.get(), (Resources) v5qVar3.X0.get())), d0rVar3);
                        break;
                }
                ji50Var.b.put(nxo0.class, new r3r(new wzq(fdg1.m0(ezg0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), jtg0.Y), bzg0.c, (vu30) null));
                break;
            case 4:
                fhk0 fhk0Var = new fhk0(this, (byte) 11);
                Set set2 = v5n0.a;
                ji50Var.b.put(pxo0.class, r4o1.Q(new nrj0(this, (byte) 14), set2, fhk0Var, b5n0.f));
                break;
            default:
                qvp qvpVar = (qvp) obj2;
                d0r d0rVar4 = ji50Var.a;
                switch (qvpVar.a) {
                    case 0:
                        nwp nwpVar4 = (nwp) ((gbp) qvpVar.b).c;
                        kt91 kt91VarD2 = nwpVar4.a.d1();
                        c8o.l(kt91VarD2);
                        ynb0 ynb0VarA = xqu.a(nwpVar4.V0);
                        lzn0 lzn0Var6 = (lzn0) nwpVar4.G.get();
                        dg30 dg30Var = (dg30) nwpVar4.e.get();
                        em0 em0Var4 = nwpVar4.a;
                        dto0 dto0Var = (dto0) ((daq) em0Var4.b).eg.get();
                        c8o.l(dto0Var);
                        s4w0 s4w0VarB = nwpVar4.B();
                        q8n q8nVarG1 = em0Var4.g0();
                        c8o.l(q8nVarG1);
                        s880 s880Var = new s880(lzn0Var6, dg30Var, dto0Var, s4w0VarB, q8nVarG1);
                        gw70 gw70VarA1 = em0Var4.a0();
                        c8o.l(gw70VarA1);
                        n0oVar = new n0o(kt91VarD2, ynb0VarA, s880Var, gw70VarA1, nwpVar4.B(), d0rVar4);
                        break;
                    default:
                        thq thqVar3 = (thq) qvpVar.b;
                        daq daqVar4 = thqVar3.b;
                        kt91 kt91Var = (kt91) daqVar4.f8.get();
                        v5q v5qVar4 = (v5q) thqVar3.c;
                        ynb0 ynb0VarA2 = xqu.a(v5qVar4.n9);
                        lzn0 lzn0Var7 = (lzn0) v5qVar4.U0.get();
                        dg30 dg30Var2 = (dg30) v5qVar4.i.a;
                        daq daqVar5 = v5qVar4.b;
                        n0oVar = new n0o(kt91Var, ynb0VarA2, new s880(lzn0Var7, dg30Var2, (dto0) daqVar5.eg.get(), (s4w0) v5qVar4.o9.get(), (q8n) daqVar5.V2.get()), (gw70) daqVar4.d8.get(), (s4w0) v5qVar4.o9.get(), d0rVar4);
                        break;
                }
                ji50Var.b.put(txo0.class, new r3r(new wzq(fdg1.m0(n0oVar, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new mwv0(this, (byte) 2)), vbv0.S0, (vu30) null));
                break;
        }
    }
}
