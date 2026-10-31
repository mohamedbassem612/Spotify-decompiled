package p;

import android.app.NotificationManager;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fsc extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fta b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fsc(fta ftaVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ftaVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new fsc(this.b, lnmVar, (byte) 0);
            default:
                return new fsc(this.b, lnmVar, (byte) 1);
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
        fta ftaVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                awl1.d(((Context) ftaVar.b).getApplicationContext()).e("cache_moving_worker").g((z11) ftaVar.e);
                break;
            default:
                hm5.M(obj);
                ((NotificationManager) ((Context) ftaVar.b).getApplicationContext().getSystemService("notification")).cancel(2131430162);
                awl1.d(((Context) ftaVar.b).getApplicationContext()).e("cache_moving_worker").k((z11) ftaVar.e);
                break;
        }
        return rih1Var;
    }
}
