package p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import app.p000rive.semantics.SemanticState;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class qsh {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Code duplicated, block: B:124:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:222:0x029c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77, types: [int] */
    public static xid a(FirebaseMessagingService firebaseMessagingService, swm0 swm0Var) {
        Bundle bundle;
        int identifier;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Long lValueOf;
        long[] jArr;
        int[] iArr;
        int i;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), SemanticState.Focused);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
        }
        Bundle bundle2 = bundle;
        String strJ = swm0Var.j("gcm.n.android_channel_id");
        int i2 = 0;
        if (Build.VERSION.SDK_INT < 26) {
            strJ = null;
        } else {
            try {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion < 26) {
                    strJ = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strJ) || notificationManager.getNotificationChannel(strJ) == null) {
                        strJ = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (TextUtils.isEmpty(strJ) || notificationManager.getNotificationChannel(strJ) == null) {
                            strJ = "fcm_fallback_notification_channel";
                            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                                int identifier2 = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", identifier2 == 0 ? "Misc" : firebaseMessagingService.getString(identifier2), 3));
                            }
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = firebaseMessagingService.getPackageName();
        Resources resources = firebaseMessagingService.getResources();
        PackageManager packageManager = firebaseMessagingService.getPackageManager();
        dko0 dko0Var = new dko0(firebaseMessagingService, strJ);
        String strI = swm0Var.i(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strI)) {
            dko0Var.j(strI);
        }
        String strI2 = swm0Var.i(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strI2)) {
            dko0Var.i(strI2);
            cko0 cko0Var = new cko0(false);
            cko0Var.f = dko0.d(strI2);
            dko0Var.r(cko0Var);
        }
        String strJ2 = swm0Var.j("gcm.n.icon");
        if (TextUtils.isEmpty(strJ2) || (((identifier = resources.getIdentifier(strJ2, "drawable", packageName)) == 0 || !b(identifier, resources)) && ((identifier = resources.getIdentifier(strJ2, "mipmap", packageName)) == 0 || !b(identifier, resources)))) {
            identifier = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier == 0 || !b(identifier, resources)) {
                try {
                    identifier = packageManager.getApplicationInfo(packageName, 0).icon;
                } catch (PackageManager.NameNotFoundException e2) {
                    e2.toString();
                }
            }
            if (identifier == 0 || !b(identifier, resources)) {
                identifier = 17301651;
            }
        }
        Notification notification = dko0Var.D;
        notification.icon = identifier;
        String strJ3 = swm0Var.j("gcm.n.sound2");
        if (TextUtils.isEmpty(strJ3)) {
            strJ3 = swm0Var.j("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strJ3)) {
            defaultUri = null;
        } else if ("default".equals(strJ3) || resources.getIdentifier(strJ3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strJ3);
        }
        char c = 4;
        if (defaultUri != null) {
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        String strJ4 = swm0Var.j("gcm.n.click_action");
        if (TextUtils.isEmpty(strJ4)) {
            String strJ5 = swm0Var.j("gcm.n.link_android");
            if (TextUtils.isEmpty(strJ5)) {
                strJ5 = swm0Var.j("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strJ5) ? Uri.parse(strJ5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            }
        } else {
            launchIntentForPackage = new Intent(strJ4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) swm0Var.b;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                char c2 = c;
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
                c = c2;
            }
            launchIntentForPackage.putExtras(bundle4);
            if (swm0Var.a("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", swm0Var.w());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        dko0Var.g = activity;
        PendingIntent broadcast = !swm0Var.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName((Context) firebaseMessagingService, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(swm0Var.w())), 1140850688);
        if (broadcast != null) {
            notification.deleteIntent = broadcast;
        }
        String strJ6 = swm0Var.j("gcm.n.color");
        if (TextUtils.isEmpty(strJ6)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strJ6));
            } catch (IllegalArgumentException unused2) {
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i != 0) {
                    try {
                        numValueOf = Integer.valueOf(firebaseMessagingService.getColor(i));
                    } catch (Resources.NotFoundException unused3) {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            dko0Var.u = numValueOf.intValue();
        }
        dko0Var.f(!swm0Var.a("gcm.n.sticky"));
        dko0Var.r = swm0Var.a("gcm.n.local_only");
        String strJ7 = swm0Var.j("gcm.n.ticker");
        if (strJ7 != null) {
            dko0Var.s(strJ7);
        }
        Integer numF = swm0Var.f("gcm.n.notification_priority");
        if (numF == null || numF.intValue() < -2 || numF.intValue() > 2) {
            numF = null;
        }
        if (numF != null) {
            dko0Var.j = numF.intValue();
        }
        Integer numF2 = swm0Var.f("gcm.n.visibility");
        if (numF2 == null || numF2.intValue() < -1 || numF2.intValue() > 1) {
            numF2 = null;
        }
        if (numF2 != null) {
            dko0Var.v = numF2.intValue();
        }
        Integer numF3 = swm0Var.f("gcm.n.notification_count");
        if (numF3 == null || numF3.intValue() < 0) {
            numF3 = null;
        }
        if (numF3 != null) {
            dko0Var.i = numF3.intValue();
        }
        String strJ8 = swm0Var.j("gcm.n.event_time");
        if (TextUtils.isEmpty(strJ8)) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(strJ8));
            } catch (NumberFormatException unused4) {
                swm0.x("gcm.n.event_time");
                lValueOf = null;
            }
        }
        if (lValueOf != null) {
            dko0Var.k = true;
            notification.when = lValueOf.longValue();
        }
        JSONArray jSONArrayG = swm0Var.g("gcm.n.vibrate_timings");
        if (jSONArrayG == null) {
            jArr = null;
        } else {
            try {
                if (jSONArrayG.length() <= 1) {
                    throw new JSONException("vibrateTimings have invalid length");
                }
                int length = jSONArrayG.length();
                jArr = new long[length];
                for (int i3 = 0; i3 < length; i3++) {
                    jArr[i3] = jSONArrayG.optLong(i3);
                }
            } catch (NumberFormatException | JSONException unused5) {
                jSONArrayG.toString();
                jArr = null;
            }
        }
        if (jArr != null) {
            notification.vibrate = jArr;
        }
        JSONArray jSONArrayG2 = swm0Var.g("gcm.n.light_settings");
        if (jSONArrayG2 == null) {
            iArr = null;
        } else {
            int[] iArr2 = new int[3];
            try {
                if (jSONArrayG2.length() != 3) {
                    throw new JSONException("lightSettings don't have all three fields");
                }
                int color = Color.parseColor(jSONArrayG2.optString(0));
                if (color == -16777216) {
                    throw new IllegalArgumentException("Transparent color is invalid");
                }
                iArr2[0] = color;
                iArr2[1] = jSONArrayG2.optInt(1);
                iArr2[2] = jSONArrayG2.optInt(2);
                iArr = iArr2;
            } catch (IllegalArgumentException e3) {
                jSONArrayG2.toString();
                e3.getMessage();
                iArr = null;
            } catch (JSONException unused6) {
                jSONArrayG2.toString();
                iArr = null;
            }
        }
        if (iArr != null) {
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            if (i5 != 0 && i6 != 0) {
                i2 = 1;
            }
            notification.flags = (notification.flags & (-2)) | i2;
        }
        boolean zA = swm0Var.a("gcm.n.default_sound");
        ?? r0 = zA;
        if (swm0Var.a("gcm.n.default_vibrate_timings")) {
            r0 = (zA ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (swm0Var.a("gcm.n.default_light_settings")) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        notification.defaults = r1;
        if ((r1 & 4) != 0) {
            notification.flags |= 1;
        }
        String strJ9 = swm0Var.j("gcm.n.tag");
        if (TextUtils.isEmpty(strJ9)) {
            strJ9 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new xid(dko0Var, strJ9, (byte) 21);
    }

    public static boolean b(int i, Resources resources) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
