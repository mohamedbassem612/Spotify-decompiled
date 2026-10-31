package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ni10 implements lf81 {
    public final /* synthetic */ byte a = 0;
    public final Object b;

    public ni10(Observable observable) {
        this.b = observable.map(mi10.b);
    }

    public final Single a(int i, yrc0 yrc0Var) {
        int iC;
        boolean zS;
        byte b = this.a;
        Object obj = this.b;
        if81 if81Var = if81.b;
        if81 if81Var2 = if81.a;
        switch (b) {
            case 0:
                return i == 5 ? Single.just(new kf81(f46.S0(new if81[]{if81Var2, if81Var}))) : ((Observable) obj).firstOrError().onErrorReturnItem(Boolean.TRUE).map(new ouz(yrc0Var, (byte) 4));
            default:
                Set setW0 = dm61.w0(new if81[]{if81Var2, if81Var});
                kly0 kly0Var = ((jo91) obj).a;
                int iC2 = l1d.C(i);
                if81 if81Var3 = if81.c;
                if (iC2 == 0 ? !(yrc0Var == null || ((iC = l1d.C(yrc0Var.f)) == 0 ? !((yrc0Var.e || ((t35) kly0Var.get()).C()) && yrc0Var.d && ((t35) kly0Var.get()).A()) : iC != 1)) : iC2 == 1) {
                    setW0.add(if81Var3);
                }
                int iC3 = l1d.C(i);
                if (iC3 != 0) {
                    zS = iC3 != 1 ? false : ((t35) kly0Var.get()).r();
                } else {
                    zS = ((t35) kly0Var.get()).s();
                }
                if (zS) {
                    if81Var2 = if81Var3;
                } else if (zS) {
                    eg.o();
                    return null;
                }
                return Single.just(new kf81(setW0, if81Var2, true));
        }
    }

    public ni10(jo91 jo91Var) {
        this.b = jo91Var;
    }
}
