package p;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import com.spotify.base.java.logging.Logger;
import com.spotify.checkout.deeplink.UcLoggedInDeepLinkActivity;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class opw implements jlq0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ opw(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void c() throws InterruptedException {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                CountDownLatch countDownLatch = new CountDownLatch(1);
                y610 y610Var = (y610) obj;
                y610Var.u = new v7v(countDownLatch, (byte) 12);
                y610Var.r.clear();
                Logger.b("Sending onComplete to all connected clients.", new Object[0]);
                y610Var.s.onNext(Boolean.TRUE);
                countDownLatch.await();
                break;
            case 1:
                Context context = (Context) obj;
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) UcLoggedInDeepLinkActivity.class), 1, 1);
                break;
            case 2:
                jnh0 jnh0Var = (jnh0) obj;
                jnh0Var.getClass();
                jnh0Var.b = new Handler(jnh0Var.a.getLooper());
                break;
            default:
                ooe1 ooe1Var = (ooe1) obj;
                ooe1Var.setEnabled(true);
                ooe1Var.a(true);
                break;
        }
    }

    public final String getName() {
        switch (this.a) {
            case 0:
                return "EisShutdownOperation";
            case 1:
                return "EnableUcLoggedInDeepLinkOperation";
            case 2:
                return "MediaFocusWorkerStartupOperation";
            default:
                return "TimeKeeperStartupOperation";
        }
    }
}
