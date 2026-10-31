package p;

import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p1u0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t1u0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ p1u0(t1u0 t1u0Var, String str, byte b) {
        this.a = b;
        this.b = t1u0Var;
        this.c = str;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        String str = this.c;
        t1u0 t1u0Var = this.b;
        switch (b) {
            case 0:
                return new CompletableFromAction(new o1u0(t1u0Var, str, (String) obj, (byte) 0));
            default:
                return new CompletableFromAction(new o1u0(t1u0Var, str, (String) obj, (byte) 3));
        }
    }
}
