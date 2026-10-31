package p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vsy {
    public final Flowable a;
    public final w9u0 b;
    public final d0r c;
    public final boolean d;

    public vsy(Flowable flowable, w9u0 w9u0Var, d0r d0rVar, boolean z) {
        this.a = flowable;
        this.b = w9u0Var;
        this.c = d0rVar;
        this.d = z;
    }

    public static fty a(vsy vsyVar) {
        return new fty(vsyVar.a, vsyVar.b, vsyVar.c, vsyVar.d, true);
    }
}
