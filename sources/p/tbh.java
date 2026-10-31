package p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final /* synthetic */ class tbh extends k01 implements vu30 {
    public final Object invoke(Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        wbh wbhVar = (wbh) ((k01) this).a;
        synchronized (wbhVar) {
            try {
                wbhVar.f = zBooleanValue;
                if (zBooleanValue) {
                    Handler handler = wbhVar.c;
                    if (handler == null) {
                        handler = c2p1.x() ? new Handler(Looper.getMainLooper(), wbhVar) : new Handler(((Handler) wbhVar.a.get()).getLooper(), wbhVar);
                        wbhVar.c = handler;
                    }
                    if (!wbhVar.e) {
                        handler.sendEmptyMessage(0);
                        wbhVar.e = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rih1.a;
    }
}
