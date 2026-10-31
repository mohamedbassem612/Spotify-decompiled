package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l830 implements k8x0 {
    public final /* synthetic */ byte a;
    public final String b;
    public final Activity c;
    public final cfi1 d;
    public final tzr0 e;

    public /* synthetic */ l830(String str, Activity activity, cfi1 cfi1Var, tzr0 tzr0Var, byte b) {
        this.a = b;
        this.b = str;
        this.c = activity;
        this.d = cfi1Var;
        this.e = tzr0Var;
    }

    public final String b() {
        byte b = this.a;
        Activity activity = this.c;
        switch (b) {
            case 0:
                return activity.getResources().getString(2131960539);
            case 1:
                return activity.getResources().getString(2131960542);
            default:
                return activity.getResources().getString(2131960545);
        }
    }

    public final Observable i(j8x0 j8x0Var) {
        byte b = this.a;
        tzr0 tzr0Var = this.e;
        String str = this.b;
        cfi1 cfi1Var = this.d;
        switch (b) {
            case 0:
                Observable observableJust = j8x0Var.a == 3 ? Observable.just(j8x0Var) : cfi1Var.d(str).toObservable().filter(va20.c).map(kc20.c).compose(new fex0(tzr0Var, (byte) 4));
                observableJust.getClass();
                return observableJust.compose(new fex0(tzr0Var, (byte) 0));
            case 1:
                Observable observableJust2 = j8x0Var.a == 3 ? Observable.just(j8x0Var) : cfi1Var.b(str).toObservable().filter(ud20.c).map(rh20.c).compose(new fex0(tzr0Var, (byte) 4));
                observableJust2.getClass();
                return observableJust2.compose(new fex0(tzr0Var, (byte) 0));
            default:
                return cfi1Var.c(str).toObservable().filter(cj20.P0).map(dj20.O0).compose(new fex0(tzr0Var, (byte) 5));
        }
    }

    public final int type() {
        switch (this.a) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 4;
        }
    }
}
