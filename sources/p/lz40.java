package p;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class lz40 extends mz40 {
    public static final Object d = new Object();
    public static final lz40 e = new lz40();
    public o9n1 c;

    public static hfp1 d(s0o1 s0o1Var, kz40... kz40VarArr) {
        pz40 pz40Var;
        zod.t(s0o1Var, "Requested API must not be null.");
        for (kz40 kz40Var : kz40VarArr) {
            zod.t(kz40Var, "Requested API must not be null.");
        }
        ArrayList arrayList = new ArrayList(kz40VarArr.length + 1);
        arrayList.add(s0o1Var);
        arrayList.addAll(Arrays.asList(kz40VarArr));
        synchronized (pz40.R0) {
            zod.t(pz40.S0, "Must guarantee manager is non-null before using getInstance");
            pz40Var = pz40.S0;
        }
        pz40Var.getClass();
        m9n1 m9n1Var = new m9n1(arrayList);
        jim0 jim0Var = pz40Var.N0;
        jim0Var.sendMessage(jim0Var.obtainMessage(2, m9n1Var));
        return m9n1Var.b().p(d8n1.a);
    }

    public static AlertDialog f(Activity activity, int i, b9n1 b9n1Var, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(x8n1.c(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String strE = x8n1.e(activity, i);
        if (strE != null) {
            builder.setPositiveButton((CharSequence) strE, (DialogInterface.OnClickListener) b9n1Var);
        }
        String strA = x8n1.a(activity, i);
        if (strA != null) {
            builder.setTitle(strA);
        }
        new IllegalArgumentException();
        return builder.create();
    }

    public static void j(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof dg30) {
                a1d1.i1(alertDialog, onCancelListener).g1(((dg30) activity).e0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        rgz.a(alertDialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @Override // p.mz40
    public final Intent a(int i, Context context, String str) {
        return super.a(i, context, str);
    }

    @Override // p.mz40
    public final int b(Application application) {
        return super.c(application, mz40.a);
    }

    public final void e(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogF = f(googleApiActivity, i, b9n1.b(googleApiActivity, super.a(i, googleApiActivity, "d")), googleApiActivity2);
        if (alertDialogF == null) {
            return;
        }
        j(googleApiActivity, alertDialogF, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void g(Activity activity, bac0 bac0Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogF = f(activity, i, b9n1.c(bac0Var, super.a(i, activity, "d")), onCancelListener);
        if (alertDialogF == null) {
            return;
        }
        j(activity, alertDialogF, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void h(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        new IllegalArgumentException();
        if (i == 18) {
            new t8n1(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String strB = x8n1.b(context, i);
        String strD = x8n1.d(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        zod.s(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        dko0 dko0Var = new dko0(context);
        dko0Var.n();
        dko0Var.f(true);
        dko0Var.j(strB);
        cko0 cko0Var = new cko0((byte) 0);
        cko0Var.f(strD);
        dko0Var.r(cko0Var);
        boolean zV = e9k.v(context);
        int i3 = R.drawable.stat_sys_warning;
        if (zV) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            dko0Var.q(i3);
            dko0Var.o(2);
            if (e9k.w(context)) {
                dko0Var.a(2131231235, pendingIntent, resources.getString(2131954159));
            } else {
                dko0Var.h(pendingIntent);
            }
        } else {
            dko0Var.q(R.drawable.stat_sys_warning);
            dko0Var.s(resources.getString(2131954151));
            dko0Var.t(System.currentTimeMillis());
            dko0Var.h(pendingIntent);
            dko0Var.i(strD);
        }
        if (wyo1.j()) {
            zod.w(wyo1.j());
            synchronized (d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(2131954150);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(wu7.g(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            dko0Var.g();
        }
        Notification notificationC = dko0Var.c();
        if (i == 1 || i == 2 || i == 3) {
            h450.a.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
        }
        notificationManager.notify(i2, notificationC);
    }

    public final void i(Context context, lal lalVar, boolean z) {
        Integer num = lalVar.e;
        e8n1 e8n1Var = new e8n1(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), lalVar.b, z);
        o9n1 o9n1Var = this.c;
        if (o9n1Var == null) {
            o9n1Var = new o9n1(context);
            this.c = o9n1Var;
        }
        o9n1Var.i(e8n1Var);
    }
}
