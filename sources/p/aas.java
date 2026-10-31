package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class aas {
    public final iqr a;
    public final s4z0 b;
    public final fcz0 c;
    public final xrc0 d;
    public final n3d0 e;
    public final Observable f;
    public final Scheduler g;
    public final Scheduler h;

    public aas(iqr iqrVar, s4z0 s4z0Var, fcz0 fcz0Var, xrc0 xrc0Var, n3d0 n3d0Var, Observable observable, Scheduler scheduler, Scheduler scheduler2) {
        this.a = iqrVar;
        this.b = s4z0Var;
        this.c = fcz0Var;
        this.d = xrc0Var;
        this.e = n3d0Var;
        this.f = observable;
        this.g = scheduler;
        this.h = scheduler2;
    }

    public final CompletableObserveOn a(int i, String str, String str2, List list) {
        return c(this.a.a(i, str, str2, list), i, str2);
    }

    public final CompletableObserveOn b(String str, String str2, int i, String str3) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        String strZ = s4b1VarX.z();
        if (strZ == null) {
            strZ = str;
        }
        Set set2 = iqr.e;
        v5b1 v5b1Var = s4b1VarX.d;
        return o7h.i0(set2, v5b1Var != null ? v5b1Var.getType() : null) ? c(this.f.firstOrError().flatMap(new zfr(this, strZ, (byte) 15)).flatMap(new b8p1(this, str2, str3, i, (byte) 9)).onErrorReturn(s321.W0), i, str3) : c(this.a.b(str, str2, i, str3), i, str3);
    }

    public final CompletableObserveOn c(Single single, int i, String str) {
        return single.subscribeOn(this.h).flatMapCompletable(new mgc(this, i, str, (byte) 15)).n(this.g);
    }
}
