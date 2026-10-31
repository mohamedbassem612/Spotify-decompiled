package p;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import com.spotify.checkout.deeplink.UcLoggedInDeepLinkActivity;
import com.spotify.music.clientinfo.instrumentation.events.proto.AndroidClientReport;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fjg implements jlq0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ fjg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void c() {
        boolean z;
        byte b = 1;
        switch (this.a) {
            case 0:
                ejg ejgVar = (ejg) this.b;
                t2j0 t2j0Var = ejgVar.a;
                d94 d94VarO = AndroidClientReport.o();
                d94VarO.r(ejgVar.b.a);
                d94VarO.n(z1p1.B(((String) ejgVar.b.e.getValue()).split(":")));
                String strC = ejgVar.b.c();
                if (strC == null) {
                    strC = "";
                }
                d94VarO.q(strC);
                t2j0Var.a(d94VarO.build());
                return;
            case 1:
                ktr ktrVar = (ktr) this.b;
                ktrVar.b.removeCallbacksAndMessages("DebugMessagingPlatform");
                ktrVar.a.c();
                return;
            case 2:
                Context context = (Context) this.b;
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) UcLoggedInDeepLinkActivity.class), 2, 1);
                return;
            case 3:
                smo1.p(((dpu) ((fpu) this.b).c.getAndSet(new dpu())).b, (CancellationException) null);
                return;
            case 4:
                ((ht50) this.b).a();
                return;
            case 5:
                jnh0 jnh0Var = (jnh0) this.b;
                Handler handler = jnh0Var.b;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                jnh0Var.b = null;
                return;
            case 6:
                q6v0 q6v0Var = (q6v0) this.b;
                ((ArrayList) q6v0Var.b.b).clear();
                q6v0Var.a.dispose();
                return;
            case 7:
                uwv0 uwv0Var = (uwv0) this.b;
                uwv0Var.a.a();
                uwv0Var.b.c(uwv0.c[0], uwv0Var, (Object) null);
                return;
            case 8:
                ni61 ni61Var = (ni61) this.b;
                synchronized (ni61Var.b) {
                    z = ni61Var.c == null;
                }
                if (z) {
                    return;
                }
                ni61Var.a.b("SessionUiTeardown", new eh61(ni61Var, b));
                return;
            case 9:
                ((rh61) this.b).a.onNext(qh61.a);
                return;
            default:
                ((ooe1) this.b).a(false);
                return;
        }
    }

    public final String getName() {
        switch (this.a) {
            case 0:
                return "ClientInfoPublisherStartupOperation";
            case 1:
                return "DebugMessagingPlatformShutdownOperation";
            case 2:
                return "DisableUcLoggedInDeepLinkOperation";
            case 3:
                return "DjPersonaCacheShutdownOperation";
            case 4:
                return "HardwareInfoLoggerStartupOperation";
            case 5:
                return "MediaFocusWorkerShutdownOperation";
            case 6:
                return "PodcastPollsShutdownOperation";
            case 7:
                return "PremiumUpgradeBannerShutdownOperation";
            case 8:
                return "SessionUiTeardownOperation";
            case 9:
                return "SessionShutdownOperation";
            default:
                return "TimeKeeperShutdownOperation";
        }
    }
}
