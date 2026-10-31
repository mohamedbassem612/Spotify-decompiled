package p;

import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r1u0 implements Function, BiFunction {
    public final /* synthetic */ t1u0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ r1u0(t1u0 t1u0Var, String str) {
        this.a = t1u0Var;
        this.b = str;
    }

    public Object apply(Object obj, Object obj2) {
        String strG;
        String str = (String) obj;
        fvf1 fvf1Var = (fvf1) obj2;
        t1u0 t1u0Var = this.a;
        gae gaeVar = t1u0Var.d;
        String strA = t1u0Var.a();
        str.getClass();
        o691 o691VarE = gaeVar.e(this.b);
        o691 o691Var = o691VarE instanceof o691 ? o691VarE : null;
        return (o691Var == null || (strG = o691Var.g(strA, str, fvf1Var)) == null) ? "" : strG;
    }

    public Object apply(Object obj) {
        String str = this.b;
        return new CompletableFromAction(new o1u0(this.a, str, (String) obj, (byte) 1));
    }
}
