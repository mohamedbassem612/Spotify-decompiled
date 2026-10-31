package p;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.offline.database.BetamaxOfflineDatabase;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.externalintegration.ubi.UbiSpecificationId;
import com.spotify.mobius.EventSource;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.playlist.policy.proto.ItemExtensionPolicy;
import com.spotify.playlist.policy.proto.ItemOfflineStateDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistAlbumDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistEpisodeDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistItemDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import com.spotify.wrapped.v1.proto.StoryCard;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableTransformer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.processors.PublishProcessor;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class chp implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ chp(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object A() {
        gkp gkpVar = (gkp) this.c;
        byte b = 0;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                voa voaVar = gkpVar.a;
                fxu fxuVar = (fxu) voaVar.b;
                hmn0 hmn0Var = (hmn0) voaVar.w;
                rma rmaVar = (rma) gkpVar.c.get();
                q8n q8nVar = (q8n) gkpVar.a.r;
                c8o.l(q8nVar);
                return new o5n(fxuVar, hmn0Var, smo1.e(flo1.l(guo1.B(), q8nVar)), new kks0(rmaVar, (byte) 12));
            case 1:
                ynb0 ynb0VarA = xqu.a(gkpVar.b);
                p241 p241VarJ = gkpVar.a.j();
                c8o.l(p241VarJ);
                g931 g931Var = new g931(ynb0VarA, p241VarJ);
                return new rma(p241VarJ.a.filter(xpv0.e).take(1L).singleOrError().map(new s6z0(g931Var, (byte) 15)), (qma) g931Var.d);
            case 2:
                luk lukVar = (luk) gkpVar.a.d;
                c8o.l(lukVar);
                return new z3n0(false, false, false, r3n0.b, -1, false, 0, 4, 2, s3n0.b, t3n0.b, 2000, true, false, false, false, false, false, 60000, 2500, true, true, false, false, false, false, true, 5000, 8000, 1500, false, false, 1, u3n0.b, -1, false, true, true, false, false, v3n0.b, false, false, true, false, false, false, 5, false, w3n0.b, false, 30000, false, 4000, false, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, false, 1500, 20000, true, false, false, true, 1, false, false, false, false, false, false, -1, lukVar);
            case 3:
                return new m2p(((q2p) gkpVar.o.get()).v);
            case 4:
                voa voaVar2 = gkpVar.a;
                z48 z48Var = (z48) voaVar2.v;
                q8n q8nVar2 = (q8n) voaVar2.q;
                Context context = (Context) voaVar2.f;
                c8o.l(context);
                t2j0 t2j0Var = (t2j0) voaVar2.h;
                c8o.l(t2j0Var);
                yqg yqgVar = (yqg) voaVar2.g;
                c8o.l(yqgVar);
                g06 g06Var = (g06) gkpVar.e.get();
                l270 l270Var = (l270) voaVar2.j;
                yqu0 yqu0VarT = w290.t(new iz10(gkpVar.a.g()), gkpVar.a());
                cnh0 cnh0Var = (cnh0) gkpVar.j.get();
                dpa dpaVar = (dpa) gkpVar.l.get();
                c2u0 c2u0Var = (c2u0) voaVar2.D;
                c8o.l(c2u0Var);
                pjm0 pjm0Var = (pjm0) voaVar2.E;
                c8o.l(pjm0Var);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new cv7(dpaVar, (byte) 8));
                arrayList.add(new qoa(c2u0Var, pjm0Var));
                zwz0 zwz0Var = (zwz0) voaVar2.k;
                c8o.l(zwz0Var);
                vfs0 vfs0Var = (vfs0) voaVar2.l;
                c8o.l(vfs0Var);
                Scheduler scheduler = (Scheduler) voaVar2.m;
                c8o.l(scheduler);
                c8o.l((Scheduler) voaVar2.n);
                q8n q8nVar3 = (q8n) voaVar2.o;
                c8o.l(q8nVar3);
                c8o.l(q8nVar2);
                sma smaVar = (sma) gkpVar.k.get();
                fxu fxuVar2 = (fxu) voaVar2.b;
                c8o.l(q8nVar2);
                aj4 aj4VarA = gkpVar.a();
                i5w0 i5w0Var = new i5w0(new cz10(fxuVar2, new gz10(aj4VarA.b(), aj4VarA.d(), aj4VarA.c(), aj4VarA.e()), q8nVar2));
                c8o.l(z48Var);
                i5w0 i5w0Var2 = new i5w0(new gma(new vv8((Object) z48Var, (byte) 27)));
                c8o.l(z48Var);
                gw70 gw70Var = (gw70) voaVar2.t;
                c8o.l(gw70Var);
                i5w0 i5w0VarD = spq0.d((b2b1) gkpVar.m.get());
                o5n o5nVar = (o5n) gkpVar.d.get();
                tdj1 tdj1Var = (tdj1) gkpVar.n.get();
                cuw cuwVar = ((z3n0) gkpVar.b.get()).k0() ? new cuw((byte) 0) : null;
                Context applicationContext = context.getApplicationContext();
                spq0 spq0VarA = spq0.a(z48Var);
                g06Var.getClass();
                cnh0Var.getClass();
                smaVar.getClass();
                return new q2p(applicationContext, t2j0Var, yqgVar, g06Var, l270Var, yqu0VarT, cnh0Var, arrayList, zwz0Var, vfs0Var, scheduler, q8nVar3, q8nVar2, smaVar, i5w0Var, i5w0Var2, spq0VarA, gw70Var, i5w0VarD, o5nVar, tdj1Var, cuwVar);
            case 5:
                y2g0 y2g0Var = (y2g0) gkpVar.a.s;
                c8o.l(y2g0Var);
                return new g06(y2g0Var);
            case 6:
                Context context2 = (Context) gkpVar.a.f;
                c8o.l(context2);
                return new u290((akp) gkpVar.f.get(), gcs0.i((o5n) gkpVar.d.get()), (ckp) gkpVar.i.get(), (bkp) gkpVar.g.get(), context2);
            case 7:
                return new akp(this);
            case 8:
                return new bkp(this);
            case 9:
                return new ckp(this);
            case 10:
                return new ir51((fxu) gkpVar.a.b);
            case 11:
                c8o.l((Context) gkpVar.a.f);
                return new sma();
            case 12:
                return new dpa();
            case 13:
                aj4 aj4VarA2 = gkpVar.a();
                Context context3 = (Context) gkpVar.a.f;
                c8o.l(context3);
                return new b2b1(context3, aj4VarA2.a());
            case 14:
                voa voaVar3 = gkpVar.a;
                fxu fxuVar3 = (fxu) voaVar3.b;
                q8n q8nVar4 = (q8n) voaVar3.q;
                c8o.l(q8nVar4);
                if (((z3n0) gkpVar.b.get()).q0()) {
                    return new tdj1(fxuVar3, q8nVar4);
                }
                return null;
            case 15:
                return new dkp(this, b);
            case 16:
                o241 o241Var = (o241) gkpVar.a.e;
                c8o.l(o241Var);
                return new lvw0(o241Var);
            case 17:
                luk lukVar2 = (luk) gkpVar.a.d;
                c8o.l(lukVar2);
                return new xl4(lukVar2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                m2p m2pVar = (m2p) gkpVar.p.get();
                rma rmaVar2 = (rma) gkpVar.c.get();
                luk lukVar3 = (luk) gkpVar.a.d;
                c8o.l(lukVar3);
                return new yoa(m2pVar, rmaVar2, new q74(0, lukVar3), new m021((dkp) gkpVar.s.get(), xqu.a(gkpVar.r), (byte) 11), (e8r) gkpVar.t.get());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new e8r();
            case 20:
                yqg yqgVar2 = (yqg) gkpVar.a.g;
                c8o.l(yqgVar2);
                return new fpa(yqgVar2);
            case 21:
                return new ekp(this);
            case 22:
                q8n q8nVar5 = (q8n) gkpVar.a.f72p;
                c8o.l(q8nVar5);
                fkp fkpVar = (fkp) gkpVar.x.get();
                hqc1 hqc1Var = (hqc1) gkpVar.B.get();
                u8v u8vVar = (u8v) gkpVar.C.get();
                yqg yqgVar3 = (yqg) gkpVar.a.g;
                c8o.l(yqgVar3);
                return new b8g1(q8nVar5, fkpVar, hqc1Var, u8vVar, yqgVar3, (f5k) gkpVar.D.get(), (sga) gkpVar.F.get(), (hpa) gkpVar.H.get());
            case 23:
                return new fkp(this);
            case 24:
                return new hqc1((a8o0) gkpVar.y.get(), (big0) gkpVar.A.get(), new sjb((byte) 7));
            case 25:
                q8n q8nVar6 = (q8n) gkpVar.a.q;
                c8o.l(q8nVar6);
                voa voaVar4 = gkpVar.a;
                return new a8o0(q8nVar6, (fxu) voaVar4.b, (l270) voaVar4.j);
            case 26:
                return ((jkp) gkpVar.z.get()).b();
            case 27:
                voa voaVar5 = gkpVar.a;
                gw70 gw70Var2 = (gw70) voaVar5.t;
                c8o.l(gw70Var2);
                rma rmaVar3 = (rma) gkpVar.c.get();
                ynb0 ynb0VarA2 = xqu.a(gkpVar.b);
                o241 o241VarJ = gkpVar.a.j();
                c8o.l(o241VarJ);
                f580.b(new g931(ynb0VarA2, o241VarJ));
                nfa0 nfa0Var = (nfa0) voaVar5.i;
                c8o.l(nfa0Var);
                return new jkp(new y441(gw70Var2, rmaVar3, nfa0Var, (a8o0) gkpVar.y.get()));
            case 28:
                return new u8v((big0) gkpVar.A.get());
            case 29:
                voa voaVar6 = gkpVar.a;
                voa voaVar7 = gkpVar.a;
                Context context4 = (Context) voaVar6.f;
                c8o.l(context4);
                q8n q8nVar7 = (q8n) voaVar7.f72p;
                c8o.l(q8nVar7);
                q8n q8nVar8 = (q8n) voaVar7.q;
                c8o.l(q8nVar8);
                return new f5k(context4, q8nVar7, q8nVar8, (fkp) gkpVar.x.get(), (hqc1) gkpVar.B.get(), (u8v) gkpVar.C.get(), ((rma) gkpVar.c.get()).a().O1);
            case 30:
                Context context5 = (Context) gkpVar.a.f;
                c8o.l(context5);
                f5k f5kVar = (f5k) gkpVar.D.get();
                j080 j080Var = (j080) gkpVar.E.get();
                q8n q8nVar9 = (q8n) gkpVar.a.q;
                c8o.l(q8nVar9);
                qma qmaVarA = ((rma) gkpVar.c.get()).a();
                return new sga(context5, f5kVar, j080Var, q8nVar9, qmaVarA.H1, qmaVarA.I1);
            case 31:
                Context context6 = (Context) gkpVar.a.f;
                c8o.l(context6);
                q8n q8nVar10 = (q8n) gkpVar.a.q;
                c8o.l(q8nVar10);
                return new n080(context6, q8nVar10);
            case 32:
                voa voaVar8 = gkpVar.a;
                voa voaVar9 = gkpVar.a;
                t2j0 t2j0Var2 = (t2j0) voaVar8.h;
                c8o.l(t2j0Var2);
                r3b1 r3b1Var = (r3b1) voaVar9.c;
                c8o.l(r3b1Var);
                yqg yqgVar4 = (yqg) voaVar9.g;
                c8o.l(yqgVar4);
                return new hpa(t2j0Var2, r3b1Var, yqgVar4, (ied1) gkpVar.G.get());
            case 33:
                Context context7 = (Context) gkpVar.a.f;
                c8o.l(context7);
                return new ied1(context7);
            case 34:
                jkp jkpVar = (jkp) gkpVar.z.get();
                return new bbb1((um51) jkpVar.b.get(), jkpVar.b());
            case 35:
                t6b1 t6b1Var = (s6b1) gkpVar.a.x;
                c8o.l(t6b1Var);
                voa voaVar10 = gkpVar.a;
                Context context8 = (Context) voaVar10.f;
                c8o.l(context8);
                t2j0 t2j0Var3 = (t2j0) voaVar10.h;
                c8o.l(t2j0Var3);
                l270 l270Var2 = (l270) voaVar10.j;
                ckp ckpVar = (ckp) gkpVar.i.get();
                bkp bkpVar = (bkp) gkpVar.g.get();
                nfa0 nfa0Var2 = (nfa0) voaVar10.i;
                c8o.l(nfa0Var2);
                rma rmaVar4 = (rma) gkpVar.c.get();
                Scheduler scheduler2 = (Scheduler) voaVar10.n;
                c8o.l(scheduler2);
                Scheduler scheduler3 = (Scheduler) voaVar10.m;
                c8o.l(scheduler3);
                q8n q8nVar11 = (q8n) voaVar10.q;
                c8o.l(q8nVar11);
                q8n q8nVar12 = (q8n) voaVar10.o;
                c8o.l(q8nVar12);
                yqg yqgVar5 = (yqg) voaVar10.g;
                c8o.l(yqgVar5);
                zwz0 zwz0Var2 = (zwz0) voaVar10.k;
                c8o.l(zwz0Var2);
                swm0 swm0VarI = gcs0.i((o5n) gkpVar.d.get());
                byp0 byp0Var = (byp0) voaVar10.C;
                c8o.l(byp0Var);
                ix7 ix7Var = new ix7(context8, t2j0Var3, l270Var2, ckpVar, bkpVar, nfa0Var2, rmaVar4, scheduler2, scheduler3, q8nVar11, q8nVar12, yqgVar5, zwz0Var2, swm0VarI, byp0Var);
                File file = new File(t6b1Var.l.e(t6b1.t, (String) null), "Videos");
                Context applicationContext2 = context8.getApplicationContext();
                wna wnaVar = new wna(ix7Var);
                applicationContext2.getClass();
                rmaVar4.getClass();
                return new zjp(applicationContext2, t2j0Var3, l270Var2, file, wnaVar, nfa0Var2, rmaVar4, scheduler2, scheduler3, q8nVar11, q8nVar12, yqgVar5, zwz0Var2, byp0Var);
            case 36:
                jly0 jly0Var = gkpVar.K;
                voa voaVar11 = gkpVar.a;
                yna ynaVarG = w290.g((zjp) jly0Var.get());
                hna hnaVar = (hna) ((zjp) gkpVar.K.get()).z.get();
                c8o.m(hnaVar);
                uu00 uu00Var = (uu00) voaVar11.y;
                c8o.l(uu00Var);
                Cosmonaut cosmonaut = (Cosmonaut) voaVar11.z;
                c8o.l(cosmonaut);
                Scheduler scheduler4 = (Scheduler) voaVar11.m;
                c8o.l(scheduler4);
                q8n q8nVar13 = (q8n) voaVar11.o;
                c8o.l(q8nVar13);
                oup0 oup0Var = (oup0) cosmonaut.createCosmosService(oup0.class);
                oup0Var.getClass();
                return new vwp(ynaVarG, hnaVar, oup0Var, uu00Var, scheduler4, q8nVar13);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object B() {
        k9k k9kVar = (k9k) this.c;
        ja90 ja90Var = (ja90) k9kVar.b;
        q7r0 q7r0Var = (q7r0) k9kVar.c;
        byte b = this.b;
        if (b == 0) {
            t8u0 t8u0Var = (t8u0) ja90Var.d.get();
            c8o.l(t8u0Var);
            return kmq0.x(q7r0Var, t8u0Var);
        }
        if (b == 1) {
            ynb0 ynb0VarA = xqu.a((jly0) k9kVar.e);
            q8n q8nVar = (q8n) ja90Var.j.get();
            c8o.l(q8nVar);
            return new cz30(ynb0VarA, q8nVar);
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        ttm0 ttm0VarE = cwl1.E(q7r0Var);
        c8o.m(ttm0VarE);
        return ttm0VarE;
    }

    private final Object C() {
        nkp nkpVar = (nkp) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new rfr(nkpVar.a.a());
            case 1:
                return (v5n) nkpVar.a.y.get();
            case 2:
                ukp ukpVar = nkpVar.b;
                sr90 sr90Var = nkpVar.a;
                c9c0 c9c0VarB = ukpVar.b();
                c8o.l(c9c0VarB);
                b0a0 b0a0VarD = nkpVar.b.d();
                c8o.l(b0a0VarD);
                Context contextA = sr90Var.a();
                mr20 mr20VarE = sr90Var.e();
                gma1 gma1Var = sr90Var.d;
                c8o.l(gma1Var);
                return new b7d0(c9c0VarB, b0a0VarD, new x6d0(contextA, mr20VarE, new ucd(gma1Var.a(), (byte) 2)), nkpVar.a(), sr90Var.d(), sr90Var.c());
            case 3:
                sr90 sr90Var2 = nkpVar.a;
                sr90 sr90Var3 = nkpVar.a;
                return new o1o0(sr90Var2.d(), new xkm0((w2o0) sr90Var3.M.get(), (byte) 28), sr90Var3.c());
            case 4:
                ynb0 ynb0VarA = xqu.a(nkpVar.i);
                return new vu60(ynb0VarA, (p900) nkpVar.g.get());
            case 5:
                jly0 jly0Var = nkpVar.g;
                sr90 sr90Var4 = nkpVar.a;
                ukp ukpVar2 = nkpVar.b;
                p900 p900Var = (p900) jly0Var.get();
                n381 n381VarI = ukpVar2.i();
                p5a0 p5a0Var = (p5a0) ukpVar2.i.get();
                c8o.l(p5a0Var);
                ukp ukpVar3 = ukpVar2;
                oea0 oea0Var = new oea0(((dj5) ukpVar3.a.b).m(), ukpVar3.b.a());
                q8n q8nVarB = sr90Var4.b();
                v5n v5nVar = (v5n) nkpVar.d.get();
                Flowable flowable = (Flowable) sr90Var4.H.get();
                sjq0 sjq0VarK = ukpVar2.k();
                z1s z1sVar = (z1s) nkpVar.h.get();
                ukp ukpVar4 = ukpVar2;
                c9c0 c9c0VarB2 = ukpVar4.b();
                c8o.l(c9c0VarB2);
                k9r k9rVar = new k9r((Object) c9c0VarB2, sr90Var4.n.get(), (Object) new av60(((dj5) ukpVar4.a.b).f(), (g0l) ukpVar4.d.get()), (byte) 24);
                g0l g0lVar = (g0l) sr90Var4.o.get();
                Scheduler scheduler = (Scheduler) sr90Var4.i.get();
                nfa0 nfa0Var = (nfa0) sr90Var4.n.get();
                ukpVar2.getClass();
                return new ev60(p900Var, n381VarI, p5a0Var, oea0Var, q8nVarB, v5nVar, flowable, sjq0VarK, z1sVar, k9rVar, g0lVar, scheduler, nfa0Var, new xgc((byte) 6));
            case 6:
                return new p900((Scheduler) nkpVar.a.j.get());
            case 7:
                return new z1s(nkpVar.a.a(), (f2l) nkpVar.a.p.get());
            case 8:
                dma1 dma1Var = (dma1) nkpVar.a.K.get();
                mur murVar = (mur) nkpVar.a.r.get();
                b0a0 b0a0VarD2 = nkpVar.b.d();
                c8o.l(b0a0VarD2);
                return new qds(dma1Var, murVar, b0a0VarD2);
            case 9:
                return new q8h1(new bbl0(0), nkpVar.a.f());
            case 10:
                return new ucs();
            case 11:
                return new kea0((vu60) nkpVar.j.get());
            case 12:
                c9c0 c9c0VarB3 = nkpVar.b.b();
                c8o.l(c9c0VarB3);
                zc80 zc80Var = new zc80(nkpVar.a(), (byte) 3);
                p5a0 p5a0Var2 = (p5a0) nkpVar.b.i.get();
                c8o.l(p5a0Var2);
                return new xc71(c9c0VarB3, zc80Var, p5a0Var2);
            case 13:
                return new zgs0(nkpVar.a.g(), (vu60) nkpVar.j.get(), nkpVar.g(), nkpVar.a.c());
            case 14:
                sr90 sr90Var5 = nkpVar.a;
                sr90 sr90Var6 = nkpVar.a;
                ukp ukpVar5 = nkpVar.b;
                Observable observableG = sr90Var5.g();
                fy91 fy91VarC = ukpVar5.c();
                b0a0 b0a0VarD3 = ukpVar5.d();
                c8o.l(b0a0VarD3);
                return new m2o0(observableG, fy91VarC, b0a0VarD3, nkpVar.j(), sr90Var6.a(), sr90Var6.c());
            case 15:
                sr90 sr90Var7 = nkpVar.a;
                ukp ukpVar6 = nkpVar.b;
                sr90 sr90Var8 = nkpVar.a;
                Context contextA2 = sr90Var7.a();
                lx91 lx91VarH = ukpVar6.h();
                c8o.l(lx91VarH);
                c9c0 c9c0VarB4 = ukpVar6.b();
                c8o.l(c9c0VarB4);
                g0l g0lVar2 = (g0l) sr90Var8.o.get();
                Observable observableG2 = sr90Var8.g();
                kt91 kt91Var = (kt91) sr90Var8.C.get();
                b0a0 b0a0VarD4 = ukpVar6.d();
                c8o.l(b0a0VarD4);
                ukp ukpVar7 = ukpVar6;
                return new b5a1(contextA2, lx91VarH, c9c0VarB4, g0lVar2, observableG2, kt91Var, b0a0VarD4, new jut(((dj5) ukpVar7.a.b).f(), (je61) ukpVar7.g.get(), (byte) 24), (z1s) nkpVar.h.get(), (kor) sr90Var8.q.get(), (dxz0) sr90Var8.s.get(), (zeu0) sr90Var8.w.get(), (Scheduler) sr90Var8.j.get());
            case 16:
                z1s z1sVar2 = (z1s) nkpVar.h.get();
                c9c0 c9c0VarB5 = nkpVar.b.b();
                c8o.l(c9c0VarB5);
                return new oj70(z1sVar2, c9c0VarB5, nkpVar.a.c());
            case 17:
                sr90 sr90Var9 = nkpVar.a;
                sr90 sr90Var10 = nkpVar.a;
                zwz0 zwz0Var = (zwz0) sr90Var9.t.get();
                g5s g5sVar = new g5s((dma1) sr90Var10.K.get());
                c9c0 c9c0VarB6 = nkpVar.b.b();
                c8o.l(c9c0VarB6);
                return new oj70(zwz0Var, g5sVar, c9c0VarB6, sr90Var10.b());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ukp ukpVar8 = nkpVar.b;
                sr90 sr90Var11 = nkpVar.a;
                c9c0 c9c0VarB7 = ukpVar8.b();
                c8o.l(c9c0VarB7);
                return new zgv0(c9c0VarB7, nkpVar.b.c(), sr90Var11.e(), xqu.a(nkpVar.d), xqu.a(nkpVar.u), sr90Var11.c());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ukp ukpVar9 = nkpVar.b;
                sr90 sr90Var12 = nkpVar.a;
                c9c0 c9c0VarB8 = ukpVar9.b();
                c8o.l(c9c0VarB8);
                return new rgs(c9c0VarB8, new zfr(sr90Var12.d(), new hu90((o4a1) sr90Var12.Q.get(), (byte) 5), (byte) 12), nkpVar.e(), (z1s) nkpVar.h.get(), new cn30(nkpVar.a(), (v5n) nkpVar.d.get(), sr90Var12.e(), sr90Var12.c(), (byte) 1), (www0) sr90Var12.z.get(), (b7d0) nkpVar.e.get());
            case 20:
                ukp ukpVar10 = nkpVar.b;
                sr90 sr90Var13 = nkpVar.a;
                c9c0 c9c0VarB9 = ukpVar10.b();
                c8o.l(c9c0VarB9);
                return new bx60(new hur(new zfr(c9c0VarB9, sr90Var13.e(), (byte) 10), new st60(nkpVar.a(), (z1s) nkpVar.h.get(), (qds) nkpVar.k.get(), (byte) 2), (byte) 5), sr90Var13.b());
            case 21:
                sr90 sr90Var14 = nkpVar.a;
                sr90 sr90Var15 = nkpVar.a;
                ukp ukpVar11 = nkpVar.b;
                mr20 mr20Var = (mr20) sr90Var14.l.get();
                ukp ukpVar12 = ukpVar11;
                yqi0 yqi0Var = new yqi0(((dj5) ukpVar12.a.b).m(), ukpVar12.b.a());
                ser serVarA = nkpVar.a();
                v5n v5nVar2 = (v5n) nkpVar.d.get();
                b0a0 b0a0VarD5 = ukpVar11.d();
                c8o.l(b0a0VarD5);
                tzr0 tzr0Var = new tzr0(serVarA, v5nVar2, b0a0VarD5, sr90Var15.c(), (byte) 3);
                vu60 vu60Var = (vu60) nkpVar.j.get();
                c9c0 c9c0VarB10 = ukpVar11.b();
                c8o.l(c9c0VarB10);
                b0a0 b0a0VarD6 = ukpVar11.d();
                c8o.l(b0a0VarD6);
                return new or90(mr20Var, yqi0Var, tzr0Var, vu60Var, c9c0VarB10, b0a0VarD6, sr90Var15.c());
            case 22:
                sr90 sr90Var16 = nkpVar.a;
                sr90 sr90Var17 = nkpVar.a;
                Context contextA3 = sr90Var16.a();
                kt91 kt91Var2 = (kt91) sr90Var17.C.get();
                zfr zfrVar = new zfr(sr90Var17.d(), new hu90((l4a1) sr90Var17.R.get(), (byte) 4), (byte) 11);
                p4s p4sVarE = nkpVar.e();
                hur hurVar = new hur((dma1) sr90Var17.K.get(), (yqg) sr90Var17.m.get(), (byte) 7);
                ucs ucsVar = (ucs) nkpVar.m.get();
                f2l f2lVar = (f2l) sr90Var17.p.get();
                z1s z1sVar3 = (z1s) nkpVar.h.get();
                yqg yqgVar = (yqg) sr90Var17.m.get();
                q8h1 q8h1Var = (q8h1) nkpVar.l.get();
                q8h1 q8h1Var2 = (q8h1) nkpVar.l.get();
                c9c0 c9c0VarB11 = nkpVar.b.b();
                c8o.l(c9c0VarB11);
                return new rj70(contextA3, kt91Var2, zfrVar, p4sVarE, hurVar, ucsVar, f2lVar, z1sVar3, yqgVar, q8h1Var, q8h1Var2, c9c0VarB11, sr90Var17.g(), (Scheduler) sr90Var17.j.get(), sr90Var17.c());
            case 23:
                jly0 jly0Var2 = nkpVar.A;
                ukp ukpVar13 = nkpVar.b;
                ynb0 ynb0VarA2 = xqu.a(jly0Var2);
                c9c0 c9c0VarB12 = ukpVar13.b();
                c8o.l(c9c0VarB12);
                b0a0 b0a0VarD7 = ukpVar13.d();
                c8o.l(b0a0VarD7);
                return new ul30(ynb0VarA2, c9c0VarB12, b0a0VarD7, (q8n) nkpVar.a.f.get());
            case 24:
                ukp ukpVar14 = nkpVar.b;
                sr90 sr90Var18 = nkpVar.a;
                ukp ukpVar15 = ukpVar14;
                rzh1 rzh1Var = new rzh1(((dj5) ukpVar15.a.b).m(), ukpVar15.b.a());
                q8n q8nVarB2 = sr90Var18.b();
                q8n q8nVar = (q8n) sr90Var18.h.get();
                kt91 kt91Var3 = (kt91) sr90Var18.C.get();
                kp00 kp00Var = new kp00(nkpVar.a(), sr90Var18.c(), (byte) 22);
                cn30 cn30Var = new cn30(nkpVar.a(), (v5n) nkpVar.d.get(), sr90Var18.e(), sr90Var18.c(), (byte) 0);
                c9c0 c9c0VarB13 = nkpVar.b.b();
                c8o.l(c9c0VarB13);
                return new yl30(rzh1Var, q8nVarB2, q8nVar, kt91Var3, kp00Var, cn30Var, c9c0VarB13, (vl30) nkpVar.z.get());
            case 25:
                return new vl30(nkpVar.a.f(), nkpVar.a.c());
            case 26:
                bos bosVar = (bos) nkpVar.b.g.get();
                c8o.l(bosVar);
                sr90 sr90Var19 = nkpVar.a;
                yfu yfuVar = new yfu(sr90Var19.d(), new hu90((n4a1) sr90Var19.T.get(), (byte) 10), (byte) 23);
                b0a0 b0a0VarD8 = nkpVar.b.d();
                c8o.l(b0a0VarD8);
                return new bx60(bosVar, new t5a0(yfuVar, b0a0VarD8));
            case 27:
                sr90 sr90Var20 = nkpVar.a;
                sr90 sr90Var21 = nkpVar.a;
                Flowable flowable2 = (Flowable) sr90Var20.J.get();
                ukp ukpVar16 = nkpVar.b;
                c9c0 c9c0VarB14 = ukpVar16.b();
                c8o.l(c9c0VarB14);
                tzo tzoVar = new tzo(flowable2, c9c0VarB14, sr90Var20.g(), (g0l) sr90Var20.o.get());
                c9c0 c9c0VarB15 = ukpVar16.b();
                c8o.l(c9c0VarB15);
                g5s g5sVar2 = new g5s((dma1) sr90Var21.K.get());
                eis eisVar = (eis) nkpVar.D.get();
                dis disVar = (dis) nkpVar.E.get();
                vun vunVar = new vun((zir0) ukpVar16.W.get(), (byte) 16);
                p5a0 p5a0Var3 = (p5a0) ukpVar16.i.get();
                c8o.l(p5a0Var3);
                return new nqw0(new l6s(tzoVar, c9c0VarB15, new qy40(g5sVar2, eisVar, disVar, vunVar, p5a0Var3, sr90Var20.d())), new l6s(nkpVar.i(), new g5s((dma1) sr90Var21.K.get()), (eis) nkpVar.D.get()), sr90Var21.b());
            case 28:
                return new eis();
            case 29:
                c9c0 c9c0VarB16 = nkpVar.b.b();
                c8o.l(c9c0VarB16);
                return new dis(c9c0VarB16, nkpVar.a.b());
            case 30:
                ukp ukpVar17 = nkpVar.b;
                ukp ukpVar18 = nkpVar.b;
                sr90 sr90Var22 = nkpVar.a;
                ukp ukpVar19 = ukpVar17;
                kg61 kg61Var = new kg61(((dj5) ukpVar19.a.b).m(), ukpVar19.b.a());
                kt91 kt91Var4 = (kt91) sr90Var22.C.get();
                b0a0 b0a0VarD9 = ukpVar18.d();
                c8o.l(b0a0VarD9);
                Observable observableG3 = sr90Var22.g();
                Scheduler scheduler2 = (Scheduler) sr90Var22.j.get();
                Flowable flowable3 = (Flowable) sr90Var22.J.get();
                c9c0 c9c0VarB17 = ukpVar18.b();
                c8o.l(c9c0VarB17);
                return new k1a0(kg61Var, kt91Var4, b0a0VarD9, observableG3, scheduler2, flowable3, c9c0VarB17, nkpVar.d(), sr90Var22.a());
            case 31:
                sr90 sr90Var23 = nkpVar.a;
                sr90 sr90Var24 = nkpVar.a;
                ukp ukpVar20 = nkpVar.b;
                mr20 mr20Var2 = (mr20) sr90Var23.l.get();
                c9c0 c9c0VarB18 = ukpVar20.b();
                c8o.l(c9c0VarB18);
                fy91 fy91VarC2 = ukpVar20.c();
                b0a0 b0a0VarD10 = ukpVar20.d();
                c8o.l(b0a0VarD10);
                Context contextA4 = sr90Var24.a();
                mr20 mr20VarE2 = sr90Var24.e();
                gma1 gma1Var2 = sr90Var24.d;
                c8o.l(gma1Var2);
                j6d0 j6d0Var = new j6d0(contextA4, mr20VarE2, new ucd(gma1Var2.a(), (byte) 2));
                p4s p4sVarE2 = nkpVar.e();
                c9c0 c9c0VarB19 = ukpVar20.b();
                c8o.l(c9c0VarB19);
                return new k1a0(mr20Var2, c9c0VarB18, fy91VarC2, b0a0VarD10, j6d0Var, p4sVarE2, new ox90(c9c0VarB19, nkpVar.a(), nkpVar.k()), (yqg) sr90Var24.m.get(), sr90Var24.c());
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object D() {
        byte b = this.b;
        if (b == 0) {
            return new okp(this);
        }
        if (b == 1) {
            return new pkp();
        }
        if (b == 2) {
            return new qkp(this);
        }
        if (b == 3) {
            return new rkp(this);
        }
        if (b == 4) {
            return pzm.h((mos) ((is90) ((tnm) this.c).b).j.get());
        }
        if (b == 5) {
            return new skp(this);
        }
        jah.e(b);
        return null;
    }

    public static /* bridge */ /* synthetic */ h72 a(chp chpVar) {
        return (h72) chpVar.c;
    }

    public static /* bridge */ /* synthetic */ ip31 b(chp chpVar) {
        return (ip31) chpVar.c;
    }

    public static /* bridge */ /* synthetic */ gkp c(chp chpVar) {
        return (gkp) chpVar.c;
    }

    private final Object d() {
        u9p u9pVar = (u9p) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                ys10 ys10Var = (ys10) u9pVar.C;
                ys10 ys10Var2 = (ys10) u9pVar.C;
                xfx xfxVarA0 = ys10Var.a0();
                c8o.l(xfxVarA0);
                sap sapVar = (sap) u9pVar.y.get();
                vy90 vy90VarE0 = ys10Var2.E0();
                c8o.l(vy90VarE0);
                Flowable flowable = (Flowable) u9pVar.a.get();
                fl3 fl3VarK = ys10Var2.K();
                c8o.l(fl3VarK);
                yl1 yl1Var = new yl1(flowable, fl3VarK, (lik1) u9pVar.o.get());
                ynb0 ynb0VarA = xqu.a((chp) u9pVar.Q);
                ynb0 ynb0VarA2 = xqu.a((chp) u9pVar.R);
                Flowable flowable2 = (Flowable) u9pVar.a.get();
                Flowable flowable3 = (Flowable) u9pVar.B.get();
                w9u0 w9u0Var = (w9u0) u9pVar.b.get();
                Consumer consumer = (Consumer) u9pVar.S.get();
                luk lukVarW = ys10Var2.w();
                c8o.l(lukVarW);
                jn4 jn4Var = new jn4(lukVarW);
                dma1 dma1VarM0 = ys10Var2.m0();
                c8o.l(dma1VarM0);
                mo51 mo51Var = new mo51(flowable2, flowable3, w9u0Var, consumer, jn4Var, dma1VarM0);
                tp91 tp91Var = ys10Var2.y().e;
                c8o.m(tp91Var);
                u3q u3qVar = ys10Var2.y().f;
                c8o.m(u3qVar);
                hj91 hj91VarA = j991.A(tp91Var, u3qVar.a(), new wb00((p2p0) u9pVar.g.get(), (byte) 3));
                Flowable flowable4 = (Flowable) u9pVar.a.get();
                xyl1 xyl1VarP0 = ys10Var2.p0();
                c8o.l(xyl1VarP0);
                up41 up41Var = new up41(xyl1VarP0, (byte) 12);
                kt91 kt91VarJ = ys10Var2.j();
                c8o.l(kt91VarJ);
                dm91 dm91Var = new dm91(hj91VarA, flowable4, up41Var, new a78(kt91VarJ));
                s691 s691Var = new s691(u9pVar.u(), (Flowable) u9pVar.f.get(), ((Flowable) u9pVar.a.get()).j(mo9.O0), (w9u0) u9pVar.b.get());
                k691 k691Var = new k691((Flowable) u9pVar.a.get(), (Flowable) u9pVar.f.get(), (w9u0) u9pVar.b.get(), nrq0.a, (h691) u9pVar.r.get());
                dx0 dx0Var = new dx0((Flowable) u9pVar.a.get(), (xbu0) u9pVar.T.get());
                Flowable flowable5 = (Flowable) u9pVar.a.get();
                xh71 xh71VarZ = ys10Var2.z();
                c8o.l(xh71VarZ);
                fbm fbmVarL = ys10Var2.L();
                c8o.l(fbmVarL);
                u601 u601VarT = ys10Var2.t();
                c8o.l(u601VarT);
                hq41 hq41VarD = ys10Var2.D();
                c8o.l(hq41VarD);
                me30 me30VarK = ys10Var2.k();
                c8o.l(me30VarK);
                Flowable flowableF = ys10Var2.f();
                c8o.l(flowableF);
                f771 f771VarO = ys10Var2.O();
                c8o.l(f771VarO);
                poj0 poj0Var = new poj0((Object) hq41VarD, (Object) me30VarK, (Object) flowableF, (Object) f771VarO, (byte) 15);
                f771 f771VarO2 = ys10Var2.O();
                c8o.l(f771VarO2);
                q8n q8nVarD = ys10Var2.d();
                c8o.l(q8nVarD);
                iac0 iac0Var = (iac0) u9pVar.z.get();
                luk lukVarW2 = ys10Var2.w();
                c8o.l(lukVarW2);
                o671 o671Var = new o671(flowable5, xh71VarZ, fbmVarL, u601VarT, poj0Var, f771VarO2, q8nVarD, iac0Var, lukVarW2);
                c9c0 c9c0VarL = ys10Var2.l();
                c8o.l(c9c0VarL);
                g5p0 g5p0VarU = ys10Var2.u();
                c8o.l(g5p0VarU);
                waz0 waz0VarY = ys10Var2.Y();
                c8o.l(waz0VarY);
                v6z0 v6z0Var = new v6z0(c9c0VarL, g5p0VarU, waz0VarY);
                Flowable flowable6 = (Flowable) u9pVar.a.get();
                d0r d0rVar = (d0r) u9pVar.m.get();
                boolean zBooleanValue = ((Boolean) u9pVar.U.get()).booleanValue();
                w9u0 w9u0Var2 = (w9u0) u9pVar.b.get();
                u961 u961VarK0 = ys10Var2.k0();
                ajq0 ajq0VarT0 = ys10Var2.t0();
                c3s c3sVarB = ys10Var2.B();
                c8o.l(c3sVarB);
                dma1 dma1VarP0 = ys10Var2.P0();
                c8o.l(dma1VarP0);
                e68 e68Var = new e68(flowable6, d0rVar, zBooleanValue, w9u0Var2, u961VarK0, ajq0VarT0, c3sVarB, new in01(dma1VarP0));
                FlowableMap flowableMapM = u9pVar.m();
                lid lidVarL0 = ys10Var2.L0();
                c8o.l(lidVarL0);
                lkd lkdVarV = mid.v(lidVarL0);
                jo91 jo91Var = ys10Var2.y().b;
                c8o.m(jo91Var);
                ip91 ip91Var = ys10Var2.y().a;
                c8o.m(ip91Var);
                Scheduler schedulerO = ys10Var2.o();
                c8o.l(schedulerO);
                FlowableObserveOn flowableObserveOnL = Flowable.h(flowableMapM.X(new jl00(lkdVarV, (byte) 3)), jo91Var.a() ? flowableMapM.X(new il00(ip91Var, (byte) 1)) : Flowable.I(Boolean.FALSE), ws10.b).L(schedulerO);
                FlowableJust flowableJustY = k9o0.y((hnl) u9pVar.i.get());
                Flowable flowable7 = (Flowable) u9pVar.a.get();
                o241 o241VarI = ys10Var2.i();
                c8o.l(o241VarI);
                uwh uwhVarJ = ys10Var2.J();
                c8o.l(uwhVarJ);
                lid lidVarL1 = ys10Var2.L0();
                c8o.l(lidVarL1);
                lkd lkdVarV2 = mid.v(lidVarL1);
                pqq0 pqq0Var = (pqq0) u9pVar.V.get();
                yqg yqgVarA = ys10Var2.a();
                c8o.l(yqgVarA);
                Scheduler schedulerO2 = ys10Var2.o();
                c8o.l(schedulerO2);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedK = ioo1.K(flowable7, o241VarI, uwhVarJ, lkdVarV2, pqq0Var, yqgVarA, schedulerO2);
                jo91 jo91Var2 = ys10Var2.y().b;
                c8o.m(jo91Var2);
                return new at10(xfxVarA0, sapVar, vy90VarE0, yl1Var, ynb0VarA, ynb0VarA2, mo51Var, dm91Var, s691Var, k691Var, dx0Var, o671Var, v6z0Var, e68Var, flowableObserveOnL, flowableJustY, flowableDistinctUntilChangedK, jo91Var2, (n6r0) u9pVar.t.get(), (lik1) u9pVar.o.get(), w3p0.g((jnk0) u9pVar.q.get()));
            case 1:
                return new sap(this, (byte) 1);
            case 2:
                return k9o0.B((q2p0) u9pVar.D);
            case 3:
                return k9o0.z((q2p0) u9pVar.D);
            case 4:
                return ((q2p0) u9pVar.D).f();
            case 5:
                return f2u0.B(u9pVar.u(), (Flowable) u9pVar.d.get(), (Flowable) u9pVar.e.get(), u9pVar.d());
            case 6:
                jly0 jly0Var = u9pVar.a;
                ys10 ys10Var3 = (ys10) u9pVar.C;
                Flowable flowable8 = (Flowable) jly0Var.get();
                Scheduler schedulerO3 = ys10Var3.o();
                c8o.l(schedulerO3);
                yqg yqgVarA2 = ys10Var3.a();
                c8o.l(yqgVarA2);
                return f2u0.z(flowable8, schedulerO3, yqgVarA2, u9pVar.d());
            case 7:
                return f2u0.y((Flowable) u9pVar.a.get(), u9pVar.d());
            case 8:
                return new a62((p2p0) u9pVar.g.get(), (byte) 3);
            case 9:
                return ((q2p0) u9pVar.D).j();
            case 10:
                return k9o0.r((q2p0) u9pVar.D);
            case 11:
                return new l0y((p2p0) u9pVar.g.get(), (byte) 2);
            case 12:
                return new k0y((p2p0) u9pVar.g.get(), (byte) 2);
            case 13:
                return ((q2p0) u9pVar.D).g();
            case 14:
                return k9o0.t((q2p0) u9pVar.D);
            case 15:
                lzn0 lzn0VarC = ((ys10) u9pVar.C).c();
                c8o.l(lzn0VarC);
                return aan0.p(lzn0VarC);
            case 16:
                jly0 jly0Var2 = u9pVar.o;
                ys10 ys10Var4 = (ys10) u9pVar.C;
                lik1 lik1Var = (lik1) jly0Var2.get();
                ssf1 ssf1VarP = ys10Var4.p();
                c8o.l(ssf1VarP);
                c3s c3sVarB2 = ys10Var4.B();
                c8o.l(c3sVarB2);
                luk lukVarW3 = ys10Var4.w();
                c8o.l(lukVarW3);
                an4 an4Var = new an4(false, lukVarW3);
                luk lukVarW4 = ys10Var4.w();
                c8o.l(lukVarW4);
                return new cmf1(lik1Var, ssf1VarP, c3sVarB2, an4Var, new uu4(false, lukVarW4), ys10Var4.q());
            case 17:
                return ((q2p0) u9pVar.D).e();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                jly0 jly0Var3 = u9pVar.q;
                ys10 ys10Var5 = (ys10) u9pVar.C;
                jnk0 jnk0Var = (jnk0) jly0Var3.get();
                gw70 gw70VarB = ys10Var5.b();
                c8o.l(gw70VarB);
                d0r d0rVar2 = (d0r) u9pVar.m.get();
                luk lukVarW5 = ys10Var5.w();
                c8o.l(lukVarW5);
                return new yxb0(jnk0Var, gw70VarB, d0rVar2, new fn4(false, lukVarW5));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Flowable flowable9 = (Flowable) u9pVar.a.get();
                Flowable flowable10 = (Flowable) u9pVar.d.get();
                c3s c3sVarB3 = ((ys10) u9pVar.C).B();
                c8o.l(c3sVarB3);
                return new jnk0(flowable9, flowable10, c3sVarB3);
            case 20:
                Flowable flowable11 = (Flowable) u9pVar.a.get();
                Flowable flowable12 = (Flowable) u9pVar.f.get();
                w9u0 w9u0Var3 = (w9u0) u9pVar.b.get();
                h691 h691Var = (h691) u9pVar.r.get();
                o241 o241VarI2 = ((ys10) u9pVar.C).i();
                c8o.l(o241VarI2);
                return new ktf1(flowable11, flowable12, w9u0Var3, h691Var, o241VarI2, (chp) u9pVar.F, u9pVar.k());
            case 21:
                ljg ljgVarH0 = ((ys10) u9pVar.C).H0();
                c8o.l(ljgVarH0);
                luk lukVarW6 = ((ys10) u9pVar.C).w();
                c8o.l(lukVarW6);
                return new bt10(ljgVarH0, new wm4(false, false, lukVarW6));
            case 22:
                s4p0 s4p0VarR = ((ys10) u9pVar.C).R();
                c8o.l(s4p0VarR);
                return w3p0.B(s4p0VarR);
            case 23:
                return ((q2p0) u9pVar.D).h();
            case 24:
                return ((q2p0) u9pVar.D).i();
            case 25:
                Flowable flowable13 = (Flowable) u9pVar.a.get();
                Flowable flowable14 = (Flowable) u9pVar.f.get();
                w9u0 w9u0Var4 = (w9u0) u9pVar.b.get();
                h691 h691Var2 = (h691) u9pVar.r.get();
                o241 o241VarI3 = ((ys10) u9pVar.C).i();
                c8o.l(o241VarI3);
                return new ekf1(flowable13, flowable14, w9u0Var4, h691Var2, o241VarI3, (chp) u9pVar.F, u9pVar.k());
            case 26:
                return new FlowableOnBackpressureLatest((PublishProcessor) u9pVar.u.get());
            case 27:
                return new PublishProcessor();
            case 28:
                return new tap(this, (byte) 1);
            case 29:
                return ((ys10) u9pVar.C).b0();
            case 30:
                a1r0 a1r0VarC = ((ys10) u9pVar.C).C();
                c8o.l(a1r0VarC);
                return a1r0VarC;
            case 31:
                return w3p0.w(((ys10) u9pVar.C).H(), (q2p0) u9pVar.D, (o2p0) u9pVar.s.get());
            case 32:
                return new a4f0((Flowable) u9pVar.a.get(), (Flowable) u9pVar.f.get(), (w9u0) u9pVar.b.get());
            case 33:
                return new ww9(u9pVar.n());
            case 34:
                a1g1 a1g1Var = new a1g1(((ys10) u9pVar.C).F(), (byte) 11);
                Scheduler schedulerO4 = ((ys10) u9pVar.C).o();
                c8o.l(schedulerO4);
                return new h280(a1g1Var, schedulerO4);
            case 35:
                s4p0 s4p0VarR2 = ((ys10) u9pVar.C).R();
                c8o.l(s4p0VarR2);
                return w3p0.z(s4p0VarR2);
            case 36:
                s4p0 s4p0VarR3 = ((ys10) u9pVar.C).R();
                c8o.l(s4p0VarR3);
                return w3p0.A(s4p0VarR3);
            case 37:
                jly0 jly0Var4 = u9pVar.a;
                ys10 ys10Var6 = (ys10) u9pVar.C;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var4.get());
                z6k0 z6k0VarM0 = ys10Var6.M0();
                c8o.l(z6k0VarM0);
                mnk0 mnk0VarM = ys10Var6.m();
                c8o.l(mnk0VarM);
                rxj0 rxj0VarG0 = ys10Var6.G0();
                c8o.l(rxj0VarG0);
                return new k6k0(flowableDistinctUntilChangedD, z6k0VarM0, mnk0VarM, rxj0VarG0);
            case 38:
                jly0 jly0Var5 = u9pVar.a;
                ys10 ys10Var7 = (ys10) u9pVar.C;
                Flowable flowable15 = (Flowable) jly0Var5.get();
                c9c0 c9c0VarL2 = ys10Var7.l();
                c8o.l(c9c0VarL2);
                ijr ijrVarJ0 = ys10Var7.j0();
                c8o.l(ijrVarJ0);
                return new s3a(flowable15, c9c0VarL2, ijrVarJ0, u9pVar.k());
            case 39:
                jly0 jly0Var6 = u9pVar.a;
                ys10 ys10Var8 = (ys10) u9pVar.C;
                Flowable flowable16 = (Flowable) jly0Var6.get();
                c9c0 c9c0VarL3 = ys10Var8.l();
                c8o.l(c9c0VarL3);
                ijr ijrVarJ1 = ys10Var8.j0();
                c8o.l(ijrVarJ1);
                ip91 ip91Var2 = ys10Var8.y().a;
                c8o.m(ip91Var2);
                jp91 jp91Var = ys10Var8.y().d;
                c8o.m(jp91Var);
                mzr0 mzr0VarA = jp91Var.a((iac0) u9pVar.z.get(), (lik1) u9pVar.o.get(), (n6r0) u9pVar.t.get());
                fl3 fl3VarK2 = ys10Var8.K();
                c8o.l(fl3VarK2);
                lik1 lik1Var2 = (lik1) u9pVar.o.get();
                w9u0 w9u0Var5 = (w9u0) u9pVar.b.get();
                jo91 jo91Var3 = ys10Var8.y().b;
                c8o.m(jo91Var3);
                return new p621(flowable16, c9c0VarL3, ijrVarJ1, ip91Var2, mzr0VarA, fl3VarK2, lik1Var2, w9u0Var5, jo91Var3);
            case 40:
                return k9o0.v((q2p0) u9pVar.D);
            case 41:
                return f2u0.C(u9pVar.u(), (Flowable) u9pVar.A.get(), (Flowable) u9pVar.e.get(), u9pVar.d());
            case 42:
                jly0 jly0Var7 = u9pVar.a;
                ys10 ys10Var9 = (ys10) u9pVar.C;
                Flowable flowable17 = (Flowable) jly0Var7.get();
                Scheduler schedulerO5 = ys10Var9.o();
                c8o.l(schedulerO5);
                yqg yqgVarA3 = ys10Var9.a();
                c8o.l(yqgVarA3);
                return f2u0.A(flowable17, schedulerO5, yqgVarA3, u9pVar.d());
            case 43:
                return new lrj0((q2p0) u9pVar.D, (byte) 21);
            case 44:
                return k9o0.A((q2p0) u9pVar.D);
            case 45:
                return Boolean.valueOf(((q2p0) u9pVar.D).a());
            case 46:
                return k9o0.x((q2p0) u9pVar.D);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object e() {
        uw0 uw0Var = (uw0) this.c;
        z6x z6xVar = z6x.a;
        byte b = this.b;
        switch (b) {
            case 0:
                jly0 jly0Var = (jly0) uw0Var.h;
                mh20 mh20Var = (mh20) uw0Var.e;
                nh20 nh20Var = (nh20) uw0Var.d;
                h6v0 h6v0Var = (h6v0) ((i6v0) jly0Var.get()).a.b.get();
                c8o.m(h6v0Var);
                chp chpVar = (chp) uw0Var.g;
                dlg1 dlg1VarS = uw0Var.S();
                y5v0 y5v0Var = (y5v0) nh20Var.h.get();
                c8o.l(y5v0Var);
                y390 y390Var = (y390) nh20Var.m.get();
                c8o.l(y390Var);
                String string = ((Bundle) ((jly0) uw0Var.i).get()).getString("uri", "");
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-podcast-findinshow";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = string;
                y6h1 y6h1VarA = x6h1VarI.a();
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(z6xVar);
                arrayList.add(y6h1VarA);
                wr00 wr00VarA = y390Var.a(mh20Var, new r6h1(arrayList, (u8h1) null));
                yh2 yh2Var = (yh2) nh20Var.b.get();
                c8o.l(yh2Var);
                aod aodVar = new aod(wr00VarA, yh2Var, (byte) 29);
                e7p0 e7p0Var = (e7p0) nh20Var.d.get();
                c8o.l(e7p0Var);
                luk lukVar = (luk) nh20Var.q.get();
                c8o.l(lukVar);
                eo4 eo4Var = new eo4(false, false, lukVar);
                c3s c3sVar = (c3s) nh20Var.v.get();
                c8o.l(c3sVar);
                Scheduler scheduler = (Scheduler) nh20Var.w.get();
                c8o.l(scheduler);
                oxr oxrVar = new oxr(h6v0Var, chpVar, dlg1VarS, y5v0Var, aodVar, e7p0Var, eo4Var, c3sVar, mh20Var, scheduler);
                lzn0 lzn0Var = (lzn0) nh20Var.n.get();
                c8o.l(lzn0Var);
                dlg1 dlg1VarS2 = uw0Var.S();
                ayl aylVar = (ayl) nh20Var.c.get();
                c8o.l(aylVar);
                zvu zvuVar = (zvu) nh20Var.p.get();
                c8o.l(zvuVar);
                muu muuVarM = uou0.m(zvuVar, mh20Var);
                lik1 lik1Var = (lik1) ((chp) uw0Var.g).get();
                drp0 drp0Var = (drp0) nh20Var.G.get();
                c8o.l(drp0Var);
                tjq tjqVar = new tjq(dlg1VarS2, aylVar, muuVarM, lik1Var, drp0Var);
                lik1 lik1Var2 = (lik1) ((chp) uw0Var.g).get();
                o241 o241Var = (o241) nh20Var.g.get();
                c8o.l(o241Var);
                a6z a6zVar = (a6z) nh20Var.i.get();
                c8o.l(a6zVar);
                c8o.l((zxl) nh20Var.A.get());
                c8o.l((kt91) nh20Var.l.get());
                xqu.a((chp) uw0Var.X);
                dlg1 dlg1VarS3 = uw0Var.S();
                i4q i4qVar = (i4q) nh20Var.j.get();
                c8o.l(i4qVar);
                waz0 waz0Var = (waz0) nh20Var.F.get();
                c8o.l(waz0Var);
                tzo tzoVar = new tzo(new p68(lik1Var2, o241Var, a6zVar, dlg1VarS3, i4qVar, false, waz0Var), (byte) 7);
                rh20 rh20Var = rh20.b;
                xh71 xh71Var = (xh71) nh20Var.r.get();
                c8o.l(xh71Var);
                nl51 nl51Var = new nl51(xh71Var, (byte) 7);
                dlg1 dlg1VarS4 = uw0Var.S();
                lik1 lik1Var3 = (lik1) ((chp) uw0Var.g).get();
                oj3 oj3Var = (oj3) nh20Var.D.get();
                c8o.l(oj3Var);
                return new rxr(oxrVar, lzn0Var, tjqVar, tzoVar, rh20Var, nl51Var, dlg1VarS4, lik1Var3, oj3Var);
            case 1:
                skm skmVar = (skm) ((nh20) uw0Var.d).u.get();
                c8o.l(skmVar);
                ruz ruzVarA = ((cyp) ((jly0) uw0Var.f).get()).a();
                mh20 mh20Var2 = (mh20) uw0Var.e;
                gn10 gn10VarR = j310.r(mh20Var2);
                String str = (String) ((nh20) uw0Var.d).y.get();
                c8o.l(str);
                return skmVar.a(ruzVarA, d8.b(gn10VarR, str, (lik1) ((chp) uw0Var.g).get(), wwo1.D(mh20Var2)), ((cyp) ((jly0) uw0Var.f).get()).d());
            case 2:
                t8u0 t8u0Var = (t8u0) ((nh20) uw0Var.d).o.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(((zf30) ((mh20) uw0Var.e)).s1);
            case 3:
                return d8.c((mh20) uw0Var.e);
            case 4:
                n6r0 n6r0VarP = kmq0.p((mh20) uw0Var.e);
                lik1 lik1Var4 = (lik1) ((chp) uw0Var.g).get();
                String string2 = ((Bundle) ((jly0) uw0Var.i).get()).getString("uri", "");
                r6h1 r6h1Var2 = r6h1.c;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-podcast-findinshow";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.d = string2;
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(z6xVar);
                arrayList2.add(y6h1VarA2);
                return new sfs(n6r0VarP, lik1Var4, new r6h1(arrayList2, (u8h1) null));
            case 5:
                return sd30.p((mh20) uw0Var.e);
            case 6:
                return qh20.a;
            case 7:
                rxr rxrVar = (rxr) ((jly0) uw0Var.c).get();
                luk lukVar2 = (luk) ((nh20) uw0Var.d).q.get();
                c8o.l(lukVar2);
                return new nlu(rxrVar, new do4(lukVar2).c());
            case 8:
                nh20 nh20Var2 = (nh20) uw0Var.d;
                lzn0 lzn0Var2 = (lzn0) nh20Var2.n.get();
                c8o.l(lzn0Var2);
                izr izrVar = (izr) ((jly0) uw0Var.b).get();
                yix0 yix0Var = (yix0) nh20Var2.e.get();
                c8o.l(yix0Var);
                so soVar = new so(yix0Var, (mh20) uw0Var.e, (byte) 9);
                i8h1 i8h1Var = (i8h1) nh20Var2.t.get();
                c8o.l(i8h1Var);
                vnd1 vnd1Var = new vnd1(i8h1Var, new fjl0(((Bundle) ((jly0) uw0Var.i).get()).getString("uri", "")));
                Scheduler scheduler2 = (Scheduler) nh20Var2.w.get();
                c8o.l(scheduler2);
                return new gas(new gzr(lzn0Var2, izrVar, soVar, vnd1Var, scheduler2), new bm00((khp) ((jly0) uw0Var.N0).get(), (byte) 5), ((Boolean) ((nh20) uw0Var.d).f.get()).booleanValue());
            case 9:
                dzr dzrVar = (dzr) ((jly0) uw0Var.Z).get();
                Scheduler scheduler3 = (Scheduler) ((nh20) uw0Var.d).x.get();
                c8o.l(scheduler3);
                return new izr(dzrVar, scheduler3);
            case 10:
                nh20 nh20Var3 = (nh20) uw0Var.d;
                nh20 nh20Var4 = (nh20) uw0Var.d;
                n481 n481Var = (n481) nh20Var3.B.get();
                c8o.l(n481Var);
                String string3 = ((Bundle) ((jly0) uw0Var.i).get()).getString("uri", "");
                Set set = s4b1.f;
                String strH = uic.x(string3).h();
                Boolean bool = Boolean.TRUE;
                Map mapJ = sqg0.J(new mmr0[]{new mmr0("link", bool), new mmr0("inCollection", bool), new mmr0("name", bool)});
                Map mapJ2 = sqg0.J(new mmr0[]{new mmr0("link", bool), new mmr0("name", bool), new mmr0("offline", bool), new mmr0("isNew", bool), new mmr0("isInListenLater", bool), new mmr0("isPlayed", bool), new mmr0("length", bool), new mmr0("timeLeft", bool), new mmr0("publishDate", bool), new mmr0("playable", bool), new mmr0("available", bool), new mmr0("covers", bool), new mmr0("freezeFrames", bool), new mmr0("manifestId", bool), new mmr0("mediaTypeEnum", bool), new mmr0("isExplicit", bool), new mmr0("is19PlusOnly", bool), new mmr0("backgroundable", bool), new mmr0("description", bool), new mmr0("type", bool), new mmr0("syncProgress", bool), new mmr0("isMusicAndTalk", bool), new mmr0("isCurated", bool)});
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(4);
                smc0VarN.add(22);
                smc0VarN.add(58);
                smc0VarN.add(239);
                smc0 smc0VarK = k4p1.k(smc0VarN);
                c8o.m(smc0VarK);
                e3z.Companion.getClass();
                aqa0.Companion.getClass();
                e3z e3zVar = new e3z(new aqa0(sqg0.U(mapJ)), smc0VarK, sqg0.U(mapJ2));
                y381.Companion.getClass();
                y381 y381Var = new y381(e3zVar, (x381) null, (aqa0) null);
                t881.Companion.getClass();
                pos posVar = new pos(strH, new t881(y381Var));
                o241 o241Var2 = (o241) nh20Var4.g.get();
                c8o.l(o241Var2);
                o6v0 o6v0Var = (o6v0) ((jly0) ((i6v0) ((jly0) uw0Var.h).get()).a.d).get();
                c8o.m(o6v0Var);
                fuw0 fuw0Var = (fuw0) nh20Var4.z.get();
                c8o.l(fuw0Var);
                return new dzr(n481Var, posVar, o241Var2, o6v0Var, fuw0Var);
            case 11:
                return new khp(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object f() {
        toj0 toj0Var = (toj0) this.c;
        byte b = this.b;
        if (b == 0) {
            t8u0 t8u0Var = (t8u0) ((th20) toj0Var.b).f.get();
            c8o.l(t8u0Var);
            return kmq0.x((q7r0) toj0Var.c, t8u0Var);
        }
        if (b == 1) {
            return new t1p(this, (byte) 4);
        }
        if (b == 2) {
            return new s1p(this, (byte) 5);
        }
        if (b == 3) {
            return new map(this, (byte) 1);
        }
        jah.e(b);
        return null;
    }

    private final Object g() {
        ip31 ip31Var = (ip31) this.c;
        gl20 gl20Var = (gl20) ip31Var.b;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) gl20Var.i.get());
        }
        if (b == 1) {
            return cwl1.C((q7r0) ip31Var.d);
        }
        if (b != 2) {
            if (b == 3) {
                return new lhp();
            }
            if (b == 4) {
                return new mhp(this);
            }
            jah.e(b);
            return null;
        }
        Context context = (Context) gl20Var.c.get();
        c8o.l(context);
        nfa0 nfa0Var = (nfa0) gl20Var.b.get();
        c8o.l(nfa0Var);
        ut71 ut71Var = (ut71) gl20Var.p.get();
        c8o.l(ut71Var);
        il20 il20Var = (il20) ip31Var.c;
        q8n q8nVar = (q8n) gl20Var.n.get();
        c8o.l(q8nVar);
        return new mzr(context, nfa0Var, ut71Var, il20Var, q8nVar);
    }

    private final Object h() {
        t7p t7pVar = (t7p) this.c;
        cx20 cx20Var = (cx20) t7pVar.b;
        byte b = this.b;
        if (b == 0) {
            Context context = (Context) cx20Var.e.get();
            c8o.l(context);
            lzn0 lzn0Var = (lzn0) cx20Var.d.get();
            c8o.l(lzn0Var);
            return new ax20(context, new tdo(brt.x(), (los) ((jly0) t7pVar.a).get(), lzn0Var), new nfb((byte) 11, false));
        }
        if (b == 1) {
            return pzm.h((mos) cx20Var.b.get());
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        i8h1 i8h1Var = (i8h1) cx20Var.c.get();
        c8o.l(i8h1Var);
        return i8h1Var;
    }

    private final Object i() {
        int i;
        gn10 gn10Var = mno1.j0;
        fip fipVar = (fip) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                j230 j230Var = fipVar.a;
                boolean zN = fipVar.b.n();
                dbr0 dbr0Var = (e5b0) fipVar.h.get();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0 p6r0VarG1 = yon1.G1("PLAYLIST_FOLDER", "playlist/folder", 1462, "playlist");
                Parcelable.Creator creator = lik1.CREATOR;
                dbr0 bn70Var = new bn70(p6r0VarG1, new lik1(j230Var.a), (nar0) null);
                dbr0 j0c0Var = new j0c0(gn10Var);
                if (zN) {
                    i = 2131964119;
                } else {
                    if (zN) {
                        eg.o();
                        return null;
                    }
                    i = 2131964167;
                }
                return new cbr0(new dbr0[]{bn70Var, j0c0Var, new yxe1(new jx21(i)), new fja(gvn0.c), new ly3(), new t1r0(true), new s9h1(14, true, false, false), dbr0Var}, false);
            case 1:
                q130 q130Var = fipVar.b;
                q130 q130Var2 = fipVar.b;
                q0d0 q0d0VarN = q130Var.N();
                c8o.l(q0d0VarN);
                q8n q8nVarD = q130Var2.d();
                c8o.l(q8nVarD);
                l27 l27Var = new l27(q8nVarD, fipVar.d());
                q8n q8nVarD2 = q130Var2.d();
                c8o.l(q8nVarD2);
                rf40 rf40VarA = fipVar.c.a();
                c8o.l(rf40VarA);
                l27 l27Var2 = new l27(q8nVarD2, rf40VarA);
                q8n q8nVarD3 = q130Var2.d();
                c8o.l(q8nVarD3);
                co9 co9Var = new co9(q8nVarD3, (c1t) fipVar.e.get());
                zns znsVar = (zns) fipVar.g.get();
                q8n q8nVarG = q130Var2.g();
                c8o.l(q8nVarG);
                return yx61.l(q0d0VarN, l27Var, l27Var2, co9Var, t380.p(ux51.y(znsVar, q8nVarG)));
            case 2:
                return new c1t();
            case 3:
                return new zns(fipVar.b());
            case 4:
                upp0 upp0VarT = fipVar.b.t();
                c8o.l(upp0VarT);
                return upp0VarT;
            case 5:
                return new juc((c8m0) fipVar.B.get(), (aim0) fipVar.F.get(), (eim0) fipVar.G.get(), (g2h) fipVar.H.get());
            case 6:
                q030 q030Var = (q030) fipVar.v.get();
                EventSource eventSource = (EventSource) fipVar.A.get();
                Scheduler schedulerG = fipVar.b.G();
                c8o.l(schedulerG);
                return new g230(q030Var, eventSource, schedulerG);
            case 7:
                jly0 jly0Var = fipVar.m;
                q130 q130Var3 = fipVar.b;
                td41 td41Var = (td41) jly0Var.get();
                Scheduler schedulerY0 = q130Var3.y0();
                c8o.l(schedulerY0);
                rwu0 rwu0VarI = q130Var3.I();
                c8o.l(rwu0VarI);
                g2z g2zVar = new g2z(schedulerY0, new myq0(ssc0.s(rwu0VarI, (iac0) fipVar.n.get(), fipVar.i())), (epc0) fipVar.o.get());
                q2u q2uVar = (q2u) fipVar.s.get();
                Scheduler schedulerD0 = q130Var3.d0();
                c8o.l(schedulerD0);
                rot0 rot0Var = (rot0) fipVar.t.get();
                cyp cypVar = (cyp) fipVar.u.get();
                b7r0 b7r0Var = (b7r0) q130Var3.m0.get();
                c8o.l(b7r0Var);
                ius iusVar = new ius(rot0Var, cypVar, b7r0Var, (String) fipVar.k.get());
                q8n q8nVarG2 = q130Var3.g();
                c8o.l(q8nVarG2);
                return new t030(td41Var, g2zVar, q2uVar, schedulerD0, iusVar, q8nVarG2, new p5((td41) fipVar.m.get(), (byte) 18));
            case 8:
                return ((ehp) fipVar.j.get()).a((String) fipVar.k.get(), (s4b1) fipVar.l.get());
            case 9:
                return new ehp(this, (byte) 1);
            case 10:
                String str = fipVar.a.c;
                c8o.m(str);
                return str;
            case 11:
                j230 j230Var2 = fipVar.a;
                Set set = s4b1.f;
                return uic.x(j230Var2.a);
            case 12:
                iac0 iac0Var = fipVar.d.d.c;
                c8o.m(iac0Var);
                return iac0Var;
            case 13:
                q130 q130Var4 = fipVar.b;
                RxRouter rxRouterP = q130Var4.p();
                c8o.l(rxRouterP);
                mwm1 mwm1Var = new mwm1(new CosmosTransport(new sn0(rxRouterP, (byte) 26)));
                ap20 ap20Var = new ap20(fipVar.i());
                xpr xprVar = new xpr();
                a130 a130Var = new a130((byte) 0);
                z0t z0tVarA0 = q130Var4.a0();
                c8o.l(z0tVarA0);
                return new d130(new cik1(mwm1Var, new d1t(ap20Var, xprVar, a130Var, z0tVarA0), ado0.b, fipVar.i(), (byte) 14), new c130());
            case 14:
                Activity activityS = fipVar.b.s();
                c8o.l(activityS);
                return new q2u(activityS, (sgz) fipVar.r.get(), fipVar.b());
            case 15:
                return new sgz(fipVar.p, (usr0) fipVar.q.get());
            case 16:
                return u1n0.z(fipVar.d);
            case 17:
                return new v030();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                String str2 = (String) fipVar.b.l.get();
                c8o.l(str2);
                return new rot0(str2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                t8u0 t8u0Var = (t8u0) fipVar.b.v.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(fipVar.d.d.c.getLifecycle());
            case 20:
                return new x030((xhp) fipVar.z.get());
            case 21:
                return new xhp(this, (byte) 0);
            case 22:
                Context context = fipVar.b.context();
                c8o.l(context);
                return new xum1(context, xqu.a(fipVar.w), xqu.a(fipVar.x), xqu.a(fipVar.f));
            case 23:
                lut0 lut0VarU = fipVar.b.u();
                c8o.l(lut0VarU);
                return lut0VarU;
            case 24:
                qut0 qut0VarM = fipVar.b.M();
                c8o.l(qut0VarM);
                return qut0VarM;
            case 25:
                return new to31(new fab0((String) null, (String) null, 47, (String) null), (ab20) fipVar.E.get(), (td41) fipVar.m.get(), (s4b1) fipVar.l.get(), fipVar.i(), fipVar.a, (byte) 2);
            case 26:
                return new ab20((w0t) fipVar.C.get(), (String) fipVar.k.get(), (s4b1) fipVar.l.get(), (String) fipVar.D.get());
            case 27:
                q130 q130Var5 = fipVar.b;
                q130 q130Var6 = fipVar.b;
                a820 a820VarV = q130Var5.v();
                c8o.l(a820VarV);
                Context context2 = q130Var6.context();
                c8o.l(context2);
                ut71 ut71VarY = q130Var6.y();
                c8o.l(ut71VarY);
                String str3 = (String) fipVar.k.get();
                z0t z0tVarA1 = q130Var6.a0();
                c8o.l(z0tVarA1);
                return new w0t(a820VarV, context2, ut71VarY, str3, z0tVarA1);
            case 28:
                return fipVar.a.d;
            case 29:
                return new i230((ab20) fipVar.E.get(), (td41) fipVar.m.get(), (byte) 0);
            case 30:
                return g2h.c;
            case 31:
                q130 q130Var7 = fipVar.b;
                q130 q130Var8 = fipVar.b;
                pe peVarH = q130Var7.h();
                c8o.l(peVarH);
                ley leyVar = (ley) fipVar.L.get();
                c1t c1tVar = (c1t) fipVar.e.get();
                h380 h380VarB = j380.b(14);
                lik1 lik1Var = (lik1) fipVar.M.get();
                yhm yhmVarA0 = q130Var8.A0();
                c8o.l(yhmVarA0);
                luk lukVarK = q130Var8.k();
                c8o.l(lukVarK);
                h380VarB.e(rsi0.c, new gjq0(lik1Var, yhmVarA0, new g95(false, lukVarK), (byte) 0));
                lik1 lik1Var2 = (lik1) fipVar.M.get();
                js6 js6VarJ0 = q130Var8.J0();
                c8o.l(js6VarJ0);
                mfm mfmVar = (mfm) fipVar.N.get();
                yhm yhmVarA1 = q130Var8.A0();
                c8o.l(yhmVarA1);
                em6 em6VarD0 = q130Var8.D0();
                c8o.l(em6VarD0);
                h380VarB.e(rsi0.g, new hjq0(lik1Var2, js6VarJ0, mfmVar, yhmVarA1, em6VarD0));
                h380VarB.e(rsi0.a, fipVar.f());
                lik1 lik1Var3 = (lik1) fipVar.M.get();
                yhm yhmVarA2 = q130Var8.A0();
                c8o.l(yhmVarA2);
                h380VarB.e(rsi0.O0, new ijq0(lik1Var3, yhmVarA2, (byte) 0));
                lik1 lik1Var4 = (lik1) fipVar.M.get();
                yhm yhmVarA3 = q130Var8.A0();
                c8o.l(yhmVarA3);
                h380VarB.e(rsi0.h, new ijq0(lik1Var4, yhmVarA3, (byte) 1));
                h380VarB.e(rsi0.f, fipVar.f());
                lik1 lik1Var5 = (lik1) fipVar.M.get();
                zpk zpkVarE0 = q130Var8.E0();
                c8o.l(zpkVarE0);
                h380VarB.e(rsi0.d, new gjq0(lik1Var5, zpkVarE0, (mfm) fipVar.N.get(), (byte) 1));
                lik1 lik1Var6 = (lik1) fipVar.M.get();
                boolean zBooleanValue = ((Boolean) fipVar.J.get()).booleanValue();
                mfm mfmVar2 = (mfm) fipVar.N.get();
                fza fzaVar = new fza((byte) 25);
                hmu0 hmu0VarI0 = q130Var8.I0();
                c8o.l(hmu0VarI0);
                h380VarB.e(rsi0.i, new kjq0(lik1Var6, zBooleanValue, mfmVar2, fzaVar, hmu0VarI0));
                h380VarB.e(rsi0.Z, fipVar.e());
                lik1 lik1Var7 = (lik1) fipVar.M.get();
                boolean zBooleanValue2 = ((Boolean) fipVar.J.get()).booleanValue();
                yhm yhmVarA4 = q130Var8.A0();
                c8o.l(yhmVarA4);
                h380VarB.e(rsi0.N0, new qjq0(lik1Var7, zBooleanValue2, yhmVarA4));
                lik1 lik1Var8 = (lik1) fipVar.M.get();
                yhm yhmVarA5 = q130Var8.A0();
                c8o.l(yhmVarA5);
                lik1 lik1Var9 = (lik1) fipVar.M.get();
                npm1 npm1VarN0 = q130Var8.N0();
                c8o.l(npm1VarN0);
                ywc0 ywc0VarU0 = q130Var8.u0();
                c8o.l(ywc0VarU0);
                q8n q8nVarG3 = q130Var8.g();
                c8o.l(q8nVarG3);
                r0s0 r0s0Var = new r0s0(lik1Var9, npm1VarN0, ywc0VarU0, q8nVarG3);
                i4q i4qVarH0 = q130Var8.H0();
                c8o.l(i4qVarH0);
                boolean zH0 = q130Var8.h0();
                egh1 egh1VarK0 = q130Var8.K0();
                c8o.l(egh1VarK0);
                kl1 kl1Var = new kl1(lik1Var8, yhmVarA5, r0s0Var, i4qVarH0, zH0, egh1VarK0);
                lik1 lik1Var10 = (lik1) fipVar.M.get();
                wqg wqgVarL0 = q130Var8.L0();
                c8o.l(wqgVarL0);
                boolean zBooleanValue3 = ((Boolean) fipVar.J.get()).booleanValue();
                yhm yhmVarA6 = q130Var8.A0();
                c8o.l(yhmVarA6);
                ipg ipgVar = new ipg(lik1Var10, wqgVarL0, zBooleanValue3, yhmVarA6);
                agc0 agc0VarM = q130Var8.m();
                c8o.l(agc0VarM);
                jcc0 jcc0Var = new jcc0(agc0VarM, fipVar.e());
                lik1 lik1Var11 = (lik1) fipVar.M.get();
                eqm1 eqm1VarM0 = q130Var8.M0();
                c8o.l(eqm1VarM0);
                xrm1 xrm1VarG0 = q130Var8.G0();
                c8o.l(xrm1VarG0);
                boolean zBooleanValue4 = ((Boolean) fipVar.J.get()).booleanValue();
                i4q i4qVarH1 = q130Var8.H0();
                c8o.l(i4qVarH1);
                spm1 spm1Var = new spm1(lik1Var11, eqm1VarM0, xrm1VarG0, zBooleanValue4, i4qVarH1);
                lik1 lik1Var12 = (lik1) fipVar.M.get();
                boolean zBooleanValue5 = ((Boolean) fipVar.J.get()).booleanValue();
                yhm yhmVarA7 = q130Var8.A0();
                c8o.l(yhmVarA7);
                ipg ipgVar2 = new ipg(lik1Var12, zBooleanValue5, yhmVarA7);
                z0t z0tVarA2 = q130Var8.a0();
                c8o.l(z0tVarA2);
                h380VarB.e(rsi0.X, new ijq0(kl1Var, bol1.g(ipgVar, jcc0Var, spm1Var, ipgVar2, z0tVarA2), (byte) 3));
                lik1 lik1Var13 = (lik1) fipVar.M.get();
                boolean zBooleanValue6 = ((Boolean) fipVar.J.get()).booleanValue();
                mfm mfmVar3 = (mfm) fipVar.N.get();
                q2w0 q2w0VarF0 = q130Var8.F0();
                c8o.l(q2w0VarF0);
                h380VarB.e(rsi0.Y, new kjq0(lik1Var13, zBooleanValue6, mfmVar3, q2w0VarF0));
                h380VarB.e(rsi0.b, fipVar.f());
                lik1 lik1Var14 = (lik1) fipVar.M.get();
                yhm yhmVarA8 = q130Var8.A0();
                c8o.l(yhmVarA8);
                h380VarB.e(rsi0.e, new ijq0(lik1Var14, yhmVarA8, (byte) 2));
                p5 p5Var = new p5(new uds(h380VarB.b(true)), (byte) 19);
                hzs hzsVar = (hzs) fipVar.O.get();
                yqg yqgVarA = q130Var8.a();
                c8o.l(yqgVarA);
                gw70 gw70VarB = q130Var8.b();
                c8o.l(gw70VarB);
                dpy dpyVar = (dpy) fipVar.P.get();
                sw9 sw9VarC = fipVar.c();
                hzs hzsVar2 = (hzs) fipVar.O.get();
                lqr lqrVar = new lqr(fipVar.c(), (byte) 12);
                h380 h380VarB2 = j380.b(15);
                h380VarB2.e(fzy.i, new h6c0((yhp) fipVar.Q.get(), (byte) 1));
                h380VarB2.e(fzy.X, new h6c0((zhp) fipVar.R.get(), (byte) 0));
                h380VarB2.e(fzy.c, fipVar.g());
                h380VarB2.e(fzy.t, fipVar.h());
                h380VarB2.e(fzy.d, new h6c0((cip) fipVar.V.get(), (byte) 2));
                h380VarB2.e(fzy.e, new h6c0((dip) fipVar.W.get(), (byte) 3));
                h380VarB2.e(fzy.f, new h6c0((eip) fipVar.X.get(), (byte) 4));
                h380VarB2.e(fzy.Y, new h6c0((ohp) fipVar.Y.get(), (byte) 5));
                h380VarB2.e(fzy.g, new wum1((ley) fipVar.L.get(), new cx0((byte) 10), (byte) 0));
                h380VarB2.e(fzy.b, new wum1((ley) fipVar.L.get(), new cx0((byte) 10), (byte) 0));
                h380VarB2.e(fzy.N0, new wum1((ley) fipVar.L.get(), new br0(fipVar.i()), (byte) 1));
                h380VarB2.e(fzy.h, new wum1((ley) fipVar.L.get(), new br0(fipVar.i()), (byte) 1));
                h380VarB2.e(fzy.Z, new h6c0((php) fipVar.Z.get(), (byte) 6));
                h380VarB2.e(fzy.O0, new h6c0(new nu((byte) 8), (byte) 7));
                h380VarB2.e(fzy.P0, new h6c0((qhp) fipVar.a0.get(), (byte) 8));
                tvb0 tvb0Var = new tvb0(dpyVar, sw9VarC, hzsVar2, lqrVar, h380VarB2.b(true));
                p40 p40Var = new p40((byte) 5);
                Context context3 = q130Var8.context();
                c8o.l(context3);
                return new zzr(peVarH, leyVar, c1tVar, p5Var, hzsVar, new qzr(yqgVarA, gw70VarB, tvb0Var, p40Var, new ejs(context3), new k9r(fipVar.k.get(), (Object) new hur((f6c0) fipVar.b0.get(), (rhp) fipVar.e0.get(), (byte) 20), fipVar.f0.get(), (byte) 21)), new da((u5s) fipVar.g0.get(), new ryq((byte) 3), (byte) 17), (uhp) fipVar.h0.get());
            case 32:
                Activity activityS2 = fipVar.b.s();
                c8o.l(activityS2);
                zwm1 zwm1VarX = fipVar.b.x();
                c8o.l(zwm1VarX);
                ((Boolean) fipVar.J.get()).getClass();
                return new ley(activityS2, zwm1VarX, ((Boolean) fipVar.K.get()).booleanValue(), fipVar.i(), new xgy(j380.l(aey.Z, new ubk())));
            case 33:
                return Boolean.FALSE;
            case 34:
                rxj0 rxj0VarD = fipVar.b.D();
                c8o.l(rxj0VarD);
                return Boolean.valueOf(rxj0VarD.c);
            case 35:
                j230 j230Var3 = fipVar.a;
                Parcelable.Creator creator2 = lik1.CREATOR;
                return new lik1(j230Var3.a);
            case 36:
                i4q i4qVarH2 = fipVar.b.H0();
                c8o.l(i4qVarH2);
                return i4qVarH2.a((lik1) fipVar.M.get());
            case 37:
                Scheduler schedulerG2 = fipVar.b.G();
                c8o.l(schedulerG2);
                return new hzs(schedulerG2);
            case 38:
                return new dpy((ley) fipVar.L.get());
            case 39:
                return new yhp((byte) 0);
            case 40:
                return new zhp(this, (byte) 0);
            case 41:
                Activity activityS3 = fipVar.b.s();
                c8o.l(activityS3);
                ltm1 ltm1VarE0 = fipVar.b.e0();
                c8o.l(ltm1VarE0);
                return new g37(activityS3, ltm1VarE0);
            case 42:
                return new aip(this, (byte) 0);
            case 43:
                return new bip(this, (byte) 0);
            case 44:
                return new cip(this, (byte) 0);
            case 45:
                return new dip(this, (byte) 0);
            case 46:
                return new eip((byte) 0);
            case 47:
                return new ohp(this, (byte) 0);
            case 48:
                return new php(this, (byte) 0);
            case 49:
                return new qhp((byte) 0);
            case 50:
                return new zwp0();
            case 51:
                return new rhp(this, (byte) 0);
            case 52:
                Context context4 = fipVar.b.context();
                c8o.l(context4);
                return new we20(context4.getApplicationContext());
            case 53:
                return new shp((byte) 0);
            case 54:
                return new thp(this);
            case 55:
                z0t z0tVarA3 = fipVar.b.a0();
                c8o.l(z0tVarA3);
                return new u5s(new l230(z0tVarA3, (byte) 0), r7x.a);
            case 56:
                return new uhp((byte) 0);
            case 57:
                return new vhp(this);
            case 58:
                return new whp(this, (byte) 0);
            case 59:
                jly0 jly0Var2 = fipVar.M;
                q130 q130Var9 = fipVar.b;
                lik1 lik1Var15 = (lik1) jly0Var2.get();
                Activity activityS4 = q130Var9.s();
                c8o.l(activityS4);
                lzn0 lzn0VarC = q130Var9.c();
                c8o.l(lzn0VarC);
                s4b1 s4b1Var = (s4b1) fipVar.l.get();
                an3 an3VarL0 = q130Var9.l0();
                c8o.l(an3VarL0);
                jpn jpnVarJ0 = q130Var9.j0();
                c8o.l(jpnVarJ0);
                evm1 evm1VarI = fipVar.i();
                zwz0 zwz0VarW = q130Var9.w();
                c8o.l(zwz0VarW);
                return new tun0(lik1Var15, activityS4, lzn0VarC, s4b1Var, an3VarL0, jpnVarJ0, evm1VarI, zwz0VarW);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object j() {
        nb3 nb3Var = (nb3) this.c;
        byte b = 3;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new yyo(this, b);
            case 1:
                return new fap(this, (byte) 2);
            case 2:
                return new vyo(this, (byte) 4);
            case 3:
                h9n0 h9n0Var = (h9n0) ((w530) nb3Var.a).a.get();
                c8o.l(h9n0Var);
                return h9n0Var;
            case 4:
                xzj1 xzj1Var = (xzj1) ((w530) nb3Var.a).b.get();
                c8o.l(xzj1Var);
                return xzj1Var;
            case 5:
                return new xyo(this, b);
            case 6:
                return new map(this, (byte) 2);
            case 7:
                w530 w530Var = (w530) nb3Var.a;
                w530 w530Var2 = (w530) nb3Var.a;
                pp11 pp11Var = (pp11) w530Var.J.get();
                c8o.l(pp11Var);
                iac0 iac0Var = ((q7r0) nb3Var.b).d.c;
                c8o.m(iac0Var);
                b7r0 b7r0Var = (b7r0) w530Var2.K.get();
                c8o.l(b7r0Var);
                q8n q8nVar = (q8n) w530Var2.N.get();
                c8o.l(q8nVar);
                xrc0 xrc0Var = (xrc0) w530Var2.m.get();
                c8o.l(xrc0Var);
                return new mwn(pp11Var, iac0Var, b7r0Var, q8nVar, xrc0Var, xqu.a((chp) nb3Var.k));
            case 8:
                return new myq0((q7r0) nb3Var.b).get();
            case 9:
                w530 w530Var3 = (w530) nb3Var.a;
                kly0 kly0Var = w530Var3.i;
                kly0 kly0Var2 = w530Var3.M;
                kly0 kly0Var3 = w530Var3.L;
                oj3 oj3Var = (oj3) kly0Var.get();
                c8o.l(oj3Var);
                qut0 qut0Var = (qut0) kly0Var2.get();
                c8o.l(qut0Var);
                xrc0 xrc0Var2 = (xrc0) w530Var3.m.get();
                c8o.l(xrc0Var2);
                hku0 hku0Var = new hku0(xrc0Var2);
                g7h g7hVar = (g7h) w530Var3.l.get();
                c8o.l(g7hVar);
                dp5 dp5Var = new dp5(g7hVar, (byte) 10);
                mwm1 mwm1Var = (mwm1) w530Var3.o.get();
                c8o.l(mwm1Var);
                w4h w4hVar = (w4h) kly0Var3.get();
                c8o.l(w4hVar);
                qpj1 qpj1Var = new qpj1(mwm1Var, w4hVar, (byte) 26);
                w4h w4hVar2 = (w4h) kly0Var3.get();
                c8o.l(w4hVar2);
                il00 il00Var = new il00(w4hVar2, (byte) 25);
                qut0 qut0Var2 = (qut0) kly0Var2.get();
                c8o.l(qut0Var2);
                y1t0 y1t0Var = new y1t0(qut0Var2, (byte) 1);
                cig1 cig1Var = (cig1) w530Var3.k.get();
                c8o.l(cig1Var);
                el3 el3Var = (el3) w530Var3.j.get();
                c8o.l(el3Var);
                ffe1 ffe1Var = new ffe1(cig1Var, el3Var, (byte) 13);
                w4h w4hVar3 = (w4h) kly0Var3.get();
                c8o.l(w4hVar3);
                cp70 cp70Var = new cp70(w4hVar3);
                q8n q8nVar2 = (q8n) w530Var3.N.get();
                c8o.l(q8nVar2);
                qlw qlwVar = new qlw(oj3Var, qut0Var, hku0Var, dp5Var, qpj1Var, il00Var, y1t0Var, ffe1Var, cp70Var, q8nVar2);
                String str = ((b630) nb3Var.c).a;
                c8o.m(str);
                return new nlo(qlwVar, str);
            case 10:
                w530 w530Var4 = (w530) nb3Var.a;
                vpp0 vpp0Var = (vpp0) w530Var4.v.get();
                c8o.l(vpp0Var);
                xde0 xde0Var = (xde0) w530Var4.b0.get();
                c8o.l(xde0Var);
                xpp0 xpp0Var = new xpp0(vpp0Var, xde0Var);
                ayl aylVar = (ayl) w530Var4.w.get();
                c8o.l(aylVar);
                return new z1v(new j2v(xpp0Var, aylVar));
            case 11:
                w530 w530Var5 = (w530) nb3Var.a;
                dxz0 dxz0Var = (dxz0) w530Var5.A.get();
                c8o.l(dxz0Var);
                b7n b7nVar = (b7n) w530Var5.y.get();
                c8o.l(b7nVar);
                cfd cfdVar = new cfd((Object) dxz0Var, (Object) b7nVar, (byte) 7);
                q8n q8nVar3 = (q8n) w530Var5.Q.get();
                c8o.l(q8nVar3);
                return new rae(new pae(cfdVar, q8nVar3));
            case 12:
                hx7 hx7Var = (hx7) ((w530) nb3Var.a).C.get();
                c8o.l(hx7Var);
                ku1 ku1Var = new ku1(hx7Var);
                hx7 hx7Var2 = (hx7) ((w530) nb3Var.a).C.get();
                c8o.l(hx7Var2);
                return new h2v0(ku1Var, new ku1(hx7Var2, (byte) 27));
            case 13:
                uu00 uu00Var = (uu00) ((w530) nb3Var.a).g.get();
                c8o.l(uu00Var);
                return new k9v0(new f9v0(uu00Var));
            case 14:
                w530 w530Var6 = (w530) nb3Var.a;
                byp0 byp0Var = (byp0) w530Var6.W.get();
                c8o.l(byp0Var);
                xrc0 xrc0Var3 = (xrc0) w530Var6.m.get();
                c8o.l(xrc0Var3);
                q8n q8nVar4 = (q8n) w530Var6.P.get();
                c8o.l(q8nVar4);
                ayl aylVar2 = (ayl) w530Var6.w.get();
                c8o.l(aylVar2);
                return new h521(new u421(byp0Var, xrc0Var3, q8nVar4, aylVar2));
            case 15:
                dcq dcqVar = (dcq) ((w530) nb3Var.a).V.get();
                c8o.l(dcqVar);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new zll(dcqVar, new bn70(yon1.U1(), nik1.K1, (nar0) null));
            case 16:
                qns0 qns0Var = (qns0) ((w530) nb3Var.a).a0.get();
                c8o.l(qns0Var);
                iac0 iac0Var2 = ((q7r0) nb3Var.b).d.c;
                c8o.m(iac0Var2);
                return new hms0(qns0Var, iac0Var2);
            case 17:
                Activity activityA = ((w530) nb3Var.a).a();
                c8o.l(activityA);
                String str2 = ((b630) nb3Var.c).a;
                c8o.m(str2);
                ut71 ut71Var = (ut71) ((w530) nb3Var.a).X.get();
                c8o.l(ut71Var);
                return new s530(ut71Var.b(activityA, str2));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                gw70 gw70Var = (gw70) ((w530) nb3Var.a).d.get();
                c8o.l(gw70Var);
                lzn0 lzn0VarB = ((w530) nb3Var.a).b();
                c8o.l(lzn0VarB);
                return new thq0(gw70Var, lzn0VarB);
            default:
                jah.e(b2);
                return null;
        }
    }

    private final Object k() {
        iip iipVar = (iip) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                hm30 hm30Var = iipVar.a;
                hm30 hm30Var2 = iipVar.a;
                xfx xfxVarA0 = hm30Var.a0();
                c8o.l(xfxVarA0);
                sap sapVar = (sap) iipVar.O.get();
                Flowable flowable = (Flowable) iipVar.c.get();
                fl3 fl3VarK = hm30Var2.K();
                c8o.l(fl3VarK);
                yl1 yl1Var = new yl1(flowable, fl3VarK, (lik1) iipVar.q.get());
                Flowable flowable2 = (Flowable) iipVar.c.get();
                c9c0 c9c0VarL = hm30Var2.l();
                c8o.l(c9c0VarL);
                ijr ijrVarJ0 = hm30Var2.j0();
                c8o.l(ijrVarJ0);
                s3a s3aVar = new s3a(flowable2, c9c0VarL, ijrVarJ0, iipVar.e());
                ynb0 ynb0VarA = xqu.a(iipVar.S);
                ynb0 ynb0VarA2 = xqu.a(iipVar.T);
                FlowableMap flowableMapB = iipVar.b();
                uu00 uu00VarA = hm30Var2.A();
                c8o.l(uu00VarA);
                d0r d0rVar = (d0r) iipVar.o.get();
                vbs vbsVarN = hm30Var2.n();
                c8o.l(vbsVarN);
                q8n q8nVarG = hm30Var2.g();
                c8o.l(q8nVarG);
                luk lukVarW = hm30Var2.w();
                c8o.l(lukVarW);
                dxy dxyVar = new dxy(flowableMapB, uu00VarA, d0rVar, vbsVarN, q8nVarG, new gn4(false, lukVarW), (byte) 17);
                ynb0 ynb0VarA3 = xqu.a(iipVar.U);
                ynb0 ynb0VarA4 = xqu.a(iipVar.W);
                ynb0 ynb0VarA5 = xqu.a(iipVar.Y);
                ynb0 ynb0VarA6 = xqu.a(iipVar.Z);
                Flowable flowable3 = (Flowable) iipVar.c.get();
                a1r0 a1r0Var = (a1r0) iipVar.G.get();
                uvy uvyVarQ0 = hm30Var2.q0();
                c8o.l(uvyVarQ0);
                q8n q8nVarE = hm30Var2.e();
                c8o.l(q8nVarE);
                luk lukVarW2 = hm30Var2.w();
                c8o.l(lukVarW2);
                duy duyVar = new duy(flowable3, a1r0Var, uvyVarQ0, q8nVarE, new wu4(false, lukVarW2));
                vsy vsyVar = new vsy((Flowable) iipVar.c.get(), (w9u0) iipVar.d.get(), (d0r) iipVar.o.get(), hm30Var2.v0());
                Flowable flowable4 = (Flowable) iipVar.c.get();
                xh71 xh71VarZ = hm30Var2.z();
                c8o.l(xh71VarZ);
                fbm fbmVarL = hm30Var2.L();
                c8o.l(fbmVarL);
                u601 u601VarT = hm30Var2.t();
                c8o.l(u601VarT);
                hq41 hq41VarD = hm30Var2.D();
                c8o.l(hq41VarD);
                me30 me30VarK = hm30Var2.k();
                c8o.l(me30VarK);
                Flowable flowableF = hm30Var2.f();
                c8o.l(flowableF);
                f771 f771VarO = hm30Var2.O();
                c8o.l(f771VarO);
                poj0 poj0Var = new poj0((Object) hq41VarD, (Object) me30VarK, (Object) flowableF, (Object) f771VarO, (byte) 15);
                f771 f771VarO2 = hm30Var2.O();
                c8o.l(f771VarO2);
                q8n q8nVarD = hm30Var2.d();
                c8o.l(q8nVarD);
                iac0 iac0Var = (iac0) iipVar.a0.get();
                luk lukVarW3 = hm30Var2.w();
                c8o.l(lukVarW3);
                o671 o671Var = new o671(flowable4, xh71VarZ, fbmVarL, u601VarT, poj0Var, f771VarO2, q8nVarD, iac0Var, lukVarW3);
                Flowable flowable5 = (Flowable) iipVar.c.get();
                d0r d0rVar2 = (d0r) iipVar.o.get();
                boolean zBooleanValue = ((Boolean) iipVar.b0.get()).booleanValue();
                w9u0 w9u0Var = (w9u0) iipVar.d.get();
                u961 u961VarK0 = hm30Var2.k0();
                ajq0 ajq0VarT0 = hm30Var2.t0();
                c3s c3sVarB = hm30Var2.B();
                c8o.l(c3sVarB);
                dma1 dma1VarP0 = hm30Var2.P0();
                c8o.l(dma1VarP0);
                e68 e68Var = new e68(flowable5, d0rVar2, zBooleanValue, w9u0Var, u961VarK0, ajq0VarT0, c3sVarB, new in01(dma1VarP0));
                FlowableMap flowableMapB2 = iipVar.b();
                lid lidVarL0 = hm30Var2.L0();
                c8o.l(lidVarL0);
                FlowableMap flowableMapJ = flowableMapB2.X(new dqu(mid.v(lidVarL0), (byte) 20)).J(bj20.c);
                FlowableJust flowableJustY = k9o0.y((hnl) iipVar.k.get());
                Flowable flowable6 = (Flowable) iipVar.c.get();
                o241 o241VarI = hm30Var2.i();
                c8o.l(o241VarI);
                uwh uwhVarJ = hm30Var2.J();
                c8o.l(uwhVarJ);
                lid lidVarL1 = hm30Var2.L0();
                c8o.l(lidVarL1);
                lkd lkdVarV = mid.v(lidVarL1);
                gmt gmtVarO0 = hm30Var2.o0();
                pqq0 pqq0Var = (pqq0) iipVar.c0.get();
                yqg yqgVarA = hm30Var2.a();
                c8o.l(yqgVarA);
                Scheduler schedulerO = hm30Var2.o();
                c8o.l(schedulerO);
                Flowable flowableH = Flowable.h(ioo1.K(flowable6, o241VarI, uwhVarJ, lkdVarV, pqq0Var, yqgVarA, schedulerO), Flowable.h(flowable6.j(mo9.Y).J(cj20.c), yoi1.h((x3s) gmtVarO0.c, o6x.a).U(rih1.a), dj20.c).J(new laz(gmtVarO0, (byte) 11)), xj20.c);
                ynb0 ynb0VarA7 = xqu.a(iipVar.d0);
                ynb0 ynb0VarA8 = xqu.a(iipVar.e0);
                n6r0 n6r0Var = (n6r0) iipVar.z.get();
                lik1 lik1Var = (lik1) iipVar.q.get();
                luk lukVarW4 = hm30Var2.w();
                c8o.l(lukVarW4);
                return new jm30(xfxVarA0, sapVar, yl1Var, s3aVar, ynb0VarA, ynb0VarA2, dxyVar, ynb0VarA3, ynb0VarA4, ynb0VarA5, ynb0VarA6, duyVar, vsyVar, o671Var, e68Var, flowableMapJ, flowableJustY, flowableH, ynb0VarA7, ynb0VarA8, n6r0Var, lik1Var, new pn4(false, false, lukVarW4), w3p0.g((jnk0) iipVar.s.get()));
            case 1:
                return new sap(this, (byte) 2);
            case 2:
                return k9o0.B(iipVar.b);
            case 3:
                return k9o0.z(iipVar.b);
            case 4:
                return iipVar.b.f();
            case 5:
                return f2u0.B(iipVar.g(), (Flowable) iipVar.f.get(), (Flowable) iipVar.g.get(), iipVar.a());
            case 6:
                jly0 jly0Var = iipVar.c;
                hm30 hm30Var3 = iipVar.a;
                Flowable flowable7 = (Flowable) jly0Var.get();
                Scheduler schedulerO2 = hm30Var3.o();
                c8o.l(schedulerO2);
                yqg yqgVarA2 = hm30Var3.a();
                c8o.l(yqgVarA2);
                return f2u0.z(flowable7, schedulerO2, yqgVarA2, iipVar.a());
            case 7:
                return f2u0.y((Flowable) iipVar.c.get(), iipVar.a());
            case 8:
                return new a62((p2p0) iipVar.i.get(), (byte) 3);
            case 9:
                return iipVar.b.j();
            case 10:
                return k9o0.r(iipVar.b);
            case 11:
                return new l0y((p2p0) iipVar.i.get(), (byte) 2);
            case 12:
                return new k0y((p2p0) iipVar.i.get(), (byte) 2);
            case 13:
                return iipVar.b.g();
            case 14:
                return k9o0.t(iipVar.b);
            case 15:
                lzn0 lzn0VarC = iipVar.a.c();
                c8o.l(lzn0VarC);
                return aan0.p(lzn0VarC);
            case 16:
                jly0 jly0Var2 = iipVar.q;
                hm30 hm30Var4 = iipVar.a;
                lik1 lik1Var2 = (lik1) jly0Var2.get();
                ssf1 ssf1VarP = hm30Var4.p();
                c8o.l(ssf1VarP);
                c3s c3sVarB2 = hm30Var4.B();
                c8o.l(c3sVarB2);
                luk lukVarW5 = hm30Var4.w();
                c8o.l(lukVarW5);
                an4 an4Var = new an4(false, lukVarW5);
                luk lukVarW6 = hm30Var4.w();
                c8o.l(lukVarW6);
                return new cmf1(lik1Var2, ssf1VarP, c3sVarB2, an4Var, new uu4(false, lukVarW6), hm30Var4.q());
            case 17:
                return iipVar.b.e();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                jly0 jly0Var3 = iipVar.s;
                hm30 hm30Var5 = iipVar.a;
                jnk0 jnk0Var = (jnk0) jly0Var3.get();
                gw70 gw70VarB = hm30Var5.b();
                c8o.l(gw70VarB);
                d0r d0rVar3 = (d0r) iipVar.o.get();
                luk lukVarW7 = hm30Var5.w();
                c8o.l(lukVarW7);
                return new yxb0(jnk0Var, gw70VarB, d0rVar3, new fn4(false, lukVarW7));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Flowable flowable8 = (Flowable) iipVar.c.get();
                Flowable flowable9 = (Flowable) iipVar.f.get();
                c3s c3sVarB3 = iipVar.a.B();
                c8o.l(c3sVarB3);
                return new jnk0(flowable8, flowable9, c3sVarB3);
            case 20:
                Flowable flowable10 = (Flowable) iipVar.c.get();
                Flowable flowable11 = (Flowable) iipVar.h.get();
                w9u0 w9u0Var2 = (w9u0) iipVar.d.get();
                h691 h691Var = (h691) iipVar.w.get();
                o241 o241VarI2 = iipVar.a.i();
                c8o.l(o241VarI2);
                return new ktf1(flowable10, flowable11, w9u0Var2, h691Var, o241VarI2, iipVar.x, iipVar.e());
            case 21:
                hm30 hm30Var6 = iipVar.a;
                kt91 kt91VarJ = hm30Var6.j();
                c8o.l(kt91VarJ);
                chp chpVar = iipVar.u;
                chp chpVar2 = iipVar.v;
                rh11 rh11VarD0 = hm30Var6.d0();
                c8o.l(rh11VarD0);
                return new nm30(new kp00(kt91VarJ, sd30.D(chpVar, chpVar2, rh11VarD0), (byte) 21), (byte) 0);
            case 22:
                iipVar.getClass();
                hm30 hm30Var7 = iipVar.a;
                dma1 dma1VarP1 = hm30Var7.P0();
                c8o.l(dma1VarP1);
                cm30 cm30Var = new cm30(dma1VarP1);
                yqg yqgVarA3 = hm30Var7.a();
                c8o.l(yqgVarA3);
                return new gqs(cm30Var, yqgVarA3);
            case 23:
                return new ui11();
            case 24:
                s4p0 s4p0VarR = iipVar.a.R();
                c8o.l(s4p0VarR);
                return w3p0.B(s4p0VarR);
            case 25:
                return iipVar.b.h();
            case 26:
                return iipVar.b.i();
            case 27:
                Flowable flowable12 = (Flowable) iipVar.c.get();
                Flowable flowable13 = (Flowable) iipVar.h.get();
                w9u0 w9u0Var3 = (w9u0) iipVar.d.get();
                h691 h691Var2 = (h691) iipVar.w.get();
                o241 o241VarI3 = iipVar.a.i();
                c8o.l(o241VarI3);
                return new ekf1(flowable12, flowable13, w9u0Var3, h691Var2, o241VarI3, iipVar.x, iipVar.e());
            case 28:
                return new FlowableOnBackpressureLatest((PublishProcessor) iipVar.C.get());
            case 29:
                return new PublishProcessor();
            case 30:
                return new tap(this, (byte) 2);
            case 31:
                return iipVar.a.b0();
            case 32:
                a1r0 a1r0VarC = iipVar.a.C();
                c8o.l(a1r0VarC);
                return a1r0VarC;
            case 33:
                return w3p0.w(iipVar.a.H(), iipVar.b, (o2p0) iipVar.y.get());
            case 34:
                return new a4f0((Flowable) iipVar.c.get(), (Flowable) iipVar.h.get(), (w9u0) iipVar.d.get());
            case 35:
                return new ww9(iipVar.c());
            case 36:
                a1g1 a1g1Var = new a1g1(iipVar.a.F(), (byte) 11);
                Scheduler schedulerO3 = iipVar.a.o();
                c8o.l(schedulerO3);
                return new h280(a1g1Var, schedulerO3);
            case 37:
                s4p0 s4p0VarR2 = iipVar.a.R();
                c8o.l(s4p0VarR2);
                return w3p0.z(s4p0VarR2);
            case 38:
                s4p0 s4p0VarR3 = iipVar.a.R();
                c8o.l(s4p0VarR3);
                return w3p0.A(s4p0VarR3);
            case 39:
                jly0 jly0Var4 = iipVar.c;
                hm30 hm30Var8 = iipVar.a;
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) jly0Var4.get());
                z6k0 z6k0VarM0 = hm30Var8.M0();
                c8o.l(z6k0VarM0);
                mnk0 mnk0VarM = hm30Var8.m();
                c8o.l(mnk0VarM);
                rxj0 rxj0VarG0 = hm30Var8.G0();
                c8o.l(rxj0VarG0);
                return new k6k0(flowableDistinctUntilChangedD, z6k0VarM0, mnk0VarM, rxj0VarG0);
            case 40:
                jly0 jly0Var5 = iipVar.c;
                hm30 hm30Var9 = iipVar.a;
                Flowable flowable14 = (Flowable) jly0Var5.get();
                Flowable flowable15 = (Flowable) iipVar.Q.get();
                w9u0 w9u0Var4 = (w9u0) iipVar.d.get();
                Consumer consumer = (Consumer) iipVar.R.get();
                luk lukVarW8 = hm30Var9.w();
                c8o.l(lukVarW8);
                jn4 jn4Var = new jn4(lukVarW8);
                dma1 dma1VarM0 = hm30Var9.m0();
                c8o.l(dma1VarM0);
                return new mo51(flowable14, flowable15, w9u0Var4, consumer, jn4Var, dma1VarM0);
            case 41:
                return f2u0.C(iipVar.g(), (Flowable) iipVar.P.get(), (Flowable) iipVar.g.get(), iipVar.a());
            case 42:
                jly0 jly0Var6 = iipVar.c;
                hm30 hm30Var10 = iipVar.a;
                Flowable flowable16 = (Flowable) jly0Var6.get();
                Scheduler schedulerO4 = hm30Var10.o();
                c8o.l(schedulerO4);
                yqg yqgVarA4 = hm30Var10.a();
                c8o.l(yqgVarA4);
                return f2u0.A(flowable16, schedulerO4, yqgVarA4, iipVar.a());
            case 43:
                return new lrj0(iipVar.b, (byte) 21);
            case 44:
                FlowableMap flowableMapB3 = iipVar.b();
                hm30 hm30Var11 = iipVar.a;
                mo51 mo51Var = (mo51) iipVar.S.get();
                Scheduler schedulerO5 = hm30Var11.o();
                c8o.l(schedulerO5);
                Flowable flowable17 = (Flowable) iipVar.c.get();
                Flowable flowable18 = (Flowable) iipVar.Q.get();
                uvy uvyVarQ1 = hm30Var11.q0();
                c8o.l(uvyVarQ1);
                d0r d0rVar4 = (d0r) iipVar.o.get();
                q8n q8nVarG2 = hm30Var11.g();
                c8o.l(q8nVarG2);
                luk lukVarW9 = hm30Var11.w();
                c8o.l(lukVarW9);
                hv4 hv4Var = new hv4(false, false, false, lukVarW9);
                dma1 dma1VarM1 = hm30Var11.m0();
                c8o.l(dma1VarM1);
                acl aclVar = new acl(flowable17, flowable18, uvyVarQ1, d0rVar4, q8nVarG2, hv4Var, dma1VarM1);
                w9u0 w9u0Var5 = (w9u0) iipVar.d.get();
                Consumer consumer2 = (Consumer) iipVar.R.get();
                dma1 dma1VarM2 = hm30Var11.m0();
                c8o.l(dma1VarM2);
                zr51 zr51Var = new zr51(w9u0Var5, consumer2, dma1VarM2);
                luk lukVarW10 = hm30Var11.w();
                c8o.l(lukVarW10);
                y441 y441Var = new y441(schedulerO5, aclVar, zr51Var, new zu4(false, lukVarW10));
                xfx xfxVarA1 = hm30Var11.a0();
                c8o.l(xfxVarA1);
                return new rt01(flowableMapB3, mo51Var, y441Var, xfxVarA1);
            case 45:
                return new s691(iipVar.g(), (Flowable) iipVar.h.get(), iipVar.d(), (w9u0) iipVar.d.get());
            case 46:
                return new k691((Flowable) iipVar.c.get(), (Flowable) iipVar.h.get(), (w9u0) iipVar.d.get(), (mrq0) iipVar.V.get(), (h691) iipVar.w.get());
            case 47:
                ljg ljgVarH0 = iipVar.a.H0();
                c8o.l(ljgVarH0);
                return new lm30(ljgVarH0, (byte) 0);
            case 48:
                FlowableMap flowableMapG = iipVar.g();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedJ = f2u0.j((Flowable) iipVar.c.get());
                Flowable flowableD = iipVar.d();
                Flowable flowable19 = (Flowable) iipVar.h.get();
                w9u0 w9u0Var6 = (w9u0) iipVar.d.get();
                yp91 yp91VarH = iipVar.h();
                im51 im51Var = (im51) iipVar.X.get();
                luk lukVarW11 = iipVar.a.w();
                c8o.l(lukVarW11);
                return new am51(flowableMapG, flowableDistinctUntilChangedJ, flowableD, flowable19, w9u0Var6, yp91VarH, im51Var, new kn4(false, lukVarW11));
            case 49:
                yqg yqgVarA5 = iipVar.a.a();
                c8o.l(yqgVarA5);
                return new im51(yqgVarA5);
            case 50:
                FlowableMap flowableMapG2 = iipVar.g();
                FlowableDistinctUntilChanged flowableDistinctUntilChangedJ2 = f2u0.j((Flowable) iipVar.c.get());
                Flowable flowableD2 = iipVar.d();
                Flowable flowable20 = (Flowable) iipVar.h.get();
                w9u0 w9u0Var7 = (w9u0) iipVar.d.get();
                yp91 yp91VarH2 = iipVar.h();
                im51 im51Var2 = (im51) iipVar.X.get();
                luk lukVarW12 = iipVar.a.w();
                c8o.l(lukVarW12);
                return new qm51(flowableMapG2, flowableDistinctUntilChangedJ2, flowableD2, flowable20, w9u0Var7, yp91VarH2, im51Var2, new kn4(false, lukVarW12));
            case 51:
                return k9o0.v(iipVar.b);
            case 52:
                return Boolean.valueOf(iipVar.b.a());
            case 53:
                return k9o0.x(iipVar.b);
            case 54:
                return iipVar.a.i0();
            case 55:
                return new mtf((PublishProcessor) iipVar.C.get(), (byte) 1);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object l() {
        f9p f9pVar = (f9p) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                chp chpVar = (chp) f9pVar.Z;
                vm30 vm30Var = (vm30) f9pVar.t;
                hny hnyVar = (hny) vm30Var.f.get();
                c8o.l(hnyVar);
                fey feyVar = new fey(hnyVar, (byte) 13);
                boolean zBooleanValue = ((Boolean) ((jly0) f9pVar.b).get()).booleanValue();
                RetrofitMaker retrofitMaker = (RetrofitMaker) vm30Var.e.get();
                c8o.l(retrofitMaker);
                return new sm30(chpVar, feyVar, zBooleanValue, (rm30) retrofitMaker.createWebgateService(rm30.class, "android-track-freetiertrackpage"), (zfp0) ((jly0) f9pVar.d).get());
            case 1:
                efe0 efe0Var = (efe0) ((vm30) f9pVar.t).g.get();
                c8o.l(efe0Var);
                return efe0Var;
            case 2:
                return Boolean.FALSE;
            case 3:
                ynb0 ynb0VarA = xqu.a((chp) f9pVar.N0);
                ynb0 ynb0VarA2 = xqu.a((chp) f9pVar.O0);
                ynb0 ynb0VarA3 = xqu.a((chp) f9pVar.P0);
                ArrayList arrayList = new ArrayList(10);
                ObservableTransformer observableTransformer = (ObservableTransformer) ynb0VarA.get();
                if (observableTransformer != null) {
                    arrayList.add(observableTransformer);
                }
                ObservableTransformer observableTransformer2 = (ObservableTransformer) ynb0VarA2.get();
                if (observableTransformer2 != null) {
                    arrayList.add(observableTransformer2);
                }
                ObservableTransformer observableTransformer3 = (ObservableTransformer) ynb0VarA3.get();
                if (observableTransformer3 != null) {
                    arrayList.add(observableTransformer3);
                }
                return new zfp0(arrayList);
            case 4:
                String strY = f9pVar.y();
                vm30 vm30Var2 = (vm30) f9pVar.t;
                String str = nik1.p.b(((wm30) f9pVar.X).a).a;
                c8o.m(str);
                String string = f9pVar.a().getResources().getString(2131963322);
                yzc0 yzc0Var = (yzc0) ((jly0) f9pVar.c).get();
                Flowable flowable = (Flowable) vm30Var2.q.get();
                c8o.l(flowable);
                luk lukVar = (luk) vm30Var2.y.get();
                c8o.l(lukVar);
                dg4 dg4Var = new dg4(false, false, false, lukVar);
                g7h g7hVar = (g7h) vm30Var2.n.get();
                c8o.l(g7hVar);
                return new fip0(strY, str, string, yzc0Var, flowable, dg4Var, g7hVar);
            case 5:
                q7r0 q7r0Var = (q7r0) f9pVar.Y;
                vm30 vm30Var3 = (vm30) f9pVar.t;
                lik1 lik1VarC = d8.c(new c4n0(q7r0Var));
                String strY2 = f9pVar.y();
                iac0 iac0VarP = f9pVar.p();
                t8u0 t8u0Var = (t8u0) vm30Var3.p.get();
                c8o.l(t8u0Var);
                ruz ruzVarA = t8u0Var.a(f9pVar.p().getLifecycle()).a();
                b0d0 b0d0Var = (b0d0) vm30Var3.W.get();
                c8o.l(b0d0Var);
                huz huzVar = new huz(new g3d0[0], (byte) 9);
                huz huzVar2 = new huz(new Map[0], (byte) 9);
                huz huzVar3 = new huz(w7x.a, (byte) 10);
                huz huzVar4 = new huz(new Map[0], (byte) 9);
                zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                zpzVarY.s("freetiertrack");
                zpzVarY.w(lik1VarC.a);
                return b0d0Var.b(strY2, huzVar3, iac0VarP, ruzVarA, huzVar, zpzVarY.build(), huzVar2, huzVar4);
            case 6:
                return new cp81();
            case 7:
                vm30 vm30Var4 = (vm30) f9pVar.t;
                vm30 vm30Var5 = (vm30) f9pVar.t;
                pd80 pd80Var = (pd80) vm30Var4.t.get();
                c8o.l(pd80Var);
                zpg0 zpg0Var = (zpg0) vm30Var5.u.get();
                c8o.l(zpg0Var);
                zpg0 zpg0Var2 = (zpg0) vm30Var5.v.get();
                c8o.l(zpg0Var2);
                return new wpf1(pd80Var, zpg0Var, zpg0Var2, d8.c(new c4n0((q7r0) f9pVar.Y)));
            case 8:
                w470 w470Var = (w470) ((jly0) f9pVar.W0).get();
                ie70 ie70Var = (ie70) ((jly0) f9pVar.X0).get();
                Resources resources = (Resources) ((vm30) f9pVar.t).C.get();
                c8o.l(resources);
                return new tm30(w470Var, ie70Var, resources);
            case 9:
                gj5 gj5VarA = f9pVar.a();
                gj5 gj5VarA2 = f9pVar.a();
                vm30 vm30Var6 = (vm30) f9pVar.t;
                Context context = (Context) vm30Var6.w.get();
                c8o.l(context);
                l7m0 l7m0VarW = mw60.w(context, (l670) ((jly0) f9pVar.U0).get(), f9pVar.n());
                Resources resources2 = (Resources) vm30Var6.C.get();
                c8o.l(resources2);
                sw9 sw9Var = new sw9(gj5VarA2, l7m0VarW, td70.a(resources2, f9pVar.n()));
                fm30 fm30Var = (fm30) ((jly0) f9pVar.V0).get();
                oe70 oe70Var = new oe70(gj5VarA, sw9Var);
                fm30Var.d = true;
                fm30Var.i(oe70Var.c);
                fm30Var.i(oe70Var.d);
                return oe70Var;
            case 10:
                gj5 gj5VarA3 = f9pVar.a();
                q7r0 q7r0Var2 = (q7r0) f9pVar.Y;
                vm30 vm30Var7 = (vm30) f9pVar.t;
                c4n0 c4n0Var = new c4n0(q7r0Var2);
                i8h1 i8h1VarZ = u1n0.z(q7r0Var2);
                kly0 kly0Var = vm30Var7.E;
                kly0 kly0Var2 = vm30Var7.x;
                kly0 kly0Var3 = vm30Var7.B;
                lzn0 lzn0Var = (lzn0) vm30Var7.z.get();
                c8o.l(lzn0Var);
                in8 in8Var = new in8(lzn0Var);
                r630 r630Var = (r630) kly0Var3.get();
                c8o.l(r630Var);
                r630 r630Var2 = (r630) kly0Var3.get();
                c8o.l(r630Var2);
                da70 da70Var = new da70(r630Var2);
                fe70 fe70Var = (fe70) ((jly0) f9pVar.f).get();
                gw70 gw70Var = (gw70) vm30Var7.V.get();
                c8o.l(gw70Var);
                q770 q770Var = new q770(new mc70(gw70Var, new kcg(new pob((byte) 6, false)), f9pVar.n()), new e570((byte) 0, f9pVar.n()), new z970((fe70) ((jly0) f9pVar.f).get()), new ea70((fe70) ((jly0) f9pVar.f).get(), (byte) 0), new ea70((fe70) ((jly0) f9pVar.f).get(), (byte) 2), new ea70((fe70) ((jly0) f9pVar.f).get(), (byte) 1), new fc70());
                s770 s770Var = new s770();
                yqg yqgVar = (yqg) kly0Var2.get();
                c8o.l(yqgVar);
                p670 p670Var = new p670(yqgVar, (byte) 0);
                fe70 fe70Var2 = (fe70) ((jly0) f9pVar.f).get();
                j3a j3aVar = (j3a) kly0Var.get();
                c8o.l(j3aVar);
                l770 l770Var = new l770(fe70Var2, j3aVar, (byte) 0);
                yqg yqgVar2 = (yqg) kly0Var2.get();
                c8o.l(yqgVar2);
                p670 p670Var2 = new p670(yqgVar2, (byte) 1);
                fe70 fe70Var3 = (fe70) ((jly0) f9pVar.f).get();
                j3a j3aVar2 = (j3a) kly0Var.get();
                c8o.l(j3aVar2);
                x970 x970Var = new x970(fe70Var, q770Var, new q770(s770Var, p670Var, l770Var, p670Var2, new l770(fe70Var3, j3aVar2, (byte) 1), new w870((fe70) ((jly0) f9pVar.f).get())), new q770(new e570((byte) 1, f9pVar.n()), new h770((byte) 0), new h770((byte) 1), new k770(f9pVar.n()), new i870((fe70) ((jly0) f9pVar.f).get())));
                c8o.l((u3f1) vm30Var7.F.get());
                d4b1 d4b1Var = new d4b1((byte) 4);
                String str2 = (String) vm30Var7.A.get();
                c8o.l(str2);
                mxa1 mxa1Var = new mxa1(i8h1VarZ, in8Var, r630Var, da70Var, x970Var, d4b1Var, str2, (byte) 2);
                h380 h380VarB = j380.b(13);
                jly0 jly0Var = (jly0) f9pVar.g;
                i160 i160Var = (i160) ((jly0) f9pVar.i).get();
                kly0 kly0Var4 = vm30Var7.R;
                rsn0 rsn0Var = (rsn0) vm30Var7.s.get();
                c8o.l(rsn0Var);
                gw70 gw70Var2 = (gw70) vm30Var7.V.get();
                c8o.l(gw70Var2);
                pe peVar = (pe) kly0Var4.get();
                c8o.l(peVar);
                h7l1 h7l1Var = new h7l1(gw70Var2, peVar);
                luk lukVar2 = (luk) vm30Var7.y.get();
                c8o.l(lukVar2);
                j3v j3vVar = new j3v(new x75(false, lukVar2), (byte) 8);
                woa woaVar = (woa) vm30Var7.T.get();
                c8o.l(woaVar);
                kma kmaVar = (kma) vm30Var7.U.get();
                c8o.l(kmaVar);
                fpa fpaVar = (fpa) vm30Var7.S.get();
                c8o.l(fpaVar);
                pe peVar2 = (pe) kly0Var4.get();
                c8o.l(peVar2);
                boolean zBooleanValue2 = ((Boolean) vm30Var7.Q.get()).booleanValue();
                zle1 zle1Var = (zle1) vm30Var7.P.get();
                c8o.l(zle1Var);
                h380VarB.e("encore:trackHeader", new xnf1(jly0Var, i160Var, rsn0Var, new yzu(h7l1Var, j3vVar, new k0t(woaVar, kmaVar, fpaVar, peVar2, zBooleanValue2, zle1Var), new zfr(f9pVar.p()))));
                h380VarB.e("encore:sectionHeading2", new rwd((u0i) ((jly0) f9pVar.Q0).get(), (byte) 2));
                h380VarB.e("encore:addToPlaylistButton", new vn1((wn1) ((jly0) f9pVar.R0).get()));
                gw70 gw70Var3 = (gw70) vm30Var7.V.get();
                c8o.l(gw70Var3);
                h380VarB.e("freetier:entityTopContainer", new v8x(gw70Var3, xqu.a((chp) f9pVar.S0), (byte) 12));
                gw70 gw70Var4 = (gw70) vm30Var7.V.get();
                c8o.l(gw70Var4);
                h380VarB.e("freetier:trackEntityTopContainer", new v8x(gw70Var4, xqu.a((chp) f9pVar.S0), (byte) 12));
                h380VarB.e("freetier:unlockTrackCard", new gjh1((jly0) f9pVar.T0));
                h380VarB.e("freetier:secondaryButton", new om30((byte) 0));
                h380VarB.e("freetier:tertiaryButton", new om30((byte) 1));
                h380VarB.e("freetier:tertiaryButtonOutlined", new om30((byte) 2));
                h380VarB.e("freetier:whitePrimaryButton", new om30((byte) 3));
                h380VarB.e("button:fixedSizeShuffleButton", new qn20());
                alf1 alf1Var = (alf1) vm30Var7.h.get();
                c8o.l(alf1Var);
                h380VarB.e("glue2:TrackCloudExperiment", new xed1(alf1Var, (byte) 1));
                pd80 pd80Var2 = (pd80) vm30Var7.t.get();
                c8o.l(pd80Var2);
                zpg0 zpg0Var3 = (zpg0) vm30Var7.u.get();
                c8o.l(zpg0Var3);
                iac0 iac0VarP2 = f9pVar.p();
                Scheduler scheduler = (Scheduler) vm30Var7.c.get();
                c8o.l(scheduler);
                h380VarB.e("cmp:inlineCard", new upf1(pd80Var2, zpg0Var3, iac0VarP2, scheduler));
                c670 t570Var = new t570(h380VarB.b(true));
                vu1 vu1Var = (vu1) vm30Var7.i.get();
                c8o.l(vu1Var);
                xn1 xn1Var = new xn1(vu1Var, u1n0.z(q7r0Var2));
                hqo hqoVarI = f9pVar.i();
                vgm vgmVar = (vgm) vm30Var7.G.get();
                c8o.l(vgmVar);
                ndm ndmVar = new ndm(vgmVar, new c4n0(q7r0Var2), new hl00(new c4n0(q7r0Var2), (byte) 13), u1n0.z(q7r0Var2), (byte) 0);
                lzn0 lzn0Var2 = (lzn0) vm30Var7.z.get();
                c8o.l(lzn0Var2);
                k670 k670Var = (k670) mxa1Var.b(gj5VarA3, c4n0Var).t().r(j380.n("freetier:addToPlaylist", xn1Var, "playFromContext", hqoVarI, "contextMenu", ndmVar, "navigate", new xn1(lzn0Var2, new hl00(new c4n0(q7r0Var2), (byte) 13), u1n0.z(q7r0Var2)))).b;
                k670Var.c(new c670[]{t570Var});
                k670Var.d(t570Var);
                return k670Var.a();
            case 11:
                gj5 gj5VarA4 = f9pVar.a();
                vm30 vm30Var8 = (vm30) f9pVar.t;
                gw70 gw70Var5 = (gw70) vm30Var8.V.get();
                c8o.l(gw70Var5);
                hl00 hl00Var = new hl00(gw70Var5, (byte) 14);
                j3a j3aVar3 = (j3a) vm30Var8.E.get();
                c8o.l(j3aVar3);
                return new fe70(gj5VarA4, hl00Var, j3aVar3);
            case 12:
                xfx xfxVar = (xfx) ((vm30) f9pVar.t).r.get();
                c8o.l(xfxVar);
                ufx ufxVar = xfxVar.d;
                return new lvs(ufxVar.a, ufxVar.b);
            case 13:
                iac0 iac0VarP3 = f9pVar.p();
                vm30 vm30Var9 = (vm30) f9pVar.t;
                String strY3 = f9pVar.y();
                String strY4 = f9pVar.y();
                String strY5 = f9pVar.y();
                tsf1 tsf1Var = (tsf1) vm30Var9.I.get();
                c8o.l(tsf1Var);
                y4q y4qVar = (y4q) vm30Var9.L.get();
                c8o.l(y4qVar);
                bl3 bl3Var = (bl3) vm30Var9.M.get();
                c8o.l(bl3Var);
                wp20 wp20Var = new wp20(strY5, tsf1Var, y4qVar, bl3Var, new pm30(((Boolean) vm30Var9.H.get()).booleanValue()));
                i4q i4qVar = (i4q) vm30Var9.J.get();
                c8o.l(i4qVar);
                lc20 lc20Var = new lc20(strY4, wp20Var, i4qVar, (byte) 4);
                lzn0 lzn0Var3 = (lzn0) vm30Var9.z.get();
                c8o.l(lzn0Var3);
                hqo hqoVarI2 = f9pVar.i();
                gj5 gj5Var = (gj5) vm30Var9.a.get();
                c8o.l(gj5Var);
                p3q p3qVar = (p3q) vm30Var9.j.get();
                c8o.l(p3qVar);
                ywv0 ywv0VarA = p3qVar.a(gj5Var.e0());
                i8h1 i8h1VarZ2 = u1n0.z((q7r0) f9pVar.Y);
                ijr ijrVar = (ijr) vm30Var9.o.get();
                c8o.l(ijrVar);
                oj3 oj3Var = (oj3) vm30Var9.K.get();
                c8o.l(oj3Var);
                jip jipVar = (jip) ((jly0) f9pVar.h).get();
                luk lukVar3 = (luk) vm30Var9.y.get();
                c8o.l(lukVar3);
                return new i160(iac0VarP3, strY3, lc20Var, lzn0Var3, hqoVarI2, ywv0VarA, i8h1VarZ2, ijrVar, oj3Var, jipVar, new dg4(false, false, false, lukVar3));
            case 14:
                return new jip(this, (byte) 0);
            case 15:
                xfx xfxVar2 = (xfx) ((vm30) f9pVar.t).r.get();
                c8o.l(xfxVar2);
                return new yfx(xfxVar2.e, (byte) 1);
            case 16:
                vu1 vu1Var2 = (vu1) ((vm30) f9pVar.t).i.get();
                c8o.l(vu1Var2);
                return new wn1(new xn1(vu1Var2, u1n0.z((q7r0) f9pVar.Y)));
            case 17:
                lzn0 lzn0Var4 = (lzn0) ((vm30) f9pVar.t).z.get();
                c8o.l(lzn0Var4);
                return new bqf1(lzn0Var4, u1n0.z((q7r0) f9pVar.Y));
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                xfx xfxVar3 = (xfx) ((vm30) f9pVar.t).r.get();
                c8o.l(xfxVar3);
                Context context2 = xfxVar3.b.a;
                yb10 yb10Var = eh10.d;
                if (yb10Var != o810.d) {
                    return yb10Var != yb10.d ? new nzj(context2, fqi.c) : new nzj(context2, fqi.b);
                }
                return new nzj(context2, fqi.a);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new fm30(new vx40(u1n0.z((q7r0) f9pVar.Y), new c4n0((q7r0) f9pVar.Y), (byte) 14));
            case 20:
                return new ie70((l670) ((jly0) f9pVar.U0).get(), (w470) ((jly0) f9pVar.W0).get());
            case 21:
                lzn0 lzn0Var5 = (lzn0) ((vm30) f9pVar.t).z.get();
                c8o.l(lzn0Var5);
                String str3 = d8.c(new c4n0((q7r0) f9pVar.Y)).a;
                c8o.m(str3);
                return new mm30(str3, lzn0Var5);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object m() {
        yw30 yw30Var = (yw30) ((h72) this.c).b;
        byte b = this.b;
        switch (b) {
            case 0:
                return new lip(this);
            case 1:
                return new mip(this);
            case 2:
                return new nip(this);
            case 3:
                return new oip(this);
            case 4:
                return new pip(this);
            case 5:
                return new qip(this);
            case 6:
                r2r r2rVar = (r2r) yw30Var.L.get();
                c8o.l(r2rVar);
                return new n1n0(r2rVar);
            case 7:
                b35 b35Var = (b35) yw30Var.w.get();
                c8o.l(b35Var);
                dbr0 yxe1Var = new yxe1(new ehc1(""));
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new cbr0(new dbr0[]{yxe1Var, new bn70(yon1.G1("HOME_FUNKIS", "home-funkis", 796, "home-funkis"), nik1.z0, (nar0) null), new j0c0(mno1.B), new fja(gvn0.a), new ly3(), new pu00(true), new vmc1(yon1.O1().c), new t1r0(true), new s9h1(12, true, b35Var.e(), false)}, false);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object n() {
        k42 k42Var = (k42) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                h140 h140Var = (h140) k42Var.a;
                kik1 kik1Var = nik1.V;
                String str = h140Var.a;
                if (kik1Var.a(str)) {
                    return kik1Var.b(str);
                }
                eg.m(l1d.m("GameResults can only be created with a valid uri, received completionId ", h140Var.b));
                return null;
            case 1:
                return new rip(this);
            case 2:
                return new sip(this, (byte) 0);
            case 3:
                pe peVarH = ((ivj) k42Var.b).h();
                c8o.l(peVarH);
                return Boolean.valueOf(peVarH.b(7));
            case 4:
                return new tip(this);
            case 5:
                return new uip(this);
            case 6:
                return new vip(this);
            case 7:
                return new wip(this);
            case 8:
                return new xip(this, (byte) 0);
            case 9:
                return cwl1.C((q7r0) k42Var.d);
            case 10:
                return new yip((byte) 0);
            case 11:
                rgn0 rgn0Var = (rgn0) ((jly0) k42Var.o).get();
                jly0 jly0Var = (jly0) k42Var.p;
                e140 e140Var = (e140) k42Var.c;
                luc lucVar = (luc) e140Var.j.get();
                c8o.l(lucVar);
                q8n q8nVar = (q8n) e140Var.b.get();
                c8o.l(q8nVar);
                zja1 zja1Var = new zja1(rgn0Var, jly0Var, lucVar, q8nVar);
                ((q7r0) k42Var.d).d.c.getLifecycle().a(new i83(zja1Var, (byte) 22));
                return zja1Var;
            case 12:
                return new rgn0();
            case 13:
                return new SoundPool.Builder().setMaxStreams(10).build();
            case 14:
                ttm0 ttm0Var = (ttm0) ((jly0) k42Var.r).get();
                rgn0 rgn0Var2 = (rgn0) ((jly0) k42Var.o).get();
                u9c0 u9c0VarQ = cto1.q(((q7r0) k42Var.d).d.c);
                return new sfn0(new p410(ttm0Var, u9c0VarQ, yjy0.a), rgn0Var2, u9c0VarQ);
            case 15:
                ttm0 ttm0VarE = cwl1.E((q7r0) k42Var.d);
                c8o.m(ttm0VarE);
                return ttm0VarE;
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object o() {
        p2o0 p2o0Var = (p2o0) this.c;
        v540 v540Var = (v540) p2o0Var.b;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) v540Var.d.get());
        }
        if (b == 1) {
            return new zip(this);
        }
        if (b == 2) {
            lzn0 lzn0Var = (lzn0) v540Var.b.get();
            c8o.l(lzn0Var);
            zeu zeuVarZ = p2o0Var.z();
            zhh1 zhh1Var = (zhh1) v540Var.g.get();
            c8o.l(zhh1Var);
            Activity activity = (Activity) v540Var.a.get();
            c8o.l(activity);
            return new nzh1(lzn0Var, zeuVarZ, zhh1Var, activity);
        }
        if (b != 3) {
            jah.e(b);
            return null;
        }
        Activity activity2 = (Activity) v540Var.a.get();
        c8o.l(activity2);
        RetrofitMaker retrofitMaker = (RetrofitMaker) v540Var.f.get();
        c8o.l(retrofitMaker);
        rmr rmrVar = new rmr((h8y) retrofitMaker.createWebgateService(h8y.class, "android-content-access-gatedcontentimpl"), (byte) 24);
        kt91 kt91Var = (kt91) v540Var.e.get();
        c8o.l(kt91Var);
        return new s7y(activity2, rmrVar, kt91Var, p2o0Var.z());
    }

    private final Object p() {
        k9k k9kVar = (k9k) this.c;
        byte b = this.b;
        if (b == 0) {
            return (qhe0) ((jly0) k9kVar.d).get();
        }
        if (b != 1) {
            if (b == 2) {
                return new mir0(((qhe0) ((jly0) k9kVar.d).get()).a());
            }
            jah.e(b);
            return null;
        }
        c2r0 c2r0Var = (c2r0) ((s250) k9kVar.c).f.get();
        c8o.l(c2r0Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return c2r0Var.b(yon1.A1(), (qir0) null);
    }

    private final Object q() {
        voa voaVar = (voa) this.c;
        i691 i691Var = i691.a;
        byte b = this.b;
        switch (b) {
            case 0:
                ve50 ve50Var = (ve50) voaVar.a;
                ve50 ve50Var2 = (ve50) voaVar.a;
                xfx xfxVarC0 = ve50Var.c0();
                c8o.l(xfxVarC0);
                a62 a62Var = (a62) ((jly0) voaVar.d).get();
                mwn0 mwn0VarX = ve50Var2.x();
                c8o.l(mwn0VarX);
                cce cceVar = new cce(a62Var, mwn0VarX, (hnl) ((jly0) voaVar.e).get(), (byte) 16);
                l0y l0yVar = (l0y) ((jly0) voaVar.f).get();
                k0y k0yVar = (k0y) ((jly0) voaVar.g).get();
                mwn0 mwn0VarX2 = ve50Var2.x();
                c8o.l(mwn0VarX2);
                sp00 sp00Var = new sp00(l0yVar, k0yVar, mwn0VarX2, (hnl) ((jly0) voaVar.e).get(), (byte) 1);
                ynb0 ynb0VarA = xqu.a((chp) voaVar.q);
                ynb0 ynb0VarA2 = xqu.a((chp) voaVar.r);
                luk lukVarW = ve50Var2.w();
                c8o.l(lukVarW);
                dn4 dn4Var = new dn4(lukVarW);
                Flowable flowable = (Flowable) ((jly0) voaVar.h).get();
                mo9 mo9Var = mo9.N0;
                upd0 upd0Var = new upd0(flowable.j(mo9Var), (byte) 0);
                gg11 gg11VarN = ve50Var2.N();
                q2p0 q2p0Var = (q2p0) voaVar.b;
                luk lukVarW2 = ve50Var2.w();
                c8o.l(lukVarW2);
                k2p0 k2p0Var = new k2p0(gg11VarN, q2p0Var, new dn4(lukVarW2));
                v1k v1kVar = new v1k(((Flowable) ((jly0) voaVar.h).get()).j((FlowableTransformer) ((jly0) voaVar.s).get()), (d0r) ((jly0) voaVar.t).get(), (xrn0) ((jly0) voaVar.u).get(), (byte) 15);
                Flowable flowable2 = (Flowable) ((jly0) voaVar.h).get();
                ugm ugmVar = (ugm) ((jly0) voaVar.v).get();
                Scheduler schedulerU = ve50Var2.U();
                c8o.l(schedulerU);
                v1k v1kVar2 = new v1k(flowable2, ugmVar, schedulerU, (byte) 16);
                FlowableJust flowableJustI = Flowable.I(new pdm(false, false, false, false, false, false, false, false, false, false, false, false, false, 262135));
                fbm fbmVarL = ve50Var2.L();
                c8o.l(fbmVarL);
                FlowableMap flowableMapC1 = ve50Var2.c1();
                xrn0 xrn0Var = (xrn0) ((jly0) voaVar.u).get();
                cf50 cf50Var = (cf50) ((jly0) voaVar.f72p).get();
                Scheduler schedulerU2 = ve50Var2.U();
                c8o.l(schedulerU2);
                r5z r5zVar = new r5z(flowableMapC1, xrn0Var, cf50Var, schedulerU2);
                Flowable flowable3 = (Flowable) ((jly0) voaVar.h).get();
                fl3 fl3VarK = ve50Var2.K();
                c8o.l(fl3VarK);
                yl1 yl1Var = new yl1(flowable3, fl3VarK, (lik1) ((jly0) voaVar.o).get());
                Flowable flowableJ = ((Flowable) ((jly0) voaVar.h).get()).j(mo9Var);
                Flowable flowableF = ve50Var2.f();
                c8o.l(flowableF);
                Scheduler schedulerU3 = ve50Var2.U();
                c8o.l(schedulerU3);
                Scheduler schedulerU0 = ve50Var2.U0();
                c8o.l(schedulerU0);
                skd0 skd0VarX0 = ve50Var2.X0();
                c8o.l(skd0VarX0);
                ppd0 ppd0Var = new ppd0(flowableJ, flowableF, schedulerU3, schedulerU0, skd0VarX0, (byte) 0);
                FlowableMap flowableMapD = f2u0.D((Flowable) ((jly0) voaVar.h).get());
                Flowable flowable4 = (Flowable) ((jly0) voaVar.k).get();
                Flowable flowable5 = (Flowable) ((jly0) voaVar.h).get();
                mo9 mo9Var2 = mo9.O0;
                s691 s691Var = new s691(flowableMapD, flowable4, flowable5.j(mo9Var2), (w9u0) ((jly0) voaVar.l).get());
                w9u0 w9u0Var = (w9u0) ((jly0) voaVar.l).get();
                gn10 gn10Var = (gn10) ((jly0) voaVar.w).get();
                FlowableMap flowableMapF = f2u0.f((Flowable) ((jly0) voaVar.h).get());
                Flowable flowableJ2 = ((Flowable) ((jly0) voaVar.h).get()).j(mo9Var2);
                Flowable flowableJ3 = ((Flowable) ((jly0) voaVar.h).get()).j(mo9Var);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedD = f2u0.d((Flowable) ((jly0) voaVar.h).get());
                pe peVarH = ve50Var2.h();
                c8o.l(peVarH);
                luk lukVarW3 = ve50Var2.w();
                c8o.l(lukVarW3);
                dfm dfmVar = new dfm(w9u0Var, gn10Var, flowableMapF, flowableJ2, flowableJ3, flowableDistinctUntilChangedD, peVarH, new qmr(new in4(lukVarW3)));
                k691 k691Var = new k691((Flowable) ((jly0) voaVar.h).get(), (Flowable) ((jly0) voaVar.k).get(), (w9u0) ((jly0) voaVar.l).get(), nrq0.a, i691Var);
                Flowable flowable6 = (Flowable) ((jly0) voaVar.h).get();
                xh71 xh71VarZ = ve50Var2.z();
                c8o.l(xh71VarZ);
                fbm fbmVarL2 = ve50Var2.L();
                c8o.l(fbmVarL2);
                u601 u601VarT = ve50Var2.t();
                c8o.l(u601VarT);
                hq41 hq41VarD = ve50Var2.D();
                c8o.l(hq41VarD);
                me30 me30VarK = ve50Var2.k();
                c8o.l(me30VarK);
                Flowable flowableF2 = ve50Var2.f();
                c8o.l(flowableF2);
                f771 f771VarO = ve50Var2.O();
                c8o.l(f771VarO);
                poj0 poj0Var = new poj0((Object) hq41VarD, (Object) me30VarK, (Object) flowableF2, (Object) f771VarO, (byte) 15);
                f771 f771VarO2 = ve50Var2.O();
                c8o.l(f771VarO2);
                q8n q8nVarD = ve50Var2.d();
                c8o.l(q8nVarD);
                iac0 iac0Var = (iac0) ((jly0) voaVar.x).get();
                luk lukVarW4 = ve50Var2.w();
                c8o.l(lukVarW4);
                o671 o671Var = new o671(flowable6, xh71VarZ, fbmVarL2, u601VarT, poj0Var, f771VarO2, q8nVarD, iac0Var, lukVarW4);
                c9c0 c9c0VarL = ve50Var2.l();
                c8o.l(c9c0VarL);
                g5p0 g5p0VarU = ve50Var2.u();
                c8o.l(g5p0VarU);
                waz0 waz0VarY = ve50Var2.Y();
                c8o.l(waz0VarY);
                v6z0 v6z0Var = new v6z0(c9c0VarL, g5p0VarU, waz0VarY);
                aor aorVarE = ve50Var2.E();
                c8o.l(aorVarE);
                ynb0 ynb0VarA3 = xqu.a((chp) voaVar.y);
                ynb0 ynb0VarA4 = xqu.a((chp) voaVar.z);
                ynb0 ynb0VarA5 = xqu.a((jly0) voaVar.A);
                ynb0 ynb0VarA6 = xqu.a((chp) voaVar.B);
                ynb0 ynb0VarA7 = xqu.a((chp) voaVar.C);
                FlowableMap flowableMapD2 = f2u0.D((Flowable) ((jly0) voaVar.h).get());
                Scheduler schedulerU4 = ve50Var2.U();
                c8o.l(schedulerU4);
                luk lukVarW5 = ve50Var2.w();
                c8o.l(lukVarW5);
                rzo0 rzo0Var = new rzo0(flowableMapD2, schedulerU4, new tu4(false, lukVarW5), (byte) 20);
                FlowableJust flowableJustI2 = Flowable.I(new hvq0(ivq0.b, false));
                i8h1 i8h1Var = (i8h1) ((chp) voaVar.m).get();
                s4p0 s4p0VarR = ve50Var2.R();
                c8o.l(s4p0VarR);
                l6h1 l6h1VarE = s4p0VarR.e();
                c8o.m(l6h1VarE);
                s4p0 s4p0VarR2 = ve50Var2.R();
                c8o.l(s4p0VarR2);
                n7h1 n7h1VarF = s4p0VarR2.f();
                c8o.m(n7h1VarF);
                lqc lqcVar = new lqc((byte) 17);
                msm0 msm0VarV = ve50Var2.v();
                c8o.l(msm0VarV);
                return new ze50(xfxVarC0, cceVar, sp00Var, ynb0VarA, ynb0VarA2, dn4Var, upd0Var, k2p0Var, v1kVar, v1kVar2, flowableJustI, fbmVarL, r5zVar, yl1Var, ppd0Var, s691Var, dfmVar, k691Var, o671Var, v6z0Var, aorVarE, ynb0VarA3, ynb0VarA4, ynb0VarA5, ynb0VarA6, ynb0VarA7, rzo0Var, flowableJustI2, i8h1Var, l6h1VarE, n7h1VarF, lqcVar, new x4p0(msm0VarV, (n6r0) ((jly0) voaVar.D).get()), (lik1) ((jly0) voaVar.o).get());
            case 1:
                return new a62((p2p0) ((jly0) voaVar.c).get(), (byte) 2);
            case 2:
                return ((q2p0) voaVar.b).j();
            case 3:
                return k9o0.r((q2p0) voaVar.b);
            case 4:
                return new l0y((p2p0) ((jly0) voaVar.c).get(), (byte) 1);
            case 5:
                return new k0y((p2p0) ((jly0) voaVar.c).get(), (byte) 1);
            case 6:
                Flowable flowable7 = (Flowable) ((jly0) voaVar.h).get();
                Flowable flowable8 = (Flowable) ((jly0) voaVar.k).get();
                w9u0 w9u0Var2 = (w9u0) ((jly0) voaVar.l).get();
                o241 o241VarI = ((ve50) voaVar.a).i();
                c8o.l(o241VarI);
                return new ktf1(flowable7, flowable8, w9u0Var2, i691Var, o241VarI, (chp) voaVar.m, (fkf1) ((jly0) voaVar.f72p).get());
            case 7:
                return k9o0.B((q2p0) voaVar.b);
            case 8:
                return f2u0.B(f2u0.D((Flowable) ((jly0) voaVar.h).get()), (Flowable) ((jly0) voaVar.i).get(), (Flowable) ((jly0) voaVar.j).get(), voaVar.a());
            case 9:
                jly0 jly0Var = (jly0) voaVar.h;
                ve50 ve50Var3 = (ve50) voaVar.a;
                Flowable flowable9 = (Flowable) jly0Var.get();
                Scheduler schedulerU5 = ve50Var3.U();
                c8o.l(schedulerU5);
                yqg yqgVarA = ve50Var3.a();
                c8o.l(yqgVarA);
                return f2u0.z(flowable9, schedulerU5, yqgVarA, voaVar.a());
            case 10:
                return f2u0.y((Flowable) ((jly0) voaVar.h).get(), voaVar.a());
            case 11:
                return k9o0.z((q2p0) voaVar.b);
            case 12:
                s4p0 s4p0VarR3 = ((ve50) voaVar.a).R();
                c8o.l(s4p0VarR3);
                i8h1 i8h1VarD = s4p0VarR3.d();
                c8o.m(i8h1VarD);
                return i8h1VarD;
            case 13:
                return new af50((chp) voaVar.m, (o2p0) ((jly0) voaVar.n).get(), (lik1) ((jly0) voaVar.o).get());
            case 14:
                return ((q2p0) voaVar.b).h();
            case 15:
                return ((q2p0) voaVar.b).e();
            case 16:
                Flowable flowable10 = (Flowable) ((jly0) voaVar.h).get();
                Flowable flowable11 = (Flowable) ((jly0) voaVar.k).get();
                w9u0 w9u0Var3 = (w9u0) ((jly0) voaVar.l).get();
                o241 o241VarI2 = ((ve50) voaVar.a).i();
                c8o.l(o241VarI2);
                return new ekf1(flowable10, flowable11, w9u0Var3, i691Var, o241VarI2, (chp) voaVar.m, (fkf1) ((jly0) voaVar.f72p).get());
            case 17:
                return ((q2p0) voaVar.b).g();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return k9o0.t((q2p0) voaVar.b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                lzn0 lzn0VarC = ((ve50) voaVar.a).c();
                c8o.l(lzn0VarC);
                return aan0.p(lzn0VarC);
            case 20:
                jly0 jly0Var2 = (jly0) voaVar.o;
                ve50 ve50Var4 = (ve50) voaVar.a;
                lik1 lik1Var = (lik1) jly0Var2.get();
                ye90 ye90VarB1 = ve50Var4.b1();
                luk lukVarW6 = ve50Var4.w();
                c8o.l(lukVarW6);
                return new ypd0(lik1Var, ye90VarB1, new uu4(false, lukVarW6));
            case 21:
                return ((q2p0) voaVar.b).f();
            case 22:
                return k9o0.v((q2p0) voaVar.b);
            case 23:
                FlowableMap flowableMapF2 = f2u0.f((Flowable) ((jly0) voaVar.h).get());
                ve50 ve50Var5 = (ve50) voaVar.a;
                gw70 gw70VarB = ve50Var5.b();
                c8o.l(gw70VarB);
                ufg1 ufg1VarS = ve50Var5.S();
                c8o.l(ufg1VarS);
                Scheduler schedulerU6 = ve50Var5.U();
                c8o.l(schedulerU6);
                return new te50(f2u0.g(flowableMapF2, gw70VarB, ufg1VarS, schedulerU6));
            case 24:
                return ((ve50) voaVar.a).W0();
            case 25:
                return w3p0.w(((ve50) voaVar.a).H(), (q2p0) voaVar.b, (o2p0) ((jly0) voaVar.n).get());
            case 26:
                FlowableJust flowableJustY = k9o0.y((hnl) ((jly0) voaVar.e).get());
                p2p0 p2p0Var = (p2p0) ((jly0) voaVar.c).get();
                Scheduler schedulerU7 = ((ve50) voaVar.a).U();
                c8o.l(schedulerU7);
                return new tqq0(flowableJustY, p2p0Var, schedulerU7);
            case 27:
                a1g1 a1g1Var = new a1g1(((ve50) voaVar.a).F(), (byte) 11);
                Scheduler schedulerU8 = ((ve50) voaVar.a).U();
                c8o.l(schedulerU8);
                return new h280(a1g1Var, schedulerU8);
            case 28:
                return ((q2p0) voaVar.b).i();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object r() {
        tnm tnmVar = (tnm) this.c;
        ch50 ch50Var = (ch50) tnmVar.c;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return cwl1.C((q7r0) tnmVar.d);
            }
            if (b != 2) {
                if (b == 3) {
                    return pzm.h((mos) ch50Var.h.get());
                }
                jah.e(b);
                return null;
            }
            bfd bfdVar = (bfd) ch50Var.c.get();
            c8o.l(bfdVar);
            vcd0 vcd0Var = (vcd0) ch50Var.d.get();
            c8o.l(vcd0Var);
            Flowable flowable = (Flowable) ch50Var.f.get();
            c8o.l(flowable);
            return new zg50(bfdVar, vcd0Var, flowable);
        }
        kly0 kly0Var = ch50Var.i;
        kly0 kly0Var2 = ch50Var.j;
        vcd0 vcd0Var2 = (vcd0) ch50Var.d.get();
        c8o.l(vcd0Var2);
        n801 n801Var = new n801(vcd0Var2, (byte) 9);
        f1n0 f1n0Var = (f1n0) ch50Var.b.get();
        c8o.l(f1n0Var);
        d4e0 d4e0Var = new d4e0(f1n0Var, (byte) 18);
        upa0 upa0Var = new upa0((d0r) ((jly0) tnmVar.e).get(), (byte) 12);
        Context context = (Context) ch50Var.a.get();
        c8o.l(context);
        kt91 kt91Var = (kt91) ch50Var.e.get();
        c8o.l(kt91Var);
        q8n q8nVar = (q8n) kly0Var2.get();
        c8o.l(q8nVar);
        r961 r961Var = new r961(context, kt91Var, q8nVar, (byte) 12);
        q8n q8nVar2 = (q8n) kly0Var.get();
        c8o.l(q8nVar2);
        alw alwVar = new alw(n801Var, d4e0Var, upa0Var, r961Var, q8nVar2);
        q8n q8nVar3 = (q8n) kly0Var.get();
        c8o.l(q8nVar3);
        q8n q8nVar4 = (q8n) kly0Var2.get();
        c8o.l(q8nVar4);
        return new yg50(new fo7(alwVar, q8nVar3, q8nVar4), (dh50) tnmVar.b);
    }

    private final Object s() {
        tnm tnmVar = (tnm) this.c;
        li50 li50Var = (li50) tnmVar.c;
        mi50 mi50Var = (mi50) tnmVar.b;
        byte b = this.b;
        if (b == 0) {
            i1n0 i1n0Var = (i1n0) mi50Var.g.get();
            c8o.l(i1n0Var);
            j4p j4pVar = (j4p) ((jly0) tnmVar.e).get();
            Bundle bundle = (Bundle) ((jly0) tnmVar.f).get();
            ees eesVarA = i1n0Var.a(li50Var, li50Var);
            s28 s28Var = s28.g;
            a680 a680Var = eesVarA.a;
            a680Var.a = s28Var;
            a680Var.b = new u5e(j4pVar, bundle, (byte) 1);
            return eesVarA;
        }
        if (b == 1) {
            return new j4p(this, (byte) 2);
        }
        if (b == 2) {
            return new y5e();
        }
        if (b == 3) {
            return sd30.p(li50Var);
        }
        if (b != 4) {
            jah.e(b);
            return null;
        }
        Bundle bundle2 = (Bundle) ((jly0) tnmVar.f).get();
        pnv0 pnv0Var = (pnv0) mi50Var.c.get();
        c8o.l(pnv0Var);
        oto0 oto0VarA = mi50Var.a();
        c8o.l(oto0VarA);
        tym0 tym0Var = new tym0(oto0VarA, (byte) 29);
        oto0 oto0VarA2 = mi50Var.a();
        c8o.l(oto0VarA2);
        return new ni50(bundle2, pnv0Var, tym0Var, oto0VarA2);
    }

    private final Object t() {
        cp31 cp31Var = (cp31) this.c;
        byte b = this.b;
        if (b == 0) {
            return new j4p(this, (byte) 3);
        }
        if (b == 1) {
            return new y5e();
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        qi50 qi50Var = (qi50) cp31Var.b;
        Bundle bundle = new Bundle();
        bi90 bi90Var = qi50Var.a;
        if (bi90Var != null) {
            bundle.putParcelable("SELECTED_GROUP_ITEM", bi90Var);
        }
        String str = qi50Var.b;
        if (str != null) {
            bundle.putString("SELECTED_GROUP_ITEM_KEY", str);
        }
        String str2 = qi50Var.c;
        if (str2 != null) {
            bundle.putString("SELECTED_GROUP_ITEM_URI", str2);
        }
        pnv0 pnv0Var = (pnv0) ((pi50) cp31Var.a).f.get();
        c8o.l(pnv0Var);
        return new ni50(bundle, pnv0Var, new tym0(cp31Var.G(), (byte) 29), cp31Var.G());
    }

    private final Object u() {
        tnm tnmVar = (tnm) this.c;
        ek50 ek50Var = (ek50) tnmVar.c;
        byte b = this.b;
        if (b == 0) {
            d0r d0rVar = (d0r) ((jly0) tnmVar.e).get();
            d0r d0rVar2 = (d0r) ((jly0) tnmVar.e).get();
            yqg yqgVar = (yqg) ek50Var.g.get();
            c8o.l(yqgVar);
            ihd0 ihd0Var = (ihd0) ek50Var.h.get();
            c8o.l(ihd0Var);
            q8n q8nVar = (q8n) ek50Var.i.get();
            c8o.l(q8nVar);
            return new kj50(new bk50(d0rVar, new lp10(d0rVar2, yqgVar, ihd0Var, q8nVar)), (fk50) tnmVar.b);
        }
        if (b == 1) {
            return cwl1.C((q7r0) tnmVar.d);
        }
        if (b != 2) {
            if (b == 3) {
                return pzm.h((mos) ek50Var.f.get());
            }
            jah.e(b);
            return null;
        }
        bfd bfdVar = (bfd) ek50Var.b.get();
        c8o.l(bfdVar);
        vcd0 vcd0Var = (vcd0) ek50Var.c.get();
        c8o.l(vcd0Var);
        Flowable flowable = (Flowable) ek50Var.d.get();
        c8o.l(flowable);
        return new tj50(bfdVar, vcd0Var, flowable);
    }

    private final Object v() {
        byte b = this.b;
        if (b == 0) {
            return new hjp(this);
        }
        if (b == 1) {
            return new ijp();
        }
        if (b == 2) {
            return new jjp(this);
        }
        if (b == 3) {
            return new kjp(this);
        }
        jah.e(b);
        return null;
    }

    private final Object w() {
        byte b = this.b;
        if (b == 0) {
            return new mjp(this);
        }
        if (b == 1) {
            return new njp(this);
        }
        if (b == 2) {
            return new ojp(this);
        }
        if (b == 3) {
            return new pjp(this);
        }
        if (b == 4) {
            return pzm.h((mos) ((lw60) ((a680) this.c).a).h.get());
        }
        jah.e(b);
        return null;
    }

    private final Object x() {
        kp5 kp5Var = (kp5) this.c;
        s880 s880Var = (s880) kp5Var.a;
        byte b = this.b;
        switch (b) {
            case 0:
                return new ujp(this, (byte) 0);
            case 1:
                return new iae1((o0e1) ((jly0) kp5Var.b).get(), (yqg) s880Var.f);
            case 2:
                return new o0e1();
            case 3:
                return new sj30(new j8o());
            case 4:
                return new ri41((yqg) s880Var.f);
            case 5:
                cir0 cir0Var = (cir0) s880Var.g;
                c8o.l(cir0Var);
                zhq0 zhq0VarK = cir0Var.k();
                c8o.m(zhq0VarK);
                jc9 jc9Var = (jc9) s880Var.h;
                c8o.l(jc9Var);
                cir0 cir0Var2 = (cir0) s880Var.g;
                c8o.l(cir0Var2);
                iac0 iac0VarE = cir0Var2.e();
                c8o.m(iac0VarE);
                return new q4d(zhq0VarK, jc9Var, iac0VarE);
            case 6:
                Activity activity = (Activity) s880Var.b;
                cir0 cir0Var3 = (cir0) s880Var.g;
                c8o.l(cir0Var3);
                return new ems0(activity, cir0Var3);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object y() {
        ip31 ip31Var = (ip31) this.c;
        k42 k42Var = (k42) ip31Var.b;
        byte b = this.b;
        switch (b) {
            case 0:
                chp chpVar = (chp) ip31Var.c;
                h54 h54Var = (h54) k42Var.g;
                c8o.l(h54Var);
                return new zkv(chpVar, h54Var);
            case 1:
                return new SoundPool.Builder().setMaxStreams(1).build();
            case 2:
                g38 g38Var = (g38) k42Var.l;
                c8o.l(g38Var);
                return g38Var;
            case 3:
                return new wjp(this, (byte) 0);
            case 4:
                g0l g0lVar = (g0l) k42Var.k;
                c8o.l(g0lVar);
                Flowable flowable = (Flowable) k42Var.a;
                c8o.l(flowable);
                return new opu(g0lVar, flowable, ip31Var.o(), ip31Var.t());
            case 5:
                return new xjp(this);
            case 6:
                return new yjp(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object z() {
        zjp zjpVar = (zjp) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new yna((ena) zjpVar.w.get(), (cna) zjpVar.x.get(), (t390) zjpVar.v.get(), zjpVar.m);
            case 1:
                jly0 jly0Var = zjpVar.r;
                rma rmaVar = zjpVar.c;
                return new ena(new dqu((xxu) jly0Var.get(), (byte) 1), n0a.u(zjpVar.a, zjpVar.b, zjpVar.g, rmaVar), (tna) zjpVar.t.get(), (tna) zjpVar.u.get(), rmaVar, xqu.a(zjpVar.s), (t390) zjpVar.v.get(), zjpVar.l);
            case 2:
                Context context = zjpVar.a;
                yab1 yab1Var = (yab1) zjpVar.o.get();
                l270 l270Var = zjpVar.b;
                rma rmaVar2 = zjpVar.c;
                q59 q59Var = new q59(new vrv0(zjpVar.d, rmaVar2.a(), 4), rmaVar2, (byte) 11);
                coa coaVar = (coa) zjpVar.p.get();
                Executor executor = (Executor) zjpVar.q.get();
                wpc wpcVar = new wpc();
                wpcVar.a = coaVar.a;
                wpcVar.c = new jma((byte) 0, false);
                wpcVar.e = new dzp0(((yyp0) l270Var).c(), (byte) 0);
                return new xxu(context, new qvr(yab1Var), new toj0(q59Var, wpcVar, executor));
            case 3:
                return new yab1(zjpVar.a.getApplicationContext(), "exoplayer_internal.db", null, 1);
            case 4:
                return new coa((yab1) zjpVar.o.get(), zjpVar.e);
            case 5:
                q8n q8nVar = zjpVar.f;
                p8n p8nVar = q8n.b;
                return qgo1.l(q8nVar.M(5));
            case 6:
                return new una(new l1p0(zjpVar.b, (byte) 5), zjpVar.c, xqu.a(zjpVar.s));
            case 7:
                bn31 bn31VarT = u890.t(zjpVar.a, BetamaxOfflineDatabase.class, "bmax-offline.db");
                bn31VarT.d();
                bn31VarT.i = true;
                return new vna(bn31VarT.c());
            case 8:
                byp0 byp0Var = zjpVar.h;
                xqu.a(zjpVar.s);
                return new npt0(byp0Var);
            case 9:
                t2j0 t2j0Var = zjpVar.i;
                return new t390(p7h.M(new wma[]{zna.a, new aoa(t2j0Var), new boa(t2j0Var, zjpVar.k, zjpVar.f)}), zjpVar.j);
            case 10:
                return new cna(new dqu((xxu) zjpVar.r.get(), (byte) 1), (vna) zjpVar.s.get(), (t390) zjpVar.v.get(), zjpVar.f, zjpVar.m);
            case 11:
                jly0 jly0Var2 = zjpVar.y;
                rma rmaVar3 = zjpVar.c;
                l270 l270Var2 = zjpVar.b;
                return new hna((yna) jly0Var2.get(), (vna) zjpVar.s.get(), (tna) zjpVar.t.get(), (tna) zjpVar.u.get(), n0a.u(zjpVar.a, l270Var2, zjpVar.g, rmaVar3), new l1p0(l270Var2, (byte) 5), zjpVar.h, rmaVar3, zjpVar.n);
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        Set setSingleton;
        n710 ats0Var;
        l9o0 v7cVar;
        y610 vxm1Var;
        byte b = this.a;
        byte b2 = this.b;
        Object obj = this.c;
        byte b3 = 5;
        byte b4 = 2;
        byte b5 = 1;
        byte b6 = 0;
        switch (b) {
            case 0:
                if (b2 == 0) {
                    return new xgp(this);
                }
                if (b2 == 1) {
                    return new ygp((byte) 0);
                }
                if (b2 == 2) {
                    return new zgp(this);
                }
                if (b2 == 3) {
                    return new ahp(this);
                }
                if (b2 == 4) {
                    return new bhp(this);
                }
                if (b2 != 5) {
                    jah.e(b2);
                    return null;
                }
                a1r0 a1r0Var = (a1r0) ((k0q) ((c21) obj).d).b.V0.get();
                c8o.l(a1r0Var);
                return new kah1(new up0(a1r0Var));
            case 1:
                ghp ghpVar = (ghp) obj;
                byte b7 = 28;
                switch (b2) {
                    case 0:
                        v64 v64Var = new v64();
                        v64Var.a = j5.a;
                        return v64Var;
                    case 1:
                        b410 b410Var = ghpVar.a;
                        b410 b410Var2 = ghpVar.a;
                        Scheduler scheduler = (Scheduler) b410Var.m.get();
                        Scheduler scheduler2 = (Scheduler) b410Var2.n.get();
                        t360 t360Var = new t360(19);
                        t360Var.a(new y741(ghpVar.q));
                        t360Var.a(new am6(xqu.a(ghpVar.p)));
                        t360Var.a(new t7c(xqu.a(ghpVar.r), (byte) 0));
                        t360Var.a(new t7c(xqu.a(ghpVar.s), (byte) 1));
                        jly0 jly0Var = ghpVar.j;
                        ArrayList arrayList = new ArrayList(2);
                        arrayList.add(new y741(ghpVar.q));
                        arrayList.add(new xss0(ghpVar.j, new y741(ghpVar.q)));
                        if (arrayList.isEmpty()) {
                            setSingleton = Collections.EMPTY_SET;
                        } else {
                            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
                        }
                        t360Var.a(new zjs(jly0Var, setSingleton));
                        t360Var.a(new t7c(ghpVar.v, (byte) 11));
                        t360Var.a(new t7c(xqu.a(ghpVar.i), (byte) 3));
                        t360Var.a(new xss0(ghpVar.j, new y741(ghpVar.q)));
                        t360Var.a(new nut0(xqu.a(ghpVar.w), xqu.a(ghpVar.g), (byte) 0));
                        ynb0 ynb0VarA = xqu.a(ghpVar.n);
                        ynb0 ynb0VarA2 = xqu.a(ghpVar.o);
                        b410 b410Var3 = ghpVar.a;
                        t360Var.a(new onc0(ynb0VarA, ynb0VarA2, b410Var3.c(), new ue4(true, false, false, (luk) b410Var3.s0.get())));
                        t360Var.a(new t7c(xqu.a(ghpVar.y), (byte) 4));
                        t360Var.a(new nut0(ghpVar.B, new t7c(xqu.a(ghpVar.y), (byte) 4), (byte) 1));
                        t360Var.a(new t7c(xqu.a(ghpVar.C), (byte) 2));
                        t360Var.a(new t7c(xqu.a(ghpVar.x), (byte) 5));
                        t360Var.a(new t7c(xqu.a(ghpVar.x), (byte) 6));
                        t360Var.a(new t7c(xqu.a(ghpVar.x), (byte) 7));
                        t360Var.a(new t7c(xqu.a(ghpVar.D), (byte) 8));
                        t360Var.a(new t7c(xqu.a(ghpVar.x), (byte) 9));
                        t360Var.a(new t7c(xqu.a(ghpVar.x), (byte) 10));
                        return new c610(scheduler, scheduler2, t360Var.d(), ghpVar.j(), new bnj0((z141) b410Var2.C.get(), (dxz0) b410Var2.B.get(), (byte) 13), (q610) ghpVar.f0.get(), (oyr) ghpVar.g0.get(), eth.X((xm41) b410Var2.v0.get()).map(een.e1), ghpVar.i(), (nkv) ghpVar.h0.get());
                    case 2:
                        ats0 ats0Var2 = (ats0) ghpVar.j.get();
                        ynb0 ynb0VarA3 = xqu.a(ghpVar.n);
                        ynb0 ynb0VarA4 = xqu.a(ghpVar.o);
                        b410 b410Var4 = ghpVar.a;
                        return new z741(ats0Var2, new onc0(ynb0VarA3, ynb0VarA4, b410Var4.c(), new ue4(true, false, false, (luk) b410Var4.s0.get())), new am6(xqu.a(ghpVar.p)), b6);
                    case 3:
                        b410 b410Var5 = ghpVar.a;
                        b410 b410Var6 = ghpVar.a;
                        ats0Var = new ats0(b410Var5.b(), (zuz) ghpVar.d.get(), ghpVar.h(), new ytp0(ghpVar.i(), new ifl1((dxz0) b410Var6.B.get(), (byte) 8), b410Var6.a(), (Scheduler) b410Var6.n.get(), (xvo) b410Var6.I.get(), (byte) 6), new t7c(xqu.a(ghpVar.i), (byte) 3), (n3q0) b410Var6.X.get(), b410Var6.f(), b410Var6.e(), (Scheduler) b410Var6.n.get());
                        return ats0Var;
                    case 4:
                        ghpVar.getClass();
                        return new zuz(kp01.a, ((avz) ghpVar.c.get()).a);
                    case 5:
                        return new avz(new np01(new CosmosTransport(new x430((RxRouter) ghpVar.a.G.get(), (byte) 6))));
                    case 6:
                        return new jtp0(ghpVar.e(), ghpVar.l(), ghpVar.b());
                    case 7:
                        return new xum1(ghpVar.a.b(), xqu.a(ghpVar.e), xqu.a(ghpVar.f), xqu.a(ghpVar.g));
                    case 8:
                        return (lut0) ghpVar.a.b0.get();
                    case 9:
                        return (qut0) ghpVar.a.c0.get();
                    case 10:
                        return (upp0) ghpVar.a.f0.get();
                    case 11:
                        b410 b410Var7 = ghpVar.a;
                        b410 b410Var8 = ghpVar.a;
                        ats0Var = new vvc0(b410Var7.b(), (xrc0) b410Var8.g.get(), (iyc0) b410Var8.U.get(), (PlaylistRequestDecorationPolicy) ghpVar.k.get(), (n3d0) b410Var8.Y.get(), b410Var8.g(), new fdc(b410Var8.d(), ghpVar.g(), b410Var8.b(), ((Boolean) b410Var8.r.get()).booleanValue()), (ki91) ghpVar.l.get(), (pqs) b410Var8.q0.get(), b410Var8.c(), (xrm1) b410Var8.B0.get(), (wqg) b410Var8.v.get(), ghpVar.m, (Flowable) b410Var8.F0.get(), new ue4(true, false, false, (luk) b410Var8.s0.get()), ghpVar.g());
                        return ats0Var;
                    case 12:
                        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                        sku0 sku0VarP = PlaylistDecorationPolicy.p();
                        sku0VarP.R();
                        sku0VarP.N();
                        sku0VarP.H();
                        sku0VarP.G();
                        sku0VarP.Z();
                        sku0VarP.S();
                        hru0VarS.x(sku0VarP);
                        vwu0 vwu0VarR = PlaylistTrackDecorationPolicy.r();
                        vwu0VarR.A();
                        vwu0VarR.C(TrackDecorationPolicy.newBuilder().setLink(true).setName(true).setLength(true).setPlayable(true).setIsExplicit(true).setIs19PlusOnly(true).setIsPremiumOnly(true));
                        vwu0VarR.z();
                        vwu0VarR.t(ArtistDecorationPolicy.newBuilder().setName(true));
                        dgu0 dgu0VarP = PlaylistAlbumDecorationPolicy.p();
                        dgu0VarP.n(AlbumDecorationPolicy.newBuilder().setCovers(true).setName(true));
                        vwu0VarR.s(dgu0VarP);
                        hru0VarS.z(vwu0VarR);
                        iou0 iou0VarV = PlaylistItemDecorationPolicy.v();
                        iou0VarV.D(true);
                        iou0VarV.t(true);
                        iou0VarV.v();
                        ol90 ol90VarO = ItemOfflineStateDecorationPolicy.o();
                        ol90VarO.q(true);
                        ol90VarO.r(true);
                        iou0VarV.z(ol90VarO);
                        fj90 fj90VarN = ItemExtensionPolicy.n();
                        clc0 clc0Var = clc0.g;
                        fj90VarN.r(clc0Var);
                        fj90VarN.n(hz00.Z);
                        fj90 fj90VarN2 = ItemExtensionPolicy.n();
                        fj90VarN2.r(clc0Var);
                        fj90VarN2.n(hz00.B1);
                        fj90 fj90VarN3 = ItemExtensionPolicy.n();
                        fj90VarN3.r(clc0Var);
                        fj90VarN3.n(hz00.c2);
                        fj90 fj90VarN4 = ItemExtensionPolicy.n();
                        clc0 clc0Var2 = clc0.h;
                        fj90VarN4.r(clc0Var2);
                        fj90VarN4.n(hz00.f1);
                        fj90 fj90VarN5 = ItemExtensionPolicy.n();
                        fj90VarN5.r(clc0Var2);
                        fj90VarN5.n(hz00.I3);
                        iou0VarV.n(p7h.M(new ItemExtensionPolicy[]{fj90VarN.build(), fj90VarN2.build(), fj90VarN3.build(), fj90VarN4.build(), fj90VarN5.build()}));
                        hru0VarS.v(iou0VarV);
                        llu0 llu0VarR = PlaylistEpisodeDecorationPolicy.r();
                        llu0VarR.x();
                        llu0VarR.s(EpisodeDecorationPolicy.newBuilder().setLink(true).setName(true).setLength(true).setAvailable(true).setPublishDate(true).setCovers(true).setIsExplicit(true).setIs19PlusOnly(true));
                        llu0VarR.v(EpisodePlayedStateDecorationPolicy.newBuilder().setPlayable(true).setIsPlayed(true).setPlayabilityRestriction(true).setTimeLeft(true));
                        llu0VarR.B(EpisodeSyncDecorationPolicy.newBuilder().setOffline(true));
                        llu0VarR.r(EpisodeCollectionDecorationPolicy.newBuilder().setIsNew(true));
                        hru0VarS.t(llu0VarR);
                        return hru0VarS.build();
                    case 13:
                        return ((tp91) ghpVar.a.x0.get()).a(new pp91((nn61) null, (qp91) null, 0, (ywv0) null, 119));
                    case 14:
                        return new fkv((six0) ghpVar.a.n0.get(), (cyu) ghpVar.a.H.get(), (dv00) ghpVar.a.R.get());
                    case 15:
                        b410 b410Var9 = ghpVar.a;
                        b410 b410Var10 = ghpVar.a;
                        return new hwc0(b410Var9.b(), (xrc0) b410Var10.g.get(), (iyc0) b410Var10.U.get(), (PlaylistRequestDecorationPolicy) ghpVar.k.get(), (n3d0) b410Var10.Y.get(), b410Var10.g(), new fdc(b410Var10.d(), ghpVar.g(), b410Var10.b(), ((Boolean) b410Var10.r.get()).booleanValue()), (ki91) ghpVar.l.get(), (pqs) b410Var10.q0.get(), b410Var10.c(), (xrm1) b410Var10.B0.get(), (wqg) b410Var10.v.get(), ghpVar.m);
                    case 16:
                        b410 b410Var11 = ghpVar.a;
                        b410 b410Var12 = ghpVar.a;
                        return new yr6(b410Var11.b(), new ueg(new CosmosTransport(new sn0((RxRouter) b410Var12.G.get(), (byte) 17))), (r5h) b410Var12.d.get(), ghpVar.h(), b410Var12.g());
                    case 17:
                        b410 b410Var13 = ghpVar.a;
                        b410 b410Var14 = ghpVar.a;
                        return new u7c(b410Var13.b(), ghpVar.i(), b410Var14.a(), new ifl1((dxz0) b410Var14.B.get(), (byte) 8), (n3q0) b410Var14.X.get(), ghpVar.h(), b410Var14.f(), b410Var14.e(), (xvo) b410Var14.I.get(), (zr00) b410Var14.M.get());
                    case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                        Observable observableI = ghpVar.i();
                        b410 b410Var15 = ghpVar.a;
                        v7cVar = new v7c(observableI, new ifl1((dxz0) b410Var15.B.get(), (byte) 8), ghpVar.h(), b410Var15.a(), (xvo) b410Var15.I.get());
                        return v7cVar;
                    case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                        ats0Var = new k3v(ghpVar.a.b(), ghpVar.e(), ghpVar.l(), ghpVar.b(), ghpVar.k(), ghpVar.a.g());
                        return ats0Var;
                    case 20:
                        return new dhp(this);
                    case 21:
                        return new ehp(this, (byte) 0);
                    case 22:
                        b410 b410Var16 = ghpVar.a;
                        b410 b410Var17 = ghpVar.a;
                        return new yut0(b410Var16.b(), (sut0) b410Var17.d0.get(), (zr00) b410Var17.M.get(), ghpVar.h());
                    case 23:
                        jly0 jly0Var2 = ghpVar.d;
                        b410 b410Var18 = ghpVar.a;
                        v7cVar = new dp01((zuz) jly0Var2.get(), ghpVar.h(), b410Var18.f(), b410Var18.e(), (vxm1) ghpVar.x.get());
                        return v7cVar;
                    case 24:
                        mwm1 mwm1VarE = ghpVar.e();
                        b410 b410Var19 = ghpVar.a;
                        vxm1Var = new vxm1(mwm1VarE, ghpVar.l(), b410Var19.g(), b410Var19.f(), b410Var19.e(), new zxl1(ghpVar.k(), ghpVar.b(), (byte) 6), ghpVar.k(), b410Var19.b());
                        return vxm1Var;
                    case 25:
                        jly0 jly0Var3 = ghpVar.z;
                        b410 b410Var20 = ghpVar.a;
                        ats0Var = new tma1(new yt91((c510) jly0Var3.get(), new uma1(b410Var20.a(), (ajg) b410Var20.y0.get()), b410Var20.f(), (byte) 11), new uma1(b410Var20.a(), (ajg) b410Var20.y0.get()), new ypa((byte) 13, false), (v191) ghpVar.A.get(), new myy(b410Var20.d(), b410Var20.b(), b410Var20.c(), (wqg) b410Var20.v.get()));
                        return ats0Var;
                    case 26:
                        return (c510) ((RetrofitMaker) ghpVar.a.D.get()).createWebgateService(c510.class, "android-external-integration-loaders");
                    case 27:
                        return new v191(ghpVar.a.g());
                    case 28:
                        return new l9o0(ghpVar.a.b(), ghpVar.h(), ghpVar.g(), (jih1) ghpVar.a.l0.get());
                    case 29:
                        return new yut0(ghpVar.a.b(), ghpVar.e(), ghpVar.b());
                    case 30:
                        b410 b410Var21 = ghpVar.a;
                        b410 b410Var22 = ghpVar.a;
                        v7cVar = new l9o0(b410Var21.b(), new yt91((c510) ghpVar.z.get(), new uma1(b410Var22.a(), (ajg) b410Var22.y0.get()), b410Var22.f(), (byte) 11), new ypa((byte) 13, false), (v191) ghpVar.A.get(), new myy(b410Var22.d(), b410Var22.b(), b410Var22.c(), (wqg) b410Var22.v.get()));
                        return v7cVar;
                    case 31:
                        b410 b410Var23 = ghpVar.a;
                        b410 b410Var24 = ghpVar.a;
                        ats0Var = new dts0(b410Var23.b(), (zuz) ghpVar.d.get(), ghpVar.h(), (n3q0) b410Var24.X.get(), new ytp0(ghpVar.i(), new ifl1((dxz0) b410Var24.B.get(), (byte) 8), b410Var24.a(), (Scheduler) b410Var24.n.get(), (xvo) b410Var24.I.get(), (byte) 6), b410Var24.f(), b410Var24.e());
                        return ats0Var;
                    case 32:
                        return new wss0((dts0) ghpVar.F.get());
                    case 33:
                        return new vss0((dts0) ghpVar.F.get(), new ham(ghpVar.a.b(), (fkv) ghpVar.m.get(), (byte) 0));
                    case 34:
                        ghpVar.getClass();
                        return new z741(ghp.a(), new vnd1(ghp.f(), ghpVar.a.d(), b7), (sy2) ghpVar.I.get(), b4);
                    case 35:
                        RetrofitMaker retrofitMaker = (RetrofitMaker) ghpVar.a.D.get();
                        k370 k370Var = new k370();
                        k370Var.f((l370) null, "https://agnostic-api.spotify.dev/unauthenticated/");
                        return (sy2) retrofitMaker.createCustomHostService(sy2.class, k370Var.b());
                    case 36:
                        ghpVar.getClass();
                        return new z741(ghp.a(), new ffe1(ghp.f(), ghpVar.a.d(), (byte) 27), (sy2) ghpVar.I.get(), b5);
                    case 37:
                        return new ryq0(ghpVar.c(), (byte) 1);
                    case 38:
                        return new ryq0(ghpVar.c(), (byte) 2);
                    case 39:
                        return new d74(new dn3((Context) ghpVar.a.k.get(), false), ghpVar.a.f(), ghpVar.c(), (byte) 0);
                    case 40:
                        b410 b410Var25 = ghpVar.a;
                        b410 b410Var26 = ghpVar.a;
                        ats0Var = new f74(new dn3((Context) b410Var25.k.get(), false), b410Var26.b(), b410Var26.f(), ghpVar.c(), (xo60) ghpVar.P.get(), ghpVar.h(), (upp0) ghpVar.g.get());
                        return ats0Var;
                    case 41:
                        return new xo60(ghpVar.a.b(), xqu.a(ghpVar.O), (upp0) ghpVar.g.get());
                    case 42:
                        return (tut0) ghpVar.a.g0.get();
                    case 43:
                        return new d74(new dn3((Context) ghpVar.a.k.get(), false), ghpVar.a.f(), ghpVar.c(), (byte) 1);
                    case 44:
                        b410 b410Var27 = ghpVar.a;
                        b410 b410Var28 = ghpVar.a;
                        return new g74(new dn3((Context) b410Var27.k.get(), false), b410Var28.b(), b410Var28.f(), ghpVar.c());
                    case 45:
                        return new ryq0((Context) ghpVar.a.k.get(), (byte) 3);
                    case 46:
                        return new jrd(ghpVar.a.b(), ghpVar.c());
                    case 47:
                        return new un01((Flowable) ghpVar.a.F0.get(), (ybg) ghpVar.a.u.get());
                    case 48:
                        ats0Var = new tyq0(ghpVar.a.b(), ghpVar.c(), new zx4((luk) ghpVar.a.s0.get()), (lyq0) ghpVar.W.get(), (lyq0) ghpVar.X.get());
                        return ats0Var;
                    case 49:
                        return new lyq0();
                    case 50:
                        return new lyq0();
                    case 51:
                        return new nyq0(ghpVar.c(), (lyq0) ghpVar.X.get(), new zx4((luk) ghpVar.a.s0.get()));
                    case 52:
                        return new hyq0(ghpVar.c(), (lyq0) ghpVar.W.get());
                    case 53:
                        return new hyq0(ghpVar.c(), ghpVar.a.d());
                    case 54:
                        return new v1v0(ghpVar.c());
                    case 55:
                        return new ryq0(ghpVar.c(), (byte) 0);
                    case 56:
                        b410 b410Var29 = ghpVar.a;
                        b410 b410Var30 = ghpVar.a;
                        return new q610(new tf4(false, (luk) b410Var29.s0.get()), new k811(xqu.a(ghpVar.e0), b410Var30.a(), (Scheduler) b410Var30.n.get(), (byte) 28), (Scheduler) b410Var30.n.get());
                    case 57:
                        return new rdu(new File(ghpVar.a.b().getApplicationContext().getCacheDir(), "restricted-integrations"));
                    case 58:
                        return new oyr((i8h1) ghpVar.a.A0.get(), Collections.singletonMap(UbiSpecificationId.ANDROID_AUTO_CONTENT_LIST, new r64((v64) ghpVar.b.get())));
                    case 59:
                        return new nkv((qns0) ghpVar.a.i0.get());
                    case 60:
                        b410 b410Var31 = ghpVar.a;
                        b410 b410Var32 = ghpVar.a;
                        ats0Var = new g610((ccc0) b410Var31.w.get(), (g7h) b410Var32.y.get(), (op31) b410Var32.V.get(), (rpm1) b410Var32.x.get(), (r5s) b410Var32.e.get(), new jut((xrc0) b410Var32.g.get(), (me30) b410Var32.h.get(), (byte) 10), b410Var32.c(), ghpVar.e(), (xrm1) b410Var32.B0.get(), (q8n) b410Var32.o.get(), (oj3) b410Var32.f.get());
                        return ats0Var;
                    case 61:
                        g0l g0lVar = (g0l) ghpVar.a.z.get();
                        xqu.a(ghpVar.k0);
                        return new h610(g0lVar, (zor) ghpVar.a.A.get());
                    case 62:
                        return (ark1) ghpVar.a.q.get();
                    case 63:
                        return new s610((zeu0) ghpVar.a.k0.get());
                    case 64:
                        return new st00();
                    case 65:
                        b410 b410Var33 = ghpVar.a;
                        b410 b410Var34 = ghpVar.a;
                        oo70 oo70Var = (oo70) b410Var33.a.get();
                        Scheduler scheduler3 = (Scheduler) b410Var34.m.get();
                        Flowable flowable = (Flowable) b410Var34.E0.get();
                        ynb0 ynb0VarA5 = xqu.a(ghpVar.i0);
                        ynb0 ynb0VarA6 = xqu.a(ghpVar.l0);
                        ynb0 ynb0VarA7 = xqu.a(ghpVar.j0);
                        ynb0 ynb0VarA8 = xqu.a(ghpVar.v0);
                        ynb0 ynb0VarA9 = xqu.a(ghpVar.w0);
                        xqu.a(ghpVar.z0);
                        vxm1Var = new y610(oo70Var, scheduler3, flowable, ynb0VarA5, ynb0VarA6, ynb0VarA7, ynb0VarA8, ynb0VarA9, xqu.a(ghpVar.A0), xqu.a(ghpVar.m0), new t7y(b410Var34.a(), (h241) ghpVar.B0.get(), (byte) 16), (r410) ghpVar.C0.get(), new ks21((bqz) b410Var34.i.get(), (byte) 4), (q610) ghpVar.f0.get(), (Observable) b410Var34.G0.get(), ghpVar.i());
                        return vxm1Var;
                    case 66:
                        jly0 jly0Var4 = ghpVar.o0;
                        b410 b410Var35 = ghpVar.a;
                        cyp cypVar = (cyp) jly0Var4.get();
                        Flowable flowable2 = (Flowable) b410Var35.F0.get();
                        chp chpVar = ghpVar.p0;
                        yqg yqgVarA = b410Var35.a();
                        cyp cypVar2 = (cyp) ghpVar.o0.get();
                        Observable observableG = b410Var35.g();
                        dxz0 dxz0Var = (dxz0) b410Var35.B.get();
                        ov20 ov20Var = (ov20) b410Var35.E.get();
                        byp0 byp0Var = (byp0) b410Var35.h0.get();
                        t310 t310Var = new t310((cyp) ghpVar.o0.get(), b410Var35.c());
                        q410 q410VarD = ghpVar.d();
                        h410 h410Var = new h410((uu00) b410Var35.N.get(), b410Var35.f(), new a510((cyp) ghpVar.o0.get()), ghpVar.d());
                        z410 z410Var = new z410(cypVar2, observableG, dxz0Var, ov20Var, byp0Var, t310Var, q410VarD, h410Var, new t7y(xqu.a(ghpVar.t0), xqu.a(ghpVar.g), (byte) 13), xqu.a(ghpVar.u0), xqu.a(ghpVar.l), b410Var35.c());
                        q610 q610Var = (q610) ghpVar.f0.get();
                        cyp cypVar3 = (cyp) ghpVar.o0.get();
                        ats0Var = new g710(cypVar, flowable2, chpVar, yqgVarA, z410Var, q610Var, new mpm1(((ar51) b410Var35.J.get()).a(cypVar3.a())), (jgz0) b410Var35.o0.get(), xqu.a(ghpVar.l));
                        return ats0Var;
                    case 67:
                        return ((t8u0) ghpVar.a.j0.get()).a(new njv());
                    case 68:
                        return (pta1) ghpVar.a.m0.get();
                    case 69:
                        return new fgr();
                    case 70:
                        return ((zut0) ghpVar.a.e0.get()).a(new ojv((cyp) ghpVar.o0.get(), (byte) 0), new ojv((PlayOrigin) ghpVar.s0.get(), (byte) 1));
                    case 71:
                        lik1 lik1Var = (lik1) ghpVar.r0.get();
                        PlayOrigin.Builder builder = PlayOrigin.builder("external-integration-service");
                        a690 a690Var = b690.a;
                        return builder.referrerIdentifier("external-integration-service").viewUri(lik1Var.a).build();
                    case 72:
                        lik1 lik1Var2 = nik1.R2;
                        c8o.m(lik1Var2);
                        return lik1Var2;
                    case 73:
                        co91 co91Var = (co91) ghpVar.a.w0.get();
                        return co91Var.a.a(co91Var.b, co91Var.c);
                    case 74:
                        return new k710((Scheduler) ghpVar.a.m.get(), (s241) ghpVar.a.c.get());
                    case 75:
                        fhp fhpVar = (fhp) ghpVar.x0.get();
                        miq0 miq0Var = new miq0((n710) ghpVar.y0.get());
                        b410 b410Var36 = ghpVar.a;
                        return new qcl((dxz0) ((ghp) fhpVar.a.c).a.B.get(), miq0Var, new esp0(b410Var36.b(), (fwp0) b410Var36.b.get()));
                    case 76:
                        return new fhp(this);
                    case 77:
                        ats0Var = new n710((sy2) ghpVar.I.get(), ghpVar.i(), new hyy0(ghpVar.a.a()), ghp.a(), (nkv) ghpVar.h0.get());
                        return ats0Var;
                    case 78:
                        return new j710((cyp) ghpVar.o0.get());
                    case 79:
                        return new h241();
                    case 80:
                        return new r410(ghpVar.a.f(), (n3q0) ghpVar.a.W.get());
                    case 81:
                        b410 b410Var37 = ghpVar.a;
                        b410 b410Var38 = ghpVar.a;
                        return new k961((Context) b410Var37.k.get(), (NotificationManager) b410Var38.s.get(), (wd30) b410Var38.a0.get(), new ow3((y2g0) b410Var38.t0.get(), (l961) b410Var38.S.get(), b3));
                    default:
                        jah.e(b2);
                        return null;
                }
            case 2:
                return d();
            case 3:
                return e();
            case 4:
                return f();
            case 5:
                return g();
            case 6:
                return h();
            case 7:
                return i();
            case 8:
                return j();
            case 9:
                return k();
            case 10:
                return l();
            case 11:
                return m();
            case 12:
                return n();
            case 13:
                return o();
            case 14:
                return p();
            case 15:
                return q();
            case 16:
                return r();
            case 17:
                return s();
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return t();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return u();
            case 20:
                return v();
            case 21:
                return w();
            case 22:
                return x();
            case 23:
                return y();
            case 24:
                return z();
            case 25:
                return A();
            case 26:
                return B();
            case 27:
                return C();
            case 28:
                return D();
            default:
                vkp vkpVar = (vkp) obj;
                ye90 ye90Var = vkpVar.b;
                ukp ukpVar = vkpVar.a;
                if (b2 == 0) {
                    return (t2a0) vkpVar.e.get();
                }
                if (b2 == 1) {
                    i4a0 i4a0Var = (i4a0) ukpVar.U.get();
                    c8o.l(i4a0Var);
                    return i4a0Var;
                }
                if (b2 != 2) {
                    jah.e(b2);
                    return null;
                }
                qd9 qd9Var = (qd9) vkpVar.c.a.get();
                gq90 gq90Var = (gq90) ukpVar.v.get();
                c8o.l(gq90Var);
                hq90 hq90Var = (hq90) ukpVar.w.get();
                c8o.l(hq90Var);
                zwz0 zwz0Var = (zwz0) ((dj5) ye90Var.b).l.get();
                b0a0 b0a0VarD = ukpVar.d();
                c8o.l(b0a0VarD);
                return new y2a0(qd9Var, gq90Var, hq90Var, zwz0Var, b0a0VarD, (q8n) ((dj5) ye90Var.b).d.get());
        }
    }
}
