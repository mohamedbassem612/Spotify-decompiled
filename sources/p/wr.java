package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class wr implements Function {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ cs b;
    public final /* synthetic */ mlb1 c;

    public wr(cs csVar, mlb1 mlb1Var) {
        this.b = csVar;
        this.c = mlb1Var;
    }

    public final Object apply(Object obj) {
        Completable completableO;
        byte b = this.a;
        nlb1 nlb1Var = this.c;
        cs csVar = this.b;
        switch (b) {
            case 0:
                m941 m941Var = (q941) obj;
                if (!(m941Var instanceof m941)) {
                    Single singleJust = Single.just(m941Var);
                    singleJust.getClass();
                    return singleJust;
                }
                ev evVar = m941Var.a;
                Objects.toString(nlb1Var);
                vv vvVar = csVar.i;
                if (nlb1Var instanceof nlb1) {
                    completableO = vvVar.a(new o71(cs.n(evVar), nlb1Var.c, Integer.valueOf(csVar.j.g()), false));
                } else if (nlb1Var instanceof jnb1) {
                    jnb1 jnb1Var = (jnb1) nlb1Var;
                    Completable completableFlatMapCompletable = vvVar.e.flatMapCompletable(new mr(vvVar, new rad1(jnb1Var.d, cs.n(evVar), jnb1Var.e), (byte) 6));
                    completableFlatMapCompletable.getClass();
                    completableO = completableFlatMapCompletable.o(Functions.h);
                } else {
                    completableO = CompletableEmpty.a;
                    completableO.getClass();
                }
                return new CompletableToSingle(completableO, new vr(m941Var), (Object) null);
            default:
                th61 th61Var = (th61) obj;
                if (voo1.p(th61Var) && th61Var.b) {
                    Single singleFlatMap = csVar.g.a().flatMap(new rr(csVar, (byte) 1)).flatMap(new wr((mlb1) nlb1Var, csVar));
                    singleFlatMap.getClass();
                    return singleFlatMap;
                }
                Single singleJust2 = Single.just(o941.a);
                singleJust2.getClass();
                return singleJust2;
        }
    }

    public wr(mlb1 mlb1Var, cs csVar) {
        this.c = mlb1Var;
        this.b = csVar;
    }
}
