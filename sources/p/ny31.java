package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ny31 {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final dap1 c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public uxn1 g;
    public final jv81 a = new jv81(0);
    public final Messenger e = new Messenger((Handler) new lbn1(this, Looper.getMainLooper()));

    public ny31(Context context) {
        this.b = context;
        this.c = new dap1(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    public final hfp1 a(Bundle bundle) {
        String string;
        int iA;
        Context context;
        synchronized (ny31.class) {
            int i2 = h;
            h = i2 + 1;
            string = Integer.toString(i2);
        }
        bsd1 bsd1Var = new bsd1();
        synchronized (this.a) {
            this.a.put(string, bsd1Var);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.b;
        synchronized (ny31.class) {
            try {
                PendingIntent pendingIntentA = i;
                if (pendingIntentA == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    pendingIntentA = tan1.a(context2, intent2, tan1.a);
                    i = pendingIntentA;
                }
                intent.putExtra("app", pendingIntentA);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", l1d.q(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(intent.getExtras()).length() + 8);
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f == null && this.g == null) {
            iA = this.c.a();
            context = this.b;
            if (iA == 2) {
                context.sendBroadcast(intent);
            } else {
                context.startService(intent);
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.g.a(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
                iA = this.c.a();
                context = this.b;
                if (iA == 2) {
                    context.sendBroadcast(intent);
                } else {
                    context.startService(intent);
                }
            }
        }
        bsd1Var.a.l(m5u.c, new fqn1(this, string, this.d.schedule((Runnable) new wun1(bsd1Var, (byte) 1), 30L, TimeUnit.SECONDS)));
        return bsd1Var.a;
    }

    public final void b(Bundle bundle, String str) {
        synchronized (this.a) {
            try {
                bsd1 bsd1Var = (bsd1) this.a.remove(str);
                if (bsd1Var != null) {
                    bsd1Var.b(bundle);
                    return;
                }
                String strValueOf = String.valueOf(str);
                if (strValueOf.length() != 0) {
                    "Missing callback for ".concat(strValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
