package p;

import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class s1u0 implements Function, BiFunction {
    public final /* synthetic */ t1u0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ s1u0(t1u0 t1u0Var, String str) {
        this.a = t1u0Var;
        this.b = str;
    }

    public Object apply(Object obj, Object obj2) {
        String str = (String) obj;
        fvf1 fvf1Var = (fvf1) obj2;
        t1u0 t1u0Var = this.a;
        gae gaeVar = t1u0Var.d;
        String strA = t1u0Var.a();
        str.getClass();
        q691 q691VarE = gaeVar.e(this.b);
        q691 q691Var = q691VarE instanceof q691 ? q691VarE : null;
        if (q691Var != null) {
            q691Var.i(strA, str, fvf1Var);
        }
        return rih1.a;
    }

    public Object apply(Object obj) {
        String str = this.b;
        return new CompletableFromAction(new o1u0(this.a, str, (String) obj, (byte) 2));
    }
}
