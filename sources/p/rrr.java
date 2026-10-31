package p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class rrr implements av30, Function, Predicate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ rrr(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    public /* synthetic */ Object apply(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 3:
                break;
        }
        return iu30Var.invoke(obj);
    }

    public /* synthetic */ boolean test(Object obj) {
        return ((Boolean) this.b.invoke(obj)).booleanValue();
    }
}
