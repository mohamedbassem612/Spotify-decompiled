package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata.FilterTagsDatabase;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class blp implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ blp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        uap uapVar = (uap) this.c;
        b7x b7xVar = b7x.a;
        byte b = this.b;
        switch (b) {
            case 0:
                q7r0 q7r0Var = (q7r0) uapVar.H;
                q7r0 q7r0Var2 = (q7r0) uapVar.H;
                zyc0 zyc0Var = (zyc0) uapVar.I;
                l5d0 l5d0Var = (l5d0) uapVar.a.get();
                d3t d3tVar = (d3t) uapVar.b.get();
                rwz0 rwz0Var = (rwz0) uapVar.c.get();
                x711 x711Var = (x711) uapVar.g.get();
                l5d0 l5d0Var2 = (l5d0) uapVar.a.get();
                l5d0 l5d0Var3 = (l5d0) uapVar.a.get();
                bk90 bk90Var = (bk90) uapVar.h.get();
                luk lukVarA = zyc0Var.a();
                c8o.l(lukVarA);
                so4 so4Var = new so4(30000, lukVarA, false);
                kly0 kly0Var = zyc0Var.i;
                pe peVar = (pe) zyc0Var.k.get();
                c8o.l(peVar);
                gw70 gw70Var = (gw70) kly0Var.get();
                c8o.l(gw70Var);
                mpp mppVar = (mpp) uapVar.j.get();
                q8n q8nVarB = zyc0Var.b();
                c8o.l(q8nVarB);
                jly0 jly0Var = uapVar.k;
                l5d0 l5d0Var4 = (l5d0) uapVar.a.get();
                s061 s061Var = (s061) uapVar.l.get();
                jly0 jly0Var2 = uapVar.m;
                luk lukVarA2 = zyc0Var.a();
                c8o.l(lukVarA2);
                dxy dxyVar = new dxy(jly0Var2, new xx4(false, false, lukVarA2), l5d0Var4, s061Var, (npp) uapVar.o.get(), (wen0) uapVar.i.get(), (byte) 6);
                ppp pppVar = (ppp) uapVar.r.get();
                q8n q8nVarC = zyc0Var.c();
                c8o.l(q8nVarC);
                s880 s880Var = new s880(jly0Var, peVar, gw70Var, mppVar, dxyVar, pppVar, q8nVarB, q8nVarC);
                q8n q8nVarC2 = zyc0Var.c();
                c8o.l(q8nVarC2);
                ur00 ur00Var = new ur00(l5d0Var3, bk90Var, so4Var, s880Var, q8nVarC2, (byte) 13);
                bqr0 bqr0Var = (bqr0) uapVar.s.get();
                bve0 bve0Var = (bve0) uapVar.t.get();
                ruz ruzVarA = ((cyp) uapVar.u.get()).a();
                iac0 iac0Var = q7r0Var2.d.c;
                c8o.m(iac0Var);
                bnj1 bnj1Var = (bnj1) zyc0Var.x.get();
                c8o.l(bnj1Var);
                b0d0 b0d0Var = (b0d0) zyc0Var.z.get();
                c8o.l(b0d0Var);
                lik1 viewUri = ((bve0) uapVar.t.get()).getViewUri();
                a690 a690VarL = u1n0.l(q7r0Var2);
                String str = (String) zyc0Var.a.get();
                c8o.l(str);
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.w(viewUri.a);
                zpzVarY.t(str);
                zpzVarY.u(a690VarL.a.getName());
                zpzVarY.s("playlist");
                wp20 wp20Var = new wp20(ruzVarA, iac0Var, bnj1Var, b0d0Var, zpzVarY.build());
                t2j0 t2j0Var = (t2j0) zyc0Var.k0.get();
                c8o.l(t2j0Var);
                lvc lvcVar = new lvc(t2j0Var);
                n3d0 n3d0Var = (n3d0) zyc0Var.A.get();
                c8o.l(n3d0Var);
                z3d0 z3d0Var = (z3d0) uapVar.v.get();
                acr acrVar = (acr) uapVar.k.get();
                v9c v9cVar = new v9c((byte) 12);
                vtc0 vtc0Var = (vtc0) zyc0Var.F.get();
                c8o.l(vtc0Var);
                spp sppVar = (spp) uapVar.w.get();
                gw70 gw70Var2 = (gw70) kly0Var.get();
                c8o.l(gw70Var2);
                laz lazVar = new laz(gw70Var2, (byte) 17);
                huc0 huc0Var = (huc0) uapVar.x.get();
                jtk jtkVar = (jtk) uapVar.C.get();
                fp8 fp8VarB = uapVar.b();
                d8c0 d8c0Var = (d8c0) uapVar.f.get();
                yqg yqgVar = (yqg) zyc0Var.e.get();
                c8o.l(yqgVar);
                c8o.l(zyc0Var.d());
                dh30 dh30Var = new dh30(yqgVar, (top) uapVar.D.get(), (byte) 14);
                uop uopVar = (uop) uapVar.E.get();
                q8n q8nVarB2 = zyc0Var.b();
                c8o.l(q8nVarB2);
                ezc ezcVarI = uapVar.i();
                vop vopVar = (vop) uapVar.Q.get();
                lix0 lix0Var = (lix0) uapVar.R.get();
                q8n q8nVar = (q8n) zyc0Var.c.get();
                c8o.l(q8nVar);
                app appVar = (app) uapVar.S.get();
                cpp cppVar = (cpp) uapVar.Y.get();
                epp eppVar = (epp) uapVar.a0.get();
                List list = (List) zyc0Var.L0.get();
                c8o.l(list);
                qzu0 qzu0Var = new qzu0(d3tVar, rwz0Var, x711Var, l5d0Var2, ur00Var, bqr0Var, bve0Var, wp20Var, lvcVar, n3d0Var, z3d0Var, acrVar, v9cVar, vtc0Var, sppVar, lazVar, huc0Var, jtkVar, fp8VarB, d8c0Var, dh30Var, uopVar, q8nVarB2, ezcVarI, vopVar, lix0Var, q8nVar, appVar, cppVar, eppVar, list, (gpp) uapVar.b0.get(), (hpp) uapVar.c0.get(), (ipp) uapVar.d0.get(), (jpp) uapVar.e0.get());
                z7e0 z7e0Var = (z7e0) zyc0Var.P.get();
                c8o.l(z7e0Var);
                bve0 bve0Var2 = (bve0) uapVar.t.get();
                l5d0 l5d0Var5 = (l5d0) uapVar.a.get();
                kly0 kly0Var2 = zyc0Var.w;
                lzn0 lzn0VarD = zyc0Var.d();
                c8o.l(lzn0VarD);
                op31 op31Var = (op31) kly0Var2.get();
                c8o.l(op31Var);
                hc30 hc30Var = new hc30(lzn0VarD, op31Var, uapVar.m(), (byte) 1);
                lzn0 lzn0VarD2 = zyc0Var.d();
                c8o.l(lzn0VarD2);
                op31 op31Var2 = (op31) kly0Var2.get();
                c8o.l(op31Var2);
                hc30 hc30Var2 = new hc30(lzn0VarD2, op31Var2, uapVar.m(), (byte) 0);
                lzn0 lzn0VarD3 = zyc0Var.d();
                c8o.l(lzn0VarD3);
                f330 f330Var = new f330(lzn0VarD3, (byte) 1);
                kpp kppVar = (kpp) uapVar.h0.get();
                q3b1 q3b1Var = (q3b1) zyc0Var.l.get();
                c8o.l(q3b1Var);
                efr efrVar = new efr(q3b1Var, (byte) 21);
                h431 h431Var = (h431) uapVar.i0.get();
                hs71 hs71Var = (hs71) zyc0Var.Z.get();
                c8o.l(hs71Var);
                lzn0 lzn0VarD4 = zyc0Var.d();
                c8o.l(lzn0VarD4);
                op31 op31Var3 = (op31) kly0Var2.get();
                c8o.l(op31Var3);
                return new yyc0(q7r0Var, l5d0Var, qzu0Var, z7e0Var, bve0Var2, new byp(l5d0Var5, hc30Var, hc30Var2, f330Var, kppVar, efrVar, h431Var, hs71Var, new hc30(lzn0VarD4, op31Var3, uapVar.m(), (byte) 2)));
            case 1:
                zle1 zle1Var = (zle1) ((zyc0) uapVar.I).h.get();
                c8o.l(zle1Var);
                return new l5d0(zle1Var);
            case 2:
                return new d3t();
            case 3:
                zyc0 zyc0Var2 = (zyc0) uapVar.I;
                zyc0 zyc0Var3 = (zyc0) uapVar.I;
                yqg yqgVar2 = (yqg) zyc0Var2.e.get();
                c8o.l(yqgVar2);
                iyc0 iyc0Var = (iyc0) zyc0Var3.q.get();
                c8o.l(iyc0Var);
                q8n q8nVarB3 = zyc0Var3.b();
                c8o.l(q8nVarB3);
                return new rwz0(yqgVar2, iyc0Var, q8nVarB3);
            case 4:
                return new bpp();
            case 5:
                jly0 jly0Var3 = uapVar.a;
                zyc0 zyc0Var4 = (zyc0) uapVar.I;
                l5d0 l5d0Var6 = (l5d0) jly0Var3.get();
                fzc0 fzc0Var = (fzc0) uapVar.J;
                q8n q8nVarB4 = zyc0Var4.b();
                c8o.l(q8nVarB4);
                List list2 = (List) zyc0Var4.z0.get();
                c8o.l(list2);
                tzr0 tzr0Var = new tzr0(l5d0Var6, fzc0Var, q8nVarB4, list2, (byte) 15);
                l5d0 l5d0Var7 = (l5d0) uapVar.a.get();
                fp8 fp8VarB2 = uapVar.b();
                xrc0 xrc0Var = (xrc0) zyc0Var4.p.get();
                c8o.l(xrc0Var);
                q59 q59Var = new q59(xrc0Var);
                exu0 exu0Var = (exu0) uapVar.e.get();
                d8c0 d8c0Var2 = (d8c0) uapVar.f.get();
                luk lukVarA3 = zyc0Var4.a();
                c8o.l(lukVarA3);
                so4 so4Var2 = new so4(30000, lukVarA3, false);
                q8n q8nVarB5 = zyc0Var4.b();
                c8o.l(q8nVarB5);
                mr20 mr20Var = (mr20) zyc0Var4.y.get();
                c8o.l(mr20Var);
                ezc ezcVarI2 = uapVar.i();
                xrc0 xrc0Var2 = (xrc0) zyc0Var4.p.get();
                c8o.l(xrc0Var2);
                return new x711(tzr0Var, l5d0Var7, fp8VarB2, q59Var, exu0Var, d8c0Var2, so4Var2, q8nVarB5, mr20Var, ezcVarI2, xrc0Var2);
            case 6:
                return new exu0();
            case 7:
                i310 i310Var = (i310) ((zyc0) uapVar.I).E.get();
                c8o.l(i310Var);
                return new d8c0(i310Var);
            case 8:
                return new bk90();
            case 9:
                return new mpp(this);
            case 10:
                return gio1.b((Object) null);
            case 11:
                fzc0 fzc0Var2 = (fzc0) uapVar.J;
                acr acrVar2 = new acr();
                acrVar2.a = fzc0Var2;
                return acrVar2;
            case 12:
                iac0 iac0Var2 = ((q7r0) uapVar.H).d.c;
                c8o.m(iac0Var2);
                c9n c9nVarQ = cto1.q(iac0Var2);
                ncp ncpVar = (ncp) ((zyc0) uapVar.I).m.get();
                c8o.l(ncpVar);
                return ncpVar.a(c9nVarQ, r6x.a);
            case 13:
                tl7 tl7VarB = cwl1.B((q7r0) uapVar.H);
                c8o.m(tl7VarB);
                return tl7VarB;
            case 14:
                return new npp(this);
            case 15:
                return new opp(this);
            case 16:
                return new ppp(this);
            case 17:
                return new qpp(this);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new rpp();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                fzc0 fzc0Var3 = (fzc0) uapVar.J;
                bqr0 bqr0Var2 = new bqr0();
                bqr0Var2.a = fzc0Var3;
                return bqr0Var2;
            case 20:
                bqr0 bqr0Var3 = (bqr0) uapVar.s.get();
                agc0 agc0Var = (agc0) ((zyc0) uapVar.I).H.get();
                c8o.l(agc0Var);
                return new bve0(bqr0Var3, agc0Var);
            case 21:
                t8u0 t8u0Var = (t8u0) ((zyc0) uapVar.I).W.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) uapVar.H, t8u0Var);
            case 22:
                return new z3d0();
            case 23:
                return new spp(this);
            case 24:
                return new huc0();
            case 25:
                return new jtk((tpp) uapVar.y.get(), (rop) uapVar.z.get(), (sop) uapVar.B.get());
            case 26:
                return new tpp();
            case 27:
                return new rop();
            case 28:
                return new sop(this);
            case 29:
                luk lukVarA4 = ((zyc0) uapVar.I).a();
                c8o.l(lukVarA4);
                return new uly0(new ao4(false, true, lukVarA4));
            case 30:
                return new top(this);
            case 31:
                return new uop(this);
            case 32:
                return new vop(this);
            case 33:
                return gio1.b(b7xVar);
            case 34:
                return gio1.b(b7xVar);
            case 35:
                return gio1.b(Boolean.FALSE);
            case 36:
                return new wop(this);
            case 37:
                return new xop(this);
            case 38:
                return new yop(this);
            case 39:
                return new zop(this);
            case 40:
                return new lix0();
            case 41:
                return new app(this);
            case 42:
                return new cpp(this);
            case 43:
                return new txc0(((yyc0) uapVar.T.get()).f);
            case 44:
                luk lukVarA5 = ((zyc0) uapVar.I).a();
                c8o.l(lukVarA5);
                return new nq4(false, lukVarA5);
            case 45:
                return new dpp(this);
            case 46:
                return mgo1.e(0, 1, 0, 5);
            case 47:
                return new epp(this);
            case 48:
                return new fpp();
            case 49:
                return new gpp(this);
            case 50:
                return new hpp(this);
            case 51:
                return new ipp(this);
            case 52:
                return new jpp(this);
            case 53:
                return new kpp(this);
            case 54:
                return new tf90();
            case 55:
                return new lpp(this);
            case 56:
                return new h431();
            case 57:
                ttm0 ttm0VarE = cwl1.E((q7r0) uapVar.H);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case 58:
                abu0 abu0VarF = cwl1.F((q7r0) uapVar.H);
                c8o.m(abu0VarF);
                return abu0VarF;
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object b() {
        h72 h72Var = (h72) this.c;
        xdd0 xdd0Var = (xdd0) h72Var.b;
        q7r0 q7r0Var = (q7r0) h72Var.d;
        wdd0 wdd0Var = (wdd0) h72Var.c;
        byte b = this.b;
        switch (b) {
            case 0:
                nvh nvhVar = new nvh((d0r) ((jly0) h72Var.e).get());
                kly0 kly0Var = wdd0Var.s;
                kly0 kly0Var2 = wdd0Var.d;
                f1n0 f1n0VarD = wdd0Var.d();
                c8o.l(f1n0VarD);
                jc9 jc9Var = new jc9(f1n0VarD, (byte) 17);
                yqg yqgVarA = wdd0Var.a();
                c8o.l(yqgVarA);
                lik1 lik1VarU = h72Var.U();
                xrc0 xrc0Var = (xrc0) kly0Var2.get();
                c8o.l(xrc0Var);
                b7r0 b7r0Var = (b7r0) kly0Var.get();
                c8o.l(b7r0Var);
                uit0 uit0Var = new uit0(yqgVarA, lik1VarU, xrc0Var, b7r0Var);
                f1n0 f1n0VarD2 = wdd0Var.d();
                c8o.l(f1n0VarD2);
                xrc0 xrc0Var2 = (xrc0) kly0Var2.get();
                c8o.l(xrc0Var2);
                lik1 lik1VarU2 = h72Var.U();
                yqg yqgVarA2 = wdd0Var.a();
                c8o.l(yqgVarA2);
                b7r0 b7r0Var2 = (b7r0) kly0Var.get();
                c8o.l(b7r0Var2);
                ytp0 ytp0Var = new ytp0(f1n0VarD2, xrc0Var2, lik1VarU2, yqgVarA2, b7r0Var2, (byte) 9);
                u3e0 u3e0Var = new u3e0((d0r) ((jly0) h72Var.e).get());
                d0r d0rVar = (d0r) ((jly0) h72Var.e).get();
                me30 me30Var = (me30) wdd0Var.o.get();
                c8o.l(me30Var);
                fad0 fad0Var = new fad0(d0rVar, me30Var, (byte) 5);
                vgm vgmVar = (vgm) wdd0Var.g.get();
                c8o.l(vgmVar);
                q8n q8nVarC = wdd0Var.c();
                c8o.l(q8nVarC);
                nn61 nn61Var = new nn61(vgmVar, q8nVarC, false, (byte) 10);
                q8n q8nVarB = wdd0Var.b();
                c8o.l(q8nVarB);
                hlw hlwVar = new hlw(jc9Var, uit0Var, ytp0Var, u3e0Var, fad0Var, nn61Var, q8nVarB);
                ihd0 ihd0Var = (ihd0) wdd0Var.t.get();
                c8o.l(ihd0Var);
                xho xhoVar = new xho(((mko) ((jly0) h72Var.f).get()).b());
                q8n q8nVarB2 = wdd0Var.b();
                c8o.l(q8nVarB2);
                q8n q8nVarC2 = wdd0Var.c();
                c8o.l(q8nVarC2);
                m6i1 m6i1Var = new m6i1(hlwVar, ihd0Var, xhoVar, q8nVarB2, q8nVarC2);
                kly0 kly0Var3 = wdd0Var.d;
                kly0 kly0Var4 = wdd0Var.s;
                f1n0 f1n0VarD3 = wdd0Var.d();
                c8o.l(f1n0VarD3);
                wrg wrgVar = new wrg(f1n0VarD3);
                yqg yqgVarA3 = wdd0Var.a();
                c8o.l(yqgVarA3);
                lik1 lik1VarU3 = h72Var.U();
                xrc0 xrc0Var3 = (xrc0) kly0Var3.get();
                c8o.l(xrc0Var3);
                b7r0 b7r0Var3 = (b7r0) kly0Var4.get();
                c8o.l(b7r0Var3);
                uit0 uit0Var2 = new uit0(yqgVarA3, lik1VarU3, xrc0Var3, b7r0Var3);
                f1n0 f1n0VarD4 = wdd0Var.d();
                c8o.l(f1n0VarD4);
                xrc0 xrc0Var4 = (xrc0) kly0Var3.get();
                c8o.l(xrc0Var4);
                lik1 lik1VarU4 = h72Var.U();
                yqg yqgVarA4 = wdd0Var.a();
                c8o.l(yqgVarA4);
                b7r0 b7r0Var4 = (b7r0) kly0Var4.get();
                c8o.l(b7r0Var4);
                phi0 phi0Var = new phi0(f1n0VarD4, xrc0Var4, lik1VarU4, yqgVarA4, b7r0Var4, (byte) 13);
                il00 il00Var = new il00((d0r) ((jly0) h72Var.e).get(), (byte) 27);
                d0r d0rVar2 = (d0r) ((jly0) h72Var.e).get();
                me30 me30Var2 = (me30) wdd0Var.o.get();
                c8o.l(me30Var2);
                v6a0 v6a0Var = new v6a0(d0rVar2, me30Var2, (byte) 25);
                vgm vgmVar2 = (vgm) wdd0Var.g.get();
                c8o.l(vgmVar2);
                q8n q8nVarC3 = wdd0Var.c();
                c8o.l(q8nVarC3);
                ke71 ke71Var = new ke71(vgmVar2, q8nVarC3, (byte) 6);
                ttm0 ttm0Var = (ttm0) ((jly0) h72Var.g).get();
                yqg yqgVarA5 = wdd0Var.a();
                c8o.l(yqgVarA5);
                q8n q8nVarC4 = wdd0Var.c();
                c8o.l(q8nVarC4);
                phi0 phi0Var2 = new phi0(ttm0Var, yqgVarA5, q8nVarC4);
                quz quzVar = new quz(((cyp) ((jly0) h72Var.h).get()).a());
                puz puzVar = new puz(((cyp) ((jly0) h72Var.h).get()).a());
                aas aasVar = (aas) wdd0Var.A.get();
                c8o.l(aasVar);
                b7r0 b7r0Var5 = (b7r0) kly0Var4.get();
                c8o.l(b7r0Var5);
                gid gidVar = new gid(aasVar, b7r0Var5, (byte) 18);
                g5p0 g5p0Var = (g5p0) wdd0Var.B.get();
                c8o.l(g5p0Var);
                q8n q8nVarC5 = wdd0Var.c();
                c8o.l(q8nVarC5);
                sjq0 sjq0Var = new sjq0(g5p0Var, q8nVarC5, (byte) 0);
                y390 y390Var = (y390) wdd0Var.D.get();
                c8o.l(y390Var);
                iac0 iac0Var = q7r0Var.d.c;
                c8o.m(iac0Var);
                wr00 wr00VarA = y390Var.a(iac0Var, r6h1.c);
                q8n q8nVarC6 = wdd0Var.c();
                c8o.l(q8nVarC6);
                ke71 ke71Var2 = new ke71(wr00VarA, q8nVarC6, (byte) 7);
                q8n q8nVarB3 = wdd0Var.b();
                c8o.l(q8nVarB3);
                glw glwVar = new glw(wrgVar, uit0Var2, phi0Var, il00Var, v6a0Var, ke71Var, phi0Var2, quzVar, puzVar, gidVar, sjq0Var, ke71Var2, q8nVarB3);
                ihd0 ihd0Var2 = (ihd0) wdd0Var.t.get();
                c8o.l(ihd0Var2);
                Flowable flowable = (Flowable) wdd0Var.z.get();
                c8o.l(flowable);
                q8n q8nVarB4 = wdd0Var.b();
                c8o.l(q8nVarB4);
                y1u0 y1u0Var = new y1u0(flowable, q8nVarB4);
                tuz tuzVarE = ((cyp) ((jly0) h72Var.h).get()).e();
                q8n q8nVarB5 = wdd0Var.b();
                c8o.l(q8nVarB5);
                y1u0 y1u0Var2 = new y1u0(tuzVarE, q8nVarB5);
                zr00 zr00Var = (zr00) wdd0Var.C.get();
                c8o.l(zr00Var);
                xho xhoVar2 = new xho(((mko) ((jly0) h72Var.f).get()).b());
                yqg yqgVarA6 = wdd0Var.a();
                c8o.l(yqgVarA6);
                q8n q8nVarB6 = wdd0Var.b();
                c8o.l(q8nVarB6);
                q8n q8nVarC7 = wdd0Var.c();
                c8o.l(q8nVarC7);
                zx00 zx00Var = new zx00(glwVar, ihd0Var2, y1u0Var, y1u0Var2, zr00Var, xhoVar2, yqgVarA6, q8nVarB6, q8nVarC7);
                lik1 lik1VarU5 = h72Var.U();
                f1n0 f1n0VarD5 = wdd0Var.d();
                c8o.l(f1n0VarD5);
                gdx0 gdx0Var = (gdx0) wdd0Var.F.get();
                c8o.l(gdx0Var);
                lik1 lik1VarU6 = h72Var.U();
                jl21 jl21Var = (jl21) wdd0Var.E.get();
                c8o.l(jl21Var);
                j0a1 j0a1Var = (j0a1) wdd0Var.G.get();
                c8o.l(j0a1Var);
                d7b d7bVar = (d7b) wdd0Var.H.get();
                c8o.l(d7bVar);
                jed0 jed0Var = (jed0) wdd0Var.I.get();
                c8o.l(jed0Var);
                y621 y621Var = (y621) wdd0Var.J.get();
                c8o.l(y621Var);
                vcd0 vcd0Var = (vcd0) wdd0Var.m.get();
                c8o.l(vcd0Var);
                hgd0 hgd0Var = (hgd0) wdd0Var.n.get();
                c8o.l(hgd0Var);
                x860 x860Var = (x860) wdd0Var.L.get();
                c8o.l(x860Var);
                kbd kbdVar = (kbd) wdd0Var.M.get();
                c8o.l(kbdVar);
                xy91 xy91Var = (xy91) wdd0Var.O.get();
                c8o.l(xy91Var);
                e8i1 e8i1Var = new e8i1(lik1VarU6, jl21Var, j0a1Var, d7bVar, jed0Var, y621Var, vcd0Var, hgd0Var, x860Var, kbdVar, xy91Var);
                joo jooVar = (joo) wdd0Var.K.get();
                c8o.l(jooVar);
                q8n q8nVarC8 = wdd0Var.c();
                c8o.l(q8nVarC8);
                i4q i4qVar = (i4q) wdd0Var.N.get();
                c8o.l(i4qVar);
                pt ptVar = new pt(lik1VarU5, f1n0VarD5, gdx0Var, e8i1Var, jooVar, q8nVarC8, i4qVar);
                yqg yqgVarA7 = wdd0Var.a();
                c8o.l(yqgVarA7);
                f1n0 f1n0VarD6 = wdd0Var.d();
                c8o.l(f1n0VarD6);
                b1r0 b1r0Var = (b1r0) wdd0Var.h.get();
                c8o.l(b1r0Var);
                c9n c9nVar = (c9n) wdd0Var.e.get();
                c8o.l(c9nVar);
                q8n q8nVarB7 = wdd0Var.b();
                c8o.l(q8nVarB7);
                blp blpVar = (blp) h72Var.i;
                bfd bfdVar = (bfd) wdd0Var.p.get();
                c8o.l(bfdVar);
                Flowable flowable2 = (Flowable) wdd0Var.q.get();
                c8o.l(flowable2);
                cm0 cm0Var = new cm0(yqgVarA7, f1n0VarD6, b1r0Var, c9nVar, q8nVarB7, blpVar, bfdVar, flowable2);
                Context context = (Context) wdd0Var.b.get();
                c8o.l(context);
                kt91 kt91Var = (kt91) wdd0Var.w.get();
                c8o.l(kt91Var);
                d0r d0rVar3 = (d0r) ((jly0) h72Var.e).get();
                c9n c9nVar2 = (c9n) wdd0Var.e.get();
                c8o.l(c9nVar2);
                rwj rwjVar = new rwj(context, kt91Var, d0rVar3, c9nVar2);
                yqg yqgVarA8 = wdd0Var.a();
                c8o.l(yqgVarA8);
                f1n0 f1n0VarD7 = wdd0Var.d();
                c8o.l(f1n0VarD7);
                c9n c9nVar3 = (c9n) wdd0Var.e.get();
                c8o.l(c9nVar3);
                q8n q8nVarB8 = wdd0Var.b();
                c8o.l(q8nVarB8);
                yqg yqgVarA9 = wdd0Var.a();
                c8o.l(yqgVarA9);
                bfd bfdVar2 = (bfd) wdd0Var.p.get();
                c8o.l(bfdVar2);
                blp blpVar2 = (blp) h72Var.i;
                Flowable flowable3 = (Flowable) wdd0Var.q.get();
                c8o.l(flowable3);
                vbe1 vbe1Var = new vbe1(yqgVarA8, f1n0VarD7, c9nVar3, q8nVarB8, new fta(yqgVarA9, bfdVar2, blpVar2, flowable3, (byte) 27));
                z201 z201Var = (z201) wdd0Var.f.get();
                c8o.l(z201Var);
                iaf iafVar = (iaf) wdd0Var.v.get();
                c8o.l(iafVar);
                hgd0 hgd0Var2 = (hgd0) wdd0Var.n.get();
                c8o.l(hgd0Var2);
                los losVar = (los) ((jly0) h72Var.t).get();
                f1n0 f1n0VarD8 = wdd0Var.d();
                c8o.l(f1n0VarD8);
                return new sdd0(nvhVar, m6i1Var, zx00Var, ptVar, cm0Var, rwjVar, vbe1Var, xdd0Var, z201Var, iafVar, hgd0Var2, losVar, f1n0VarD8);
            case 1:
                return cwl1.C(q7r0Var);
            case 2:
                lko lkoVar = (lko) wdd0Var.j.get();
                c8o.l(lkoVar);
                mko mkoVarB = lkoVar.b((String) null, new huz(dm61.A0(xdd0Var.b), (byte) 10), new ro8(xdd0Var, null, (byte) 14));
                mkoVarB.start();
                q7r0Var.d.c.getLifecycle().a(new i83(mkoVarB, (byte) 10));
                return mkoVarB;
            case 3:
                ttm0 ttm0VarE = cwl1.E(q7r0Var);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            case 4:
                t8u0 t8u0Var = (t8u0) wdd0Var.y.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(q7r0Var.d.c.getLifecycle());
            case 5:
                g310 g310Var = (g310) wdd0Var.r.get();
                c8o.l(g310Var);
                return g310Var;
            case 6:
                return pzm.h((mos) wdd0Var.x.get());
            case 7:
                uu00 uu00Var = (uu00) wdd0Var.i.get();
                c8o.l(uu00Var);
                q8n q8nVarB9 = wdd0Var.b();
                c8o.l(q8nVarB9);
                return new iei1(uu00Var, xdd0Var, q8nVarB9);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object c() {
        zl5 zl5Var = (zl5) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new mqp(this, (byte) 0);
            case 1:
                return zl5Var.I().b;
            case 2:
                return zl5Var.I().a().x(e710.N0);
            case 3:
                return f2u0.C(f2u0.D((Flowable) ((jly0) zl5Var.f).get()), (Flowable) ((jly0) zl5Var.g).get(), (Flowable) ((jly0) zl5Var.h).get(), zl5Var.a());
            case 4:
                jly0 jly0Var = (jly0) zl5Var.f;
                sjf0 sjf0Var = (sjf0) zl5Var.b;
                Flowable flowable = (Flowable) jly0Var.get();
                Scheduler scheduler = (Scheduler) sjf0Var.k.get();
                c8o.l(scheduler);
                yqg yqgVar = (yqg) sjf0Var.j.get();
                c8o.l(yqgVar);
                return f2u0.A(flowable, scheduler, yqgVar, zl5Var.a());
            case 5:
                return f2u0.y((Flowable) ((jly0) zl5Var.f).get(), zl5Var.a());
            case 6:
                return new rwa0((PublishProcessor) ((jly0) zl5Var.j).get(), (byte) 18);
            case 7:
                return new PublishProcessor();
            case 8:
                return f2u0.B(f2u0.D((Flowable) ((jly0) zl5Var.f).get()), (Flowable) ((jly0) zl5Var.l).get(), (Flowable) ((jly0) zl5Var.h).get(), zl5Var.a());
            case 9:
                jly0 jly0Var2 = (jly0) zl5Var.f;
                sjf0 sjf0Var2 = (sjf0) zl5Var.b;
                Flowable flowable2 = (Flowable) jly0Var2.get();
                Scheduler scheduler2 = (Scheduler) sjf0Var2.k.get();
                c8o.l(scheduler2);
                yqg yqgVar2 = (yqg) sjf0Var2.j.get();
                c8o.l(yqgVar2);
                return f2u0.z(flowable2, scheduler2, yqgVar2, zl5Var.a());
            case 10:
                Context context = (Context) ((sjf0) zl5Var.b).b.get();
                c8o.l(context);
                return new lm30(context, (byte) 1);
            case 11:
                return new FlowableOnBackpressureLatest((PublishProcessor) ((jly0) zl5Var.j).get());
            case 12:
                luk lukVarA = ((sjf0) zl5Var.b).a();
                c8o.l(lukVarA);
                return new cr4(false, false, false, lukVarA);
            case 13:
                luk lukVarA2 = ((sjf0) zl5Var.b).a();
                c8o.l(lukVarA2);
                return new er4(false, false, lukVarA2);
            case 14:
                luk lukVarA3 = ((sjf0) zl5Var.b).a();
                c8o.l(lukVarA3);
                return new sm4(false, lukVarA3);
            case 15:
                d0r d0rVar = (d0r) ((jly0) zl5Var.s).get();
                s8a1 s8a1Var = (s8a1) ((jly0) zl5Var.u).get();
                q8n q8nVar = (q8n) ((sjf0) zl5Var.b).m.get();
                c8o.l(q8nVar);
                return new oov0(d0rVar, s8a1Var, q8nVar);
            case 16:
                return cwl1.C((q7r0) zl5Var.d);
            case 17:
                nqp nqpVar = (nqp) ((jly0) zl5Var.t).get();
                d0r d0rVar2 = (d0r) ((jly0) zl5Var.s).get();
                luk lukVarA4 = ((sjf0) zl5Var.b).a();
                c8o.l(lukVarA4);
                if (new br4(false, false, lukVarA4).b()) {
                    return nqpVar.a(d0rVar2);
                }
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new nqp(this, (byte) 0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                oqp oqpVar = (oqp) ((jly0) zl5Var.w).get();
                d0r d0rVar3 = (d0r) ((jly0) zl5Var.s).get();
                luk lukVarA5 = ((sjf0) zl5Var.b).a();
                c8o.l(lukVarA5);
                if (new br4(false, false, lukVarA5).a()) {
                    return oqpVar.a(d0rVar3);
                }
                return null;
            case 20:
                return new oqp(this, (byte) 0);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object d() {
        em0 em0Var = (em0) this.c;
        quf0 quf0Var = (quf0) em0Var.c;
        ruf0 ruf0Var = (ruf0) em0Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                return new suf0((w470) ((jly0) em0Var.f).get(), (ie70) ((jly0) em0Var.g).get());
            case 1:
                return new ie70((l670) ((jly0) em0Var.e).get(), (w470) ((jly0) em0Var.f).get());
            case 2:
                Context context = (Context) ruf0Var.b.get();
                c8o.l(context);
                vgm vgmVar = (vgm) ruf0Var.f.get();
                c8o.l(vgmVar);
                kly0 kly0Var = ruf0Var.i;
                kly0 kly0Var2 = ruf0Var.o;
                kly0 kly0Var3 = ruf0Var.h;
                i8h1 i8h1Var = (i8h1) ruf0Var.p.get();
                c8o.l(i8h1Var);
                lzn0 lzn0Var = (lzn0) ruf0Var.j.get();
                c8o.l(lzn0Var);
                in8 in8Var = new in8(lzn0Var);
                r630 r630Var = (r630) kly0Var3.get();
                c8o.l(r630Var);
                r630 r630Var2 = (r630) kly0Var3.get();
                c8o.l(r630Var2);
                da70 da70Var = new da70(r630Var2);
                fe70 fe70Var = (fe70) ((jly0) em0Var.d).get();
                gw70 gw70Var = (gw70) ruf0Var.q.get();
                c8o.l(gw70Var);
                q770 q770Var = new q770(new mc70(gw70Var, new kcg(new pob((byte) 6, false)), em0Var.Z()), new e570((byte) 0, em0Var.Z()), new z970((fe70) ((jly0) em0Var.d).get()), new ea70((fe70) ((jly0) em0Var.d).get(), (byte) 0), new ea70((fe70) ((jly0) em0Var.d).get(), (byte) 2), new ea70((fe70) ((jly0) em0Var.d).get(), (byte) 1), new fc70());
                s770 s770Var = new s770();
                yqg yqgVar = (yqg) kly0Var2.get();
                c8o.l(yqgVar);
                p670 p670Var = new p670(yqgVar, (byte) 0);
                fe70 fe70Var2 = (fe70) ((jly0) em0Var.d).get();
                j3a j3aVar = (j3a) kly0Var.get();
                c8o.l(j3aVar);
                l770 l770Var = new l770(fe70Var2, j3aVar, (byte) 0);
                yqg yqgVar2 = (yqg) kly0Var2.get();
                c8o.l(yqgVar2);
                p670 p670Var2 = new p670(yqgVar2, (byte) 1);
                fe70 fe70Var3 = (fe70) ((jly0) em0Var.d).get();
                j3a j3aVar2 = (j3a) kly0Var.get();
                c8o.l(j3aVar2);
                x970 x970Var = new x970(fe70Var, q770Var, new q770(s770Var, p670Var, l770Var, p670Var2, new l770(fe70Var3, j3aVar2, (byte) 1), new w870((fe70) ((jly0) em0Var.d).get())), new q770(new e570((byte) 1, em0Var.Z()), new h770((byte) 0), new h770((byte) 1), new k770(em0Var.Z()), new i870((fe70) ((jly0) em0Var.d).get())));
                c8o.l((u3f1) ruf0Var.g.get());
                d4b1 d4b1Var = new d4b1((byte) 4);
                String str = (String) ruf0Var.u.get();
                c8o.l(str);
                mxa1 mxa1Var = new mxa1(i8h1Var, in8Var, r630Var, da70Var, x970Var, d4b1Var, str, (byte) 2);
                boolean zBooleanValue = ((Boolean) ruf0Var.v.get()).booleanValue();
                k670 k670Var = (k670) mxa1Var.b(context, quf0Var).t().s(vgmVar).b;
                k670Var.i = zBooleanValue;
                return k670Var.a();
            case 3:
                Activity activity = (Activity) ruf0Var.a.get();
                c8o.l(activity);
                gw70 gw70Var2 = (gw70) ruf0Var.q.get();
                c8o.l(gw70Var2);
                hl00 hl00Var = new hl00(gw70Var2, (byte) 14);
                j3a j3aVar3 = (j3a) ruf0Var.i.get();
                c8o.l(j3aVar3);
                return new fe70(activity, hl00Var, j3aVar3);
            case 4:
                Context context2 = (Context) ruf0Var.b.get();
                c8o.l(context2);
                l670 l670Var = (l670) ((jly0) em0Var.e).get();
                Activity activity2 = (Activity) ruf0Var.a.get();
                c8o.l(activity2);
                Context context3 = (Context) ruf0Var.b.get();
                c8o.l(context3);
                l7m0 l7m0VarW = mw60.w(context3, (l670) ((jly0) em0Var.e).get(), em0Var.Z());
                Resources resources = (Resources) ruf0Var.c.get();
                c8o.l(resources);
                w470 w470VarD = new ycc1(new sw9(1, quf0Var), new sw9(activity2, l7m0VarW, td70.a(resources, em0Var.Z())), (byte) 1).d(context2, l670Var);
                c8o.m(w470VarD);
                return w470VarD;
            case 5:
                suf0 suf0Var = (suf0) ((jly0) em0Var.h).get();
                Scheduler scheduler = (Scheduler) ruf0Var.s.get();
                c8o.l(scheduler);
                o3e0 o3e0Var = new o3e0(new z8c0((puf0) ((jly0) em0Var.i).get(), (byte) 12), new c681(em0Var.f0(), (byte) 25), (lve1) ((jly0) em0Var.t).get());
                Flowable flowable = (Flowable) ruf0Var.r.get();
                c8o.l(flowable);
                return new yuf0(suf0Var, scheduler, o3e0Var, new ObservableFromPublisher(flowable.x(new f341((byte) 13)).q(600L, TimeUnit.MILLISECONDS).t(Functions.a)), new dp5(em0Var.f0(), (byte) 26));
            case 6:
                RetrofitMaker retrofitMaker = (RetrofitMaker) ruf0Var.e.get();
                c8o.l(retrofitMaker);
                puf0 puf0Var = (puf0) retrofitMaker.createWebgateService(puf0.class, "android-made-for-you-hub");
                c8o.m(puf0Var);
                return puf0Var;
            case 7:
                Scheduler scheduler2 = (Scheduler) ruf0Var.t.get();
                c8o.l(scheduler2);
                em0Var.f0();
                return new lve1(800, byp.m(), scheduler2);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object e() {
        c21 c21Var = (c21) this.c;
        uuf0 uuf0Var = (uuf0) c21Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                suf0 suf0Var = (suf0) ((jly0) c21Var.g).get();
                Scheduler scheduler = (Scheduler) uuf0Var.p.get();
                c8o.l(scheduler);
                o3e0 o3e0Var = new o3e0(new z8c0((puf0) ((jly0) c21Var.h).get(), (byte) 12), new c681(c21Var.s(), (byte) 25), (lve1) ((jly0) c21Var.i).get());
                Flowable flowable = (Flowable) uuf0Var.o.get();
                c8o.l(flowable);
                return new yuf0(suf0Var, scheduler, o3e0Var, new ObservableFromPublisher(flowable.x(si10.N0).q(600L, TimeUnit.MILLISECONDS).t(Functions.a)), new dp5(c21Var.s(), (byte) 26));
            case 1:
                return new suf0((w470) ((jly0) c21Var.e).get(), (ie70) ((jly0) c21Var.f).get());
            case 2:
                return new ie70((l670) ((jly0) c21Var.d).get(), (w470) ((jly0) c21Var.e).get());
            case 3:
                Context context = (Context) uuf0Var.b.get();
                c8o.l(context);
                vuf0 vuf0Var = new vuf0((byte) 0);
                vgm vgmVar = (vgm) uuf0Var.f.get();
                c8o.l(vgmVar);
                kly0 kly0Var = uuf0Var.i;
                kly0 kly0Var2 = uuf0Var.l;
                kly0 kly0Var3 = uuf0Var.h;
                i8h1 i8h1Var = (i8h1) uuf0Var.m.get();
                c8o.l(i8h1Var);
                lzn0 lzn0Var = (lzn0) uuf0Var.j.get();
                c8o.l(lzn0Var);
                in8 in8Var = new in8(lzn0Var);
                r630 r630Var = (r630) kly0Var3.get();
                c8o.l(r630Var);
                r630 r630Var2 = (r630) kly0Var3.get();
                c8o.l(r630Var2);
                da70 da70Var = new da70(r630Var2);
                fe70 fe70Var = (fe70) ((jly0) c21Var.c).get();
                gw70 gw70Var = (gw70) uuf0Var.n.get();
                c8o.l(gw70Var);
                q770 q770Var = new q770(new mc70(gw70Var, new kcg(new pob((byte) 6, false)), c21Var.r()), new e570((byte) 0, c21Var.r()), new z970((fe70) ((jly0) c21Var.c).get()), new ea70((fe70) ((jly0) c21Var.c).get(), (byte) 0), new ea70((fe70) ((jly0) c21Var.c).get(), (byte) 2), new ea70((fe70) ((jly0) c21Var.c).get(), (byte) 1), new fc70());
                s770 s770Var = new s770();
                yqg yqgVar = (yqg) kly0Var2.get();
                c8o.l(yqgVar);
                p670 p670Var = new p670(yqgVar, (byte) 0);
                fe70 fe70Var2 = (fe70) ((jly0) c21Var.c).get();
                j3a j3aVar = (j3a) kly0Var.get();
                c8o.l(j3aVar);
                l770 l770Var = new l770(fe70Var2, j3aVar, (byte) 0);
                yqg yqgVar2 = (yqg) kly0Var2.get();
                c8o.l(yqgVar2);
                p670 p670Var2 = new p670(yqgVar2, (byte) 1);
                fe70 fe70Var3 = (fe70) ((jly0) c21Var.c).get();
                j3a j3aVar2 = (j3a) kly0Var.get();
                c8o.l(j3aVar2);
                x970 x970Var = new x970(fe70Var, q770Var, new q770(s770Var, p670Var, l770Var, p670Var2, new l770(fe70Var3, j3aVar2, (byte) 1), new w870((fe70) ((jly0) c21Var.c).get())), new q770(new e570((byte) 1, c21Var.r()), new h770((byte) 0), new h770((byte) 1), new k770(c21Var.r()), new i870((fe70) ((jly0) c21Var.c).get())));
                c8o.l((u3f1) uuf0Var.g.get());
                d4b1 d4b1Var = new d4b1((byte) 4);
                String str = (String) uuf0Var.r.get();
                c8o.l(str);
                mxa1 mxa1Var = new mxa1(i8h1Var, in8Var, r630Var, da70Var, x970Var, d4b1Var, str, (byte) 2);
                boolean zBooleanValue = ((Boolean) uuf0Var.s.get()).booleanValue();
                k670 k670Var = (k670) mxa1Var.b(context, vuf0Var).t().s(vgmVar).b;
                k670Var.i = zBooleanValue;
                return k670Var.a();
            case 4:
                Activity activity = (Activity) uuf0Var.a.get();
                c8o.l(activity);
                gw70 gw70Var2 = (gw70) uuf0Var.n.get();
                c8o.l(gw70Var2);
                hl00 hl00Var = new hl00(gw70Var2, (byte) 14);
                j3a j3aVar3 = (j3a) uuf0Var.i.get();
                c8o.l(j3aVar3);
                return new fe70(activity, hl00Var, j3aVar3);
            case 5:
                Context context2 = (Context) uuf0Var.b.get();
                c8o.l(context2);
                l670 l670Var = (l670) ((jly0) c21Var.d).get();
                Activity activity2 = (Activity) uuf0Var.a.get();
                c8o.l(activity2);
                Context context3 = (Context) uuf0Var.b.get();
                c8o.l(context3);
                l7m0 l7m0VarW = mw60.w(context3, (l670) ((jly0) c21Var.d).get(), c21Var.r());
                Resources resources = (Resources) uuf0Var.c.get();
                c8o.l(resources);
                return new ycc1(new sw9(1, (zf30) null), new sw9(activity2, l7m0VarW, td70.a(resources, c21Var.r())), (byte) 1).d(context2, l670Var);
            case 6:
                RetrofitMaker retrofitMaker = (RetrofitMaker) uuf0Var.e.get();
                c8o.l(retrofitMaker);
                return (puf0) retrofitMaker.createWebgateService(puf0.class, "android-made-for-you-hubpage");
            case 7:
                Scheduler scheduler2 = (Scheduler) uuf0Var.q.get();
                c8o.l(scheduler2);
                c21Var.s();
                return new lve1(800, byp.m(), scheduler2);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object f() {
        wj3 wj3Var = (wj3) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new owo(this, (byte) 1);
            case 1:
                return new pwo(this, (byte) 1);
            case 2:
                return u1n0.z((q7r0) wj3Var.c);
            case 3:
                return new qwo(this, (byte) 1);
            case 4:
                return new rwo(this, (byte) 1);
            case 5:
                return new swo(this, (byte) 1);
            case 6:
                muz muzVar = (muz) ((jly0) wj3Var.t).get();
                e7g0 e7g0Var = (e7g0) wj3Var.d;
                PlayOrigin playOriginBuild = PlayOrigin.builder(e7g0Var.e.d).viewUri(e7g0Var.b.a).build();
                c8o.m(playOriginBuild);
                return new rxr0(muzVar, playOriginBuild);
            case 7:
                q7r0 q7r0Var = (q7r0) wj3Var.c;
                t8u0 t8u0Var = (t8u0) ((d7g0) wj3Var.b).k.get();
                c8o.l(t8u0Var);
                return kmq0.w(q7r0Var, t8u0Var);
            case 8:
                return new two((byte) 1);
            case 9:
                return new rqp();
            case 10:
                return new sqp(this);
            case 11:
                e7g0 e7g0Var2 = (e7g0) wj3Var.d;
                d7g0 d7g0Var = (d7g0) wj3Var.b;
                l2r l2rVar = (dv00) d7g0Var.m.get();
                c8o.l(l2rVar);
                l2r l2rVar2 = (ztw0) d7g0Var.n.get();
                c8o.l(l2rVar2);
                a9q a9qVar = (a9q) d7g0Var.o.get();
                c8o.l(a9qVar);
                return new e5b0(30, p7h.M(new l2r[]{l2rVar, l2rVar2, a9qVar.a(e7g0Var2.e.d)}), (List) null);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        c21 c21Var = (c21) this.c;
        q7r0 q7r0Var = (q7r0) c21Var.c;
        i9g0 i9g0Var = (i9g0) c21Var.b;
        byte b = this.b;
        if (b == 0) {
            return u1n0.z(q7r0Var);
        }
        if (b == 1) {
            return new tqp();
        }
        if (b == 2) {
            muz muzVar = (muz) ((jly0) c21Var.g).get();
            k9g0 k9g0Var = (k9g0) c21Var.d;
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            return new rxr0(muzVar, PlayOrigin.builder(yon1.q3().d).viewUri(k9g0Var.b.a).build());
        }
        if (b == 3) {
            t8u0 t8u0Var = (t8u0) i9g0Var.i.get();
            c8o.l(t8u0Var);
            return kmq0.w(q7r0Var, t8u0Var);
        }
        if (b == 4) {
            return new uqp();
        }
        if (b != 5) {
            jah.e(b);
            return null;
        }
        l2r l2rVar = (dv00) i9g0Var.j.get();
        c8o.l(l2rVar);
        l2r l2rVar2 = (ztw0) i9g0Var.k.get();
        c8o.l(l2rVar2);
        a9q a9qVar = (a9q) i9g0Var.l.get();
        c8o.l(a9qVar);
        AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
        return new e5b0(30, p7h.M(new l2r[]{l2rVar, l2rVar2, a9qVar.a(yon1.q3().d)}), (List) null);
    }

    private final Object h() {
        tnm tnmVar = (tnm) this.c;
        byte b = this.b;
        if (b == 0) {
            return new wqp(this);
        }
        if (b == 1) {
            return new xqp();
        }
        if (b == 2) {
            return new yqp(this);
        }
        if (b != 3) {
            jah.e(b);
            return null;
        }
        t8u0 t8u0Var = (t8u0) ((jkg0) tnmVar.b).t.get();
        c8o.l(t8u0Var);
        return kmq0.x((q7r0) tnmVar.c, t8u0Var);
    }

    private final Object i() {
        h72 h72Var = (h72) this.c;
        dsg0 dsg0Var = (dsg0) h72Var.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return u1n0.z((q7r0) h72Var.d);
            case 1:
                String str = dsg0Var.a;
                c8o.m(str);
                return new epl0(str);
            case 2:
                lzn0 lzn0Var = (lzn0) ((csg0) h72Var.b).e.get();
                c8o.l(lzn0Var);
                j2e0 j2e0Var = new j2e0((i8h1) ((blp) h72Var.e).get(), (gfl0) ((jly0) h72Var.g).get(), (byte) 16);
                String str2 = dsg0Var.a;
                c8o.m(str2);
                return new orn0(lzn0Var, j2e0Var, str2, (byte) 1);
            case 3:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0 p6r0VarS3 = yon1.S3();
                return new gfl0(p6r0VarS3.c, ((epl0) ((jly0) h72Var.f).get()).b());
            case 4:
                String str3 = dsg0Var.a;
                c8o.m(str3);
                return new fpl0(str3, ((epl0) ((jly0) h72Var.f).get()).b());
            case 5:
                return new zqp(this);
            case 6:
                return new PublishSubject();
            case 7:
                return new arp(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object j() {
        tnm tnmVar = (tnm) this.c;
        pwg0 pwg0Var = (pwg0) tnmVar.d;
        byte b = this.b;
        if (b == 0) {
            qwg0 qwg0Var = (qwg0) tnmVar.b;
            dbr0 yxe1Var = new yxe1(new ehc1(""));
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            p6r0 p6r0VarM2 = yon1.M2();
            Parcelable.Creator creator = lik1.CREATOR;
            return new cbr0(new dbr0[]{yxe1Var, new bn70(p6r0VarM2, new lik1(qwg0Var.a.X), (nar0) null), new t1r0(true), new s9h1(14, true, false, false)}, false);
        }
        if (b == 1) {
            return new drp(this);
        }
        if (b == 2) {
            return new cyg0(u1n0.z((q7r0) tnmVar.c));
        }
        if (b != 3) {
            jah.e(b);
            return null;
        }
        g7h g7hVar = (g7h) pwg0Var.f.get();
        c8o.l(g7hVar);
        ccc0 ccc0Var = (ccc0) pwg0Var.g.get();
        c8o.l(ccc0Var);
        ao0 ao0Var = (ao0) pwg0Var.b.get();
        c8o.l(ao0Var);
        w4h w4hVar = (w4h) pwg0Var.i.get();
        c8o.l(w4hVar);
        ccc0 ccc0Var2 = (ccc0) pwg0Var.g.get();
        c8o.l(ccc0Var2);
        g7h g7hVar2 = (g7h) pwg0Var.f.get();
        c8o.l(g7hVar2);
        return new nug0(g7hVar, ccc0Var, ao0Var, new s4w0(w4hVar, ccc0Var2, g7hVar2));
    }

    private final Object k() {
        zl5 zl5Var = (zl5) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                h6h0 h6h0Var = (h6h0) zl5Var.b;
                h6h0 h6h0Var2 = (h6h0) zl5Var.b;
                Context context = (Context) h6h0Var.Q.get();
                c8o.l(context);
                cs2 cs2Var = (cs2) ((jly0) zl5Var.e).get();
                gx2 gx2Var = (gx2) h6h0Var2.M.get();
                c8o.l(gx2Var);
                jr2 jr2Var = (jr2) h6h0Var2.N.get();
                c8o.l(jr2Var);
                r3d r3dVar = (r3d) h6h0Var2.j0.get();
                c8o.l(r3dVar);
                yqg yqgVar = (yqg) h6h0Var2.P.get();
                c8o.l(yqgVar);
                a2n a2nVar = (a2n) h6h0Var2.q.get();
                c8o.l(a2nVar);
                zo2 zo2Var = (zo2) h6h0Var2.k0.get();
                c8o.l(zo2Var);
                return new jt2(context, cs2Var, gx2Var, jr2Var, r3dVar, yqgVar, a2nVar, zo2Var, (x6h0) zl5Var.c);
            case 1:
                qt2 qt2Var = (qt2) ((h6h0) zl5Var.b).O.get();
                c8o.l(qt2Var);
                return new cs2(qt2Var, u2o1.g(((x6h0) zl5Var.c).a));
            case 2:
                x6h0 x6h0Var = (x6h0) zl5Var.c;
                c8o.l((e1y) ((h6h0) zl5Var.b).Y.get());
                return new zq00(u2o1.g(x6h0Var.a).a, x6h0Var.Y);
            case 3:
                t8u0 t8u0Var = (t8u0) ((h6h0) zl5Var.b).E.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(((q7r0) zl5Var.d).d.c.getLifecycle());
            case 4:
                h6h0 h6h0Var3 = (h6h0) zl5Var.b;
                h6h0 h6h0Var4 = (h6h0) zl5Var.b;
                Context context2 = (Context) h6h0Var3.Q.get();
                c8o.l(context2);
                a1r0 a1r0Var = (a1r0) h6h0Var4.T.get();
                c8o.l(a1r0Var);
                hrj0 hrj0Var = (hrj0) h6h0Var4.c.get();
                c8o.l(hrj0Var);
                return new n18(context2, a1r0Var, hrj0Var, (h28) ((jly0) zl5Var.i).get());
            case 5:
                return new h28();
            case 6:
                ipk1 ipk1Var = (ipk1) ((h6h0) zl5Var.b).a.get();
                c8o.l(ipk1Var);
                return ipk1Var;
            case 7:
                return new frp(this);
            case 8:
                return cwl1.C((q7r0) zl5Var.d);
            case 9:
                return new grp();
            case 10:
                return new hrp(this);
            case 11:
                return new irp();
            case 12:
                return new hfp(this, (byte) 1);
            case 13:
                return new ifp((byte) 1);
            case 14:
                g9m g9mVar = (g9m) ((h6h0) zl5Var.b).D.get();
                c8o.l(g9mVar);
                return g9mVar;
            case 15:
                lz71 lz71Var = (lz71) ((h6h0) zl5Var.b).A.get();
                c8o.l(lz71Var);
                return lz71Var;
            case 16:
                dei1 dei1Var = (dei1) ((h6h0) zl5Var.b).C.get();
                c8o.l(dei1Var);
                return dei1Var;
            case 17:
                gf50 gf50Var = (gf50) ((h6h0) zl5Var.b).I.get();
                c8o.l(gf50Var);
                return gf50Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new jrp(this);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new wjp(this, (byte) 1);
            case 20:
                x6h0 x6h0Var2 = (x6h0) zl5Var.c;
                h6h0 h6h0Var5 = (h6h0) zl5Var.b;
                qua0 qua0Var = (ztw0) h6h0Var5.l.get();
                c8o.l(qua0Var);
                qua0 qua0Var2 = (q0d0) h6h0Var5.m.get();
                c8o.l(qua0Var2);
                yko ykoVar = (yko) h6h0Var5.j.get();
                c8o.l(ykoVar);
                a9q a9qVar = (a9q) h6h0Var5.k.get();
                c8o.l(a9qVar);
                qua0 qua0Var3 = (lrh) h6h0Var5.n.get();
                c8o.l(qua0Var3);
                qua0 qua0Var4 = (nlj1) h6h0Var5.o.get();
                c8o.l(qua0Var4);
                return new e5b0(30, p7h.M(new qua0[]{qua0Var4, qua0Var, qua0Var2, ykoVar.a((String) null, new ro8(x6h0Var2, null, (byte) 15)), a9qVar.a("martini"), qua0Var3}), (List) null);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object l() {
        cp31 cp31Var = (cp31) this.c;
        q7r0 q7r0Var = (q7r0) cp31Var.b;
        byte b = this.b;
        if (b == 0) {
            RetrofitMaker retrofitMaker = (RetrofitMaker) ((rah0) cp31Var.a).c.get();
            c8o.l(retrofitMaker);
            return (m9h0) retrofitMaker.createWebgateService(m9h0.class, "android-libraryimport-matchreview");
        }
        if (b == 1) {
            fns fnsVar = igu.a;
            bs50 bs50Var = pyf0.a.f;
            c8o.m(bs50Var);
            return bs50Var;
        }
        if (b == 2) {
            ttm0 ttm0VarE = cwl1.E(q7r0Var);
            c8o.m(ttm0VarE);
            return ttm0VarE;
        }
        if (b == 3) {
            return cto1.q(q7r0Var.d.c);
        }
        jah.e(b);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:307:0x0be5  */
    public final Object get() {
        byte b = this.a;
        byte b2 = 5;
        byte b3 = 23;
        Object obj = this.c;
        byte b4 = this.b;
        int i = 1;
        char c = 1;
        byte b5 = 0;
        switch (b) {
            case 0:
                toj0 toj0Var = (toj0) obj;
                if (b4 == 0) {
                    return new c8w((blp) toj0Var.e, new urk0((byte) 2));
                }
                if (b4 == 1) {
                    return u1n0.z((q7r0) toj0Var.c);
                }
                if (b4 == 2) {
                    return new alp(this);
                }
                jah.e(b4);
                return null;
            case 1:
                wdm wdmVar = (wdm) obj;
                switch (b4) {
                    case 0:
                        return new glp(this);
                    case 1:
                        return new bxo((byte) 1);
                    case 2:
                        return new cxo((byte) 1);
                    case 3:
                        return new hlp((byte) 0);
                    case 4:
                        return new ilp();
                    case 5:
                        return new jlp();
                    case 6:
                        return new axo((byte) 1);
                    case 7:
                        return new klp();
                    case 8:
                        return new llp();
                    case 9:
                        return new flp();
                    case 10:
                        six0 six0Var = (six0) ((mab0) wdmVar.b).b.get();
                        c8o.l(six0Var);
                        q6q q6qVar = (q6q) ((mab0) wdmVar.b).c.get();
                        c8o.l(q6qVar);
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        return new e5b0(30, p7h.M(new qua0[]{six0.b(six0Var, yon1.g3(), 2), q6qVar.a(yon1.g3())}), (List) null);
                    default:
                        jah.e(b4);
                        return null;
                }
            case 2:
                wdm wdmVar2 = (wdm) obj;
                q7r0 q7r0Var = (q7r0) wdmVar2.d;
                iib0 iib0Var = (iib0) wdmVar2.b;
                gib0 gib0Var = (gib0) wdmVar2.c;
                switch (b4) {
                    case 0:
                        rxj0 rxj0Var = (rxj0) gib0Var.d.get();
                        c8o.l(rxj0Var);
                        d0r d0rVar = (d0r) ((jly0) wdmVar2.e).get();
                        mlp mlpVar = (mlp) ((jly0) wdmVar2.h).get();
                        d0r d0rVar2 = (d0r) ((jly0) wdmVar2.e).get();
                        v6q v6qVar = (v6q) gib0Var.h.get();
                        c8o.l(v6qVar);
                        qlb qlbVar = new qlb(v6qVar, d0rVar2);
                        kfq kfqVar = (kfq) gib0Var.i.get();
                        c8o.l(kfqVar);
                        return new zgb0(iib0Var, rxj0Var, d0rVar, mlpVar, qlbVar, kfqVar, (nib0) ((jly0) wdmVar2.g).get(), new haa0(iib0Var, (blp) wdmVar2.i));
                    case 1:
                        return cwl1.C(q7r0Var);
                    case 2:
                        return new mlp(this);
                    case 3:
                        iac0 iac0Var = q7r0Var.d.c;
                        c8o.m(iac0Var);
                        return new nib0(iac0Var, xqu.a((jly0) wdmVar2.f), iib0Var);
                    case 4:
                        ttm0 ttm0VarE = cwl1.E(q7r0Var);
                        c8o.m(ttm0VarE);
                        return ttm0VarE;
                    case 5:
                        i8h1 i8h1Var = (i8h1) gib0Var.k.get();
                        c8o.l(i8h1Var);
                        return i8h1Var;
                    case 6:
                        return new kib0();
                    case 7:
                        return pzm.h((mos) gib0Var.j.get());
                    case 8:
                        yko ykoVar = (yko) gib0Var.c.get();
                        c8o.l(ykoVar);
                        return new e5b0(30, Collections.singletonList(ykoVar.a(iib0Var.b.a, new ro8(iib0Var, null, (byte) 13))), (List) null);
                    default:
                        jah.e(b4);
                        return null;
                }
            case 3:
                if (b4 == 0) {
                    return new nlp(this, (byte) 0);
                }
                if (b4 == 1) {
                    return new olp(this, (byte) 0);
                }
                if (b4 == 2) {
                    return new plp(this, (byte) 0);
                }
                if (b4 != 3) {
                    jah.e(b4);
                    return null;
                }
                xfx xfxVar = (xfx) ((vyb0) ((p2o0) obj).b).f.get();
                c8o.l(xfxVar);
                ufx ufxVar = xfxVar.b;
                Context context = ufxVar.a;
                gw70 gw70Var = ufxVar.b;
                if (u890.j((Object) null, uco.a)) {
                    return new ver(context, gw70Var, (byte) 1);
                }
                return u890.j((Object) null, uco.b) ? new fcs(context, gw70Var, (byte) 14) : new eos(context, gw70Var, (byte) 4);
            case 4:
                if (b4 == 0) {
                    return new nlp(this, (byte) 1);
                }
                if (b4 == 1) {
                    return new olp(this, (byte) 1);
                }
                if (b4 == 2) {
                    return new plp(this, (byte) 1);
                }
                if (b4 != 3) {
                    jah.e(b4);
                    return null;
                }
                xfx xfxVar2 = (xfx) ((xyb0) ((cp31) obj).a).f.get();
                c8o.l(xfxVar2);
                ufx ufxVar2 = xfxVar2.b;
                Context context2 = ufxVar2.a;
                gw70 gw70Var2 = ufxVar2.b;
                if (u890.j((Object) null, uco.a)) {
                    return new ver(context2, gw70Var2, (byte) 1);
                }
                return u890.j((Object) null, uco.b) ? new fcs(context2, gw70Var2, (byte) 14) : new eos(context2, gw70Var2, (byte) 4);
            case 5:
                kop kopVar = (kop) obj;
                int i2 = b4 / 100;
                if (i2 != 0) {
                    if (i2 != 1) {
                        jah.e(b4);
                        return null;
                    }
                    switch (b4) {
                        case 100:
                            return new tnp(this, (byte) 0);
                        case 101:
                            return new unp(this, (byte) 0);
                        case 102:
                            return new vnp(this);
                        case 103:
                            return new wnp(this);
                        case 104:
                            return new xnp(this);
                        case 105:
                            return new ynp(this);
                        case 106:
                            return new znp(this, (byte) 0);
                        case 107:
                            return new bop(this, (byte) 0);
                        case 108:
                            return new cop(this, (byte) 0);
                        case 109:
                            y651 y651Var = kopVar.b;
                            cbr0 cbr0Var = (cbr0) kopVar.h1.get();
                            mwn0 mwn0VarX = kopVar.a.x();
                            c8o.l(mwn0VarX);
                            return new w651(new y441(y651Var, cbr0Var, new up41(mwn0VarX, (byte) 3), cwl1.I(kopVar.c)));
                        case 110:
                            return rx31.r(kopVar.b, new q1r0(kopVar.d().m0()), new pu00(false));
                        case 111:
                            return new dop(this, (byte) 0);
                        case 112:
                            return new eop(this, (byte) 0);
                        case 113:
                            return new fop(this);
                        case 114:
                            return new gop((byte) 0);
                        default:
                            jah.e(b4);
                            return null;
                    }
                }
                switch (b4) {
                    case 0:
                        return new amp(this);
                    case 1:
                        return new lmp(this);
                    case 2:
                        yqg yqgVarA = kopVar.a.a();
                        c8o.l(yqgVarA);
                        return yqgVarA;
                    case 3:
                        iac0 iac0VarM = rx31.m(kopVar.c);
                        vku vkuVar = new vku();
                        iac0VarM.getLifecycle().a(new wku(vkuVar));
                        return vkuVar;
                    case 4:
                        ww41 ww41Var = kopVar.a;
                        Activity activityS = ww41Var.s();
                        c8o.l(activityS);
                        float f = activityS.getResources().getDisplayMetrics().density;
                        if (f <= 0.0f) {
                            i = 20;
                        } else {
                            btl1.a.getClass();
                            float fHeight = gtv0.h().a(activityS).a().height() / f;
                            if (Math.abs(fHeight) > Float.MAX_VALUE || fHeight <= 0.0f) {
                                i = 20;
                            } else {
                                int iCeil = (int) Math.ceil(fHeight / 54.0f);
                                if (iCeil >= 1) {
                                    i = iCeil;
                                }
                            }
                        }
                        o241 o241VarI = ww41Var.i();
                        c8o.l(o241VarI);
                        rh11 rh11VarD0 = ww41Var.d0();
                        c8o.l(rh11VarD0);
                        return rx31.y(i, o241VarI, rh11VarD0);
                    case 5:
                        RetrofitMaker retrofitMakerN = kopVar.a.n();
                        c8o.l(retrofitMakerN);
                        return rx31.A(retrofitMakerN, kopVar.d());
                    case 6:
                        return upn1.m();
                    case 7:
                        xvo xvoVarS0 = kopVar.a.S0();
                        c8o.l(xvoVarS0);
                        qsc qscVarH = kopVar.a.H();
                        c8o.l(qscVarH);
                        return new psc(xvoVarS0, qscVarH);
                    case 8:
                        return new t5h1();
                    case 9:
                        return ((cyp) kopVar.k.get()).d();
                    case 10:
                        t8u0 t8u0VarB1 = kopVar.a.b1();
                        c8o.l(t8u0VarB1);
                        return t8u0VarB1.a(kopVar.c.d.c.getLifecycle());
                    case 11:
                        return ((cyp) kopVar.k.get()).a();
                    case 12:
                        gn10 gn10Var = mno1.e0;
                        ww41 ww41Var2 = kopVar.a;
                        q7r0 q7r0Var2 = kopVar.c;
                        String strJ0 = ww41Var2.j0();
                        c8o.l(strJ0);
                        return d8.b(gn10Var, strJ0, d8.c(new c4n0(q7r0Var2)), u1n0.l(q7r0Var2));
                    case 13:
                        return (e8r0) kopVar.o.get();
                    case 14:
                        return new e8r0();
                    case 15:
                        xrc0 xrc0VarL = kopVar.a.l();
                        c8o.l(xrc0VarL);
                        return xrc0VarL;
                    case 16:
                        g651 g651VarQ0 = kopVar.a.q0();
                        c8o.l(g651VarQ0);
                        return g651VarQ0;
                    case 17:
                        Activity activityS2 = kopVar.a.s();
                        c8o.l(activityS2);
                        di4 di4VarD = kopVar.d();
                        rxj0 rxj0VarF = kopVar.a.F();
                        c8o.l(rxj0VarF);
                        return new tb51(activityS2, di4VarD, rxj0VarF);
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        return new o5r((Locale) kopVar.u.get());
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        return Locale.getDefault();
                    case 20:
                        return new wmp(this);
                    case 21:
                        return new enp(this);
                    case 22:
                        return (e8r0) kopVar.o.get();
                    case 23:
                        return new y751();
                    case 24:
                        return new pnp(this);
                    case 25:
                        return new aop(this);
                    case 26:
                        return new hop(this);
                    case 27:
                        return new iop(this, (byte) 0);
                    case 28:
                        xfx xfxVarC0 = kopVar.a.c0();
                        c8o.l(xfxVarC0);
                        return new j6x(new pfx(xfxVarC0.d, (byte) 2), new urk0((byte) 4));
                    case 29:
                        return new jop(this, (byte) 0);
                    case 30:
                        return new qlp(this, (byte) 0);
                    case 31:
                        return new rlp(this, b5);
                    case 32:
                        return new slp(this, (byte) 0);
                    case 33:
                        return new tlp(this, (byte) 0);
                    case 34:
                        return new ulp(this, (byte) 0);
                    case 35:
                        return new vlp(this, (byte) 0);
                    case 36:
                        return new wlp(this, (byte) 0);
                    case 37:
                        return new xlp(this, (byte) 0);
                    case 38:
                        return new ylp(this, (byte) 0);
                    case 39:
                        return new zlp(this, (byte) 0);
                    case 40:
                        return new bmp(this, (byte) 0);
                    case 41:
                        return new cmp(this, (byte) 0);
                    case 42:
                        return new dmp(this, (byte) 0);
                    case 43:
                        return new emp(this, (byte) 0);
                    case 44:
                        return new fmp(this, (byte) 0);
                    case 45:
                        return new gmp(this, (byte) 0);
                    case 46:
                        return new hmp(this, (byte) 0);
                    case 47:
                        return new imp(this, (byte) 0);
                    case 48:
                        return new jmp(this, (byte) 0);
                    case 49:
                        return new kmp(this, (byte) 0);
                    case 50:
                        return new mmp(this, (byte) 0);
                    case 51:
                        return new nmp(this, (byte) 0);
                    case 52:
                        return new omp(this, (byte) 0);
                    case 53:
                        return new pmp(this, (byte) 0);
                    case 54:
                        return new qmp(this, (byte) 0);
                    case 55:
                        return new rmp(this, (byte) 0);
                    case 56:
                        return new smp(this, (byte) 0);
                    case 57:
                        return new tmp(this, (byte) 0);
                    case 58:
                        xfx xfxVarC1 = kopVar.a.c0();
                        c8o.l(xfxVarC1);
                        yfx yfxVar = new yfx(xfxVarC1.e, (byte) 1);
                        Resources resourcesR = kopVar.a.r();
                        c8o.l(resourcesR);
                        return new z331(yfxVar, resourcesR);
                    case 59:
                        return new ump(this, (byte) 0);
                    case 60:
                        return new vmp(this, (byte) 0);
                    case 61:
                        return new xmp(this, (byte) 0);
                    case 62:
                        return new e9p(this, c == true ? 1 : 0);
                    case 63:
                        nwt nwtVarX = kopVar.a.X();
                        c8o.l(nwtVarX);
                        return nwtVarX;
                    case 64:
                        mr20 mr20VarU = kopVar.a.u();
                        c8o.l(mr20VarU);
                        c3s c3sVarB = kopVar.a.B();
                        c8o.l(c3sVarB);
                        return new clm(mr20VarU, c3sVarB);
                    case 65:
                        blp blpVar = kopVar.l;
                        q7r0 q7r0Var3 = kopVar.c;
                        ww41 ww41Var3 = kopVar.a;
                        ynb0 ynb0VarA = xqu.a(blpVar);
                        blp blpVar2 = kopVar.n;
                        ynb0 ynb0VarA2 = xqu.a(kopVar.m);
                        h5q h5qVarX0 = ww41Var3.X0();
                        c8o.l(h5qVarX0);
                        b7r0 b7r0VarQ0 = ww41Var3.Q0();
                        c8o.l(b7r0VarQ0);
                        ynb0 ynb0VarA3 = xqu.a(kopVar.q);
                        ynb0 ynb0VarA4 = xqu.a(kopVar.j0);
                        ov20 ov20VarQ = ww41Var3.q();
                        c8o.l(ov20VarQ);
                        yqg yqgVar = (yqg) kopVar.d.get();
                        iac0 iac0VarM2 = rx31.m(q7r0Var3);
                        n3d0 n3d0VarC0 = ww41Var3.C0();
                        c8o.l(n3d0VarC0);
                        String strN = kopVar.n();
                        lik1 lik1VarC = d8.c(new c4n0(q7r0Var3));
                        AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                        bn70 bn70Var = new bn70(yon1.U4(), lik1VarC, (nar0) null);
                        g3q0 g3q0VarV0 = ww41Var3.V0();
                        c8o.l(g3q0VarV0);
                        upp0 upp0VarT = ww41Var3.t();
                        c8o.l(upp0VarT);
                        return bhb.o(ynb0VarA, blpVar2, ynb0VarA2, h5qVarX0, b7r0VarQ0, ynb0VarA3, ynb0VarA4, ov20VarQ, yqgVar, iac0VarM2, n3d0VarC0, strN, bn70Var, g3q0VarV0, upp0VarT, Optional.empty(), Optional.empty());
                    case 66:
                        zut0 zut0VarW0 = kopVar.a.W0();
                        c8o.l(zut0VarW0);
                        return zut0VarW0.a(new lb3(xqu.a(kopVar.k), (byte) 7), xqu.a(kopVar.n));
                    case 67:
                        return new nyo(this, b2);
                    case 68:
                        ugn0 ugn0VarR0 = kopVar.a.r0();
                        c8o.l(ugn0VarR0);
                        return ugn0VarR0;
                    case 69:
                        return null;
                    case 70:
                        return new oyo(this, (byte) 6);
                    case 71:
                        return (ku71) xqu.a(kopVar.n0).get();
                    case 72:
                        dma1 dma1VarO = kopVar.a.O();
                        c8o.l(dma1VarO);
                        nfa0 nfa0VarY0 = kopVar.a.Y0();
                        c8o.l(nfa0VarY0);
                        return new ku71(dma1VarO, nfa0VarY0, new du71());
                    case 73:
                        return new hfw0(u1n0.z(kopVar.c));
                    case 74:
                        q8n q8nVarE = kopVar.a.e();
                        c8o.l(q8nVarE);
                        return new nfw0(q8nVarE, kopVar.d, kopVar.l0, kopVar.h0, kopVar.i0, kopVar.m0, kopVar.m, kopVar.q0, kopVar.p0);
                    case 75:
                        ww41 ww41Var4 = kopVar.a;
                        return new luj(ww41Var4.c0(), ww41Var4.b(), ww41Var4.m(), ww41Var4.c(), false);
                    case 76:
                        return new ymp(this, (byte) 0);
                    case 77:
                        osm0 osm0Var = (osm0) kopVar.x0.get();
                        iac0 iac0VarM3 = rx31.m(kopVar.c);
                        b7r0 b7r0VarQ1 = kopVar.a.Q0();
                        c8o.l(b7r0VarQ1);
                        esm0 esm0Var = new esm0("search", new l451(b7r0VarQ1, (byte) 2));
                        p811 p811Var = new p811();
                        iac0VarM3.getLifecycle().a(new kwf(p811Var, osm0Var, esm0Var, (byte) 2));
                        return new v1r0(new mn41(osm0Var, (byte) 8), new ldz0(osm0Var, (byte) 21), new l5v0(p811Var, (byte) 12));
                    case 78:
                        msm0 msm0VarV = kopVar.a.v();
                        c8o.l(msm0VarV);
                        return msm0VarV.a(new fz3((byte) 3));
                    case 79:
                        lko lkoVarG = kopVar.a.G();
                        c8o.l(lkoVarG);
                        return new sw41(lkoVarG, kopVar.n(), rx31.m(kopVar.c));
                    case 80:
                        return new l9e0();
                    case 81:
                        return new zmp(this, (byte) 0);
                    case 82:
                        return new anp(this, (byte) 0);
                    case 83:
                        return new bnp(this, (byte) 0);
                    case 84:
                        return new cnp(this, (byte) 0);
                    case 85:
                        return new dnp(this, (byte) 0);
                    case 86:
                        return new fnp(b5);
                    case 87:
                        return new gnp(this, (byte) 0);
                    case 88:
                        return new hnp(this, (byte) 0);
                    case 89:
                        return new inp(this, (byte) 0);
                    case 90:
                        return new jnp((byte) 0);
                    case 91:
                        return new knp(this, (byte) 0);
                    case 92:
                        q8n q8nVarS = kopVar.a.S();
                        c8o.l(q8nVarS);
                        sd41 sd41VarO0 = kopVar.a.o0();
                        c8o.l(sd41VarO0);
                        return new aod0(q8nVarS, sd41VarO0);
                    case 93:
                        return new lnp(this, (byte) 0);
                    case 94:
                        return new mnp((byte) 0);
                    case 95:
                        return new nnp((byte) 0);
                    case 96:
                        return new onp((byte) 0);
                    case 97:
                        return new qnp(this, (byte) 0);
                    case 98:
                        return new rnp((byte) 0);
                    case 99:
                        return new snp((byte) 0);
                    default:
                        jah.e(b4);
                        return null;
                }
            case 6:
                a680 a680Var = (a680) obj;
                qop qopVar = (qop) a680Var.b;
                nzp nzpVar = (nzp) a680Var.c;
                if (b4 == 0) {
                    d0r d0rVar3 = ((jbt) a680Var.a).b;
                    String strD = qopVar.d();
                    kt91 kt91Var = (kt91) nzpVar.a.f8.get();
                    c8o.l(kt91Var);
                    wb00 wb00Var = new wb00((ff20) ((jly0) a680Var.e).get(), (byte) 29);
                    spn spnVar = (spn) nzpVar.b.T8.get();
                    c8o.l(spnVar);
                    return new nl9(d0rVar3, strD, kt91Var, wb00Var, spnVar);
                }
                if (b4 != 1) {
                    if (b4 != 2) {
                        jah.e(b4);
                        return null;
                    }
                    Context context3 = (Context) nzpVar.a.x1.a;
                    c8o.l(context3);
                    String str = qopVar.e;
                    c8o.l(str);
                    return t4c0.b(context3, str);
                }
                RetrofitMaker retrofitMaker = (RetrofitMaker) nzpVar.a.Y3.get();
                c8o.l(retrofitMaker);
                dpd1 dpd1Var = (dpd1) retrofitMaker.createWebgateService(dpd1.class, "android-list-ux-platform-consumers-likedsongs-filter-tags");
                bf20 bf20VarU = ((FilterTagsDatabase) ((jly0) a680Var.d).get()).u();
                c8o.m(bf20VarU);
                q8n q8nVar = (q8n) nzpVar.a.E1.get();
                c8o.l(q8nVar);
                return new ff20(dpd1Var, bf20VarU, q8nVar);
            case 7:
                kp5 kp5Var = (kp5) obj;
                qop qopVar2 = (qop) kp5Var.a;
                t2q t2qVar = (t2q) kp5Var.b;
                if (b4 == 0) {
                    RetrofitMaker retrofitMaker2 = (RetrofitMaker) t2qVar.a.Y3.get();
                    c8o.l(retrofitMaker2);
                    dpd1 dpd1Var2 = (dpd1) retrofitMaker2.createWebgateService(dpd1.class, "android-list-ux-platform-consumers-likedsongs-filter-tags");
                    bf20 bf20VarU2 = ((FilterTagsDatabase) ((jly0) kp5Var.d).get()).u();
                    c8o.m(bf20VarU2);
                    q8n q8nVar2 = (q8n) t2qVar.a.E1.get();
                    c8o.l(q8nVar2);
                    return new ff20(dpd1Var2, bf20VarU2, q8nVar2);
                }
                if (b4 == 1) {
                    Context context4 = (Context) t2qVar.a.x1.a;
                    c8o.l(context4);
                    String str2 = qopVar2.e;
                    c8o.l(str2);
                    return t4c0.b(context4, str2);
                }
                if (b4 == 2) {
                    return new xec0(((jbt) kp5Var.c).b, qopVar2.d(), (ff20) ((jly0) kp5Var.e).get());
                }
                if (b4 == 3) {
                    return new mop();
                }
                if (b4 == 4) {
                    return new nop(this);
                }
                jah.e(b4);
                return null;
            case 8:
                return a();
            case 9:
                if (b4 == 0) {
                    return new upp(this);
                }
                if (b4 == 1) {
                    return new vpp();
                }
                if (b4 == 2) {
                    return new wpp(this);
                }
                if (b4 == 3) {
                    return new xpp();
                }
                if (b4 == 4) {
                    return new ypp(this);
                }
                jah.e(b4);
                return null;
            case 10:
                return b();
            case 11:
                c21 c21Var = (c21) obj;
                kvd0 kvd0Var = (kvd0) c21Var.c;
                lvd0 lvd0Var = (lvd0) c21Var.b;
                switch (b4) {
                    case 0:
                        xvd0 serializable = kvd0Var.O0().getSerializable("LivestreamErrorDialogFragment.DialogType");
                        xvd0 xvd0Var = serializable instanceof xvd0 ? serializable : null;
                        if (xvd0Var != null) {
                            return xvd0Var;
                        }
                        eg.m("DialogType not found in Fragment arguments");
                        return null;
                    case 1:
                        lzn0 lzn0Var = (lzn0) lvd0Var.e.get();
                        c8o.l(lzn0Var);
                        return new wrn0(lzn0Var, new vnd1(new g5l0(), xqu.a((blp) c21Var.e), b3), new yla((byte) 2), (xvd0) ((jly0) c21Var.d).get());
                    case 2:
                        i8h1 i8h1Var2 = (i8h1) lvd0Var.h.get();
                        c8o.l(i8h1Var2);
                        return i8h1Var2;
                    case 3:
                        return new sau0(((cyp) ((jly0) c21Var.g).get()).a(), new vnd1(new g5l0(), xqu.a((blp) c21Var.e), b3), new yla((byte) 2), (xvd0) ((jly0) c21Var.d).get());
                    case 4:
                        t8u0 t8u0Var = (t8u0) lvd0Var.f.get();
                        c8o.l(t8u0Var);
                        return t8u0Var.a(((zf30) kvd0Var).s1);
                    case 5:
                        return new pco0();
                    case 6:
                        return new enh1((xvd0) ((jly0) c21Var.d).get(), xqu.a((blp) c21Var.e));
                    default:
                        jah.e(b4);
                        return null;
                }
            case 12:
                c21 c21Var2 = (c21) obj;
                q7r0 q7r0Var4 = (q7r0) c21Var2.d;
                awd0 awd0Var = (awd0) c21Var2.b;
                if (b4 == 0) {
                    lzn0 lzn0Var2 = (lzn0) awd0Var.d.get();
                    c8o.l(lzn0Var2);
                    return new wrn0(lzn0Var2, new vnd1(new g5l0(), xqu.a((blp) c21Var2.e), b3), new yla((byte) 2), c21Var2.l());
                }
                if (b4 == 1) {
                    return u1n0.z(q7r0Var4);
                }
                if (b4 == 2) {
                    return new sau0(((cyp) ((jly0) c21Var2.g).get()).a(), new vnd1(new g5l0(), xqu.a((blp) c21Var2.e), b3), new yla((byte) 2), c21Var2.l());
                }
                if (b4 == 3) {
                    t8u0 t8u0Var2 = (t8u0) awd0Var.h.get();
                    c8o.l(t8u0Var2);
                    return kmq0.x(q7r0Var4, t8u0Var2);
                }
                if (b4 == 4) {
                    return new pco0();
                }
                if (b4 == 5) {
                    return new enh1(c21Var2.l(), xqu.a((blp) c21Var2.e));
                }
                jah.e(b4);
                return null;
            case 13:
                twd0 twd0Var = ((fqp) obj).a;
                switch (b4) {
                    case 0:
                        luk lukVar = (luk) twd0Var.p.get();
                        c8o.l(lukVar);
                        return new sq4(20000, lukVar, false, false, false, false);
                    case 1:
                        luk lukVar2 = (luk) twd0Var.p.get();
                        c8o.l(lukVar2);
                        return new qq4(lukVar2);
                    case 2:
                        lzn0 lzn0Var3 = (lzn0) twd0Var.i.get();
                        c8o.l(lzn0Var3);
                        return lzn0Var3;
                    case 3:
                        ezh1 ezh1Var = (ezh1) twd0Var.s.get();
                        c8o.l(ezh1Var);
                        return ezh1Var;
                    case 4:
                        kt91 kt91Var2 = (kt91) twd0Var.t.get();
                        c8o.l(kt91Var2);
                        return kt91Var2;
                    case 5:
                        return new cqp(this);
                    case 6:
                        i8h1 i8h1Var3 = (i8h1) twd0Var.n.get();
                        c8o.l(i8h1Var3);
                        return i8h1Var3;
                    case 7:
                        return new dqp(this);
                    case 8:
                        return new eqp(this);
                    default:
                        jah.e(b4);
                        return null;
                }
            case 14:
                k9k k9kVar = (k9k) obj;
                q7r0 q7r0Var5 = (q7r0) k9kVar.c;
                if (b4 == 0) {
                    RetrofitMaker retrofitMaker3 = (RetrofitMaker) ((bne0) k9kVar.b).c.get();
                    c8o.l(retrofitMaker3);
                    return (yne0) retrofitMaker3.createWebgateService(yne0.class, "android-trendingnearyou-locationsearch");
                }
                if (b4 == 1) {
                    return cwl1.C(q7r0Var5);
                }
                if (b4 == 2) {
                    return u1n0.z(q7r0Var5);
                }
                jah.e(b4);
                return null;
            case 15:
                if (b4 == 0) {
                    return new jqp(this, (byte) 1);
                }
                if (b4 == 1) {
                    return new kqp(this);
                }
                if (b4 == 2) {
                    return u1n0.z((q7r0) ((g1i) obj).c);
                }
                jah.e(b4);
                return null;
            case 16:
                return c();
            case 17:
                p2o0 p2o0Var = (p2o0) obj;
                lmf0 lmf0Var = (lmf0) p2o0Var.b;
                if (b4 == 0) {
                    Flowable flowable = (Flowable) ((jly0) p2o0Var.d).get();
                    Scheduler schedulerO = lmf0Var.o();
                    c8o.l(schedulerO);
                    yqg yqgVarA2 = lmf0Var.a();
                    c8o.l(yqgVarA2);
                    luk lukVarK = lmf0Var.k();
                    c8o.l(lukVarK);
                    return f2u0.z(flowable, schedulerO, yqgVarA2, new vu4(false, false, false, lukVarK));
                }
                if (b4 != 1) {
                    if (b4 == 2) {
                        return new PublishProcessor();
                    }
                    if (b4 != 3) {
                        jah.e(b4);
                        return null;
                    }
                    luk lukVarK2 = lmf0Var.k();
                    c8o.l(lukVarK2);
                    return Boolean.valueOf(new pg4(lukVarK2).b());
                }
                t8u0 t8u0VarV = lmf0Var.v();
                c8o.l(t8u0VarV);
                iac0 iac0Var2 = (iac0) p2o0Var.c;
                Flowable flowableC = lmf0Var.c();
                c8o.l(flowableC);
                loc1 loc1VarZ = lmf0Var.z();
                c8o.l(loc1VarZ);
                Scheduler schedulerO2 = lmf0Var.o();
                c8o.l(schedulerO2);
                yqg yqgVarA3 = lmf0Var.a();
                c8o.l(yqgVarA3);
                cyp cypVarA = t8u0VarV.a(iac0Var2.getLifecycle());
                grb1 grb1Var = new grb1(flowableC.L(schedulerO2), yqgVarA3, new erb1(yqgVarA3), new frb1(yqgVarA3), new Handler());
                cypVarA.a();
                cypVarA.c();
                r2a1 r2a1Var = new r2a1(loc1VarZ, grb1Var.l, (byte) 22);
                int i3 = Flowable.a;
                return new FlowableCreate(r2a1Var, BackpressureStrategy.d).L(schedulerO2).x(e710.N0);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return d();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return e();
            case 20:
                qqp qqpVar = (qqp) obj;
                if (b4 == 0) {
                    return new qvf0((blp) qqpVar.e, (vdl0) ((jly0) qqpVar.b).get());
                }
                if (b4 == 1) {
                    return u1n0.z((q7r0) qqpVar.d);
                }
                if (b4 == 2) {
                    r6h1 r6h1Var = r6h1.c;
                    return new vdl0();
                }
                jah.e(b4);
                return null;
            case 21:
                tnm tnmVar = (tnm) obj;
                if (b4 == 0) {
                    return (qhe0) ((jly0) tnmVar.c).get();
                }
                if (b4 == 1) {
                    c2r0 c2r0Var = (c2r0) ((uwf0) tnmVar.b).e.get();
                    c8o.l(c2r0Var);
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    return c2r0Var.b(yon1.G1("LOGIN_ACCOUNTRECOVERY_REQUESTEMAIL", "login/accountrecovery/requestemail", 940, "login"), (qir0) null);
                }
                if (b4 == 2) {
                    return new mir0(((qhe0) ((jly0) tnmVar.c).get()).a());
                }
                if (b4 == 3) {
                    return (qhe0) ((jly0) tnmVar.c).get();
                }
                if (b4 == 4) {
                    r6h1 r6h1Var2 = r6h1.c;
                    return new udl0();
                }
                if (b4 == 5) {
                    r6h1 r6h1Var3 = r6h1.c;
                    return new ydl0();
                }
                jah.e(b4);
                return null;
            case 22:
                return f();
            case 23:
                return g();
            case 24:
                return h();
            case 25:
                return i();
            case 26:
                return j();
            case 27:
                return k();
            case 28:
                return l();
            default:
                qq qqVar = (qq) obj;
                switch (b4) {
                    case 0:
                        return new lrp(this);
                    case 1:
                        return new mrp(this);
                    case 2:
                        return new nrp(this);
                    case 3:
                        return new orp(this);
                    case 4:
                        u3i0 u3i0Var = ((z6i0) qqVar.b).a;
                        c8o.m(u3i0Var);
                        return u3i0Var;
                    case 5:
                        return new prp(this);
                    case 6:
                        return new qrp(this);
                    case 7:
                        msm0 msm0Var = (msm0) ((y6i0) qqVar.a).p.get();
                        c8o.l(msm0Var);
                        return new b7i0(msm0Var);
                    case 8:
                        return new rrp(this);
                    case 9:
                        return new srp(this);
                    case 10:
                        return new trp(this);
                    case 11:
                        return cwl1.C((q7r0) qqVar.c);
                    case 12:
                        d0r d0rVar4 = (d0r) ((jly0) qqVar.o).get();
                        onf0 onf0Var = (onf0) ((y6i0) ((qq) ((krp) ((jly0) qqVar.p).get()).a.c).a).c.get();
                        c8o.l(onf0Var);
                        return new q7i0(d0rVar4, onf0Var);
                    case 13:
                        return new krp(this);
                    case 14:
                        t701 t701Var = (t701) ((y6i0) qqVar.a).b.get();
                        c8o.l(t701Var);
                        return new e5b0(30, Collections.singletonList(t701Var), (List) null);
                    default:
                        jah.e(b4);
                        return null;
                }
        }
    }
}
