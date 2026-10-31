package p;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.preference.PreferenceManager;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.metadata.proto.Metadata$Episode;
import com.spotify.mobius.coroutines.a;
import com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.subjects.PublishSubject;
import j$.time.Clock;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gbp implements jly0 {
    public final /* synthetic */ byte a;
    public final short b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ gbp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public static /* bridge */ /* synthetic */ daq a(gbp gbpVar) {
        return (daq) gbpVar.c;
    }

    private final Object b() {
        short s = this.b;
        int i = s / 100;
        if (i == 0) {
            return d();
        }
        byte b = 1;
        if (i != 1) {
            jah.e(s);
            return null;
        }
        nwp nwpVar = (nwp) this.c;
        switch (s) {
            case 100:
                return new svp((byte) 0);
            case 101:
                return new tvp(this, (byte) 0);
            case Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER /* 102 */:
                return new uvp(this, (byte) 0);
            case 103:
                return new vvp(this, (byte) 0);
            case 104:
                return new wvp(this, (byte) 0);
            case 105:
                return new yvp((byte) 0);
            case 106:
                return new zvp(this, (byte) 0);
            case 107:
                return new awp(this, (byte) 0);
            case 108:
                return new bwp(this, (byte) 0);
            case 109:
                return new m3p(this, (byte) 2);
            case 110:
                return new n3p(this, (byte) 2);
            case 111:
                em0 em0Var = nwpVar.a;
                daq daqVar = (daq) em0Var.b;
                woa woaVarS = em0Var.s();
                c8o.l(woaVarS);
                kma kmaVar = (kma) daqVar.a.Z1.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) daqVar.X8.get();
                c8o.l(fpaVar);
                pe peVarG = em0Var.g();
                c8o.l(peVarG);
                boolean zBooleanValue = ((Boolean) daqVar.a.N1.get()).booleanValue();
                zle1 zle1Var = (zle1) daqVar.a3.get();
                c8o.l(zle1Var);
                return new k0t(woaVarS, kmaVar, fpaVar, peVarG, zBooleanValue, zle1Var);
            case 112:
                return new o3p(this, (byte) 3);
            case 113:
                Context context = (Context) nwpVar.b.d;
                c8o.l(context);
                return Boolean.valueOf(xoi1.b(context));
            case 114:
                return new cwp(this, (byte) 0);
            case 115:
                return (mud0) nwpVar.o1.get();
            case 116:
                return new mud0(new dup(nwpVar));
            case 117:
                return (ojd) nwpVar.s1.get();
            case 118:
                jup jupVar = new jup(nwpVar);
                l7m0 l7m0Var = new l7m0(nwpVar.g(), (byte) 10);
                lid lidVarU = nwpVar.a.u();
                c8o.l(lidVarU);
                nid nidVar = (nid) nwpVar.r1.get();
                Context context2 = (Context) nwpVar.b.d;
                c8o.l(context2);
                return new ojd(jupVar, l7m0Var, lidVarU, nidVar, context2);
            case 119:
                return new nid((dg30) nwpVar.e.get(), (lkd) nwpVar.q1.get());
            case 120:
                bjd bjdVar = (bjd) ((daq) nwpVar.a.b).k9.get();
                c8o.l(bjdVar);
                l7m0 l7m0Var2 = new l7m0(nwpVar.g(), (byte) 10);
                zr00 zr00Var = (zr00) ((daq) nwpVar.a.b).f9.get();
                c8o.l(zr00Var);
                return new lkd(bjdVar, l7m0Var2, zr00Var, nwpVar.g());
            case 121:
                return (okd) nwpVar.u1.get();
            case 122:
                lup lupVar = new lup(nwpVar);
                l7m0 l7m0Var3 = new l7m0(nwpVar.g(), (byte) 10);
                lid lidVarU2 = nwpVar.a.u();
                c8o.l(lidVarU2);
                nid nidVar2 = (nid) nwpVar.r1.get();
                Context context3 = (Context) nwpVar.b.d;
                c8o.l(context3);
                return new okd(lupVar, l7m0Var3, lidVarU2, nidVar2, context3);
            case 123:
                return (r2x) nwpVar.B1.get();
            case 124:
                return new r2x(new qup(nwpVar), nwpVar.o());
            case 125:
                gbp gbpVar = nwpVar.l;
                em0 em0Var2 = nwpVar.a;
                daq daqVar2 = (daq) em0Var2.b;
                rt40 rt40Var = (rt40) new swm0((Flowable) gbpVar.get(), nwpVar.b.r0()).b;
                c8o.m(rt40Var);
                iib iibVar = (iib) new svh0((Flowable) nwpVar.l.get(), nwpVar.s()).c;
                c8o.m(iibVar);
                m441 m441VarS = nwpVar.s();
                ay0 ay0VarT = f42.t((qxo) daqVar2.a.a.kb.get());
                sen0 sen0Var = (sen0) nwpVar.x1.get();
                d1x d1xVarK = daqVar2.a.k();
                nu0 nu0Var = (nu0) daqVar2.gb.get();
                c8o.l(nu0Var);
                j44 j44VarD = nwpVar.d();
                q8n q8nVarB0 = em0Var2.b0();
                c8o.l(q8nVarB0);
                q8n q8nVarG0 = em0Var2.g0();
                c8o.l(q8nVarG0);
                wen0 wen0Var = (wen0) nwpVar.y1.get();
                crd crdVar = (crd) daqVar2.N4.get();
                c8o.l(crdVar);
                lr0 lr0Var = (lr0) nwpVar.z1.get();
                ti0 ti0Var = (ti0) daqVar2.a.L1.get();
                c8o.l(ti0Var);
                return new z1x(rt40Var, iibVar, m441VarS, ay0VarT, sen0Var, d1xVarK, nu0Var, j44VarD, q8nVarB0, q8nVarG0, wen0Var, crdVar, lr0Var, ti0Var);
            case 126:
                lkd lkdVar = (lkd) ((daq) nwpVar.a.b).a.J1.get();
                c8o.l(lkdVar);
                return lkdVar;
            case 127:
                return mgo1.e(0, 1, 0, 5);
            case 128:
                return gio1.b(Boolean.FALSE);
            case 129:
                q8n q8nVarG1 = nwpVar.a.g0();
                c8o.l(q8nVarG1);
                return new lr0(q8nVarG1);
            case 130:
                return (mr60) nwpVar.D1.get();
            case 131:
                return new mr60(new cup(nwpVar), nwpVar.e());
            case 132:
                return (tkn0) nwpVar.F1.get();
            case 133:
                return new tkn0(new lup(nwpVar));
            case 134:
                return (q8b1) nwpVar.H1.get();
            case 135:
                return new q8b1(new tup(nwpVar));
            case 136:
                return (m8g1) nwpVar.J1.get();
            case 137:
                return new m8g1(new vup(nwpVar));
            case 138:
                return gio1.b(u9a0.a);
            case 139:
                em0 em0Var3 = nwpVar.a;
                paq paqVar = (paq) ((daq) em0Var3.b).a.m2.get();
                c8o.l(paqVar);
                Activity activityM = em0Var3.m();
                c8o.l(activityM);
                a1r0 a1r0VarA0 = em0Var3.A0();
                c8o.l(a1r0VarA0);
                return uge0.r(paqVar, activityM, a1r0VarA0);
            case 140:
                return new dwp(this, (byte) 0);
            case 141:
                return new ewp(this, (byte) 0);
            case 142:
                return new txo(this, b);
            case 143:
                return new uxo(this, (byte) 1);
            case 144:
                return new fv0((yqg) nwpVar.i.get(), (q8n) nwpVar.A.get());
            case 145:
                return new gwp(this, (byte) 0);
            case 146:
                return new hwp(this, (byte) 0);
            default:
                jah.e(s);
                return null;
        }
    }

    private final Object c() {
        short s = this.b;
        int i = s / 100;
        if (i == 0) {
            return f();
        }
        byte b = 1;
        if (i != 1) {
            jah.e(s);
            return null;
        }
        mxp mxpVar = (mxp) this.c;
        switch (s) {
            case 100:
                Activity activityB = mxpVar.a.b();
                c8o.l(activityB);
                lzn0 lzn0VarQ = mxpVar.a.Q();
                c8o.l(lzn0VarQ);
                return new w0o(activityB, lzn0VarQ, (bcl1) mxpVar.h.get());
            case 101:
                return new i2a((l6l1) mxpVar.q.get(), mxpVar.a1, (byte) 6);
            case Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER /* 102 */:
                return new wbc1(mxpVar.d(), (q9l1) mxpVar.g.get(), mxpVar.g(), (hcl1) mxpVar.i.get(), mxpVar.a());
            case 103:
                gbp gbpVar = mxpVar.c1;
                Activity activityB2 = mxpVar.a.b();
                c8o.l(activityB2);
                return new i2a((byte) 10, activityB2, gbpVar);
            case 104:
                return new kkc1();
            case 105:
                return new oad1(mxpVar.e1, (byte) 0);
            case 106:
                xfx xfxVarU = mxpVar.a.u();
                c8o.l(xfxVarU);
                return new mfx0(new zfx(xfxVarU.c, (byte) 24));
            case 107:
                return new oad1(mxpVar.g1, (byte) 1);
            case 108:
                q9l1 q9l1Var = (q9l1) mxpVar.g.get();
                lzn0 lzn0VarQ2 = mxpVar.a.Q();
                c8o.l(lzn0VarQ2);
                return new mjh(q9l1Var, lzn0VarQ2, (bcl1) mxpVar.h.get(), (byte) 2);
            case 109:
                return new oad1(mxpVar.i1, (byte) 2);
            case 110:
                ssf1 ssf1VarL0 = mxpVar.a.l0();
                c8o.l(ssf1VarL0);
                return new mjh(ssf1VarL0, (bcl1) mxpVar.h.get(), brt.D(mxpVar.c));
            case 111:
                return new oad1(mxpVar.k1, (byte) 3);
            case 112:
                return new w0o(mxpVar.j(), (m0t) mxpVar.u.get(), (hcl1) mxpVar.i.get(), (byte) 3);
            case 113:
                return new oad1(mxpVar.m1, (byte) 4);
            case 114:
                xfx xfxVarU2 = mxpVar.a.u();
                c8o.l(xfxVarU2);
                return new h680(new igx(xfxVarU2.c, (byte) 0), mxpVar.q(), new zn90(new hwb((byte) 7), (byte) 0));
            case 115:
                return new oad1(mxpVar.p1, (byte) 5);
            case 116:
                jly0 jly0Var = mxpVar.G;
                d8u d8uVar = mxpVar.a;
                b9l1 b9l1Var = (b9l1) jly0Var.get();
                tcl1 tcl1Var = (tcl1) mxpVar.o1.get();
                fal1 fal1VarN0 = d8uVar.n0();
                c8o.l(fal1VarN0);
                m0t m0tVar = (m0t) mxpVar.u.get();
                q9l1 q9l1Var2 = (q9l1) mxpVar.g.get();
                cce cceVarD = mxpVar.d();
                t75 t75VarA = mxpVar.a();
                uwm0 uwm0VarK = mxpVar.k();
                c2u0 c2u0VarT = d8uVar.T();
                c8o.l(c2u0VarT);
                return new iij1(b9l1Var, tcl1Var, fal1VarN0, m0tVar, q9l1Var2, cceVarD, t75VarA, uwm0VarK, c2u0VarT);
            case 117:
                return new tcl1(mxpVar.b);
            case 118:
                return new gbl1(mxpVar.s1, (l6l1) mxpVar.q.get());
            case 119:
                return new sd5(mxpVar.d(), (l7d1) mxpVar.r1.get(), mxpVar.p(), (bcl1) mxpVar.h.get());
            case 120:
                return new l7d1();
            case 121:
                return new i2a((l6l1) mxpVar.q.get(), mxpVar.u1, (byte) 8);
            case 122:
                return new vbl1(mxpVar.d(), (bcl1) mxpVar.h.get(), (hcl1) mxpVar.i.get(), mxpVar.g(), mxpVar.a(), (m0t) mxpVar.u.get());
            case 123:
                return new i2a((byte) 9, (l6l1) mxpVar.q.get(), mxpVar.A1);
            case 124:
                kj31 kj31Var = (kj31) mxpVar.z1.get();
                d8u d8uVar2 = mxpVar.a;
                Context contextQ = d8uVar2.q();
                c8o.l(contextQ);
                w5b1 w5b1VarI0 = d8uVar2.i0();
                c8o.l(w5b1VarI0);
                return new vbm1(kj31Var, new ti31(contextQ, w5b1VarI0), mxpVar.j(), (hcl1) mxpVar.i.get(), (m0t) mxpVar.u.get());
            case 125:
                return new abp(this, b);
            case 126:
                return new zhq0((lks0) mxpVar.w1.get(), new j650(new b2k(new f32((byte) 0, false), new f32((byte) 2, false), new hhv0(), new f32((byte) 1, false))), (byte) 16).j();
            case 127:
                Context contextQ2 = mxpVar.a.q();
                c8o.l(contextQ2);
                return new lks0(contextQ2, new bow());
            case 128:
                hj31 hj31VarZ = mxpVar.a.Z();
                c8o.l(hj31VarZ);
                return hj31VarZ;
            case 129:
                return new mtb(mxpVar.G1);
            case 130:
                jly0 jly0Var2 = mxpVar.x1;
                xgm1 xgm1Var = (xgm1) mxpVar.E1.get();
                bcl1 bcl1Var = (bcl1) mxpVar.h.get();
                q7r0 q7r0Var = mxpVar.b;
                mub mubVar = new mub(bcl1Var, cwl1.H(q7r0Var), u1n0.z(q7r0Var));
                zxl1 zxl1VarC = mxpVar.c();
                lzn0 lzn0VarQ3 = mxpVar.a.Q();
                c8o.l(lzn0VarQ3);
                return new ttb(jly0Var2, xgm1Var, mubVar, zxl1VarC, lzn0VarQ3);
            case 131:
                d8u d8uVar3 = mxpVar.a;
                q8n q8nVarE = d8uVar3.E();
                c8o.l(q8nVarE);
                qpj1 qpj1VarS = mxpVar.s();
                cik1 cik1VarR = mxpVar.r();
                ohm1 ohm1VarO0 = d8uVar3.o0();
                c8o.l(ohm1VarO0);
                a aVarM = w290.m(qpj1VarS, cik1VarR, ohm1VarO0, (g9l1) mxpVar.C1.get(), mxpVar.p());
                tp41 tp41VarE0 = d8uVar3.e0();
                c8o.l(tp41VarE0);
                j810 j810VarZ = d8uVar3.z();
                c8o.l(j810VarZ);
                return new ahm1(q8nVarE, aVarM, bol1.v(tp41VarE0, j810VarZ, new pl01(), new fk41()), (qfm1) mxpVar.D1.get());
            case 132:
                b9l1 b9l1Var2 = (b9l1) mxpVar.G.get();
                fal1 fal1VarN1 = mxpVar.a.n0();
                c8o.l(fal1VarN1);
                return new g9l1(b9l1Var2, fal1VarN1, (m0t) mxpVar.u.get(), brt.w(mxpVar.b), (q9l1) mxpVar.g.get(), mxpVar.k());
            case 133:
                return new qfm1();
            case 134:
                return new obm1((q9l1) mxpVar.g.get());
            case 135:
                return new e8m1((l6l1) mxpVar.q.get(), mxpVar.M1, (py7) mxpVar.I1.get());
            case 136:
                jly0 jly0Var3 = mxpVar.K1;
                d8u d8uVar4 = mxpVar.a;
                g4k g4kVar = (g4k) jly0Var3.get();
                py7 py7Var = (py7) mxpVar.I1.get();
                xgm1 xgm1Var2 = (xgm1) mxpVar.E1.get();
                frl1 frl1Var = new frl1(mxpVar.s(), (byte) 3);
                h2q0 h2q0Var = (h2q0) mxpVar.L1.get();
                fal1 fal1VarN2 = d8uVar4.n0();
                c8o.l(fal1VarN2);
                m0t m0tVar2 = (m0t) mxpVar.u.get();
                g9l1 g9l1Var = (g9l1) mxpVar.C1.get();
                hcl1 hcl1Var = (hcl1) mxpVar.i.get();
                cce cceVarD2 = mxpVar.d();
                yqg yqgVarG = d8uVar4.g();
                c8o.l(yqgVarG);
                q9l1 q9l1Var3 = (q9l1) mxpVar.g.get();
                luk lukVarW = d8uVar4.W();
                c8o.l(lukVarW);
                s84 s84Var = new s84(false, lukVarW);
                bcl1 bcl1Var2 = (bcl1) mxpVar.h.get();
                q7r0 q7r0Var2 = mxpVar.b;
                return new l8m1(g4kVar, py7Var, xgm1Var2, frl1Var, h2q0Var, fal1VarN2, m0tVar2, g9l1Var, hcl1Var, cceVarD2, yqgVarG, q9l1Var3, s84Var, new tjz(bcl1Var2, cwl1.H(q7r0Var2), u1n0.z(q7r0Var2)), mxpVar.x1);
            case 137:
                q8n q8nVarE2 = mxpVar.a.E();
                c8o.l(q8nVarE2);
                return new g4k(q8nVarE2, (a3k) mxpVar.J1.get());
            case 138:
                d8u d8uVar5 = mxpVar.a;
                q7r0 q7r0Var3 = mxpVar.b;
                Context contextQ3 = d8uVar5.q();
                c8o.l(contextQ3);
                gw70 gw70VarB = d8uVar5.B();
                c8o.l(gw70VarB);
                w5b1 w5b1VarI1 = d8uVar5.i0();
                c8o.l(w5b1VarI1);
                pe peVarA = d8uVar5.a();
                c8o.l(peVarA);
                tjs0 tjs0Var = (tjs0) mxpVar.x1.get();
                woa woaVarF = d8uVar5.f();
                c8o.l(woaVarF);
                v290 v290VarJ0 = d8uVar5.j0();
                c8o.l(v290VarJ0);
                zxl1 zxl1VarC2 = mxpVar.c();
                bih1 bih1VarP = mxpVar.p();
                d8u d8uVar6 = mxpVar.a;
                Context contextQ4 = d8uVar6.q();
                c8o.l(contextQ4);
                w5b1 w5b1VarI2 = d8uVar6.i0();
                c8o.l(w5b1VarI2);
                ti31 ti31Var = new ti31(contextQ4, w5b1VarI2);
                kj31 kj31Var2 = (kj31) mxpVar.z1.get();
                cik1 cik1VarR2 = mxpVar.r();
                zle1 zle1VarK0 = d8uVar5.k0();
                c8o.l(zle1VarK0);
                qpj1 qpj1VarS2 = mxpVar.s();
                obm1 obm1Var = (obm1) mxpVar.F1.get();
                xgm1 xgm1Var3 = (xgm1) mxpVar.E1.get();
                ohm1 ohm1VarO1 = d8uVar5.o0();
                c8o.l(ohm1VarO1);
                py7 py7Var2 = (py7) mxpVar.I1.get();
                njx0 njx0Var = new njx0((byte) 29);
                RetrofitMaker retrofitMakerY = d8uVar5.Y();
                c8o.l(retrofitMakerY);
                tmd0 tmd0Var = (tmd0) retrofitMakerY.createWebgateService(tmd0.class, "android-campaigns-service-wrapped-endpoint");
                bcl1 bcl1Var3 = (bcl1) mxpVar.h.get();
                sme1 sme1Var = new sme1(bcl1Var3, cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                ard1 ard1Var = new ard1((bcl1) mxpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                vhd0 vhd0Var = new vhd0((bcl1) mxpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                idm1 idm1Var = new idm1((bcl1) mxpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                tjz tjzVar = new tjz((bcl1) mxpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                ryc1 ryc1Var = new ryc1((bcl1) mxpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                xf6 xf6Var = new xf6((bcl1) mxpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                t2j0 t2j0VarW = d8uVar5.w();
                c8o.l(t2j0VarW);
                return bol1.w(contextQ3, gw70VarB, w5b1VarI1, peVarA, tjs0Var, woaVarF, v290VarJ0, zxl1VarC2, bih1VarP, ti31Var, kj31Var2, cik1VarR2, zle1VarK0, qpj1VarS2, obm1Var, xgm1Var3, ohm1VarO1, py7Var2, njx0Var, tmd0Var, sme1Var, ard1Var, vhd0Var, idm1Var, tjzVar, ryc1Var, xf6Var, t2j0VarW);
            case 139:
                return new py7();
            case 140:
                return new h2q0();
            case 141:
                return new oad1(mxpVar.O1, (byte) 6);
            case 142:
                q9l1 q9l1Var4 = (q9l1) mxpVar.g.get();
                g9l1 g9l1Var2 = (g9l1) mxpVar.C1.get();
                xgm1 xgm1Var4 = (xgm1) mxpVar.E1.get();
                bcl1 bcl1Var4 = (bcl1) mxpVar.h.get();
                q7r0 q7r0Var4 = mxpVar.b;
                return new sh40(q9l1Var4, g9l1Var2, xgm1Var4, new d08(bcl1Var4, cwl1.H(q7r0Var4), u1n0.z(q7r0Var4)), (m0t) mxpVar.u.get(), (hcl1) mxpVar.i.get(), (byte) 2);
            case 143:
                return new jbm1(mxpVar.Q1);
            case 144:
                q9l1 q9l1Var5 = (q9l1) mxpVar.g.get();
                g9l1 g9l1Var3 = (g9l1) mxpVar.C1.get();
                xgm1 xgm1Var5 = (xgm1) mxpVar.E1.get();
                jly0 jly0Var4 = mxpVar.x1;
                hce1 hce1VarN = mxpVar.n();
                bcl1 bcl1Var5 = (bcl1) mxpVar.h.get();
                q7r0 q7r0Var5 = mxpVar.b;
                return new lbm1(q9l1Var5, g9l1Var3, xgm1Var5, jly0Var4, hce1VarN, new d08(bcl1Var5, cwl1.H(q7r0Var5), u1n0.z(q7r0Var5)), (m0t) mxpVar.u.get(), (hcl1) mxpVar.i.get());
            case 145:
                return new yk1(mxpVar.S1, (byte) 5);
            case 146:
                return new fyc((bcl1) mxpVar.h.get(), mxpVar.p());
            case 147:
                return new yk1(mxpVar.U1, (byte) 29);
            case 148:
                return new nr00((byte) 2);
            case 149:
                yqg yqgVarG2 = mxpVar.a.g();
                c8o.l(yqgVarG2);
                return new lc31(yqgVarG2);
            case 150:
                return new kxp(this);
            case 151:
                return new bbp(this, (byte) 1);
            case 152:
                ark1 ark1VarM0 = mxpVar.a.m0();
                c8o.l(ark1VarM0);
                return ark1VarM0;
            case 153:
                vi11 vi11VarM = mxpVar.m();
                v75 v75VarB = mxpVar.b();
                yqg yqgVarG3 = mxpVar.a.g();
                c8o.l(yqgVarG3);
                return new kji1(vi11VarM, v75VarB, yqgVarG3);
            case 154:
                return new i4t0();
            case 155:
                qim1 qim1Var = new qim1(xqu.a(mxpVar.E1), xqu.a(mxpVar.K1), xqu.a(mxpVar.a2), xqu.a(mxpVar.y1));
                d490 d490VarD = mxpVar.a.D();
                c8o.l(d490VarD);
                ynb0 ynb0VarA = xqu.a(mxpVar.b2);
                qim1Var.g = new pim1(ynb0VarA, d490VarD);
                qim1Var.h = new pim1(d490VarD, ynb0VarA);
                qim1Var.i = new dl3(ynb0VarA, (byte) 7);
                return qim1Var;
            case 156:
                lzn0 lzn0VarQ4 = mxpVar.a.Q();
                c8o.l(lzn0VarQ4);
                return new bcm1(lzn0VarQ4, mxpVar.s(), (h2q0) mxpVar.L1.get());
            case 157:
                xgm1 xgm1Var6 = (xgm1) mxpVar.E1.get();
                g9l1 g9l1Var4 = (g9l1) mxpVar.C1.get();
                j810 j810VarZ2 = mxpVar.a.z();
                c8o.l(j810VarZ2);
                return new rim1(xgm1Var6, g9l1Var4, j810VarZ2);
            case 158:
                return Boolean.valueOf(mxpVar.a.s());
            case 159:
                return new cbp(this, (byte) 1);
            case 160:
                return new dbp(this, (byte) 1);
            case 161:
                return new ebp(this, (byte) 1);
            case 162:
                return new fbp(this, (byte) 1);
            case 163:
                yqg yqgVarG4 = mxpVar.a.g();
                c8o.l(yqgVarG4);
                return new n2u0(yqgVarG4);
            case 164:
                return new fq10();
            case 165:
                y390 y390VarX = mxpVar.a.x();
                c8o.l(y390VarX);
                return new n8l1(y390VarX.a(brt.w(mxpVar.b), r6h1.c));
            case 166:
                return new r9l1(mxpVar.c, mxpVar.i());
            case 167:
                return new j4t0(u1n0.z(mxpVar.b), (q9l1) mxpVar.g.get());
            case 168:
                return new lxp(this);
            default:
                jah.e(s);
                return null;
        }
    }

    public Object d() {
        nwp nwpVar = (nwp) this.c;
        byte b = 3;
        byte b2 = 4;
        byte b3 = 1;
        byte b4 = 2;
        byte b5 = 0;
        short s = this.b;
        switch (s) {
            case 0:
                return k9o0.k(nwpVar.d, nwpVar.e, nwpVar.f, nwpVar.h, nwpVar.g, nwpVar.i, nwpVar.k, nwpVar.l, nwpVar.m, nwpVar.r, nwpVar.s, nwpVar.t, nwpVar.u, nwpVar.v, nwpVar.w, nwpVar.x, nwpVar.y, nwpVar.z, nwpVar.A, nwpVar.B);
            case 1:
                csy csyVarN = nwpVar.a.N();
                c8o.l(csyVarN);
                return csyVarN;
            case 2:
                dg30 dg30VarF = nwpVar.b.F();
                c8o.l(dg30VarF);
                return dg30VarF;
            case 3:
                Resources resourcesL0 = nwpVar.a.L0();
                c8o.l(resourcesL0);
                return resourcesL0;
            case 4:
                Context contextG = nwpVar.b.G();
                c8o.l(contextG);
                gw70 gw70VarA0 = nwpVar.a.a0();
                c8o.l(gw70VarA0);
                return w2x.u(contextG, gw70VarA0, nwpVar.p());
            case 5:
                luk lukVarD = nwpVar.a.D();
                c8o.l(lukVarD);
                return lukVarD;
            case 6:
                yqg yqgVarX = nwpVar.a.x();
                c8o.l(yqgVarX);
                return yqgVarX;
            case 7:
                mwn0 mwn0VarV0 = nwpVar.a.v0();
                c8o.l(mwn0VarV0);
                return mwn0VarV0;
            case 8:
                o241 o241VarN0 = nwpVar.a.N0();
                c8o.l(o241VarN0);
                return o241VarN0;
            case 9:
                Flowable flowableE0 = nwpVar.a.E0();
                c8o.l(flowableE0);
                return flowableE0;
            case 10:
                t8u0 t8u0VarB0 = nwpVar.a.B0();
                c8o.l(t8u0VarB0);
                return t8u0VarB0;
            case 11:
                me30 me30VarT = nwpVar.a.T();
                c8o.l(me30VarT);
                return me30VarT;
            case 12:
                g62 g62VarA = nwpVar.a();
                cz2 cz2VarC = nwpVar.c();
                g62 g62VarM = nwpVar.m();
                o0y o0yVarQ = nwpVar.q();
                o0y o0yVarR = nwpVar.r();
                return p7h.M(new o4p0[]{g62VarA, nwpVar.v(), cz2VarC, nwpVar.G(), nwpVar.A(), o0yVarQ, nwpVar.C(), nwpVar.t(), o0yVarR, g62VarM});
            case 13:
                return new i0y();
            case 14:
                return new us10((wm70) nwpVar.p.get());
            case 15:
                return new wm70((me30) nwpVar.n.get());
            case 16:
                Scheduler schedulerH0 = nwpVar.a.h0();
                c8o.l(schedulerH0);
                return schedulerH0;
            case 17:
                Scheduler schedulerB = nwpVar.a.B();
                c8o.l(schedulerB);
                return schedulerB;
            case 18:
                fza1 fza1VarH1 = nwpVar.a.h1();
                c8o.l(fza1VarH1);
                return fza1VarH1;
            case 19:
                n2p0 n2p0VarW0 = nwpVar.a.w0();
                c8o.l(n2p0VarW0);
                return n2p0VarW0;
            case 20:
                ror rorVarH = nwpVar.a.H();
                c8o.l(rorVarH);
                return rorVarH;
            case 21:
                dxy dxyVarE = nwpVar.E();
                gnq0 gnq0VarZ0 = nwpVar.a.z0();
                c8o.l(gnq0VarZ0);
                return l1b0.s(dxyVarE, gnq0VarZ0);
            case 22:
                t701 t701VarH0 = nwpVar.a.H0();
                c8o.l(t701VarH0);
                return t701VarH0;
            case 23:
                six0 six0VarV = nwpVar.a.V();
                c8o.l(six0VarV);
                return six0VarV;
            case 24:
                q8n q8nVarK = nwpVar.a.K();
                c8o.l(q8nVarK);
                return q8nVarK;
            case 25:
                Boolean bool = (Boolean) ((daq) nwpVar.a.b).Wp.get();
                bool.getClass();
                return bool;
            case 26:
                return w3p0.b(nwpVar.D, nwpVar.F, nwpVar.G, nwpVar.H, nwpVar.I, nwpVar.J, nwpVar.K);
            case 27:
                ix81 ix81Var = (ix81) ((teq) nwpVar.a.c).o7.get();
                c8o.l(ix81Var);
                return ix81Var;
            case 28:
                e7p0 e7p0Var = (e7p0) ((teq) nwpVar.a.c).W4.get();
                c8o.l(e7p0Var);
                return e7p0Var;
            case 29:
                w4p0 w4p0Var = (w4p0) ((daq) nwpVar.a.b).go.get();
                c8o.l(w4p0Var);
                return w4p0Var;
            case 30:
                lzn0 lzn0Var = (lzn0) ((teq) nwpVar.a.c).i.get();
                c8o.l(lzn0Var);
                return lzn0Var;
            case 31:
                return (x4r0) nwpVar.b.f;
            case 32:
                em0 em0Var = nwpVar.a;
                ynb0 ynb0VarA = xqu.a((p2q) em0Var.d);
                yiq yiqVar = ((teq) em0Var.c).b;
                ynb0 ynb0VarA2 = xqu.a(yiqVar.v9);
                daq daqVar = yiqVar.a;
                boolean zP = w0o1.p(new hg4((tgp0) daqVar.o2.get(), (luk) daqVar.L1.get()));
                ynb0 ynb0VarA3 = xqu.a((p2q) em0Var.e);
                ynb0 ynb0VarA4 = xqu.a((p2q) em0Var.f);
                ynb0 ynb0VarA5 = xqu.a(yiqVar.Eb);
                ynb0 ynb0VarA6 = xqu.a((p2q) em0Var.g);
                ynb0 ynb0VarA7 = xqu.a((p2q) em0Var.h);
                daq daqVar2 = (daq) em0Var.b;
                return new e5p0(ynb0VarA, ynb0VarA2, zP, ynb0VarA3, ynb0VarA4, ynb0VarA5, ynb0VarA6, ynb0VarA7, xqu.a(daqVar2.eq), xqu.a((p2q) em0Var.i), xqu.a((p2q) em0Var.t), xqu.a((p2q) em0Var.X), (mr4) daqVar2.ri.get(), new ym4(false, (luk) daqVar2.L1.get()));
            case 33:
                ljg ljgVar = (ljg) ((teq) nwpVar.a.c).k4.get();
                c8o.l(ljgVar);
                return ljgVar;
            case 34:
                return Boolean.valueOf(nwpVar.b.b);
            case 35:
                gbp gbpVar = nwpVar.d;
                gbp gbpVar2 = nwpVar.e;
                gbp gbpVar3 = nwpVar.f;
                gbp gbpVar4 = nwpVar.h;
                gbp gbpVar5 = nwpVar.g;
                gbp gbpVar6 = nwpVar.i;
                gbp gbpVar7 = nwpVar.k;
                gbp gbpVar8 = nwpVar.l;
                gbp gbpVar9 = nwpVar.m;
                jly0 jly0Var = nwpVar.r;
                gbp gbpVar10 = nwpVar.s;
                gbp gbpVar11 = nwpVar.t;
                gbp gbpVar12 = nwpVar.u;
                gbp gbpVar13 = nwpVar.v;
                gbp gbpVar14 = nwpVar.w;
                gbp gbpVar15 = nwpVar.x;
                gbp gbpVar16 = nwpVar.y;
                gbp gbpVar17 = nwpVar.z;
                gbp gbpVar18 = nwpVar.A;
                gbp gbpVar19 = nwpVar.B;
                r2p0 r2p0Var = new r2p0((byte) 0);
                r2p0Var.b = gbpVar;
                r2p0Var.c = gbpVar2;
                r2p0Var.d = gbpVar3;
                r2p0Var.e = gbpVar4;
                r2p0Var.f = gbpVar5;
                r2p0Var.g = gbpVar6;
                r2p0Var.h = gbpVar7;
                r2p0Var.i = gbpVar8;
                r2p0Var.j = gbpVar9;
                r2p0Var.k = jly0Var;
                r2p0Var.l = gbpVar10;
                r2p0Var.m = gbpVar11;
                r2p0Var.n = gbpVar12;
                r2p0Var.o = gbpVar13;
                r2p0Var.f67p = gbpVar14;
                r2p0Var.q = gbpVar15;
                r2p0Var.r = gbpVar16;
                r2p0Var.s = gbpVar17;
                r2p0Var.t = gbpVar18;
                r2p0Var.u = gbpVar19;
                return r2p0Var;
            case 36:
                gbp gbpVar20 = nwpVar.D;
                gbp gbpVar21 = nwpVar.K;
                gbp gbpVar22 = nwpVar.E;
                gbp gbpVar23 = nwpVar.F;
                gbp gbpVar24 = nwpVar.H;
                gbp gbpVar25 = nwpVar.N;
                v4p0 v4p0Var = new v4p0();
                v4p0Var.a = gbpVar20;
                v4p0Var.b = gbpVar21;
                v4p0Var.c = gbpVar22;
                v4p0Var.d = gbpVar23;
                v4p0Var.e = gbpVar24;
                v4p0Var.f = gbpVar25;
                return v4p0Var;
            case 37:
                d7p0 d7p0Var = (d7p0) ((teq) nwpVar.a.c).V4.get();
                c8o.l(d7p0Var);
                return d7p0Var;
            case 38:
                return new cbv();
            case 39:
                return new pqc1();
            case 40:
                vb2 vb2Var = (vb2) ((teq) nwpVar.a.c).n3.get();
                c8o.l(vb2Var);
                return vb2Var;
            case 41:
                qns0 qns0Var = (qns0) ((daq) nwpVar.a.b).q5.get();
                c8o.l(qns0Var);
                return qns0Var;
            case 42:
                return new vhs0();
            case 43:
                byte b6 = 8;
                byte b7 = 7;
                em0 em0Var2 = nwpVar.a;
                fdc fdcVar = nwpVar.b;
                em0 em0Var3 = nwpVar.a;
                mr20 mr20VarD0 = em0Var2.D0();
                c8o.l(mr20VarD0);
                mr20 mr20Var = mr20VarD0;
                gbp gbpVar26 = nwpVar.U;
                gbp gbpVar27 = nwpVar.V;
                v5l v5lVar = new v5l(((s4p0) nwpVar.H.get()).d());
                teq teqVar = (teq) em0Var3.c;
                daq daqVar3 = (daq) em0Var3.b;
                uu00 uu00VarP = em0Var3.P();
                c8o.l(uu00VarP);
                exh exhVar = new exh(uu00VarP, nwpVar.u(), b2);
                uu00 uu00VarP2 = em0Var3.P();
                c8o.l(uu00VarP2);
                sp00 sp00VarU = nwpVar.u();
                a1r0 a1r0VarA0 = em0Var3.A0();
                c8o.l(a1r0VarA0);
                gw70 gw70VarA1 = em0Var3.a0();
                c8o.l(gw70VarA1);
                Object omhVar = ((lv4) nwpVar.W.get()).f() ? new omh(uu00VarP2, sp00VarU, new rzo0(a1r0VarA0, gw70VarA1, Optional.empty(), (byte) 27), b3) : exhVar;
                gbp gbpVar28 = nwpVar.W;
                qaq0 qaq0Var = new qaq0(false, false, (luk) nwpVar.g.get());
                Single singleD = nwpVar.D();
                m900 m900Var = (m900) daqVar3.a.T1.get();
                c8o.l(m900Var);
                rzo0 rzo0Var = new rzo0(qaq0Var, singleD, m900Var, (byte) 13);
                hjc hjcVar = new hjc(((xfx) nwpVar.h.get()).b, (byte) 24);
                Context context = (Context) fdcVar.d;
                c8o.l(context);
                yqg yqgVar = (yqg) nwpVar.i.get();
                c8o.l((Context) fdcVar.d);
                rok0 rok0Var = new rok0(hjcVar, new drj0(context, new fod0(yqgVar), (byte) 29), (byte) 26);
                lzn0 lzn0Var2 = (lzn0) nwpVar.G.get();
                sd41 sd41Var = (sd41) teqVar.ea.get();
                c8o.l(sd41Var);
                Object exhVar2 = new exh(rzo0Var, new bnj0((Object) rok0Var, (Object) new t9q0(lzn0Var2, sd41Var, (Scheduler) nwpVar.s.get()), (byte) 29), b7);
                vfc vfcVar = new vfc((gvp) nwpVar.X.get(), (byte) 11);
                if (((lv4) gbpVar28.get()).e()) {
                    exhVar2 = vfcVar;
                }
                nwp nwpVar2 = nwpVar.c;
                exh exhVar3 = new exh(new vgq0(new oup(nwpVar2), (byte) 29), new mlw0((t701) nwpVar.y.get()), (byte) 9);
                ha01 ha01Var = (ha01) nwpVar.Y.get();
                hbg1 hbg1Var = (hbg1) teqVar.b.h4.get();
                c8o.l(hbg1Var);
                Object omhVar2 = ((lv4) nwpVar.W.get()).g() ? new omh(ha01Var, hbg1Var, new k55(false, false, (luk) nwpVar.g.get()), b4) : exhVar3;
                vfc vfcVar2 = new vfc((xvp) nwpVar.a0.get(), (byte) 0);
                cwe1 cwe1Var = (cwe1) teqVar.z2.get();
                c8o.l(cwe1Var);
                fwp fwpVar = (fwp) nwpVar.d0.get();
                Object obj = omhVar2;
                Object obj2 = exhVar2;
                tjh tjhVar = (tjh) daqVar3.Cp.get();
                c8o.l(tjhVar);
                a7z a7zVar = (a7z) daqVar3.Pp.get();
                c8o.l(a7zVar);
                hfh hfhVar = new hfh(tjhVar, new efr(a7zVar, (byte) 25));
                tjh tjhVar2 = (tjh) daqVar3.Cp.get();
                c8o.l(tjhVar2);
                ifh ifhVar = new ifh(cwe1Var, fwpVar, hfhVar, new fna(tjhVar2, (byte) 19));
                tjh tjhVar3 = (tjh) daqVar3.Cp.get();
                c8o.l(tjhVar3);
                omh omhVar3 = new omh(ifhVar, new xid(tjhVar3, new kqh(false, (luk) nwpVar.g.get()), (byte) 20), (s4p0) nwpVar.H.get(), (byte) 0);
                byte b8 = 18;
                l2a l2aVar = new l2a(new nup(nwpVar2), b8);
                uwh uwhVarA = em0Var3.A();
                c8o.l(uwhVarA);
                uu00 uu00VarP3 = em0Var3.P();
                c8o.l(uu00VarP3);
                q8n q8nVarB0 = em0Var3.b0();
                c8o.l(q8nVarB0);
                exh exhVar4 = new exh(l2aVar, new cce(uwhVarA, uu00VarP3, q8nVarB0, (byte) 26), (byte) 0);
                gw70 gw70VarA2 = em0Var3.a0();
                c8o.l(gw70VarA2);
                lzn0 lzn0Var3 = (lzn0) nwpVar.G.get();
                w4h w4hVar = (w4h) daqVar3.k7.get();
                c8o.l(w4hVar);
                dg8 dg8Var = new dg8(w4hVar, (byte) 24);
                RetrofitMaker retrofitMakerM0 = em0Var3.M0();
                c8o.l(retrofitMakerM0);
                rm5 rm5Var = new rm5(wyj.o(retrofitMakerM0), nwpVar.l());
                kt91 kt91VarD1 = em0Var3.d1();
                c8o.l(kt91VarD1);
                yqg yqgVar2 = (yqg) nwpVar.i.get();
                i4q i4qVarI = em0Var3.I();
                c8o.l(i4qVarI);
                Activity activityM = em0Var3.m();
                c8o.l(activityM);
                xh71 xh71VarX0 = em0Var3.X0();
                c8o.l(xh71VarX0);
                f971 f971Var = new f971(xh71VarX0);
                jl21 jl21Var = (jl21) teqVar.l2.get();
                c8o.l(jl21Var);
                j6d j6dVar = (j6d) nwpVar.e0.get();
                t2j0 t2j0VarI0 = em0Var3.i0();
                c8o.l(t2j0VarI0);
                kt91 kt91VarD2 = em0Var3.d1();
                c8o.l(kt91VarD2);
                l6d l6dVar = new l6d(j6dVar, t2j0VarI0, kt91VarD2);
                j6d j6dVar2 = (j6d) nwpVar.e0.get();
                c8o.l(context);
                xh71 xh71VarX1 = em0Var3.X0();
                c8o.l(xh71VarX1);
                y1t0 y1t0Var = new y1t0(xh71VarX1, (byte) 12);
                q3c q3cVar = new q3c(new ubc((byte) 2, false));
                xrk xrkVarL = nwpVar.l();
                dma1 dma1VarZ0 = em0Var3.Z0();
                c8o.l(dma1VarZ0);
                vfc vfcVar3 = new vfc(new mmr(gw70VarA2, lzn0Var3, dg8Var, rm5Var, kt91VarD1, yqgVar2, i4qVarI, activityM, f971Var, jl21Var, l6dVar, j6dVar2, y1t0Var, q3cVar, xrkVarL, dma1VarZ0), (byte) 1);
                jwp jwpVar = (jwp) nwpVar.s0.get();
                mr20 mr20Var2 = (mr20) ((daq) em0Var3.b).cc.get();
                c8o.l(mr20Var2);
                exh exhVar5 = new exh(jwpVar, new uji1(mr20Var2, (byte) 0), (byte) 1);
                yyn yynVar = (yyn) teqVar.Qb.get();
                c8o.l(yynVar);
                zyn zynVar = new zyn(yynVar, (avp) nwpVar.v0.get(), new mv4((luk) nwpVar.g.get()), (lv4) nwpVar.W.get(), (byte) 0);
                vfc vfcVar4 = new vfc((cvp) nwpVar.x0.get(), (byte) 2);
                vfc vfcVar5 = new vfc((evp) nwpVar.y0.get(), b);
                o290 o290Var = (o290) teqVar.tf.get();
                c8o.l(o290Var);
                jjh1 jjh1Var = (jjh1) daqVar3.nb.get();
                c8o.l(jjh1Var);
                exh exhVar6 = new exh(o290Var, jjh1Var, (byte) 2);
                ja8 ja8Var = new ja8((lzn0) nwpVar.G.get());
                RetrofitMaker retrofitMakerM1 = em0Var3.M0();
                c8o.l(retrofitMakerM1);
                ka8 ka8Var = (ka8) retrofitMakerM1.createWebgateService(ka8.class, "android-ereader-endpoint-impl");
                q8n q8nVarB1 = em0Var3.b0();
                c8o.l(q8nVarB1);
                vfc vfcVar6 = new vfc(new otu(ja8Var, new her(new em3(ka8Var, q8nVarB1, (byte) 26), (byte) 26), (byte) 6), (byte) 4);
                vfc vfcVar7 = new vfc((fvp) nwpVar.z0.get(), (byte) 5);
                exh exhVar7 = new exh(new qmr((hvp) nwpVar.C0.get(), (byte) 26), context, (byte) 3);
                yyn yynVar2 = (yyn) teqVar.Qb.get();
                c8o.l(yynVar2);
                i3z i3zVar = new i3z(yynVar2, (avp) nwpVar.v0.get(), (lv4) nwpVar.W.get(), (byte) 0);
                vfc vfcVar8 = new vfc((ivp) nwpVar.D0.get(), (byte) 6);
                m1q m1qVar = (m1q) teqVar.Qf.get();
                c8o.l(m1qVar);
                vf0 vf0Var = (vf0) nwpVar.F0.get();
                kh5 kh5Var = (kh5) daqVar3.a.C1.get();
                c8o.l(kh5Var);
                ye90 ye90Var = new ye90(kh5Var, new co4((luk) nwpVar.g.get()), (byte) 17);
                t2j0 t2j0VarI1 = em0Var3.i0();
                c8o.l(t2j0VarI1);
                eb80 eb80Var = new eb80(new x390(ye90Var, new rdo(t2j0VarI1), (byte) 22), (byte) 7);
                ov20 ov20Var = (ov20) daqVar3.P5.get();
                c8o.l(ov20Var);
                pzb0 pzb0Var = new pzb0(vf0Var, eb80Var, ov20Var, nwpVar.G0, (fza1) nwpVar.u.get(), (Flowable) nwpVar.l.get());
                lv4 lv4Var = (lv4) nwpVar.W.get();
                jjh1 jjh1Var2 = (jjh1) daqVar3.nb.get();
                c8o.l(jjh1Var2);
                zyn zynVar2 = new zyn(m1qVar, pzb0Var, lv4Var, jjh1Var2);
                Flowable flowable = (Flowable) nwpVar.l.get();
                c1f1 c1f1Var = (c1f1) teqVar.a.G.get();
                c8o.l(c1f1Var);
                vfc vfcVar9 = new vfc(new dg90(new haa0(flowable, c1f1Var, (Scheduler) nwpVar.s.get(), (byte) 26), (byte) 12), (byte) 7);
                lzn0 lzn0Var4 = (lzn0) nwpVar.G.get();
                a1r0 a1r0VarA1 = em0Var3.A0();
                c8o.l(a1r0VarA1);
                gw70 gw70VarA3 = em0Var3.a0();
                c8o.l(gw70VarA3);
                vfc vfcVar10 = new vfc(new l0x0(lzn0Var4, a1r0VarA1, gw70VarA3), b6);
                mre0 mre0Var = new mre0(new hup(nwpVar2), (byte) 1);
                lnf0 lnf0Var = (lnf0) daqVar3.po.get();
                c8o.l(lnf0Var);
                bhf0 bhf0Var = (bhf0) daqVar3.oo.get();
                c8o.l(bhf0Var);
                sqs0 sqs0Var = (sqs0) daqVar3.uo.get();
                c8o.l(sqs0Var);
                zwz0 zwz0Var = (zwz0) daqVar3.U1.get();
                c8o.l(zwz0Var);
                exh exhVar8 = new exh(mre0Var, new fdc(lnf0Var, bhf0Var, sqs0Var, zwz0Var, new cr4(false, false, false, (luk) nwpVar.g.get()).b(), (byte) 18), (byte) 5);
                vfc vfcVar11 = new vfc((jvp) nwpVar.Q0.get(), (byte) 9);
                vfc vfcVar12 = new vfc((nvp) nwpVar.R0.get(), (byte) 10);
                exh exhVar9 = new exh(new upa0((pvp) nwpVar.S0.get(), (byte) 29), (lzn0) nwpVar.G.get(), (byte) 6);
                g2q g2qVar = (g2q) teqVar.b.X.get();
                c8o.l(g2qVar);
                RetrofitMaker retrofitMakerM2 = em0Var3.M0();
                c8o.l(retrofitMakerM2);
                s8n0 s8n0Var = (s8n0) retrofitMakerM2.createWebgateService(s8n0.class, "android-musicvideos-uiusecases-relatedvideocarousel");
                o241 o241Var = (o241) nwpVar.k.get();
                fuj1 fuj1Var = (fuj1) daqVar3.a.Y1.get();
                c8o.l(fuj1Var);
                o241 o241Var2 = (o241) nwpVar.k.get();
                rh11 rh11VarK0 = em0Var3.K0();
                c8o.l(rh11VarK0);
                krh krhVar = (krh) daqVar3.y5.get();
                c8o.l(krhVar);
                phi0 phi0Var = new phi0((Object) s8n0Var, (Object) o241Var, (Object) fuj1Var, (Object) new v8n0(o241Var2, rh11VarK0, krhVar, new b75((luk) nwpVar.g.get())), (Object) new fu4(false, false, (luk) nwpVar.g.get()), (byte) 2);
                v65 v65Var = new v65((luk) nwpVar.g.get());
                lv4 lv4Var2 = (lv4) nwpVar.W.get();
                q8n q8nVarG0 = em0Var3.g0();
                c8o.l(q8nVarG0);
                v290 v290Var = (v290) daqVar3.Kn.get();
                c8o.l(v290Var);
                s4p0 s4p0Var = (s4p0) nwpVar.H.get();
                mr20 mr20VarD1 = em0Var3.D0();
                c8o.l(mr20VarD1);
                rfj1 rfj1Var = new rfj1(g2qVar, phi0Var, v65Var, lv4Var2, q8nVarG0, v290Var, s4p0Var, mr20VarD1);
                jep jepVar = (jep) nwpVar.T0.get();
                ubv0 ubv0Var = (ubv0) nwpVar.U0.get();
                RetrofitMaker retrofitMakerM3 = em0Var3.M0();
                c8o.l(retrofitMakerM3);
                ncv0 ncv0Var = (ncv0) retrofitMakerM3.createWebgateService(ncv0.class, "android-podcast-interactivity-polls");
                c8o.m(ncv0Var);
                q6v0 q6v0Var = (q6v0) daqVar3.Fj.get();
                c8o.l(q6v0Var);
                vfc vfcVar13 = new vfc(new aru0(jepVar, ubv0Var, new yeu0((Object) ncv0Var, (Object) q6v0Var, (byte) 10), (byte) 8), (byte) 12);
                exh exhVar10 = new exh((qvp) nwpVar.W0.get(), new xy4(false, (luk) nwpVar.g.get()), (byte) 8);
                omh omhVar4 = new omh((rvp) nwpVar.Z0.get(), (uvp) nwpVar.b1.get(), (lv4) nwpVar.W.get(), (byte) 3);
                exh exhVar11 = new exh((wvp) nwpVar.d1.get(), context, (byte) 10);
                yyn yynVar3 = (yyn) teqVar.Qb.get();
                c8o.l(yynVar3);
                i3z i3zVar2 = new i3z(yynVar3, (avp) nwpVar.v0.get(), (lv4) nwpVar.W.get(), (byte) 1);
                lmw lmwVar = new lmw(new sup(nwpVar2), (byte) 27);
                Flowable flowable2 = (Flowable) nwpVar.l.get();
                o241 o241Var3 = (o241) nwpVar.k.get();
                vf0 vf0Var2 = (vf0) nwpVar.F0.get();
                xrc0 xrc0Var = (xrc0) teqVar.e1.get();
                c8o.l(xrc0Var);
                hn91 hn91Var = (hn91) teqVar.W6.get();
                c8o.l(hn91Var);
                exh exhVar12 = new exh(lmwVar, new dxy(flowable2, o241Var3, vf0Var2, new qo91(xrc0Var, hn91Var)), (byte) 11);
                zyn zynVar3 = new zyn(new r2a1((zvp) nwpVar.e1.get()), new zb91((awp) nwpVar.f1.get(), (byte) 1), (lzn0) nwpVar.G.get(), (lv4) nwpVar.W.get(), (byte) 2);
                vfc vfcVar14 = new vfc((bwp) nwpVar.g1.get(), (byte) 13);
                v7l1 v7l1Var = (v7l1) nwpVar.k1.get();
                Activity activityM2 = em0Var3.m();
                c8o.l(activityM2);
                ilh1 ilh1Var = new ilh1(v7l1Var, activityM2, (byte) 23);
                RetrofitMaker retrofitMakerM4 = em0Var3.M0();
                c8o.l(retrofitMakerM4);
                h9l1 h9l1Var = (h9l1) retrofitMakerM4.createWebgateService(h9l1.class, "android-watchfeed-npvscrollcardimpl");
                Flowable flowable3 = (Flowable) nwpVar.l.get();
                s6z0 s6z0Var = new s6z0((Object) teqVar.b.b.W1(), (byte) 14);
                h9n h9nVar = new h9n(new w75((luk) nwpVar.g.get()), (byte) 20);
                c9c0 c9c0VarD0 = em0Var3.d0();
                c8o.l(c9c0VarD0);
                t380 t380VarW = t380.w(omhVar, obj2, obj, vfcVar2, omhVar3, exhVar4, new nwo0[]{vfcVar3, exhVar5, zynVar, vfcVar4, vfcVar5, exhVar6, vfcVar6, vfcVar7, exhVar7, i3zVar, vfcVar8, zynVar2, vfcVar9, vfcVar10, exhVar8, vfcVar11, vfcVar12, exhVar9, rfj1Var, vfcVar13, exhVar10, omhVar4, exhVar11, i3zVar2, exhVar12, zynVar3, vfcVar14, new kal1(ilh1Var, new e821(h9l1Var, flowable3, s6z0Var, h9nVar, c9c0VarD0), ((Boolean) nwpVar.l1.get()).booleanValue())});
                daq daqVar4 = (daq) em0Var3.b;
                mr20 mr20VarD2 = em0Var3.D0();
                c8o.l(mr20VarD2);
                mr20 mr20Var3 = mr20VarD2;
                fu41 fu41VarW = rx31.w((RetrofitMaker) daqVar4.a.a.Y3.get());
                jv4 jv4Var = new jv4((luk) nwpVar.g.get());
                lv4 lv4Var3 = (lv4) nwpVar.W.get();
                mv4 mv4Var = new mv4((luk) nwpVar.g.get());
                zle1 zle1Var = (zle1) daqVar4.a3.get();
                c8o.l(zle1Var);
                hs41 hs41Var = new hs41(zle1Var);
                wm70 wm70Var = (wm70) nwpVar.p.get();
                bw8 bw8Var = new bw8(((Context) fdcVar.d).getApplicationContext());
                boolean zBooleanValue = ((Boolean) nwpVar.l1.get()).booleanValue();
                yjj1 yjj1VarL1 = em0Var3.l1();
                c8o.l(yjj1VarL1);
                tck tckVar = new tck(mr20Var3, fu41VarW, jv4Var, lv4Var3, mv4Var, hs41Var, wm70Var, bw8Var, zBooleanValue, yjj1VarL1, (yqg) nwpVar.i.get(), (q8n) nwpVar.A.get());
                lko lkoVar = (lko) ((teq) em0Var3.c).v6.get();
                c8o.l(lkoVar);
                mlw0 mlw0Var = new mlw0(new nl4(false, (luk) nwpVar.g.get()), b8);
                mv4 mv4Var2 = new mv4((luk) nwpVar.g.get());
                mr20 mr20Var4 = (mr20) ((daq) em0Var3.b).cc.get();
                c8o.l(mr20Var4);
                uji1 uji1Var = new uji1(mr20Var4, (byte) 0);
                q8n q8nVar = (q8n) ((daq) em0Var3.b).w1.get();
                c8o.l(q8nVar);
                return new hyo0(mr20Var, gbpVar26, gbpVar27, v5lVar, t380VarW, tckVar, lkoVar, mlw0Var, mv4Var2, uji1Var, q8nVar, (q8n) nwpVar.A.get(), new khc((byte) 14));
            case 44:
                r2r r2rVar = (r2r) nwpVar.x.get();
                em0 em0Var4 = nwpVar.a;
                daq daqVar5 = (daq) em0Var4.b;
                vwm1 vwm1Var = (vwm1) daqVar5.k8.get();
                c8o.l(vwm1Var);
                dg8 dg8Var2 = new dg8(vwm1Var, (byte) 2);
                RetrofitMaker retrofitMakerM5 = em0Var4.M0();
                c8o.l(retrofitMakerM5);
                gq9 gq9VarA = y79.A(retrofitMakerM5);
                uu00 uu00VarP4 = em0Var4.P();
                c8o.l(uu00VarP4);
                q59 q59Var = new q59(gq9VarA, uu00VarP4, (byte) 4);
                q8n q8nVarB2 = em0Var4.b0();
                c8o.l(q8nVarB2);
                Context context2 = (Context) nwpVar.b.d;
                c8o.l(context2);
                co9 co9Var = new co9(dg8Var2, q59Var, q8nVarB2, xoi1.b(context2));
                opm opmVar = (opm) daqVar5.Dp.get();
                c8o.l(opmVar);
                gqm gqmVarS = cpm.s((u8p) daqVar5.a.a.n5.get());
                RetrofitMaker retrofitMakerM6 = em0Var4.M0();
                c8o.l(retrofitMakerM6);
                nfo nfoVar = (nfo) retrofitMakerM6.createWebgateService(nfo.class, "android-culturalmoments-culturalmomentsscrollcard-dataloader");
                q8n q8nVarB3 = em0Var4.b0();
                c8o.l(q8nVarB3);
                co9 co9Var2 = new co9(nfoVar, q8nVarB3);
                RetrofitMaker retrofitMakerM7 = em0Var4.M0();
                c8o.l(retrofitMakerM7);
                wui0 wui0Var = (wui0) retrofitMakerM7.createWebgateService(wui0.class, "android-merch-merchdataloader");
                q8n q8nVarB4 = em0Var4.b0();
                c8o.l(q8nVarB4);
                co9 co9Var3 = new co9(wui0Var, q8nVarB4);
                m900 m900Var2 = (m900) daqVar5.a.T1.get();
                c8o.l(m900Var2);
                Single singleD2 = nwpVar.D();
                q8n q8nVarB5 = em0Var4.b0();
                c8o.l(q8nVarB5);
                co9 co9Var4 = new co9(m900Var2, singleD2, q8nVarB5);
                l2r l2rVar = (gd0) daqVar5.Pq.get();
                c8o.l(l2rVar);
                l2r l2rVar2 = (iry) daqVar5.Qq.get();
                c8o.l(l2rVar2);
                l2r l2rVar3 = (csy) nwpVar.d.get();
                yko ykoVar = (yko) ((teq) em0Var4.c).w6.get();
                c8o.l(ykoVar);
                Flowable flowable4 = (Flowable) daqVar5.z2.get();
                c8o.l(flowable4);
                l2r l2rVarA = ykoVar.a((String) null, new ko9(flowable4, (lnm) null, (byte) 3));
                a9q a9qVar = (a9q) daqVar5.Rq.get();
                c8o.l(a9qVar);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                l2r l2rVarA2 = a9qVar.a(yon1.X2().toString());
                l2r l2rVar4 = (ztw0) daqVar5.Sq.get();
                c8o.l(l2rVar4);
                l2r l2rVarB = six0.b((six0) nwpVar.z.get(), yon1.X2(), 6);
                l2r l2rVar5 = (nlj1) daqVar5.Uq.get();
                c8o.l(l2rVar5);
                return new mvn0(new jv4((luk) nwpVar.g.get()), r2rVar, t380.w(co9Var, opmVar, gqmVarS, co9Var2, co9Var3, co9Var4, new l2r[]{l2rVar, l2rVar2, l2rVar3, l2rVarA, l2rVarA2, l2rVar4, l2rVarB, l2rVar5, (t701) nwpVar.y.get()}), (byte) 5);
            case BetamaxPlaybackSession.MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER /* 45 */:
                return cmo0.t;
            case BetamaxPlaybackSession.MEDIA_TYPE_FIELD_NUMBER /* 46 */:
                return new lv4((luk) nwpVar.g.get());
            case BetamaxPlaybackSession.MS_PLAYED_INTERNAL_FIELD_NUMBER /* 47 */:
                return new gvp(this, (byte) 0);
            case BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER /* 48 */:
                return new ovp(this);
            case BetamaxPlaybackSession.MS_PLAYED_PER_SURFACE_FIELD_NUMBER /* 49 */:
                return new xvp(this, (byte) 0);
            case BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER /* 50 */:
                i8h1 i8h1Var = (i8h1) ((daq) nwpVar.a.b).A5.get();
                c8o.l(i8h1Var);
                return i8h1Var;
            case 51:
                return new fwp(this, (byte) 0);
            case BetamaxPlaybackSession.DID_ATTEMPT_TO_PLAY_FIELD_NUMBER /* 52 */:
                return ((t8u0) nwpVar.m.get()).a(((f0i) ((dg30) nwpVar.e.get())).a);
            case BetamaxPlaybackSession.MS_PLAYED_AUDIBLE_FIELD_NUMBER /* 53 */:
                return new iwp(this, (byte) 0);
            case BetamaxPlaybackSession.PLAYBACK_ID_FIELD_NUMBER /* 54 */:
                return new j6d();
            case BetamaxPlaybackSession.PLAYER_ID_FIELD_NUMBER /* 55 */:
                return new jwp(this, (byte) 0);
            case BetamaxPlaybackSession.MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER /* 56 */:
                return new kwp(this, (byte) 0);
            case 57:
                return new q7m();
            case 58:
                return new lwp(this, b5);
            case 59:
                RetrofitMaker retrofitMakerM8 = nwpVar.a.M0();
                c8o.l(retrofitMakerM8);
                return fdb1.y(retrofitMakerM8);
            case 60:
                RetrofitMaker retrofitMakerM9 = nwpVar.a.M0();
                c8o.l(retrofitMakerM9);
                return s4a1.y(retrofitMakerM9);
            case 61:
                return new ay10();
            case 62:
                return new xw10();
            case 63:
                return new mwp(this, (byte) 0);
            case 64:
                return new yup(this, (byte) 0);
            case 65:
                return new zup(this, (byte) 0);
            case 66:
                return new rzo(this, (byte) 4);
            case 67:
                return new pz71(((Context) nwpVar.b.d).getApplicationContext());
            case 68:
                return new g9m(((Context) nwpVar.b.d).getApplicationContext());
            case 69:
                return new avp(this, b5);
            case 70:
                return new f2p(this, (byte) 2);
            case 71:
                return new bvp();
            case 72:
                return new cvp(this, (byte) 0);
            case 73:
                return new dvp(this, (byte) 0);
            case 74:
                return new evp(this, (byte) 0);
            case 75:
                return new fvp(this, (byte) 0);
            case 76:
                return new hvp(this, (byte) 0);
            case 77:
                return new ll30();
            case 78:
                return new rb4(false, false, false, (luk) nwpVar.g.get());
            case 79:
                return new ivp(this, (byte) 0);
            case 80:
                return new vf0((uq41) nwpVar.E0.get());
            case 81:
                return new uq41();
            case 82:
                return new rn4(false, (luk) nwpVar.g.get());
            case 83:
                return new jvp(this, (byte) 0);
            case 84:
                return new v03();
            case 85:
                return new kvp(this, b5);
            case com.spotify.metadata.classic.proto.Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                return new lvp(this, (byte) 0);
            case 87:
                return new wjp(this, (byte) 2);
            case com.spotify.metadata.classic.proto.Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                return new mvp(this, (byte) 0);
            case 89:
                yo2 yo2Var = (yo2) ((daq) nwpVar.a.b).tq.get();
                c8o.l(yo2Var);
                return yo2Var;
            case 90:
                return new hfp(this, b4);
            case 91:
                return new ifp((byte) 2);
            case 92:
                uu00 uu00VarP5 = nwpVar.a.P();
                c8o.l(uu00VarP5);
                return new s9b(uu00VarP5);
            case 93:
                return new nvp(this, (byte) 0);
            case 94:
                return new pvp(this, (byte) 0);
            case 95:
                return new jep(this, (byte) 1);
            case 96:
                return new kep(this, (byte) 1);
            case Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                return new qvp(this, (byte) 0);
            case 98:
                return iwv0.B((yqg) nwpVar.i.get());
            case 99:
                return new rvp(this, (byte) 0);
            default:
                jah.e(s);
                return null;
        }
    }

    public Object e() {
        wjq0 wjq0Var;
        hbp hbpVar = (hbp) this.c;
        short s = this.b;
        switch (s) {
            case 0:
                hbpVar.getClass();
                return j380.j("type.googleapis.com/spotify.watchfeed.component.item.v1.VerticalOnboardingComponent", new q5j1(), "type.googleapis.com/spotify.watchfeed.component.item.v1.AssociatedFeedsOnboardingComponent", new vg7(), "type.googleapis.com/spotify.watchfeed.component.item.v2.OnboardingComponentV2", new ibq0(hbpVar.d));
            case 1:
                hbpVar.getClass();
                h380 h380VarB = j380.b(58);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.AddToCollectionButtonComponent", hbpVar.l);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.AnimationHeaderBodyComponent", hbpVar.n);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v2.AssociatedTextsRowComponent", hbpVar.f28p);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.BadgeRowComponent", hbpVar.t);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v2.BoxedEntityRowComponentV2", hbpVar.x);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CallToActionEventsButtonComponent", hbpVar.z);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CallToActionNavigationButtonComponent", hbpVar.B);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CallToActionRowComponent", hbpVar.D);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CallToActionSheetButtonComponent", hbpVar.F);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.CanvasContent", hbpVar.J);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CommentsButtonComponent", hbpVar.L);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CreatorFollowRowComponent", hbpVar.N);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CreatorRowComponent", hbpVar.P);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.EntityShareButtonComponent", hbpVar.R);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.EpisodeContextMenuButtonComponent", hbpVar.T);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ExpandableDescriptionRowComponent", hbpVar.V);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ExplicitBadgeComponent", hbpVar.X);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v2.FeedHeaderComponent", hbpVar.Z);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.GenericContextMenuButtonComponent", hbpVar.b0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.HashtagCloudComponent", hbpVar.d0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.WatchFeedHashtagEndOfFeedLayout", hbpVar.g0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.HashtagRowComponent", hbpVar.i0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.ImageContent", hbpVar.k0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ImageHeaderBodyComponent", hbpVar.m0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ImageRowComponent", hbpVar.o0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.InFeedNavigationButtonComponent", hbpVar.r0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.LabeledAddToCollectionButtonComponent", hbpVar.t0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.LabeledShareButtonComponent", hbpVar.v0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.LinearGradientContent", hbpVar.x0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.LottieAnimationContent", hbpVar.z0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.MediaRowComponent", hbpVar.C0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v2.MuteButtonComponent", hbpVar.E0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.NavigationButtonComponent", hbpVar.G0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.NavigationHeaderBodyComponent", hbpVar.I0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.WatchFeedPivotingCarouselLayout", hbpVar.M0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.PivotingHeaderBodyComponent", hbpVar.O0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.PreReleaseCardComponent", hbpVar.Q0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ProgressBarComponent", hbpVar.S0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.ReadAlongContent", hbpVar.V0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.SingleColumnBottomSheetComponent", hbpVar.X0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.SnackbarMessageComponent", hbpVar.Z0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.StorytellingDefaultLayout", hbpVar.b1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.StyledTextRowComponent", hbpVar.d1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.SwipeUpHintRowComponent", hbpVar.f1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.TextHeaderBodyComponent", hbpVar.h1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.TrackContextMenuButtonComponent", hbpVar.j1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.TrackPreviewContent", hbpVar.l1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.TranscriptRowComponent", hbpVar.n1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.VideoContent", hbpVar.q1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.WatchFeedSurveyLayout", hbpVar.t1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.WatchFeedTwoColumnsLayout", hbpVar.v1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.Wrapped2025IntroOutroLayoutComponent", hbpVar.B1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.BottomBarComponent", hbpVar.H1);
                h380VarB.e("type.googleapis.com/spotify.wrapped.v1.WrappedLayout", hbpVar.N1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.WrappedHeaderBodyComponent", hbpVar.P1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.WrappedHeaderTrackPlaybackBodyComponent", hbpVar.R1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ChapterNavigationListButtonComponent", hbpVar.T1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.SimpleEntityRowComponent", hbpVar.V1);
                return new l6l1(h380VarB.b(true));
            case 2:
                return new yk1(hbpVar.k, (byte) 0);
            case 3:
                g7h g7hVarI = hbpVar.a.i();
                c8o.l(g7hVarI);
                d8u d8uVar = hbpVar.a;
                w4h w4hVarH = d8uVar.h();
                c8o.l(w4hVarH);
                ccc0 ccc0VarJ = d8uVar.J();
                c8o.l(ccc0VarJ);
                g7h g7hVarI2 = d8uVar.i();
                c8o.l(g7hVarI2);
                return new el1(g7hVarI, new s4w0(w4hVarH, ccc0VarJ, g7hVarI2), (bcl1) hbpVar.h.get(), brt.D(hbpVar.c), hbpVar.e(), hbpVar.a(), (hcl1) hbpVar.i.get(), (yp10) hbpVar.j.get());
            case 4:
                return new bcl1(u1n0.z(hbpVar.b), cwl1.H(hbpVar.b), (q9l1) hbpVar.g.get());
            case 5:
                abu abuVar = hbpVar.c;
                l0t l0tVar = (l0t) hbpVar.e.get();
                dfn0 dfn0Var = (dfn0) hbpVar.f.get();
                dma1 dma1VarG0 = hbpVar.a.g0();
                c8o.l(dma1VarG0);
                return new q9l1(abuVar, l0tVar, dfn0Var, new ke71(dma1VarG0));
            case 6:
                yqg yqgVarG = hbpVar.a.g();
                c8o.l(yqgVarG);
                return new l0t(yqgVarG);
            case 7:
                Activity activityB = hbpVar.a.b();
                c8o.l(activityB);
                return new dfn0(activityB);
            case 8:
                return new hcl1();
            case 9:
                return new yp10();
            case 10:
                return new yk1(hbpVar.m, (byte) 1);
            case 11:
                q9l1 q9l1Var = (q9l1) hbpVar.g.get();
                lzn0 lzn0VarQ = hbpVar.a.Q();
                c8o.l(lzn0VarQ);
                return new sd5(q9l1Var, lzn0VarQ, (bcl1) hbpVar.h.get());
            case 12:
                return new hh7(hbpVar.o);
            case 13:
                d8u d8uVar2 = hbpVar.a;
                xfx xfxVarU = d8uVar2.u();
                c8o.l(xfxVarU);
                Scheduler schedulerP = d8uVar2.P();
                c8o.l(schedulerP);
                return new jh7(new nfx(xfxVarU.c, schedulerP, (byte) 0), (bcl1) hbpVar.h.get());
            case 14:
                return new i2a((l6l1) hbpVar.q.get(), hbpVar.s, (byte) 0);
            case 15:
                return new j2a(hbpVar.d(), (byte) 0);
            case 16:
                return new x1i();
            case 17:
                return new n2c(hbpVar.w, (l6l1) hbpVar.q.get());
            case 18:
                cce cceVarD = hbpVar.d();
                d8u d8uVar3 = hbpVar.a;
                bcl1 bcl1Var = (bcl1) hbpVar.h.get();
                lzn0 lzn0VarQ2 = d8uVar3.Q();
                c8o.l(lzn0VarQ2);
                b7r0 b7r0VarS = d8uVar3.S();
                c8o.l(b7r0VarS);
                m0t m0tVar = (m0t) hbpVar.u.get();
                kt91 kt91VarH0 = d8uVar3.h0();
                c8o.l(kt91VarH0);
                e7p0 e7p0VarR = d8uVar3.R();
                c8o.l(e7p0VarR);
                t8u0 t8u0VarU = d8uVar3.U();
                c8o.l(t8u0VarU);
                return new p2c(cceVarD, bcl1Var, lzn0VarQ2, b7r0VarS, m0tVar, kt91VarH0, e7p0VarR, t8u0VarU.a(brt.w(hbpVar.b).getLifecycle()).d(), (yp10) hbpVar.j.get(), (j8m0) hbpVar.v.get(), hbpVar.a());
            case 19:
                Scheduler schedulerP2 = hbpVar.a.P();
                c8o.l(schedulerP2);
                return new m0t(schedulerP2);
            case 20:
                rwu0 rwu0VarV = hbpVar.a.V();
                c8o.l(rwu0VarV);
                return rwu0VarV.a(ddd1.P0, brt.w(hbpVar.b), new swu0(1, 200L));
            case 21:
                return new yk1(hbpVar.y, (byte) 2);
            case 22:
                bcl1 bcl1Var2 = (bcl1) hbpVar.h.get();
                lzn0 lzn0VarQ3 = hbpVar.a.Q();
                c8o.l(lzn0VarQ3);
                return new vxc(bcl1Var2, lzn0VarQ3);
            case 23:
                return new yk1(hbpVar.A, (byte) 3);
            case 24:
                lzn0 lzn0VarQ4 = hbpVar.a.Q();
                c8o.l(lzn0VarQ4);
                return new vxc(lzn0VarQ4, (bcl1) hbpVar.h.get());
            case 25:
                return new i2a((l6l1) hbpVar.q.get(), hbpVar.C, (byte) 1);
            case 26:
                return new j2a(hbpVar.d(), (byte) 1);
            case 27:
                return new i2a((byte) 2, (l6l1) hbpVar.q.get(), hbpVar.E);
            case 28:
                return new fyc((hcl1) hbpVar.i.get(), (bcl1) hbpVar.h.get(), (byte) 0);
            case 29:
                return new yk1(hbpVar.I, (byte) 4);
            case 30:
                pe peVarA = hbpVar.a.a();
                c8o.l(peVarA);
                b9l1 b9l1Var = (b9l1) hbpVar.G.get();
                q9l1 q9l1Var2 = (q9l1) hbpVar.g.get();
                wdm wdmVarI = hbpVar.i();
                q3c q3cVar = new q3c();
                m0t m0tVar2 = (m0t) hbpVar.u.get();
                t75 t75VarA = hbpVar.a();
                uwm0 uwm0VarJ = hbpVar.j();
                c2u0 c2u0VarT = hbpVar.a.T();
                c8o.l(c2u0VarT);
                return new qid(peVarA, b9l1Var, q9l1Var2, wdmVarI, q3cVar, m0tVar2, t75VarA, uwm0VarJ, c2u0VarT);
            case 31:
                return new b9l1(hbpVar.b);
            case 32:
                String contextUri = hbpVar.c.getContextUri();
                c8o.m(contextUri);
                abu abuVar2 = hbpVar.c;
                xau xauVar = abuVar2 instanceof xau ? (xau) abuVar2 : null;
                if (xauVar == null || (wjq0Var = xauVar.h) == null) {
                    wjq0Var = bbu.a;
                }
                c8o.m(wjq0Var);
                return new zbm1(contextUri, wjq0Var);
            case 33:
                return new yk1(hbpVar.K, (byte) 6);
            case 34:
                bcl1 bcl1Var3 = (bcl1) hbpVar.h.get();
                tmh tmhVarJ = hbpVar.a.j();
                c8o.l(tmhVarJ);
                return new mjh(bcl1Var3, tmhVarJ, brt.D(hbpVar.c));
            case 35:
                return new u0o(hbpVar.M);
            case 36:
                lzn0 lzn0VarQ5 = hbpVar.a.Q();
                c8o.l(lzn0VarQ5);
                return new w0o(lzn0VarQ5, (bcl1) hbpVar.h.get(), hbpVar.g(), (byte) 0);
            case 37:
                return new f3o(hbpVar.O, (l6l1) hbpVar.q.get());
            case 38:
                hcl1 hcl1Var = (hcl1) hbpVar.i.get();
                lzn0 lzn0VarQ6 = hbpVar.a.Q();
                c8o.l(lzn0VarQ6);
                return new sd5(hcl1Var, lzn0VarQ6, (bcl1) hbpVar.h.get(), hbpVar.g(), (byte) 1);
            case 39:
                return new yk1(hbpVar.Q, (byte) 7);
            case 40:
                bcl1 bcl1Var4 = (bcl1) hbpVar.h.get();
                xh71 xh71VarF0 = hbpVar.a.f0();
                c8o.l(xh71VarF0);
                return new yvy(bcl1Var4, xh71VarF0, (yp10) hbpVar.j.get());
            case 41:
                return new yk1(hbpVar.S, (byte) 8);
            case 42:
                abu abuVar3 = hbpVar.c;
                d8u d8uVar4 = hbpVar.a;
                lik1 lik1VarD = brt.D(abuVar3);
                a6z a6zVarV = d8uVar4.v();
                c8o.l(a6zVarV);
                bcl1 bcl1Var5 = (bcl1) hbpVar.h.get();
                i4q i4qVarR = d8uVar4.r();
                c8o.l(i4qVarR);
                return new yvy(lik1VarD, a6zVarV, bcl1Var5, i4qVarR);
            case 43:
                return new yk1(hbpVar.U, (byte) 9);
            case 44:
                return new oq00((bcl1) hbpVar.h.get());
            case BetamaxPlaybackSession.MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER /* 45 */:
                return new yk1(hbpVar.W, (byte) 10);
            case BetamaxPlaybackSession.MEDIA_TYPE_FIELD_NUMBER /* 46 */:
                return new nr00((byte) 0);
            case BetamaxPlaybackSession.MS_PLAYED_INTERNAL_FIELD_NUMBER /* 47 */:
                return new i2a((l6l1) hbpVar.q.get(), hbpVar.Y, (byte) 3);
            case BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER /* 48 */:
                return new wp10(hbpVar.d(), (q9l1) hbpVar.g.get(), (byte) 0);
            case BetamaxPlaybackSession.MS_PLAYED_PER_SURFACE_FIELD_NUMBER /* 49 */:
                return new yk1(hbpVar.a0, (byte) 11);
            case BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER /* 50 */:
                d8u d8uVar5 = hbpVar.a;
                abu abuVar4 = hbpVar.c;
                d8u d8uVar6 = hbpVar.a;
                oh41 oh41VarD0 = d8uVar5.d0();
                c8o.l(oh41VarD0);
                lzn0 lzn0VarQ7 = d8uVar6.Q();
                c8o.l(lzn0VarQ7);
                lik1 lik1VarD2 = brt.D(abuVar4);
                i4q i4qVarR2 = d8uVar6.r();
                c8o.l(i4qVarR2);
                oql oqlVar = new oql(lik1VarD2, i4qVarR2, (byte) 3);
                jl21 jl21VarX = d8uVar6.X();
                c8o.l(jl21VarX);
                return new sh40(oh41VarD0, lzn0VarQ7, oqlVar, jl21VarX, brt.D(abuVar4), (bcl1) hbpVar.h.get(), (byte) 0);
            case 51:
                return new yk1(hbpVar.c0, (byte) 12);
            case BetamaxPlaybackSession.DID_ATTEMPT_TO_PLAY_FIELD_NUMBER /* 52 */:
                lzn0 lzn0VarQ8 = hbpVar.a.Q();
                c8o.l(lzn0VarQ8);
                return new mjh(lzn0VarQ8, (hcl1) hbpVar.i.get(), (bcl1) hbpVar.h.get(), (byte) 1);
            case BetamaxPlaybackSession.MS_PLAYED_AUDIBLE_FIELD_NUMBER /* 53 */:
                return new i2a((l6l1) hbpVar.q.get(), hbpVar.f0, (byte) 7);
            case BetamaxPlaybackSession.PLAYBACK_ID_FIELD_NUMBER /* 54 */:
                return new fyc(hbpVar.d(), hbpVar.f(), (byte) 2);
            case BetamaxPlaybackSession.PLAYER_ID_FIELD_NUMBER /* 55 */:
                return new cbu();
            case BetamaxPlaybackSession.MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER /* 56 */:
                return new yk1(hbpVar.h0, (byte) 13);
            case 57:
                bcl1 bcl1Var6 = (bcl1) hbpVar.h.get();
                lzn0 lzn0VarQ9 = hbpVar.a.Q();
                c8o.l(lzn0VarQ9);
                return new qu50(bcl1Var6, lzn0VarQ9);
            case 58:
                return new yk1(hbpVar.j0, (byte) 14);
            case 59:
                wdm wdmVarI2 = hbpVar.i();
                yqg yqgVarG2 = hbpVar.a.g();
                c8o.l(yqgVarG2);
                return new fs70(wdmVarI2, new bf3(yqgVarG2), (byte) 0);
            case 60:
                return new yk1(hbpVar.l0, (byte) 15);
            case 61:
                q9l1 q9l1Var3 = (q9l1) hbpVar.g.get();
                lzn0 lzn0VarQ10 = hbpVar.a.Q();
                c8o.l(lzn0VarQ10);
                return new w0o(q9l1Var3, lzn0VarQ10, (bcl1) hbpVar.h.get());
            case 62:
                return new yk1(hbpVar.n0, (byte) 16);
            case 63:
                return new nr00((byte) 1);
            case 64:
                return new yk1(hbpVar.q0, (byte) 17);
            case 65:
                return new h680(hbpVar.n(), (bcl1) hbpVar.h.get(), (byte) 0);
            case 66:
                return new v7m0();
            case 67:
                return new yk1(hbpVar.s0, (byte) 18);
            case 68:
                lik1 lik1VarD3 = brt.D(hbpVar.c);
                bcl1 bcl1Var7 = (bcl1) hbpVar.h.get();
                g7h g7hVarI3 = hbpVar.a.i();
                c8o.l(g7hVarI3);
                return new sh40(lik1VarD3, bcl1Var7, g7hVarI3, hbpVar.e(), hbpVar.a(), (yp10) hbpVar.j.get());
            case 69:
                return new yk1(hbpVar.u0, (byte) 19);
            case 70:
                jly0 jly0Var = hbpVar.h;
                d8u d8uVar7 = hbpVar.a;
                bcl1 bcl1Var8 = (bcl1) jly0Var.get();
                xh71 xh71VarF1 = d8uVar7.f0();
                c8o.l(xh71VarF1);
                yp10 yp10Var = (yp10) hbpVar.j.get();
                Context contextQ = d8uVar7.q();
                c8o.l(contextQ);
                return new sd5(bcl1Var8, xh71VarF1, yp10Var, contextQ);
            case 71:
                return new yk1(hbpVar.w0, (byte) 20);
            case 72:
                wdm wdmVarI3 = hbpVar.i();
                yqg yqgVarG3 = hbpVar.a.g();
                c8o.l(yqgVarG3);
                return new fs70(wdmVarI3, new bf3(yqgVarG3), (byte) 1);
            case 73:
                return new yk1(hbpVar.y0, (byte) 21);
            case 74:
                wdm wdmVarI4 = hbpVar.i();
                yqg yqgVarG4 = hbpVar.a.g();
                c8o.l(yqgVarG4);
                return new fs70(wdmVarI4, new bf3(yqgVarG4), (byte) 2);
            case 75:
                return new yk1(hbpVar.B0, (byte) 22);
            case 76:
                return new cxh0(hbpVar.A0, new mka((byte) 16));
            case 77:
                Activity activityB2 = hbpVar.a.b();
                c8o.l(activityB2);
                gw70 gw70VarB = hbpVar.a.B();
                c8o.l(gw70VarB);
                return new fph0(activityB2, gw70VarB);
            case 78:
                return new yk1(hbpVar.D0, (byte) 23);
            case 79:
                fal1 fal1VarN0 = hbpVar.a.n0();
                c8o.l(fal1VarN0);
                return new h680(fal1VarN0, (bcl1) hbpVar.h.get(), (byte) 1);
            case 80:
                return new yk1(hbpVar.F0, (byte) 24);
            case 81:
                lzn0 lzn0VarQ11 = hbpVar.a.Q();
                c8o.l(lzn0VarQ11);
                return new qu50(lzn0VarQ11, (bcl1) hbpVar.h.get());
            case 82:
                return new yk1(hbpVar.H0, (byte) 25);
            case 83:
                lzn0 lzn0VarQ12 = hbpVar.a.Q();
                c8o.l(lzn0VarQ12);
                return new sd5(lzn0VarQ12, (bcl1) hbpVar.h.get(), (q9l1) hbpVar.g.get(), hbpVar.a());
            case 84:
                return new u9l1(hbpVar.L0, (l6l1) hbpVar.q.get());
            case 85:
                cce cceVarD2 = hbpVar.d();
                gbp gbpVar = hbpVar.K0;
                lzn0 lzn0VarQ13 = hbpVar.a.Q();
                c8o.l(lzn0VarQ13);
                return new x9l1(cceVarD2, gbpVar, lzn0VarQ13, new aod((bcl1) hbpVar.h.get(), u1n0.z(hbpVar.b), (byte) 3), hbpVar.f(), (hcl1) hbpVar.i.get());
            case com.spotify.metadata.classic.proto.Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                return new v3t0(hbpVar.J0);
            case 87:
                return new h4t0((b9l1) hbpVar.G.get());
            case com.spotify.metadata.classic.proto.Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                return new i2a((l6l1) hbpVar.q.get(), hbpVar.N0, (byte) 4);
            case 89:
                return new wp10(hbpVar.d(), (q9l1) hbpVar.g.get(), (byte) 1);
            case 90:
                return new yk1(hbpVar.P0, (byte) 26);
            case 91:
                d8u d8uVar8 = hbpVar.a;
                d8u d8uVar9 = hbpVar.a;
                xfx xfxVarU2 = d8uVar8.u();
                c8o.l(xfxVarU2);
                hjc hjcVar = new hjc(xfxVarU2.b, (byte) 26);
                oj3 oj3VarD = d8uVar9.d();
                c8o.l(oj3VarD);
                g7h g7hVarI4 = d8uVar9.i();
                c8o.l(g7hVarI4);
                lik1 lik1VarD4 = brt.D(hbpVar.c);
                bcl1 bcl1Var9 = (bcl1) hbpVar.h.get();
                lzn0 lzn0VarQ14 = d8uVar9.Q();
                c8o.l(lzn0VarQ14);
                bbm bbmVarP = d8uVar9.p();
                c8o.l(bbmVarP);
                abm abmVarO = d8uVar9.o();
                c8o.l(abmVarO);
                i8h1 i8h1VarZ = u1n0.z(hbpVar.b);
                o241 o241VarB0 = d8uVar9.b0();
                c8o.l(o241VarB0);
                uu00 uu00VarY = d8uVar9.y();
                c8o.l(uu00VarY);
                return new xhv0(hjcVar, oj3VarD, g7hVarI4, lik1VarD4, bcl1Var9, lzn0VarQ14, bbmVarP, abmVarO, i8h1VarZ, o241VarB0, uu00VarY, (yp10) hbpVar.j.get());
            case 92:
                return new yk1(hbpVar.R0, (byte) 27);
            case 93:
                return new mfx0((m0t) hbpVar.u.get());
            case 94:
                return new yk1(hbpVar.U0, (byte) 28);
            case 95:
                hbpVar.getClass();
                return new sd5(new zn90(new hwb((byte) 7), (byte) 1), hbpVar.i(), hbpVar.o(), new fza((byte) 11, false), (byte) 4);
            case 96:
                return new a780();
            case Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                return new i2a((l6l1) hbpVar.q.get(), hbpVar.W0, (byte) 5);
            case 98:
                return new j2a(hbpVar.d(), (byte) 2);
            case 99:
                return new cr91(hbpVar.Y0);
            default:
                jah.e(s);
                return null;
        }
    }

    public Object f() {
        wjq0 wjq0Var;
        mxp mxpVar = (mxp) this.c;
        short s = this.b;
        switch (s) {
            case 0:
                mxpVar.getClass();
                return j380.j("type.googleapis.com/spotify.watchfeed.component.item.v1.VerticalOnboardingComponent", new q5j1(), "type.googleapis.com/spotify.watchfeed.component.item.v1.AssociatedFeedsOnboardingComponent", new vg7(), "type.googleapis.com/spotify.watchfeed.component.item.v2.OnboardingComponentV2", new ibq0(mxpVar.d));
            case 1:
                mxpVar.getClass();
                h380 h380VarB = j380.b(58);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.AddToCollectionButtonComponent", mxpVar.l);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.AnimationHeaderBodyComponent", mxpVar.n);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v2.AssociatedTextsRowComponent", mxpVar.f53p);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.BadgeRowComponent", mxpVar.t);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v2.BoxedEntityRowComponentV2", mxpVar.x);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CallToActionEventsButtonComponent", mxpVar.z);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CallToActionNavigationButtonComponent", mxpVar.B);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CallToActionRowComponent", mxpVar.D);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CallToActionSheetButtonComponent", mxpVar.F);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.CanvasContent", mxpVar.J);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CommentsButtonComponent", mxpVar.L);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CreatorFollowRowComponent", mxpVar.N);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.CreatorRowComponent", mxpVar.P);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.EntityShareButtonComponent", mxpVar.R);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.EpisodeContextMenuButtonComponent", mxpVar.T);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ExpandableDescriptionRowComponent", mxpVar.V);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ExplicitBadgeComponent", mxpVar.X);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v2.FeedHeaderComponent", mxpVar.Z);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.GenericContextMenuButtonComponent", mxpVar.b0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.HashtagCloudComponent", mxpVar.d0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.WatchFeedHashtagEndOfFeedLayout", mxpVar.g0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.HashtagRowComponent", mxpVar.i0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.ImageContent", mxpVar.k0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ImageHeaderBodyComponent", mxpVar.m0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ImageRowComponent", mxpVar.o0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.InFeedNavigationButtonComponent", mxpVar.r0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.LabeledAddToCollectionButtonComponent", mxpVar.t0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.LabeledShareButtonComponent", mxpVar.v0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.LinearGradientContent", mxpVar.x0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.LottieAnimationContent", mxpVar.z0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.MediaRowComponent", mxpVar.C0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v2.MuteButtonComponent", mxpVar.E0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.NavigationButtonComponent", mxpVar.G0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.NavigationHeaderBodyComponent", mxpVar.I0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.WatchFeedPivotingCarouselLayout", mxpVar.M0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.PivotingHeaderBodyComponent", mxpVar.O0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.PreReleaseCardComponent", mxpVar.Q0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ProgressBarComponent", mxpVar.S0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.ReadAlongContent", mxpVar.V0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.SingleColumnBottomSheetComponent", mxpVar.X0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.SnackbarMessageComponent", mxpVar.Z0);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.StorytellingDefaultLayout", mxpVar.b1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.StyledTextRowComponent", mxpVar.d1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.SwipeUpHintRowComponent", mxpVar.f1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.TextHeaderBodyComponent", mxpVar.h1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.TrackContextMenuButtonComponent", mxpVar.j1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.TrackPreviewContent", mxpVar.l1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.TranscriptRowComponent", mxpVar.n1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.content.v1.VideoContent", mxpVar.q1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.WatchFeedSurveyLayout", mxpVar.t1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.WatchFeedTwoColumnsLayout", mxpVar.v1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.layout.v1.Wrapped2025IntroOutroLayoutComponent", mxpVar.B1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.BottomBarComponent", mxpVar.H1);
                h380VarB.e("type.googleapis.com/spotify.wrapped.v1.WrappedLayout", mxpVar.N1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.WrappedHeaderBodyComponent", mxpVar.P1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.WrappedHeaderTrackPlaybackBodyComponent", mxpVar.R1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.ChapterNavigationListButtonComponent", mxpVar.T1);
                h380VarB.e("type.googleapis.com/spotify.watchfeed.component.item.v1.SimpleEntityRowComponent", mxpVar.V1);
                return new l6l1(h380VarB.b(true));
            case 2:
                return new yk1(mxpVar.k, (byte) 0);
            case 3:
                g7h g7hVarI = mxpVar.a.i();
                c8o.l(g7hVarI);
                d8u d8uVar = mxpVar.a;
                w4h w4hVarH = d8uVar.h();
                c8o.l(w4hVarH);
                ccc0 ccc0VarJ = d8uVar.J();
                c8o.l(ccc0VarJ);
                g7h g7hVarI2 = d8uVar.i();
                c8o.l(g7hVarI2);
                return new el1(g7hVarI, new s4w0(w4hVarH, ccc0VarJ, g7hVarI2), (bcl1) mxpVar.h.get(), brt.D(mxpVar.c), mxpVar.e(), mxpVar.a(), (hcl1) mxpVar.i.get(), (yp10) mxpVar.j.get());
            case 4:
                return new bcl1(u1n0.z(mxpVar.b), cwl1.H(mxpVar.b), (q9l1) mxpVar.g.get());
            case 5:
                abu abuVar = mxpVar.c;
                l0t l0tVar = (l0t) mxpVar.e.get();
                dfn0 dfn0Var = (dfn0) mxpVar.f.get();
                dma1 dma1VarG0 = mxpVar.a.g0();
                c8o.l(dma1VarG0);
                return new q9l1(abuVar, l0tVar, dfn0Var, new ke71(dma1VarG0));
            case 6:
                yqg yqgVarG = mxpVar.a.g();
                c8o.l(yqgVarG);
                return new l0t(yqgVarG);
            case 7:
                Activity activityB = mxpVar.a.b();
                c8o.l(activityB);
                return new dfn0(activityB);
            case 8:
                return new hcl1();
            case 9:
                return new yp10();
            case 10:
                return new yk1(mxpVar.m, (byte) 1);
            case 11:
                q9l1 q9l1Var = (q9l1) mxpVar.g.get();
                lzn0 lzn0VarQ = mxpVar.a.Q();
                c8o.l(lzn0VarQ);
                return new sd5(q9l1Var, lzn0VarQ, (bcl1) mxpVar.h.get());
            case 12:
                return new hh7(mxpVar.o);
            case 13:
                d8u d8uVar2 = mxpVar.a;
                xfx xfxVarU = d8uVar2.u();
                c8o.l(xfxVarU);
                Scheduler schedulerP = d8uVar2.P();
                c8o.l(schedulerP);
                return new jh7(new nfx(xfxVarU.c, schedulerP, (byte) 0), (bcl1) mxpVar.h.get());
            case 14:
                return new i2a((l6l1) mxpVar.q.get(), mxpVar.s, (byte) 0);
            case 15:
                return new j2a(mxpVar.d(), (byte) 0);
            case 16:
                return new x1i();
            case 17:
                return new n2c(mxpVar.w, (l6l1) mxpVar.q.get());
            case 18:
                cce cceVarD = mxpVar.d();
                d8u d8uVar3 = mxpVar.a;
                bcl1 bcl1Var = (bcl1) mxpVar.h.get();
                lzn0 lzn0VarQ2 = d8uVar3.Q();
                c8o.l(lzn0VarQ2);
                b7r0 b7r0VarS = d8uVar3.S();
                c8o.l(b7r0VarS);
                m0t m0tVar = (m0t) mxpVar.u.get();
                kt91 kt91VarH0 = d8uVar3.h0();
                c8o.l(kt91VarH0);
                e7p0 e7p0VarR = d8uVar3.R();
                c8o.l(e7p0VarR);
                t8u0 t8u0VarU = d8uVar3.U();
                c8o.l(t8u0VarU);
                return new p2c(cceVarD, bcl1Var, lzn0VarQ2, b7r0VarS, m0tVar, kt91VarH0, e7p0VarR, t8u0VarU.a(brt.w(mxpVar.b).getLifecycle()).d(), (yp10) mxpVar.j.get(), (j8m0) mxpVar.v.get(), mxpVar.a());
            case 19:
                Scheduler schedulerP2 = mxpVar.a.P();
                c8o.l(schedulerP2);
                return new m0t(schedulerP2);
            case 20:
                rwu0 rwu0VarV = mxpVar.a.V();
                c8o.l(rwu0VarV);
                return rwu0VarV.a(ddd1.P0, brt.w(mxpVar.b), new swu0(1, 200L));
            case 21:
                return new yk1(mxpVar.y, (byte) 2);
            case 22:
                bcl1 bcl1Var2 = (bcl1) mxpVar.h.get();
                lzn0 lzn0VarQ3 = mxpVar.a.Q();
                c8o.l(lzn0VarQ3);
                return new vxc(bcl1Var2, lzn0VarQ3);
            case 23:
                return new yk1(mxpVar.A, (byte) 3);
            case 24:
                lzn0 lzn0VarQ4 = mxpVar.a.Q();
                c8o.l(lzn0VarQ4);
                return new vxc(lzn0VarQ4, (bcl1) mxpVar.h.get());
            case 25:
                return new i2a((l6l1) mxpVar.q.get(), mxpVar.C, (byte) 1);
            case 26:
                return new j2a(mxpVar.d(), (byte) 1);
            case 27:
                return new i2a((byte) 2, (l6l1) mxpVar.q.get(), mxpVar.E);
            case 28:
                return new fyc((hcl1) mxpVar.i.get(), (bcl1) mxpVar.h.get(), (byte) 0);
            case 29:
                return new yk1(mxpVar.I, (byte) 4);
            case 30:
                pe peVarA = mxpVar.a.a();
                c8o.l(peVarA);
                b9l1 b9l1Var = (b9l1) mxpVar.G.get();
                q9l1 q9l1Var2 = (q9l1) mxpVar.g.get();
                wdm wdmVarJ = mxpVar.j();
                q3c q3cVar = new q3c();
                m0t m0tVar2 = (m0t) mxpVar.u.get();
                t75 t75VarA = mxpVar.a();
                uwm0 uwm0VarK = mxpVar.k();
                c2u0 c2u0VarT = mxpVar.a.T();
                c8o.l(c2u0VarT);
                return new qid(peVarA, b9l1Var, q9l1Var2, wdmVarJ, q3cVar, m0tVar2, t75VarA, uwm0VarK, c2u0VarT);
            case 31:
                return new b9l1(mxpVar.b);
            case 32:
                String contextUri = mxpVar.c.getContextUri();
                c8o.m(contextUri);
                abu abuVar2 = mxpVar.c;
                xau xauVar = abuVar2 instanceof xau ? (xau) abuVar2 : null;
                if (xauVar == null || (wjq0Var = xauVar.h) == null) {
                    wjq0Var = bbu.a;
                }
                c8o.m(wjq0Var);
                return new zbm1(contextUri, wjq0Var);
            case 33:
                return new yk1(mxpVar.K, (byte) 6);
            case 34:
                bcl1 bcl1Var3 = (bcl1) mxpVar.h.get();
                tmh tmhVarJ = mxpVar.a.j();
                c8o.l(tmhVarJ);
                return new mjh(bcl1Var3, tmhVarJ, brt.D(mxpVar.c));
            case 35:
                return new u0o(mxpVar.M);
            case 36:
                lzn0 lzn0VarQ5 = mxpVar.a.Q();
                c8o.l(lzn0VarQ5);
                return new w0o(lzn0VarQ5, (bcl1) mxpVar.h.get(), mxpVar.h(), (byte) 0);
            case 37:
                return new f3o(mxpVar.O, (l6l1) mxpVar.q.get());
            case 38:
                hcl1 hcl1Var = (hcl1) mxpVar.i.get();
                lzn0 lzn0VarQ6 = mxpVar.a.Q();
                c8o.l(lzn0VarQ6);
                return new sd5(hcl1Var, lzn0VarQ6, (bcl1) mxpVar.h.get(), mxpVar.h(), (byte) 1);
            case 39:
                return new yk1(mxpVar.Q, (byte) 7);
            case 40:
                bcl1 bcl1Var4 = (bcl1) mxpVar.h.get();
                xh71 xh71VarF0 = mxpVar.a.f0();
                c8o.l(xh71VarF0);
                return new yvy(bcl1Var4, xh71VarF0, (yp10) mxpVar.j.get());
            case 41:
                return new yk1(mxpVar.S, (byte) 8);
            case 42:
                abu abuVar3 = mxpVar.c;
                d8u d8uVar4 = mxpVar.a;
                lik1 lik1VarD = brt.D(abuVar3);
                a6z a6zVarV = d8uVar4.v();
                c8o.l(a6zVarV);
                bcl1 bcl1Var5 = (bcl1) mxpVar.h.get();
                i4q i4qVarR = d8uVar4.r();
                c8o.l(i4qVarR);
                return new yvy(lik1VarD, a6zVarV, bcl1Var5, i4qVarR);
            case 43:
                return new yk1(mxpVar.U, (byte) 9);
            case 44:
                return new oq00((bcl1) mxpVar.h.get());
            case BetamaxPlaybackSession.MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER /* 45 */:
                return new yk1(mxpVar.W, (byte) 10);
            case BetamaxPlaybackSession.MEDIA_TYPE_FIELD_NUMBER /* 46 */:
                return new nr00((byte) 0);
            case BetamaxPlaybackSession.MS_PLAYED_INTERNAL_FIELD_NUMBER /* 47 */:
                return new i2a((l6l1) mxpVar.q.get(), mxpVar.Y, (byte) 3);
            case BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER /* 48 */:
                return new wp10(mxpVar.d(), (q9l1) mxpVar.g.get(), (byte) 0);
            case BetamaxPlaybackSession.MS_PLAYED_PER_SURFACE_FIELD_NUMBER /* 49 */:
                return new yk1(mxpVar.a0, (byte) 11);
            case BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER /* 50 */:
                d8u d8uVar5 = mxpVar.a;
                abu abuVar4 = mxpVar.c;
                d8u d8uVar6 = mxpVar.a;
                oh41 oh41VarD0 = d8uVar5.d0();
                c8o.l(oh41VarD0);
                lzn0 lzn0VarQ7 = d8uVar6.Q();
                c8o.l(lzn0VarQ7);
                lik1 lik1VarD2 = brt.D(abuVar4);
                i4q i4qVarR2 = d8uVar6.r();
                c8o.l(i4qVarR2);
                oql oqlVar = new oql(lik1VarD2, i4qVarR2, (byte) 3);
                jl21 jl21VarX = d8uVar6.X();
                c8o.l(jl21VarX);
                return new sh40(oh41VarD0, lzn0VarQ7, oqlVar, jl21VarX, brt.D(abuVar4), (bcl1) mxpVar.h.get(), (byte) 0);
            case 51:
                return new yk1(mxpVar.c0, (byte) 12);
            case BetamaxPlaybackSession.DID_ATTEMPT_TO_PLAY_FIELD_NUMBER /* 52 */:
                lzn0 lzn0VarQ8 = mxpVar.a.Q();
                c8o.l(lzn0VarQ8);
                return new mjh(lzn0VarQ8, (hcl1) mxpVar.i.get(), (bcl1) mxpVar.h.get(), (byte) 1);
            case BetamaxPlaybackSession.MS_PLAYED_AUDIBLE_FIELD_NUMBER /* 53 */:
                return new i2a((l6l1) mxpVar.q.get(), mxpVar.f0, (byte) 7);
            case BetamaxPlaybackSession.PLAYBACK_ID_FIELD_NUMBER /* 54 */:
                return new fyc(mxpVar.d(), mxpVar.g(), (byte) 2);
            case BetamaxPlaybackSession.PLAYER_ID_FIELD_NUMBER /* 55 */:
                return new cbu();
            case BetamaxPlaybackSession.MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER /* 56 */:
                return new yk1(mxpVar.h0, (byte) 13);
            case 57:
                bcl1 bcl1Var6 = (bcl1) mxpVar.h.get();
                lzn0 lzn0VarQ9 = mxpVar.a.Q();
                c8o.l(lzn0VarQ9);
                return new qu50(bcl1Var6, lzn0VarQ9);
            case 58:
                return new yk1(mxpVar.j0, (byte) 14);
            case 59:
                wdm wdmVarJ2 = mxpVar.j();
                yqg yqgVarG2 = mxpVar.a.g();
                c8o.l(yqgVarG2);
                return new fs70(wdmVarJ2, new bf3(yqgVarG2), (byte) 0);
            case 60:
                return new yk1(mxpVar.l0, (byte) 15);
            case 61:
                q9l1 q9l1Var3 = (q9l1) mxpVar.g.get();
                lzn0 lzn0VarQ10 = mxpVar.a.Q();
                c8o.l(lzn0VarQ10);
                return new w0o(q9l1Var3, lzn0VarQ10, (bcl1) mxpVar.h.get());
            case 62:
                return new yk1(mxpVar.n0, (byte) 16);
            case 63:
                return new nr00((byte) 1);
            case 64:
                return new yk1(mxpVar.q0, (byte) 17);
            case 65:
                return new h680(mxpVar.p(), (bcl1) mxpVar.h.get(), (byte) 0);
            case 66:
                return new v7m0();
            case 67:
                return new yk1(mxpVar.s0, (byte) 18);
            case 68:
                lik1 lik1VarD3 = brt.D(mxpVar.c);
                bcl1 bcl1Var7 = (bcl1) mxpVar.h.get();
                g7h g7hVarI3 = mxpVar.a.i();
                c8o.l(g7hVarI3);
                return new sh40(lik1VarD3, bcl1Var7, g7hVarI3, mxpVar.e(), mxpVar.a(), (yp10) mxpVar.j.get());
            case 69:
                return new yk1(mxpVar.u0, (byte) 19);
            case 70:
                jly0 jly0Var = mxpVar.h;
                d8u d8uVar7 = mxpVar.a;
                bcl1 bcl1Var8 = (bcl1) jly0Var.get();
                xh71 xh71VarF1 = d8uVar7.f0();
                c8o.l(xh71VarF1);
                yp10 yp10Var = (yp10) mxpVar.j.get();
                Context contextQ = d8uVar7.q();
                c8o.l(contextQ);
                return new sd5(bcl1Var8, xh71VarF1, yp10Var, contextQ);
            case 71:
                return new yk1(mxpVar.w0, (byte) 20);
            case 72:
                wdm wdmVarJ3 = mxpVar.j();
                yqg yqgVarG3 = mxpVar.a.g();
                c8o.l(yqgVarG3);
                return new fs70(wdmVarJ3, new bf3(yqgVarG3), (byte) 1);
            case 73:
                return new yk1(mxpVar.y0, (byte) 21);
            case 74:
                wdm wdmVarJ4 = mxpVar.j();
                yqg yqgVarG4 = mxpVar.a.g();
                c8o.l(yqgVarG4);
                return new fs70(wdmVarJ4, new bf3(yqgVarG4), (byte) 2);
            case 75:
                return new yk1(mxpVar.B0, (byte) 22);
            case 76:
                return new cxh0(mxpVar.A0, new mka((byte) 16));
            case 77:
                Activity activityB2 = mxpVar.a.b();
                c8o.l(activityB2);
                gw70 gw70VarB = mxpVar.a.B();
                c8o.l(gw70VarB);
                return new fph0(activityB2, gw70VarB);
            case 78:
                return new yk1(mxpVar.D0, (byte) 23);
            case 79:
                fal1 fal1VarN0 = mxpVar.a.n0();
                c8o.l(fal1VarN0);
                return new h680(fal1VarN0, (bcl1) mxpVar.h.get(), (byte) 1);
            case 80:
                return new yk1(mxpVar.F0, (byte) 24);
            case 81:
                lzn0 lzn0VarQ11 = mxpVar.a.Q();
                c8o.l(lzn0VarQ11);
                return new qu50(lzn0VarQ11, (bcl1) mxpVar.h.get());
            case 82:
                return new yk1(mxpVar.H0, (byte) 25);
            case 83:
                lzn0 lzn0VarQ12 = mxpVar.a.Q();
                c8o.l(lzn0VarQ12);
                return new sd5(lzn0VarQ12, (bcl1) mxpVar.h.get(), (q9l1) mxpVar.g.get(), mxpVar.a());
            case 84:
                return new u9l1(mxpVar.L0, (l6l1) mxpVar.q.get());
            case 85:
                cce cceVarD2 = mxpVar.d();
                gbp gbpVar = mxpVar.K0;
                lzn0 lzn0VarQ13 = mxpVar.a.Q();
                c8o.l(lzn0VarQ13);
                return new x9l1(cceVarD2, gbpVar, lzn0VarQ13, new aod((bcl1) mxpVar.h.get(), u1n0.z(mxpVar.b), (byte) 3), mxpVar.g(), (hcl1) mxpVar.i.get());
            case com.spotify.metadata.classic.proto.Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                return new v3t0(mxpVar.J0);
            case 87:
                return new h4t0((b9l1) mxpVar.G.get());
            case com.spotify.metadata.classic.proto.Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                return new i2a((l6l1) mxpVar.q.get(), mxpVar.N0, (byte) 4);
            case 89:
                return new wp10(mxpVar.d(), (q9l1) mxpVar.g.get(), (byte) 1);
            case 90:
                return new yk1(mxpVar.P0, (byte) 26);
            case 91:
                d8u d8uVar8 = mxpVar.a;
                d8u d8uVar9 = mxpVar.a;
                xfx xfxVarU2 = d8uVar8.u();
                c8o.l(xfxVarU2);
                hjc hjcVar = new hjc(xfxVarU2.b, (byte) 26);
                oj3 oj3VarD = d8uVar9.d();
                c8o.l(oj3VarD);
                g7h g7hVarI4 = d8uVar9.i();
                c8o.l(g7hVarI4);
                lik1 lik1VarD4 = brt.D(mxpVar.c);
                bcl1 bcl1Var9 = (bcl1) mxpVar.h.get();
                lzn0 lzn0VarQ14 = d8uVar9.Q();
                c8o.l(lzn0VarQ14);
                bbm bbmVarP = d8uVar9.p();
                c8o.l(bbmVarP);
                abm abmVarO = d8uVar9.o();
                c8o.l(abmVarO);
                i8h1 i8h1VarZ = u1n0.z(mxpVar.b);
                o241 o241VarB0 = d8uVar9.b0();
                c8o.l(o241VarB0);
                uu00 uu00VarY = d8uVar9.y();
                c8o.l(uu00VarY);
                return new xhv0(hjcVar, oj3VarD, g7hVarI4, lik1VarD4, bcl1Var9, lzn0VarQ14, bbmVarP, abmVarO, i8h1VarZ, o241VarB0, uu00VarY, (yp10) mxpVar.j.get());
            case 92:
                return new yk1(mxpVar.R0, (byte) 27);
            case 93:
                return new mfx0((m0t) mxpVar.u.get());
            case 94:
                return new yk1(mxpVar.U0, (byte) 28);
            case 95:
                mxpVar.getClass();
                return new sd5(new zn90(new hwb((byte) 7), (byte) 1), mxpVar.j(), mxpVar.q(), new fza((byte) 11, false), (byte) 4);
            case 96:
                return new a780();
            case Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                return new i2a((l6l1) mxpVar.q.get(), mxpVar.W0, (byte) 5);
            case 98:
                return new j2a(mxpVar.d(), (byte) 2);
            case 99:
                return new cr91(mxpVar.Y0);
            default:
                jah.e(s);
                return null;
        }
    }

    public Object g() {
        daq daqVar = (daq) this.c;
        byte b = 9;
        byte b2 = 10;
        byte b3 = 4;
        byte b4 = 8;
        byte b5 = 3;
        byte b6 = 5;
        byte b7 = 7;
        byte b8 = 28;
        byte b9 = 2;
        byte b10 = 17;
        byte b11 = 18;
        byte b12 = 1;
        byte b13 = 0;
        short s = this.b;
        switch (s) {
            case 0:
                hbq hbqVar = daqVar.a;
                hbqVar.getClass();
                h380 h380VarB = j380.b(Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER);
                h380VarB.e("com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity", hbqVar.b);
                h380VarB.e("com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity", hbqVar.c);
                h380VarB.e("com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity", hbqVar.d);
                daq daqVar2 = hbqVar.a;
                h380VarB.e("com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback", daqVar2.c);
                h380VarB.e("com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity", hbqVar.e);
                h380VarB.e("com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity", hbqVar.f);
                h380VarB.e("com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity", hbqVar.g);
                h380VarB.e("com.spotify.allboarding.allboardingimpl.AllboardingActivity", hbqVar.h);
                h380VarB.e("com.spotify.interapp.service.service.AppProtocolRemoteService", daqVar2.d);
                h380VarB.e("com.spotify.apprater.appraterdialog.AppRaterActivity", hbqVar.i);
                h380VarB.e("com.spotify.initialization.app.EarlyInitializationProvider", daqVar2.e);
                h380VarB.e("com.spotify.login.loginflowimpl.LoginActivity", hbqVar.j);
                h380VarB.e("com.spotify.login.loginflowimpl.DelegatingLoginActivity", daqVar2.f);
                h380VarB.e("com.spotify.login.loginflowimpl.QuickLoginActivity", hbqVar.k);
                h380VarB.e("com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity", hbqVar.l);
                h380VarB.e("com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity", hbqVar.m);
                h380VarB.e("com.spotify.blend.tastematch.BlendStoryContainerActivity", hbqVar.n);
                h380VarB.e("com.spotify.blend.tastematch.BlendTasteMatchActivity", hbqVar.o);
                h380VarB.e("com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver", daqVar2.g);
                h380VarB.e("com.spotify.adsdisplay.products.cmp.CMPActivity", hbqVar.p);
                h380VarB.e("com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity", hbqVar.q);
                h380VarB.e("p.k2l", daqVar2.h);
                h380VarB.e("com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService", daqVar2.i);
                h380VarB.e("com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity", hbqVar.r);
                h380VarB.e("com.spotify.storage.localstorage.DiskAlmostFullActivity", hbqVar.s);
                h380VarB.e("com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider", daqVar2.t);
                h380VarB.e("com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider", daqVar2.X);
                h380VarB.e("com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider", daqVar2.Y);
                h380VarB.e("com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider", daqVar2.Z);
                h380VarB.e("com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService", daqVar2.N0);
                h380VarB.e("com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService", daqVar2.O0);
                h380VarB.e("com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver", daqVar2.P0);
                h380VarB.e("com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver", daqVar2.Q0);
                h380VarB.e("com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity", hbqVar.t);
                h380VarB.e("com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity", hbqVar.u);
                h380VarB.e("com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService", daqVar2.R0);
                h380VarB.e("com.spotify.tap.go.service.GoBluetoothService", daqVar2.S0);
                h380VarB.e("com.spotify.gpb.googlecheckout.GoogleCheckoutActivity", hbqVar.v);
                h380VarB.e("com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity", hbqVar.w);
                h380VarB.e("com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider", daqVar2.T0);
                h380VarB.e("com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity", hbqVar.x);
                h380VarB.e("com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity", hbqVar.y);
                h380VarB.e("com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity", hbqVar.z);
                h380VarB.e("com.spotify.endless.sessionstarter.EndlessActivity", hbqVar.A);
                h380VarB.e("com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity", hbqVar.B);
                h380VarB.e("com.spotify.appauthorization.externallogin.LoginRedirectActivity", hbqVar.C);
                h380VarB.e("com.spotify.preload.logger.LoginTimeReporterWorker", daqVar2.U0);
                h380VarB.e("com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity", hbqVar.D);
                h380VarB.e("com.spotify.marquee.marquee.MarqueeActivity", hbqVar.E);
                h380VarB.e("com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver", daqVar2.V0);
                h380VarB.e("com.spotify.externalintegration.service.provider.MediaProvider", daqVar2.W0);
                h380VarB.e("com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsProvider", daqVar2.X0);
                h380VarB.e("com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity", hbqVar.F);
                h380VarB.e("com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity", hbqVar.G);
                h380VarB.e("com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity", hbqVar.H);
                h380VarB.e("p.fso0", daqVar2.Y0);
                h380VarB.e("com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity", hbqVar.I);
                h380VarB.e("com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver", daqVar2.Z0);
                h380VarB.e("com.spotify.collection.downloaded.service.OffliningService", daqVar2.a1);
                h380VarB.e("com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity", hbqVar.J);
                h380VarB.e("com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity", hbqVar.K);
                h380VarB.e("com.spotify.checkout.pageactivityproxy.PageActivityProxy", hbqVar.L);
                h380VarB.e("com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity", hbqVar.M);
                h380VarB.e("com.spotify.payment.callback.PaymentCallbackActivity", hbqVar.N);
                h380VarB.e("com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver", daqVar2.b1);
                h380VarB.e("com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity", hbqVar.O);
                h380VarB.e("com.spotify.wear.pinpairing.PinPairingActivity", hbqVar.P);
                h380VarB.e("com.spotify.widgets.npvwidget.PlaybackCommandHandlerService", daqVar2.c1);
                h380VarB.e("com.spotify.collection.contentimpl.played.PlayedStateService", daqVar2.d1);
                h380VarB.e("com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity", hbqVar.Q);
                h380VarB.e("com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity", hbqVar.R);
                h380VarB.e("com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity", hbqVar.S);
                h380VarB.e("com.spotify.widget.widgetpromo.PromoSuccessHandlerService", daqVar2.e1);
                h380VarB.e("com.spotify.radio.radio.formatlist.RadioFormatListService", daqVar2.f1);
                h380VarB.e("com.spotify.reporting.reportaction.ReportWebViewActivity", hbqVar.T);
                h380VarB.e("com.spotify.scannables.scannables.ScannablesActivity", hbqVar.U);
                h380VarB.e("com.spotify.scannables.scannables.view.ScannablesOnboardingActivity", hbqVar.V);
                h380VarB.e("com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker", daqVar2.g1);
                h380VarB.e("com.spotify.share.resultactivity.api.ShareResultActivity", daqVar2.h1);
                h380VarB.e("com.spotify.share.resultreceiver.api.ShareResultReceiver", daqVar2.i1);
                h380VarB.e("com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity", hbqVar.W);
                h380VarB.e("com.spotify.tap.spoton.SpotOnService", daqVar2.j1);
                h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver", daqVar2.k1);
                h380VarB.e("com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService", daqVar2.l1);
                h380VarB.e("com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity", hbqVar.X);
                h380VarB.e("com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService", daqVar2.m1);
                h380VarB.e("com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService", daqVar2.n1);
                h380VarB.e("com.spotify.widget.widget.widgetimpl.SpotifyWidget", daqVar2.o1);
                h380VarB.e("com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService", daqVar2.p1);
                h380VarB.e("com.spotify.carmobile.waze.WazeReturnActivity", hbqVar.Y);
                h380VarB.e("com.spotify.widget.widget.WidgetPickerService", daqVar2.q1);
                h380VarB.e("com.spotify.widgets.npvwidget.WidgetsProxyActivity", hbqVar.Z);
                h380VarB.e("com.spotify.carapplibrary.androidauto.AndroidAutoService", daqVar2.r1);
                h380VarB.e("com.spotify.appauthorization.sso.AuthorizationActivity", hbqVar.a0);
                h380VarB.e("com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity", hbqVar.b0);
                h380VarB.e("com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService", daqVar2.s1);
                h380VarB.e("com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService", daqVar2.t1);
                h380VarB.e("com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver", daqVar2.u1);
                h380VarB.e("com.spotify.xrprojected.ui.XrProjectedActivity", hbqVar.c0);
                h380VarB.e("com.spotify.nowplaying.musicinstallation.NowPlayingActivity", hbqVar.d0);
                h380VarB.e("com.spotify.music.SpotifyMainActivity", hbqVar.e0);
                h380VarB.e("com.spotify.tome.pageactivity.PageActivity", hbqVar.f0);
                return new jgu(h380VarB.b(true));
            case 1:
                return new xyp(daqVar, b13);
            case 2:
                return new xyp(daqVar, b12);
            case 3:
                return new xyp(daqVar, b9);
            case 4:
                return new xyp(daqVar, b5);
            case 5:
                return new a3q(daqVar, (byte) 26);
            case 6:
                return new xyp(daqVar, b3);
            case 7:
                return new xyp(daqVar, b6);
            case 8:
                return new xyp(daqVar, b4);
            case 9:
                return new a3q(daqVar, b4);
            case 10:
                return new v7q(daqVar, b2);
            case 11:
                return new xyp(daqVar, (byte) 15);
            case 12:
                return new a3q(daqVar, (byte) 16);
            case 13:
                return new xyp(daqVar, (byte) 11);
            case 14:
                return new xyp(daqVar, (byte) 12);
            case 15:
                return new r0q(daqVar, (byte) 0);
            case 16:
                return new xyp(daqVar, (byte) 16);
            case 17:
                return new xyp(daqVar, b11);
            case 18:
                return new xyp(daqVar, (byte) 20);
            case 19:
                return new xyp(daqVar, (byte) 27);
            case 20:
                return new xyp(daqVar, b8);
            case 21:
                return new a3q(daqVar, b12);
            case 22:
                return new a3q(daqVar, b5);
            case 23:
                return new a3q(daqVar, b3);
            case 24:
                return new a3q(daqVar, b6);
            case 25:
                return new a3q(daqVar, (byte) 6);
            case 26:
                return new xyp(daqVar, (byte) 24);
            case 27:
                return new a3q(daqVar, b7);
            case 28:
                return new a3q(daqVar, b);
            case 29:
                return new a3q(daqVar, (byte) 11);
            case 30:
                return new a3q(daqVar, (byte) 12);
            case 31:
                return new v7q(daqVar, (byte) 22);
            case 32:
                return new a3q(daqVar, b9);
            case 33:
                return new a3q(daqVar, b11);
            case 34:
                return new a3q(daqVar, (byte) 21);
            case 35:
                return new a3q(daqVar, (byte) 23);
            case 36:
                return new a3q(daqVar, (byte) 24);
            case 37:
                return new a3q(daqVar, (byte) 25);
            case 38:
                return new a3q(daqVar, (byte) 27);
            case 39:
                return new a3q(daqVar, b8);
            case 40:
                return new v7q(daqVar, b13);
            case 41:
                return new v7q(daqVar, b12);
            case 42:
                return new v7q(daqVar, b6);
            case 43:
                return new v7q(daqVar, (byte) 6);
            case 44:
                return new v7q(daqVar, b7);
            case BetamaxPlaybackSession.MS_BUFFERING_FORCED_LONGEST_FIELD_NUMBER /* 45 */:
                return new v7q(daqVar, (byte) 15);
            case BetamaxPlaybackSession.MEDIA_TYPE_FIELD_NUMBER /* 46 */:
                return new v7q(daqVar, (byte) 16);
            case BetamaxPlaybackSession.MS_PLAYED_INTERNAL_FIELD_NUMBER /* 47 */:
                return new v7q(daqVar, b10);
            case BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER /* 48 */:
                return new v7q(daqVar, (byte) 23);
            case BetamaxPlaybackSession.MS_PLAYED_PER_SURFACE_FIELD_NUMBER /* 49 */:
                return new v7q(daqVar, (byte) 26);
            case BetamaxPlaybackSession.KBYTES_FROM_CACHE_FIELD_NUMBER /* 50 */:
                return new pjq(daqVar, b3);
            case 51:
                return new pjq(daqVar, b7);
            case BetamaxPlaybackSession.DID_ATTEMPT_TO_PLAY_FIELD_NUMBER /* 52 */:
                return new xyp(daqVar, b);
            case BetamaxPlaybackSession.MS_PLAYED_AUDIBLE_FIELD_NUMBER /* 53 */:
                return new xyp(daqVar, b2);
            case BetamaxPlaybackSession.PLAYBACK_ID_FIELD_NUMBER /* 54 */:
                return new pjq(daqVar, b4);
            case BetamaxPlaybackSession.PLAYER_ID_FIELD_NUMBER /* 55 */:
                return new a3q(daqVar, (byte) 19);
            case BetamaxPlaybackSession.MS_PLAYED_NOMINAL_INTERNAL_FIELD_NUMBER /* 56 */:
                return new v7q(daqVar, b8);
            case 57:
                return new r0q(daqVar, (byte) 1);
            case 58:
                dsi0 dsi0Var = (dsi0) ((csp) daqVar.a.j0.get()).b.get();
                c8o.m(dsi0Var);
                return t380.t(dsi0Var, (dsi0) daqVar.gi.get());
            case 59:
                hbq hbqVar2 = daqVar.a;
                hbq hbqVar3 = daqVar.a;
                ec80 ec80Var = new ec80((i6a1) hbqVar2.a.mi.get());
                ynb0 ynb0VarA = xqu.a(hbqVar3.h0);
                daq daqVar3 = hbqVar3.a;
                t380 t380VarN = t380.n(5, new Object[]{new awh(new o94(false, (luk) daqVar3.L1.get()), ynb0VarA, (byte) 0), new bal((hb4) daqVar3.s3.get(), (q8n) daqVar3.E1.get(), xqu.a(daqVar3.W3)), new cxg((qg4) daqVar3.oi.get(), xqu.a(daqVar3.ni), (byte) 1), new awh(new h55(false, (luk) daqVar3.L1.get()), xqu.a(daqVar3.pi), (byte) 2), new cxg(daqVar3.m(), xqu.a(daqVar3.Y7), (byte) 0)});
                b291 b291Var = new b291(new awh(new nf4(false, (luk) hbqVar3.a.L1.get()), (p320) hbqVar3.i0.get(), (byte) 1));
                csp cspVar = new csp(ec80Var);
                Iterator it = t380VarN.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    jly0 jly0Var = cspVar.b;
                    if (!zHasNext) {
                        fo90 fo90VarT = t890.t(b291Var.d);
                        while (!fo90VarT.c) {
                            isi0 isi0Var = (isi0) fo90VarT.next();
                            hsi0 hsi0Var = (hsi0) jly0Var.get();
                            hsi0Var.getClass();
                            int iC = l1d.C(2);
                            if (iC == 0) {
                                hsi0Var.b.add(isi0Var);
                            } else {
                                if (iC != 1) {
                                    eg.o();
                                    return null;
                                }
                                hsi0Var.c.add(isi0Var);
                            }
                        }
                        return cspVar;
                    }
                    isi0 isi0Var2 = (isi0) it.next();
                    hsi0 hsi0Var2 = (hsi0) jly0Var.get();
                    hsi0Var2.getClass();
                    int iC2 = l1d.C(1);
                    if (iC2 == 0) {
                        hsi0Var2.b.add(isi0Var2);
                    } else {
                        if (iC2 != 1) {
                            eg.o();
                            return null;
                        }
                        hsi0Var2.c.add(isi0Var2);
                    }
                }
                break;
            case 60:
                return new e390();
            case 61:
                return new p320();
            case 62:
                hbq hbqVar4 = daqVar.a;
                hbq hbqVar5 = daqVar.a;
                oaq oaqVar = (oaq) hbqVar4.l0.get();
                zaq zaqVar = (zaq) hbqVar5.m0.get();
                abq abqVar = (abq) hbqVar5.p0.get();
                bbq bbqVar = (bbq) hbqVar5.q0.get();
                cbq cbqVar = (cbq) hbqVar5.r0.get();
                hqp hqpVar = (hqp) ((iqp) hbqVar5.a.f3.get()).c.get();
                c8o.m(hqpVar);
                return new z1n0(oaqVar, zaqVar, abqVar, bbqVar, cbqVar, hqpVar, (dbq) hbqVar5.N0.get(), (ebq) hbqVar5.O0.get(), (fbq) hbqVar5.P0.get(), (gbq) hbqVar5.Q0.get(), (eaq) hbqVar5.R0.get(), (faq) hbqVar5.S0.get(), (gaq) hbqVar5.T0.get(), (haq) hbqVar5.U0.get(), (iaq) hbqVar5.V0.get(), (jaq) hbqVar5.Z0.get(), (kaq) hbqVar5.a1.get(), (laq) hbqVar5.c1.get(), (maq) hbqVar5.d1.get());
            case 63:
                return new oaq(this);
            case 64:
                return new zaq(this);
            case 65:
                return new abq(this);
            case 66:
                return new iuz((vwm1) daqVar.k8.get(), (q8n) daqVar.r2.get());
            case 67:
                return gio1.b((Object) null);
            case 68:
                return new bbq(this);
            case 69:
                return new cbq(this);
            case 70:
                return new dbq(this);
            case 71:
                return new mbf((nfa0) daqVar.b2.get(), b12);
            case 72:
                return new mbf((nfa0) daqVar.b2.get(), b5);
            case 73:
                return new mbf((nfa0) daqVar.b2.get(), b13);
            case 74:
                return new mbf((nfa0) daqVar.b2.get(), b9);
            case 75:
                hbq hbqVar6 = daqVar.a;
                hbqVar6.getClass();
                h380 h380VarB2 = j380.b(7);
                h380VarB2.e(qto0.class, hbqVar6.D0);
                h380VarB2.e(rto0.class, hbqVar6.E0);
                h380VarB2.e(sto0.class, hbqVar6.F0);
                h380VarB2.e(tto0.class, hbqVar6.G0);
                h380VarB2.e(uto0.class, hbqVar6.H0);
                h380VarB2.e(vto0.class, hbqVar6.I0);
                h380VarB2.e(wto0.class, hbqVar6.J0);
                return new pwy0(h380VarB2.b(true));
            case 76:
                hbq hbqVar7 = daqVar.a;
                hbq hbqVar8 = daqVar.a;
                return new qbf(hbqVar7.h(), hbqVar8.u(), hbqVar8.A(), (Context) daqVar.x1.a, new nbc((byte) 1), (dfd) hbqVar8.C0.get(), new hvp0((uvy0) ((RetrofitMaker) hbqVar8.a.Y3.get()).createWebgateService(uvy0.class, "android-notifications-remotedatasource"), b8));
            case 77:
                return new cr70((Context) daqVar.x1.a, (yqg) daqVar.J1.get(), (vno0) daqVar.Ba.get(), new l7c((byte) 17), new rut0(daqVar.a.u(), b11), (byte) 3);
            case 78:
                return new cr70((Context) daqVar.x1.a, (yqg) daqVar.J1.get(), (vno0) daqVar.Ba.get(), new l7c((byte) 17), new rut0(daqVar.a.u(), b11), (byte) 1);
            case 79:
                jo80 jo80Var = daqVar.x1;
                hbq hbqVar9 = daqVar.a;
                return new vbf((Context) jo80Var.a, (yqg) daqVar.J1.get(), (vno0) daqVar.Ba.get(), new lb((Context) hbqVar9.a.x1.a), new l7c((byte) 17), new rut0(hbqVar9.u(), b11), (mvy0) hbqVar9.y0.get());
            case 80:
                return new mvy0((Context) daqVar.x1.a, (yqg) daqVar.J1.get(), daqVar.a.y());
            case 81:
                return new cr70((vno0) daqVar.Ba.get(), new l7c((byte) 17), (Context) daqVar.x1.a, (yqg) daqVar.J1.get(), new rut0(daqVar.a.u(), b11), (byte) 2);
            case 82:
                return new cr70((vno0) daqVar.Ba.get(), new l7c((byte) 17), (Context) daqVar.x1.a, (yqg) daqVar.J1.get(), new rut0(daqVar.a.u(), b11), (byte) 0);
            case 83:
                dfd dfdVar = (dfd) ((h4p) daqVar.Ee.get()).c.get();
                c8o.m(dfdVar);
                return dfdVar;
            case 84:
                return new wjg(daqVar.a.h(), daqVar.a.u(), (uz5) daqVar.Ne.get(), (ji5) daqVar.B6.get());
            case 85:
                return new ajs(daqVar.a.h(), daqVar.a.u());
            case com.spotify.metadata.classic.proto.Metadata$Episode.RSS_GUID_FIELD_NUMBER /* 86 */:
                hbq hbqVar10 = daqVar.a;
                hbq hbqVar11 = daqVar.a;
                return new kzy(hbqVar10.h(), hbqVar11.u(), hbqVar11.A(), (Context) daqVar.x1.a, new jxa((byte) 0));
            case 87:
                hbq hbqVar12 = daqVar.a;
                hbq hbqVar13 = daqVar.a;
                return new dy70(hbqVar12.h(), hbqVar13.u(), hbqVar13.A(), hbqVar13.y(), (mvy0) hbqVar13.y0.get());
            case com.spotify.metadata.classic.proto.Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                hbq hbqVar14 = daqVar.a;
                hbq hbqVar15 = daqVar.a;
                d520 d520VarH = hbqVar14.h();
                wmy wmyVarU = hbqVar15.u();
                daq daqVar4 = hbqVar15.a;
                b0a0 b0a0Var = (b0a0) daqVar4.bm.get();
                c9c0 c9c0Var = (c9c0) daqVar4.Ed.get();
                gw9 gw9Var = (gw9) ((uy90) daqVar4.hc.get()).m.get();
                c8o.m(gw9Var);
                return new g0a0(d520VarH, wmyVarU, new g2z(b0a0Var, c9c0Var, gw9Var, (Scheduler) daqVar4.A2.get(), (Observable) daqVar4.X1.get(), vp90.C((uy90) daqVar4.hc.get())), hbqVar15.A(), hbqVar15.y(), (mvy0) hbqVar15.y0.get());
            case 89:
                hbq hbqVar16 = daqVar.a;
                hbq hbqVar17 = daqVar.a;
                return new kzy(hbqVar16.h(), hbqVar17.u(), hbqVar17.A(), (Context) daqVar.x1.a);
            case 90:
                daq daqVar5 = daqVar.a.a;
                return new yuy0(t380.u(new xt90((Observable) daqVar5.X1.get(), b13), new w6c0((gx5) daqVar5.W1.get()), new xt90((fzm0) daqVar5.E6.get(), b12)));
            case 91:
                return new fto0(new gwy0((vno0) daqVar.Ba.get(), (rvy0) daqVar.Ca.get(), new cpr((t2j0) daqVar.f2.get())));
            case 92:
                return new ebq(this);
            case 93:
                return new fbq(this);
            case 94:
                return new gbq(this);
            case 95:
                return new eaq(this);
            case 96:
                return new faq(this);
            case Metadata$Episode.IS_PODCAST_SHORT_FIELD_NUMBER /* 97 */:
                return new gaq(this);
            case 98:
                return new haq(this);
            case 99:
                return new iaq(this);
            default:
                jah.e(s);
                return null;
        }
    }

    public final Object get() {
        g9l1 w0oVar;
        sh40 l8m1Var;
        boolean zD;
        Observable observableJust;
        Observable observableJust2;
        byte b = this.a;
        Object obj = this.c;
        short s = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                int i = s / 100;
                if (i == 0) {
                    return e();
                }
                if (i != 1) {
                    jah.e(s);
                    return null;
                }
                hbp hbpVar = (hbp) obj;
                switch (s) {
                    case 100:
                        Activity activityB = hbpVar.a.b();
                        c8o.l(activityB);
                        lzn0 lzn0VarQ = hbpVar.a.Q();
                        c8o.l(lzn0VarQ);
                        w0oVar = new w0o(activityB, lzn0VarQ, (bcl1) hbpVar.h.get());
                        return w0oVar;
                    case 101:
                        w0oVar = new i2a((l6l1) hbpVar.q.get(), hbpVar.a1, (byte) 6);
                        return w0oVar;
                    case Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER /* 102 */:
                        return new wbc1(hbpVar.d(), (q9l1) hbpVar.g.get(), hbpVar.f(), (hcl1) hbpVar.i.get(), hbpVar.a());
                    case 103:
                        gbp gbpVar = hbpVar.c1;
                        Activity activityB2 = hbpVar.a.b();
                        c8o.l(activityB2);
                        w0oVar = new i2a((byte) 10, activityB2, gbpVar);
                        return w0oVar;
                    case 104:
                        return new kkc1();
                    case 105:
                        w0oVar = new oad1(hbpVar.e1, (byte) 0);
                        return w0oVar;
                    case 106:
                        xfx xfxVarU = hbpVar.a.u();
                        c8o.l(xfxVarU);
                        w0oVar = new mfx0(new zfx(xfxVarU.c, (byte) 24));
                        return w0oVar;
                    case 107:
                        w0oVar = new oad1(hbpVar.g1, (byte) 1);
                        return w0oVar;
                    case 108:
                        q9l1 q9l1Var = (q9l1) hbpVar.g.get();
                        lzn0 lzn0VarQ2 = hbpVar.a.Q();
                        c8o.l(lzn0VarQ2);
                        w0oVar = new mjh(q9l1Var, lzn0VarQ2, (bcl1) hbpVar.h.get(), (byte) 2);
                        return w0oVar;
                    case 109:
                        w0oVar = new oad1(hbpVar.i1, (byte) 2);
                        return w0oVar;
                    case 110:
                        ssf1 ssf1VarL0 = hbpVar.a.l0();
                        c8o.l(ssf1VarL0);
                        w0oVar = new mjh(ssf1VarL0, (bcl1) hbpVar.h.get(), brt.D(hbpVar.c));
                        return w0oVar;
                    case 111:
                        w0oVar = new oad1(hbpVar.k1, (byte) 3);
                        return w0oVar;
                    case 112:
                        w0oVar = new w0o(hbpVar.i(), (m0t) hbpVar.u.get(), (hcl1) hbpVar.i.get(), (byte) 3);
                        return w0oVar;
                    case 113:
                        w0oVar = new oad1(hbpVar.m1, (byte) 4);
                        return w0oVar;
                    case 114:
                        xfx xfxVarU2 = hbpVar.a.u();
                        c8o.l(xfxVarU2);
                        w0oVar = new h680(new igx(xfxVarU2.c, (byte) 0), hbpVar.o(), new zn90(new hwb((byte) 7), (byte) 0));
                        return w0oVar;
                    case 115:
                        w0oVar = new oad1(hbpVar.p1, (byte) 5);
                        return w0oVar;
                    case 116:
                        jly0 jly0Var = hbpVar.G;
                        d8u d8uVar = hbpVar.a;
                        b9l1 b9l1Var = (b9l1) jly0Var.get();
                        tcl1 tcl1Var = (tcl1) hbpVar.o1.get();
                        fal1 fal1VarN0 = d8uVar.n0();
                        c8o.l(fal1VarN0);
                        m0t m0tVar = (m0t) hbpVar.u.get();
                        q9l1 q9l1Var2 = (q9l1) hbpVar.g.get();
                        cce cceVarD = hbpVar.d();
                        t75 t75VarA = hbpVar.a();
                        uwm0 uwm0VarJ = hbpVar.j();
                        c2u0 c2u0VarT = d8uVar.T();
                        c8o.l(c2u0VarT);
                        return new iij1(b9l1Var, tcl1Var, fal1VarN0, m0tVar, q9l1Var2, cceVarD, t75VarA, uwm0VarJ, c2u0VarT);
                    case 117:
                        w0oVar = new tcl1(hbpVar.b);
                        return w0oVar;
                    case 118:
                        w0oVar = new gbl1(hbpVar.s1, (l6l1) hbpVar.q.get());
                        return w0oVar;
                    case 119:
                        w0oVar = new sd5(hbpVar.d(), (l7d1) hbpVar.r1.get(), hbpVar.n(), (bcl1) hbpVar.h.get());
                        return w0oVar;
                    case 120:
                        return new l7d1();
                    case 121:
                        w0oVar = new i2a((l6l1) hbpVar.q.get(), hbpVar.u1, (byte) 8);
                        return w0oVar;
                    case 122:
                        return new vbl1(hbpVar.d(), (bcl1) hbpVar.h.get(), (hcl1) hbpVar.i.get(), hbpVar.f(), hbpVar.a(), (m0t) hbpVar.u.get());
                    case 123:
                        w0oVar = new i2a((byte) 9, (l6l1) hbpVar.q.get(), hbpVar.A1);
                        return w0oVar;
                    case 124:
                        kj31 kj31Var = (kj31) hbpVar.z1.get();
                        d8u d8uVar2 = hbpVar.a;
                        Context contextQ = d8uVar2.q();
                        c8o.l(contextQ);
                        w5b1 w5b1VarI0 = d8uVar2.i0();
                        c8o.l(w5b1VarI0);
                        w0oVar = new vbm1(kj31Var, new ti31(contextQ, w5b1VarI0), hbpVar.i(), (hcl1) hbpVar.i.get(), (m0t) hbpVar.u.get());
                        return w0oVar;
                    case 125:
                        return new abp(this, b2);
                    case 126:
                        return new zhq0((lks0) hbpVar.w1.get(), new j650(new b2k(new f32((byte) 0, false), new f32((byte) 2, false), new hhv0(), new f32((byte) 1, false))), (byte) 16).j();
                    case 127:
                        Context contextQ2 = hbpVar.a.q();
                        c8o.l(contextQ2);
                        w0oVar = new lks0(contextQ2, new bow());
                        return w0oVar;
                    case 128:
                        hj31 hj31VarZ = hbpVar.a.Z();
                        c8o.l(hj31VarZ);
                        return hj31VarZ;
                    case 129:
                        w0oVar = new mtb(hbpVar.G1);
                        return w0oVar;
                    case 130:
                        jly0 jly0Var2 = hbpVar.x1;
                        xgm1 xgm1Var = (xgm1) hbpVar.E1.get();
                        bcl1 bcl1Var = (bcl1) hbpVar.h.get();
                        q7r0 q7r0Var = hbpVar.b;
                        mub mubVar = new mub(bcl1Var, cwl1.H(q7r0Var), u1n0.z(q7r0Var));
                        zxl1 zxl1VarC = hbpVar.c();
                        lzn0 lzn0VarQ3 = hbpVar.a.Q();
                        c8o.l(lzn0VarQ3);
                        return new ttb(jly0Var2, xgm1Var, mubVar, zxl1VarC, lzn0VarQ3);
                    case 131:
                        d8u d8uVar3 = hbpVar.a;
                        q8n q8nVarE = d8uVar3.E();
                        c8o.l(q8nVarE);
                        qpj1 qpj1VarQ = hbpVar.q();
                        cik1 cik1VarP = hbpVar.p();
                        ohm1 ohm1VarO0 = d8uVar3.o0();
                        c8o.l(ohm1VarO0);
                        a aVarM = w290.m(qpj1VarQ, cik1VarP, ohm1VarO0, (g9l1) hbpVar.C1.get(), hbpVar.n());
                        tp41 tp41VarE0 = d8uVar3.e0();
                        c8o.l(tp41VarE0);
                        j810 j810VarZ = d8uVar3.z();
                        c8o.l(j810VarZ);
                        w0oVar = new ahm1(q8nVarE, aVarM, bol1.v(tp41VarE0, j810VarZ, new pl01(), new fk41()), (qfm1) hbpVar.D1.get());
                        return w0oVar;
                    case 132:
                        b9l1 b9l1Var2 = (b9l1) hbpVar.G.get();
                        fal1 fal1VarN1 = hbpVar.a.n0();
                        c8o.l(fal1VarN1);
                        w0oVar = new g9l1(b9l1Var2, fal1VarN1, (m0t) hbpVar.u.get(), brt.w(hbpVar.b), (q9l1) hbpVar.g.get(), hbpVar.j());
                        return w0oVar;
                    case 133:
                        return new qfm1();
                    case 134:
                        return new obm1((q9l1) hbpVar.g.get());
                    case 135:
                        return new e8m1((l6l1) hbpVar.q.get(), hbpVar.M1, (py7) hbpVar.I1.get());
                    case 136:
                        jly0 jly0Var3 = hbpVar.K1;
                        d8u d8uVar4 = hbpVar.a;
                        g4k g4kVar = (g4k) jly0Var3.get();
                        py7 py7Var = (py7) hbpVar.I1.get();
                        xgm1 xgm1Var2 = (xgm1) hbpVar.E1.get();
                        frl1 frl1Var = new frl1(hbpVar.q(), (byte) 3);
                        h2q0 h2q0Var = (h2q0) hbpVar.L1.get();
                        fal1 fal1VarN2 = d8uVar4.n0();
                        c8o.l(fal1VarN2);
                        m0t m0tVar2 = (m0t) hbpVar.u.get();
                        g9l1 g9l1Var = (g9l1) hbpVar.C1.get();
                        hcl1 hcl1Var = (hcl1) hbpVar.i.get();
                        cce cceVarD2 = hbpVar.d();
                        yqg yqgVarG = d8uVar4.g();
                        c8o.l(yqgVarG);
                        q9l1 q9l1Var3 = (q9l1) hbpVar.g.get();
                        luk lukVarW = d8uVar4.W();
                        c8o.l(lukVarW);
                        s84 s84Var = new s84(false, lukVarW);
                        bcl1 bcl1Var2 = (bcl1) hbpVar.h.get();
                        q7r0 q7r0Var2 = hbpVar.b;
                        l8m1Var = new l8m1(g4kVar, py7Var, xgm1Var2, frl1Var, h2q0Var, fal1VarN2, m0tVar2, g9l1Var, hcl1Var, cceVarD2, yqgVarG, q9l1Var3, s84Var, new tjz(bcl1Var2, cwl1.H(q7r0Var2), u1n0.z(q7r0Var2)), hbpVar.x1);
                        return l8m1Var;
                    case 137:
                        q8n q8nVarE2 = hbpVar.a.E();
                        c8o.l(q8nVarE2);
                        return new g4k(q8nVarE2, (a3k) hbpVar.J1.get());
                    case 138:
                        d8u d8uVar5 = hbpVar.a;
                        q7r0 q7r0Var3 = hbpVar.b;
                        Context contextQ3 = d8uVar5.q();
                        c8o.l(contextQ3);
                        gw70 gw70VarB = d8uVar5.B();
                        c8o.l(gw70VarB);
                        w5b1 w5b1VarI1 = d8uVar5.i0();
                        c8o.l(w5b1VarI1);
                        pe peVarA = d8uVar5.a();
                        c8o.l(peVarA);
                        tjs0 tjs0Var = (tjs0) hbpVar.x1.get();
                        woa woaVarF = d8uVar5.f();
                        c8o.l(woaVarF);
                        v290 v290VarJ0 = d8uVar5.j0();
                        c8o.l(v290VarJ0);
                        zxl1 zxl1VarC2 = hbpVar.c();
                        bih1 bih1VarN = hbpVar.n();
                        d8u d8uVar6 = hbpVar.a;
                        Context contextQ4 = d8uVar6.q();
                        c8o.l(contextQ4);
                        w5b1 w5b1VarI2 = d8uVar6.i0();
                        c8o.l(w5b1VarI2);
                        ti31 ti31Var = new ti31(contextQ4, w5b1VarI2);
                        kj31 kj31Var2 = (kj31) hbpVar.z1.get();
                        cik1 cik1VarP2 = hbpVar.p();
                        zle1 zle1VarK0 = d8uVar5.k0();
                        c8o.l(zle1VarK0);
                        qpj1 qpj1VarQ2 = hbpVar.q();
                        obm1 obm1Var = (obm1) hbpVar.F1.get();
                        xgm1 xgm1Var3 = (xgm1) hbpVar.E1.get();
                        ohm1 ohm1VarO1 = d8uVar5.o0();
                        c8o.l(ohm1VarO1);
                        py7 py7Var2 = (py7) hbpVar.I1.get();
                        njx0 njx0Var = new njx0((byte) 29);
                        RetrofitMaker retrofitMakerY = d8uVar5.Y();
                        c8o.l(retrofitMakerY);
                        tmd0 tmd0Var = (tmd0) retrofitMakerY.createWebgateService(tmd0.class, "android-campaigns-service-wrapped-endpoint");
                        bcl1 bcl1Var3 = (bcl1) hbpVar.h.get();
                        sme1 sme1Var = new sme1(bcl1Var3, cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                        ard1 ard1Var = new ard1((bcl1) hbpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                        vhd0 vhd0Var = new vhd0((bcl1) hbpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                        idm1 idm1Var = new idm1((bcl1) hbpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                        tjz tjzVar = new tjz((bcl1) hbpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                        ryc1 ryc1Var = new ryc1((bcl1) hbpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                        xf6 xf6Var = new xf6((bcl1) hbpVar.h.get(), cwl1.H(q7r0Var3), u1n0.z(q7r0Var3));
                        t2j0 t2j0VarW = d8uVar5.w();
                        c8o.l(t2j0VarW);
                        return bol1.w(contextQ3, gw70VarB, w5b1VarI1, peVarA, tjs0Var, woaVarF, v290VarJ0, zxl1VarC2, bih1VarN, ti31Var, kj31Var2, cik1VarP2, zle1VarK0, qpj1VarQ2, obm1Var, xgm1Var3, ohm1VarO1, py7Var2, njx0Var, tmd0Var, sme1Var, ard1Var, vhd0Var, idm1Var, tjzVar, ryc1Var, xf6Var, t2j0VarW);
                    case 139:
                        return new py7();
                    case 140:
                        return new h2q0();
                    case 141:
                        return new oad1(hbpVar.O1, (byte) 6);
                    case 142:
                        q9l1 q9l1Var4 = (q9l1) hbpVar.g.get();
                        g9l1 g9l1Var2 = (g9l1) hbpVar.C1.get();
                        xgm1 xgm1Var4 = (xgm1) hbpVar.E1.get();
                        bcl1 bcl1Var4 = (bcl1) hbpVar.h.get();
                        q7r0 q7r0Var4 = hbpVar.b;
                        l8m1Var = new sh40(q9l1Var4, g9l1Var2, xgm1Var4, new d08(bcl1Var4, cwl1.H(q7r0Var4), u1n0.z(q7r0Var4)), (m0t) hbpVar.u.get(), (hcl1) hbpVar.i.get(), (byte) 2);
                        return l8m1Var;
                    case 143:
                        return new jbm1(hbpVar.Q1);
                    case 144:
                        q9l1 q9l1Var5 = (q9l1) hbpVar.g.get();
                        g9l1 g9l1Var3 = (g9l1) hbpVar.C1.get();
                        xgm1 xgm1Var5 = (xgm1) hbpVar.E1.get();
                        jly0 jly0Var4 = hbpVar.x1;
                        hce1 hce1VarL = hbpVar.l();
                        bcl1 bcl1Var5 = (bcl1) hbpVar.h.get();
                        q7r0 q7r0Var5 = hbpVar.b;
                        return new lbm1(q9l1Var5, g9l1Var3, xgm1Var5, jly0Var4, hce1VarL, new d08(bcl1Var5, cwl1.H(q7r0Var5), u1n0.z(q7r0Var5)), (m0t) hbpVar.u.get(), (hcl1) hbpVar.i.get());
                    case 145:
                        return new yk1(hbpVar.S1, (byte) 5);
                    case 146:
                        return new fyc((bcl1) hbpVar.h.get(), hbpVar.n());
                    case 147:
                        return new yk1(hbpVar.U1, (byte) 29);
                    case 148:
                        return new nr00((byte) 2);
                    case 149:
                        yqg yqgVarG2 = hbpVar.a.g();
                        c8o.l(yqgVarG2);
                        return new lc31(yqgVarG2);
                    case 150:
                        return new bbp(this, (byte) 0);
                    case 151:
                        ark1 ark1VarM0 = hbpVar.a.m0();
                        c8o.l(ark1VarM0);
                        return ark1VarM0;
                    case 152:
                        d8u d8uVar7 = hbpVar.a;
                        dma1 dma1VarG0 = d8uVar7.g0();
                        c8o.l(dma1VarG0);
                        v75 v75VarB = hbpVar.b();
                        yqg yqgVarG3 = d8uVar7.g();
                        c8o.l(yqgVarG3);
                        vi11 vi11Var = new vi11(dma1VarG0, v75VarB, yqgVarG3);
                        v75 v75VarB2 = hbpVar.b();
                        yqg yqgVarG4 = hbpVar.a.g();
                        c8o.l(yqgVarG4);
                        return new kji1(vi11Var, v75VarB2, yqgVarG4);
                    case 153:
                        return new i4t0();
                    case 154:
                        qim1 qim1Var = new qim1(xqu.a(hbpVar.E1), xqu.a(hbpVar.K1), xqu.a(hbpVar.a2), xqu.a(hbpVar.y1));
                        d490 d490VarD = hbpVar.a.D();
                        c8o.l(d490VarD);
                        ynb0 ynb0VarA = xqu.a(hbpVar.b2);
                        qim1Var.g = new pim1(ynb0VarA, d490VarD);
                        qim1Var.h = new pim1(d490VarD, ynb0VarA);
                        qim1Var.i = new dl3(ynb0VarA, (byte) 7);
                        return qim1Var;
                    case 155:
                        lzn0 lzn0VarQ4 = hbpVar.a.Q();
                        c8o.l(lzn0VarQ4);
                        return new bcm1(lzn0VarQ4, hbpVar.q(), (h2q0) hbpVar.L1.get());
                    case 156:
                        xgm1 xgm1Var6 = (xgm1) hbpVar.E1.get();
                        g9l1 g9l1Var4 = (g9l1) hbpVar.C1.get();
                        j810 j810VarZ2 = hbpVar.a.z();
                        c8o.l(j810VarZ2);
                        return new rim1(xgm1Var6, g9l1Var4, j810VarZ2);
                    case 157:
                        return Boolean.valueOf(hbpVar.a.s());
                    case 158:
                        return new cbp(this, (byte) 0);
                    case 159:
                        return new dbp(this, (byte) 0);
                    case 160:
                        return new ebp(this, (byte) 0);
                    case 161:
                        return new fbp(this, (byte) 0);
                    case 162:
                        yqg yqgVarG5 = hbpVar.a.g();
                        c8o.l(yqgVarG5);
                        return new n2u0(yqgVarG5);
                    case 163:
                        return new fq10();
                    case 164:
                        y390 y390VarX = hbpVar.a.x();
                        c8o.l(y390VarX);
                        return new n8l1(y390VarX.a(brt.w(hbpVar.b), r6h1.c));
                    case 165:
                        return new r9l1(hbpVar.c, hbpVar.h());
                    default:
                        jah.e(s);
                        return null;
                }
            case 1:
                return b();
            case 2:
                return c();
            default:
                int i2 = s / 100;
                if (i2 == 0) {
                    return g();
                }
                if (i2 == 1) {
                    return h();
                }
                if (i2 == 2) {
                    return i();
                }
                if (i2 != 3) {
                    jah.e(s);
                    return null;
                }
                daq daqVar = (daq) obj;
                switch (s) {
                    case 300:
                        return new ivo0(daqVar.A5, new pdl0((byte) 0));
                    case 301:
                        return new f0b0((g0b0) ((RetrofitMaker) ((kly0) ((ejp) daqVar.a.m1.get()).a.X).get()).createWebgateService(g0b0.class, "android-genalpha-graduationimpl"));
                    case 302:
                        PublishSubject publishSubject = za50.a;
                        c8o.m(publishSubject);
                        return publishSubject;
                    case 303:
                        lxg lxgVar = (lxg) daqVar.D1.get();
                        hhp0 hhp0Var = hhp0.a;
                        return new wo60(lxgVar);
                    case 304:
                        return new k3q0((h3q0) ((RetrofitMaker) daqVar.a.a.Y3.get()).createWebgateService(h3q0.class, "android-system-home"), (n3q0) daqVar.z9.get(), (t2j0) daqVar.f2.get());
                    case 305:
                        return new yxd1();
                    case 306:
                        return new kpd1((gw70) daqVar.d8.get());
                    case 307:
                        return new uyd1();
                    case 308:
                        zD = daqVar.a.e().d();
                        break;
                    case 309:
                        bk4 bk4VarE = daqVar.a.e();
                        if (bk4VarE.k != null) {
                            observableJust = ((Observable) bk4VarE.m.getValue()).map(u321.h).distinctUntilChanged();
                            observableJust.getClass();
                        } else {
                            observableJust = Observable.just(Boolean.FALSE);
                            observableJust.getClass();
                        }
                        return yoi1.g(observableJust);
                    case 310:
                        zs61 zs61VarB = daqVar.a.B();
                        if (zs61VarB.d != null) {
                            observableJust2 = ((Observable) zs61VarB.f.getValue()).map(jcx0.X).distinctUntilChanged();
                            observableJust2.getClass();
                        } else {
                            observableJust2 = Observable.just(Boolean.FALSE);
                            observableJust2.getClass();
                        }
                        return yoi1.g(observableJust2);
                    case 311:
                        zD = daqVar.f().e();
                        break;
                    case 312:
                        return new eal(daqVar.K().d);
                    case 313:
                        Intent intent = new Intent((Context) daqVar.a.a.x1.a, (Class<?>) PartnerAccountLinkingActivity.class);
                        a741 a741Var = new a741();
                        a741Var.a = intent;
                        return a741Var;
                    case 314:
                        Context context = (Context) daqVar.x1.a;
                        l8s l8sVar = (l8s) daqVar.I6.get();
                        hbq hbqVar = daqVar.a;
                        hbqVar.getClass();
                        daq daqVar2 = hbqVar.a;
                        return new au8(context, l8sVar, new du8((dma1) daqVar2.C5.get(), new fy4(1, (luk) daqVar2.L1.get())));
                    case 315:
                        zbo0 zbo0Var = new zbo0();
                        gio1.b((Object) null);
                        return zbo0Var;
                    case 316:
                        return new vn41((xm41) daqVar.a.d5.get(), (Scheduler) daqVar.z1.get());
                    case 317:
                        xm41 xm41Var = (xm41) daqVar.l5.get();
                        dn41 dn41VarQ1 = daqVar.Q1();
                        ni61 ni61Var = (ni61) daqVar.a.c5.get();
                        ym41 ym41Var = new ym41("NavigationSessionLifetime");
                        ym41Var.a = dn41VarQ1;
                        jge jgeVarE = hu20.e(eqr0.m(xm41Var), new ms4((lnm) null, new hf31(new u841(ni61Var, (byte) 17), ym41Var, (byte) 17), (byte) 9));
                        AtomicInteger atomicInteger = ym41.c;
                        return hwb.u("NavigationSessionLifetime", jgeVarE, Collections.singleton(xm41Var), ym41Var.b, ym41Var.a);
                    case 318:
                        return new ni61((y2g0) daqVar.H2.get());
                    case 319:
                        return new hf4(true, true, (luk) daqVar.L1.get());
                    case 320:
                        bv8 bv8Var = (bv8) daqVar.u().j.get();
                        c8o.m(bv8Var);
                        return bv8Var;
                    case 321:
                        return new zzr0();
                    case 322:
                        zD = daqVar.f().h();
                        break;
                    case 323:
                        daq daqVar3 = daqVar.a.a;
                        return new wap(new mxr((cxc) daqVar3.O5.get(), (i8b0) daqVar3.X3.get(), (yqg) daqVar3.J1.get(), (mr20) daqVar3.cc.get()));
                    case 324:
                        return new y7r();
                    case 325:
                        return new h350((Context) daqVar.x1.a, new ouz((kt91) daqVar.a.a.f8.get(), (byte) 10));
                    case 326:
                        yqg yqgVar = (yqg) daqVar.J1.get();
                        k2i k2iVar = (k2i) daqVar.a.m5.get();
                        i8h1 i8h1Var = (i8h1) daqVar.A5.get();
                        py9 py9VarG = qid0.g();
                        qid0.h();
                        return new q350(yqgVar, k2iVar, new yrd0(i8h1Var, py9VarG, qid0.i()));
                    case 327:
                        return new k2i((y6a) daqVar.oj.get());
                    case 328:
                        return new v680();
                    case 329:
                        return new f8r();
                    case 330:
                        zD = daqVar.f().a();
                        break;
                    case 331:
                        return new ard();
                    case 332:
                        hbq hbqVar2 = daqVar.a;
                        return new lfz0((mfz0) ((RetrofitMaker) hbqVar2.a.Y3.get()).createWebgateService(mfz0.class, "android-quickplay-impl-quickplay"), (gfz0) ((RetrofitMaker) hbqVar2.a.Y3.get()).createWebgateService(gfz0.class, "android-quickplay-impl-quickplay"), new io4(ho4.b, (luk) hbqVar2.a.L1.get()));
                    case 333:
                        return new dh91((fvc1) daqVar.Id.get(), xqu.a(daqVar.Cq), new fd4(0, (luk) daqVar.a.a.L1.get()), (q8n) daqVar.V2.get());
                    case 334:
                        return new jur((g0l) daqVar.E5.get(), (zor) daqVar.V6.get());
                    case 335:
                        jly0 jly0Var5 = daqVar.Id;
                        hbq hbqVar3 = daqVar.a;
                        fvc1 fvc1Var = (fvc1) jly0Var5.get();
                        l8s l8sVar2 = (l8s) daqVar.I6.get();
                        jly0 jly0Var6 = hbqVar3.u5;
                        daq daqVar4 = hbqVar3.a;
                        jur jurVar = (jur) jly0Var6.get();
                        e831 e831Var = (e831) daqVar.gc.get();
                        zwa zwaVar = new zwa(new j0q(daqVar4), (byte) 2);
                        ed4 ed4Var = new ed4(false, (luk) daqVar4.L1.get());
                        r6h1 r6h1Var = r6h1.c;
                        return new oxb(fvc1Var, l8sVar2, jurVar, e831Var, new tla(zwaVar, (byte) 19), ed4Var, new jut(new yok0((byte) 13), (i8h1) daqVar4.A5.get(), (byte) 0), new mwb((t2j0) daqVar4.f2.get()));
                    case 336:
                        return new prg1((yqg) daqVar.J1.get(), ((Boolean) daqVar.W2.get()).booleanValue());
                    case 337:
                        return new hz40();
                    case 338:
                        return new jt4();
                    case 339:
                        return new c5j1();
                    case 340:
                        hbq hbqVar4 = daqVar.a;
                        hbqVar4.getClass();
                        daq daqVar5 = hbqVar4.a;
                        return new k4j1((ajg) daqVar5.a2.get(), (dma1) daqVar5.C1.get(), new oj80((cxc) daqVar5.O5.get(), (i8b0) daqVar5.X3.get(), (byte) 2), hbqVar4.A5, (nfa0) daqVar5.b2.get());
                    case 341:
                        return daqVar.a.d().a();
                    case 342:
                        dpa dpaVar = (dpa) ((gkp) daqVar.V8.get()).l.get();
                        c8o.m(dpaVar);
                        return dpaVar;
                    case 343:
                        w88 w88Var = ((stp) daqVar.a.E5.get()).a;
                        h84 h84Var = (h84) w88Var.d.get();
                        e831 e831Var2 = (e831) w88Var.e.get();
                        v2o0 v2o0Var = (v2o0) w88Var.f.get();
                        return new a1o0(new poj0(h84Var, e831Var2, new ux70(v2o0Var, (byte) 19), (m1o0) w88Var.g.get(), (byte) 11), new drj0((q1o0) w88Var.h.get(), (d3o0) w88Var.i.get(), (byte) 10), (v4o0) w88Var.c.get(), (Context) w88Var.a.get(), (q8n) w88Var.b.get());
                    case 344:
                        hbq hbqVar5 = daqVar.a;
                        daq daqVar6 = hbqVar5.a;
                        return new stp(new w88(daqVar6.x1, daqVar6.E1, daqVar6.je, daqVar6.B2, daqVar6.gc, hbqVar5.D5, hbqVar5.w1, daqVar6.ht, daqVar6.E2));
                    case 345:
                        return new v2o0(new d0q(daqVar));
                    case 346:
                        sr90 sr90Var = ((mkp) daqVar.ie.get()).c;
                        return new my9(new yfg((gwy0) sr90Var.b.get(), sr90Var.b()), (byte) 1);
                    case 347:
                        return new eso0();
                    case 348:
                        return new n0x0(new vqv0((j810) daqVar.a.a.En.get()), (www0) daqVar.ac.get(), (q8n) daqVar.E1.get());
                    case 349:
                        return new azi1((y6a) daqVar.oj.get(), (i8h1) daqVar.A5.get(), new pt4(false, (luk) daqVar.a.a.L1.get()));
                    case 350:
                        zD = new au4((luk) daqVar.L1.get()).c();
                        break;
                    case 351:
                        return new lfl1((d341) daqVar.Wi.get(), (sfl1) daqVar.Vi.get(), (y6a) daqVar.oj.get(), daqVar.l2(), new qfl1((Context) daqVar.a.a.x1.a), (bxn0) daqVar.Ko.get(), new t8r0((Context) daqVar.x1.a, (ut71) daqVar.g2.get()));
                    case 352:
                        hbq hbqVar6 = daqVar.a;
                        daq daqVar7 = hbqVar6.a;
                        ilh1 ilh1Var = new ilh1(daqVar7.l2(), (bxn0) daqVar7.Ko.get(), (byte) 25);
                        y6a y6aVar = (y6a) daqVar.oj.get();
                        daq daqVar8 = hbqVar6.a;
                        vi11 vi11Var2 = new vi11((d341) daqVar8.Wi.get(), (Scheduler) daqVar8.z1.get(), (bxn0) daqVar8.Ko.get());
                        daq daqVar9 = hbqVar6.a;
                        return new fe0(new ge0(), y6aVar, ilh1Var, vi11Var2, new bih1((d341) daqVar9.Wi.get(), (bxn0) daqVar9.Ko.get(), (byte) 23));
                    case 353:
                        zD = new sg4(false, false, false, (luk) daqVar.a.a.L1.get()).a();
                        break;
                    case 354:
                        mr20 mr20Var = (mr20) daqVar.K().h.get();
                        c8o.m(mr20Var);
                        return mr20Var;
                    case 355:
                        return eth.X((xm41) daqVar.s4.get()).filter(b4x0.f).map(c4x0.g);
                    case 356:
                        return eth.X((xm41) daqVar.V4.get()).filter(e4x0.g).map(f4x0.e);
                    case 357:
                        zD = daqVar.k().a();
                        break;
                    case 358:
                        return ((ekp) daqVar.Y8.get()).a(new File(((Context) daqVar.x1.a).getCacheDir(), "story-preview-video-cache"), 10000000L);
                    case 359:
                        hce1 hce1Var = ((ouq) ((wpq) daqVar.Ud.get()).k.get()).a;
                        return new p771((Context) ((nxo) hce1Var.b).get(), new a1g1((g420) ((nxo) hce1Var.e).get(), (byte) 0));
                    case 360:
                        return new w13((xrc0) ((eyo) daqVar.a.T5.get()).a.a.get());
                    case 361:
                        return new eyo(new u13(daqVar.a.a.f5));
                    case 362:
                        return new lhc((byte) 19);
                    case 363:
                        return new etf1((zmj0) daqVar.X4.get(), (lv00) daqVar.c5.get());
                    case 364:
                        e4p e4pVar = (e4p) ((f4p) daqVar.In.get()).b.get();
                        c8o.m(e4pVar);
                        return e4pVar;
                    default:
                        jah.e(s);
                        return null;
                }
                return Boolean.valueOf(zD);
        }
    }

    public Object h() {
        x1r x1rVar;
        daq daqVar = (daq) this.c;
        short s = this.b;
        switch (s) {
            case 100:
                return new jaq(this);
            case 101:
                return new ik7((ll7) daqVar.a.W0.get(), (el7) daqVar.a.X0.get());
            case Metadata$Episode.EPISODE_CONTENT_RATING_FIELD_NUMBER /* 102 */:
                return (ll7) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(ll7.class, "android-bluejay-data-impl");
            case 103:
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar.Y3.get();
                k370 k370Var = new k370();
                k370Var.f((l370) null, "http://localhost/");
                return (el7) retrofitMaker.createCustomHostService(el7.class, k370Var.b());
            case 104:
                return new kaq(this);
            case 105:
                return new laq(this);
            case 106:
                return new ihq0((Context) daqVar.x1.a, daqVar.n(), (u4q0) daqVar.em.get(), (k4q0) daqVar.ml.get(), (hrg1) daqVar.dm.get(), (yqg) daqVar.J1.get());
            case 107:
                return new maq(this);
            case 108:
                return new udh1((Context) daqVar.x1.a, (oo70) daqVar.M2.get());
            case 109:
                return new avw0((byte) 15);
            case 110:
                return new nxf0((ohv0) daqVar.U5.get());
            case 111:
                return new w0g((d2b0) ((RetrofitMaker) daqVar.a.a.Y3.get()).createWebgateService(d2b0.class, "android-genalphaauthentication-datasourceimpl"), (x2g1) daqVar.j2.get());
            case 112:
                return new dwr0((g8h1) daqVar.im.get(), (z6r0) daqVar.jm.get());
            case 113:
                return eth.X((xm41) daqVar.V4.get()).firstOrError().map(new x6o0((mya1) daqVar.lc.get(), (byte) 2));
            case 114:
                return new f741((q8n) daqVar.E1.get());
            case 115:
                return (wza0) ((ejp) daqVar.a.m1.get()).b.get();
            case 116:
                daq daqVar2 = daqVar.a.a;
                return new ejp(new wdm(daqVar2.x1, daqVar2.J1, daqVar2.b2, daqVar2.zf, daqVar2.z2, daqVar2.X4, daqVar2.w4, daqVar2.P5, daqVar2.u4, daqVar2.Y3, daqVar2.V4, daqVar2.W4, (byte) 21));
            case 117:
                return new juk((ohv0) daqVar.U5.get());
            case 118:
                return new uur0((w0g) daqVar.a.i1.get(), (a1g) daqVar.Bf.get(), (iwe0) daqVar.Af.get(), (pbk1) daqVar.Oh.get(), (dwr0) daqVar.a.j1.get());
            case 119:
                return new gdr(krw0.i.f, (dma1) daqVar.C1.get());
            case 120:
                i7d i7dVar = ((f4p) daqVar.In.get()).a;
                return new tz7((Context) ((kly0) i7dVar.a).get(), (yqg) ((kly0) i7dVar.c).get(), (cxc) ((kly0) i7dVar.d).get(), (mw7) ((kly0) i7dVar.e).get());
            case 121:
                return ((ekp) daqVar.Y8.get()).a(new File(((Context) daqVar.x1.a).getCacheDir(), "culturalmoments-stories-video-cache"), 10000000L);
            case 122:
                return ((ekp) daqVar.Y8.get()).a(new File(((Context) daqVar.x1.a).getCacheDir(), "fandomcollectibles-stories-video-cache"), 10000000L);
            case 123:
                return ((uy90) daqVar.hc.get()).j();
            case 124:
                luk lukVarB = ((brp) daqVar.Sm.get()).a.b();
                c8o.l(lukVarB);
                return new tm4(lukVarB);
            case 125:
                return new m1o0();
            case 126:
                return new prp0(new byp0(new vpp0(new CosmosTransport(new rtp0((RxRouter) ((kly0) daqVar.C1().a.c).get())))));
            case 127:
                ay0 ay0Var = (ay0) ((qxo) daqVar.kb.get()).e.get();
                c8o.m(ay0Var);
                return ay0Var;
            case 128:
                ay0 ay0Var2 = (ay0) ((qxo) daqVar.kb.get()).g.get();
                c8o.m(ay0Var2);
                return ay0Var2;
            case 129:
                ko0 ko0Var = (ko0) ((oxo) daqVar.Za.get()).g.get();
                c8o.m(ko0Var);
                return ko0Var;
            case 130:
                return new eo0((w5b1) daqVar.W3.get());
            case 131:
                return (kh5) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(kh5.class, "android-podcastads-podcastcta-umpl");
            case 132:
                return new z8o0((a9o0) daqVar.a.D1.get());
            case 133:
                return (a9o0) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(a9o0.class, "android-notifications-remotedatasource");
            case 134:
                b8p b8pVar = (b8p) daqVar.f4.get();
                return new ror(b8pVar.n1, xqu.a(b8pVar.d), xqu.a(b8pVar.l1));
            case 135:
                return new gvs0((Context) daqVar.x1.a, (dma1) daqVar.C5.get());
            case 136:
                hhp0 hhp0Var = hhp0.a;
                return new f5p0();
            case 137:
                b8p b8pVar2 = (b8p) daqVar.f4.get();
                return new yzs(xqu.a(b8pVar2.s), xqu.a(b8pVar2.W), xqu.a(b8pVar2.X), xqu.a(b8pVar2.Y), (fpr) b8pVar2.H.get(), b8pVar2.a.c(), new dt8(b8pVar2.I, (byte) 2));
            case 138:
                return mid.v((lid) daqVar.g9.get());
            case 139:
                return new lr0((q8n) daqVar.V2.get());
            case 140:
                ti0 ti0Var = (ti0) ((oxo) daqVar.Za.get()).b.get();
                c8o.m(ti0Var);
                return ti0Var;
            case 141:
                return new vhs0();
            case 142:
                pap papVarK = daqVar.K();
                t1r t1rVar = (t1r) papVarK.c.get();
                jly0 jly0Var = papVarK.g;
                dma1 dma1Var = t1rVar.a;
                dma1 dma1Var2 = t1rVar.a;
                if (dma1Var.h(t1r.f, false)) {
                    x1rVar = new x1r(1);
                } else {
                    bma1 bma1Var = t1r.g;
                    if (dma1Var2.h(bma1Var, true) && dma1Var2.h(t1r.h, false)) {
                        x1rVar = new x1r(2);
                    } else {
                        x1rVar = (dma1Var2.h(bma1Var, true) && ((Boolean) ((fal) jly0Var.get()).f.a.getValue()).booleanValue()) ? new x1r(3) : w1r.a;
                    }
                }
                return Boolean.valueOf(x1rVar instanceof x1r);
            case 143:
                bq0 bq0Var = (bq0) ((qxo) daqVar.kb.get()).c.get();
                c8o.m(bq0Var);
                return bq0Var;
            case 144:
                gkp gkpVar = (gkp) daqVar.V8.get();
                ynb0 ynb0VarA = xqu.a(gkpVar.b);
                o241 o241VarJ = gkpVar.a.j();
                c8o.l(o241VarJ);
                return f580.b(new g931(ynb0VarA, o241VarJ));
            case 145:
                return new lvc1((Context) daqVar.x1.a, ((lw21) daqVar.L1.get()).b(), new h94());
            case 146:
                daq daqVar3 = (daq) ((naq) daqVar.a.S1.get()).a.c;
                hbq hbqVar = daqVar3.a;
                return new m900(new w2z((j900) hbqVar.Q1.get(), new kq6((r5h) hbqVar.a.h7.get()), (byte) 5), (Scheduler) daqVar3.A2.get(), (yqg) daqVar3.J1.get(), (fod0) daqVar3.a.R1.get());
            case 147:
                return new naq(this);
            case 148:
                return (j900) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(j900.class, "android-ontour-ontourdataimpl");
            case 149:
                yqg yqgVar = (yqg) daqVar.J1.get();
                return new fod0(yqgVar);
            case 150:
                return new asi0(new ct4(false, false, false, (luk) daqVar.a.a.L1.get()));
            case 151:
                return new cju((ao0) ((oxo) daqVar.Za.get()).f.get(), (byte) 0);
            case 152:
                return new cju((ao0) ((oxo) daqVar.Za.get()).f.get(), (byte) 1);
            case 153:
                return Boolean.valueOf(daqVar.j().k());
            case 154:
                return new fuj1();
            case 155:
                kma kmaVar = (kma) ((etp) daqVar.s9.get()).c.get();
                c8o.m(kmaVar);
                return kmaVar;
            case 156:
                hbq hbqVar2 = daqVar.a;
                daq daqVar4 = hbqVar2.a;
                return new vy90(new o860(hbqVar2.g2, new e4s(xqu.a(daqVar4.Ed), xqu.a(daqVar4.bm), xqu.a(hbqVar2.a2)), hbqVar2.f2, hbqVar2.h2, (byte) 16));
            case 157:
                return new c4s();
            case 158:
                hbq hbqVar3 = daqVar.a;
                return new pcd(hbqVar3.b2, hbqVar3.d2, (mr20) daqVar.cc.get(), (yqg) daqVar.J1.get(), daqVar.a.e2);
            case 159:
                return ux51.d((xm41) daqVar.l5.get());
            case 160:
                return new b4s(xqu.a(daqVar.a.c2), xqu.a(daqVar.a.b2));
            case 161:
                return ux51.e((xm41) daqVar.l5.get());
            case 162:
                return new ylr((ov20) daqVar.P5.get());
            case 163:
                return new n4s((mr20) daqVar.u5.get());
            case 164:
                return new i4s((mr20) daqVar.cc.get());
            case 165:
                return new skd0((yqg) daqVar.J1.get(), daqVar.a.j2);
            case 166:
                return Long.valueOf(((qq4) daqVar.Kk.get()).e());
            case 167:
                return new paq(this);
            case 168:
                return new cr4(false, false, false, (luk) daqVar.L1.get());
            case 169:
                return new qaq(this);
            case 170:
                return ((ekp) daqVar.Y8.get()).a(new File(((Application) daqVar.x1.a).getCacheDir(), "ad-betamax-cache"), 10000000L);
            case 171:
                return new raq(this);
            case 172:
                return new saq(this);
            case 173:
                return new taq();
            case 174:
                hbq hbqVar4 = daqVar.a;
                hbqVar4.getClass();
                return new av0(new f01((v290) hbqVar4.a.Kn.get()));
            case 175:
                g9c0 g9c0Var = (g9c0) daqVar.a.t2.get();
                hbq hbqVar5 = daqVar.a;
                List listW = hbqVar5.w();
                taq taqVar = (taq) hbqVar5.q2.get();
                int i = t380.c;
                return new uqj1(new r0s0((Object) listW, (Object) new b291(taqVar), hbqVar5.n2.get(), (byte) 22), g9c0Var);
            case 176:
                return new uaq(this);
            case 177:
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) daqVar.a.a.Y3.get();
                k370 k370Var2 = new k370();
                k370Var2.f((l370) null, "https://messaging-locale.spotifycdn.com/");
                return new fno0((gno0) retrofitMaker2.createCustomHostService(gno0.class, k370Var2.b()), (o241) daqVar.u4.get(), (r241) daqVar.R5.get());
            case 178:
                return new c881((a9o0) daqVar.a.D1.get());
            case 179:
                return new eyb1((q8n) daqVar.E1.get(), (ayb1) daqVar.a.x2.get());
            case 180:
                return new ayb1(daqVar.a.a.k().c(), fdb1.w((RetrofitMaker) daqVar.Y3.get()), (uu00) daqVar.a5.get());
            case 181:
                return new hyb1((q8n) daqVar.E1.get(), (ayb1) daqVar.a.x2.get());
            case 182:
                return new lw5(new vn8(daqVar.a.A2), (q8n) daqVar.r2.get());
            case 183:
                return new ut4(5, (luk) daqVar.L1.get());
            case 184:
                return new eg40((mh40) daqVar.a.C2.get());
            case 185:
                return (mh40) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(mh40.class, "android-bluejay-data-impl", wrn.d);
            case 186:
                return new gh40((eg40) daqVar.a.D2.get());
            case 187:
                return new x881((vaq) daqVar.a.F2.get());
            case 188:
                return new vaq(this);
            case 189:
                return new w881((vaq) daqVar.a.F2.get());
            case 190:
                return new b370();
            case 191:
                return new mta((byte) 20);
            case 192:
                return new waq();
            case 193:
                return new vfs();
            case 194:
                return new skm((xaq) daqVar.a.L2.get());
            case 195:
                return new xaq(this);
            case 196:
                return new efe0((nfa0) daqVar.b2.get(), (Scheduler) daqVar.A2.get(), (Context) daqVar.x1.a);
            case 197:
                return new j3a();
            case 198:
                Context context = (Context) daqVar.x1.a;
                u3f1 u3f1Var = new u3f1();
                PreferenceManager.getDefaultSharedPreferences(context);
                return u3f1Var;
            case 199:
                return new pf60((qf60) ((RetrofitMaker) ((ljp) daqVar.a.Q2.get()).a.b.get()).createWebgateService(qf60.class, "android-highlightsstats-dataimpl"));
            default:
                jah.e(s);
                return null;
        }
    }

    public Object i() {
        daq daqVar = (daq) this.c;
        short s = this.b;
        switch (s) {
            case 200:
                daq daqVar2 = daqVar.a.a;
                return new ljp(new tbl(daqVar2.u4, daqVar2.Y3));
            case 201:
                return new of60((o241) ((ljp) daqVar.a.Q2.get()).a.a.get());
            case 202:
                return Boolean.valueOf(daqVar.a.g().e());
            case 203:
                ay0 ay0Var = (ay0) ((qxo) daqVar.kb.get()).i.get();
                c8o.m(ay0Var);
                return ay0Var;
            case 204:
                ce31 ce31Var = (ce31) ((qxo) daqVar.kb.get()).v.get();
                c8o.m(ce31Var);
                return ce31Var;
            case 205:
                h310 h310Var = ((ajp) daqVar.c7.get()).a;
                return new a2b0((b2b0) ((RetrofitMaker) h310Var.e.get()).createWebgateService(b2b0.class, "android-genalphablocking-datasourceimpl"), (yqg) h310Var.f.get());
            case 206:
                return Boolean.valueOf(daqVar.b().q());
            case 207:
                return Boolean.valueOf(daqVar.b().p());
            case 208:
                return Boolean.valueOf(daqVar.b().r());
            case 209:
                return new jus(xqu.a(daqVar.a.a3));
            case 210:
                return new a54(false, (luk) daqVar.L1.get());
            case 211:
                ugn0 ugn0Var = new ugn0();
                ugn0Var.a = gio1.b(new sgn0());
                return ugn0Var;
            case 212:
                dj5 dj5Var = ((etp) daqVar.s9.get()).a;
                return new nwt((Observable) dj5Var.j.get(), (Observable) dj5Var.k.get(), (zr00) dj5Var.l.get(), (o241) dj5Var.m.get(), (bjd) dj5Var.n.get(), (pe) dj5Var.o.get(), new rzo0(dj5Var.l(), (m7p0) dj5Var.p.get(), new f35(false, dj5Var.c()), (byte) 5));
            case 213:
                return new byu((mbp) ((nbp) daqVar.F8.get()).b.get());
            case 214:
                c811 c811Var = (c811) ((esp) ((f9j0) daqVar.F6.get())).E.get();
                c8o.m(c811Var);
                return c811Var;
            case 215:
                return new h2r0(new o55(false, false, false, false, ((qtq) daqVar.F4.get()).a.b()));
            case 216:
                stk stkVar = (stk) daqVar.C1().g.get();
                c8o.m(stkVar);
                return stkVar;
            case 217:
                lfb0 lfb0Var = (lfb0) ((qtq) daqVar.F4.get()).y.get();
                c8o.m(lfb0Var);
                return lfb0Var;
            case 218:
                n6s n6sVar = (n6s) ((b8p) daqVar.f4.get()).A.get();
                c8o.m(n6sVar);
                return n6sVar;
            case 219:
                return new u680();
            case 220:
                e831 e831Var = (e831) daqVar.gc.get();
                Flowable flowable = (Flowable) daqVar.D5.get();
                int i = t380.c;
                return new d490(e831Var, flowable, kg11.t);
            case 221:
                return (j0n1) daqVar.a.m3.get();
            case 222:
                return new j0n1(yvm1.c((RetrofitMaker) daqVar.a.a.Y3.get()));
            case 223:
                ena0 ena0Var = new ena0();
                gio1.b((Object) null);
                gio1.b((Object) null);
                return ena0Var;
            case 224:
                return new svo();
            case 225:
                return new dj81(new ii4(hi4.b, (luk) daqVar.a.a.L1.get()));
            case 226:
                return new vaz0((q8n) daqVar.E1.get(), (waz0) daqVar.Kc.get());
            case 227:
                return new yaq(this);
            case 228:
                u8p u8pVar = (u8p) daqVar.n5.get();
                return new fum((q8n) u8pVar.a.b.get(), (hum) u8pVar.b.get());
            case 229:
                return hu20.b(hu20.a, new p3t(eth.V((xm41) daqVar.Yl.get()), (byte) 1), new jte(2, (lnm) null, (byte) 23));
            case 230:
                ayo ayoVar = (ayo) daqVar.V5.get();
                vi2 vi2Var = ayoVar.a;
                return new dj2(new hj2((Context) vi2Var.a.get(), ayoVar.c, ayoVar.d, ayoVar.e, ayoVar.f, (mbo0) vi2Var.d.get(), ayoVar.a()), (byte) 0);
            case 231:
                return new e630();
            case 232:
                return new qil1((a550) ((z5p) daqVar.dk.get()).a.f.get());
            case 233:
                String str = Build.MODEL;
                c8o.m(str);
                return str;
            case 234:
                o241 o241Var = (o241) daqVar.u4.get();
                return new k981(o241Var, (q8n) daqVar.E1.get());
            case 235:
                return new ew41((jb51) daqVar.a.B3.get());
            case 236:
                return new jb51((ib51) daqVar.a.A3.get());
            case 237:
                return new ib51();
            case 238:
                return new jbo();
            case 239:
                return new eco(us71.h((q8n) daqVar.E1.get()));
            case 240:
                return new jh51();
            case 241:
                return new z281((h481) daqVar.Ip.get(), (x3v0) daqVar.T9.get(), g7y.m((zdp) daqVar.a.a.Op.get()));
            case 242:
                hbq hbqVar = daqVar.a;
                hbq hbqVar2 = daqVar.a;
                return new z211(hbqVar.c(), (x211) ((RetrofitMaker) hbqVar2.a.Y3.get()).createWebgateService(x211.class, "android-search-recommendedsearches-impl"), new sjb((byte) 22), (w211) hbqVar2.H3.get(), (xvo) daqVar.H8.get(), (yqg) daqVar.J1.get(), (wye1) hbqVar2.I3.get());
            case 243:
                w211 w211Var = new w211();
                w211Var.a = z6x.a;
                return w211Var;
            case 244:
                return new wye1();
            case 245:
                return new on01((xrc0) daqVar.f5.get(), (iyc0) daqVar.g5.get(), (hc51) daqVar.ws.get(), (q8n) daqVar.r2.get(), (t2j0) daqVar.f2.get());
            case 246:
                return new qsc((yqg) daqVar.J1.get());
            case 247:
                return new rg40();
            case 248:
                return new hfd0((hgd0) daqVar.Xd.get(), (c9n) daqVar.yh.get());
            case 249:
                return Boolean.valueOf(daqVar.a.g().d());
            case 250:
                return new pvm0((qvm0) ((RetrofitMaker) daqVar.a.a.Y3.get()).createWebgateService(qvm0.class, "android-multi-user-plan-verification-data-source-impl"));
            case 251:
                return Boolean.valueOf(daqVar.l().d());
            case 252:
                return new n2b0((p2b0) ((RetrofitMaker) ((djp) daqVar.nm.get()).a.a.get()).createWebgateService(p2b0.class, "android-genalpha-datasourceimpl"));
            case 253:
                return new pd2((a1g) daqVar.Bf.get(), (w0g) daqVar.a.i1.get(), (t3f0) daqVar.wm.get());
            case 254:
                return Boolean.valueOf(daqVar.f().f());
            case 255:
                return ((ayo) daqVar.V5.get()).a();
            case 256:
                daqVar.a.c();
                return new ekb((byte) 22);
            case 257:
                return new k9c();
            case 258:
                return new i5w0(((ekp) daqVar.Y8.get()).a(new File(((Context) daqVar.x1.a).getCacheDir(), "audio-browse-betamax-cache"), 104857600L));
            case 259:
                return zgf0.p((byb1) daqVar.a.y2.get(), (fyb1) daqVar.a.z2.get(), (ztw0) daqVar.Sq.get());
            case 260:
                return new ol61((Context) daqVar.x1.a);
            case 261:
                return new opn((Context) daqVar.x1.a);
            case 262:
                return Boolean.valueOf(daqVar.e().g());
            case 263:
                return Boolean.valueOf(((bg4) ((zdp) daqVar.Op.get()).a.s.get()).a());
            case 264:
                return new as00(daqVar.W());
            case 265:
                g3z g3zVar = ((zdp) daqVar.Op.get()).a;
                return new t1z(new lqr((u1z) ((RetrofitMaker) g3zVar.d.get()).createWebgateService(u1z.class, "android-episode-episodeassociationsimpl"), (byte) 28), new ifl1((Flowable) g3zVar.j.get(), (byte) 15), (o241) g3zVar.e.get());
            case 266:
                zdp zdpVar = (zdp) daqVar.Op.get();
                g3z g3zVar2 = zdpVar.a;
                return new srj0((qns0) g3zVar2.m.get(), (wdp) zdpVar.d.get(), ((Boolean) g3zVar2.v.get()).booleanValue());
            case 267:
                g3z g3zVar3 = ((zdp) daqVar.Op.get()).a;
                return new pxr(new lze0((Flowable) g3zVar3.j.get()), (yqg) g3zVar3.c.get());
            case 268:
                ay0 ay0Var2 = (ay0) ((qxo) daqVar.kb.get()).h.get();
                c8o.m(ay0Var2);
                return ay0Var2;
            case 269:
                ay0 ay0Var3 = (ay0) ((qxo) daqVar.kb.get()).d.get();
                c8o.m(ay0Var3);
                return ay0Var3;
            case 270:
                return new oep(new pg5(daqVar.a.a.wf));
            case 271:
                return new zx7(new l15((luk) daqVar.a.a.L1.get()));
            case 272:
                return Boolean.valueOf(daqVar.a.d().c());
            case 273:
                return Boolean.valueOf(daqVar.a.d().b());
            case 274:
                return Boolean.valueOf(daqVar.a.d().d());
            case 275:
                return new rm3((ne50) ((RetrofitMaker) daqVar.a.a.Y3.get()).createWebgateService(ne50.class, "android-allboarding-entrypointmusic"));
            case 276:
                return new sja1((Context) daqVar.x1.a, (cxc) daqVar.O5.get(), (yqg) daqVar.J1.get(), (nfa0) daqVar.b2.get(), (q8n) daqVar.E1.get());
            case 277:
                return new luc((sja1) daqVar.a.o4.get());
            case 278:
                return Boolean.valueOf(daqVar.a.e().a());
            case 279:
                return new gza0((jza0) ((RetrofitMaker) ((djp) daqVar.nm.get()).a.a.get()).createWebgateService(jza0.class, "android-genalpha-datasourceimpl"));
            case 280:
                oq oqVarAccountSwitcherCredentialManager = ((uq) daqVar.C2.get()).accountSwitcherCredentialManager();
                c8o.m(oqVarAccountSwitcherCredentialManager);
                return oqVarAccountSwitcherCredentialManager;
            case 281:
                return Boolean.valueOf(daqVar.a.e().b());
            case 282:
                return Boolean.valueOf(daqVar.l().g());
            case 283:
                return Boolean.valueOf(daqVar.l().f());
            case 284:
                uau0 uau0Var = ((eyp) daqVar.M9.get()).a;
                nhh1 nhh1Var = (nhh1) ((Cosmonaut) uau0Var.a.get()).createCosmosService(nhh1.class);
                c8o.m(nhh1Var);
                return new phh1(nhh1Var, (ujs) uau0Var.c.get(), new vo30((lv00) uau0Var.e.get()));
            case 285:
                uau0 uau0Var2 = ((eyp) daqVar.M9.get()).a;
                return new shh1(f7z.B((RxRouter) uau0Var2.b.get()), (lv00) uau0Var2.e.get());
            case 286:
                return new yi31((cxc) daqVar.O5.get());
            case 287:
                return new ivs0((Context) daqVar.x1.a, (gvs0) daqVar.a.G1.get());
            case 288:
                Clock clockSystemUTC = Clock.systemUTC();
                c8o.m(clockSystemUTC);
                return clockSystemUTC;
            case 289:
                return Boolean.valueOf(new w34((luk) daqVar.a.a.L1.get()).b());
            case 290:
                return new e7y0();
            case 291:
                return new frh1((grh1) daqVar.a.D4.get());
            case 292:
                return (grh1) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(grh1.class, "android-bluejay-data-impl", wrn.e);
            case 293:
                return new ags0((yqg) daqVar.J1.get());
            case 294:
                return uge0.w(((wpq) daqVar.Ud.get()).d());
            case 295:
                return new sbi1((co70) daqVar.fj.get(), (pbi1) daqVar.a.H4.get());
            case 296:
                return new pbi1();
            case 297:
                mkp mkpVar = (mkp) daqVar.ie.get();
                ukp ukpVar = mkpVar.b;
                ukp ukpVar2 = ukpVar;
                c9c0 c9c0VarB = ukpVar2.b();
                c8o.l(c9c0VarB);
                b0a0 b0a0VarD = ukpVar2.d();
                c8o.l(b0a0VarD);
                ukp ukpVar3 = ukpVar;
                c9c0 c9c0VarB2 = ukpVar3.b();
                c8o.l(c9c0VarB2);
                u6f0 u6f0VarF = ukpVar3.f();
                c8o.l(u6f0VarF);
                return new wsf(c9c0VarB, b0a0VarD, new hur(c9c0VarB2, u6f0VarF, (byte) 6), (kkp) mkpVar.e.get());
            case 298:
                return new yed0((vcd0) daqVar.Yd.get(), (hfd0) daqVar.a.N3.get(), (q8n) daqVar.E1.get());
            case 299:
                daq daqVar3 = daqVar.a.a;
                Context context = (Context) daqVar3.x1.a;
                zxa zxaVar = (zxa) daqVar3.at.get();
                xrk xrkVar = (xrk) daqVar3.Ac.get();
                uu00 uu00Var = (uu00) daqVar3.a5.get();
                gw70 gw70Var = (gw70) daqVar3.d8.get();
                wpq wpqVar = (wpq) daqVar3.Ud.get();
                return qid0.p(new byp(context, zxaVar, xrkVar, uu00Var, gw70Var, new xmu0(yx61.k((xpq) wpqVar.e.get()), yx61.u((xpq) wpqVar.e.get()), (byte) 2), (RetrofitMaker) daqVar3.Y3.get(), (Flowable) daqVar3.z2.get(), (q8n) daqVar3.E1.get()));
            default:
                jah.e(s);
                return null;
        }
    }
}
