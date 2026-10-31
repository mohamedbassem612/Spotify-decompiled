package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zpk {
    public final f971 a;
    public final sd41 b;
    public final zxm1 c;
    public final tzr0 d;
    public final dlg1 e;
    public final pn1 f;
    public final k811 g;
    public final t2 h;
    public final mwm1 i;
    public final Context j;

    public zpk(f971 f971Var, sd41 sd41Var, zxm1 zxm1Var, tzr0 tzr0Var, dlg1 dlg1Var, pn1 pn1Var, k811 k811Var, t2 t2Var, mwm1 mwm1Var, Context context) {
        this.a = f971Var;
        this.b = sd41Var;
        this.c = zxm1Var;
        this.d = tzr0Var;
        this.e = dlg1Var;
        this.f = pn1Var;
        this.g = k811Var;
        this.h = t2Var;
        this.i = mwm1Var;
        this.j = context;
    }

    public final Observable a(lik1 lik1Var, String str, String str2, String str3, String str4, ypk ypkVar, String str5) {
        Observable observableJust;
        Observable observableC = this.b.c(str);
        if (ypkVar.a) {
            observableJust = this.c.b(str, lik1Var);
        } else {
            observableJust = Observable.just(uum1.a);
            observableJust.getClass();
        }
        return Observable.combineLatest(observableC, observableJust, new ip31(str3, str4, str5, ypkVar, this, lik1Var, str, str2, (byte) 8));
    }
}
