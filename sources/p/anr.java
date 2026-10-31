package p;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class anr implements av30, Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ anr(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                return iu30Var.invoke(obj);
            default:
                return (ObservableSource) iu30Var.invoke(obj);
        }
    }
}
