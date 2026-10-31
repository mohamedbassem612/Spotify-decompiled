package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b791 implements a791 {
    public final g510 a;
    public final i710 b;
    public final a710 c;
    public final oyr d;

    public b791(g510 g510Var, i710 i710Var, a710 a710Var, oyr oyrVar) {
        this.a = g510Var;
        this.b = i710Var;
        this.c = a710Var;
        this.d = oyrVar;
    }

    public final CompletableOnErrorComplete a(int i, m210 m210Var) {
        Completable completableFlatMapCompletable = ((j710) this.b).b.c.J(new n9v((byte) 19)).z().map(new nfr(i, (byte) 3)).flatMapCompletable(new o8d0(this, i, m210Var, (byte) 5));
        completableFlatMapCompletable.getClass();
        return completableFlatMapCompletable.o(Functions.h);
    }
}
