package com.ravelin.core.repository;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Parcelable;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.ravelin.core.model.Events;
import com.spotify.concertcampaignview.v1.CtaType;
import kotlin.Metadata;
import p.bd30;
import p.c7n1;
import p.d9n;
import p.dko0;
import p.eg;
import p.fn31;
import p.gvg;
import p.h6n1;
import p.hm5;
import p.i3y0;
import p.ike1;
import p.jo80;
import p.lnm;
import p.m5n1;
import p.n7n1;
import p.o5n1;
import p.o8n;
import p.onm;
import p.q7n1;
import p.qvz0;
import p.rih1;
import p.tr80;
import p.u;
import p.u890;
import p.urq;
import p.utw0;
import p.v8d0;
import p.w0h1;
import p.wu7;
import p.xqu;
import p.y8d0;
import p.z8d0;
import p.zdp0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ravelin/core/repository/RavelinWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "core_release"}, k = 1, mv = {2, 1, SplitInstallErrorCode.NO_ERROR}, xi = 48)
public class RavelinWorker extends CoroutineWorker {
    public static final String j;
    public static final tr80 k;
    public final Context g;
    public c7n1 h;
    public zdp0 i;

    static {
        String canonicalName = RavelinWorker.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "RavelinWorker";
        }
        j = canonicalName;
        k = new tr80(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER, 504, 1);
    }

    public RavelinWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object j(RavelinWorker ravelinWorker, onm onmVar) {
        qvz0 qvz0Var;
        rih1 rih1Var;
        if (onmVar instanceof qvz0) {
            qvz0Var = (qvz0) onmVar;
            int i = qvz0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qvz0Var.c = i - Integer.MIN_VALUE;
            } else {
                qvz0Var = new qvz0(ravelinWorker, onmVar);
            }
        } else {
            qvz0Var = new qvz0(ravelinWorker, onmVar);
        }
        Object objY = qvz0Var.a;
        int i2 = qvz0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                WorkerParameters workerParameters = ((z8d0) ravelinWorker).b;
                if (workerParameters.c > 72) {
                    return new v8d0();
                }
                String strC = workerParameters.b.c("Api");
                String strC2 = workerParameters.b.c("Payload");
                String strH = gvg.h("doWork was called with keys: apiKey - ", strC, ", payloadKey - ", strC2);
                utw0 utw0Var = ike1.a;
                String str = j;
                utw0Var.y(str);
                utw0Var.o(strH, new Object[0]);
                if (strC != null) {
                    ravelinWorker.i(strC);
                    rih1Var = rih1.a;
                } else {
                    rih1Var = null;
                }
                if (rih1Var == null) {
                    return new v8d0();
                }
                if (strC == null || strC.length() == 0 || strC2 == null || strC2.length() == 0) {
                    utw0Var.y(str);
                    utw0Var.o("Failed with lack of information", new Object[0]);
                    return new v8d0();
                }
                Events events = (Events) ((Parcelable) w0h1.d(new o5n1((byte) 2)).a(strC2, m5n1.z(Events.INSTANCE.serializer())));
                zdp0 zdp0Var = ravelinWorker.i;
                if (zdp0Var == null) {
                    u890.C("coroutineContextProvider");
                    throw null;
                }
                o8n o8nVarA = zdp0Var.a();
                i3y0 i3y0Var = new i3y0(ravelinWorker, strC, events, (lnm) null, (byte) 6);
                qvz0Var.c = 1;
                objY = fn31.Y(o8nVarA, i3y0Var, qvz0Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objY);
            }
            return (y8d0) objY;
        } catch (Exception e) {
            e.getMessage();
            return new v8d0();
        }
    }

    public Object f(lnm lnmVar) {
        return j(this, (onm) lnmVar);
    }

    public final Object h() {
        String str;
        utw0 utw0Var = ike1.a;
        utw0Var.y(j);
        utw0Var.o("Fallback to foreground service", new Object[0]);
        int i = Build.VERSION.SDK_INT;
        Context context = this.g;
        if (i >= 26) {
            wu7.m();
            str = "Ravelin channel id";
            NotificationChannel notificationChannel = new NotificationChannel("Ravelin channel id", "Ravelin channel", 0);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.setLockscreenVisibility(0);
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
        } else {
            str = "";
        }
        String packageName = context.getPackageName();
        dko0 dko0Var = new dko0(context, str);
        dko0Var.e = dko0.d(packageName);
        dko0Var.s(packageName);
        dko0Var.f = dko0.d("Application doing some work");
        dko0Var.D.icon = 2131233399;
        dko0Var.l(2, true);
        return new bd30(3557, dko0Var.c(), 0);
    }

    public final void i(String str) {
        n7n1 n7n1Var = new n7n1();
        xqu xquVarB = xqu.b(new h6n1((byte) 3, n7n1Var, xqu.b(new u(n7n1Var, xqu.b(new q7n1(n7n1Var, xqu.b(new urq(n7n1Var, (byte) 10)), xqu.b(new urq(n7n1Var, (byte) 9)), (byte) 1)), jo80.a(str), (byte) 2))));
        xqu xquVarB2 = xqu.b(new urq(n7n1Var, (byte) 8));
        this.h = (c7n1) xquVarB.get();
        this.i = (zdp0) xquVarB2.get();
    }
}
