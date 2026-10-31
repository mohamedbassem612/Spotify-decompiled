package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class af81 implements dwo {
    public final qn91 a;
    public final jl91 b;

    public af81(qn91 qn91Var, jl91 jl91Var) {
        this.a = qn91Var;
        this.b = jl91Var;
        Observable observableDistinctUntilChanged = qn91Var.a.filter(ytw0.g).switchMap(i5x0.Z).distinctUntilChanged((BiPredicate) p5x0.O0);
        List list = (List) qn91Var.c.h();
        qn91Var.b.b(observableDistinctUntilChanged.scan(new pn91(null, null, list == null ? z6x.a : list), r5x0.O0).subscribe((Consumer) new tr41(qn91Var, (byte) 26)));
        il91 il91Var = (il91) jl91Var;
        il91Var.g.c(new hl91(il91Var, (byte) 0));
        il91Var.X.b(((Observable) il91Var.Z.getValue()).doOnNext(new z0u0(new AtomicBoolean(false), il91Var, (byte) 16)).subscribe());
        Logger.b(gvg.e(il91Var.hashCode(), "SmartShuffleCore ", " started"), new Object[0]);
    }

    @Override // p.dwo
    public final void shutdown() {
        this.a.b.a();
        il91 il91Var = (il91) this.b;
        il91Var.g.c(new hl91(il91Var, (byte) 1));
        il91Var.X.a();
        Logger.b(gvg.e(il91Var.hashCode(), "SmartShuffleCore ", "  stopped"), new Object[0]);
    }
}
