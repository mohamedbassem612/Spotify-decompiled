package p;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.LocaleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.res.Configuration;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.graphics.text.LineBreakConfig;
import android.hardware.camera2.CameraCharacteristics;
import android.icu.text.ListFormatter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class gg {
    public static boolean A(m9v m9vVar) {
        return m9vVar.isSelectedChildViewEnabled();
    }

    public static boolean B(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final String C(c380 c380Var, b0k b0kVar, int i, int i2) {
        ListFormatter listFormatter;
        ListFormatter.Width width;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(-1617465837);
        boolean z = true;
        int i3 = (i2 & 1) != 0 ? 2 : 1;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            x340Var.i0(-685411436);
            if ((((i & 14) ^ 6) <= 4 || !x340Var.g(c380Var)) && (i & 6) != 4) {
                z = false;
            }
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = o7h.y0(c380Var, ", ", (String) null, (String) null, (iu30) null, 62);
                x340Var.s0(objT);
            }
            String str = (String) objT;
            x340Var.r(false);
            x340Var.r(false);
            return str;
        }
        x340Var.i0(-686451331);
        Locale locale = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).getLocales().get(0);
        boolean zG = x340Var.g(locale);
        Object objT2 = x340Var.T();
        if (zG || objT2 == obj) {
            if (i4 >= 33) {
                int iC = l1d.C(i3);
                if (iC == 0) {
                    width = ListFormatter.Width.WIDE;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    width = ListFormatter.Width.NARROW;
                }
                listFormatter = ListFormatter.getInstance(locale, ListFormatter.Type.AND, width);
            } else {
                listFormatter = ListFormatter.getInstance(locale);
            }
            objT2 = listFormatter;
            x340Var.s0(objT2);
        }
        objT2.getClass();
        ListFormatter listFormatter2 = (ListFormatter) objT2;
        boolean zG2 = x340Var.g(listFormatter2);
        if ((((i & 14) ^ 6) <= 4 || !x340Var.g(c380Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = zG2 | z;
        Object objT3 = x340Var.T();
        if (z2 || objT3 == obj) {
            objT3 = listFormatter2.format((Collection<?>) c380Var);
            x340Var.s0(objT3);
        }
        objT3.getClass();
        String str2 = (String) objT3;
        x340Var.r(false);
        x340Var.r(false);
        return str2;
    }

    public static LocaleList D(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void E(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static LinkedHashMap F(Parcel parcel) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = Build.VERSION.SDK_INT >= 33 ? parcel.readHashMap(LinkedHashMap.class.getClassLoader(), String.class, Object.class) : parcel.readHashMap(LinkedHashMap.class.getClassLoader());
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static wh5 G(v1f1 v1f1Var) {
        return new wh5(v1f1Var, (byte) 3);
    }

    public static final void H(Intent intent, ou80 ou80Var) {
        intent.putExtra("extra_interaction_id", (Serializable) new ou80(ou80Var.a));
    }

    public static final void I(Intent intent, tv80 tv80Var) {
        intent.putExtra("extra_interaction_logging_result", (Parcelable) tv80Var);
        intent.putExtra("extra_interaction_id", (Serializable) tv80Var.a);
    }

    public static final void J(Intent intent, nsn0 nsn0Var) {
        intent.putExtra("extra_navigation_action", (Serializable) nsn0Var);
    }

    public static void K(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static final void L(CursorAnchorInfo.Builder builder, n511 n511Var) {
        builder.setEditorBoundsInfo(rqb.d().setEditorBounds(l0p1.v(n511Var)).setHandwritingBounds(l0p1.v(n511Var)).build());
    }

    public static final void M(CursorAnchorInfo.Builder builder, n511 n511Var) {
        builder.setEditorBoundsInfo(rqb.d().setEditorBounds(l0p1.v(n511Var)).setHandwritingBounds(l0p1.v(n511Var)).build());
    }

    public static void N(ShortcutInfo.Builder builder) {
        builder.setExcludedFromSurfaces(0);
    }

    public static final void O(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static void P(m9v m9vVar, boolean z) {
        m9vVar.setSelectedChildViewEnabled(z);
    }

    public static void Q(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c2  */
    public static final s2m R(Bundle bundle, String str) {
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        ArrayList parcelableArrayList3;
        c380 c380VarA;
        k620 m231Var;
        k620 k620Var;
        Parcelable parcelable;
        k620 m231Var2;
        String string = bundle.getString("query", "");
        int i = Build.VERSION.SDK_INT;
        ArrayList arrayList = z6x.a;
        if (i < 33 ? (parcelableArrayList = bundle.getParcelableArrayList("results")) == null : (parcelableArrayList = bundle.getParcelableArrayList("results", hby.class)) == null) {
            parcelableArrayList = arrayList;
        }
        c380 c380VarA2 = mqo1.A(parcelableArrayList);
        if (i < 33 ? (parcelableArrayList2 = bundle.getParcelableArrayList("recommendations")) == null : (parcelableArrayList2 = bundle.getParcelableArrayList("recommendations", hby.class)) == null) {
            parcelableArrayList2 = arrayList;
        }
        c380 c380VarA3 = mqo1.A(parcelableArrayList2);
        if (i < 33 ? (parcelableArrayList3 = bundle.getParcelableArrayList("recent_searches")) != null : (parcelableArrayList3 = bundle.getParcelableArrayList("recent_searches", hby.class)) != null) {
            arrayList = parcelableArrayList3;
        }
        c380 c380VarA4 = mqo1.A(arrayList);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("available_filters");
        if (stringArrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : stringArrayList) {
                try {
                    str2.getClass();
                    m231Var2 = k620.valueOf(str2);
                } catch (Throwable th) {
                    m231Var2 = new m231(th);
                }
                if (m231Var2 instanceof m231) {
                    m231Var2 = null;
                }
                k620 k620Var2 = m231Var2;
                if (k620Var2 != null) {
                    arrayList2.add(k620Var2);
                }
            }
            c380VarA = mqo1.A(arrayList2);
            if (c380VarA == null) {
                c380VarA = fg91.b;
            }
        } else {
            c380VarA = fg91.b;
        }
        c380 c380Var = c380VarA;
        String string2 = bundle.getString("selected_filter");
        if (string2 != null) {
            try {
                m231Var = k620.valueOf(string2);
            } catch (Throwable th2) {
                m231Var = new m231(th2);
            }
            if (m231Var instanceof m231) {
                m231Var = null;
            }
            k620Var = m231Var;
            if (k620Var == null) {
                k620Var = k620.a;
            }
        } else {
            k620Var = k620.a;
        }
        k620 k620Var3 = k620Var;
        boolean z = bundle.getBoolean("is_searching", false);
        boolean z2 = bundle.getBoolean("is_loading_recommendations", true);
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("error", f2m.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("error");
            parcelable = (f2m) (parcelable2 instanceof f2m ? parcelable2 : null);
        }
        return new s2m(str, string, c380VarA2, c380VarA3, c380VarA4, c380Var, k620Var3, z, z2, (f2m) parcelable);
    }

    public static void S(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void T(Object obj, wh5 wh5Var) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(wh5Var);
    }

    public static void U(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static final Shader a(Shader shader, long j, float f, float f2) {
        RuntimeShader runtimeShader = shader instanceof RuntimeShader ? (RuntimeShader) shader : null;
        if (runtimeShader == null) {
            runtimeShader = new RuntimeShader("\n/**\n * Rotating linear gradient shader, where rotation is controlled by iRotation uniform.\n * This is essentially the same as:\n * LinearGradientShader(\n *     colors = FocusedHighlightColors,\n *     colorStops = FocusedHighlightColorStops,\n *     from = Offset.Zero,\n *     to = Offset(size.width, size.height),\n * )\n * But allowing for efficient rotation, instead of needing to create a new shader / brush every\n * frame with new coordinates.\n */\n// Width / height\nuniform float2 iResolution;\n// Rotation in radians. 0 radians means a horizontal gradient.\n// Positive values will have the effect of rotating the gradient clockwise.\nuniform float iRotation;\n// Alpha animation progress from 0 to 1. This will be applied to the color stops so that each\n// color stop will fade in.\nuniform float iAlphaProgress;\n\nhalf4 main(float2 fragCoord) {\n    // Horizontal gradient\n    half4 colors[4];\n    colors[0] = half4(1.0, 1.0, 1.0, 1.0 * iAlphaProgress); // White with 100% alpha\n    colors[1] = half4(1.0, 1.0, 1.0, 0.2 * iAlphaProgress); // White with 20% alpha\n    colors[2] = half4(1.0, 1.0, 1.0, 0.2 * iAlphaProgress); // White with 20% alpha\n    colors[3] = half4(1.0, 1.0, 1.0, 0.8 * iAlphaProgress); // White with 80% alpha\n\n    // Stops for the horizontal gradient\n    float stops[4];\n    stops[0] = 0.0;\n    stops[1] = 0.3;\n    stops[2] = 0.66;\n    stops[3] = 1.0;\n\n    // Normalize\n    half2 uv = fragCoord.xy / iResolution.xy;\n\n    // Offset around a rotational center\n    half2 rotationCenter = half2(0.5, 0.5);\n    uv -= rotationCenter;\n\n    // Rotate\n    // We rotate in the opposite direction as we are rotating the coordinate we sample the gradient\n    // from. To create the effect of a gradient 'moving' clockwise, we need to move the\n    // coordinate in the opposite direction (counter-clockwise).\n    float2x2 matrix = float2x2(cos(-iRotation),-sin(-iRotation),sin(-iRotation),cos(-iRotation));\n    uv *= matrix;\n\n    // Translate back into [0,1] space\n    uv += rotationCenter;\n\n    // Blend through stops using the x coordinate, since we have a horizontal gradient\n    half4 color = mix(colors[0], colors[1], smoothstep(stops[0], stops[1], uv.x));\n    color = mix(color, colors[2], smoothstep(stops[1], stops[2], uv.x));\n    color = mix(color, colors[3], smoothstep(stops[2], stops[3], uv.x));\n\n    return color;\n}\n");
        }
        runtimeShader.setFloatUniform("iResolution", Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        runtimeShader.setFloatUniform("iRotation", f);
        runtimeShader.setFloatUniform("iAlphaProgress", f2);
        return runtimeShader;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException */
    public static r250 b(Bundle bundle) throws GoogleIdTokenParsingException {
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            return new r250(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e) {
            throw new GoogleIdTokenParsingException(e);
        }
    }

    public static wh5 c(ckj ckjVar) {
        return new wh5(ckjVar, (byte) 2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public static final nsn0 d(Intent intent) {
        ou80 ou80VarK;
        lsn0 lsn0Var;
        nsn0 nsn0Var;
        String string;
        tv80 tv80VarM = m(intent);
        if (tv80VarM == null || (ou80VarK = tv80VarM.a) == null) {
            ou80VarK = k(intent);
        }
        nsn0 nsn0Var2 = null;
        if (ou80VarK == null || ou80VarK.a.length() == 0) {
            lsn0Var = null;
        } else {
            Uri data = intent.getData();
            if (data == null) {
                string = null;
            } else {
                if ("open.spotify.com".equals(data.getHost()) || "play.spotify.com".equals(data.getHost())) {
                    data = null;
                }
                if (data != null) {
                    string = data.toString();
                } else {
                    string = null;
                }
            }
            lsn0Var = new lsn0(string, ou80VarK);
        }
        if (lsn0Var != null) {
            return lsn0Var;
        }
        try {
            if (Build.VERSION.SDK_INT < 33) {
                Serializable serializableExtra = intent.getSerializableExtra("extra_navigation_action");
                if (serializableExtra instanceof nsn0) {
                    nsn0Var = (nsn0) serializableExtra;
                }
                if (nsn0Var2 == null) {
                    return jsn0.a;
                }
                return nsn0Var2;
            }
            nsn0Var = (nsn0) intent.getSerializableExtra("extra_navigation_action", nsn0.class);
            nsn0Var2 = nsn0Var;
        } catch (Exception unused) {
        }
        if (nsn0Var2 == null) {
            return jsn0.a;
        }
        return nsn0Var2;
    }

    public static OnBackInvokedDispatcher e(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }

    public static ArrayList f(Context context) {
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = z6x.a;
        }
        ArrayList arrayListO0 = o7h.o0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListO0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            arrayList2.add(new grw0(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2.equals(str)));
        }
        return arrayList2;
    }

    public static long g(Context context) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).getLongVersionCode();
    }

    public static qp7 h(AudioManager audioManager, po7 po7Var, b380 b380Var, List list) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(po7Var.c());
        HashMap map = new HashMap();
        map.put(2, new HashSet(bmq0.f(new int[]{12})));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (zoi1.P(format) || qp7.h.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(bmq0.f(audioProfile.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(bmq0.f(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        v280 v280VarM = b380.m();
        for (Map.Entry entry : map.entrySet()) {
            v280VarM.c(new pp7(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new qp7(v280VarM.g(), b380Var, list);
    }

    public static grw0 i(Context context) {
        Object next;
        int iMyPid = Process.myPid();
        Iterator it = f(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((grw0) next).b != iMyPid);
        grw0 grw0Var = (grw0) next;
        return grw0Var == null ? new grw0(s(), iMyPid, 0, false) : grw0Var;
    }

    public static AudioDeviceInfo j(AudioManager audioManager, po7 po7Var) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(po7Var.c());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static ou80 k(Intent intent) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return intent.getSerializableExtra("extra_interaction_id", ou80.class);
            }
            ou80 serializableExtra = intent.getSerializableExtra("extra_interaction_id");
            if (serializableExtra instanceof ou80) {
                return serializableExtra;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final tv80 l(Intent intent) {
        tv80 tv80VarM = m(intent);
        if (tv80VarM == null) {
            ou80 ou80VarK = k(intent);
            tv80VarM = null;
            if (ou80VarK != null) {
                return new tv80(ou80VarK, (y6r0) null);
            }
        }
        return tv80VarM;
    }

    public static tv80 m(Intent intent) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                return (tv80) intent.getParcelableExtra("extra_interaction_logging_result", tv80.class);
            }
            tv80 parcelableExtra = intent.getParcelableExtra("extra_interaction_logging_result");
            if (parcelableExtra instanceof tv80) {
                return parcelableExtra;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int n() {
        int i = Build.VERSION.SDK_INT;
        return (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Alert.DURATION_SHOW_INDEFINITELY : MediaStore.getPickImagesMaxLimit();
    }

    public static OnBackInvokedDispatcher o(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static Object p(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] q(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArray(str, cls);
    }

    public static ArrayList r(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static String s() throws Throwable {
        String processName;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return Process.myProcessName();
        }
        if (i >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        }
        String strS = ph5.s();
        return strS != null ? strS : "";
    }

    public static liv t(w2d w2dVar) {
        Long l = (Long) w2dVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l != null) {
            return (liv) miv.a.get(l);
        }
        return null;
    }

    public static Serializable u(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static SparseArray v(Bundle bundle, String str, Class cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    public static String w(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics x(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean y(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean z(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }
}
