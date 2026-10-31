package p;

import android.app.Activity;
import android.os.Build;
import android.view.Window;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wmf0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Activity b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmf0(Activity activity, boolean z, lnm lnmVar) {
        super(2, lnmVar);
        this.b = activity;
        this.c = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case 0:
                return new wmf0(activity, lnmVar);
            default:
                return new wmf0(activity, this.c, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        Window window;
        nsl1 lsl1Var;
        byte b = this.a;
        Activity activity = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    this.c = true;
                    d9y0.u(activity, this);
                    return d9n.a;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                hm5.M(obj);
                if (activity != null && (window = activity.getWindow()) != null) {
                    up41 up41Var = new up41(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        lsl1Var = new nsl1(window, up41Var);
                    } else if (i >= 30) {
                        lsl1Var = new msl1(window, up41Var);
                    } else {
                        lsl1Var = i >= 26 ? new lsl1(window, up41Var) : new ksl1(window, up41Var);
                    }
                    if (this.c) {
                        lsl1Var.G(1);
                        lsl1Var.K(2);
                    } else {
                        lsl1Var.L(1);
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmf0(Activity activity, lnm lnmVar) {
        super(2, lnmVar);
        this.b = activity;
    }
}
