package p;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.gpb.googlecheckout.GoogleCheckoutActivity;
import com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public class e1r0 extends o1p1 {
    public static final e1r0 d = new e1r0(0);
    public final /* synthetic */ byte c;

    public /* synthetic */ e1r0(byte b) {
        this.c = b;
    }

    public cp5 A(Context context, Object obj) {
        switch (this.c) {
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                String[] strArr = (String[]) obj;
                if (strArr.length == 0) {
                    return new cp5(b7x.a, (byte) 4);
                }
                for (String str : strArr) {
                    if (x74.j(context, str) != 0) {
                        return null;
                    }
                }
                int iS = zno1.s(strArr.length);
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new cp5(linkedHashMap, (byte) 4);
            case 4:
                if (x74.j(context, (String) obj) == 0) {
                    return new cp5(Boolean.TRUE, (byte) 4);
                }
                return null;
            case 5:
            case 6:
            default:
                return super.A(context, obj);
            case 7:
                return null;
            case 8:
                return null;
        }
    }

    public final Object D(Intent intent, int i) {
        z6x arrayList;
        Uri data;
        Bundle extras;
        h3b1 h3b1Var;
        z = false;
        boolean z = false;
        switch (this.c) {
            case 0:
                return rih1.a;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 2:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data2 = intent.getData();
                if (data2 != null) {
                    return data2;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data3 = intent.getData();
                if (data3 != null) {
                    linkedHashSet.add(data3);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = z6x.a;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            Uri uri = clipData.getItemAt(i2).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) o7h.s0(arrayList);
            case 3:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        return sqg0.T(o7h.v1(f46.i0(stringArrayExtra), arrayList2));
                    }
                }
                return b7x.a;
            case 4:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    for (int i4 : intArrayExtra2) {
                        if (i4 == 0) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                return new ah0(intent, i);
            case 6:
                return new ah0(intent, i);
            case 7:
                return Boolean.valueOf(i == -1);
            case 8:
                return Boolean.valueOf(i == -1);
            case 9:
                return new ah0(intent, i);
            case 10:
                GoogleCheckoutActivity.j1.getClass();
                g250 g250Var = intent != null ? (g250) ila0.s(intent, "EXTRA_CHECKOUT_RESULT", g250.class) : null;
                return g250Var == null ? c250.a : g250Var;
            case 11:
                if (i != -1) {
                    if (i == 100) {
                        return ays0.a;
                    }
                } else if (intent != null && (data = intent.getData()) != null) {
                    return new bys0(data);
                }
                return zxs0.a;
            default:
                return (intent == null || (extras = intent.getExtras()) == null || (h3b1Var = (h3b1) jhc1.v(extras, "EXTRA_CHECKOUT_RESULT", h3b1.class)) == null) ? h3b1.b : h3b1Var;
        }
    }

    public Intent I(Context context, Uri uri) {
        return new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", uri);
    }

    public Intent J(Context context, mvs0 mvs0Var) {
        if (w081.o()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(w081.m(mvs0Var.a));
            mvs0Var.c.getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            return intent;
        }
        if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(w081.m(mvs0Var.a));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        if (resolveInfoResolveActivity == null) {
            eg.m("Required value was null.");
            return null;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(w081.m(mvs0Var.a));
        mvs0Var.c.getClass();
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        return intent3;
    }

    public Intent z(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.c) {
            case 0:
                return (Intent) obj;
            case 1:
                return new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", (String[]) obj).setType("*/*");
            case 2:
                return J(context, (mvs0) obj);
            case 3:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 4:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
            case 5:
                return (Intent) obj;
            case 6:
                return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (kt80) obj);
            case 7:
                return I(context, (Uri) obj);
            case 8:
                return new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", (Uri) obj).addFlags(3);
            case 9:
                kt80 kt80Var = (kt80) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = kt80Var.b;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        kt80Var = new kt80(kt80Var.a, null, kt80Var.c, kt80Var.d);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kt80Var);
                if (th30.P(2)) {
                    intent.toString();
                }
                return intent;
            case 10:
                Intent intent3 = new Intent(context, (Class<?>) GoogleCheckoutActivity.class);
                intent3.putExtra("CHECKOUT_ARGS_PARAM", (Parcelable) obj);
                return intent3;
            case 11:
                Intent intent4 = new Intent(context, (Class<?>) PictureSelectionActivity.class);
                intent4.putExtra("using-camera", ((yxs0) obj).a);
                return intent4;
            default:
                Intent intent5 = new Intent(context, (Class<?>) SpotifyCheckoutActivity.class);
                intent5.putExtra("EXTRA_ARGS", (Parcelable) obj);
                return intent5;
        }
    }
}
