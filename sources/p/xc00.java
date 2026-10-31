package p;

import com.spotify.eventsender.Fragment;
import com.spotify.eventsender.eventsender.observability.EventSenderMonitorBackendError;
import com.spotify.eventsender.gabo.EventEnvelope;
import com.spotify.eventsender.gabo.PublishEventsRequest;
import com.spotify.eventsender.gabo.PublishEventsResponse;
import com.spotify.eventsender.gabo.a;
import com.spotify.eventsender.gabo.b;
import com.spotify.messages.EventSenderCanaryNonAuth;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xc00 implements vc00 {
    public final zfb0 a;
    public final s900 b;
    public final ac00 c;
    public final Scheduler d;
    public final zq4 e;
    public final kc00 f;
    public long h;
    public Disposable g = EmptyDisposable.a;
    public final hhc i = phc.i(UUID.randomUUID().toString());
    public long j = 1;

    public xc00(py30 py30Var, s900 s900Var, ac00 ac00Var, Scheduler scheduler, zq4 zq4Var, kc00 kc00Var) {
        this.a = py30Var;
        this.b = s900Var;
        this.c = ac00Var;
        this.d = scheduler;
        this.e = zq4Var;
        this.f = kc00Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.eventsender.eventsender.observability.EventSenderMonitorBackendError */
    public final void a(iy30 iy30Var) throws EventSenderMonitorBackendError {
        zb00 zb00VarN = EventSenderCanaryNonAuth.n();
        zb00VarN.n();
        EventSenderCanaryNonAuth eventSenderCanaryNonAuthBuild = zb00VarN.build();
        eventSenderCanaryNonAuthBuild.getClass();
        byte[] byteArray = eventSenderCanaryNonAuthBuild.toByteArray();
        this.c.getClass();
        h290<Fragment> h290VarQ = q1o1.e(byteArray, ac00.a(), this.b).q();
        ArrayList arrayList = new ArrayList(q7h.U(h290VarQ, 10));
        for (Fragment fragment : h290VarQ) {
            b bVarN = EventEnvelope.EventFragment.n();
            bVarN.q(fragment.getName());
            bVarN.n(fragment.getData());
            arrayList.add((EventEnvelope.EventFragment) bVarN.build());
        }
        a aVarO = EventEnvelope.o();
        aVarO.q("EventSenderCanaryNonAuth");
        aVarO.n(arrayList);
        aVarO.r(this.i);
        long j = this.j;
        this.j = 1 + j;
        aVarO.s(j);
        EventEnvelope eventEnvelope = (EventEnvelope) aVarO.build();
        mny0 mny0VarP = PublishEventsRequest.p();
        mny0VarP.q(eventEnvelope);
        PublishEventsRequest publishEventsRequest = (PublishEventsRequest) mny0VarP.build();
        publishEventsRequest.getClass();
        sy21 sy21VarC = iy30Var.a(publishEventsRequest).c();
        int i = sy21VarC.a.d;
        if (i != 200) {
            throw new EventSenderMonitorBackendError(f4i1.c(i, "EventSender heartbeat event failed with HTTP code: "));
        }
        PublishEventsResponse publishEventsResponse = (PublishEventsResponse) sy21VarC.b;
        if (publishEventsResponse != null && publishEventsResponse.o().size() > 0) {
            throw new EventSenderMonitorBackendError("EventSender heartbeat event failed with reasons: ".concat(o7h.y0(publishEventsResponse.o(), (CharSequence) null, (String) null, (String) null, wc00.a, 31)));
        }
        this.h = ac00.b();
    }

    public final void b() {
        kc00 kc00Var = this.f;
        if (((adn0) kc00Var.get()).h <= 0 || !this.g.isDisposed()) {
            return;
        }
        this.g = Observable.combineLatest(Observable.interval(0L, ((adn0) kc00Var.get()).i, TimeUnit.SECONDS), this.a.a(), wdu0.Q0).observeOn(this.d).filter(new sw9(this, ((adn0) kc00Var.get()).h, (byte) 6)).map(new mev(this, (byte) 10)).subscribe(p.P0, new cfs(this, (byte) 23));
    }
}
