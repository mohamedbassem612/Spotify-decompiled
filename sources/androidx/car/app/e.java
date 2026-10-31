package androidx.car.app;

import p.z7q0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((CarAppBinder) this.b).lambda$getAppInfo$8((IOnDoneCallback) this.c);
                return;
            case 1:
                j jVar = (j) this.b;
                SessionInfo sessionInfo = (SessionInfo) this.c;
                synchronized (jVar.a) {
                    try {
                        CarAppBinder carAppBinder = (CarAppBinder) jVar.a.get(sessionInfo);
                        if (carAppBinder != null) {
                            carAppBinder.onDestroyLifecycle();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                ((z7q0) null).a();
                return;
        }
    }
}
