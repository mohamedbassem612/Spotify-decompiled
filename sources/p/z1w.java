package p;

import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z1w implements Function, av30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ z1w(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                s0w s0wVar = (s0w) obj;
                s0wVar.getClass();
                return (Boolean) iu30Var.invoke(s0wVar);
            case 1:
                return iu30Var.invoke(obj);
            case 2:
                return iu30Var.invoke(obj);
            default:
                return iu30Var.invoke(obj);
        }
    }
}
