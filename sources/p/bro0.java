package p;

import android.app.Activity;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bro0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cro0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bro0(cro0 cro0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = cro0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        cro0 cro0Var = this.b;
        switch (b) {
            case 0:
                return new bro0(cro0Var, lnmVar, (byte) 0);
            default:
                return new bro0(cro0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cro0 cro0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                lcs.b(cro0Var.a, cro0Var.e);
                break;
            default:
                hm5.M(obj);
                lzn0 lzn0Var = cro0Var.h;
                a1r0 a1r0Var = cro0Var.i;
                Activity activity = cro0Var.b;
                if (a1r0Var.h(activity)) {
                    a1r0Var.g();
                } else if (!lzn0Var.j(activity)) {
                    Logger.d("DismissSheet dispatched with unexpected activity: ".concat(activity.getClass().getName()), new Object[0]);
                    activity.finish();
                } else {
                    lzn0Var.c();
                }
                break;
        }
        return rih1Var;
    }
}
