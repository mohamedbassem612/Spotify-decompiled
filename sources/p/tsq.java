package p;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.processors.PublishProcessor;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.ReplaySubject;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tsq implements jly0 {
    public final /* synthetic */ byte a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tsq(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        kp5 kp5Var = (kp5) this.c;
        zuf1 zuf1Var = (zuf1) kp5Var.a;
        byte b = this.b;
        if (b == 0) {
            return pzm.h((mos) zuf1Var.b.get());
        }
        if (b == 1) {
            return new etq(this);
        }
        if (b != 2) {
            if (b == 3) {
                return new xuf1(xqu.a((tsq) kp5Var.g), (avf1) kp5Var.b);
            }
            if (b == 4) {
                return u1n0.z((q7r0) kp5Var.c);
            }
            jah.e(b);
            return null;
        }
        los losVar = (los) ((jly0) kp5Var.d).get();
        lzn0 lzn0Var = (lzn0) zuf1Var.a.get();
        c8o.l(lzn0Var);
        q8n q8nVar = (q8n) zuf1Var.h.get();
        c8o.l(q8nVar);
        return new wuf1(q8nVar, losVar, lzn0Var);
    }

    private final Object b() {
        byte b = this.b;
        switch (b) {
            case 0:
                return new gtq(this);
            case 1:
                return new dpq(this, (byte) 1);
            case 2:
                j7h1 j7h1Var = new j7h1();
                j7h1Var.a = otl0.d;
                return j7h1Var;
            case 3:
                return new epq(this, (byte) 1);
            case 4:
                return new wx70();
            case 5:
                return new zde1();
            case 6:
                return new fpq((byte) 1);
            case 7:
                return new wce1();
            case 8:
                return new ede1();
            case 9:
                return new fcd1();
            case 10:
                return new gpq(this, (byte) 1);
            case 11:
                return new htq(this);
            case 12:
                return new itq(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object c() {
        byp bypVar = (byp) this.c;
        fwg1 fwg1Var = (fwg1) bypVar.c;
        byte b = this.b;
        if (b == 0) {
            hwg1 hwg1Var = (hwg1) bypVar.b;
            p5p p5pVar = (p5p) ((jly0) bypVar.e).get();
            c9n c9nVar = (c9n) ((jly0) bypVar.f).get();
            Parcelable.Creator creator = lik1.CREATOR;
            return p5pVar.a(c9nVar, "chat/trusted-circle", hwg1Var.a);
        }
        if (b == 1) {
            return new p5p(this, (byte) 1);
        }
        if (b == 2) {
            jd71 jd71Var = (jd71) fwg1Var.d.get();
            c8o.l(jd71Var);
            return new pd71(jd71Var.a, jd71Var.b);
        }
        if (b == 3) {
            return cto1.q(((q7r0) bypVar.d).d.c);
        }
        if (b == 4) {
            y6q y6qVar = (y6q) fwg1Var.f.get();
            c8o.l(y6qVar);
            return y6qVar.a((pd71) ((jly0) bypVar.a).get());
        }
        if (b == 5) {
            return pzm.h((mos) fwg1Var.g.get());
        }
        jah.e(b);
        return null;
    }

    private final Object d() {
        qtq qtqVar = (qtq) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new cn5(qtqVar.a.a(), qtqVar.a.c(), (t7h1) qtqVar.c.get());
            case 1:
                t7h1 t7h1Var = new t7h1();
                gio1.b(new r7h1(0, 0, 0, 0));
                return t7h1Var;
            case 2:
                return new vo5();
            case 3:
                Object objA = ((b6h1) qtqVar.t.get()).a(rj41.b);
                dm5.s(objA, "use Optional.orNull() instead of Optional.or(null)");
                return (mwn0) objA;
            case 4:
                b6h1 b6h1Var = (b6h1) qtqVar.f41p.get();
                b6h1 b6h1Var2 = (b6h1) qtqVar.q.get();
                nwn0 nwn0Var = (nwn0) qtqVar.r.get();
                tsq tsqVar = qtqVar.s;
                b6h1 b6h1Var3 = (b6h1) qtqVar.g.get();
                qtqVar.a.a();
                return new b6h1(new j96(b6h1Var, b6h1Var2, nwn0Var, tsqVar, b6h1Var3, Optional.of(xqu.a(qtqVar.v)), (byte) 15));
            case 5:
                return new b6h1(new ft30(1, (ltq) qtqVar.o.get(), ltq.class, "create", "create(Lcom/spotify/ubi/model/Scene;)Lcom/spotify/ubi/navigationloggerimpl/NavigationEffectsHandler;", 0, (byte) 18));
            case 6:
                return new ltq(this);
            case 7:
                qtqVar.getClass();
                r380 r380VarL = t380.l(3);
                qtq qtqVar2 = qtqVar.b;
                r380VarL.g((pgz) qtqVar2.j.get());
                r380VarL.h((Set) qtqVar2.a.i.get());
                r380VarL.g(new pir0((x8h1) qtqVar2.m.get(), (s8h1) qtqVar2.i.get(), (vo5) qtqVar2.e.get()));
                return r380VarL.i();
            case 8:
                jly0 jly0Var = qtqVar.g;
                w88 w88Var = qtqVar.a;
                return new pgz((b6h1) jly0Var.get(), w88Var.c(), w88Var.a(), (s8h1) qtqVar.i.get(), new dl3(xqu.a(qtqVar.f), (byte) 3));
            case 9:
                return new b6h1(new wrs(qtqVar.a.a(), xqu.a(qtqVar.f), (byte) 13));
            case 10:
                return new gu4(0, qtqVar.a.b(), false);
            case 11:
                w88 w88Var2 = qtqVar.a;
                return new s8h1(w88Var2.c(), (Scheduler) w88Var2.c.get(), w88Var2.a(), qtqVar.h);
            case 12:
                p55 p55Var = new p55(7200, qtqVar.a.b(), false);
                return new r8h1(p55Var.a(), p55Var.b());
            case 13:
                w88 w88Var3 = qtqVar.a;
                return new x8h1(new qb00(w88Var3.a(), w88Var3.c(), (t7h1) qtqVar.c.get()), (Flowable) qtqVar.k.get(), (b6h1) qtqVar.g.get(), (y8h1) qtqVar.l.get());
            case 14:
                return ((Flowable) qtqVar.a.g.get()).J(new uic(new rtw0((byte) 16), (byte) 16)).x(fkj0.a1).J(ok10.O0).t(Functions.a);
            case 15:
                return new y8h1();
            case 16:
                return new b6h1(k8b0.d1);
            case 17:
                return new nwn0();
            case 18:
                return WorkRunners.a();
            case 19:
                return new g7h1(xqu.a(qtqVar.u));
            case 20:
                Object objA2 = ((b6h1) qtqVar.t.get()).a(rj41.b);
                dm5.s(objA2, "use Optional.orNull() instead of Optional.or(null)");
                return (mwn0) objA2;
            case 21:
                return new p7h1();
            case 22:
                return new lfb0();
            case 23:
                return (qfb0) spq0.d((qfb0) qtqVar.r.get()).e(new pfb0(k8b0.c));
            case 24:
                return new rfb0();
            case 25:
                return new sfb0();
            case 26:
                return new kwn0(qtqVar.u, qtqVar.D);
            case 27:
                return t380.t((zxn0) qtqVar.C.get(), (zxn0) qtqVar.l.get());
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                Object objA3 = ((b6h1) qtqVar.q.get()).a(rj41.b);
                dm5.s(objA3, "use Optional.orNull() instead of Optional.or(null)");
                return (z6r0) objA3;
            case 29:
                return ((mtq) qtqVar.T.get()).a((k8h1) qtqVar.V.get());
            case 30:
                return new mtq(this);
            case 31:
                Object objA4 = ((b6h1) qtqVar.N.get()).a(rj41.b);
                dm5.s(objA4, "use Optional.orNull() instead of Optional.or(null)");
                return (n6h1) objA4;
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                tsq tsqVar2 = qtqVar.F;
                w88 w88Var4 = qtqVar.a;
                return new b6h1(new l690((b6h1) qtqVar.Y.get(), w88Var4.a(), (p6h1) qtqVar.G.get(), (b6h1) qtqVar.I.get(), (s7h1) qtqVar.J.get(), (m8h1) qtqVar.L.get(), (Scheduler) w88Var4.c.get(), (Scheduler) w88Var4.d.get(), (CompositeDisposable) qtqVar.M.get(), spq0.d(tsqVar2)));
            case 33:
                return Boolean.valueOf(new m55(false, qtqVar.a.b()).a());
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                return new p6h1((vfs0) qtqVar.a.e.get());
            case 35:
                return new b6h1(new ft30(1, (ntq) qtqVar.H.get(), ntq.class, "create", "create(Lcom/spotify/ubi/model/Scene;)Lcom/spotify/ubi/eventcontext/UbiEventContextProviderImpl;", 0, (byte) 20));
            case 36:
                return new ntq(this);
            case 37:
                qtqVar.a.a();
                return new s7h1();
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                return new m8h1(new k690(spq0.d(qtqVar.K), (byte) 1));
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                return Boolean.valueOf(new n55(false, qtqVar.a.b()).a());
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                return new CompositeDisposable();
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                Object objA5 = ((b6h1) qtqVar.P.get()).a(rj41.b);
                dm5.s(objA5, "use Optional.orNull() instead of Optional.or(null)");
                return (q7h1) objA5;
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                return new b6h1(new rsc1(qtqVar.a.c(), (b6h1) qtqVar.I.get(), (s7h1) qtqVar.J.get(), (byte) 22));
            case 43:
                return new otq(this);
            case 44:
                return new ptq(this);
            case 45:
                Object objA6 = ((b6h1) qtqVar.U.get()).a(rj41.b);
                dm5.s(objA6, "use Optional.orNull() instead of Optional.or(null)");
                return (k8h1) objA6;
            case 46:
                return new b6h1(new m690(qtqVar.a.c(), (b6h1) qtqVar.I.get(), qtqVar.a(), (s7h1) qtqVar.J.get(), (m8h1) qtqVar.L.get(), qtqVar.a.a(), (byte) 0));
            case 47:
                Object objA7 = ((b6h1) qtqVar.U.get()).a(rj41.b);
                dm5.s(objA7, "use Optional.orNull() instead of Optional.or(null)");
                return (i8h1) objA7;
            case 48:
                return ((mtq) qtqVar.T.get()).a((k8h1) qtqVar.Z.get());
            case 49:
                Object objA8 = ((b6h1) qtqVar.Y.get()).a(rj41.b);
                dm5.s(objA8, "use Optional.orNull() instead of Optional.or(null)");
                return (k8h1) objA8;
            case 50:
                return new b6h1(new m690(qtqVar.a.c(), (b6h1) qtqVar.I.get(), qtqVar.a(), (s7h1) qtqVar.J.get(), (m8h1) qtqVar.L.get(), qtqVar.a.a(), (byte) 1));
            case 51:
                Object objA9 = ((b6h1) qtqVar.b0.get()).a(rj41.b);
                dm5.s(objA9, "use Optional.orNull() instead of Optional.or(null)");
                return (b7r0) objA9;
            case 52:
                return new b6h1(new wvq0((b6h1) qtqVar.q.get(), (byte) 7));
            case 53:
                Object objA10 = ((b6h1) qtqVar.N.get()).a(rj41.b);
                dm5.s(objA10, "use Optional.orNull() instead of Optional.or(null)");
                return (l6h1) objA10;
            case 54:
                return new g8h1((z6r0) qtqVar.C.get(), (mwn0) qtqVar.u.get(), qtqVar.a.a());
            case 55:
                Object objA11 = ((b6h1) qtqVar.Y.get()).a(rj41.b);
                dm5.s(objA11, "use Optional.orNull() instead of Optional.or(null)");
                return (i8h1) objA11;
            case 56:
                Object objA12 = ((b6h1) qtqVar.N.get()).a(rj41.b);
                dm5.s(objA12, "use Optional.orNull() instead of Optional.or(null)");
                return (n6h1) objA12;
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object e() {
        uw0 uw0Var = (uw0) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                int i = ((bii1) uw0Var.e).a;
                g6m0 g6m0Var = g6m0.b;
                if (i == 1) {
                    return g6m0Var;
                }
                if (i != 2) {
                    if (i == 3) {
                        return g6m0.f;
                    }
                    if (i == 5) {
                        return g6m0.c;
                    }
                    if (i == 6) {
                        return g6m0.d;
                    }
                    if (i == 7) {
                        return g6m0.e;
                    }
                    if (i != 10) {
                        n57.s("Unknown details type, defaulting to time listened. DetailsType: " + i);
                        return g6m0Var;
                    }
                }
                return g6m0.g;
            case 1:
                t8u0 t8u0Var = (t8u0) ((xgi1) uw0Var.d).h.get();
                c8o.l(t8u0Var);
                return kmq0.x((q7r0) uw0Var.g, t8u0Var);
            case 2:
                l8s l8sVar = (l8s) ((xgi1) uw0Var.d).q.get();
                c8o.l(l8sVar);
                return new fii1(l8sVar);
            case 3:
                kt91 kt91Var = (kt91) ((xgi1) uw0Var.d).p.get();
                c8o.l(kt91Var);
                return new xwm1(kt91Var);
            case 4:
                return ReplaySubject.f();
            case 5:
                xrc0 xrc0Var = (xrc0) ((xgi1) uw0Var.d).n.get();
                c8o.l(xrc0Var);
                return new ysu0(xrc0Var, (ReplaySubject) ((jly0) uw0Var.c).get());
            case 6:
                return new pdu0(uw0Var.D(), (ReplaySubject) ((jly0) uw0Var.c).get());
            case 7:
                return new utq(this);
            case 8:
                return new vtq(this);
            case 9:
                return new wtq(this);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object f() {
        f0a f0aVar = (f0a) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                Scheduler scheduler = (Scheduler) ((lii1) f0aVar.b).l.get();
                c8o.l(scheduler);
                lii1 lii1Var = (lii1) f0aVar.b;
                kly0 kly0Var = lii1Var.m;
                pf60 pf60Var = (pf60) lii1Var.c.get();
                c8o.l(pf60Var);
                zwz0 zwz0Var = (zwz0) lii1Var.q.get();
                c8o.l(zwz0Var);
                of60 of60Var = (of60) kly0Var.get();
                c8o.l(of60Var);
                lc20 lc20Var = new lc20(pf60Var, zwz0Var, of60Var, (byte) 22);
                of60 of60Var2 = (of60) kly0Var.get();
                c8o.l(of60Var2);
                return new jse1(scheduler, new ore1(lc20Var, new laz(of60Var2, (byte) 15)), new ewn0(f0aVar.y(), (byte) 23));
            case 1:
                t8u0 t8u0Var = (t8u0) ((lii1) f0aVar.b).n.get();
                c8o.l(t8u0Var);
                return t8u0Var.a(((zf30) ((kii1) f0aVar.c)).s1);
            case 2:
                i8h1 i8h1Var = (i8h1) ((lii1) f0aVar.b).i.get();
                c8o.l(i8h1Var);
                return new iii1(i8h1Var);
            case 3:
                return new fhi1();
            case 4:
                return new ytq(this, (byte) 0);
            case 5:
                return new ztq(this, (byte) 0);
            case 6:
                return new lsq(this, (byte) 1);
            case 7:
                return new msq(this, (byte) 1);
            case 8:
                return new nsq(this, (byte) 1);
            case 9:
                return new auq((byte) 0);
            case 10:
                return new buq(this, (byte) 0);
            case 11:
                return new cuq((byte) 0);
            case 12:
                return new duq((byte) 0);
            case 13:
                return new xtq((byte) 0);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object g() {
        wj3 wj3Var = (wj3) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                Scheduler scheduler = (Scheduler) ((pii1) wj3Var.b).k.get();
                c8o.l(scheduler);
                pii1 pii1Var = (pii1) wj3Var.b;
                kly0 kly0Var = pii1Var.l;
                pf60 pf60Var = (pf60) pii1Var.d.get();
                c8o.l(pf60Var);
                zwz0 zwz0Var = (zwz0) pii1Var.p.get();
                c8o.l(zwz0Var);
                of60 of60Var = (of60) kly0Var.get();
                c8o.l(of60Var);
                lc20 lc20Var = new lc20(pf60Var, zwz0Var, of60Var, (byte) 22);
                of60 of60Var2 = (of60) kly0Var.get();
                c8o.l(of60Var2);
                return new jse1(scheduler, new ore1(lc20Var, new laz(of60Var2, (byte) 15)), new ewn0(wj3Var.m(), (byte) 23));
            case 1:
                t8u0 t8u0Var = (t8u0) ((pii1) wj3Var.b).m.get();
                c8o.l(t8u0Var);
                gj5 gj5Var = (gj5) ((pii1) wj3Var.b).b.get();
                c8o.l(gj5Var);
                return t8u0Var.a(((f0i) gj5Var).a);
            case 2:
                i8h1 i8h1Var = (i8h1) ((pii1) wj3Var.b).i.get();
                c8o.l(i8h1Var);
                return new iii1(i8h1Var);
            case 3:
                return new fhi1();
            case 4:
                return new ytq(this, (byte) 1);
            case 5:
                return new ztq(this, (byte) 1);
            case 6:
                return new lsq(this, (byte) 2);
            case 7:
                return new msq(this, (byte) 2);
            case 8:
                return new nsq(this, (byte) 2);
            case 9:
                return new auq((byte) 1);
            case 10:
                return new buq(this, (byte) 1);
            case 11:
                return new cuq((byte) 1);
            case 12:
                return new duq((byte) 1);
            case 13:
                return new xtq((byte) 1);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object h() {
        byp bypVar = (byp) this.c;
        q7r0 q7r0Var = (q7r0) bypVar.d;
        hni1 hni1Var = (hni1) bypVar.c;
        gni1 gni1Var = (gni1) bypVar.b;
        byte b = this.b;
        if (b == 0) {
            xq81 xq81VarF = bypVar.F();
            t2j0 t2j0Var = (t2j0) gni1Var.r.get();
            c8o.l(t2j0Var);
            v1k v1kVar = new v1k(xq81VarF, hni1Var, new cof0(t2j0Var), (byte) 29);
            oj80 oj80Var = new oj80(bypVar.F(), hni1Var, (byte) 16);
            kt91 kt91Var = (kt91) gni1Var.o.get();
            c8o.l(kt91Var);
            q8n q8nVar = (q8n) gni1Var.t.get();
            c8o.l(q8nVar);
            nn61 nn61Var = new nn61(kt91Var, q8nVar, false, (byte) 12);
            uqv0 uqv0Var = new uqv0(cwl1.C(q7r0Var), (byte) 25);
            v4o0 v4o0Var = (v4o0) gni1Var.m.get();
            c8o.l(v4o0Var);
            uqv0 uqv0Var2 = new uqv0(v4o0Var, (byte) 24);
            f1n0 f1n0Var = (f1n0) gni1Var.j.get();
            c8o.l(f1n0Var);
            fna fnaVar = new fna(f1n0Var, (byte) 15);
            h9n h9nVar = new h9n(bypVar.F(), (byte) 24);
            bo71 bo71Var = (bo71) gni1Var.p.get();
            c8o.l(bo71Var);
            dh30 dh30Var = new dh30(bo71Var, hni1Var, (byte) 4);
            nni1 nni1Var = (nni1) ((jly0) bypVar.e).get();
            ocu ocuVar = (ocu) ((jly0) bypVar.g).get();
            q8n q8nVar2 = (q8n) gni1Var.s.get();
            c8o.l(q8nVar2);
            return new cmi1(v1kVar, oj80Var, nn61Var, uqv0Var, uqv0Var2, fnaVar, h9nVar, dh30Var, nni1Var, ocuVar, q8nVar2);
        }
        if (b == 1) {
            l8s l8sVar = (l8s) gni1Var.q.get();
            c8o.l(l8sVar);
            q8n q8nVar3 = (q8n) gni1Var.t.get();
            c8o.l(q8nVar3);
            return new nni1(l8sVar, q8nVar3, (jly0) bypVar.a);
        }
        if (b == 2) {
            return new ymi1(u1n0.z(q7r0Var), hni1Var);
        }
        if (b != 3) {
            if (b == 4) {
                luk lukVar = (luk) gni1Var.c.get();
                c8o.l(lukVar);
                return new r65(q65.FAR, 3000, lukVar);
            }
            if (b == 5) {
                return pzm.h((mos) gni1Var.k.get());
            }
            jah.e(b);
            return null;
        }
        ak9 ak9Var = (ak9) gni1Var.g.get();
        c8o.l(ak9Var);
        tz01 tz01Var = new tz01(ak9Var, (byte) 15);
        yqg yqgVar = (yqg) gni1Var.l.get();
        c8o.l(yqgVar);
        uj60 uj60Var = new uj60(yqgVar);
        q8n q8nVar4 = (q8n) gni1Var.s.get();
        c8o.l(q8nVar4);
        cdu cduVar = new cdu(tz01Var, uj60Var, q8nVar4);
        xir xirVar = (xir) gni1Var.h.get();
        c8o.l(xirVar);
        yqg yqgVar2 = (yqg) gni1Var.l.get();
        c8o.l(yqgVar2);
        q8n q8nVarA = gni1Var.a();
        c8o.l(q8nVarA);
        xj9 xj9Var = new xj9(xirVar, yqgVar2, q8nVarA, (r65) ((tsq) bypVar.f).get());
        dc31 dc31Var = new dc31((byte) 20);
        tsq tsqVar = (tsq) bypVar.f;
        q8n q8nVarA2 = gni1Var.a();
        c8o.l(q8nVarA2);
        return new jdu(cduVar, xj9Var, dc31Var, tsqVar, q8nVarA2);
    }

    private final Object i() {
        byte b = this.b;
        if (b == 0) {
            return new euq(this);
        }
        if (b == 1) {
            return new fuq(this);
        }
        if (b == 2) {
            return new guq(this);
        }
        if (b == 3) {
            return new huq(this);
        }
        if (b == 4) {
            return u1n0.z((q7r0) ((goq) this.c).f);
        }
        jah.e(b);
        return null;
    }

    private final Object j() {
        goq goqVar = (goq) this.c;
        b0j1 b0j1Var = (b0j1) goqVar.g;
        byte b = this.b;
        if (b == 0) {
            lzn0 lzn0Var = (lzn0) b0j1Var.e.get();
            c8o.l(lzn0Var);
            lre0 lre0Var = (lre0) b0j1Var.i.get();
            c8o.l(lre0Var);
            i6a1 i6a1Var = (i6a1) b0j1Var.j.get();
            c8o.l(i6a1Var);
            q8n q8nVar = (q8n) b0j1Var.c.get();
            c8o.l(q8nVar);
            q8n q8nVar2 = (q8n) b0j1Var.d.get();
            c8o.l(q8nVar2);
            return new kpe0(lzn0Var, lre0Var, i6a1Var, q8nVar, q8nVar2);
        }
        if (b == 1) {
            r6h1 r6h1Var = r6h1.c;
            return new xfl0();
        }
        if (b == 2) {
            return new iuq(this);
        }
        if (b == 3) {
            return new juq(this);
        }
        if (b == 4) {
            return new kuq(this, (byte) 0);
        }
        if (b == 5) {
            return new ipe0((kpe0) ((jly0) goqVar.b).get());
        }
        jah.e(b);
        return null;
    }

    private final Object k() {
        yjq yjqVar = (yjq) this.c;
        a2j1 a2j1Var = (a2j1) yjqVar.c;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return new kuq(this, (byte) 1);
            }
            if (b == 2) {
                r6h1 r6h1Var = r6h1.c;
                return new fgl0();
            }
            if (b == 3) {
                return new ipe0((kpe0) ((jly0) yjqVar.b).get());
            }
            jah.e(b);
            return null;
        }
        lzn0 lzn0Var = (lzn0) a2j1Var.e.get();
        c8o.l(lzn0Var);
        lre0 lre0Var = (lre0) a2j1Var.h.get();
        c8o.l(lre0Var);
        i6a1 i6a1Var = (i6a1) a2j1Var.i.get();
        c8o.l(i6a1Var);
        q8n q8nVar = (q8n) a2j1Var.d.get();
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) a2j1Var.c.get();
        c8o.l(q8nVar2);
        return new kpe0(lzn0Var, lre0Var, i6a1Var, q8nVar, q8nVar2);
    }

    private final Object l() {
        cyo cyoVar = (cyo) this.c;
        yqq0 yqq0Var = yqq0.c;
        i691 i691Var = i691.a;
        byte b = this.b;
        switch (b) {
            case 0:
                tsq tsqVar = (tsq) cyoVar.i0;
                fmj1 fmj1Var = (fmj1) cyoVar.G;
                tsq tsqVar2 = (tsq) cyoVar.q0;
                pqq0 pqq0Var = (pqq0) cyoVar.w.get();
                dg30 dg30VarZ = fmj1Var.Z();
                c8o.l(dg30VarZ);
                dg30 dg30VarZ2 = fmj1Var.Z();
                c8o.l(dg30VarZ2);
                return new hmj1(tsqVar, tsqVar2, pqq0Var, dg30VarZ, dg30VarZ2.isInMultiWindowMode());
            case 1:
                fmj1 fmj1Var2 = (fmj1) cyoVar.G;
                fmj1 fmj1Var3 = (fmj1) cyoVar.G;
                xfx xfxVarA0 = fmj1Var2.a0();
                c8o.l(xfxVarA0);
                cce cceVarG = cyoVar.g();
                sp00 sp00VarK = cyoVar.k();
                v1k v1kVarH = cyoVar.h();
                Flowable flowable = (Flowable) cyoVar.h.get();
                ugm ugmVar = (ugm) cyoVar.o.get();
                Scheduler schedulerO = fmj1Var3.o();
                c8o.l(schedulerO);
                v1k v1kVar = new v1k(flowable, ugmVar, schedulerO, (byte) 16);
                gg11 gg11VarN = fmj1Var3.N();
                q2p0 q2p0Var = cyoVar.b;
                luk lukVarW = fmj1Var3.w();
                c8o.l(lukVarW);
                k2p0 k2p0Var = new k2p0(gg11VarN, q2p0Var, new dn4(lukVarW));
                e68 e68VarF = cyoVar.f();
                FlowableMap flowableMapM = cyoVar.m();
                duy duyVarJ = cyoVar.j();
                vsy vsyVarI = cyoVar.i();
                ynb0 ynb0VarA = xqu.a((tsq) cyoVar.K);
                ynb0 ynb0VarA2 = xqu.a((tsq) cyoVar.L);
                luk lukVarW2 = fmj1Var3.w();
                c8o.l(lukVarW2);
                dn4 dn4Var = new dn4(lukVarW2);
                u27 u27VarE = cyoVar.e();
                mdn mdnVar = new mdn(cyoVar.x(), (byte) 0);
                dpf1 dpf1VarC = cyoVar.C();
                dfm dfmVarU = cyoVar.u();
                aor aorVarE = fmj1Var3.E();
                c8o.l(aorVarE);
                wr30 wr30VarR = cyoVar.r();
                ynb0 ynb0VarA3 = xqu.a((tsq) cyoVar.N);
                ynb0 ynb0VarA4 = xqu.a((tsq) cyoVar.O);
                p2p0 p2p0Var = (p2p0) cyoVar.c.get();
                Scheduler schedulerO2 = fmj1Var3.o();
                c8o.l(schedulerO2);
                sqq0 sqq0Var = new sqq0(p2p0Var, schedulerO2);
                rzo0 rzo0VarT = cyoVar.t();
                ynb0 ynb0VarA5 = xqu.a((tsq) cyoVar.Q);
                fbm fbmVarL = fmj1Var3.L();
                c8o.l(fbmVarL);
                i8h1 i8h1Var = (i8h1) ((tsq) cyoVar.J).get();
                s4p0 s4p0VarR = fmj1Var3.R();
                c8o.l(s4p0VarR);
                l6h1 l6h1VarE = s4p0VarR.e();
                c8o.m(l6h1VarE);
                s4p0 s4p0VarR2 = fmj1Var3.R();
                c8o.l(s4p0VarR2);
                n7h1 n7h1VarF = s4p0VarR2.f();
                c8o.m(n7h1VarF);
                dxy dxyVarW = cyoVar.w();
                ynb0 ynb0VarA6 = xqu.a((tsq) cyoVar.R);
                ynb0 ynb0VarA7 = xqu.a((tsq) cyoVar.S);
                ynb0 ynb0VarA8 = xqu.a((tsq) cyoVar.U);
                ynb0 ynb0VarA9 = xqu.a((tsq) cyoVar.W);
                ynb0 ynb0VarA10 = xqu.a((tsq) cyoVar.X);
                ynb0 ynb0VarA11 = xqu.a((tsq) cyoVar.Y);
                ynb0 ynb0VarA12 = xqu.a((tsq) cyoVar.b0);
                ynb0 ynb0VarA13 = xqu.a((tsq) cyoVar.c0);
                ynb0 ynb0VarA14 = xqu.a((tsq) cyoVar.d0);
                ynb0 ynb0VarA15 = xqu.a((tsq) cyoVar.e0);
                a4f0 a4f0Var = new a4f0((Flowable) cyoVar.h.get(), (Flowable) cyoVar.t.get(), (w9u0) cyoVar.q.get());
                yl1 yl1VarA = cyoVar.a();
                o671 o671VarA = cyoVar.A();
                v6z0 v6z0VarY = cyoVar.y();
                v3i0 v3i0VarS = cyoVar.s();
                uk51 uk51Var = new uk51((a1r0) ((tsq) cyoVar.I).get(), (byte) 1);
                FlowableObserveOn flowableObserveOnL = cyoVar.l();
                FlowableJust flowableJustI = Flowable.I(yqq0Var);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedO = cyoVar.o();
                msm0 msm0VarV = fmj1Var3.v();
                c8o.l(msm0VarV);
                x4p0 x4p0Var = new x4p0(msm0VarV, (n6r0) cyoVar.h0.get());
                luk lukVarW3 = fmj1Var3.w();
                c8o.l(lukVarW3);
                iv4 iv4Var = new iv4(lukVarW3);
                un4 un4VarC = cyoVar.c();
                q8n q8nVarG = fmj1Var3.g();
                c8o.l(q8nVarG);
                hs71 hs71VarX = fmj1Var3.X();
                c8o.l(hs71VarX);
                return new zkd1(xfxVarA0, cceVarG, sp00VarK, v1kVarH, v1kVar, k2p0Var, e68VarF, flowableMapM, duyVarJ, vsyVarI, ynb0VarA, ynb0VarA2, dn4Var, u27VarE, mdnVar, dpf1VarC, dfmVarU, aorVarE, wr30VarR, ynb0VarA3, ynb0VarA4, sqq0Var, rzo0VarT, ynb0VarA5, fbmVarL, i8h1Var, l6h1VarE, n7h1VarF, dxyVarW, ynb0VarA6, ynb0VarA7, ynb0VarA8, ynb0VarA9, ynb0VarA10, ynb0VarA11, ynb0VarA12, ynb0VarA13, ynb0VarA14, ynb0VarA15, a4f0Var, yl1VarA, o671VarA, v6z0VarY, v3i0VarS, uk51Var, flowableObserveOnL, flowableJustI, flowableDistinctUntilChangedO, x4p0Var, iv4Var, un4VarC, q8nVarG, w3p0.D(hs71VarX, (Flowable) cyoVar.h.get()));
            case 2:
                return new a62((p2p0) cyoVar.c.get(), (byte) 4);
            case 3:
                return cyoVar.b.j();
            case 4:
                return k9o0.r(cyoVar.b);
            case 5:
                return new l0y((p2p0) cyoVar.c.get(), (byte) 3);
            case 6:
                return new k0y((p2p0) cyoVar.c.get(), (byte) 3);
            case 7:
                return k9o0.B(cyoVar.b);
            case 8:
                return cyoVar.b.g();
            case 9:
                return k9o0.t(cyoVar.b);
            case 10:
                return aan0.p((lzn0) ((tsq) cyoVar.H).get());
            case 11:
                lzn0 lzn0VarC = ((fmj1) cyoVar.G).c();
                c8o.l(lzn0VarC);
                return lzn0VarC;
            case 12:
                return new i5v0((z2z) cyoVar.m.get(), (cmf1) cyoVar.n.get(), (byte) 1);
            case 13:
                jly0 jly0Var = cyoVar.l;
                fmj1 fmj1Var4 = (fmj1) cyoVar.G;
                lik1 lik1Var = (lik1) jly0Var.get();
                s6z s6zVarY0 = fmj1Var4.y0();
                c8o.l(s6zVarY0);
                uny unyVarF0 = fmj1Var4.f0();
                c3s c3sVarB = fmj1Var4.B();
                c8o.l(c3sVarB);
                luk lukVarW4 = fmj1Var4.w();
                c8o.l(lukVarW4);
                an4 an4Var = new an4(false, lukVarW4);
                luk lukVarW5 = fmj1Var4.w();
                c8o.l(lukVarW5);
                return new z2z(lik1Var, s6zVarY0, unyVarF0, c3sVarB, an4Var, new uu4(false, lukVarW5));
            case 14:
                return cyoVar.b.e();
            case 15:
                jly0 jly0Var2 = cyoVar.l;
                fmj1 fmj1Var5 = (fmj1) cyoVar.G;
                lik1 lik1Var2 = (lik1) jly0Var2.get();
                ssf1 ssf1VarP = fmj1Var5.p();
                c8o.l(ssf1VarP);
                c3s c3sVarB2 = fmj1Var5.B();
                c8o.l(c3sVarB2);
                luk lukVarW6 = fmj1Var5.w();
                c8o.l(lukVarW6);
                an4 an4Var2 = new an4(false, lukVarW6);
                luk lukVarW7 = fmj1Var5.w();
                c8o.l(lukVarW7);
                return new cmf1(lik1Var2, ssf1VarP, c3sVarB2, an4Var2, new uu4(false, lukVarW7), fmj1Var5.q());
            case 16:
                return Boolean.valueOf(cyoVar.b.a());
            case 17:
                return k9o0.z(cyoVar.b);
            case 18:
                a1r0 a1r0VarC = ((fmj1) cyoVar.G).C();
                c8o.l(a1r0VarC);
                return a1r0VarC;
            case 19:
                Flowable flowable2 = (Flowable) cyoVar.h.get();
                Flowable flowable3 = (Flowable) cyoVar.t.get();
                w9u0 w9u0Var = (w9u0) cyoVar.q.get();
                o241 o241VarI = ((fmj1) cyoVar.G).i();
                c8o.l(o241VarI);
                return new ktf1(flowable2, flowable3, w9u0Var, i691Var, o241VarI, (tsq) cyoVar.J, cyoVar.D());
            case 20:
                return f2u0.B(cyoVar.x(), (Flowable) cyoVar.r.get(), (Flowable) cyoVar.s.get(), cyoVar.d());
            case 21:
                jly0 jly0Var3 = cyoVar.h;
                fmj1 fmj1Var6 = (fmj1) cyoVar.G;
                Flowable flowable4 = (Flowable) jly0Var3.get();
                Scheduler schedulerO3 = fmj1Var6.o();
                c8o.l(schedulerO3);
                yqg yqgVarA = fmj1Var6.a();
                c8o.l(yqgVarA);
                return f2u0.z(flowable4, schedulerO3, yqgVarA, cyoVar.d());
            case 22:
                return f2u0.y((Flowable) cyoVar.h.get(), cyoVar.d());
            case 23:
                s4p0 s4p0VarR3 = ((fmj1) cyoVar.G).R();
                c8o.l(s4p0VarR3);
                i8h1 i8h1VarD = s4p0VarR3.d();
                c8o.m(i8h1VarD);
                return i8h1VarD;
            case 24:
                return cyoVar.b.h();
            case 25:
                Flowable flowable5 = (Flowable) cyoVar.h.get();
                Flowable flowable6 = (Flowable) cyoVar.t.get();
                w9u0 w9u0Var2 = (w9u0) cyoVar.q.get();
                o241 o241VarI2 = ((fmj1) cyoVar.G).i();
                c8o.l(o241VarI2);
                return new ekf1(flowable5, flowable6, w9u0Var2, i691Var, o241VarI2, (tsq) cyoVar.J, cyoVar.D());
            case 26:
                return ((fmj1) cyoVar.G).b0();
            case 27:
                return cyoVar.b.f();
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return k9o0.x(cyoVar.b);
            case 29:
                return cyoVar.b.m();
            case 30:
                return new ww9(cyoVar.n());
            case 31:
                a1g1 a1g1Var = new a1g1(((fmj1) cyoVar.G).F(), (byte) 11);
                Scheduler schedulerO4 = ((fmj1) cyoVar.G).o();
                c8o.l(schedulerO4);
                return new h280(a1g1Var, schedulerO4);
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                FlowableMap flowableMapM2 = cyoVar.m();
                fmj1 fmj1Var7 = (fmj1) cyoVar.G;
                kt91 kt91Var = (kt91) ((tsq) cyoVar.P).get();
                r0y r0yVarD = cyoVar.D();
                Resources resourcesR = fmj1Var7.r();
                c8o.l(resourcesR);
                luk lukVarW8 = fmj1Var7.w();
                c8o.l(lukVarW8);
                return new f3x(flowableMapM2, kt91Var, r0yVarD, resourcesR, new xu4(false, lukVarW8));
            case 33:
                kt91 kt91VarJ = ((fmj1) cyoVar.G).j();
                c8o.l(kt91VarJ);
                return kt91VarJ;
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                return new am51(cyoVar.x(), f2u0.j((Flowable) cyoVar.h.get()), cyoVar.p(), (Flowable) cyoVar.t.get(), (w9u0) cyoVar.q.get(), cyoVar.B(), (im51) cyoVar.y.get(), cyoVar.b());
            case 35:
                yqg yqgVarA2 = ((fmj1) cyoVar.G).a();
                c8o.l(yqgVarA2);
                return new im51(yqgVarA2);
            case 36:
                qm51 qm51Var = new qm51(cyoVar.x(), f2u0.j((Flowable) cyoVar.h.get()), cyoVar.p(), (Flowable) cyoVar.t.get(), (w9u0) cyoVar.q.get(), cyoVar.B(), (im51) cyoVar.y.get(), cyoVar.b());
                h791 h791Var = new h791((Flowable) cyoVar.h.get(), (Flowable) cyoVar.t.get(), (w9u0) cyoVar.q.get());
                fmj1 fmj1Var8 = (fmj1) cyoVar.G;
                uu00 uu00VarA = fmj1Var8.A();
                c8o.l(uu00VarA);
                uvy uvyVarQ0 = fmj1Var8.q0();
                c8o.l(uvyVarQ0);
                return new rt01(qm51Var, h791Var, new nn61(uu00VarA, uvyVarQ0, false, (byte) 25), (Flowable) cyoVar.h.get(), cyoVar.b());
            case 37:
                Flowable flowable7 = (Flowable) cyoVar.h.get();
                FlowableMap flowableMapX = cyoVar.x();
                h991 h991VarP = ((fmj1) cyoVar.G).P();
                c8o.l(h991VarP);
                return new bs0(flowable7, flowableMapX, h991VarP, xqu.a((tsq) cyoVar.T));
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                y991 y991VarT = ((fmj1) cyoVar.G).T();
                c8o.l(y991VarT);
                return y991VarT;
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                fmj1 fmj1Var9 = (fmj1) cyoVar.G;
                fmj1 fmj1Var10 = (fmj1) cyoVar.G;
                pta1 pta1VarI = fmj1Var9.I();
                c8o.l(pta1VarI);
                Observable map = pta1VarI.a().map(u9x0.P0);
                FlowableMap flowableMapM3 = cyoVar.m();
                pta1 pta1VarI2 = fmj1Var10.I();
                c8o.l(pta1VarI2);
                ynb0 ynb0VarA16 = xqu.a((tsq) cyoVar.V);
                luk lukVarW9 = fmj1Var10.w();
                c8o.l(lukVarW9);
                return new bs0(map, flowableMapM3, pta1VarI2, ynb0VarA16, lukVarW9);
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                dg30 dg30VarZ3 = ((fmj1) cyoVar.G).Z();
                c8o.l(dg30VarZ3);
                lik1 lik1Var3 = (lik1) cyoVar.l.get();
                lua1 lua1VarQ = ((fmj1) cyoVar.G).Q();
                c8o.l(lua1VarQ);
                return lua1VarQ.a(dg30VarZ3, lik1Var3);
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                fmj1 fmj1Var11 = (fmj1) cyoVar.G;
                tp91 tp91Var = fmj1Var11.y().e;
                c8o.m(tp91Var);
                u3q u3qVar = fmj1Var11.y().f;
                c8o.m(u3qVar);
                nn61 nn61VarA = u3qVar.a();
                r5v0 r5v0Var = new r5v0((p2p0) cyoVar.c.get(), (byte) 1);
                p3q p3qVarQ0 = fmj1Var11.Q0();
                c8o.l(p3qVarQ0);
                dg30 dg30VarZ4 = fmj1Var11.Z();
                c8o.l(dg30VarZ4);
                hj91 hj91VarA = tp91Var.a(new pp91(nn61VarA, r5v0Var, 3, p3qVarQ0.a(dg30VarZ4.e0()), 76));
                Flowable flowable8 = (Flowable) cyoVar.h.get();
                xyl1 xyl1VarP0 = ((fmj1) cyoVar.G).p0();
                c8o.l(xyl1VarP0);
                return new dm91(hj91VarA, flowable8, new up41(xyl1VarP0, (byte) 12), new a78((kt91) ((tsq) cyoVar.P).get()));
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                return new s691(cyoVar.x(), (Flowable) cyoVar.t.get(), cyoVar.p(), (w9u0) cyoVar.q.get());
            case 43:
                return new k691((Flowable) cyoVar.h.get(), (Flowable) cyoVar.t.get(), (w9u0) cyoVar.q.get(), (mrq0) cyoVar.A.get(), i691Var);
            case 44:
                rh11 rh11VarD0 = ((fmj1) cyoVar.G).d0();
                c8o.l(rh11VarD0);
                return new gmj1(rh11VarD0, (zh11) cyoVar.z.get(), cyoVar.c());
            case 45:
                fmj1 fmj1Var12 = (fmj1) cyoVar.G;
                u4q0 u4q0VarS0 = fmj1Var12.s0();
                c8o.l(u4q0VarS0);
                a1r0 a1r0Var = (a1r0) ((tsq) cyoVar.I).get();
                am30 am30VarS0 = fmj1Var12.S0();
                c8o.l(am30VarS0);
                ynb0 ynb0VarA17 = xqu.a((tsq) cyoVar.Z);
                tsq tsqVar3 = (tsq) cyoVar.a0;
                q8n q8nVarR0 = fmj1Var12.r0();
                c8o.l(q8nVarR0);
                p2o0 p2o0Var = new p2o0(u4q0VarS0, a1r0Var, am30VarS0, ynb0VarA17, tsqVar3, q8nVarR0, (byte) 1);
                Flowable flowableF = ((fmj1) cyoVar.G).f();
                c8o.l(flowableF);
                return new zh11(p2o0Var, flowableF);
            case 46:
                a1i1 a1i1VarG0 = ((fmj1) cyoVar.G).g0();
                c8o.l(a1i1VarG0);
                return a1i1VarG0;
            case 47:
                luk lukVarW10 = ((fmj1) cyoVar.G).w();
                c8o.l(lukVarW10);
                return new h05(false, lukVarW10);
            case 48:
                return new dx0((Flowable) cyoVar.h.get(), (xbu0) cyoVar.B.get());
            case 49:
                return k9o0.A(cyoVar.b);
            case 50:
                jly0 jly0Var4 = cyoVar.h;
                fmj1 fmj1Var13 = (fmj1) cyoVar.G;
                Flowable flowable9 = (Flowable) jly0Var4.get();
                Flowable flowable10 = (Flowable) cyoVar.D.get();
                w9u0 w9u0Var3 = (w9u0) cyoVar.q.get();
                Consumer consumer = (Consumer) cyoVar.E.get();
                luk lukVarW11 = fmj1Var13.w();
                c8o.l(lukVarW11);
                jn4 jn4Var = new jn4(lukVarW11);
                dma1 dma1VarM0 = fmj1Var13.m0();
                c8o.l(dma1VarM0);
                return new mo51(flowable9, flowable10, w9u0Var3, consumer, jn4Var, dma1VarM0);
            case 51:
                return f2u0.C(cyoVar.x(), (Flowable) cyoVar.C.get(), (Flowable) cyoVar.s.get(), cyoVar.d());
            case 52:
                jly0 jly0Var5 = cyoVar.h;
                fmj1 fmj1Var14 = (fmj1) cyoVar.G;
                Flowable flowable11 = (Flowable) jly0Var5.get();
                Scheduler schedulerO5 = fmj1Var14.o();
                c8o.l(schedulerO5);
                yqg yqgVarA3 = fmj1Var14.a();
                c8o.l(yqgVarA3);
                return f2u0.A(flowable11, schedulerO5, yqgVarA3, cyoVar.d());
            case 53:
                return new lrj0(cyoVar.b, (byte) 21);
            case 54:
                FlowableMap flowableMapM4 = cyoVar.m();
                mo51 mo51Var = (mo51) ((tsq) cyoVar.d0).get();
                y441 y441VarZ = cyoVar.z();
                xfx xfxVarA1 = ((fmj1) cyoVar.G).a0();
                c8o.l(xfxVarA1);
                return new rt01(flowableMapM4, mo51Var, y441VarZ, xfxVarA1);
            case 55:
                return k9o0.v(cyoVar.b);
            case 56:
                yjj1 yjj1VarB0 = ((fmj1) cyoVar.G).B0();
                c8o.l(yjj1VarB0);
                return yjj1VarB0;
            case 57:
                g0l g0lVarX0 = ((fmj1) cyoVar.G).x0();
                c8o.l(g0lVarX0);
                return g0lVarX0;
            case 58:
                return cyoVar.b.i();
            case 59:
                fmj1 fmj1Var15 = (fmj1) cyoVar.G;
                fmj1 fmj1Var16 = (fmj1) cyoVar.G;
                xfx xfxVarA2 = fmj1Var15.a0();
                c8o.l(xfxVarA2);
                cce cceVarG2 = cyoVar.g();
                sp00 sp00VarK2 = cyoVar.k();
                v1k v1kVarH2 = cyoVar.h();
                Flowable flowable12 = (Flowable) cyoVar.h.get();
                ugm ugmVar2 = (ugm) cyoVar.o.get();
                Scheduler schedulerO6 = fmj1Var16.o();
                c8o.l(schedulerO6);
                v1k v1kVar2 = new v1k(flowable12, ugmVar2, schedulerO6, (byte) 16);
                gg11 gg11VarN2 = fmj1Var16.N();
                q2p0 q2p0Var2 = cyoVar.b;
                luk lukVarW12 = fmj1Var16.w();
                c8o.l(lukVarW12);
                k2p0 k2p0Var2 = new k2p0(gg11VarN2, q2p0Var2, new dn4(lukVarW12));
                e68 e68VarF2 = cyoVar.f();
                duy duyVarJ2 = cyoVar.j();
                vsy vsyVarI2 = cyoVar.i();
                luk lukVarW13 = fmj1Var16.w();
                c8o.l(lukVarW13);
                iv4 iv4Var2 = new iv4(lukVarW13);
                ktf1 ktf1Var = (ktf1) ((tsq) cyoVar.K).get();
                ekf1 ekf1Var = (ekf1) ((tsq) cyoVar.L).get();
                luk lukVarW14 = fmj1Var16.w();
                c8o.l(lukVarW14);
                dn4 dn4Var2 = new dn4(lukVarW14);
                u27 u27VarE2 = cyoVar.e();
                mdn mdnVar2 = new mdn(cyoVar.x(), (byte) 0);
                dpf1 dpf1VarC2 = cyoVar.C();
                dpt0 dpt0VarV = cyoVar.v();
                aor aorVarE2 = fmj1Var16.E();
                c8o.l(aorVarE2);
                o671 o671VarA2 = cyoVar.A();
                Context context = fmj1Var16.context();
                c8o.l(context);
                kt91 kt91Var2 = (kt91) ((tsq) cyoVar.P).get();
                Flowable flowableF2 = fmj1Var16.f();
                c8o.l(flowableF2);
                pqc1 pqc1VarF1 = fmj1Var16.f1();
                c8o.l(pqc1VarF1);
                a7z a7zVarJ0 = fmj1Var16.J0();
                c8o.l(a7zVarJ0);
                nqc1 nqc1VarI0 = fmj1Var16.I0();
                c8o.l(nqc1VarI0);
                yjj1 yjj1Var = (yjj1) ((tsq) cyoVar.f0).get();
                c3s c3sVarB3 = fmj1Var16.B();
                c8o.l(c3sVarB3);
                pnd pndVar = new pnd(context, kt91Var2, flowableF2, pqc1VarF1, a7zVarJ0, nqc1VarI0, new yge0(yjj1Var, c3sVarB3, (byte) 0));
                ynb0 ynb0VarA18 = xqu.a(cyoVar.j0);
                wr30 wr30VarR2 = cyoVar.r();
                yjj1 yjj1Var2 = (yjj1) ((tsq) cyoVar.f0).get();
                izg izgVar = new izg(cyoVar.c());
                jjv0 jjv0Var = new jjv0((Flowable) cyoVar.k0.get(), cyoVar.x());
                ynb0 ynb0VarA19 = xqu.a((tsq) cyoVar.O);
                p2p0 p2p0Var2 = (p2p0) cyoVar.c.get();
                Scheduler schedulerO7 = fmj1Var16.o();
                c8o.l(schedulerO7);
                sqq0 sqq0Var2 = new sqq0(p2p0Var2, schedulerO7);
                rzo0 rzo0VarT2 = cyoVar.t();
                ynb0 ynb0VarA20 = xqu.a((tsq) cyoVar.l0);
                ynb0 ynb0VarA21 = xqu.a((tsq) cyoVar.Q);
                fbm fbmVarL2 = fmj1Var16.L();
                c8o.l(fbmVarL2);
                i8h1 i8h1Var2 = (i8h1) ((tsq) cyoVar.J).get();
                s4p0 s4p0VarR4 = fmj1Var16.R();
                c8o.l(s4p0VarR4);
                l6h1 l6h1VarE2 = s4p0VarR4.e();
                c8o.m(l6h1VarE2);
                s4p0 s4p0VarR5 = fmj1Var16.R();
                c8o.l(s4p0VarR5);
                n7h1 n7h1VarF2 = s4p0VarR5.f();
                c8o.m(n7h1VarF2);
                dxy dxyVarW2 = cyoVar.w();
                ynb0 ynb0VarA22 = xqu.a((tsq) cyoVar.R);
                ynb0 ynb0VarA23 = xqu.a((tsq) cyoVar.S);
                ynb0 ynb0VarA24 = xqu.a((tsq) cyoVar.U);
                ynb0 ynb0VarA25 = xqu.a((tsq) cyoVar.W);
                ynb0 ynb0VarA26 = xqu.a((tsq) cyoVar.X);
                ynb0 ynb0VarA27 = xqu.a((tsq) cyoVar.Y);
                ynb0 ynb0VarA28 = xqu.a((tsq) cyoVar.b0);
                ynb0 ynb0VarA29 = xqu.a((tsq) cyoVar.c0);
                a4f0 a4f0Var2 = new a4f0((Flowable) cyoVar.h.get(), (Flowable) cyoVar.t.get(), (w9u0) cyoVar.q.get());
                luk lukVarW15 = fmj1Var16.w();
                c8o.l(lukVarW15);
                xu4 xu4Var = new xu4(false, lukVarW15);
                FlowableMap flowableMapM5 = cyoVar.m();
                cbv cbvVarN0 = fmj1Var16.N0();
                c8o.l(cbvVarN0);
                et90 et90Var = new et90(xu4Var, flowableMapM5, cbvVarN0);
                hnl hnlVar = (hnl) cyoVar.e.get();
                yl1 yl1VarA2 = cyoVar.a();
                ynb0 ynb0VarA30 = xqu.a((tsq) cyoVar.m0);
                ynb0 ynb0VarA31 = xqu.a((tsq) cyoVar.d0);
                o671 o671VarA3 = cyoVar.A();
                v3i0 v3i0VarS2 = cyoVar.s();
                v6z0 v6z0VarY2 = cyoVar.y();
                FlowableMap flowableMapM6 = cyoVar.m();
                unr unrVarC0 = fmj1Var16.C0();
                c8o.l(unrVarC0);
                aor aorVarE3 = fmj1Var16.E();
                c8o.l(aorVarE3);
                e821 e821Var = new e821(flowableMapM6, unrVarC0, aorVarE3, new mo9((byte) 20), new mo9((byte) 21));
                dpt0 dpt0VarV2 = cyoVar.v();
                cyoVar.u();
                vi11 vi11Var = new vi11(e821Var, dpt0VarV2, new upd0((Flowable) cyoVar.t.get(), (byte) 2), cyoVar.n(), new a0b((byte) 26));
                FlowableMap flowableMapX2 = cyoVar.x();
                w2k1 w2k1VarO0 = fmj1Var16.O0();
                c8o.l(w2k1VarO0);
                yjj1 yjj1Var3 = (yjj1) ((tsq) cyoVar.f0).get();
                c3s c3sVarB4 = fmj1Var16.B();
                c8o.l(c3sVarB4);
                gw70 gw70VarB = fmj1Var16.b();
                c8o.l(gw70VarB);
                qlb qlbVar = new qlb(gw70VarB, (d0r) cyoVar.j.get());
                luk lukVarW16 = fmj1Var16.w();
                c8o.l(lukVarW16);
                ikj1 ikj1Var = new ikj1(flowableMapX2, w2k1VarO0, yjj1Var3, c3sVarB4, qlbVar, new bv4(false, lukVarW16));
                Flowable flowableQ = cyoVar.q();
                luk lukVarW17 = fmj1Var16.w();
                c8o.l(lukVarW17);
                qpj1 qpj1Var = new qpj1(flowableQ, new cv4(false, lukVarW17), (byte) 0);
                luk lukVarW18 = fmj1Var16.w();
                c8o.l(lukVarW18);
                cv4 cv4Var = new cv4(false, lukVarW18);
                uk51 uk51Var2 = new uk51((a1r0) ((tsq) cyoVar.I).get(), (byte) 1);
                FlowableObserveOn flowableObserveOnL2 = cyoVar.l();
                FlowableJust flowableJustI2 = Flowable.I(yqq0Var);
                FlowableDistinctUntilChanged flowableDistinctUntilChangedO2 = cyoVar.o();
                FlowableMap flowableMapM7 = cyoVar.m();
                Flowable flowable13 = (Flowable) cyoVar.s.get();
                lqc lqcVar = new lqc((byte) 17);
                msm0 msm0VarV2 = fmj1Var16.v();
                c8o.l(msm0VarV2);
                x4p0 x4p0Var2 = new x4p0(msm0VarV2, (n6r0) cyoVar.h0.get());
                r0y r0yVarD2 = cyoVar.D();
                pqq0 pqq0Var2 = (pqq0) cyoVar.w.get();
                un4 un4VarC2 = cyoVar.c();
                q8n q8nVarG2 = fmj1Var16.g();
                c8o.l(q8nVarG2);
                hs71 hs71VarX2 = fmj1Var16.X();
                c8o.l(hs71VarX2);
                return new pnj1(xfxVarA2, cceVarG2, sp00VarK2, v1kVarH2, v1kVar2, k2p0Var2, e68VarF2, duyVarJ2, vsyVarI2, iv4Var2, ktf1Var, ekf1Var, dn4Var2, u27VarE2, mdnVar2, dpf1VarC2, dpt0VarV, aorVarE2, o671VarA2, pndVar, ynb0VarA18, wr30VarR2, yjj1Var2, izgVar, jjv0Var, ynb0VarA19, sqq0Var2, rzo0VarT2, ynb0VarA20, ynb0VarA21, fbmVarL2, i8h1Var2, l6h1VarE2, n7h1VarF2, dxyVarW2, ynb0VarA22, ynb0VarA23, ynb0VarA24, ynb0VarA25, ynb0VarA26, ynb0VarA27, ynb0VarA28, ynb0VarA29, a4f0Var2, et90Var, hnlVar, yl1VarA2, ynb0VarA30, ynb0VarA31, o671VarA3, v3i0VarS2, v6z0VarY2, vi11Var, ikj1Var, qpj1Var, cv4Var, uk51Var2, flowableObserveOnL2, flowableJustI2, flowableDistinctUntilChangedO2, flowableMapM7, flowable13, lqcVar, x4p0Var2, r0yVarD2, pqq0Var2, un4VarC2, q8nVarG2, w3p0.D(hs71VarX2, (Flowable) cyoVar.h.get()), xqu.a((tsq) cyoVar.o0), cyoVar.q(), fmj1Var16.n0(), (w9u0) cyoVar.q.get(), xqu.a((tsq) cyoVar.p0), fmj1Var16.o1());
            case 60:
                return w3p0.w(((fmj1) cyoVar.G).H(), cyoVar.b, (o2p0) cyoVar.u.get());
            case 61:
                PublishProcessor publishProcessorD = cyoVar.b.d();
                publishProcessorD.getClass();
                return new FlowableOnBackpressureLatest(publishProcessorD);
            case 62:
                jly0 jly0Var6 = cyoVar.k0;
                fmj1 fmj1Var17 = (fmj1) cyoVar.G;
                Flowable flowable14 = (Flowable) jly0Var6.get();
                Scheduler schedulerO8 = fmj1Var17.o();
                c8o.l(schedulerO8);
                Scheduler schedulerG = fmj1Var17.G();
                c8o.l(schedulerG);
                return new av41(flowable14, schedulerO8, schedulerG);
            case 63:
                FlowableMap flowableMapM8 = cyoVar.m();
                mo51 mo51Var2 = (mo51) ((tsq) cyoVar.d0).get();
                y441 y441VarZ2 = cyoVar.z();
                xfx xfxVarA3 = ((fmj1) cyoVar.G).a0();
                c8o.l(xfxVarA3);
                return new a7v0(flowableMapM8, mo51Var2, y441VarZ2, xfxVarA3);
            case 64:
                return new nl9(xqu.a((tsq) cyoVar.f0), xqu.a((tsq) cyoVar.g0), xqu.a((tsq) cyoVar.H), xqu.a((tsq) cyoVar.P), xqu.a((tsq) cyoVar.n0), cyoVar.m(), cyoVar.q());
            case 65:
                r3b1 r3b1VarJ1 = ((fmj1) cyoVar.G).j1();
                c8o.l(r3b1VarJ1);
                return r3b1VarJ1;
            case 66:
                return ((fmj1) cyoVar.G).s();
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object m() {
        byte b = this.b;
        if (b == 0) {
            return cwl1.C((q7r0) ((goq) this.c).g);
        }
        if (b == 1) {
            return new puq(this);
        }
        if (b == 2) {
            return new quq(this);
        }
        if (b == 3) {
            return new wzj1();
        }
        if (b == 4) {
            return new ruq(this);
        }
        if (b == 5) {
            return new suq(this);
        }
        jah.e(b);
        return null;
    }

    private final Object n() {
        e1k1 e1k1Var = (e1k1) ((ip31) this.c).b;
        byte b = this.b;
        switch (b) {
            case 0:
                return pzm.h((mos) e1k1Var.k.get());
            case 1:
                return new tuq(this);
            case 2:
                csc1 csc1Var = (csc1) e1k1Var.o.get();
                c8o.l(csc1Var);
                return csc1Var;
            case 3:
                return new uuq(this);
            case 4:
                a1r0 a1r0Var = (a1r0) e1k1Var.i.get();
                c8o.l(a1r0Var);
                return a1r0Var;
            case 5:
                ivs0 ivs0Var = (ivs0) e1k1Var.n.get();
                c8o.l(ivs0Var);
                return ivs0Var;
            case 6:
                i8h1 i8h1Var = (i8h1) e1k1Var.p.get();
                c8o.l(i8h1Var);
                return i8h1Var;
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object o() {
        tjq tjqVar = (tjq) this.c;
        aqk1 aqk1Var = (aqk1) tjqVar.b;
        byte b = this.b;
        if (b == 0) {
            RetrofitMaker retrofitMaker = (RetrofitMaker) aqk1Var.c.get();
            c8o.l(retrofitMaker);
            return (sqk1) retrofitMaker.createWebgateService(sqk1.class, "android-bluejay-data-impl");
        }
        if (b == 1) {
            return new qa2((q7r0) tjqVar.c, (byte) 22);
        }
        if (b == 2) {
            return pzm.h((mos) aqk1Var.g.get());
        }
        jah.e(b);
        return null;
    }

    private final Object p() {
        oxk1 oxk1Var = (oxk1) ((jnq) this.c).c;
        byte b = this.b;
        if (b == 0) {
            return new lxk1();
        }
        if (b == 1) {
            lzn0 lzn0Var = (lzn0) oxk1Var.b.get();
            c8o.l(lzn0Var);
            return new hz5(lzn0Var);
        }
        if (b != 2) {
            jah.e(b);
            return null;
        }
        i8h1 i8h1Var = (i8h1) oxk1Var.a.get();
        c8o.l(i8h1Var);
        return i8h1Var;
    }

    private final Object q() {
        f9p f9pVar = (f9p) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new yuq(this);
            case 1:
                u2l1 u2l1Var = (u2l1) f9pVar.X;
                u2l1 u2l1Var2 = (u2l1) f9pVar.X;
                q7r0 q7r0Var = (q7r0) f9pVar.Y;
                t2l1 t2l1Var = (t2l1) f9pVar.t;
                String str = u2l1Var.a;
                c8o.m(str);
                Scheduler scheduler = (Scheduler) t2l1Var.p.get();
                c8o.l(scheduler);
                lzn0 lzn0Var = (lzn0) t2l1Var.j.get();
                c8o.l(lzn0Var);
                nfa0 nfa0Var = (nfa0) t2l1Var.i.get();
                c8o.l(nfa0Var);
                x45 x45Var = new x45(nfa0Var);
                t8u0 t8u0Var = (t8u0) t2l1Var.k.get();
                c8o.l(t8u0Var);
                ruz ruzVarA = t8u0Var.a(q7r0Var.d.c.getLifecycle()).a();
                my30 my30VarQ = f9pVar.q();
                Observable observable = (Observable) ((jly0) f9pVar.c).get();
                t8u0 t8u0Var2 = (t8u0) t2l1Var.k.get();
                c8o.l(t8u0Var2);
                muz muzVarD = t8u0Var2.a(q7r0Var.d.c.getLifecycle()).d();
                yze1 yze1Var = (yze1) t2l1Var.q.get();
                c8o.l(yze1Var);
                ilh1 ilh1Var = new ilh1(yze1Var, f9pVar.q(), (byte) 18);
                g0l1 g0l1Var = (g0l1) ((jly0) f9pVar.g).get();
                ajg ajgVar = (ajg) t2l1Var.c.get();
                c8o.l(ajgVar);
                String str2 = (String) ((jly0) f9pVar.b).get();
                String str3 = u2l1Var2.a;
                c8o.m(str3);
                dma1 dma1Var = (dma1) t2l1Var.s.get();
                c8o.l(dma1Var);
                iov0 iov0Var = new iov0(dma1Var);
                Locale locale = (Locale) ((jly0) f9pVar.h).get();
                op31 op31Var = (op31) t2l1Var.u.get();
                c8o.l(op31Var);
                iyc0 iyc0Var = (iyc0) t2l1Var.t.get();
                c8o.l(iyc0Var);
                ol61 ol61Var = (ol61) t2l1Var.v.get();
                c8o.l(ol61Var);
                zsc zscVar = new zsc(op31Var, iyc0Var, ol61Var, (y221) ((jly0) f9pVar.Z).get(), (byte) 26);
                z710 z710Var = (z710) t2l1Var.w.get();
                c8o.l(z710Var);
                y221 y221Var = (y221) ((jly0) f9pVar.Z).get();
                www0 www0Var = (www0) t2l1Var.x.get();
                c8o.l(www0Var);
                i8h1 i8h1VarZ = u1n0.z(q7r0Var);
                String str4 = u2l1Var2.a;
                c8o.m(str4);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                dsk0 dsk0Var = new dsk0(yon1.g6().c, str4, (byte) 15);
                xh71 xh71Var = (xh71) t2l1Var.y.get();
                c8o.l(xh71Var);
                n2l1 n2l1Var = (n2l1) t2l1Var.B.get();
                c8o.l(n2l1Var);
                j1l1 j1l1Var = new j1l1(scheduler, lzn0Var, x45Var, ruzVarA, my30VarQ, observable, muzVarD, ilh1Var, g0l1Var, ajgVar, str2, str3, iov0Var, locale, zscVar, z710Var, y221Var, www0Var, i8h1VarZ, dsk0Var, xh71Var, n2l1Var);
                PublishSubject publishSubject = (PublishSubject) ((jly0) f9pVar.N0).get();
                PublishSubject publishSubject2 = (PublishSubject) ((jly0) f9pVar.d).get();
                p7b1 p7b1Var = (p7b1) ((jly0) f9pVar.O0).get();
                ndu0 ndu0Var = (ndu0) ((jly0) f9pVar.P0).get();
                yp41 yp41Var = (yp41) ((jly0) f9pVar.Q0).get();
                gn5 gn5Var = (gn5) ((jly0) f9pVar.R0).get();
                pe peVar = (pe) t2l1Var.a.get();
                c8o.l(peVar);
                w2l1 w2l1Var = (w2l1) t2l1Var.C.get();
                c8o.l(w2l1Var);
                return new q7m0(str, j1l1Var, publishSubject, publishSubject2, p7b1Var, ndu0Var, yp41Var, gn5Var, peVar, w2l1Var);
            case 2:
                return UUID.randomUUID().toString();
            case 3:
                zeu0 zeu0Var = (zeu0) ((t2l1) f9pVar.t).l.get();
                c8o.l(zeu0Var);
                Flowable flowableC = zeu0Var.c();
                flowableC.getClass();
                return new ObservableFromPublisher(flowableC);
            case 4:
                byf byfVar = (byf) ((t2l1) f9pVar.t).n.get();
                c8o.l(byfVar);
                return new g0l1(new bih1(byfVar, new vjj0((iu30) ((jly0) f9pVar.e).get()), (byte) 17), (ArrayList) ((jly0) f9pVar.f).get());
            case 5:
                return new r7j0((PublishSubject) ((jly0) f9pVar.d).get(), (byte) 23);
            case 6:
                return new PublishSubject();
            case 7:
                return new ArrayList();
            case 8:
                Context context = (Context) ((t2l1) f9pVar.t).e.get();
                c8o.l(context);
                return context.getResources().getConfiguration().getLocales().get(0);
            case 9:
                ts70 ts70Var = (ts70) ((jly0) f9pVar.i).get();
                Context context2 = (Context) ((t2l1) f9pVar.t).e.get();
                c8o.l(context2);
                return new y221(ts70Var, context2);
            case 10:
                Context context3 = (Context) ((t2l1) f9pVar.t).e.get();
                c8o.l(context3);
                return new ts70(context3.getCacheDir(), new gou(context3, f4i1.e(context3.getPackageName(), ".vtec"), (byte) 2));
            case 11:
                return new PublishSubject();
            case 12:
                nfa0 nfa0Var2 = (nfa0) ((t2l1) f9pVar.t).i.get();
                c8o.l(nfa0Var2);
                f2g1 f2g1Var = new f2g1((Object) nfa0Var2, (byte) 14);
                ajg ajgVar2 = (ajg) ((t2l1) f9pVar.t).c.get();
                c8o.l(ajgVar2);
                return new p7b1(f2g1Var, ajgVar2);
            case 13:
                return new ndu0((Observable) ((jly0) f9pVar.c).get());
            case 14:
                tp41 tp41Var = (tp41) ((t2l1) f9pVar.t).o.get();
                c8o.l(tp41Var);
                q8n q8nVar = (q8n) ((t2l1) f9pVar.t).r.get();
                c8o.l(q8nVar);
                return new yp41(tp41Var, q8nVar);
            case 15:
                Observable observable2 = (Observable) ((t2l1) f9pVar.t).A.get();
                c8o.l(observable2);
                return new gn5(observable2);
            case 16:
                jly0 jly0Var = (jly0) f9pVar.O0;
                t2l1 t2l1Var2 = (t2l1) f9pVar.t;
                p7b1 p7b1Var2 = (p7b1) jly0Var.get();
                q2l1 q2l1Var = (q2l1) ((jly0) f9pVar.T0).get();
                ja00 ja00Var = (ja00) ((jly0) f9pVar.U0).get();
                u2l1 u2l1Var3 = (u2l1) f9pVar.X;
                ajg ajgVar3 = (ajg) t2l1Var2.c.get();
                c8o.l(ajgVar3);
                luk lukVar = (luk) t2l1Var2.d.get();
                c8o.l(lukVar);
                return new m4l1(p7b1Var2, q2l1Var, ja00Var, u2l1Var3, ajgVar3, new r45(lukVar).d());
            case 17:
                return new q2l1();
            case 18:
                Handler handler = (Handler) ((t2l1) f9pVar.t).g.get();
                c8o.l(handler);
                return new ja00(handler, (iu30) ((jly0) f9pVar.e).get(), (g0l1) ((jly0) f9pVar.g).get());
            case 19:
                return new zuq(this);
            case 20:
                return new avq(this);
            case 21:
                u2l1 u2l1Var4 = (u2l1) f9pVar.X;
                t2l1 t2l1Var3 = (t2l1) f9pVar.t;
                String str5 = u2l1Var4.a;
                c8o.m(str5);
                u2l1 u2l1Var5 = (u2l1) f9pVar.X;
                RetrofitMaker retrofitMaker = (RetrofitMaker) t2l1Var3.m.get();
                c8o.l(retrofitMaker);
                z2l1 z2l1Var = (z2l1) retrofitMaker.createWebgateService(z2l1.class, "android-the-stage-vtec");
                my30 my30VarQ2 = f9pVar.q();
                nfa0 nfa0Var3 = (nfa0) t2l1Var3.i.get();
                c8o.l(nfa0Var3);
                luk lukVar2 = (luk) t2l1Var3.d.get();
                c8o.l(lukVar2);
                g291 g291Var = new g291(z2l1Var, my30VarQ2, nfa0Var3, new r45(lukVar2));
                my30 my30VarQ3 = f9pVar.q();
                ajg ajgVar4 = (ajg) t2l1Var3.c.get();
                c8o.l(ajgVar4);
                String str6 = (String) ((jly0) f9pVar.b).get();
                yze1 yze1Var2 = (yze1) t2l1Var3.q.get();
                c8o.l(yze1Var2);
                return new m6e0(Observable.defer(new h23(new AtomicReference(), new vi11(new hcf1(1, g291Var, g291.class, "fetch", "fetch(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", 0, (byte) 26), my30VarQ3, ajgVar4, str6, new ilh1(yze1Var2, f9pVar.q(), (byte) 18)), str5, u2l1Var5)), u0e0.X0, fnc0.Z0);
            default:
                jah.e(b);
                return null;
        }
    }

    private final Object r() {
        jnq jnqVar = (jnq) this.c;
        chl1 chl1Var = (chl1) jnqVar.c;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return pzm.h((mos) chl1Var.b.get());
            }
            if (b != 2) {
                jah.e(b);
                return null;
            }
            i8h1 i8h1Var = (i8h1) chl1Var.f.get();
            c8o.l(i8h1Var);
            return i8h1Var;
        }
        Context context = (Context) chl1Var.e.a;
        c8o.l(context);
        yzh1 yzh1Var = (yzh1) chl1Var.d.get();
        c8o.l(yzh1Var);
        yo31 yo31Var = new yo31(yzh1Var, (byte) 28);
        los losVar = (los) ((jly0) jnqVar.a).get();
        lzn0 lzn0Var = (lzn0) chl1Var.c.get();
        c8o.l(lzn0Var);
        return new ahl1(context, yo31Var, losVar, lzn0Var, xqu.a((tsq) jnqVar.b));
    }

    private final Object s() {
        kp5 kp5Var = (kp5) this.c;
        tkl1 tkl1Var = (tkl1) kp5Var.a;
        byte b = this.b;
        if (b == 0) {
            return new cvq(this);
        }
        if (b == 1) {
            dg30 dg30Var = (dg30) tkl1Var.a.get();
            c8o.l(dg30Var);
            byf byfVar = (byf) tkl1Var.j.get();
            c8o.l(byfVar);
            return new zic(dg30Var, byfVar, (qmc) ((jly0) kp5Var.c).get());
        }
        if (b == 2) {
            return new qmc();
        }
        if (b == 3) {
            return new dvq(this);
        }
        if (b == 4) {
            agj0 agj0Var = (agj0) tkl1Var.c.get();
            c8o.l(agj0Var);
            return new oll1(agj0Var, (fll1) ((jly0) kp5Var.e).get());
        }
        if (b == 5) {
            tv80 tv80Var = ((dll1) kp5Var.b).c;
            return new fll1(tv80Var != null ? new bwn0(tv80Var) : null);
        }
        jah.e(b);
        return null;
    }

    private final Object t() {
        int i;
        sg60 sg60Var;
        sg60 sg60Var2;
        sg60 sg60Var3;
        sg60 sg60Var4;
        e690 e690Var;
        lvq lvqVar = (lvq) this.c;
        byte b = 3;
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        byte b5 = this.b;
        switch (b5) {
            case 0:
                rvm1 rvm1Var = lvqVar.a;
                boolean zN = lvqVar.b.n();
                dbr0 dbr0Var = (e5b0) lvqVar.h.get();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0 p6r0VarG1 = yon1.G1("YOURLIBRARY", "yourlibrary", 2255, "yourlibrary");
                Parcelable.Creator creator = lik1.CREATOR;
                dbr0 bn70Var = new bn70(p6r0VarG1, new lik1(rvm1Var.a), (nar0) null);
                dbr0 j0c0Var = new j0c0(mno1.j0);
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
                kvm1 kvm1Var = lvqVar.b;
                kvm1 kvm1Var2 = lvqVar.b;
                q0d0 q0d0VarN = kvm1Var.N();
                c8o.l(q0d0VarN);
                q8n q8nVarD = kvm1Var2.d();
                c8o.l(q8nVarD);
                l27 l27Var = new l27(q8nVarD, lvqVar.h());
                q8n q8nVarD2 = kvm1Var2.d();
                c8o.l(q8nVarD2);
                rf40 rf40VarA = lvqVar.c.a();
                c8o.l(rf40VarA);
                l27 l27Var2 = new l27(q8nVarD2, rf40VarA);
                q8n q8nVarD3 = kvm1Var2.d();
                c8o.l(q8nVarD3);
                co9 co9Var = new co9(q8nVarD3, (c1t) lvqVar.e.get());
                zns znsVar = (zns) lvqVar.g.get();
                q8n q8nVarG = kvm1Var2.g();
                c8o.l(q8nVarG);
                return yx61.l(q0d0VarN, l27Var, l27Var2, co9Var, t380.p(ux51.y(znsVar, q8nVarG)));
            case 2:
                return new c1t();
            case 3:
                return new zns(lvqVar.d());
            case 4:
                upp0 upp0VarT = lvqVar.b.t();
                c8o.l(upp0VarT);
                return upp0VarT;
            case 5:
                return new juc((c8m0) lvqVar.Y.get(), (aim0) lvqVar.e0.get(), (eim0) lvqVar.f0.get(), (g2h) lvqVar.g0.get());
            case 6:
                wn31 wn31Var = (wn31) lvqVar.S.get();
                EventSource eventSource = (EventSource) lvqVar.X.get();
                Scheduler schedulerG = lvqVar.b.G();
                c8o.l(schedulerG);
                return new so31(wn31Var, eventSource, schedulerG);
            case 7:
                kvm1 kvm1Var3 = lvqVar.b;
                kvm1 kvm1Var4 = lvqVar.b;
                ccc0 ccc0VarO = kvm1Var3.o();
                c8o.l(ccc0VarO);
                jzs0 jzs0Var = (jzs0) lvqVar.j.get();
                td41 td41Var = (td41) lvqVar.n.get();
                pg60 pg60Var = (pg60) lvqVar.v.get();
                Scheduler schedulerY0 = kvm1Var4.y0();
                c8o.l(schedulerY0);
                rwu0 rwu0VarI = kvm1Var4.I();
                c8o.l(rwu0VarI);
                g2z g2zVar = new g2z(schedulerY0, new myq0(ssc0.s(rwu0VarI, (iac0) lvqVar.w.get(), lvqVar.n())), (epc0) lvqVar.C.get());
                Scheduler schedulerD0 = kvm1Var4.d0();
                c8o.l(schedulerD0);
                q2u q2uVar = (q2u) lvqVar.G.get();
                ir91 ir91Var = (ir91) lvqVar.H.get();
                y380 y380Var = (y380) lvqVar.J.get();
                q8n q8nVarE = kvm1Var4.e();
                c8o.l(q8nVarE);
                g6c0 g6c0VarM0 = kvm1Var4.m0();
                c8o.l(g6c0VarM0);
                x94 x94Var = new x94(g6c0VarM0, (byte) 3);
                q8n q8nVarG2 = kvm1Var4.g();
                c8o.l(q8nVarG2);
                js21 js21Var = (js21) lvqVar.L.get();
                pzi0 pzi0Var = (pzi0) lvqVar.M.get();
                vpp0 vpp0VarI0 = kvm1Var4.i0();
                c8o.l(vpp0VarI0);
                eu4 eu4VarR = kvm1Var4.r();
                c8o.l(eu4VarR);
                q8n q8nVarD4 = kvm1Var4.d();
                c8o.l(q8nVarD4);
                hce1 hce1Var = new hce1(vpp0VarI0, eu4VarR, q8nVarD4);
                c941 c941Var = (c941) lvqVar.P.get();
                xrc0 xrc0VarU = kvm1Var4.U();
                c8o.l(xrc0VarU);
                uu00 uu00VarA = kvm1Var4.A();
                c8o.l(uu00VarA);
                gfr gfrVar = new gfr(xrc0VarU, uu00VarA, lvqVar.n());
                k9r k9rVarC = lvqVar.c();
                ccc0 ccc0VarO2 = kvm1Var4.o();
                c8o.l(ccc0VarO2);
                op31 op31VarO = kvm1Var4.O();
                c8o.l(op31VarO);
                w4h w4hVarX = kvm1Var4.X();
                c8o.l(w4hVarX);
                s4w0 s4w0VarP = kvm1Var4.P();
                c8o.l(s4w0VarP);
                j130 j130VarF0 = kvm1Var4.f0();
                c8o.l(j130VarF0);
                return new bo31(ccc0VarO, jzs0Var, td41Var, pg60Var, g2zVar, schedulerD0, q2uVar, ir91Var, y380Var, q8nVarE, x94Var, q8nVarG2, js21Var, pzi0Var, hce1Var, c941Var, gfrVar, k9rVarC, new g2z(ccc0VarO2, op31VarO, w4hVarX, s4w0VarP, j130VarF0, lvqVar.d()), new p5((td41) lvqVar.n.get(), (byte) 18));
            case 8:
                zxm1 zxm1VarZ = lvqVar.b.z();
                c8o.l(zxm1VarZ);
                return new jzs0(zxm1VarZ);
            case 9:
                return ((ehp) lvqVar.k.get()).a((String) lvqVar.l.get(), (s4b1) lvqVar.m.get());
            case 10:
                return new ehp(this, (byte) 2);
            case 11:
                String str = lvqVar.a.c;
                c8o.m(str);
                return str;
            case 12:
                rvm1 rvm1Var2 = lvqVar.a;
                Set set = s4b1.f;
                return uic.x(rvm1Var2.a);
            case 13:
                tsq tsqVar = lvqVar.o;
                tsq tsqVar2 = lvqVar.u;
                if (lvqVar.n().j()) {
                    tsqVar = tsqVar2;
                }
                return (pg60) tsqVar.get();
            case 14:
                kvm1 kvm1Var5 = lvqVar.b;
                kvm1 kvm1Var6 = lvqVar.b;
                Activity activityS = kvm1Var5.s();
                c8o.l(activityS);
                ut71 ut71VarY = kvm1Var6.y();
                c8o.l(ut71VarY);
                String str2 = (String) lvqVar.l.get();
                evm1 evm1VarN = lvqVar.n();
                r6c0 r6c0VarQ = kvm1Var6.Q();
                c8o.l(r6c0VarQ);
                Scheduler schedulerG2 = kvm1Var6.G();
                c8o.l(schedulerG2);
                yqg yqgVarA = kvm1Var6.a();
                c8o.l(yqgVarA);
                return new t0c0(activityS, ut71VarY, str2, evm1VarN, r6c0VarQ, schedulerG2, yqgVarA);
            case 15:
                tsq tsqVar3 = lvqVar.f30p;
                boolean zG = lvqVar.n().G();
                sg60 sg60Var5 = eco0.a;
                if (zG) {
                    Object obj = tsqVar3.get();
                    obj.getClass();
                    sg60Var = (sg60) obj;
                } else {
                    sg60Var = sg60Var5;
                }
                tsq tsqVar4 = lvqVar.q;
                if (lvqVar.n().d()) {
                    Object obj2 = tsqVar4.get();
                    obj2.getClass();
                    sg60Var2 = (sg60) obj2;
                } else {
                    sg60Var2 = sg60Var5;
                }
                tsq tsqVar5 = lvqVar.r;
                if (lvqVar.n().n()) {
                    Object obj3 = tsqVar5.get();
                    obj3.getClass();
                    sg60Var3 = (sg60) obj3;
                } else {
                    sg60Var3 = sg60Var5;
                }
                tsq tsqVar6 = lvqVar.s;
                if (lvqVar.n().s()) {
                    Object obj4 = tsqVar6.get();
                    obj4.getClass();
                    sg60Var4 = (sg60) obj4;
                } else {
                    sg60Var4 = sg60Var5;
                }
                tsq tsqVar7 = lvqVar.t;
                if (lvqVar.n().y()) {
                    Object obj5 = tsqVar7.get();
                    obj5.getClass();
                    sg60Var5 = (sg60) obj5;
                }
                gg11 gg11VarK = j380.k("offboard_new_episodes", sg60Var, "create_playlist", sg60Var2, "follow_podcast", sg60Var3, "library_import_match_result", sg60Var4, "follow_podcast_education", sg60Var5);
                Scheduler schedulerG3 = lvqVar.b.G();
                c8o.l(schedulerG3);
                return new qg60(gg11VarK, schedulerG3);
            case 16:
                kvm1 kvm1Var7 = lvqVar.b;
                kvm1 kvm1Var8 = lvqVar.b;
                Activity activityS2 = kvm1Var7.s();
                c8o.l(activityS2);
                yqg yqgVarA2 = kvm1Var8.a();
                c8o.l(yqgVarA2);
                ut71 ut71VarY2 = kvm1Var8.y();
                c8o.l(ut71VarY2);
                String str3 = (String) lvqVar.l.get();
                Scheduler schedulerG4 = kvm1Var8.G();
                c8o.l(schedulerG4);
                return new fkp0(activityS2, yqgVarA2, ut71VarY2, str3, schedulerG4);
            case 17:
                kvm1 kvm1Var9 = lvqVar.b;
                kvm1 kvm1Var10 = lvqVar.b;
                Activity activityS3 = kvm1Var9.s();
                c8o.l(activityS3);
                ut71 ut71VarY3 = kvm1Var10.y();
                c8o.l(ut71VarY3);
                String str4 = (String) lvqVar.l.get();
                Scheduler schedulerG5 = kvm1Var10.G();
                c8o.l(schedulerG5);
                return new tku0(activityS3, ut71VarY3, str4, schedulerG5, (byte) 0);
            case 18:
                kvm1 kvm1Var11 = lvqVar.b;
                kvm1 kvm1Var12 = lvqVar.b;
                Activity activityS4 = kvm1Var11.s();
                c8o.l(activityS4);
                ut71 ut71VarY4 = kvm1Var12.y();
                c8o.l(ut71VarY4);
                String str5 = (String) lvqVar.l.get();
                Scheduler schedulerG6 = kvm1Var12.G();
                c8o.l(schedulerG6);
                return new tku0(activityS4, ut71VarY4, str5, schedulerG6, (byte) 1);
            case 19:
                r6c0 r6c0VarQ2 = lvqVar.b.Q();
                c8o.l(r6c0VarQ2);
                return new l6c0(r6c0VarQ2);
            case 20:
                Activity activityS5 = lvqVar.b.s();
                c8o.l(activityS5);
                ut71 ut71VarY5 = lvqVar.b.y();
                c8o.l(ut71VarY5);
                return new o4v0(activityS5, ut71VarY5, (String) lvqVar.l.get());
            case 21:
                iac0 iac0Var = lvqVar.d.d.c;
                c8o.m(iac0Var);
                return iac0Var;
            case 22:
                rvm1 rvm1Var3 = lvqVar.a;
                tsq tsqVar8 = lvqVar.A;
                tsq tsqVar9 = lvqVar.B;
                if (rvm1Var3.e) {
                    tsqVar8 = tsqVar9;
                }
                return (epc0) tsqVar8.get();
            case 23:
                cik1 cik1VarM = lvqVar.m();
                rvm1 rvm1Var4 = lvqVar.a;
                tsq tsqVar10 = lvqVar.y;
                tsq tsqVar11 = lvqVar.z;
                if (rvm1Var4.e) {
                    tsqVar10 = tsqVar11;
                }
                return new go31(cik1VarM, (r7c0) tsqVar10.get(), (byte) 0);
            case 24:
                return new bxm1(new xpr());
            case 25:
                return new fo31(lvqVar.n(), (byte) 0);
            case 26:
                return new fo31(lvqVar.n(), (byte) 2);
            case 27:
                cik1 cik1VarM2 = lvqVar.m();
                rvm1 rvm1Var5 = lvqVar.a;
                tsq tsqVar12 = lvqVar.y;
                tsq tsqVar13 = lvqVar.z;
                if (rvm1Var5.e) {
                    tsqVar12 = tsqVar13;
                }
                return new go31(cik1VarM2, (r7c0) tsqVar12.get(), (byte) 1);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                Activity activityS6 = lvqVar.b.s();
                c8o.l(activityS6);
                return new q2u(activityS6, new sgz(lvqVar.D, (usr0) lvqVar.F.get()), lvqVar.d());
            case 29:
                return u1n0.z(lvqVar.d);
            case 30:
                return new tgz((co31) lvqVar.E.get(), (byte) 0);
            case 31:
                return new co31();
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                kvm1 kvm1Var13 = lvqVar.b;
                kvm1 kvm1Var14 = lvqVar.b;
                dg30 dg30VarZ = kvm1Var13.Z();
                c8o.l(dg30VarZ);
                ccc0 ccc0VarO3 = kvm1Var14.o();
                c8o.l(ccc0VarO3);
                kt91 kt91VarJ = kvm1Var14.j();
                c8o.l(kt91VarJ);
                return new ir91(dg30VarZ, ccc0VarO3, kt91VarJ, lvqVar.D, (co31) lvqVar.E.get());
            case 33:
                return new y380(lvqVar.D, lvqVar.I, (co31) lvqVar.E.get());
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                return cwl1.G(lvqVar.d);
            case 35:
                pd80 pd80VarB = lvqVar.b.B();
                c8o.l(pd80VarB);
                return new js21(pd80VarB, (lik1) lvqVar.K.get(), lvqVar.n());
            case 36:
                rvm1 rvm1Var6 = lvqVar.a;
                Parcelable.Creator creator2 = lik1.CREATOR;
                return new lik1(rvm1Var6.a);
            case 37:
                pd80 pd80VarB2 = lvqVar.b.B();
                c8o.l(pd80VarB2);
                return new pzi0(pd80VarB2, (lik1) lvqVar.K.get());
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                return new c941((io31) lvqVar.N.get(), (u5f1) lvqVar.O.get(), (String) lvqVar.l.get());
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                return new io31(lvqVar.D, (co31) lvqVar.E.get());
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                Activity activityS7 = lvqVar.b.s();
                c8o.l(activityS7);
                ut71 ut71VarY6 = lvqVar.b.y();
                c8o.l(ut71VarY6);
                return new u5f1(activityS7, ut71VarY6);
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                return cwl1.C(lvqVar.d);
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                return cto1.q(lvqVar.d.d.c);
            case 43:
                kvm1 kvm1Var15 = lvqVar.b;
                v5n v5nVarO0 = kvm1Var15.o0();
                c8o.l(v5nVarO0);
                vqb0 vqb0Var = new vqb0(v5nVarO0, (String) lvqVar.l.get(), (byte) 5);
                d3s d3sVarY = kvm1Var15.Y();
                c8o.l(d3sVarY);
                xhp xhpVar = (xhp) lvqVar.W.get();
                d3s d3sVarY2 = kvm1Var15.Y();
                c8o.l(d3sVarY2);
                RxRouter rxRouterP = kvm1Var15.p();
                c8o.l(rxRouterP);
                iir iirVar = new iir(new be(new CosmosTransport(new opy0(rxRouterP, (byte) 8))));
                z0t z0tVarA0 = kvm1Var15.a0();
                c8o.l(z0tVarA0);
                gfr gfrVar2 = new gfr(d3sVarY2, iirVar, z0tVarA0, (byte) 3);
                z0t z0tVarA1 = kvm1Var15.a0();
                c8o.l(z0tVarA1);
                dma1 dma1VarR0 = kvm1Var15.r0();
                c8o.l(dma1VarR0);
                gfr gfrVar3 = new gfr(z0tVarA1, new t0t(dma1VarR0));
                RxRouter rxRouterP2 = lvqVar.b.p();
                c8o.l(rxRouterP2);
                gfr gfrVar4 = new gfr(new mwm1(new CosmosTransport(new sn0(rxRouterP2, (byte) 26))), lvqVar.n(), (lut0) lvqVar.T.get(), (byte) 0);
                j7c0 j7c0VarE = kvm1Var15.E();
                c8o.l(j7c0VarE);
                jqb0 jqb0Var = new jqb0((Object) j7c0VarE, (byte) 4);
                g3t0 g3t0VarF = kvm1Var15.F();
                c8o.l(g3t0VarF);
                jqb0 jqb0Var2 = new jqb0((Object) g3t0VarF, (byte) 10);
                zgz0 zgz0Var = new zgz0(lvqVar.g.get(), (byte) 21);
                wen0 wen0VarL = kvm1Var15.L();
                c8o.l(wen0VarL);
                q940 q940VarS0 = kvm1Var15.s0();
                c8o.l(q940VarS0);
                return (EventSource) ((idd1) new wdm(vqb0Var, d3sVarY, xhpVar, gfrVar2, gfrVar3, gfrVar4, jqb0Var, jqb0Var2, zgz0Var, wen0VarL, new lqr(new jqg0(uwo1.m(q940VarS0.a(new ced0((byte) 6)), sc41.b), puc0.e1), (byte) 4)).Z).getValue();
            case 44:
                return new xhp(this, (byte) 1);
            case 45:
                Context context = lvqVar.b.context();
                c8o.l(context);
                return new xum1(context, xqu.a(lvqVar.T), xqu.a(lvqVar.U), xqu.a(lvqVar.f));
            case 46:
                lut0 lut0VarU = lvqVar.b.u();
                c8o.l(lut0VarU);
                return lut0VarU;
            case 47:
                qut0 qut0VarM = lvqVar.b.M();
                c8o.l(qut0VarM);
                return qut0VarM;
            case 48:
                rvm1 rvm1Var7 = lvqVar.a;
                tsq tsqVar14 = lvqVar.c0;
                tsq tsqVar15 = lvqVar.d0;
                if (rvm1Var7.e) {
                    tsqVar14 = tsqVar15;
                }
                return (aim0) tsqVar14.get();
            case 49:
                fab0 fab0VarF = lvqVar.f();
                ab20 ab20Var = (ab20) lvqVar.b0.get();
                td41 td41Var2 = (td41) lvqVar.n.get();
                g3t0 g3t0VarF2 = lvqVar.b.F();
                c8o.l(g3t0VarF2);
                return new to31(fab0VarF, ab20Var, td41Var2, g3t0VarF2, lvqVar.n(), lvqVar.a, (byte) 0);
            case 50:
                return new ab20((w0t) lvqVar.Z.get(), (String) lvqVar.l.get(), (s4b1) lvqVar.m.get(), (String) lvqVar.a0.get());
            case 51:
                kvm1 kvm1Var16 = lvqVar.b;
                kvm1 kvm1Var17 = lvqVar.b;
                a820 a820VarV = kvm1Var16.v();
                c8o.l(a820VarV);
                Context context2 = kvm1Var17.context();
                c8o.l(context2);
                ut71 ut71VarY7 = kvm1Var17.y();
                c8o.l(ut71VarY7);
                String str6 = (String) lvqVar.l.get();
                z0t z0tVarA2 = kvm1Var17.a0();
                c8o.l(z0tVarA2);
                return new w0t(a820VarV, context2, ut71VarY7, str6, z0tVarA2);
            case 52:
                return lvqVar.a.d;
            case 53:
                fab0 fab0VarF2 = lvqVar.f();
                td41 td41Var3 = (td41) lvqVar.n.get();
                g3t0 g3t0VarF3 = lvqVar.b.F();
                c8o.l(g3t0VarF3);
                return new to31(fab0VarF2, td41Var3, g3t0VarF3, (ab20) lvqVar.b0.get(), lvqVar.n(), lvqVar.a);
            case 54:
                return new i230((ab20) lvqVar.b0.get(), (td41) lvqVar.n.get(), (byte) 1);
            case 55:
                return g2h.d;
            case 56:
                kvm1 kvm1Var18 = lvqVar.b;
                kvm1 kvm1Var19 = lvqVar.b;
                pe peVarH = kvm1Var18.h();
                c8o.l(peVarH);
                ley leyVar = (ley) lvqVar.k0.get();
                c1t c1tVar = (c1t) lvqVar.e.get();
                h380 h380VarB = j380.b(14);
                lik1 lik1Var = (lik1) lvqVar.K.get();
                yhm yhmVarA0 = kvm1Var19.A0();
                c8o.l(yhmVarA0);
                luk lukVarK = kvm1Var19.k();
                c8o.l(lukVarK);
                h380VarB.e(rsi0.c, new gjq0(lik1Var, yhmVarA0, new g95(false, lukVarK), (byte) 0));
                lik1 lik1Var2 = (lik1) lvqVar.K.get();
                js6 js6VarJ0 = kvm1Var19.J0();
                c8o.l(js6VarJ0);
                mfm mfmVar = (mfm) lvqVar.l0.get();
                yhm yhmVarA1 = kvm1Var19.A0();
                c8o.l(yhmVarA1);
                em6 em6VarD0 = kvm1Var19.D0();
                c8o.l(em6VarD0);
                h380VarB.e(rsi0.g, new hjq0(lik1Var2, js6VarJ0, mfmVar, yhmVarA1, em6VarD0));
                h380VarB.e(rsi0.a, lvqVar.j());
                lik1 lik1Var3 = (lik1) lvqVar.K.get();
                yhm yhmVarA2 = kvm1Var19.A0();
                c8o.l(yhmVarA2);
                h380VarB.e(rsi0.O0, new ijq0(lik1Var3, yhmVarA2, b3));
                lik1 lik1Var4 = (lik1) lvqVar.K.get();
                yhm yhmVarA3 = kvm1Var19.A0();
                c8o.l(yhmVarA3);
                h380VarB.e(rsi0.h, new ijq0(lik1Var4, yhmVarA3, b4));
                h380VarB.e(rsi0.f, lvqVar.j());
                lik1 lik1Var5 = (lik1) lvqVar.K.get();
                zpk zpkVarE0 = kvm1Var19.E0();
                c8o.l(zpkVarE0);
                h380VarB.e(rsi0.d, new gjq0(lik1Var5, zpkVarE0, (mfm) lvqVar.l0.get(), (byte) 1));
                lik1 lik1Var6 = (lik1) lvqVar.K.get();
                boolean zBooleanValue = ((Boolean) lvqVar.i0.get()).booleanValue();
                mfm mfmVar2 = (mfm) lvqVar.l0.get();
                fza fzaVar = new fza((byte) 25);
                hmu0 hmu0VarI0 = kvm1Var19.I0();
                c8o.l(hmu0VarI0);
                h380VarB.e(rsi0.i, new kjq0(lik1Var6, zBooleanValue, mfmVar2, fzaVar, hmu0VarI0));
                h380VarB.e(rsi0.Z, lvqVar.i());
                lik1 lik1Var7 = (lik1) lvqVar.K.get();
                boolean zBooleanValue2 = ((Boolean) lvqVar.i0.get()).booleanValue();
                yhm yhmVarA4 = kvm1Var19.A0();
                c8o.l(yhmVarA4);
                h380VarB.e(rsi0.N0, new qjq0(lik1Var7, zBooleanValue2, yhmVarA4));
                lik1 lik1Var8 = (lik1) lvqVar.K.get();
                yhm yhmVarA5 = kvm1Var19.A0();
                c8o.l(yhmVarA5);
                lik1 lik1Var9 = (lik1) lvqVar.K.get();
                npm1 npm1VarN0 = kvm1Var19.N0();
                c8o.l(npm1VarN0);
                ywc0 ywc0VarU0 = kvm1Var19.u0();
                c8o.l(ywc0VarU0);
                q8n q8nVarG3 = kvm1Var19.g();
                c8o.l(q8nVarG3);
                r0s0 r0s0Var = new r0s0(lik1Var9, npm1VarN0, ywc0VarU0, q8nVarG3);
                i4q i4qVarH0 = kvm1Var19.H0();
                c8o.l(i4qVarH0);
                boolean zH0 = kvm1Var19.h0();
                egh1 egh1VarK0 = kvm1Var19.K0();
                c8o.l(egh1VarK0);
                kl1 kl1Var = new kl1(lik1Var8, yhmVarA5, r0s0Var, i4qVarH0, zH0, egh1VarK0);
                lik1 lik1Var10 = (lik1) lvqVar.K.get();
                wqg wqgVarL0 = kvm1Var19.L0();
                c8o.l(wqgVarL0);
                boolean zBooleanValue3 = ((Boolean) lvqVar.i0.get()).booleanValue();
                yhm yhmVarA6 = kvm1Var19.A0();
                c8o.l(yhmVarA6);
                ipg ipgVar = new ipg(lik1Var10, wqgVarL0, zBooleanValue3, yhmVarA6);
                agc0 agc0VarM = kvm1Var19.m();
                c8o.l(agc0VarM);
                jcc0 jcc0Var = new jcc0(agc0VarM, lvqVar.i());
                lik1 lik1Var11 = (lik1) lvqVar.K.get();
                eqm1 eqm1VarM0 = kvm1Var19.M0();
                c8o.l(eqm1VarM0);
                xrm1 xrm1VarG0 = kvm1Var19.G0();
                c8o.l(xrm1VarG0);
                boolean zBooleanValue4 = ((Boolean) lvqVar.i0.get()).booleanValue();
                i4q i4qVarH1 = kvm1Var19.H0();
                c8o.l(i4qVarH1);
                spm1 spm1Var = new spm1(lik1Var11, eqm1VarM0, xrm1VarG0, zBooleanValue4, i4qVarH1);
                lik1 lik1Var12 = (lik1) lvqVar.K.get();
                boolean zBooleanValue5 = ((Boolean) lvqVar.i0.get()).booleanValue();
                yhm yhmVarA7 = kvm1Var19.A0();
                c8o.l(yhmVarA7);
                ipg ipgVar2 = new ipg(lik1Var12, zBooleanValue5, yhmVarA7);
                z0t z0tVarA3 = kvm1Var19.a0();
                c8o.l(z0tVarA3);
                h380VarB.e(rsi0.X, new ijq0(kl1Var, bol1.g(ipgVar, jcc0Var, spm1Var, ipgVar2, z0tVarA3), (byte) 3));
                lik1 lik1Var13 = (lik1) lvqVar.K.get();
                boolean zBooleanValue6 = ((Boolean) lvqVar.i0.get()).booleanValue();
                mfm mfmVar3 = (mfm) lvqVar.l0.get();
                q2w0 q2w0VarF0 = kvm1Var19.F0();
                c8o.l(q2w0VarF0);
                h380VarB.e(rsi0.Y, new kjq0(lik1Var13, zBooleanValue6, mfmVar3, q2w0VarF0));
                h380VarB.e(rsi0.b, lvqVar.j());
                lik1 lik1Var14 = (lik1) lvqVar.K.get();
                yhm yhmVarA8 = kvm1Var19.A0();
                c8o.l(yhmVarA8);
                h380VarB.e(rsi0.e, new ijq0(lik1Var14, yhmVarA8, (byte) 2));
                p5 p5Var = new p5(new uds(h380VarB.b(true)), (byte) 19);
                hzs hzsVar = (hzs) lvqVar.m0.get();
                t381 t381Var = (t381) lvqVar.n0.get();
                yqg yqgVarA3 = kvm1Var19.a();
                c8o.l(yqgVarA3);
                gw70 gw70VarB = kvm1Var19.b();
                c8o.l(gw70VarB);
                dpy dpyVar = (dpy) lvqVar.o0.get();
                sw9 sw9VarE = lvqVar.e();
                hzs hzsVar2 = (hzs) lvqVar.m0.get();
                lqr lqrVar = new lqr(lvqVar.e(), (byte) 12);
                h380 h380VarB2 = j380.b(15);
                h380VarB2.e(fzy.i, new h6c0((yhp) lvqVar.p0.get(), (byte) 1));
                h380VarB2.e(fzy.X, new h6c0((zhp) lvqVar.q0.get(), (byte) 0));
                h380VarB2.e(fzy.c, lvqVar.k());
                h380VarB2.e(fzy.t, lvqVar.l());
                h380VarB2.e(fzy.d, new h6c0((cip) lvqVar.u0.get(), (byte) 2));
                h380VarB2.e(fzy.e, new h6c0((dip) lvqVar.v0.get(), (byte) 3));
                h380VarB2.e(fzy.f, new h6c0((eip) lvqVar.w0.get(), (byte) 4));
                h380VarB2.e(fzy.Y, new h6c0((ohp) lvqVar.x0.get(), (byte) 5));
                byte b6 = 0;
                h380VarB2.e(fzy.g, new wum1((ley) lvqVar.k0.get(), new cx0((byte) 10), b6));
                h380VarB2.e(fzy.b, new wum1((ley) lvqVar.k0.get(), new cx0((byte) 10), b6));
                byte b7 = 1;
                h380VarB2.e(fzy.N0, new wum1((ley) lvqVar.k0.get(), new br0(lvqVar.n()), b7));
                h380VarB2.e(fzy.h, new wum1((ley) lvqVar.k0.get(), new br0(lvqVar.n()), b7));
                h380VarB2.e(fzy.Z, new h6c0((php) lvqVar.y0.get(), (byte) 6));
                h380VarB2.e(fzy.O0, new h6c0(new nu((byte) 8), (byte) 7));
                h380VarB2.e(fzy.P0, new h6c0((qhp) lvqVar.z0.get(), (byte) 8));
                tvb0 tvb0Var = new tvb0(dpyVar, sw9VarE, hzsVar2, lqrVar, h380VarB2.b(true));
                oqp0 oqp0Var = (oqp0) lvqVar.A0.get();
                Context context3 = kvm1Var19.context();
                c8o.l(context3);
                dn3 dn3Var = new dn3(context3, false);
                q8n q8nVarD5 = kvm1Var19.d();
                c8o.l(q8nVarD5);
                tm tmVar = new tm(new k9r(oqp0Var, dn3Var, q8nVarD5, (byte) 15), lvqVar.d);
                Context context4 = kvm1Var19.context();
                c8o.l(context4);
                xna0 xna0VarN0 = kvm1Var19.n0();
                c8o.l(xna0VarN0);
                ena0 ena0VarV = kvm1Var19.V();
                c8o.l(ena0VarV);
                lhc lhcVar = new lhc(context4, xna0VarN0, ena0VarV);
                p40 p40Var = new p40((byte) 5);
                Context context5 = kvm1Var19.context();
                c8o.l(context5);
                ejs ejsVar = new ejs(context5);
                z0t z0tVarA4 = kvm1Var19.a0();
                c8o.l(z0tVarA4);
                l6s l6sVar = new l6s(false, z0tVarA4, new hur((f6c0) lvqVar.B0.get(), (rhp) lvqVar.E0.get(), (byte) 20), (gvq) lvqVar.F0.get());
                aum1 aum1Var = (aum1) lvqVar.G0.get();
                mes mesVar = (mes) lvqVar.H0.get();
                z0t z0tVarA5 = kvm1Var19.a0();
                c8o.l(z0tVarA5);
                return new n1t(peVarH, leyVar, c1tVar, p5Var, hzsVar, t381Var, new g1t(yqgVarA3, gw70VarB, tvb0Var, tmVar, lhcVar, p40Var, ejsVar, l6sVar, aum1Var, mesVar, z0tVarA5, (hvq) lvqVar.I0.get(), lvqVar.J0), new ffr(lvqVar.O0.get(), (Object) new p5(lvqVar.n(), (byte) 25), (Object) lvqVar.n(), (byte) 0), (ivq) lvqVar.P0.get(), (uhp) lvqVar.Q0.get(), (jvq) lvqVar.R0.get(), (mes) lvqVar.H0.get());
            case 57:
                Activity activityS8 = lvqVar.b.s();
                c8o.l(activityS8);
                zwm1 zwm1VarX = lvqVar.b.x();
                c8o.l(zwm1VarX);
                ((Boolean) lvqVar.i0.get()).getClass();
                return new ley(activityS8, zwm1VarX, ((Boolean) lvqVar.j0.get()).booleanValue(), lvqVar.n(), new xgy(j380.l(aey.Z, new ubk())));
            case 58:
                return Boolean.TRUE;
            case 59:
                rxj0 rxj0VarD = lvqVar.b.D();
                c8o.l(rxj0VarD);
                return Boolean.valueOf(rxj0VarD.c);
            case 60:
                i4q i4qVarH2 = lvqVar.b.H0();
                c8o.l(i4qVarH2);
                return i4qVarH2.a((lik1) lvqVar.K.get());
            case 61:
                Scheduler schedulerG7 = lvqVar.b.G();
                c8o.l(schedulerG7);
                return new hzs(schedulerG7);
            case 62:
                ez01 ez01VarT0 = lvqVar.b.t0();
                c8o.l(ez01VarT0);
                return new t381(ez01VarT0);
            case 63:
                return new dpy((ley) lvqVar.k0.get());
            case 64:
                return new yhp((byte) 1);
            case 65:
                return new zhp(this, (byte) 1);
            case 66:
                Activity activityS9 = lvqVar.b.s();
                c8o.l(activityS9);
                ltm1 ltm1VarE0 = lvqVar.b.e0();
                c8o.l(ltm1VarE0);
                return new g37(activityS9, ltm1VarE0);
            case 67:
                return new aip(this, (byte) 1);
            case 68:
                return new bip(this, (byte) 1);
            case 69:
                return new cip(this, (byte) 1);
            case 70:
                return new dip(this, (byte) 1);
            case 71:
                return new eip((byte) 1);
            case 72:
                return new ohp(this, (byte) 1);
            case 73:
                return new php(this, (byte) 1);
            case 74:
                return new qhp((byte) 1);
            case 75:
                CallbackRouter callbackRouterC = lvqVar.b.C();
                c8o.l(callbackRouterC);
                return new oqp0(new CosmosCoroutineTransport(new q7v0(callbackRouterC, (byte) 10)));
            case 76:
                zwp0 zwp0Var = new zwp0();
                z0t z0tVarA6 = lvqVar.b.a0();
                c8o.l(z0tVarA6);
                return new gqo(zwp0Var, z0tVarA6);
            case 77:
                return new rhp(this, (byte) 1);
            case 78:
                return new we20(lvqVar.a());
            case 79:
                return new shp((byte) 1);
            case 80:
                return new gvq(this);
            case 81:
                bum1 bum1Var = lvqVar.c;
                switch (bum1Var.a) {
                    case 0:
                        e690Var = (e690) bum1Var.c.get();
                        break;
                    case 1:
                        e690Var = (e690) bum1Var.c.get();
                        break;
                    default:
                        e690Var = (e690) bum1Var.c.get();
                        break;
                }
                c8o.l(e690Var);
                return new aum1(e690Var);
            case 82:
                return new mes();
            case 83:
                return new hvq(this);
            case 84:
                return new qns(lvqVar.c());
            case 85:
                z0t z0tVarA7 = lvqVar.b.a0();
                c8o.l(z0tVarA7);
                return new u5s(new wo31(z0tVarA7, new gqb0((ng51) lvqVar.K0.get(), (byte) 16)), (tg51) lvqVar.N0.get());
            case 86:
                lvqVar.getClass();
                h380 h380VarB3 = j380.b(6);
                h380VarB3.e(mg51.AlsoAvailableOffline, new h81(b2));
                h380VarB3.e(mg51.AddArtist, new h81(b3));
                h380VarB3.e(mg51.AddPodcast, new h81(b4));
                h380VarB3.e(mg51.EventsHubNavigation, new h81(b));
                h380VarB3.e(mg51.ImportMusic, new z380(lvqVar.n(), b3));
                h380VarB3.e(mg51.SavedContentByArtist, new z380(lvqVar.n(), b4));
                return new ng51(h380VarB3.b(true));
            case 87:
                rvm1 rvm1Var8 = lvqVar.a;
                tsq tsqVar16 = lvqVar.L0;
                tsq tsqVar17 = lvqVar.M0;
                if (rvm1Var8.e) {
                    tsqVar16 = tsqVar17;
                }
                return (tg51) tsqVar16.get();
            case 88:
                return new vo31((ng51) lvqVar.K0.get(), lvqVar.g(), b3);
            case 89:
                return new vo31((ng51) lvqVar.K0.get(), lvqVar.g(), b4);
            case 90:
                return new ivq(this);
            case 91:
                return new uhp((byte) 1);
            case 92:
                return new jvq(this);
            case 93:
                return new kvq(this);
            case 94:
                return new whp(this, b4);
            case 95:
                jly0 jly0Var = lvqVar.K;
                kvm1 kvm1Var20 = lvqVar.b;
                lik1 lik1Var15 = (lik1) jly0Var.get();
                Activity activityS10 = kvm1Var20.s();
                c8o.l(activityS10);
                lzn0 lzn0VarC = kvm1Var20.c();
                c8o.l(lzn0VarC);
                s4b1 s4b1Var = (s4b1) lvqVar.m.get();
                an3 an3VarL0 = kvm1Var20.l0();
                c8o.l(an3VarL0);
                jpn jpnVarJ0 = kvm1Var20.j0();
                c8o.l(jpnVarJ0);
                evm1 evm1VarN2 = lvqVar.n();
                zwz0 zwz0VarW = kvm1Var20.w();
                c8o.l(zwz0VarW);
                return new tun0(lik1Var15, activityS10, lzn0VarC, s4b1Var, an3VarL0, jpnVarJ0, evm1VarN2, zwz0VarW);
            default:
                jah.e(b5);
                return null;
        }
    }

    private final Object u() {
        ovq ovqVar = (ovq) this.c;
        byte b = 2;
        byte b2 = 1;
        byte b3 = this.b;
        switch (b3) {
            case 0:
                return new juc((c8m0) ovqVar.t.get(), (aim0) ovqVar.u.get(), gco0.a, iuc.c, g2h.c, new a0m((byte) 25));
            case 1:
                ky41 ky41Var = (ky41) ovqVar.n.get();
                EventSource eventSource = (EventSource) ovqVar.s.get();
                Scheduler schedulerG = ovqVar.b.G();
                c8o.l(schedulerG);
                return new iwm1(ky41Var, eventSource, schedulerG);
            case 2:
                jly0 jly0Var = ovqVar.e;
                xvm1 xvm1Var = ovqVar.b;
                jzs0 jzs0Var = (jzs0) jly0Var.get();
                gn01 gn01Var = (gn01) ovqVar.g.get();
                q2u q2uVar = (q2u) ovqVar.l.get();
                Scheduler schedulerY0 = xvm1Var.y0();
                c8o.l(schedulerY0);
                rwu0 rwu0VarI = xvm1Var.I();
                c8o.l(rwu0VarI);
                myq0 myq0Var = new myq0(ssc0.s(rwu0VarI, (iac0) ovqVar.m.get(), ovqVar.i()));
                RxRouter rxRouterP = xvm1Var.p();
                c8o.l(rxRouterP);
                mwm1 mwm1Var = new mwm1(new CosmosTransport(new sn0(rxRouterP, (byte) 26)));
                ak20 ak20Var = ak20.N0;
                xpr xprVar = new xpr();
                a130 a130Var = new a130((byte) 2);
                z0t z0tVarA0 = xvm1Var.a0();
                c8o.l(z0tVarA0);
                d1t d1tVar = new d1t(ak20Var, xprVar, a130Var, z0tVarA0);
                byte b4 = 1;
                g2z g2zVar = new g2z(schedulerY0, myq0Var, new go31(new cik1(mwm1Var, d1tVar, new ado0(b4), ovqVar.i(), (byte) 14), new fo31(ovqVar.i(), b4), (byte) 2));
                Scheduler schedulerD0 = xvm1Var.d0();
                c8o.l(schedulerD0);
                return new ny41(jzs0Var, gn01Var, q2uVar, g2zVar, schedulerD0);
            case 3:
                zxm1 zxm1VarZ = ovqVar.b.z();
                c8o.l(zxm1VarZ);
                return new jzs0(zxm1VarZ);
            case 4:
                xvm1 xvm1Var2 = ovqVar.b;
                xvm1 xvm1Var3 = ovqVar.b;
                Context context = xvm1Var2.context();
                c8o.l(context);
                Context applicationContext = context.getApplicationContext();
                ut71 ut71VarY = xvm1Var3.y();
                c8o.l(ut71VarY);
                String str = (String) ovqVar.f.get();
                Scheduler schedulerY1 = xvm1Var3.y0();
                c8o.l(schedulerY1);
                return new gn01(applicationContext, ut71VarY, str, schedulerY1);
            case 5:
                String str2 = ovqVar.a.a;
                c8o.m(str2);
                return str2;
            case 6:
                Activity activityS = ovqVar.b.s();
                c8o.l(activityS);
                return new q2u(activityS, new sgz(ovqVar.h, (usr0) ovqVar.j.get()), ovqVar.b());
            case 7:
                return u1n0.z(ovqVar.c);
            case 8:
                return new tgz((zvm1) ovqVar.i.get(), (byte) 1);
            case 9:
                return new zvm1();
            case 10:
                upp0 upp0VarT = ovqVar.b.t();
                c8o.l(upp0VarT);
                return upp0VarT;
            case 11:
                iac0 iac0Var = ovqVar.c.d.c;
                c8o.m(iac0Var);
                return iac0Var;
            case 12:
                xhp xhpVar = (xhp) ovqVar.r.get();
                jqb0 jqb0Var = new jqb0(ovqVar.g.get(), (byte) 13);
                q940 q940VarS0 = ovqVar.b.s0();
                c8o.l(q940VarS0);
                return (EventSource) new idd1(new hml1(xhpVar, jqb0Var, new lqr(new jqg0(uwo1.m(q940VarS0.a(new ced0((byte) 6)), sc41.b), puc0.e1), (byte) 4), (byte) 6)).getValue();
            case 13:
                return new xhp(this, (byte) 2);
            case 14:
                Context context2 = ovqVar.b.context();
                c8o.l(context2);
                return new xum1(context2, xqu.a(ovqVar.o), xqu.a(ovqVar.f36p), xqu.a(ovqVar.k));
            case 15:
                lut0 lut0VarU = ovqVar.b.u();
                c8o.l(lut0VarU);
                return lut0VarU;
            case 16:
                qut0 qut0VarM = ovqVar.b.M();
                c8o.l(qut0VarM);
                return qut0VarM;
            case 17:
                xvm1 xvm1Var4 = ovqVar.b;
                zwm1 zwm1VarX = xvm1Var4.x();
                c8o.l(zwm1VarX);
                String strC = zwm1VarX.c();
                zwm1 zwm1VarX2 = xvm1Var4.x();
                c8o.l(zwm1VarX2);
                String strH = zwm1VarX2.h();
                zwm1 zwm1VarX3 = xvm1Var4.x();
                c8o.l(zwm1VarX3);
                String strD = zwm1VarX3.d();
                c8o.l((xna0) xvm1Var4.b.get());
                return new kwm1(new fab0(strC, strD, 32, strH), ovqVar.i());
            case 18:
                xvm1 xvm1Var5 = ovqVar.b;
                xvm1 xvm1Var6 = ovqVar.b;
                pe peVar = (pe) xvm1Var5.c.get();
                c8o.l(peVar);
                ley leyVar = (ley) ovqVar.y.get();
                c1t c1tVar = (c1t) ovqVar.z.get();
                h380 h380VarB = j380.b(14);
                lik1 lik1Var = (lik1) ovqVar.A.get();
                yhm yhmVarA0 = xvm1Var6.A0();
                c8o.l(yhmVarA0);
                luk lukVarK = xvm1Var6.k();
                c8o.l(lukVarK);
                h380VarB.e(rsi0.c, new gjq0(lik1Var, yhmVarA0, new g95(false, lukVarK), (byte) 0));
                lik1 lik1Var2 = (lik1) ovqVar.A.get();
                js6 js6VarJ0 = xvm1Var6.J0();
                c8o.l(js6VarJ0);
                mfm mfmVar = (mfm) ovqVar.B.get();
                yhm yhmVarA1 = xvm1Var6.A0();
                c8o.l(yhmVarA1);
                em6 em6VarD0 = xvm1Var6.D0();
                c8o.l(em6VarD0);
                h380VarB.e(rsi0.g, new hjq0(lik1Var2, js6VarJ0, mfmVar, yhmVarA1, em6VarD0));
                h380VarB.e(rsi0.a, ovqVar.f());
                lik1 lik1Var3 = (lik1) ovqVar.A.get();
                yhm yhmVarA2 = xvm1Var6.A0();
                c8o.l(yhmVarA2);
                h380VarB.e(rsi0.O0, new ijq0(lik1Var3, yhmVarA2, (byte) 0));
                lik1 lik1Var4 = (lik1) ovqVar.A.get();
                yhm yhmVarA3 = xvm1Var6.A0();
                c8o.l(yhmVarA3);
                h380VarB.e(rsi0.h, new ijq0(lik1Var4, yhmVarA3, b2));
                h380VarB.e(rsi0.f, ovqVar.f());
                lik1 lik1Var5 = (lik1) ovqVar.A.get();
                zpk zpkVarE0 = xvm1Var6.E0();
                c8o.l(zpkVarE0);
                h380VarB.e(rsi0.d, new gjq0(lik1Var5, zpkVarE0, (mfm) ovqVar.B.get(), (byte) 1));
                lik1 lik1Var6 = (lik1) ovqVar.A.get();
                boolean zBooleanValue = ((Boolean) ovqVar.w.get()).booleanValue();
                mfm mfmVar2 = (mfm) ovqVar.B.get();
                fza fzaVar = new fza((byte) 25);
                hmu0 hmu0VarI0 = xvm1Var6.I0();
                c8o.l(hmu0VarI0);
                h380VarB.e(rsi0.i, new kjq0(lik1Var6, zBooleanValue, mfmVar2, fzaVar, hmu0VarI0));
                h380VarB.e(rsi0.Z, ovqVar.e());
                lik1 lik1Var7 = (lik1) ovqVar.A.get();
                boolean zBooleanValue2 = ((Boolean) ovqVar.w.get()).booleanValue();
                yhm yhmVarA4 = xvm1Var6.A0();
                c8o.l(yhmVarA4);
                h380VarB.e(rsi0.N0, new qjq0(lik1Var7, zBooleanValue2, yhmVarA4));
                lik1 lik1Var8 = (lik1) ovqVar.A.get();
                yhm yhmVarA5 = xvm1Var6.A0();
                c8o.l(yhmVarA5);
                lik1 lik1Var9 = (lik1) ovqVar.A.get();
                npm1 npm1VarN0 = xvm1Var6.N0();
                c8o.l(npm1VarN0);
                ywc0 ywc0VarU0 = xvm1Var6.u0();
                c8o.l(ywc0VarU0);
                q8n q8nVarG = xvm1Var6.g();
                c8o.l(q8nVarG);
                r0s0 r0s0Var = new r0s0(lik1Var9, npm1VarN0, ywc0VarU0, q8nVarG);
                i4q i4qVarH0 = xvm1Var6.H0();
                c8o.l(i4qVarH0);
                boolean zH0 = xvm1Var6.h0();
                egh1 egh1VarK0 = xvm1Var6.K0();
                c8o.l(egh1VarK0);
                kl1 kl1Var = new kl1(lik1Var8, yhmVarA5, r0s0Var, i4qVarH0, zH0, egh1VarK0);
                lik1 lik1Var10 = (lik1) ovqVar.A.get();
                wqg wqgVarL0 = xvm1Var6.L0();
                c8o.l(wqgVarL0);
                boolean zBooleanValue3 = ((Boolean) ovqVar.w.get()).booleanValue();
                yhm yhmVarA6 = xvm1Var6.A0();
                c8o.l(yhmVarA6);
                ipg ipgVar = new ipg(lik1Var10, wqgVarL0, zBooleanValue3, yhmVarA6);
                agc0 agc0VarM = xvm1Var6.m();
                c8o.l(agc0VarM);
                jcc0 jcc0Var = new jcc0(agc0VarM, ovqVar.e());
                lik1 lik1Var11 = (lik1) ovqVar.A.get();
                eqm1 eqm1VarM0 = xvm1Var6.M0();
                c8o.l(eqm1VarM0);
                xrm1 xrm1VarG0 = xvm1Var6.G0();
                c8o.l(xrm1VarG0);
                boolean zBooleanValue4 = ((Boolean) ovqVar.w.get()).booleanValue();
                i4q i4qVarH1 = xvm1Var6.H0();
                c8o.l(i4qVarH1);
                spm1 spm1Var = new spm1(lik1Var11, eqm1VarM0, xrm1VarG0, zBooleanValue4, i4qVarH1);
                lik1 lik1Var12 = (lik1) ovqVar.A.get();
                boolean zBooleanValue5 = ((Boolean) ovqVar.w.get()).booleanValue();
                yhm yhmVarA7 = xvm1Var6.A0();
                c8o.l(yhmVarA7);
                ipg ipgVar2 = new ipg(lik1Var12, zBooleanValue5, yhmVarA7);
                z0t z0tVarA1 = xvm1Var6.a0();
                c8o.l(z0tVarA1);
                List listG = bol1.g(ipgVar, jcc0Var, spm1Var, ipgVar2, z0tVarA1);
                byte b5 = 3;
                h380VarB.e(rsi0.X, new ijq0(kl1Var, listG, b5));
                lik1 lik1Var13 = (lik1) ovqVar.A.get();
                boolean zBooleanValue6 = ((Boolean) ovqVar.w.get()).booleanValue();
                mfm mfmVar3 = (mfm) ovqVar.B.get();
                q2w0 q2w0VarF0 = xvm1Var6.F0();
                c8o.l(q2w0VarF0);
                h380VarB.e(rsi0.Y, new kjq0(lik1Var13, zBooleanValue6, mfmVar3, q2w0VarF0));
                h380VarB.e(rsi0.b, ovqVar.f());
                lik1 lik1Var14 = (lik1) ovqVar.A.get();
                yhm yhmVarA8 = xvm1Var6.A0();
                c8o.l(yhmVarA8);
                h380VarB.e(rsi0.e, new ijq0(lik1Var14, yhmVarA8, (byte) 2));
                p5 p5Var = new p5(new uds(h380VarB.b(true)), (byte) 19);
                hzs hzsVar = (hzs) ovqVar.C.get();
                gw70 gw70VarB = xvm1Var6.b();
                c8o.l(gw70VarB);
                dpy dpyVar = (dpy) ovqVar.D.get();
                sw9 sw9VarC = ovqVar.c();
                hzs hzsVar2 = (hzs) ovqVar.C.get();
                lqr lqrVar = new lqr(ovqVar.c(), (byte) 12);
                h380 h380VarB2 = j380.b(15);
                h380VarB2.e(fzy.i, new h6c0((yhp) ovqVar.E.get(), (byte) 1));
                h380VarB2.e(fzy.X, new h6c0((zhp) ovqVar.F.get(), (byte) 0));
                h380VarB2.e(fzy.c, ovqVar.g());
                h380VarB2.e(fzy.t, ovqVar.h());
                h380VarB2.e(fzy.d, new h6c0((cip) ovqVar.K.get(), (byte) 2));
                h380VarB2.e(fzy.e, new h6c0((dip) ovqVar.L.get(), b5));
                h380VarB2.e(fzy.f, new h6c0((eip) ovqVar.M.get(), (byte) 4));
                h380VarB2.e(fzy.Y, new h6c0((ohp) ovqVar.N.get(), (byte) 5));
                byte b6 = 0;
                h380VarB2.e(fzy.g, new wum1((ley) ovqVar.y.get(), new cx0((byte) 10), b6));
                h380VarB2.e(fzy.b, new wum1((ley) ovqVar.y.get(), new cx0((byte) 10), b6));
                byte b7 = 1;
                h380VarB2.e(fzy.N0, new wum1((ley) ovqVar.y.get(), new br0(ovqVar.i()), b7));
                h380VarB2.e(fzy.h, new wum1((ley) ovqVar.y.get(), new br0(ovqVar.i()), b7));
                h380VarB2.e(fzy.Z, new h6c0((php) ovqVar.O.get(), (byte) 6));
                h380VarB2.e(fzy.O0, new h6c0(new nu((byte) 8), (byte) 7));
                h380VarB2.e(fzy.P0, new h6c0((qhp) ovqVar.P.get(), (byte) 8));
                return new v1t(peVar, leyVar, c1tVar, p5Var, hzsVar, new mxr(gw70VarB, new tvb0(dpyVar, sw9VarC, hzsVar2, lqrVar, h380VarB2.b(true)), new p40((byte) 5), (mvq) ovqVar.Q.get()), new p5((u5s) ovqVar.S.get(), (byte) 17));
            case 19:
                Activity activityS2 = ovqVar.b.s();
                c8o.l(activityS2);
                zwm1 zwm1VarX4 = ovqVar.b.x();
                c8o.l(zwm1VarX4);
                ((Boolean) ovqVar.w.get()).getClass();
                return new ley(activityS2, zwm1VarX4, ((Boolean) ovqVar.x.get()).booleanValue(), ovqVar.i(), new xgy(j380.l(aey.Z, new ubk())));
            case 20:
                return Boolean.TRUE;
            case 21:
                rxj0 rxj0VarD = ovqVar.b.D();
                c8o.l(rxj0VarD);
                return Boolean.valueOf(rxj0VarD.c);
            case 22:
                return new c1t();
            case 23:
                lik1 lik1Var15 = nik1.A2;
                c8o.m(lik1Var15);
                return lik1Var15;
            case 24:
                i4q i4qVarH2 = ovqVar.b.H0();
                c8o.l(i4qVarH2);
                return i4qVarH2.a((lik1) ovqVar.A.get());
            case 25:
                Scheduler schedulerG2 = ovqVar.b.G();
                c8o.l(schedulerG2);
                return new hzs(schedulerG2);
            case 26:
                return new dpy((ley) ovqVar.y.get());
            case 27:
                return new yhp((byte) 2);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new zhp(this, (byte) 2);
            case 29:
                Activity activityS3 = ovqVar.b.s();
                c8o.l(activityS3);
                ltm1 ltm1VarE0 = ovqVar.b.e0();
                c8o.l(ltm1VarE0);
                return new g37(activityS3, ltm1VarE0);
            case 30:
                return new aip(this, (byte) 2);
            case 31:
                lwm1 lwm1Var = ovqVar.a;
                Set set = s4b1.f;
                return uic.x(lwm1Var.b);
            case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                return new bip(this, (byte) 2);
            case 33:
                return new cip(this, (byte) 2);
            case YourLibraryRequestHeader.FILL_FOLDERS_FIELD_NUMBER /* 34 */:
                return new dip(this, (byte) 2);
            case 35:
                return new eip((byte) 2);
            case 36:
                return new ohp(this, (byte) 2);
            case 37:
                return new php(this, (byte) 2);
            case Bespoke2026Content.WRAPPED_TWIN_TELEPATHY_FIELD_NUMBER /* 38 */:
                return new qhp((byte) 2);
            case Bespoke2026Content.WRAPPED_TWIN_GIFT_FIELD_NUMBER /* 39 */:
                return new mvq(this);
            case Bespoke2026Content.TIME_MACHINE_2_FIELD_NUMBER /* 40 */:
                return new u5s((ah51) ovqVar.R.get(), r7x.a);
            case Bespoke2026Content.TOP_PLAYLISTS_SINGLE_FIELD_NUMBER /* 41 */:
                Activity activityS4 = ovqVar.b.s();
                c8o.l(activityS4);
                return new l230(activityS4, b2);
            case Bespoke2026Content.INTRO_WELCOME_MESSAGE_V3_FIELD_NUMBER /* 42 */:
                return new nvq(this);
            case 43:
                return new whp(this, b);
            case 44:
                jly0 jly0Var2 = ovqVar.A;
                xvm1 xvm1Var7 = ovqVar.b;
                lik1 lik1Var16 = (lik1) jly0Var2.get();
                Activity activityS5 = xvm1Var7.s();
                c8o.l(activityS5);
                lzn0 lzn0VarC = xvm1Var7.c();
                c8o.l(lzn0VarC);
                s4b1 s4b1Var = (s4b1) ovqVar.H.get();
                an3 an3VarL0 = xvm1Var7.l0();
                c8o.l(an3VarL0);
                jpn jpnVarJ0 = xvm1Var7.j0();
                c8o.l(jpnVarJ0);
                evm1 evm1VarI = ovqVar.i();
                zwz0 zwz0VarW = xvm1Var7.w();
                c8o.l(zwz0VarW);
                return new tun0(lik1Var16, activityS5, lzn0VarC, s4b1Var, an3VarL0, jpnVarJ0, evm1VarI, zwz0VarW);
            case 45:
                xvm1 xvm1Var8 = ovqVar.b;
                xvm1 xvm1Var9 = ovqVar.b;
                q0d0 q0d0VarN = xvm1Var8.N();
                c8o.l(q0d0VarN);
                q8n q8nVar = (q8n) xvm1Var9.a.get();
                c8o.l(q8nVar);
                l27 l27Var = new l27(q8nVar, ovqVar.d());
                q8n q8nVar2 = (q8n) xvm1Var9.a.get();
                c8o.l(q8nVar2);
                rf40 rf40VarA = ovqVar.d.a();
                c8o.l(rf40VarA);
                l27 l27Var2 = new l27(q8nVar2, rf40VarA);
                q8n q8nVar3 = (q8n) xvm1Var9.a.get();
                c8o.l(q8nVar3);
                co9 co9Var = new co9(q8nVar3, (c1t) ovqVar.z.get());
                zns znsVar = (zns) ovqVar.X.get();
                q8n q8nVarG2 = xvm1Var9.g();
                c8o.l(q8nVarG2);
                return yx61.l(q0d0VarN, l27Var, l27Var2, co9Var, t380.p(ux51.y(znsVar, q8nVarG2)));
            case 46:
                return new zns(ovqVar.b());
            default:
                jah.e(b3);
                return null;
        }
    }

    private final Object v() {
        mxm1 mxm1Var = (mxm1) ((byp) this.c).b;
        byte b = this.b;
        switch (b) {
            case 0:
                return pzm.h((mos) mxm1Var.d.get());
            case 1:
                return new pvq(this);
            case 2:
                CallbackRouter callbackRouter = (CallbackRouter) mxm1Var.a.get();
                c8o.l(callbackRouter);
                f6s f6sVar = new f6s(bol1.B(callbackRouter));
                CallbackRouter callbackRouter2 = (CallbackRouter) mxm1Var.a.get();
                c8o.l(callbackRouter2);
                return new euz(f6sVar, bol1.B(callbackRouter2));
            case 3:
                return new qvq(this);
            case 4:
                return new rvq(this);
            case 5:
                return new svq(this);
            case 6:
                return new tvq();
            default:
                jah.e(b);
                return null;
        }
    }

    public final Object get() {
        utf1 i160Var;
        byte b = this.a;
        byte b2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                switch (b2) {
                    case 0:
                        return new lsq(this, (byte) 0);
                    case 1:
                        return new msq(this, (byte) 0);
                    case 2:
                        return new nsq(this, (byte) 0);
                    case 3:
                        vcd0 vcd0Var = (vcd0) ((yxc1) ((wdm) obj).b).e.get();
                        c8o.l(vcd0Var);
                        fns fnsVar = igu.a;
                        b3s b3sVar = b3s.c;
                        return new xb0(vcd0Var);
                    case 4:
                        return new osq(this);
                    case 5:
                        return new psq(this);
                    case 6:
                        return new qsq(this);
                    case 7:
                        return new rsq(this);
                    case 8:
                        return new ssq(this);
                    default:
                        jah.e(b2);
                        return null;
                }
            case 1:
                pbq pbqVar = (pbq) obj;
                ttd1 ttd1Var = (ttd1) pbqVar.b;
                switch (b2) {
                    case 0:
                        xsq xsqVar = (xsq) ((jly0) pbqVar.c).get();
                        d0r d0rVar = (d0r) ((jly0) pbqVar.d).get();
                        tsq tsqVar = (tsq) pbqVar.i;
                        w35 w35VarR = pbqVar.r();
                        gw10 gw10Var = (gw10) ((jly0) pbqVar.h).get();
                        i8h1 i8h1Var = (i8h1) ttd1Var.h.get();
                        c8o.l(i8h1Var);
                        return new xud1(xsqVar, d0rVar, tsqVar, w35VarR, gw10Var, i8h1Var);
                    case 1:
                        return new xsq();
                    case 2:
                        return cwl1.C((q7r0) pbqVar.f);
                    case 3:
                        bi0 bi0Var = (bi0) ttd1Var.a.get();
                        c8o.l(bi0Var);
                        m7o0 m7o0Var = (m7o0) ((jly0) pbqVar.g).get();
                        kt91 kt91Var = (kt91) ttd1Var.g.get();
                        c8o.l(kt91Var);
                        gw10 gw10Var2 = (gw10) ((jly0) pbqVar.h).get();
                        i8h1 i8h1Var2 = (i8h1) ttd1Var.h.get();
                        c8o.l(i8h1Var2);
                        mu10 mu10Var = new mu10(bi0Var, m7o0Var, kt91Var, gw10Var2, i8h1Var2, brt.x());
                        htr htrVar = (htr) ttd1Var.e.get();
                        c8o.l(htrVar);
                        return new zv10(mu10Var, htrVar, (gw10) ((jly0) pbqVar.h).get(), pbqVar.r());
                    case 4:
                        return (m7o0) ((jly0) pbqVar.e).get();
                    case 5:
                        RetrofitMaker retrofitMaker = (RetrofitMaker) ttd1Var.b.get();
                        c8o.l(retrofitMaker);
                        zho0 zho0Var = (zho0) retrofitMaker.createWebgateService(zho0.class, "android-tasteprofile-tasteprofilepage");
                        yqg yqgVar = (yqg) ttd1Var.f.get();
                        c8o.l(yqgVar);
                        return new m7o0(zho0Var, yqgVar);
                    case 6:
                        return new gw10();
                    case 7:
                        RetrofitMaker retrofitMaker2 = (RetrofitMaker) ttd1Var.b.get();
                        c8o.l(retrofitMaker2);
                        return new std1((hud1) retrofitMaker2.createWebgateService(hud1.class, "android-tasteprofile-tasteprofilepage"), (m7o0) ((jly0) pbqVar.g).get());
                    default:
                        jah.e(b2);
                        return null;
                }
            case 2:
                byp bypVar = (byp) obj;
                dle1 dle1Var = (dle1) bypVar.c;
                cle1 cle1Var = (cle1) bypVar.b;
                switch (b2) {
                    case 0:
                        return pzm.h((mos) cle1Var.b.get());
                    case 1:
                        ynb0 ynb0VarA = xqu.a((tsq) bypVar.e);
                        ynb0 ynb0VarA2 = xqu.a((tsq) bypVar.f);
                        v8n0 v8n0Var = (v8n0) cle1Var.d.get();
                        c8o.l(v8n0Var);
                        q8n q8nVar = (q8n) cle1Var.f.get();
                        c8o.l(q8nVar);
                        Set set = s4b1.f;
                        String strZ = uic.B(dle1Var.b).z();
                        jul0 jul0Var = new jul0(strZ != null ? strZ : "");
                        uu00 uu00Var = (uu00) cle1Var.g.get();
                        c8o.l(uu00Var);
                        return new zke1(ynb0VarA, ynb0VarA2, v8n0Var, q8nVar, jul0Var, new yg7(uu00Var), new f70((byte) 17));
                    case 2:
                        los losVar = (los) ((jly0) bypVar.a).get();
                        ynb0 ynb0VarA3 = xqu.a((tsq) bypVar.d);
                        q8n q8nVar2 = (q8n) cle1Var.e.get();
                        c8o.l(q8nVar2);
                        return new qs00(losVar, ynb0VarA3, q8nVar2);
                    case 3:
                        lzn0 lzn0Var = (lzn0) cle1Var.a.get();
                        c8o.l(lzn0Var);
                        return lzn0Var;
                    case 4:
                        los losVar2 = (los) ((jly0) bypVar.a).get();
                        q8n q8nVar3 = (q8n) cle1Var.e.get();
                        c8o.l(q8nVar3);
                        return new pyh1(losVar2, q8nVar3);
                    case 5:
                        ynb0 ynb0VarA4 = xqu.a((tsq) bypVar.h);
                        Set set2 = s4b1.f;
                        String strZ2 = uic.B(dle1Var.b).z();
                        return new ale1(ynb0VarA4, new jul0(strZ2 != null ? strZ2 : ""));
                    case 6:
                        i8h1 i8h1Var3 = (i8h1) cle1Var.h.get();
                        c8o.l(i8h1Var3);
                        return i8h1Var3;
                    default:
                        jah.e(b2);
                        return null;
                }
            case 3:
                goq goqVar = (goq) obj;
                ile1 ile1Var = (ile1) goqVar.c;
                hle1 hle1Var = (hle1) goqVar.g;
                if (b2 == 0) {
                    return pzm.h((mos) hle1Var.c.get());
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        return new fle1(xqu.a((tsq) goqVar.f), ile1Var);
                    }
                    if (b2 == 3) {
                        return u1n0.z((q7r0) goqVar.d);
                    }
                    jah.e(b2);
                    return null;
                }
                Resources resources = (Resources) hle1Var.b.get();
                c8o.l(resources);
                uu00 uu00Var2 = (uu00) hle1Var.d.get();
                c8o.l(uu00Var2);
                rcy rcyVar = new rcy(uu00Var2);
                yzh1 yzh1Var = (yzh1) hle1Var.f.get();
                c8o.l(yzh1Var);
                nke1 nke1Var = (nke1) hle1Var.g.get();
                c8o.l(nke1Var);
                ffe1 ffe1Var = new ffe1(yzh1Var, nke1Var, (byte) 1);
                los losVar3 = (los) ((jly0) goqVar.b).get();
                lzn0 lzn0Var2 = (lzn0) hle1Var.a.get();
                c8o.l(lzn0Var2);
                a0i1 a0i1Var = (a0i1) hle1Var.h.get();
                c8o.l(a0i1Var);
                return new et90(resources, ile1Var, rcyVar, ffe1Var, losVar3, lzn0Var2, a0i1Var);
            case 4:
                goq goqVar2 = (goq) obj;
                ole1 ole1Var = (ole1) goqVar2.c;
                nle1 nle1Var = (nle1) goqVar2.g;
                if (b2 != 0) {
                    if (b2 == 1) {
                        return pzm.h((mos) nle1Var.b.get());
                    }
                    if (b2 == 2) {
                        return new lle1(xqu.a((tsq) goqVar2.f), ole1Var);
                    }
                    if (b2 == 3) {
                        return u1n0.z((q7r0) goqVar2.d);
                    }
                    jah.e(b2);
                    return null;
                }
                Context context = (Context) nle1Var.f.get();
                c8o.l(context);
                yzh1 yzh1Var2 = (yzh1) nle1Var.d.get();
                c8o.l(yzh1Var2);
                nke1 nke1Var2 = (nke1) nle1Var.e.get();
                c8o.l(nke1Var2);
                ffe1 ffe1Var2 = new ffe1(yzh1Var2, nke1Var2, (byte) 1);
                los losVar4 = (los) ((jly0) goqVar2.b).get();
                lzn0 lzn0Var3 = (lzn0) nle1Var.c.get();
                c8o.l(lzn0Var3);
                luk lukVar = (luk) nle1Var.g.get();
                c8o.l(lukVar);
                g05 g05Var = new g05(false, f05.b, lukVar);
                uu00 uu00Var3 = (uu00) nle1Var.h.get();
                c8o.l(uu00Var3);
                q8n q8nVar4 = (q8n) nle1Var.i.get();
                c8o.l(q8nVar4);
                le71 le71Var = new le71(uu00Var3, q8nVar4);
                a0i1 a0i1Var2 = (a0i1) nle1Var.j.get();
                c8o.l(a0i1Var2);
                return new vbe1(context, ffe1Var2, losVar4, lzn0Var3, g05Var, ole1Var, le71Var, a0i1Var2);
            case 5:
                ib3 ib3Var = (ib3) obj;
                switch (b2) {
                    case 0:
                        w470 w470Var = (w470) ((jly0) ib3Var.r).get();
                        ie70 ie70Var = (ie70) ((jly0) ib3Var.s).get();
                        Resources resources2 = (Resources) ((tmf1) ib3Var.a).D.get();
                        c8o.l(resources2);
                        return new tm30(w470Var, ie70Var, resources2);
                    case 1:
                        Activity activity = (Activity) ((tmf1) ib3Var.a).G.get();
                        c8o.l(activity);
                        tmf1 tmf1Var = (tmf1) ib3Var.a;
                        Activity activity2 = (Activity) tmf1Var.G.get();
                        c8o.l(activity2);
                        Context context2 = (Context) tmf1Var.x.get();
                        c8o.l(context2);
                        l7m0 l7m0VarW = mw60.w(context2, (l670) ((jly0) ib3Var.p).get(), ib3Var.h());
                        Resources resources3 = (Resources) tmf1Var.D.get();
                        c8o.l(resources3);
                        sw9 sw9Var = new sw9(activity2, l7m0VarW, td70.a(resources3, ib3Var.h()));
                        fm30 fm30Var = (fm30) ((jly0) ib3Var.q).get();
                        oe70 oe70Var = new oe70(activity, sw9Var);
                        fm30Var.d = true;
                        fm30Var.i(oe70Var.c);
                        fm30Var.i(oe70Var.d);
                        return oe70Var;
                    case 2:
                        tmf1 tmf1Var2 = (tmf1) ib3Var.a;
                        jik1 jik1Var = (nnf1) ib3Var.b;
                        tmf1 tmf1Var3 = (tmf1) ib3Var.a;
                        Activity activity3 = (Activity) tmf1Var2.G.get();
                        c8o.l(activity3);
                        i8h1 i8h1Var4 = (i8h1) ((jly0) ib3Var.d).get();
                        kly0 kly0Var = tmf1Var3.A;
                        kly0 kly0Var2 = tmf1Var3.H;
                        kly0 kly0Var3 = tmf1Var3.y;
                        kly0 kly0Var4 = tmf1Var3.C;
                        lzn0 lzn0Var4 = (lzn0) kly0Var.get();
                        c8o.l(lzn0Var4);
                        in8 in8Var = new in8(lzn0Var4);
                        r630 r630Var = (r630) kly0Var4.get();
                        c8o.l(r630Var);
                        r630 r630Var2 = (r630) kly0Var4.get();
                        c8o.l(r630Var2);
                        da70 da70Var = new da70(r630Var2);
                        fe70 fe70Var = (fe70) ((jly0) ib3Var.e).get();
                        gw70 gw70Var = (gw70) tmf1Var3.c0.get();
                        c8o.l(gw70Var);
                        q770 q770Var = new q770(new mc70(gw70Var, new kcg(new pob((byte) 6, false)), ib3Var.h()), new e570((byte) 0, ib3Var.h()), new z970((fe70) ((jly0) ib3Var.e).get()), new ea70((fe70) ((jly0) ib3Var.e).get(), (byte) 0), new ea70((fe70) ((jly0) ib3Var.e).get(), (byte) 2), new ea70((fe70) ((jly0) ib3Var.e).get(), (byte) 1), new fc70());
                        s770 s770Var = new s770();
                        yqg yqgVar2 = (yqg) kly0Var3.get();
                        c8o.l(yqgVar2);
                        p670 p670Var = new p670(yqgVar2, (byte) 0);
                        fe70 fe70Var2 = (fe70) ((jly0) ib3Var.e).get();
                        j3a j3aVar = (j3a) kly0Var2.get();
                        c8o.l(j3aVar);
                        l770 l770Var = new l770(fe70Var2, j3aVar, (byte) 0);
                        yqg yqgVar3 = (yqg) kly0Var3.get();
                        c8o.l(yqgVar3);
                        p670 p670Var2 = new p670(yqgVar3, (byte) 1);
                        fe70 fe70Var3 = (fe70) ((jly0) ib3Var.e).get();
                        j3a j3aVar2 = (j3a) kly0Var2.get();
                        c8o.l(j3aVar2);
                        x970 x970Var = new x970(fe70Var, q770Var, new q770(s770Var, p670Var, l770Var, p670Var2, new l770(fe70Var3, j3aVar2, (byte) 1), new w870((fe70) ((jly0) ib3Var.e).get())), new q770(new e570((byte) 1, ib3Var.h()), new h770((byte) 0), new h770((byte) 1), new k770(ib3Var.h()), new i870((fe70) ((jly0) ib3Var.e).get())));
                        c8o.l((u3f1) tmf1Var3.I.get());
                        d4b1 d4b1Var = new d4b1((byte) 4);
                        String str = (String) tmf1Var3.B.get();
                        c8o.l(str);
                        mxa1 mxa1Var = new mxa1((Object) i8h1Var4, (Object) in8Var, (Object) r630Var, (Object) da70Var, (Object) x970Var, (Object) d4b1Var, str, (byte) 2);
                        h380 h380VarB = j380.b(13);
                        jly0 jly0Var = (jly0) ib3Var.f;
                        i160 i160Var2 = (i160) ((jly0) ib3Var.k).get();
                        kly0 kly0Var5 = tmf1Var3.t;
                        kly0 kly0Var6 = tmf1Var3.Y;
                        rsn0 rsn0Var = (rsn0) kly0Var5.get();
                        c8o.l(rsn0Var);
                        gw70 gw70Var2 = (gw70) tmf1Var3.c0.get();
                        c8o.l(gw70Var2);
                        pe peVar = (pe) kly0Var6.get();
                        c8o.l(peVar);
                        h7l1 h7l1Var = new h7l1(gw70Var2, peVar);
                        luk lukVar2 = (luk) tmf1Var3.z.get();
                        c8o.l(lukVar2);
                        j3v j3vVar = new j3v(new x75(false, lukVar2), (byte) 8);
                        woa woaVar = (woa) tmf1Var3.a0.get();
                        c8o.l(woaVar);
                        kma kmaVar = (kma) tmf1Var3.b0.get();
                        c8o.l(kmaVar);
                        fpa fpaVar = (fpa) tmf1Var3.Z.get();
                        c8o.l(fpaVar);
                        pe peVar2 = (pe) kly0Var6.get();
                        c8o.l(peVar2);
                        boolean zBooleanValue = ((Boolean) tmf1Var3.X.get()).booleanValue();
                        zle1 zle1Var = (zle1) tmf1Var3.W.get();
                        c8o.l(zle1Var);
                        h380VarB.e("encore:trackHeader", new xnf1(jly0Var, i160Var2, rsn0Var, new yzu(h7l1Var, j3vVar, new k0t(woaVar, kmaVar, fpaVar, peVar2, zBooleanValue, zle1Var), new zfr(jik1Var))));
                        h380VarB.e("encore:sectionHeading2", new rwd((u0i) ((jly0) ib3Var.l).get(), (byte) 2));
                        h380VarB.e("encore:addToPlaylistButton", new vn1((wn1) ((jly0) ib3Var.m).get()));
                        gw70 gw70Var3 = (gw70) tmf1Var3.c0.get();
                        c8o.l(gw70Var3);
                        h380VarB.e("freetier:entityTopContainer", new v8x(gw70Var3, xqu.a((tsq) ib3Var.n), (byte) 12));
                        gw70 gw70Var4 = (gw70) tmf1Var3.c0.get();
                        c8o.l(gw70Var4);
                        h380VarB.e("freetier:trackEntityTopContainer", new v8x(gw70Var4, xqu.a((tsq) ib3Var.n), (byte) 12));
                        h380VarB.e("freetier:unlockTrackCard", new gjh1((jly0) ib3Var.o));
                        h380VarB.e("freetier:secondaryButton", new om30((byte) 0));
                        h380VarB.e("freetier:tertiaryButton", new om30((byte) 1));
                        h380VarB.e("freetier:tertiaryButtonOutlined", new om30((byte) 2));
                        h380VarB.e("freetier:whitePrimaryButton", new om30((byte) 3));
                        h380VarB.e("button:fixedSizeShuffleButton", new qn20());
                        alf1 alf1Var = (alf1) tmf1Var3.i.get();
                        c8o.l(alf1Var);
                        h380VarB.e("glue2:TrackCloudExperiment", new xed1(alf1Var, (byte) 1));
                        pd80 pd80Var = (pd80) tmf1Var3.u.get();
                        c8o.l(pd80Var);
                        zpg0 zpg0Var = (zpg0) tmf1Var3.v.get();
                        c8o.l(zpg0Var);
                        Scheduler scheduler = (Scheduler) tmf1Var3.E.get();
                        c8o.l(scheduler);
                        h380VarB.e("cmp:inlineCard", new upf1(pd80Var, zpg0Var, jik1Var, scheduler));
                        t570 t570Var = new t570(h380VarB.b(true));
                        vu1 vu1Var = (vu1) tmf1Var3.j.get();
                        c8o.l(vu1Var);
                        xn1 xn1Var = new xn1(vu1Var, (i8h1) ((jly0) ib3Var.d).get());
                        hqo hqoVarF = ib3Var.f();
                        vgm vgmVar = (vgm) tmf1Var3.J.get();
                        c8o.l(vgmVar);
                        ndm ndmVar = new ndm(vgmVar, jik1Var, new hl00(jik1Var, (byte) 13), (i8h1) ((jly0) ib3Var.d).get(), (byte) 0);
                        lzn0 lzn0Var5 = (lzn0) tmf1Var3.A.get();
                        c8o.l(lzn0Var5);
                        k670 k670Var = (k670) mxa1Var.b(activity3, jik1Var).t().r(j380.n("freetier:addToPlaylist", xn1Var, "playFromContext", hqoVarF, "contextMenu", ndmVar, "navigate", new xn1(lzn0Var5, new hl00(jik1Var, (byte) 13), (i8h1) ((jly0) ib3Var.d).get()))).b;
                        k670Var.c(new c670[]{t570Var});
                        k670Var.d(t570Var);
                        return k670Var.a();
                    case 3:
                        return (wnh1) ((jly0) ib3Var.c).get();
                    case 4:
                        c2r0 c2r0Var = (c2r0) ((tmf1) ib3Var.a).S.get();
                        c8o.l(c2r0Var);
                        nnf1 nnf1Var = (nnf1) ib3Var.b;
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        p6r0 p6r0VarF1 = yon1.F1();
                        kik1 kik1Var = nik1.p;
                        String string = nnf1Var.O0().getString("track_uri");
                        return c2r0Var.d(p6r0VarF1, kik1Var.b(string != null ? string : "").a());
                    case 5:
                        tmf1 tmf1Var4 = (tmf1) ib3Var.a;
                        tmf1 tmf1Var5 = (tmf1) ib3Var.a;
                        Activity activity4 = (Activity) tmf1Var4.G.get();
                        c8o.l(activity4);
                        gw70 gw70Var5 = (gw70) tmf1Var5.c0.get();
                        c8o.l(gw70Var5);
                        hl00 hl00Var = new hl00(gw70Var5, (byte) 14);
                        j3a j3aVar3 = (j3a) tmf1Var5.H.get();
                        c8o.l(j3aVar3);
                        return new fe70(activity4, hl00Var, j3aVar3);
                    case 6:
                        xfx xfxVar = (xfx) ((tmf1) ib3Var.a).s.get();
                        c8o.l(xfxVar);
                        ufx ufxVar = xfxVar.d;
                        return new lvs(ufxVar.a, ufxVar.b);
                    case 7:
                        nnf1 nnf1Var2 = (nnf1) ib3Var.b;
                        tmf1 tmf1Var6 = (tmf1) ib3Var.a;
                        String str2 = (String) ((jly0) ib3Var.g).get();
                        String str3 = (String) ((jly0) ib3Var.g).get();
                        String str4 = (String) ((jly0) ib3Var.g).get();
                        tsf1 tsf1Var = (tsf1) tmf1Var6.L.get();
                        c8o.l(tsf1Var);
                        y4q y4qVar = (y4q) tmf1Var6.O.get();
                        c8o.l(y4qVar);
                        bl3 bl3Var = (bl3) tmf1Var6.P.get();
                        c8o.l(bl3Var);
                        wp20 wp20Var = new wp20(str4, tsf1Var, y4qVar, bl3Var, new pm30(((Boolean) tmf1Var6.K.get()).booleanValue()));
                        i4q i4qVar = (i4q) tmf1Var6.M.get();
                        c8o.l(i4qVar);
                        lc20 lc20Var = new lc20(str3, wp20Var, i4qVar, (byte) 4);
                        lzn0 lzn0Var6 = (lzn0) tmf1Var6.A.get();
                        c8o.l(lzn0Var6);
                        hqo hqoVarF2 = ib3Var.f();
                        nnf1 nnf1Var3 = (nnf1) ib3Var.b;
                        p3q p3qVar = (p3q) tmf1Var6.k.get();
                        c8o.l(p3qVar);
                        ywv0 ywv0VarA = p3qVar.a(nnf1Var3.g0());
                        i8h1 i8h1Var5 = (i8h1) ((jly0) ib3Var.d).get();
                        ijr ijrVar = (ijr) tmf1Var6.p.get();
                        c8o.l(ijrVar);
                        oj3 oj3Var = (oj3) tmf1Var6.N.get();
                        c8o.l(oj3Var);
                        jip jipVar = (jip) ((jly0) ib3Var.j).get();
                        luk lukVar3 = (luk) tmf1Var6.z.get();
                        c8o.l(lukVar3);
                        i160Var = new i160(nnf1Var2, str2, lc20Var, lzn0Var6, hqoVarF2, ywv0VarA, i8h1Var5, ijrVar, oj3Var, jipVar, new dg4(false, false, false, lukVar3));
                        break;
                    case 8:
                        return ((nnf1) ib3Var.b).O0().getString("track_uri", "");
                    case 9:
                        t8u0 t8u0Var = (t8u0) ((tmf1) ib3Var.a).q.get();
                        c8o.l(t8u0Var);
                        return t8u0Var.a(((zf30) ((nnf1) ib3Var.b)).s1);
                    case 10:
                        return new jip(this, (byte) 1);
                    case 11:
                        lik1 lik1VarC = d8.c((nnf1) ib3Var.b);
                        String str5 = (String) ((jly0) ib3Var.g).get();
                        nnf1 nnf1Var4 = (nnf1) ib3Var.b;
                        ruz ruzVarA = ((cyp) ((jly0) ib3Var.h).get()).a();
                        b0d0 b0d0Var = (b0d0) ((tmf1) ib3Var.a).d0.get();
                        c8o.l(b0d0Var);
                        huz huzVar = new huz(new g3d0[0], (byte) 9);
                        huz huzVar2 = new huz(new Map[0], (byte) 9);
                        huz huzVar3 = new huz(w7x.a, (byte) 10);
                        huz huzVar4 = new huz(new Map[0], (byte) 9);
                        zpz zpzVarY = EsPlayOrigin.PlayOrigin.y();
                        zpzVarY.s("freetiertrack");
                        zpzVarY.w(lik1VarC.a);
                        return b0d0Var.b(str5, huzVar3, nnf1Var4, ruzVarA, huzVar, zpzVarY.build(), huzVar2, huzVar4);
                    case 12:
                        xfx xfxVar2 = (xfx) ((tmf1) ib3Var.a).s.get();
                        c8o.l(xfxVar2);
                        return new yfx(xfxVar2.e, (byte) 1);
                    case 13:
                        vu1 vu1Var2 = (vu1) ((tmf1) ib3Var.a).j.get();
                        c8o.l(vu1Var2);
                        return new wn1(new xn1(vu1Var2, (i8h1) ((jly0) ib3Var.d).get()));
                    case 14:
                        lzn0 lzn0Var7 = (lzn0) ((tmf1) ib3Var.a).A.get();
                        c8o.l(lzn0Var7);
                        return new bqf1(lzn0Var7, (i8h1) ((jly0) ib3Var.d).get());
                    case 15:
                        xfx xfxVar3 = (xfx) ((tmf1) ib3Var.a).s.get();
                        c8o.l(xfxVar3);
                        Context context3 = xfxVar3.b.a;
                        yb10 yb10Var = eh10.d;
                        if (yb10Var != o810.d) {
                            return yb10Var != yb10.d ? new nzj(context3, fqi.c) : new nzj(context3, fqi.b);
                        }
                        return new nzj(context3, fqi.a);
                    case 16:
                        return new fm30(new vx40((i8h1) ((jly0) ib3Var.d).get(), (nnf1) ib3Var.b, (byte) 14));
                    case 17:
                        return new ie70((l670) ((jly0) ib3Var.p).get(), (w470) ((jly0) ib3Var.r).get());
                    case 18:
                        lzn0 lzn0Var8 = (lzn0) ((tmf1) ib3Var.a).A.get();
                        c8o.l(lzn0Var8);
                        String str6 = d8.c((nnf1) ib3Var.b).a;
                        c8o.m(str6);
                        return new mm30(str6, lzn0Var8);
                    case 19:
                        ie70 ie70Var2 = (ie70) ((jly0) ib3Var.s).get();
                        w470 w470Var2 = (w470) ((jly0) ib3Var.r).get();
                        l670 l670Var = (l670) ((jly0) ib3Var.p).get();
                        v9c v9cVar = new v9c((byte) 11);
                        ie70Var2.getClass();
                        w470Var2.getClass();
                        l670Var.getClass();
                        return v9cVar;
                    case 20:
                        tsq tsqVar2 = (tsq) ib3Var.v;
                        tmf1 tmf1Var7 = (tmf1) ib3Var.a;
                        hny hnyVar = (hny) tmf1Var7.d.get();
                        c8o.l(hnyVar);
                        fey feyVar = new fey(hnyVar, (byte) 13);
                        boolean zBooleanValue2 = ((Boolean) ((jly0) ib3Var.w).get()).booleanValue();
                        RetrofitMaker retrofitMaker3 = (RetrofitMaker) tmf1Var7.c.get();
                        c8o.l(retrofitMaker3);
                        i160Var = new sm30(tsqVar2, feyVar, zBooleanValue2, (rm30) retrofitMaker3.createWebgateService(rm30.class, "android-track-freetiertrack"), (zfp0) ((jly0) ib3Var.B).get());
                        break;
                    case 21:
                        efe0 efe0Var = (efe0) ((tmf1) ib3Var.a).e.get();
                        c8o.l(efe0Var);
                        return efe0Var;
                    case 22:
                        return Boolean.FALSE;
                    case 23:
                        ynb0 ynb0VarA5 = xqu.a((tsq) ib3Var.y);
                        ynb0 ynb0VarA6 = xqu.a((tsq) ib3Var.z);
                        ynb0 ynb0VarA7 = xqu.a((tsq) ib3Var.A);
                        ArrayList arrayList = new ArrayList(10);
                        ObservableTransformer observableTransformer = (ObservableTransformer) ynb0VarA5.get();
                        if (observableTransformer != null) {
                            arrayList.add(observableTransformer);
                        }
                        ObservableTransformer observableTransformer2 = (ObservableTransformer) ynb0VarA6.get();
                        if (observableTransformer2 != null) {
                            arrayList.add(observableTransformer2);
                        }
                        ObservableTransformer observableTransformer3 = (ObservableTransformer) ynb0VarA7.get();
                        if (observableTransformer3 != null) {
                            arrayList.add(observableTransformer3);
                        }
                        return new zfp0(arrayList);
                    case 24:
                        jly0 jly0Var2 = (jly0) ib3Var.g;
                        tmf1 tmf1Var8 = (tmf1) ib3Var.a;
                        String str7 = (String) jly0Var2.get();
                        String str8 = (String) ((jly0) ib3Var.x).get();
                        Activity activity5 = (Activity) tmf1Var8.G.get();
                        c8o.l(activity5);
                        String string2 = activity5.getResources().getString(2131963322);
                        yzc0 yzc0Var = (yzc0) ((jly0) ib3Var.i).get();
                        Flowable flowable = (Flowable) tmf1Var8.r.get();
                        c8o.l(flowable);
                        luk lukVar4 = (luk) tmf1Var8.z.get();
                        c8o.l(lukVar4);
                        dg4 dg4Var = new dg4(false, false, false, lukVar4);
                        g7h g7hVar = (g7h) tmf1Var8.o.get();
                        c8o.l(g7hVar);
                        i160Var = new fip0(str7, str8, string2, yzc0Var, flowable, dg4Var, g7hVar);
                        break;
                    case 25:
                        return String.valueOf(((nnf1) ib3Var.b).O0().getParcelable("track_view_uri"));
                    case 26:
                        return new cp81();
                    case 27:
                        tmf1 tmf1Var9 = (tmf1) ib3Var.a;
                        tmf1 tmf1Var10 = (tmf1) ib3Var.a;
                        pd80 pd80Var2 = (pd80) tmf1Var9.u.get();
                        c8o.l(pd80Var2);
                        zpg0 zpg0Var2 = (zpg0) tmf1Var10.v.get();
                        c8o.l(zpg0Var2);
                        zpg0 zpg0Var3 = (zpg0) tmf1Var10.w.get();
                        c8o.l(zpg0Var3);
                        return new wpf1(pd80Var2, zpg0Var2, zpg0Var3, d8.c((nnf1) ib3Var.b));
                    case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                        return new ctq(this);
                    case 29:
                        nnf1 nnf1Var5 = (nnf1) ib3Var.b;
                        tmf1 tmf1Var11 = (tmf1) ib3Var.a;
                        lik1 lik1VarC2 = d8.c(nnf1Var5);
                        String str9 = (String) ((jly0) ib3Var.D).get();
                        String str10 = (String) ((jly0) ib3Var.g).get();
                        kt91 kt91Var2 = (kt91) tmf1Var11.f.get();
                        c8o.l(kt91Var2);
                        Uri uri = (Uri) ((jly0) ib3Var.E).get();
                        Flowable flowable2 = (Flowable) tmf1Var11.r.get();
                        c8o.l(flowable2);
                        zud0 zud0VarJ = ib3Var.j();
                        bnj0 bnj0Var = new bnj0((i8h1) ((jly0) ib3Var.d).get(), new opl0((byte) 24), (byte) 27);
                        Scheduler scheduler2 = (Scheduler) tmf1Var11.E.get();
                        c8o.l(scheduler2);
                        tm30 tm30Var = (tm30) ((jly0) ib3Var.t).get();
                        e7p0 e7p0Var = (e7p0) tmf1Var11.h.get();
                        c8o.l(e7p0Var);
                        nnf1 nnf1Var6 = (nnf1) ((jly0) ib3Var.F).get();
                        zud0 zud0VarJ2 = ib3Var.j();
                        o3q0 o3q0Var = (o3q0) tmf1Var11.g.get();
                        c8o.l(o3q0Var);
                        muz muzVarD = ((cyp) ((jly0) ib3Var.h).get()).d();
                        nnf1 nnf1Var7 = (nnf1) ib3Var.b;
                        gn10 gn10VarR = j310.r(nnf1Var7);
                        String str11 = (String) tmf1Var11.F.get();
                        c8o.l(str11);
                        PlayOrigin playOriginB = d8.b(gn10VarR, str11, d8.c(nnf1Var7), wwo1.D(nnf1Var7));
                        Scheduler scheduler3 = (Scheduler) tmf1Var11.E.get();
                        c8o.l(scheduler3);
                        i160Var = new utf1(lik1VarC2, str9, str10, kt91Var2, uri, flowable2, zud0VarJ, bnj0Var, scheduler2, tm30Var, e7p0Var, nnf1Var6, new r3q0(zud0VarJ2, o3q0Var, muzVarD, playOriginB, scheduler3));
                        break;
                    case 30:
                        Bundle bundle = ((zf30) ((nnf1) ib3Var.b)).f;
                        return bundle == null ? "" : bundle.getString("share_id", "");
                    case 31:
                        Bundle bundle2 = ((zf30) ((nnf1) ib3Var.b)).f;
                        if (bundle2 == null) {
                            return Uri.EMPTY;
                        }
                        String string3 = bundle2.getString("external_referrer", "");
                        return !TextUtils.isEmpty(string3) ? Uri.parse(string3) : Uri.EMPTY;
                    case Bespoke2026Content.WRAPPED_PLACES_1_FIELD_NUMBER /* 32 */:
                        return new mir0(((wnh1) ((jly0) ib3Var.c).get()).a());
                    default:
                        jah.e(b2);
                        return null;
                }
                return i160Var;
            case 6:
                return a();
            case 7:
                return b();
            case 8:
                return c();
            case 9:
                return d();
            case 10:
                jnq jnqVar = (jnq) obj;
                if (b2 == 0) {
                    return new kah1(jnqVar.a());
                }
                if (b2 == 1) {
                    return new ubh1(jnqVar.a());
                }
                if (b2 == 2) {
                    return new avk();
                }
                jah.e(b2);
                return null;
            case 11:
                return e();
            case 12:
                return f();
            case 13:
                return g();
            case 14:
                return h();
            case 15:
                return i();
            case 16:
                return j();
            case 17:
                return k();
            case 18:
                return l();
            case 19:
                return m();
            case 20:
                return n();
            case 21:
                return o();
            case 22:
                return p();
            case 23:
                return q();
            case 24:
                return r();
            case 25:
                return s();
            case 26:
                return t();
            case 27:
                return u();
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return v();
            default:
                wdm wdmVar = (wdm) obj;
                q7r0 q7r0Var = (q7r0) wdmVar.d;
                rzm1 rzm1Var = (rzm1) wdmVar.b;
                switch (b2) {
                    case 0:
                        return u1n0.z(q7r0Var);
                    case 1:
                        return new uvq();
                    case 2:
                        return new vvq(this);
                    case 3:
                        return new wvq(this);
                    case 4:
                        return new e7p(this, (byte) 1);
                    case 5:
                        xfx xfxVar4 = (xfx) rzm1Var.c.get();
                        c8o.l(xfxVar4);
                        lzn0 lzn0VarA = rzm1Var.a();
                        c8o.l(lzn0VarA);
                        agc0 agc0Var = (agc0) rzm1Var.m.get();
                        c8o.l(agc0Var);
                        gw70 gw70VarB = ((zuj) wdmVar.c).b();
                        c8o.l(gw70VarB);
                        return new luj(xfxVar4, gw70VarB, agc0Var, lzn0VarA, false);
                    case 6:
                        return cwl1.C(q7r0Var);
                    case 7:
                        return new t1p(this, (byte) 7);
                    case 8:
                        qua0 qua0Var = (a5b0) rzm1Var.q.get();
                        c8o.l(qua0Var);
                        qua0 qua0Var2 = (a7n) rzm1Var.r.get();
                        c8o.l(qua0Var2);
                        yko ykoVar = (yko) rzm1Var.E.get();
                        c8o.l(ykoVar);
                        cyu cyuVar = (cyu) rzm1Var.F.get();
                        c8o.l(cyuVar);
                        y241 y241Var = (y241) rzm1Var.G.get();
                        c8o.l(y241Var);
                        return new e5b0(30, p7h.M(new qua0[]{qua0Var, qua0Var2, ykoVar.a((String) null, new l8t0(y241Var, (lnm) null, (byte) 28)), cyuVar.a(false)}), (List) null);
                    default:
                        jah.e(b2);
                        return null;
                }
        }
    }
}
