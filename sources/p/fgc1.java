package p;

import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.extras.SLF4JLogger;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fgc1 extends hab0 implements iu30 {
    public final /* synthetic */ eip0 a;
    public final /* synthetic */ u7f0 b;
    public final /* synthetic */ b9o c;
    public final /* synthetic */ ufc1 d;
    public final /* synthetic */ Scheduler e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgc1(eip0 eip0Var, u7f0 u7f0Var, b9o b9oVar, ufc1 ufc1Var, Scheduler scheduler) {
        super(1);
        this.a = eip0Var;
        this.b = u7f0Var;
        this.c = b9oVar;
        this.d = ufc1Var;
        this.e = scheduler;
    }

    public final Object invoke(Object obj) {
        ObservableSource map = ((Observable) this.a.invoke()).map(hcx0.R0);
        ima1 ima1Var = this.b.a;
        bma1 bma1Var = l8f0.a;
        cas casVar = (a7m0) obj;
        casVar.b = RxEventSources.a(new ObservableSource[]{map, yoi1.i(ima1Var.q(bma1Var), o6x.a).filter(cj20.Y).map(dj20.X).startWithItem(Boolean.valueOf(ima1Var.h(bma1Var, false))).distinctUntilChanged().map(icx0.Q0), ((Observable) this.c.invoke()).map(jcx0.R0)});
        casVar.d = new mw1(this.e, (byte) 10);
        casVar.g = CompositeLogger.g(new SLF4JLogger("puffin-connect-context-menu-streaming"), this.d);
        return rih1.a;
    }
}
