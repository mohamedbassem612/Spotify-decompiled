package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rer {
    public final g0l a;
    public final f2l b;
    public final efr c;
    public final Context d;
    public final Flowable e;
    public final ynb0 f;

    public rer(g0l g0lVar, f2l f2lVar, efr efrVar, Context context, Flowable flowable, ynb0 ynb0Var) {
        this.a = g0lVar;
        this.b = f2lVar;
        this.c = efrVar;
        this.d = context;
        this.e = flowable;
        this.f = ynb0Var;
    }

    public static int b(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return 2;
        }
        if (iC == 1) {
            return 3;
        }
        eg.o();
        return 0;
    }

    public final mr20 a() {
        inr inrVar = this.a;
        return rqt0.u(new qbk(yoi1.g(Observable.combineLatest(hqq0.K(inrVar), inrVar.j(), new jxa(this, (byte) 6))), this, (byte) 29));
    }
}
