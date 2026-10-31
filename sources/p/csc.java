package p;

import android.app.Notification;
import androidx.work.WorkerParameters;
import com.spotify.storage.localstorage.CacheMovingWorkerImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class csc extends a8d1 implements zu30 {
    public byte a;
    public /* synthetic */ int b;
    public /* synthetic */ Notification c;
    public /* synthetic */ int d;
    public final /* synthetic */ CacheMovingWorkerImpl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csc(CacheMovingWorkerImpl cacheMovingWorkerImpl, lnm lnmVar) {
        super(4, lnmVar);
        this.e = cacheMovingWorkerImpl;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        csc cscVar = new csc(this.e, (lnm) obj4);
        cscVar.b = iIntValue;
        cscVar.c = (Notification) obj2;
        cscVar.d = iIntValue2;
        return cscVar.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        Notification notification = this.c;
        int i2 = this.d;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        CacheMovingWorkerImpl cacheMovingWorkerImpl = this.e;
        d9n d9nVar = d9n.a;
        if (b != 0) {
            if (b == 1) {
                hm5.M(obj);
            } else {
                if (b != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        }
        hm5.M(obj);
        this.c = null;
        this.b = i;
        this.d = i2;
        this.a = (byte) 1;
        if (cacheMovingWorkerImpl.m(i, notification, this) != d9nVar) {
        }
        cwq cwqVar = new cwq();
        cwqVar.c(new Integer(i2), "progress");
        ewq ewqVarA = cwqVar.a();
        this.c = null;
        this.b = i;
        this.d = i2;
        this.a = (byte) 2;
        WorkerParameters workerParameters = ((z8d0) cacheMovingWorkerImpl).b;
        mwl1 mwl1Var = workerParameters.h;
        Object objN = w0h1.n(upn1.t(new k65(mwl1Var.b.a, "updateProgress", new uc9(mwl1Var, workerParameters.a, ewqVarA, (byte) 12), (byte) 14)), this);
        if (objN != d9nVar) {
            objN = rih1Var;
        }
        return objN == d9nVar ? d9nVar : rih1Var;
    }
}
