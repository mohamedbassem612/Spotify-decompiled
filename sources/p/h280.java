package p;

import android.os.Build;
import android.view.Window;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h280 {
    public final a1g1 a;
    public final Scheduler b;
    public final rku c = new rku();

    public h280(a1g1 a1g1Var, Scheduler scheduler) {
        this.a = a1g1Var;
        this.b = scheduler;
    }

    public static final void a(h280 h280Var, i280 i280Var) {
        nsl1 lsl1Var;
        nsl1 lsl1Var2;
        a1g1 a1g1Var = h280Var.a;
        Window window = (Window) a1g1Var.b;
        int iOrdinal = i280Var.ordinal();
        if (iOrdinal == 0) {
            a1g1Var.a();
            return;
        }
        if (iOrdinal == 1) {
            d55.i(window, false);
            up41 up41Var = new up41(window.getDecorView());
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                lsl1Var = new nsl1(window, up41Var);
            } else if (i >= 30) {
                lsl1Var = new msl1(window, up41Var);
            } else {
                lsl1Var = i >= 26 ? new lsl1(window, up41Var) : new ksl1(window, up41Var);
            }
            lsl1Var.G(1);
            lsl1Var.L(2);
            lsl1Var.K(1);
            return;
        }
        if (iOrdinal != 2) {
            eg.o();
            return;
        }
        d55.i(window, false);
        up41 up41Var2 = new up41(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            lsl1Var2 = new nsl1(window, up41Var2);
        } else if (i2 >= 30) {
            lsl1Var2 = new msl1(window, up41Var2);
        } else {
            lsl1Var2 = i2 >= 26 ? new lsl1(window, up41Var2) : new ksl1(window, up41Var2);
        }
        lsl1Var2.G(519);
        lsl1Var2.K(2);
    }

    public final void b(Flowable flowable) {
        this.c.b(flowable.t(Functions.a).L(this.b).subscribe(new dy40(this, (byte) 2)));
    }

    public final void c() {
        this.c.a();
        this.a.a();
    }
}
