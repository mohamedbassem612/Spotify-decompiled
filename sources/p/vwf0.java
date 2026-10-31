package p;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vwf0 implements SingleObserver {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public vwf0(bet0 bet0Var) {
        this.a = (byte) 1;
        this.c = bet0Var;
        this.b = new vku();
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                Logger.e(th, "MagicLinkRequestHandler Request failed with exception", new Object[0]);
                Logger.d("MagicLinkRequestHandler Connection error", new Object[0]);
                Logger.d("TooManyAttempts Failed to send magic link: connection error", new Object[0]);
                break;
            default:
                ((vku) this.b).c();
                Logger.k(gvg.h("Entity: ", ((bet0) this.c).d, " could not be played from notifications. Cause: ", th.getMessage()), new Object[0]);
                break;
        }
    }

    public final void onSubscribe(Disposable disposable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wwf0) obj).e.b(disposable);
                break;
            default:
                ((vku) obj).a(disposable);
                break;
        }
    }

    public final void onSuccess(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                yge0 yge0Var = (yge0) obj2;
                ry21 ry21Var = ((sy21) obj).a;
                int i = ry21Var.d;
                Logger.g(f4i1.c(i, "MagicLinkRequestHandler Received response with code: "), new Object[0]);
                if (ry21Var.Q0) {
                    Logger.g("MagicLinkRequestHandler Password reset email sent successfully", new Object[0]);
                    Logger.g("TooManyAttempts Magic link sent successfully, showing dialog", new Object[0]);
                    h2f0 h2f0Var = (h2f0) yge0Var.b;
                    uo5 uo5Var = h2f0Var.d;
                    ((ohv0) uo5Var.b).a(new khv0("LOGIN", "email_username_submit", Collections.singletonMap("is_email_input", String.valueOf(ihc1.h0((String) yge0Var.c, "@", false)))));
                    ohv0 ohv0Var = (ohv0) uo5Var.b;
                    ohv0Var.a(new lhv0("login", hrt.d(9)));
                    ohv0Var.a(new nhv0("autosend_dual_button", ((b2r0) uo5Var.c).Y.c.a));
                    l7m0 l7m0Var = h2f0Var.g;
                    if (l7m0Var != null) {
                        PackageManager packageManager = ((Activity) h2f0Var.e.b).getApplicationContext().getPackageManager();
                        Intent intent = new Intent("android.intent.action.MAIN");
                        intent.addCategory("android.intent.category.APP_EMAIL");
                        intent.setFlags(268435456);
                        boolean z = !packageManager.queryIntentActivities(intent, 0).isEmpty();
                        k1f0 k1f0Var = (k1f0) l7m0Var.b;
                        k1f0Var.Q1.setValue(Boolean.valueOf(z));
                        k1f0Var.P1.setValue(Boolean.TRUE);
                    }
                } else if (i == 429) {
                    Logger.d("MagicLinkRequestHandler Rate limited", new Object[0]);
                    Logger.d("TooManyAttempts Failed to send magic link: rate limited", new Object[0]);
                } else if (i != 404) {
                    Logger.d(f4i1.c(i, "MagicLinkRequestHandler Unknown error with code: "), new Object[0]);
                    Logger.d("TooManyAttempts Failed to send magic link: error code " + i, new Object[0]);
                } else {
                    Logger.d("MagicLinkRequestHandler User not found", new Object[0]);
                    Logger.d("TooManyAttempts Failed to send magic link: no user found", new Object[0]);
                }
                break;
            default:
                beh behVar = (feh) obj;
                ((vku) this.b).c();
                if (behVar instanceof beh) {
                    Logger.k(gvg.h("Entity: ", ((bet0) obj2).d, " could not be played from notifications. Cause: ", behVar.a), new Object[0]);
                }
                break;
        }
    }

    public vwf0(wwf0 wwf0Var, yge0 yge0Var) {
        this.a = (byte) 0;
        this.b = wwf0Var;
        this.c = yge0Var;
    }
}
