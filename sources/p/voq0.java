package p;

import com.spotify.mobius.extras.CompositeLogger;
import com.spotify.mobius.extras.SLF4JLogger;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class voq0 extends hab0 implements iu30 {
    public final /* synthetic */ hgo a;
    public final /* synthetic */ ioq0 b;
    public final /* synthetic */ ng20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voq0(hgo hgoVar, ioq0 ioq0Var, ng20 ng20Var) {
        super(1);
        this.a = hgoVar;
        this.b = ioq0Var;
        this.c = ng20Var;
    }

    public final Object invoke(Object obj) {
        hgo hgoVar = this.a;
        cas casVar = (a7m0) obj;
        casVar.b = RxEventSources.a(new ObservableSource[]{((Observable) ((gjp0) hgoVar.b).invoke()).switchMapSingle(new hvp0(hgoVar, (byte) 3)).onErrorReturn(dj10.U0)});
        casVar.d = wso0.V0;
        casVar.e = new pdp0(this.c, (byte) 25);
        casVar.g = CompositeLogger.g(new SLF4JLogger("puffin-connect-context-menu-optimization"), this.b);
        return rih1.a;
    }
}
