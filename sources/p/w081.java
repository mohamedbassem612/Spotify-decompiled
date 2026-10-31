package p;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.UserManager;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.IconCompat;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentMediaFormat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class w081 {
    public static volatile u081 a;
    public static volatile ArrayList b;

    public static void A(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void B(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void C(Outline outline, u8s0 u8s0Var) {
        if (u8s0Var instanceof tw4) {
            outline.setPath(((tw4) u8s0Var).a);
        } else {
            hhg1.h("Unable to obtain android.graphics.Path");
        }
    }

    public static void D(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static RouteDiscoveryPreference E(hvh0 hvh0Var) {
        if (!hvh0Var.c()) {
            kts.a();
            return new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
        }
        boolean zB = hvh0Var.b();
        ArrayList arrayList = new ArrayList();
        hvh0Var.a();
        for (String str : hvh0Var.c.b()) {
            str.getClass();
            switch (str) {
                case "android.media.intent.category.REMOTE_PLAYBACK":
                    str = "android.media.route.feature.REMOTE_PLAYBACK";
                    break;
                case "android.media.intent.category.LIVE_AUDIO":
                    str = "android.media.route.feature.LIVE_AUDIO";
                    break;
                case "android.media.intent.category.LIVE_VIDEO":
                    str = "android.media.route.feature.LIVE_VIDEO";
                    break;
                case "android.media.intent.category.REMOTE_AUDIO_PLAYBACK":
                    str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                    break;
                case "android.media.intent.category.REMOTE_VIDEO_PLAYBACK":
                    str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                    break;
            }
            arrayList.add(str);
        }
        return new RouteDiscoveryPreference.Builder(arrayList, zB).build();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    public static gvh0 F(MediaRoute2Info mediaRoute2Info) {
        int i;
        ArrayList<String> stringArrayList;
        if (mediaRoute2Info == null) {
            return null;
        }
        wmy wmyVar = new wmy(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        Bundle bundle = (Bundle) wmyVar.a;
        wmyVar.v(mediaRoute2Info.getConnectionState());
        wmyVar.G(mediaRoute2Info.getVolumeHandling());
        wmyVar.H(mediaRoute2Info.getVolumeMax());
        wmyVar.F(mediaRoute2Info.getVolume());
        wmyVar.z(mediaRoute2Info.getExtras());
        wmyVar.y(true);
        bundle.putBoolean("canDisconnect", false);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            bundle.putStringArrayList("deduplicationIds", new ArrayList<>(sf.p(mediaRoute2Info)));
            int iX = sf.x(mediaRoute2Info);
            i = 2;
            if (iX == 2) {
                i = 12;
            } else if (iX == 3) {
                i = 13;
            } else if (iX == 4) {
                i = 14;
            } else if (iX == 22) {
                i = 20;
            } else if (iX == 23) {
                i = 21;
            } else if (iX == 26) {
                i = 22;
            } else if (iX == 29) {
                i = 24;
            } else if (iX != 2000) {
                switch (iX) {
                    case 8:
                        i = 3;
                        break;
                    case 9:
                        i = 16;
                        break;
                    case 10:
                        i = 23;
                        break;
                    case 11:
                        i = 17;
                        break;
                    case 12:
                        i = 18;
                        break;
                    case 13:
                        i = 19;
                        break;
                    default:
                        switch (iX) {
                            case ContentMediaFormat.FULL_CONTENT_GENERIC /* 1001 */:
                                i = 1;
                                break;
                            case ContentMediaFormat.FULL_CONTENT_EPISODE /* 1002 */:
                                break;
                            case ContentMediaFormat.FULL_CONTENT_MOVIE /* 1003 */:
                                i = 4;
                                break;
                            case ContentMediaFormat.PARTIAL_CONTENT_GENERIC /* 1004 */:
                                i = 5;
                                break;
                            case ContentMediaFormat.PARTIAL_CONTENT_EPISODE /* 1005 */:
                                i = 6;
                                break;
                            case ContentMediaFormat.PARTIAL_CONTENT_MOVIE /* 1006 */:
                                i = 7;
                                break;
                            case ContentMediaFormat.PREVIEW_GENERIC /* 1007 */:
                                i = 8;
                                break;
                            case ContentMediaFormat.PREVIEW_EPISODE /* 1008 */:
                                i = 9;
                                break;
                            case ContentMediaFormat.PREVIEW_MOVIE /* 1009 */:
                                i = 10;
                                break;
                            case ContentMediaFormat.EXTRA_GENERIC /* 1010 */:
                                i = 11;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        break;
                }
            } else {
                i = 1000;
            }
        } else {
            i = 0;
        }
        if (i2 >= 36 && ibc.a() >= 3600001) {
            ig.a(wmyVar, mediaRoute2Info);
        }
        CharSequence description = mediaRoute2Info.getDescription();
        if (description != null) {
            wmyVar.w(description.toString());
        }
        Uri iconUri = mediaRoute2Info.getIconUri();
        if (iconUri != null) {
            bundle.putString("iconUri", iconUri.toString());
        }
        Bundle extras = mediaRoute2Info.getExtras();
        if (extras == null || !extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        wmyVar.z(extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS"));
        if (i == 0) {
            i = extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
        }
        wmyVar.x(i);
        wmyVar.C(extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList arrayListU = jhc1.u(extras, "androidx.mediarouter.media.KEY_CONTROL_FILTERS", IntentFilter.class);
        if (arrayListU != null) {
            wmyVar.d(arrayListU);
        }
        List<String> features = mediaRoute2Info.getFeatures();
        if (features.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE")) {
            bundle.putBoolean("isDynamicGroupRoute", true);
        }
        if (features.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK") && (stringArrayList = extras.getStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS")) != null && !stringArrayList.isEmpty()) {
            wmyVar.e(stringArrayList);
        }
        return wmyVar.h();
    }

    public static final void a(y6v0 y6v0Var) {
        ConstraintLayout constraintLayout = y6v0Var.a;
        String string = constraintLayout.getResources().getString(y6v0Var.e.isChecked() ? 2131960211 : 2131960212, y6v0Var.d.getText(), y6v0Var.c.getText());
        if (Build.VERSION.SDK_INT <= 35) {
            constraintLayout.announceForAccessibility(string);
        } else {
            constraintLayout.setStateDescription(string);
        }
    }

    public static Context b(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static pfb c(hi hiVar) {
        qi qiVar = (qi) hiVar;
        String strB = qiVar.b();
        String strA = qiVar.i.a();
        String str = qiVar.d;
        if (str == null) {
            str = "1024";
        }
        return new pfb(strB, strA, str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014 A[Catch: NullPointerException -> 0x0030, TRY_LEAVE, TryCatch #2 {NullPointerException -> 0x0030, blocks: (B:3:0x0003, B:5:0x0009, B:8:0x0014), top: B:30:0x0003 }] */
    public static pfb d(Parcelable parcelable) {
        String name;
        String address;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelable;
        String strValueOf = null;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                name = bluetoothDevice.getAlias();
                if (TextUtils.isEmpty(name)) {
                    name = bluetoothDevice.getName();
                }
            } else {
                name = bluetoothDevice.getName();
            }
            try {
                address = bluetoothDevice.getAddress();
                try {
                    BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                    if (bluetoothClass != null) {
                        strValueOf = String.valueOf(bluetoothClass.getDeviceClass());
                    }
                } catch (NullPointerException e) {
                    e = e;
                    n57.t("Unexpected null pointer from BT api", e);
                }
            } catch (NullPointerException e2) {
                e = e2;
                address = null;
            }
        } catch (NullPointerException e3) {
            e = e3;
            name = null;
            address = null;
        }
        if (strValueOf == null) {
            strValueOf = "1024";
        }
        return new pfb(name, address, strValueOf);
    }

    public static Icon e(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String f(Context context) {
        return context.getAttributionTag();
    }

    public static int g(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return uh61.c(context.getSystemService(uh61.f())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    public static ArrayList h(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    public static List i(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, SemanticState.Focused).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, w081.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static u081 j(Context context) {
        if (a == null) {
            try {
                a = (u081) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, w081.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new u081();
            }
        }
        return a;
    }

    public static List k(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            return t081.a(context, uh61.c(context.getSystemService(uh61.f())).getShortcuts(i));
        }
        if (i2 < 25) {
            if ((i & 2) != 0) {
                try {
                    j(context).getClass();
                    return new ArrayList();
                } catch (Exception unused) {
                }
            }
            return Collections.EMPTY_LIST;
        }
        ShortcutManager shortcutManagerC = uh61.c(context.getSystemService(uh61.f()));
        ArrayList arrayList = new ArrayList();
        if ((i & 1) != 0) {
            arrayList.addAll(shortcutManagerC.getManifestShortcuts());
        }
        if ((i & 2) != 0) {
            arrayList.addAll(shortcutManagerC.getDynamicShortcuts());
        }
        if ((i & 4) != 0) {
            arrayList.addAll(shortcutManagerC.getPinnedShortcuts());
        }
        return t081.a(context, arrayList);
    }

    public static CharSequence l(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static String m(jh0 jh0Var) {
        if (jh0Var instanceof hh0) {
            return "image/*";
        }
        if (jh0Var instanceof ih0) {
            return "video/*";
        }
        if (jh0Var instanceof gh0) {
            return null;
        }
        eg.o();
        return null;
    }

    public static Insets n(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean o() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static boolean p(Context context) {
        UserManager userManager;
        return Build.VERSION.SDK_INT >= 30 && (userManager = (UserManager) context.getSystemService(UserManager.class)) != null && userManager.isManagedProfile();
    }

    public static boolean q(Context context, t081 t081Var) {
        IconCompat iconCompat;
        int i;
        InputStream inputStreamL;
        Bitmap bitmapDecodeStream;
        context.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int iG = g(context);
        if (iG != 0) {
            if (i2 <= 29 && (iconCompat = t081Var.h) != null && (((i = iconCompat.a) == 6 || i == 4) && (inputStreamL = iconCompat.l(context)) != null && (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamL)) != null)) {
                t081Var.h = i == 6 ? IconCompat.c(bitmapDecodeStream) : IconCompat.d(bitmapDecodeStream);
            }
            int i3 = -1;
            if (i2 >= 30) {
                uh61.c(context.getSystemService(uh61.f())).pushDynamicShortcut(t081Var.b());
            } else if (i2 >= 25) {
                ShortcutManager shortcutManagerC = uh61.c(context.getSystemService(uh61.f()));
                if (!shortcutManagerC.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = shortcutManagerC.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= iG) {
                        int rank = -1;
                        String id = null;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                            if (shortcutInfo.getRank() > rank) {
                                id = shortcutInfo.getId();
                                rank = shortcutInfo.getRank();
                            }
                        }
                        shortcutManagerC.removeDynamicShortcuts(Arrays.asList(id));
                    }
                    shortcutManagerC.addDynamicShortcuts(Arrays.asList(t081Var.b()));
                }
            }
            try {
                j(context).getClass();
                ArrayList<t081> arrayList = new ArrayList();
                if (arrayList.size() >= iG) {
                    String[] strArr = new String[1];
                    String str = null;
                    for (t081 t081Var2 : arrayList) {
                        int i4 = t081Var2.m;
                        if (i4 > i3) {
                            str = t081Var2.b;
                            i3 = i4;
                        }
                    }
                    strArr[0] = str;
                    Arrays.asList(strArr);
                }
                Arrays.asList(t081Var);
                Iterator it = ((ArrayList) i(context)).iterator();
                if (!it.hasNext()) {
                    x(context, t081Var.b);
                    return true;
                }
                if (it.next() != null) {
                    bhn0.d();
                    return false;
                }
                Collections.singletonList(t081Var);
                throw null;
            } catch (Exception unused) {
                Iterator it2 = ((ArrayList) i(context)).iterator();
                if (!it2.hasNext()) {
                    x(context, t081Var.b);
                    return false;
                }
                if (it2.next() != null) {
                    bhn0.d();
                    return false;
                }
                Collections.singletonList(t081Var);
                throw null;
            } catch (Throwable th) {
                Iterator it3 = ((ArrayList) i(context)).iterator();
                if (!it3.hasNext()) {
                    x(context, t081Var.b);
                    throw th;
                }
                if (it3.next() != null) {
                    bhn0.d();
                    return false;
                }
                Collections.singletonList(t081Var);
                throw null;
            }
        }
        return false;
    }

    public static boolean r(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean s(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean t(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void u(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            uh61.c(context.getSystemService(uh61.f())).removeAllDynamicShortcuts();
        }
        j(context).getClass();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
    }

    public static void v(Context context, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            uh61.c(context.getSystemService(uh61.f())).removeDynamicShortcuts(list);
        }
        j(context).getClass();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
    }

    public static void w(Context context, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT < 30) {
            v(context, arrayList);
            return;
        }
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeLongLivedShortcuts(arrayList);
        j(context).getClass();
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
    }

    public static void x(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            uh61.c(context.getSystemService(uh61.f())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) i(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                bhn0.d();
            } else {
                Collections.singletonList(str);
                throw null;
            }
        }
    }

    public static void y(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | SemanticState.Hidden);
        window.setDecorFitsSystemWindows(z);
    }

    public static void z(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }
}
