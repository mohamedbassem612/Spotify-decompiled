package p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.extras.SLF4JLogger;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class baf0 extends hab0 implements iu30 {
    public final /* synthetic */ jpa0 a;
    public final /* synthetic */ cac b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baf0(jpa0 jpa0Var, cac cacVar) {
        super(1);
        this.a = jpa0Var;
        this.b = cacVar;
    }

    public final Object invoke(Object obj) {
        pbq pbqVar = (pbq) this.a.b;
        Flowable flowable = (Flowable) pbqVar.b;
        ObservableSource map = x0d.j(flowable, flowable).map(xi10.Z).distinctUntilChanged().map(dj10.Z);
        zwz0 zwz0Var = (zwz0) pbqVar.f;
        mr20 mr20VarC = zwz0Var.c();
        o6x o6xVar = o6x.a;
        ObservableSource map2 = yoi1.i(mr20VarC, o6xVar).map(yb10.Z);
        ObservableSource map3 = ((g0l) pbqVar.g).j().map(d710.Z).distinctUntilChanged().filter(e710.Z).map(o810.Z);
        ObservableSource map4 = ((Observable) ((j9f0) pbqVar.h).a.invoke()).map(ok10.X);
        ObservableSource map5 = ((Observable) pbqVar.i).map(o610.Z);
        ObservableSource map6 = ((bqz) pbqVar.t).c("audio.allow_downgrade").map(u321.c1).map(sl10.P0);
        ObservableSource map7 = ((Observable) pbqVar.X).map(mi10.Z);
        b7n b7nVar = (b7n) pbqVar.c;
        EventSource eventSourceA = RxEventSources.a(new ObservableSource[]{map, map2, map3, map4, map5, map6, map7, yoi1.i(rqt0.u(new f8f0(b7nVar.a(k6n.a), (byte) 1)), o6xVar).map(si10.Z), yoi1.i(rqt0.u(new f8f0(b7nVar.a(u6n.a), (byte) 2)), o6xVar).map(as10.Z), yoi1.i(rqt0.u(new f8f0(b7nVar.a(v6n.a), (byte) 0)), o6xVar).map(c710.Y), yoi1.i(zwz0Var.d(), o6xVar).map(zj20.X).distinctUntilChanged().map(fj10.Z), x0d.j(flowable, flowable).map(xj20.Y).distinctUntilChanged().switchMap(new d4e0(pbqVar, (byte) 4)).distinctUntilChanged().map(eh10.Z), yoi1.i(rqt0.u(hu20.e(rqt0.u(new a8f0(pbqVar.C(), pbqVar, (byte) 0)), new y7f0(null, pbqVar, (byte) 0))), o6xVar).map(b610.Y), yoi1.i(rqt0.u(hu20.e(rqt0.u(new a8f0(pbqVar.C(), pbqVar, (byte) 1)), new y7f0(null, pbqVar, (byte) 1))), o6xVar).map(f610.Y)});
        cas casVar = (a7m0) obj;
        casVar.b = eventSourceA;
        casVar.g = CompositeLogger.g((yaf0) this.b.b, new SLF4JLogger("lossless-trouble-shooting-mobius"));
        return rih1.a;
    }
}
