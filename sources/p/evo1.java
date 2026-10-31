package p;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class evo1 {
    public static final pue0 u = new pue0("MediaNotificationProxy", (String) null);
    public final Context a;
    public final NotificationManager b;
    public final vro0 c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final vi11 i;
    public final Resources j;
    public b3k k;
    public zxl1 l;
    public xjo0 m;
    public xjo0 n;
    public xjo0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public xjo0 f7p;
    public xjo0 q;
    public xjo0 r;
    public xjo0 s;
    public xjo0 t;

    public evo1(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        pue0 pue0Var = b3e.l;
        zod.n("Must be called from the main thread.");
        b3e b3eVar = b3e.n;
        zod.s(b3eVar);
        zod.n("Must be called from the main thread.");
        p3e p3eVar = b3eVar.d;
        zod.s(p3eVar);
        h3e h3eVar = p3eVar.f;
        zod.s(h3eVar);
        vro0 vro0Var = h3eVar.d;
        zod.s(vro0Var);
        this.c = vro0Var;
        h3eVar.j();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), h3eVar.a);
        String str = vro0Var.d;
        if (TextUtils.isEmpty(str)) {
            this.e = null;
        } else {
            this.e = new ComponentName(context.getApplicationContext(), str);
        }
        this.h = vro0Var.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(vro0Var.R0);
        this.i = new vi11(context.getApplicationContext(), new pt70(1, dimensionPixelSize, dimensionPixelSize));
        if (wyo1.j() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(2131958402), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        q5p1.a(y1p1.E1);
    }

    public final void a() {
        Bitmap bitmap;
        PendingIntent activities;
        xjo0 xjo0VarB;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.k == null) {
            return;
        }
        zxl1 zxl1Var = this.l;
        if (zxl1Var == null || (bitmap = (Bitmap) zxl1Var.c) == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = null;
        }
        Context context = this.a;
        dko0 dko0Var = new dko0(context, "cast_media_notification");
        dko0Var.m(bitmap);
        vro0 vro0Var = this.c;
        dko0Var.D.icon = vro0Var.e;
        dko0Var.e = dko0.d((String) this.k.c);
        dko0Var.f = dko0.d(this.j.getString(vro0Var.S0, (String) this.k.d));
        dko0Var.l(2, true);
        dko0Var.k = false;
        dko0Var.v = 1;
        ComponentName componentName = this.e;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent intentO = mno1.o(context, component); intentO != null; intentO = mno1.o(context, intentO.getComponent())) {
                        arrayList.add(size, intentO);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                eg.m("No intents added to TaskStackBuilder; cannot getPendingIntent");
                return;
            } else {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
            }
        }
        if (activities != null) {
            dko0Var.g = activities;
        }
        i2o1 i2o1Var = vro0Var.f1;
        pue0 pue0Var = u;
        if (i2o1Var != null) {
            pue0Var.a("actionsProvider != null", new Object[0]);
            int[] iArrB = cap1.b(i2o1Var);
            this.g = iArrB != null ? (int[]) iArrB.clone() : null;
            ArrayList<qjo0> arrayListA = cap1.a(i2o1Var);
            this.f = new ArrayList();
            if (arrayListA != null) {
                for (qjo0 qjo0Var : arrayListA) {
                    String str = qjo0Var.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        xjo0VarB = b(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.d);
                        xjo0VarB = new w0d(qjo0Var.b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), qjo0Var.c).b();
                    }
                    if (xjo0VarB != null) {
                        this.f.add(xjo0VarB);
                    }
                }
            }
        } else {
            pue0Var.a("actionsProvider == null", new Object[0]);
            this.f = new ArrayList();
            Iterator it = vro0Var.a.iterator();
            while (it.hasNext()) {
                xjo0 xjo0VarB2 = b((String) it.next());
                if (xjo0VarB2 != null) {
                    this.f.add(xjo0VarB2);
                }
            }
            int[] iArr = vro0Var.b;
            this.g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            dko0Var.b((xjo0) it2.next());
        }
        jko0 jko0Var = new jko0();
        int[] iArr2 = this.g;
        if (iArr2 != null) {
            jko0Var.e = iArr2;
        }
        MediaSessionCompat.Token token = (MediaSessionCompat.Token) this.k.b;
        if (token != null) {
            jko0Var.f = token;
        }
        dko0Var.r(jko0Var);
        notificationManager.notify("castMediaNotification", 1, dko0Var.c());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final xjo0 b(String str) {
        int i;
        int i2;
        int iHashCode = str.hashCode();
        long j = this.h;
        PendingIntent broadcast = null;
        Resources resources = this.j;
        vro0 vro0Var = this.c;
        Context context = this.a;
        ComponentName componentName = this.d;
        switch (iHashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    xjo0 xjo0Var = this.r;
                    if (xjo0Var != null) {
                        return xjo0Var;
                    }
                    Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent.setComponent(componentName);
                    intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                    pue0 pue0Var = cap1.a;
                    int i3 = vro0Var.N0;
                    if (j == 10000) {
                        i3 = vro0Var.O0;
                    } else if (j == 30000) {
                        i3 = vro0Var.P0;
                    }
                    int i4 = vro0Var.b1;
                    if (j == 10000) {
                        i4 = vro0Var.c1;
                    } else if (j == 30000) {
                        i4 = vro0Var.d1;
                    }
                    xjo0 xjo0VarB = new w0d(i3, broadcast2, resources.getString(i4)).b();
                    this.r = xjo0VarB;
                    return xjo0VarB;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.k.f;
                    xjo0 xjo0Var2 = this.o;
                    if (xjo0Var2 != null) {
                        return xjo0Var2;
                    }
                    if (z) {
                        Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent2.setComponent(componentName);
                        broadcast = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                    }
                    xjo0 xjo0VarB2 = new w0d(vro0Var.i, broadcast, resources.getString(vro0Var.W0)).b();
                    this.o = xjo0VarB2;
                    return xjo0VarB2;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.k.h;
                    xjo0 xjo0Var3 = this.f7p;
                    if (xjo0Var3 != null) {
                        return xjo0Var3;
                    }
                    if (z2) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent3.setComponent(componentName);
                        broadcast = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                    }
                    xjo0 xjo0VarB3 = new w0d(vro0Var.t, broadcast, resources.getString(vro0Var.X0)).b();
                    this.f7p = xjo0VarB3;
                    return xjo0VarB3;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    xjo0 xjo0Var4 = this.t;
                    if (xjo0Var4 != null) {
                        return xjo0Var4;
                    }
                    Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent4.setComponent(componentName);
                    xjo0 xjo0VarB4 = new w0d(vro0Var.Q0, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(vro0Var.e1)).b();
                    this.t = xjo0VarB4;
                    return xjo0VarB4;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    xjo0 xjo0Var5 = this.s;
                    if (xjo0Var5 != null) {
                        return xjo0Var5;
                    }
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent5.setComponent(componentName);
                    xjo0 xjo0VarB5 = new w0d(vro0Var.Q0, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(vro0Var.e1, "")).b();
                    this.s = xjo0VarB5;
                    return xjo0VarB5;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    b3k b3kVar = this.k;
                    int i5 = b3kVar.g;
                    if (!b3kVar.e) {
                        xjo0 xjo0Var6 = this.m;
                        if (xjo0Var6 != null) {
                            return xjo0Var6;
                        }
                        Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent6.setComponent(componentName);
                        xjo0 xjo0VarB6 = new w0d(vro0Var.h, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(vro0Var.V0)).b();
                        this.m = xjo0VarB6;
                        return xjo0VarB6;
                    }
                    xjo0 xjo0Var7 = this.n;
                    if (xjo0Var7 != null) {
                        return xjo0Var7;
                    }
                    if (i5 == 2) {
                        i = vro0Var.f;
                        i2 = vro0Var.T0;
                    } else {
                        i = vro0Var.g;
                        i2 = vro0Var.U0;
                    }
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent7.setComponent(componentName);
                    xjo0 xjo0VarB7 = new w0d(i, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(i2)).b();
                    this.n = xjo0VarB7;
                    return xjo0VarB7;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    xjo0 xjo0Var8 = this.q;
                    if (xjo0Var8 != null) {
                        return xjo0Var8;
                    }
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent8.setComponent(componentName);
                    intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                    pue0 pue0Var2 = cap1.a;
                    int i6 = vro0Var.X;
                    if (j == 10000) {
                        i6 = vro0Var.Y;
                    } else if (j == 30000) {
                        i6 = vro0Var.Z;
                    }
                    int i7 = vro0Var.Y0;
                    if (j == 10000) {
                        i7 = vro0Var.Z0;
                    } else if (j == 30000) {
                        i7 = vro0Var.a1;
                    }
                    xjo0 xjo0VarB8 = new w0d(i6, broadcast3, resources.getString(i7)).b();
                    this.q = xjo0VarB8;
                    return xjo0VarB8;
                }
                break;
        }
        u.c("Action: %s is not a pre-defined action.", new Object[]{str});
        return null;
    }
}
