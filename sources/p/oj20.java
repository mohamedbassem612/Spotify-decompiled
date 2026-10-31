package p;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class oj20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ oj20(FirebaseMessaging firebaseMessaging, byte b) {
        this.a = b;
        this.b = firebaseMessaging;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (b) {
            case 0:
                if (firebaseMessaging.e.z()) {
                    nl51 nl51VarC = FirebaseMessaging.c(firebaseMessaging.b);
                    wi20 wi20Var = firebaseMessaging.a;
                    wi20Var.a();
                    if (firebaseMessaging.e(nl51VarC.j("[DEFAULT]".equals(wi20Var.b) ? "" : wi20Var.d(), gjj0.b(wi20Var)))) {
                        synchronized (firebaseMessaging) {
                            if (!firebaseMessaging.i) {
                                firebaseMessaging.d(0L);
                            }
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                x74.V(firebaseMessaging.b);
                return;
        }
    }
}
