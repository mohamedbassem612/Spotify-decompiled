package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class euw0 implements Function {
    public final Observable a;

    public euw0(ynb0 ynb0Var) {
        this.a = ((ark1) ynb0Var.get()).a().scan(new mmr0((Object) null, (Object) null), u9x0.X0).map(vbx0.X0).filter(wbx0.Y0).map(ybx0.Y0);
    }

    public Object apply(Object obj) {
        return this.a.startWithItem((Map) obj);
    }

    public euw0(Observable observable) {
        this.a = observable;
    }
}
