package p;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import app.p000rive.runtime.kotlin.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dko0 {
    public long A;
    public byte B;
    public final boolean C;
    public final Notification D;
    public boolean E;
    public final ArrayList F;
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public glo0 l;
    public CharSequence m;
    public byte n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f38p;
    public String q;
    public boolean r;
    public String s;
    public Bundle t;
    public int u;
    public int v;
    public RemoteViews w;
    public RemoteViews x;
    public String y;
    public String z;

    public dko0(Context context, String str) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.r = false;
        this.u = 0;
        this.v = 0;
        this.B = (byte) 0;
        Notification notification = new Notification();
        this.D = notification;
        this.a = context;
        this.y = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.F = new ArrayList();
        this.C = true;
    }

    public static CharSequence d(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public static String e(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String string = charSequence.toString();
        return (string != null && string.length() > 5120) ? string.substring(0, 5120) : string;
    }

    public final void a(int i, PendingIntent pendingIntent, String str) {
        this.b.add(new xjo0(i != 0 ? IconCompat.g((Resources) null, "", i) : null, str, pendingIntent, new Bundle(), null, true, true));
    }

    public final void b(xjo0 xjo0Var) {
        if (xjo0Var != null) {
            this.b.add(xjo0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification c() {
        Notification notificationBuild;
        Bundle bundle;
        fdc fdcVar = new fdc(this);
        dko0 dko0Var = (dko0) fdcVar.e;
        glo0 glo0Var = dko0Var.l;
        if (glo0Var != null) {
            glo0Var.b(fdcVar);
        }
        boolean z = fdcVar.b;
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) fdcVar.d;
        if (i >= 26) {
            notificationBuild = builder.build();
        } else {
            notificationBuild = builder.build();
            if (z != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && z == 2) {
                    notificationBuild.sound = null;
                    notificationBuild.vibrate = null;
                    notificationBuild.defaults &= -4;
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && z == 1) {
                    notificationBuild.sound = null;
                    notificationBuild.vibrate = null;
                    notificationBuild.defaults &= -4;
                }
            }
        }
        RemoteViews remoteViews = dko0Var.w;
        if (remoteViews != null) {
            notificationBuild.contentView = remoteViews;
        }
        if (glo0Var != null) {
            dko0Var.l.getClass();
        }
        if (glo0Var != null && (bundle = notificationBuild.extras) != null) {
            glo0Var.a(bundle);
        }
        return notificationBuild;
    }

    public final void f(boolean z) {
        l(16, z);
    }

    public final void g() {
        this.y = "com.google.android.gms.availability";
    }

    public final void h(PendingIntent pendingIntent) {
        this.g = pendingIntent;
    }

    public final void i(CharSequence charSequence) {
        this.f = d(charSequence);
    }

    public final void j(CharSequence charSequence) {
        this.e = d(charSequence);
    }

    public final void k(PendingIntent pendingIntent) {
        this.D.deleteIntent = pendingIntent;
    }

    public final void l(int i, boolean z) {
        Notification notification = this.D;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void m(Bitmap bitmap) {
        IconCompat iconCompatD;
        if (bitmap == null) {
            iconCompatD = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
                }
            }
            iconCompatD = IconCompat.d(bitmap);
        }
        this.h = iconCompatD;
    }

    public final void n() {
        this.r = true;
    }

    public final void o(int i) {
        this.j = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(int i, int i2, boolean z) {
        this.n = i;
        this.o = i2;
        this.f38p = z;
    }

    public final void q(int i) {
        this.D.icon = i;
    }

    public final void r(glo0 glo0Var) {
        if (this.l != glo0Var) {
            this.l = glo0Var;
            if (glo0Var == null || glo0Var.a == this) {
                return;
            }
            glo0Var.a = this;
            r(glo0Var);
        }
    }

    public final void s(String str) {
        this.D.tickerText = d(str);
    }

    public final void t(long j) {
        this.D.when = j;
    }

    public dko0(Context context) {
        this(context, null);
    }
}
