package p;

import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nwj implements i060, av30, Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ nwj(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 1:
                return iu30Var.invoke(obj);
            case 2:
                return iu30Var.invoke(obj);
            default:
                return (SingleSource) iu30Var.invoke((String) obj);
        }
    }

    public void b(f060 f060Var) {
        this.b.invoke(f060Var);
    }
}
