package p;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class rhf1 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledThreadPoolExecutor b;
    public final /* synthetic */ FirebaseMessaging c;
    public final /* synthetic */ gjj0 d;
    public final /* synthetic */ dxy e;

    public /* synthetic */ rhf1(Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, FirebaseMessaging firebaseMessaging, gjj0 gjj0Var, dxy dxyVar) {
        this.a = context;
        this.b = scheduledThreadPoolExecutor;
        this.c = firebaseMessaging;
        this.d = gjj0Var;
        this.e = dxyVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        qhf1 qhf1Var;
        Context context = this.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.b;
        FirebaseMessaging firebaseMessaging = this.c;
        gjj0 gjj0Var = this.d;
        dxy dxyVar = this.e;
        synchronized (qhf1.class) {
            try {
                WeakReference weakReference = qhf1.b;
                qhf1 qhf1Var2 = weakReference != null ? (qhf1) weakReference.get() : null;
                if (qhf1Var2 == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                    qhf1Var = new qhf1();
                    synchronized (qhf1Var) {
                        qhf1Var.a = r961.e(sharedPreferences, scheduledThreadPoolExecutor);
                    }
                    qhf1.b = new WeakReference(qhf1Var);
                } else {
                    qhf1Var = qhf1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new shf1(firebaseMessaging, gjj0Var, qhf1Var, dxyVar, context, scheduledThreadPoolExecutor);
    }
}
