package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s6z {
    public final a6z a;
    public final i4q b;

    public s6z(a6z a6zVar, i4q i4qVar) {
        this.a = a6zVar;
        this.b = i4qVar;
    }

    public static void a(s6z s6zVar, String str, lik1 lik1Var, tv80 tv80Var, String str2, j380 j380Var, r6z r6zVar, int i) {
        String str3 = (i & 8) != 0 ? null : str2;
        Observable observableK = s6zVar.a.k(str, str3, (i & 16) != 0 ? null : j380Var, lik1Var, r6zVar);
        mfm mfmVarA = s6zVar.b.a(lik1Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, observableK, yon1.Y0(), new bjm(4, str, str3), tv80Var, 16);
    }
}
