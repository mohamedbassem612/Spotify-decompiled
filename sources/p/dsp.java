package p;

import android.app.Application;
import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.a;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.b;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.c;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.d;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.e;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.f;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.g;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.h;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.i;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.j;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.k;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.l;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.m;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.n;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.o;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.p;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.q;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.effecthandlers.r;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.AdPlayingEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.AppContextChangedEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ApplicationStateEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.CarStateEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.DismissRequestEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.InternetConnectionStateEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.MessageRequestEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.OrientationChangedEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ProductStateChangedEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.UserLoggingOutEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ViewEventsEventSource;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdkimpl.domain.eventsources.ViewRequestEventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dsp implements jly0 {
    public final esp a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public dsp(esp espVar, int i) {
        this.a = espVar;
        this.b = i;
    }

    public final Object get() {
        esp espVar = this.a;
        byte b = this.b;
        switch (b) {
            case 0:
                return (ht4) espVar.a.p.get();
            case 1:
                return new pjg();
            case 2:
                return new sic();
            case 3:
                jly0 jly0Var = espVar.e;
                g3z g3zVar = espVar.a;
                ij01 ij01Var = new ij01((bz31) jly0Var.get(), (byte) 12);
                kly0 kly0Var = g3zVar.c;
                kly0 kly0Var2 = g3zVar.g;
                q qVar = new q(ij01Var, (yqg) kly0Var2.get());
                l lVar = new l(espVar.c(), new oz10(), (dma1) g3zVar.r.get(), (wic) espVar.f.get());
                p pVar = new p((mjc) espVar.g.get(), (wic) espVar.f.get());
                k kVar = new k(espVar.c(), new qz10(), (fzm0) g3zVar.v.get());
                c cVar = new c((mjc) espVar.g.get(), (yic) espVar.h.get());
                a aVar = new a((c5j0) espVar.m.get());
                n nVar = new n(new gjc((t2j0) g3zVar.q.get()));
                m mVar = new m((mjc) espVar.g.get(), (yic) espVar.h.get());
                f fVar = new f((mjc) espVar.g.get());
                e eVar = new e((mjc) espVar.g.get());
                h hVar = new h((imc) espVar.l.get());
                i iVar = new i((ric) espVar.n.get(), (hmc) espVar.o.get(), (w7q0) espVar.q.get(), (y4q0) espVar.r.get());
                o oVar = new o(new ij01((bz31) espVar.e.get(), (byte) 12), new zc80((qic) espVar.s.get(), (byte) 24), (Scheduler) kly0Var.get());
                g gVar = new g((ric) espVar.n.get(), (mmc) espVar.f17p.get());
                j jVar = new j((fmc) espVar.t.get());
                b bVar = new b((ric) espVar.n.get());
                r rVar = new r((yic) espVar.h.get());
                d dVar = new d((yic) espVar.h.get());
                ApplicationStateEventSource applicationStateEventSource = new ApplicationStateEventSource((Observable) g3zVar.m.get());
                UserLoggingOutEventSource userLoggingOutEventSource = new UserLoggingOutEventSource((Flowable) g3zVar.h.get());
                InternetConnectionStateEventSource internetConnectionStateEventSource = new InternetConnectionStateEventSource((zwz0) g3zVar.j.get());
                MessageRequestEventSource messageRequestEventSource = new MessageRequestEventSource((ajc) espVar.k.get(), (llc) espVar.u.get(), (wlc) espVar.w.get(), (tic) espVar.x.get());
                ViewRequestEventSource viewRequestEventSource = new ViewRequestEventSource((ojc) espVar.y.get());
                OrientationChangedEventSource orientationChangedEventSource = new OrientationChangedEventSource((Context) g3zVar.b.get());
                ViewEventsEventSource viewEventsEventSource = new ViewEventsEventSource((mmc) espVar.f17p.get());
                AdPlayingEventSource adPlayingEventSource = new AdPlayingEventSource((Flowable) g3zVar.k.get());
                CarStateEventSource carStateEventSource = new CarStateEventSource((crd) g3zVar.n.get());
                DismissRequestEventSource dismissRequestEventSource = new DismissRequestEventSource((ejc) espVar.z.get());
                AppContextChangedEventSource appContextChangedEventSource = new AppContextChangedEventSource((qlc) espVar.j.get(), (cmc) espVar.v.get());
                ProductStateChangedEventSource productStateChangedEventSource = new ProductStateChangedEventSource((o241) g3zVar.i.get());
                jjc jjcVar = new jjc(new no21(), new dzq((yqg) kly0Var2.get()), new yak1(new dqu((byte) 19), (yqg) kly0Var2.get()), new ltj0((yqg) kly0Var2.get()));
                Scheduler scheduler = (Scheduler) kly0Var.get();
                Scheduler scheduler2 = (Scheduler) g3zVar.d.get();
                akg akgVar = new akg(jjcVar);
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                subtypeEffectHandlerBuilderC.c(wjc.class, hVar.a());
                subtypeEffectHandlerBuilderC.d(qjc.class, bVar.a(), scheduler);
                subtypeEffectHandlerBuilderC.c(nkc.class, rVar.a());
                subtypeEffectHandlerBuilderC.c(sjc.class, dVar.a());
                subtypeEffectHandlerBuilderC.d(xjc.class, iVar.a(), scheduler);
                subtypeEffectHandlerBuilderC.d(vjc.class, gVar.a(), scheduler);
                subtypeEffectHandlerBuilderC.c(yjc.class, jVar.a());
                subtypeEffectHandlerBuilderC.c(rjc.class, cVar.a());
                subtypeEffectHandlerBuilderC.g(kkc.class, aVar.a());
                subtypeEffectHandlerBuilderC.c(ujc.class, fVar.a());
                subtypeEffectHandlerBuilderC.c(tjc.class, eVar.a());
                subtypeEffectHandlerBuilderC.c(ikc.class, nVar.a());
                subtypeEffectHandlerBuilderC.g(mkc.class, qVar.a());
                subtypeEffectHandlerBuilderC.g(akc.class, lVar.a());
                subtypeEffectHandlerBuilderC.g(zjc.class, kVar.a());
                subtypeEffectHandlerBuilderC.g(bkc.class, mVar.a());
                subtypeEffectHandlerBuilderC.g(jkc.class, oVar.a());
                subtypeEffectHandlerBuilderC.g(lkc.class, pVar.a());
                return new ljc(l1d.g(Mobius.d(akgVar, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{applicationStateEventSource.eventSource(), orientationChangedEventSource.eventSource(), userLoggingOutEventSource.eventSource(), internetConnectionStateEventSource.eventSource(), messageRequestEventSource.eventSource(), viewRequestEventSource.eventSource(), viewEventsEventSource.eventSource(), adPlayingEventSource.eventSource(), carStateEventSource.eventSource(), appContextChangedEventSource.eventSource(), dismissRequestEventSource.eventSource(), productStateChangedEventSource.eventSource()})).b(new bkg(scheduler2)).d(new ckg(scheduler2))), (gx5) g3zVar.l.get(), new ifl1(espVar.b, (byte) 10), (yqg) g3zVar.g.get(), new gjc((t2j0) g3zVar.q.get()), new vlc(), (ric) espVar.n.get(), espVar.g, espVar.h, (q8n) g3zVar.f.get());
            case 4:
                g3z g3zVar2 = espVar.a;
                g3z g3zVar3 = espVar.a;
                return new bz31(new ze90((Flowable) g3zVar2.k.get()), new af90((ji5) g3zVar3.t.get(), (byte) 0), new cf90((crd) g3zVar3.n.get()), new cf90((q8n) g3zVar3.f.get(), (zwz0) g3zVar3.j.get()), new az3(), new ff90((byte) 2), new ff90((byte) 0), new ff90((byte) 1), new af90(new dqu((byte) 19), (byte) 1));
            case 5:
                return new wic();
            case 6:
                t6j0 t6j0VarV = espVar.f().v();
                c8o.m(t6j0VarV);
                return new njc(t6j0VarV);
            case 7:
                nmd nmdVarU = espVar.f().u();
                c8o.m(nmdVarU);
                return new yic(nmdVarU);
            case 8:
                return new i5j0((ajc) espVar.k.get(), (qlc) espVar.j.get(), (imc) espVar.l.get(), new ulc((byte) 0));
            case 9:
                return new cjc((wic) espVar.f.get(), (kmc) espVar.i.get(), (qlc) espVar.j.get());
            case 10:
                return new kmc((Application) espVar.a.s.get());
            case 11:
                return new tlc((wic) espVar.f.get(), (kmc) espVar.i.get(), (Scheduler) espVar.a.d.get());
            case 12:
                return new imc();
            case 13:
                return new ric();
            case 14:
                return new hmc();
            case 15:
                return new x7q0((mmc) espVar.f17p.get());
            case 16:
                return new nmc();
            case 17:
                return new y4q0((mmc) espVar.f17p.get());
            case 18:
                return new qic();
            case 19:
                return new fmc();
            case 20:
                return new mlc(new ulc((byte) 0), (qlc) espVar.j.get());
            case 21:
                return new xlc(new ulc((byte) 0), (cmc) espVar.v.get(), (qlc) espVar.j.get());
            case 22:
                return new dmc((zeu0) espVar.a.u.get(), (gx5) espVar.a.l.get(), (wic) espVar.f.get(), (kmc) espVar.i.get());
            case 23:
                return new vic((zwz0) espVar.a.j.get(), new ulc((byte) 0), (qlc) espVar.j.get(), new ifl1(espVar.b, (byte) 10));
            case 24:
                return new pjc();
            case 25:
                return new fjc();
            case 26:
                return new vlc();
            case 27:
                return new emc((fmc) espVar.t.get());
            case 28:
                return new a5q0((mmc) espVar.f17p.get());
            case 29:
                return new c811(new z8c0(espVar.a.o.get(), (byte) 18), (it4) espVar.a.o.get());
            default:
                jah.e(b);
                return null;
        }
    }
}
