package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bhh {
    public final Context a;
    public final Flowable b;
    public final fta c;
    public final fdc d;
    public final jl21 e;

    public bhh(Context context, Flowable flowable, fta ftaVar, fdc fdcVar, jl21 jl21Var) {
        this.a = context;
        this.b = flowable;
        this.c = ftaVar;
        this.d = fdcVar;
        this.e = jl21Var;
    }

    public final jhm a(String str, lik1 lik1Var, c861 c861Var) {
        jhm jhmVarB = jl21.b(this.e, str, lik1Var);
        ihm ihmVarC = jhmVarB.c();
        return jhm.a(jhmVarB, (String) null, ihm.a(ihmVarC, new w9f(ihmVarC, c861Var, (byte) 22)), 231);
    }
}
