package p;

import android.content.Context;
import com.spotify.eventsender.musicintegration.eventsenderworker.EventSenderWorker;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jd00 implements r0z0 {
    public final Context a;
    public final zia b;

    public jd00(Context context, m26 m26Var) {
        Observable observableH;
        this.a = context;
        zia ziaVarA = zia.a(Boolean.FALSE);
        this.b = ziaVarA;
        if (m26Var.r != null) {
            observableH = ((Observable) m26Var.t.getValue()).map(mpi1.h).distinctUntilChanged();
            observableH.getClass();
        } else {
            observableH = l1d.h(m26Var.a);
        }
        observableH.distinctUntilChanged().subscribe(ziaVarA);
    }

    public final void a() {
        Context context = this.a;
        bzn1.r("event-sender-daily-flush", nb51.y(context));
        Boolean bool = (Boolean) this.b.a.get();
        ciq0 ciq0Var = (ciq0) ((ciq0) new ciq0(EventSenderWorker.class).h(bool != null ? bool.booleanValue() : false ? 1L : 3600L, TimeUnit.SECONDS)).e(1L, TimeUnit.HOURS);
        b2c b2cVar = new b2c();
        b2cVar.i();
        b2cVar.j();
        nb51.y(context).c("event-sender-background-flush", 2, (diq0) ((ciq0) ciq0Var.f(b2cVar.c())).b());
    }

    public final void cancel() {
        Context context = this.a;
        bzn1.r("event-sender-daily-flush", nb51.y(context));
        bzn1.r("event-sender-background-flush", nb51.y(context));
    }
}
