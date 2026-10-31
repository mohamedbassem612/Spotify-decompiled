package p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.LocusId;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.graphics.text.MeasuredText;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.PopupWindow;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import app.p000rive.semantics.SemanticState;
import com.comscore.streaming.ContentType;
import com.comscore.streaming.WindowState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class x74 {
    public static int A(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            ge30 ge30Var = new ge30();
            ge30Var.o = asj0.p("video/avc");
            ie30 ie30Var = new ie30(ge30Var);
            if (ie30Var.f66p != null) {
                bg11 bg11VarH = hkh0.h(ie30Var, z, false);
                for (int i = 0; i < bg11VarH.d; i++) {
                    if (((bkh0) bg11VarH.get(i)).d != null && (videoCapabilities = ((bkh0) bg11VarH.get(i)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        i15.o();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i2 = 0; i2 < supportedPerformancePoints.size(); i2++) {
                            if (swg0.d(supportedPerformancePoints.get(i2)).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil.DecoderQueryException unused) {
        }
        return 0;
    }

    public static String B(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return jbc.a(context);
        }
        return null;
    }

    public static String C(MediaCodec mediaCodec) {
        return mediaCodec.getCanonicalName();
    }

    public static int D(Context context, int i) {
        return context.getColor(i);
    }

    public static ColorStateList E(Context context, int i) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        nx21 nx21Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ox21 ox21Var = new ox21(resources, theme);
        synchronized (qx21.c) {
            try {
                SparseArray sparseArray = (SparseArray) qx21.b.get(ox21Var);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (nx21Var = (nx21) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (nx21Var.b.equals(resources.getConfiguration())) {
                        if (theme != null || nx21Var.c != 0) {
                            if (theme == null || nx21Var.c != theme.hashCode()) {
                            }
                        }
                        colorStateList = nx21Var.a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = qx21.a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListA = lah.a(resources, resources.getXml(i), theme);
            } catch (Exception unused) {
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (qx21.c) {
            try {
                WeakHashMap weakHashMap = qx21.b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(ox21Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(ox21Var, sparseArray2);
                }
                sparseArray2.append(i, new nx21(colorStateListA, ox21Var.a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListA;
    }

    public static bg11 F(po7 po7Var) {
        v280 v280VarM = b380.m();
        mjh1 mjh1VarK = qp7.h.i().k();
        while (mjh1VarK.hasNext()) {
            Integer num = (Integer) mjh1VarK.next();
            int iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT >= zoi1.w(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), po7Var.c())) {
                v280VarM.c(num);
            }
        }
        v280VarM.c(2);
        return v280VarM.g();
    }

    public static Drawable G(Context context, int i) {
        return context.getDrawable(i);
    }

    public static File[] H(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] I(Context context) {
        return context.getExternalFilesDirs(null);
    }

    public static float J(MediaFormat mediaFormat) {
        int integer;
        if (!mediaFormat.containsKey("frame-rate")) {
            return -1.0f;
        }
        if (Build.VERSION.SDK_INT < 29) {
            try {
                return mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                integer = mediaFormat.getInteger("frame-rate");
            }
        } else {
            if (mediaFormat.getValueTypeForKey("frame-rate") == 3) {
                return mediaFormat.getFloat("frame-rate");
            }
            integer = mediaFormat.getInteger("frame-rate");
        }
        return integer;
    }

    public static Typeface K(Context context, int i, int i2) {
        Typeface m231Var;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        try {
            Object obj = (Object[]) ca30.a.get(Integer.valueOf(i));
            if (obj == null) {
                obj = new String[0];
            }
            m231Var = Y(context, i, (String[]) obj, i2);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            n57.g("Failed to load font stack for fontResourceId = " + i, thA);
        }
        return m231Var instanceof m231 ? null : m231Var;
    }

    public static int M(MediaFormat mediaFormat, String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaFormat.getInteger(str, i);
        }
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    public static Executor N(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? ph5.r(context) : new ir4(new Handler(context.getMainLooper()));
    }

    public static int O(int i, int i2, po7 po7Var) {
        for (int i3 = 10; i3 > 0; i3--) {
            int iX = zoi1.x(i3);
            if (iX != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(iX).build(), po7Var.c())) {
                return i3;
            }
        }
        return 0;
    }

    public static String P(Context context) {
        return context.getOpPackageName();
    }

    public static Insets Q(Drawable drawable) {
        return drawable.getOpticalInsets();
    }

    public static int R(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static Object S(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    public static final void T(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static final long U(ha4 ha4Var) {
        return ha4Var.getUniqueDrawingId();
    }

    public static void V(Context context) {
        boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            Context applicationContext2 = context.getApplicationContext();
            PackageManager packageManager = applicationContext2.getPackageManager();
            z = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), SemanticState.Focused)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? true : applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (!wyo1.k()) {
            o0c.z((Object) null);
            return;
        }
        hfp1 hfp1Var = new hfp1();
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                Context applicationContext3 = context.getApplicationContext();
                if (applicationContext3 == null) {
                    applicationContext3 = context;
                }
                SharedPreferences.Editor editorEdit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("proxy_notification_initialized", true);
                editorEdit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate(null);
                }
            } else {
                context.getPackageName();
            }
        } finally {
            hfp1Var.t((Object) null);
        }
    }

    public static boolean W(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean X(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static Typeface Y(Context context, int i, String[] strArr, int i2) {
        Typeface typefaceBuild;
        String str;
        int iDeepHashCode = Arrays.deepHashCode(strArr);
        Typeface typeface = (Typeface) lyx.a.get(Integer.valueOf(iDeepHashCode));
        if (typeface != null) {
            return typeface;
        }
        Typeface.CustomFallbackBuilder customFallbackBuilder = null;
        for (String str2 : strArr) {
            HashMap map = lyx.b;
            Object objValueOf = map.get(str2);
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(context.getResources().getIdentifier(str2, "font", context.getPackageName()));
                map.put(str2, objValueOf);
            }
            int iIntValue = ((Number) objValueOf).intValue();
            if (iIntValue > 0) {
                i15.q();
                FontFamily fontFamilyBuild = new FontFamily.Builder(new Font.Builder(context.getResources(), iIntValue).build()).build();
                if (customFallbackBuilder == null) {
                    customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                } else {
                    customFallbackBuilder.addCustomFallback(fontFamilyBuild).getClass();
                }
            }
        }
        if (customFallbackBuilder != null) {
            Typeface.CustomFallbackBuilder style = customFallbackBuilder.setStyle(new FontStyle(lyx.c.contains(Integer.valueOf(i)) ? 700 : lyx.d.contains(Integer.valueOf(i)) ? 800 : WindowState.NORMAL, 0));
            if (i2 == 1) {
                str = "sans-serif";
            } else {
                if (i2 != 2) {
                    throw null;
                }
                str = "monospace";
            }
            style.setSystemFallback(str);
        }
        if (customFallbackBuilder == null || (typefaceBuild = customFallbackBuilder.build()) == null) {
            return null;
        }
        lyx.a.put(Integer.valueOf(iDeepHashCode), typefaceBuild);
        return typefaceBuild;
    }

    public static void Z(MediaFormat mediaFormat, x8h x8hVar) {
        if (x8hVar != null) {
            a0(mediaFormat, "color-transfer", x8hVar.c);
            a0(mediaFormat, "color-standard", x8hVar.a);
            a0(mediaFormat, "color-range", x8hVar.b);
            byte[] bArr = x8hVar.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static final void a(boolean z, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0VarA;
        mia miaVar = mia.l;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1195758920);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.i0(-1926909850);
            rih1 rih1Var = rih1.a;
            qim0 qim0Var = nim0.a;
            if (z) {
                qim0 qim0VarB = f8d1.b(qim0Var, rih1Var, miaVar);
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = s8x.t;
                    x340Var.s0(objT);
                }
                qim0VarA = s161.a(qim0VarB, (iu30) objT);
            } else {
                qim0VarA = qim0Var;
            }
            x340Var.r(false);
            gfh0 gfh0VarC = t1c.c(een.d, true);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(x340Var, 6);
            if (z) {
                x340Var.i0(1878060548);
                t1c.a(f8d1.b(h2c.a.b(qim0Var), rih1Var, miaVar), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(1878260436);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ok6((byte) 4, i, j2iVar, z);
        }
    }

    public static void a0(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static final void b(long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1427876945);
        int i2 = (x340Var.f(j) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.5f);
                tr80 tr80Var = new tr80(0, 10, 1);
                ArrayList arrayList = new ArrayList(q7h.U(tr80Var, 10));
                lr80 it = tr80Var.iterator();
                while (((sr80) it).c) {
                    arrayList.add(new u7h(u7h.b(j, decelerateInterpolator.getInterpolation(it.nextInt() / 10.0f), 0.0f, 0.0f, 0.0f, 14)));
                }
                x340Var.s0(arrayList);
                objT = arrayList;
            }
            t1c.a(dug.e(u291.f(nim0.a, 1.0f), v9c.s((List) objT, 0.0f, 0.0f, 14), (hw61) null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sre(j, i, (byte) 17);
        }
    }

    public static String b0(Context context) {
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (pro1.k(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            str = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (pro1.k(context, str) == 0) {
                return str;
            }
        }
        jah.g(f4i1.f("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static final void c(vy71 vy71Var, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, vu30 vu30Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-33109496);
        int i2 = i | (x340Var.g(vy71Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.h(z) ? SemanticState.Hidden : SemanticState.Focused) | (x340Var.h(z2) ? SemanticState.Modal : SemanticState.ReadOnly) | (x340Var.h(z3) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline) | (x340Var.h(z4) ? 131072 : 65536) | (x340Var.h(z5) ? 1048576 : 524288) | (x340Var.i(vu30Var) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (i2 & 38347923) != 38347922)) {
            ViewParent parent = ((View) x340Var.k(AndroidCompositionLocals_androidKt.f)).getParent();
            a4u a4uVar = parent instanceof a4u ? (a4u) parent : null;
            Window window = a4uVar != null ? a4uVar.getWindow() : null;
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var).g;
            u85 u85Var2 = lhc.g(x340Var).c;
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            Object obj = objT;
            if (objT == m4cVar) {
                q811 q811Var = new q811();
                q811Var.a = 0;
                x340Var.s0(q811Var);
                obj = q811Var;
            }
            q811 q811Var2 = (q811) obj;
            boolean zG = ((i2 & 7168) == 2048) | x340Var.g(u85Var) | ((i2 & 3670016) == 1048576) | x340Var.g(u85Var2) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | ((29360128 & i2) == 8388608) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384) | ((i2 & 14) == 4) | x340Var.i(window) | x340Var.i(q811Var2) | ((i2 & 458752) == 131072);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                qim0Var = null;
                objT2 = new mcx(u85Var, vu30Var, z3, vy71Var, window, q811Var2, z5, u85Var2, j, z, z2, j2iVar, z4);
                x340Var.s0(objT2);
            } else {
                qim0Var = null;
            }
            ejo1.l(0, 1, x340Var, (vu30) objT2, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncx(vy71Var, j, z, z2, z3, z4, z5, vu30Var, j2iVar, i);
        }
    }

    public static Object c0(int i) {
        switch (l1d.C(i)) {
            case 0:
                return BlendMode.CLEAR;
            case 1:
                return BlendMode.SRC;
            case 2:
                return BlendMode.DST;
            case 3:
                return BlendMode.SRC_OVER;
            case 4:
                return BlendMode.DST_OVER;
            case 5:
                return BlendMode.SRC_IN;
            case 6:
                return BlendMode.DST_IN;
            case 7:
                return BlendMode.SRC_OUT;
            case 8:
                return BlendMode.DST_OUT;
            case 9:
                return BlendMode.SRC_ATOP;
            case 10:
                return BlendMode.DST_ATOP;
            case 11:
                return BlendMode.XOR;
            case 12:
                return BlendMode.PLUS;
            case 13:
                return BlendMode.MODULATE;
            case 14:
                return BlendMode.SCREEN;
            case 15:
                return BlendMode.OVERLAY;
            case 16:
                return BlendMode.DARKEN;
            case 17:
                return BlendMode.LIGHTEN;
            case 18:
                return BlendMode.COLOR_DODGE;
            case 19:
                return BlendMode.COLOR_BURN;
            case 20:
                return BlendMode.HARD_LIGHT;
            case 21:
                return BlendMode.SOFT_LIGHT;
            case 22:
                return BlendMode.DIFFERENCE;
            case 23:
                return BlendMode.EXCLUSION;
            case 24:
                return BlendMode.MULTIPLY;
            case 25:
                return BlendMode.HUE;
            case 26:
                return BlendMode.SATURATION;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return BlendMode.COLOR;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static final void d(scx scxVar, vy71 vy71Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(509971999);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(scxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(vy71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new q811();
                x340Var.s0(objT);
            }
            q811 q811Var = (q811) objT;
            q811Var.a = function0;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new i5w(scxVar, (byte) 12);
                x340Var.s0(objT2);
            }
            qxd0.i(scxVar, (iu30) objT2, x340Var);
            if (((Boolean) scxVar.a.getValue()).booleanValue()) {
                x340Var.i0(1276907071);
                boolean zI = ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32) | x340Var.i(q811Var) | (i3 == 4);
                Object objT3 = x340Var.T();
                if (zI || objT3 == m4cVar) {
                    l2w l2wVar = new l2w(vy71Var, q811Var, scxVar, (lnm) null, (byte) 5);
                    x340Var.s0(l2wVar);
                    objT3 = l2wVar;
                }
                qxd0.t(vy71Var, x340Var, (vu30) objT3);
                x340Var.r(false);
            } else {
                x340Var.i0(1277126179);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(scxVar, vy71Var, function0, i, (byte) 21);
        }
    }

    public static void d0(j1d j1dVar) {
        j1dVar.onCameraAccessPrioritiesChanged();
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1914480212);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarS = u291.s(uyn1.z(0.0f, 10.0f, 1, h2c.a.a(qim0Var2, een.h)), 36.0f, 4.0f);
            uwr uwrVar = cbx.a;
            t1c.a(dug.f(qim0VarS, ((vex) zex.a.e).j, er31.b(4.0f)), x340Var, 0);
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var, i, (byte) 19);
        }
    }

    public static void e0(View view) {
        Vibrator vibrator = (Vibrator) view.getContext().getSystemService("vibrator");
        if (Build.VERSION.SDK_INT >= 29) {
            vibrator.vibrate(VibrationEffect.createPredefined(1));
        } else {
            vibrator.vibrate(200L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:117:0x0162 A[PHI: r0 r4 r5 r6 r7 r9 r10 r11 r12 r20
      0x0162: PHI (r0v21 p.scx) = (r0v15 p.scx), (r0v24 p.scx) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r4v32 p.mfx) = (r4v18 p.mfx), (r4v33 p.mfx) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r5v8 boolean) = (r5v4 boolean), (r5v9 boolean) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r6v8 float) = (r6v5 float), (r6v9 float) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r7v16 int) = (r7v7 int), (r7v17 int) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r9v14 boolean) = (r9v11 boolean), (r9v15 boolean) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r10v21 boolean) = (r10v5 boolean), (r10v2 boolean) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r11v10 boolean) = (r11v7 boolean), (r11v11 boolean) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r12v8 boolean) = (r12v4 boolean), (r12v2 boolean) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r20v2 java.lang.Boolean) = (r20v0 java.lang.Boolean), (r20v3 java.lang.Boolean) binds: [B:137:0x0196, B:116:0x0155] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x0165  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:121:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0173  */
    /* JADX WARN: Code duplicated, block: B:124:0x0175  */
    /* JADX WARN: Code duplicated, block: B:126:0x0179  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:132:0x0184  */
    /* JADX WARN: Code duplicated, block: B:134:0x0187  */
    /* JADX WARN: Code duplicated, block: B:135:0x018a  */
    /* JADX WARN: Code duplicated, block: B:138:0x0198  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:155:0x0202  */
    /* JADX WARN: Code duplicated, block: B:157:0x0206  */
    /* JADX WARN: Code duplicated, block: B:159:0x020e  */
    /* JADX WARN: Code duplicated, block: B:164:0x0231  */
    /* JADX WARN: Code duplicated, block: B:167:0x023a  */
    /* JADX WARN: Code duplicated, block: B:169:0x02df  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0111  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0119  */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
    public static final void f(Function0 function0, scx scxVar, mfx mfxVar, boolean z, boolean z2, float f, boolean z3, Boolean bool, boolean z4, boolean z5, vu30 vu30Var, j2i j2iVar, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        scx scxVar2;
        boolean z6;
        int i5;
        boolean z7;
        int i6;
        int i7;
        int i8;
        boolean z8;
        int i9;
        int i10;
        Boolean bool2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z9;
        mfx mfxVar2;
        boolean z10;
        vu30 vu30Var2;
        Boolean bool3;
        scx scxVar3;
        boolean z11;
        float f2;
        boolean z12;
        boolean z13;
        boolean z14;
        h311 h311VarV;
        scx scxVarM;
        mfx mfxVar3;
        boolean z15;
        boolean z16;
        Boolean bool4;
        mfx mfxVar4;
        int i18;
        boolean z17;
        vu30 vu30Var3;
        Object objT;
        m4c m4cVar;
        q811 q811Var;
        Object objT2;
        q811 q811Var2;
        Object objT3;
        q811 q811Var3;
        Object objT4;
        ?? r2;
        boolean zBooleanValue;
        uvb0 uvb0Var;
        hrr0 hrr0VarQ;
        Function0 function1;
        jdt jdtVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2044540668);
        if ((i & 6) == 0) {
            i4 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                scxVar2 = scxVar;
                int i19 = x340Var.g(scxVar2) ? 32 : 16;
                i4 |= i19;
            } else {
                scxVar2 = scxVar;
            }
            i4 |= i19;
        } else {
            scxVar2 = scxVar;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= (i & 512) == 0 ? x340Var.g(mfxVar) : x340Var.i(mfxVar) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i21 = i3 & 8;
        if (i21 == 0) {
            if ((i & 3072) == 0) {
                z6 = z;
                i4 |= x340Var.h(z6) ? SemanticState.Modal : SemanticState.ReadOnly;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    z7 = z2;
                    if (x340Var.h(z7)) {
                        i6 = TlsSocketProvider.READ_BUFFER_SIZE;
                    } else {
                        i6 = SemanticState.Multiline;
                    }
                    i4 |= i6;
                }
                i7 = 196608 | i4;
                i8 = i3 & 64;
                if (i8 != 0) {
                    if ((1572864 & i) == 0) {
                        z8 = z3;
                        if (x340Var.h(z8)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i7 |= i9;
                    }
                    i10 = i3 & SemanticState.Focused;
                    if (i10 != 0) {
                        i7 |= 12582912;
                        bool2 = bool;
                    } else {
                        bool2 = bool;
                        if ((i & 12582912) == 0) {
                            if (x340Var.g(bool2)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i7 |= i11;
                        }
                    }
                    i12 = i3 & SemanticState.Hidden;
                    if (i12 != 0) {
                        if ((i & 100663296) == 0) {
                            if (x340Var.h(z4)) {
                                i13 = 67108864;
                            } else {
                                i13 = 33554432;
                            }
                            i7 |= i13;
                        }
                        i14 = i7 | 805306368;
                        i15 = i3 & SemanticState.ReadOnly;
                        if (i15 != 0) {
                            i16 = 54;
                        } else if ((i2 & 6) == 0) {
                            if (x340Var.i(vu30Var)) {
                                i17 = 4;
                            } else {
                                i17 = 2;
                            }
                            i16 = i2 | i17;
                        } else {
                            i16 = i2;
                        }
                        if ((i14 & 306783379) == 306783378 || (i16 & 19) != 18) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (x340Var.Y(i14 & 1, z9)) {
                            x340Var.d0();
                            if ((i & 1) != 0 || x340Var.E()) {
                                if ((i3 & 2) != 0) {
                                    scxVarM = pno1.m(x340Var);
                                    i14 &= -113;
                                } else {
                                    scxVarM = scxVar2;
                                }
                                if (i20 != 0) {
                                    mfxVar3 = null;
                                } else {
                                    mfxVar3 = mfxVar;
                                }
                                if (i21 != 0) {
                                    z6 = true;
                                }
                                if (i5 != 0) {
                                    z7 = true;
                                }
                                if (i8 != 0) {
                                    z8 = false;
                                }
                                if (i10 != 0) {
                                    bool2 = null;
                                }
                                if (i12 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = z4;
                                }
                                z16 = z8;
                                bool4 = bool2;
                                mfxVar4 = mfxVar3;
                                f2 = 640.0f;
                                i18 = i14;
                                z17 = true;
                                if (i15 != 0) {
                                    vu30Var3 = null;
                                }
                                x340Var.s();
                                objT = x340Var.T();
                                m4cVar = fkj0.X;
                                if (objT == m4cVar) {
                                    objT = new q811();
                                    x340Var.s0(objT);
                                }
                                q811Var = (q811) objT;
                                q811Var.a = Boolean.valueOf(z6);
                                objT2 = x340Var.T();
                                if (objT2 == m4cVar) {
                                    objT2 = new q811();
                                    x340Var.s0(objT2);
                                }
                                q811Var2 = (q811) objT2;
                                q811Var2.a = mfxVar4;
                                objT3 = x340Var.T();
                                if (objT3 == m4cVar) {
                                    objT3 = new q811();
                                    x340Var.s0(objT3);
                                }
                                q811Var3 = (q811) objT3;
                                q811Var3.a = scxVarM;
                                mfx mfxVar5 = mfxVar4;
                                objT4 = x340Var.T();
                                if (objT4 == m4cVar) {
                                    objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                                    x340Var.s0(objT4);
                                }
                                iu30 iu30Var = (iu30) objT4;
                                if (bool4 == null) {
                                    x340Var.i0(2003585198);
                                    uvb0Var = (crl1) x340Var.k(t4k.u);
                                    hrr0VarQ = uvb0Var.b;
                                    if (hrr0VarQ == null) {
                                        function1 = uvb0Var.a;
                                        if (function1 != null || (jdtVar = (jdt) function1.invoke()) == null) {
                                            jdtVar = jdt.c;
                                        }
                                        hrr0VarQ = v8r.q(jdtVar);
                                        uvb0Var.b = hrr0VarQ;
                                        uvb0Var.a = null;
                                    }
                                    zBooleanValue = p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0;
                                    r2 = 0;
                                    x340Var.r(false);
                                } else {
                                    r2 = 0;
                                    x340Var.i0(2003584423);
                                    x340Var.r(false);
                                    zBooleanValue = bool4.booleanValue();
                                }
                                boolean z18 = zBooleanValue;
                                x340Var.f0(2003593005, Boolean.valueOf(z18));
                                vy71 vy71VarF = dem0.f(48, (int) r2, x340Var, iu30Var, z18);
                                x340Var.r((boolean) r2);
                                int i22 = i18 >> 3;
                                int i23 = (i18 << 6) & 896;
                                d(scxVarM, vy71VarF, function0, x340Var, (i22 & 14) | i23);
                                scx scxVar4 = scxVarM;
                                boolean z19 = z6;
                                boolean z20 = z7;
                                boolean z21 = z15;
                                g(new u390(vy71VarF), z18, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z20, z16, z21, vu30Var3, apo.r(-90113604, new tf(z19, q811Var2, scxVar4, j2iVar, (byte) 8), x340Var), x340Var, (i22 & 234881024) | (458752 & i18) | i23 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                                z11 = z20;
                                z12 = z16;
                                vu30Var2 = vu30Var3;
                                z13 = z19;
                                bool3 = bool4;
                                scxVar3 = scxVar4;
                                mfxVar2 = mfxVar5;
                                z14 = z17;
                                z10 = z21;
                            } else {
                                x340Var.b0();
                                if ((i3 & 2) != 0) {
                                    i14 &= -113;
                                }
                                z15 = z4;
                                z17 = z5;
                                z16 = z8;
                                bool4 = bool2;
                                scxVarM = scxVar2;
                                i18 = i14;
                                mfxVar4 = mfxVar;
                                f2 = f;
                            }
                            vu30Var3 = vu30Var;
                            x340Var.s();
                            objT = x340Var.T();
                            m4cVar = fkj0.X;
                            if (objT == m4cVar) {
                                objT = new q811();
                                x340Var.s0(objT);
                            }
                            q811Var = (q811) objT;
                            q811Var.a = Boolean.valueOf(z6);
                            objT2 = x340Var.T();
                            if (objT2 == m4cVar) {
                                objT2 = new q811();
                                x340Var.s0(objT2);
                            }
                            q811Var2 = (q811) objT2;
                            q811Var2.a = mfxVar4;
                            objT3 = x340Var.T();
                            if (objT3 == m4cVar) {
                                objT3 = new q811();
                                x340Var.s0(objT3);
                            }
                            q811Var3 = (q811) objT3;
                            q811Var3.a = scxVarM;
                            mfx mfxVar6 = mfxVar4;
                            objT4 = x340Var.T();
                            if (objT4 == m4cVar) {
                                objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                                x340Var.s0(objT4);
                            }
                            iu30 iu30Var2 = (iu30) objT4;
                            if (bool4 == null) {
                                x340Var.i0(2003585198);
                                uvb0Var = (crl1) x340Var.k(t4k.u);
                                hrr0VarQ = uvb0Var.b;
                                if (hrr0VarQ == null) {
                                    function1 = uvb0Var.a;
                                    if (function1 != null) {
                                        jdtVar = jdt.c;
                                    } else {
                                        jdtVar = jdt.c;
                                    }
                                    hrr0VarQ = v8r.q(jdtVar);
                                    uvb0Var.b = hrr0VarQ;
                                    uvb0Var.a = null;
                                }
                                if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                                }
                                r2 = 0;
                                x340Var.r(false);
                            } else {
                                r2 = 0;
                                x340Var.i0(2003584423);
                                x340Var.r(false);
                                zBooleanValue = bool4.booleanValue();
                            }
                            boolean z110 = zBooleanValue;
                            x340Var.f0(2003593005, Boolean.valueOf(z110));
                            vy71 vy71VarF2 = dem0.f(48, (int) r2, x340Var, iu30Var2, z110);
                            x340Var.r((boolean) r2);
                            int i24 = i18 >> 3;
                            int i25 = (i18 << 6) & 896;
                            d(scxVarM, vy71VarF2, function0, x340Var, (i24 & 14) | i25);
                            scx scxVar5 = scxVarM;
                            boolean z111 = z6;
                            boolean z22 = z7;
                            boolean z23 = z15;
                            g(new u390(vy71VarF2), z110, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z22, z16, z23, vu30Var3, apo.r(-90113604, new tf(z111, q811Var2, scxVar5, j2iVar, (byte) 8), x340Var), x340Var, (i24 & 234881024) | (458752 & i18) | i25 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                            z11 = z22;
                            z12 = z16;
                            vu30Var2 = vu30Var3;
                            z13 = z111;
                            bool3 = bool4;
                            scxVar3 = scxVar5;
                            mfxVar2 = mfxVar6;
                            z14 = z17;
                            z10 = z23;
                        } else {
                            x340Var.b0();
                            mfxVar2 = mfxVar;
                            z10 = z4;
                            vu30Var2 = vu30Var;
                            bool3 = bool2;
                            scxVar3 = scxVar2;
                            z11 = z7;
                            f2 = f;
                            z12 = z8;
                            z13 = z6;
                            z14 = z5;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                        }
                    }
                    i7 |= 100663296;
                    i14 = i7 | 805306368;
                    i15 = i3 & SemanticState.ReadOnly;
                    if (i15 != 0) {
                        i16 = 54;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var.i(vu30Var)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i16 = i2 | i17;
                    } else {
                        i16 = i2;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (x340Var.Y(i14 & 1, z9)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i3 & 2) != 0) {
                                scxVarM = pno1.m(x340Var);
                                i14 &= -113;
                            } else {
                                scxVarM = scxVar2;
                            }
                            if (i20 != 0) {
                                mfxVar3 = null;
                            } else {
                                mfxVar3 = mfxVar;
                            }
                            if (i21 != 0) {
                                z6 = true;
                            }
                            if (i5 != 0) {
                                z7 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            }
                            if (i10 != 0) {
                                bool2 = null;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            } else {
                                z15 = z4;
                            }
                            z16 = z8;
                            bool4 = bool2;
                            mfxVar4 = mfxVar3;
                            f2 = 640.0f;
                            i18 = i14;
                            z17 = true;
                            if (i15 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                        } else {
                            if ((i3 & 2) != 0) {
                                scxVarM = pno1.m(x340Var);
                                i14 &= -113;
                            } else {
                                scxVarM = scxVar2;
                            }
                            if (i20 != 0) {
                                mfxVar3 = null;
                            } else {
                                mfxVar3 = mfxVar;
                            }
                            if (i21 != 0) {
                                z6 = true;
                            }
                            if (i5 != 0) {
                                z7 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            }
                            if (i10 != 0) {
                                bool2 = null;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            } else {
                                z15 = z4;
                            }
                            z16 = z8;
                            bool4 = bool2;
                            mfxVar4 = mfxVar3;
                            f2 = 640.0f;
                            i18 = i14;
                            z17 = true;
                            if (i15 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                        }
                        x340Var.s();
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = new q811();
                            x340Var.s0(objT);
                        }
                        q811Var = (q811) objT;
                        q811Var.a = Boolean.valueOf(z6);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = new q811();
                            x340Var.s0(objT2);
                        }
                        q811Var2 = (q811) objT2;
                        q811Var2.a = mfxVar4;
                        objT3 = x340Var.T();
                        if (objT3 == m4cVar) {
                            objT3 = new q811();
                            x340Var.s0(objT3);
                        }
                        q811Var3 = (q811) objT3;
                        q811Var3.a = scxVarM;
                        mfx mfxVar7 = mfxVar4;
                        objT4 = x340Var.T();
                        if (objT4 == m4cVar) {
                            objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                            x340Var.s0(objT4);
                        }
                        iu30 iu30Var3 = (iu30) objT4;
                        if (bool4 == null) {
                            x340Var.i0(2003585198);
                            uvb0Var = (crl1) x340Var.k(t4k.u);
                            hrr0VarQ = uvb0Var.b;
                            if (hrr0VarQ == null) {
                                function1 = uvb0Var.a;
                                if (function1 != null) {
                                    jdtVar = jdt.c;
                                } else {
                                    jdtVar = jdt.c;
                                }
                                hrr0VarQ = v8r.q(jdtVar);
                                uvb0Var.b = hrr0VarQ;
                                uvb0Var.a = null;
                            }
                            if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                            }
                            r2 = 0;
                            x340Var.r(false);
                        } else {
                            r2 = 0;
                            x340Var.i0(2003584423);
                            x340Var.r(false);
                            zBooleanValue = bool4.booleanValue();
                        }
                        boolean z112 = zBooleanValue;
                        x340Var.f0(2003593005, Boolean.valueOf(z112));
                        vy71 vy71VarF3 = dem0.f(48, (int) r2, x340Var, iu30Var3, z112);
                        x340Var.r((boolean) r2);
                        int i26 = i18 >> 3;
                        int i27 = (i18 << 6) & 896;
                        d(scxVarM, vy71VarF3, function0, x340Var, (i26 & 14) | i27);
                        scx scxVar6 = scxVarM;
                        boolean z113 = z6;
                        boolean z24 = z7;
                        boolean z25 = z15;
                        g(new u390(vy71VarF3), z112, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z24, z16, z25, vu30Var3, apo.r(-90113604, new tf(z113, q811Var2, scxVar6, j2iVar, (byte) 8), x340Var), x340Var, (i26 & 234881024) | (458752 & i18) | i27 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                        z11 = z24;
                        z12 = z16;
                        vu30Var2 = vu30Var3;
                        z13 = z113;
                        bool3 = bool4;
                        scxVar3 = scxVar6;
                        mfxVar2 = mfxVar7;
                        z14 = z17;
                        z10 = z25;
                    } else {
                        x340Var.b0();
                        mfxVar2 = mfxVar;
                        z10 = z4;
                        vu30Var2 = vu30Var;
                        bool3 = bool2;
                        scxVar3 = scxVar2;
                        z11 = z7;
                        f2 = f;
                        z12 = z8;
                        z13 = z6;
                        z14 = z5;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                    }
                }
                i7 = 1769472 | i4;
                z8 = z3;
                i10 = i3 & SemanticState.Focused;
                if (i10 != 0) {
                    i7 |= 12582912;
                    bool2 = bool;
                } else {
                    bool2 = bool;
                    if ((i & 12582912) == 0) {
                        if (x340Var.g(bool2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i7 |= i11;
                    }
                }
                i12 = i3 & SemanticState.Hidden;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (x340Var.h(z4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i7 |= i13;
                    }
                    i14 = i7 | 805306368;
                    i15 = i3 & SemanticState.ReadOnly;
                    if (i15 != 0) {
                        i16 = 54;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var.i(vu30Var)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i16 = i2 | i17;
                    } else {
                        i16 = i2;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (x340Var.Y(i14 & 1, z9)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i3 & 2) != 0) {
                                scxVarM = pno1.m(x340Var);
                                i14 &= -113;
                            } else {
                                scxVarM = scxVar2;
                            }
                            if (i20 != 0) {
                                mfxVar3 = null;
                            } else {
                                mfxVar3 = mfxVar;
                            }
                            if (i21 != 0) {
                                z6 = true;
                            }
                            if (i5 != 0) {
                                z7 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            }
                            if (i10 != 0) {
                                bool2 = null;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            } else {
                                z15 = z4;
                            }
                            z16 = z8;
                            bool4 = bool2;
                            mfxVar4 = mfxVar3;
                            f2 = 640.0f;
                            i18 = i14;
                            z17 = true;
                            if (i15 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                        } else {
                            if ((i3 & 2) != 0) {
                                scxVarM = pno1.m(x340Var);
                                i14 &= -113;
                            } else {
                                scxVarM = scxVar2;
                            }
                            if (i20 != 0) {
                                mfxVar3 = null;
                            } else {
                                mfxVar3 = mfxVar;
                            }
                            if (i21 != 0) {
                                z6 = true;
                            }
                            if (i5 != 0) {
                                z7 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            }
                            if (i10 != 0) {
                                bool2 = null;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            } else {
                                z15 = z4;
                            }
                            z16 = z8;
                            bool4 = bool2;
                            mfxVar4 = mfxVar3;
                            f2 = 640.0f;
                            i18 = i14;
                            z17 = true;
                            if (i15 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                        }
                        x340Var.s();
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = new q811();
                            x340Var.s0(objT);
                        }
                        q811Var = (q811) objT;
                        q811Var.a = Boolean.valueOf(z6);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = new q811();
                            x340Var.s0(objT2);
                        }
                        q811Var2 = (q811) objT2;
                        q811Var2.a = mfxVar4;
                        objT3 = x340Var.T();
                        if (objT3 == m4cVar) {
                            objT3 = new q811();
                            x340Var.s0(objT3);
                        }
                        q811Var3 = (q811) objT3;
                        q811Var3.a = scxVarM;
                        mfx mfxVar8 = mfxVar4;
                        objT4 = x340Var.T();
                        if (objT4 == m4cVar) {
                            objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                            x340Var.s0(objT4);
                        }
                        iu30 iu30Var4 = (iu30) objT4;
                        if (bool4 == null) {
                            x340Var.i0(2003585198);
                            uvb0Var = (crl1) x340Var.k(t4k.u);
                            hrr0VarQ = uvb0Var.b;
                            if (hrr0VarQ == null) {
                                function1 = uvb0Var.a;
                                if (function1 != null) {
                                    jdtVar = jdt.c;
                                } else {
                                    jdtVar = jdt.c;
                                }
                                hrr0VarQ = v8r.q(jdtVar);
                                uvb0Var.b = hrr0VarQ;
                                uvb0Var.a = null;
                            }
                            if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                            }
                            r2 = 0;
                            x340Var.r(false);
                        } else {
                            r2 = 0;
                            x340Var.i0(2003584423);
                            x340Var.r(false);
                            zBooleanValue = bool4.booleanValue();
                        }
                        boolean z114 = zBooleanValue;
                        x340Var.f0(2003593005, Boolean.valueOf(z114));
                        vy71 vy71VarF4 = dem0.f(48, (int) r2, x340Var, iu30Var4, z114);
                        x340Var.r((boolean) r2);
                        int i28 = i18 >> 3;
                        int i29 = (i18 << 6) & 896;
                        d(scxVarM, vy71VarF4, function0, x340Var, (i28 & 14) | i29);
                        scx scxVar7 = scxVarM;
                        boolean z115 = z6;
                        boolean z26 = z7;
                        boolean z27 = z15;
                        g(new u390(vy71VarF4), z114, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z26, z16, z27, vu30Var3, apo.r(-90113604, new tf(z115, q811Var2, scxVar7, j2iVar, (byte) 8), x340Var), x340Var, (i28 & 234881024) | (458752 & i18) | i29 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                        z11 = z26;
                        z12 = z16;
                        vu30Var2 = vu30Var3;
                        z13 = z115;
                        bool3 = bool4;
                        scxVar3 = scxVar7;
                        mfxVar2 = mfxVar8;
                        z14 = z17;
                        z10 = z27;
                    } else {
                        x340Var.b0();
                        mfxVar2 = mfxVar;
                        z10 = z4;
                        vu30Var2 = vu30Var;
                        bool3 = bool2;
                        scxVar3 = scxVar2;
                        z11 = z7;
                        f2 = f;
                        z12 = z8;
                        z13 = z6;
                        z14 = z5;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                    }
                }
                i7 |= 100663296;
                i14 = i7 | 805306368;
                i15 = i3 & SemanticState.ReadOnly;
                if (i15 != 0) {
                    i16 = 54;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i14 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (x340Var.Y(i14 & 1, z9)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new q811();
                        x340Var.s0(objT);
                    }
                    q811Var = (q811) objT;
                    q811Var.a = Boolean.valueOf(z6);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = new q811();
                        x340Var.s0(objT2);
                    }
                    q811Var2 = (q811) objT2;
                    q811Var2.a = mfxVar4;
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = new q811();
                        x340Var.s0(objT3);
                    }
                    q811Var3 = (q811) objT3;
                    q811Var3.a = scxVarM;
                    mfx mfxVar9 = mfxVar4;
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                        x340Var.s0(objT4);
                    }
                    iu30 iu30Var5 = (iu30) objT4;
                    if (bool4 == null) {
                        x340Var.i0(2003585198);
                        uvb0Var = (crl1) x340Var.k(t4k.u);
                        hrr0VarQ = uvb0Var.b;
                        if (hrr0VarQ == null) {
                            function1 = uvb0Var.a;
                            if (function1 != null) {
                                jdtVar = jdt.c;
                            } else {
                                jdtVar = jdt.c;
                            }
                            hrr0VarQ = v8r.q(jdtVar);
                            uvb0Var.b = hrr0VarQ;
                            uvb0Var.a = null;
                        }
                        if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                        }
                        r2 = 0;
                        x340Var.r(false);
                    } else {
                        r2 = 0;
                        x340Var.i0(2003584423);
                        x340Var.r(false);
                        zBooleanValue = bool4.booleanValue();
                    }
                    boolean z116 = zBooleanValue;
                    x340Var.f0(2003593005, Boolean.valueOf(z116));
                    vy71 vy71VarF5 = dem0.f(48, (int) r2, x340Var, iu30Var5, z116);
                    x340Var.r((boolean) r2);
                    int i210 = i18 >> 3;
                    int i211 = (i18 << 6) & 896;
                    d(scxVarM, vy71VarF5, function0, x340Var, (i210 & 14) | i211);
                    scx scxVar8 = scxVarM;
                    boolean z117 = z6;
                    boolean z28 = z7;
                    boolean z29 = z15;
                    g(new u390(vy71VarF5), z116, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z28, z16, z29, vu30Var3, apo.r(-90113604, new tf(z117, q811Var2, scxVar8, j2iVar, (byte) 8), x340Var), x340Var, (i210 & 234881024) | (458752 & i18) | i211 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                    z11 = z28;
                    z12 = z16;
                    vu30Var2 = vu30Var3;
                    z13 = z117;
                    bool3 = bool4;
                    scxVar3 = scxVar8;
                    mfxVar2 = mfxVar9;
                    z14 = z17;
                    z10 = z29;
                } else {
                    x340Var.b0();
                    mfxVar2 = mfxVar;
                    z10 = z4;
                    vu30Var2 = vu30Var;
                    bool3 = bool2;
                    scxVar3 = scxVar2;
                    z11 = z7;
                    f2 = f;
                    z12 = z8;
                    z13 = z6;
                    z14 = z5;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                }
            }
            i4 |= 24576;
            z7 = z2;
            i7 = 196608 | i4;
            i8 = i3 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    z8 = z3;
                    if (x340Var.h(z8)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i7 |= i9;
                }
                i10 = i3 & SemanticState.Focused;
                if (i10 != 0) {
                    i7 |= 12582912;
                    bool2 = bool;
                } else {
                    bool2 = bool;
                    if ((i & 12582912) == 0) {
                        if (x340Var.g(bool2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i7 |= i11;
                    }
                }
                i12 = i3 & SemanticState.Hidden;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (x340Var.h(z4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i7 |= i13;
                    }
                    i14 = i7 | 805306368;
                    i15 = i3 & SemanticState.ReadOnly;
                    if (i15 != 0) {
                        i16 = 54;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var.i(vu30Var)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i16 = i2 | i17;
                    } else {
                        i16 = i2;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (x340Var.Y(i14 & 1, z9)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i3 & 2) != 0) {
                                scxVarM = pno1.m(x340Var);
                                i14 &= -113;
                            } else {
                                scxVarM = scxVar2;
                            }
                            if (i20 != 0) {
                                mfxVar3 = null;
                            } else {
                                mfxVar3 = mfxVar;
                            }
                            if (i21 != 0) {
                                z6 = true;
                            }
                            if (i5 != 0) {
                                z7 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            }
                            if (i10 != 0) {
                                bool2 = null;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            } else {
                                z15 = z4;
                            }
                            z16 = z8;
                            bool4 = bool2;
                            mfxVar4 = mfxVar3;
                            f2 = 640.0f;
                            i18 = i14;
                            z17 = true;
                            if (i15 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                        } else {
                            if ((i3 & 2) != 0) {
                                scxVarM = pno1.m(x340Var);
                                i14 &= -113;
                            } else {
                                scxVarM = scxVar2;
                            }
                            if (i20 != 0) {
                                mfxVar3 = null;
                            } else {
                                mfxVar3 = mfxVar;
                            }
                            if (i21 != 0) {
                                z6 = true;
                            }
                            if (i5 != 0) {
                                z7 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            }
                            if (i10 != 0) {
                                bool2 = null;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            } else {
                                z15 = z4;
                            }
                            z16 = z8;
                            bool4 = bool2;
                            mfxVar4 = mfxVar3;
                            f2 = 640.0f;
                            i18 = i14;
                            z17 = true;
                            if (i15 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                        }
                        x340Var.s();
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = new q811();
                            x340Var.s0(objT);
                        }
                        q811Var = (q811) objT;
                        q811Var.a = Boolean.valueOf(z6);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = new q811();
                            x340Var.s0(objT2);
                        }
                        q811Var2 = (q811) objT2;
                        q811Var2.a = mfxVar4;
                        objT3 = x340Var.T();
                        if (objT3 == m4cVar) {
                            objT3 = new q811();
                            x340Var.s0(objT3);
                        }
                        q811Var3 = (q811) objT3;
                        q811Var3.a = scxVarM;
                        mfx mfxVar10 = mfxVar4;
                        objT4 = x340Var.T();
                        if (objT4 == m4cVar) {
                            objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                            x340Var.s0(objT4);
                        }
                        iu30 iu30Var6 = (iu30) objT4;
                        if (bool4 == null) {
                            x340Var.i0(2003585198);
                            uvb0Var = (crl1) x340Var.k(t4k.u);
                            hrr0VarQ = uvb0Var.b;
                            if (hrr0VarQ == null) {
                                function1 = uvb0Var.a;
                                if (function1 != null) {
                                    jdtVar = jdt.c;
                                } else {
                                    jdtVar = jdt.c;
                                }
                                hrr0VarQ = v8r.q(jdtVar);
                                uvb0Var.b = hrr0VarQ;
                                uvb0Var.a = null;
                            }
                            if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                            }
                            r2 = 0;
                            x340Var.r(false);
                        } else {
                            r2 = 0;
                            x340Var.i0(2003584423);
                            x340Var.r(false);
                            zBooleanValue = bool4.booleanValue();
                        }
                        boolean z118 = zBooleanValue;
                        x340Var.f0(2003593005, Boolean.valueOf(z118));
                        vy71 vy71VarF6 = dem0.f(48, (int) r2, x340Var, iu30Var6, z118);
                        x340Var.r((boolean) r2);
                        int i212 = i18 >> 3;
                        int i213 = (i18 << 6) & 896;
                        d(scxVarM, vy71VarF6, function0, x340Var, (i212 & 14) | i213);
                        scx scxVar9 = scxVarM;
                        boolean z119 = z6;
                        boolean z210 = z7;
                        boolean z211 = z15;
                        g(new u390(vy71VarF6), z118, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z210, z16, z211, vu30Var3, apo.r(-90113604, new tf(z119, q811Var2, scxVar9, j2iVar, (byte) 8), x340Var), x340Var, (i212 & 234881024) | (458752 & i18) | i213 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                        z11 = z210;
                        z12 = z16;
                        vu30Var2 = vu30Var3;
                        z13 = z119;
                        bool3 = bool4;
                        scxVar3 = scxVar9;
                        mfxVar2 = mfxVar10;
                        z14 = z17;
                        z10 = z211;
                    } else {
                        x340Var.b0();
                        mfxVar2 = mfxVar;
                        z10 = z4;
                        vu30Var2 = vu30Var;
                        bool3 = bool2;
                        scxVar3 = scxVar2;
                        z11 = z7;
                        f2 = f;
                        z12 = z8;
                        z13 = z6;
                        z14 = z5;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                    }
                }
                i7 |= 100663296;
                i14 = i7 | 805306368;
                i15 = i3 & SemanticState.ReadOnly;
                if (i15 != 0) {
                    i16 = 54;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i14 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (x340Var.Y(i14 & 1, z9)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new q811();
                        x340Var.s0(objT);
                    }
                    q811Var = (q811) objT;
                    q811Var.a = Boolean.valueOf(z6);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = new q811();
                        x340Var.s0(objT2);
                    }
                    q811Var2 = (q811) objT2;
                    q811Var2.a = mfxVar4;
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = new q811();
                        x340Var.s0(objT3);
                    }
                    q811Var3 = (q811) objT3;
                    q811Var3.a = scxVarM;
                    mfx mfxVar11 = mfxVar4;
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                        x340Var.s0(objT4);
                    }
                    iu30 iu30Var7 = (iu30) objT4;
                    if (bool4 == null) {
                        x340Var.i0(2003585198);
                        uvb0Var = (crl1) x340Var.k(t4k.u);
                        hrr0VarQ = uvb0Var.b;
                        if (hrr0VarQ == null) {
                            function1 = uvb0Var.a;
                            if (function1 != null) {
                                jdtVar = jdt.c;
                            } else {
                                jdtVar = jdt.c;
                            }
                            hrr0VarQ = v8r.q(jdtVar);
                            uvb0Var.b = hrr0VarQ;
                            uvb0Var.a = null;
                        }
                        if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                        }
                        r2 = 0;
                        x340Var.r(false);
                    } else {
                        r2 = 0;
                        x340Var.i0(2003584423);
                        x340Var.r(false);
                        zBooleanValue = bool4.booleanValue();
                    }
                    boolean z1110 = zBooleanValue;
                    x340Var.f0(2003593005, Boolean.valueOf(z1110));
                    vy71 vy71VarF7 = dem0.f(48, (int) r2, x340Var, iu30Var7, z1110);
                    x340Var.r((boolean) r2);
                    int i214 = i18 >> 3;
                    int i215 = (i18 << 6) & 896;
                    d(scxVarM, vy71VarF7, function0, x340Var, (i214 & 14) | i215);
                    scx scxVar10 = scxVarM;
                    boolean z1111 = z6;
                    boolean z212 = z7;
                    boolean z213 = z15;
                    g(new u390(vy71VarF7), z1110, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z212, z16, z213, vu30Var3, apo.r(-90113604, new tf(z1111, q811Var2, scxVar10, j2iVar, (byte) 8), x340Var), x340Var, (i214 & 234881024) | (458752 & i18) | i215 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                    z11 = z212;
                    z12 = z16;
                    vu30Var2 = vu30Var3;
                    z13 = z1111;
                    bool3 = bool4;
                    scxVar3 = scxVar10;
                    mfxVar2 = mfxVar11;
                    z14 = z17;
                    z10 = z213;
                } else {
                    x340Var.b0();
                    mfxVar2 = mfxVar;
                    z10 = z4;
                    vu30Var2 = vu30Var;
                    bool3 = bool2;
                    scxVar3 = scxVar2;
                    z11 = z7;
                    f2 = f;
                    z12 = z8;
                    z13 = z6;
                    z14 = z5;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                }
            }
            i7 = 1769472 | i4;
            z8 = z3;
            i10 = i3 & SemanticState.Focused;
            if (i10 != 0) {
                i7 |= 12582912;
                bool2 = bool;
            } else {
                bool2 = bool;
                if ((i & 12582912) == 0) {
                    if (x340Var.g(bool2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i7 |= i11;
                }
            }
            i12 = i3 & SemanticState.Hidden;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (x340Var.h(z4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i7 |= i13;
                }
                i14 = i7 | 805306368;
                i15 = i3 & SemanticState.ReadOnly;
                if (i15 != 0) {
                    i16 = 54;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i14 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (x340Var.Y(i14 & 1, z9)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new q811();
                        x340Var.s0(objT);
                    }
                    q811Var = (q811) objT;
                    q811Var.a = Boolean.valueOf(z6);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = new q811();
                        x340Var.s0(objT2);
                    }
                    q811Var2 = (q811) objT2;
                    q811Var2.a = mfxVar4;
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = new q811();
                        x340Var.s0(objT3);
                    }
                    q811Var3 = (q811) objT3;
                    q811Var3.a = scxVarM;
                    mfx mfxVar12 = mfxVar4;
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                        x340Var.s0(objT4);
                    }
                    iu30 iu30Var8 = (iu30) objT4;
                    if (bool4 == null) {
                        x340Var.i0(2003585198);
                        uvb0Var = (crl1) x340Var.k(t4k.u);
                        hrr0VarQ = uvb0Var.b;
                        if (hrr0VarQ == null) {
                            function1 = uvb0Var.a;
                            if (function1 != null) {
                                jdtVar = jdt.c;
                            } else {
                                jdtVar = jdt.c;
                            }
                            hrr0VarQ = v8r.q(jdtVar);
                            uvb0Var.b = hrr0VarQ;
                            uvb0Var.a = null;
                        }
                        if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                        }
                        r2 = 0;
                        x340Var.r(false);
                    } else {
                        r2 = 0;
                        x340Var.i0(2003584423);
                        x340Var.r(false);
                        zBooleanValue = bool4.booleanValue();
                    }
                    boolean z1112 = zBooleanValue;
                    x340Var.f0(2003593005, Boolean.valueOf(z1112));
                    vy71 vy71VarF8 = dem0.f(48, (int) r2, x340Var, iu30Var8, z1112);
                    x340Var.r((boolean) r2);
                    int i216 = i18 >> 3;
                    int i217 = (i18 << 6) & 896;
                    d(scxVarM, vy71VarF8, function0, x340Var, (i216 & 14) | i217);
                    scx scxVar11 = scxVarM;
                    boolean z1113 = z6;
                    boolean z214 = z7;
                    boolean z215 = z15;
                    g(new u390(vy71VarF8), z1112, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z214, z16, z215, vu30Var3, apo.r(-90113604, new tf(z1113, q811Var2, scxVar11, j2iVar, (byte) 8), x340Var), x340Var, (i216 & 234881024) | (458752 & i18) | i217 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                    z11 = z214;
                    z12 = z16;
                    vu30Var2 = vu30Var3;
                    z13 = z1113;
                    bool3 = bool4;
                    scxVar3 = scxVar11;
                    mfxVar2 = mfxVar12;
                    z14 = z17;
                    z10 = z215;
                } else {
                    x340Var.b0();
                    mfxVar2 = mfxVar;
                    z10 = z4;
                    vu30Var2 = vu30Var;
                    bool3 = bool2;
                    scxVar3 = scxVar2;
                    z11 = z7;
                    f2 = f;
                    z12 = z8;
                    z13 = z6;
                    z14 = z5;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                }
            }
            i7 |= 100663296;
            i14 = i7 | 805306368;
            i15 = i3 & SemanticState.ReadOnly;
            if (i15 != 0) {
                i16 = 54;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(vu30Var)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            if ((i14 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (x340Var.Y(i14 & 1, z9)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        scxVarM = pno1.m(x340Var);
                        i14 &= -113;
                    } else {
                        scxVarM = scxVar2;
                    }
                    if (i20 != 0) {
                        mfxVar3 = null;
                    } else {
                        mfxVar3 = mfxVar;
                    }
                    if (i21 != 0) {
                        z6 = true;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    }
                    if (i10 != 0) {
                        bool2 = null;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    z16 = z8;
                    bool4 = bool2;
                    mfxVar4 = mfxVar3;
                    f2 = 640.0f;
                    i18 = i14;
                    z17 = true;
                    if (i15 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        scxVarM = pno1.m(x340Var);
                        i14 &= -113;
                    } else {
                        scxVarM = scxVar2;
                    }
                    if (i20 != 0) {
                        mfxVar3 = null;
                    } else {
                        mfxVar3 = mfxVar;
                    }
                    if (i21 != 0) {
                        z6 = true;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    }
                    if (i10 != 0) {
                        bool2 = null;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    z16 = z8;
                    bool4 = bool2;
                    mfxVar4 = mfxVar3;
                    f2 = 640.0f;
                    i18 = i14;
                    z17 = true;
                    if (i15 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                }
                x340Var.s();
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new q811();
                    x340Var.s0(objT);
                }
                q811Var = (q811) objT;
                q811Var.a = Boolean.valueOf(z6);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new q811();
                    x340Var.s0(objT2);
                }
                q811Var2 = (q811) objT2;
                q811Var2.a = mfxVar4;
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = new q811();
                    x340Var.s0(objT3);
                }
                q811Var3 = (q811) objT3;
                q811Var3.a = scxVarM;
                mfx mfxVar13 = mfxVar4;
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var9 = (iu30) objT4;
                if (bool4 == null) {
                    x340Var.i0(2003585198);
                    uvb0Var = (crl1) x340Var.k(t4k.u);
                    hrr0VarQ = uvb0Var.b;
                    if (hrr0VarQ == null) {
                        function1 = uvb0Var.a;
                        if (function1 != null) {
                            jdtVar = jdt.c;
                        } else {
                            jdtVar = jdt.c;
                        }
                        hrr0VarQ = v8r.q(jdtVar);
                        uvb0Var.b = hrr0VarQ;
                        uvb0Var.a = null;
                    }
                    if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                    }
                    r2 = 0;
                    x340Var.r(false);
                } else {
                    r2 = 0;
                    x340Var.i0(2003584423);
                    x340Var.r(false);
                    zBooleanValue = bool4.booleanValue();
                }
                boolean z1114 = zBooleanValue;
                x340Var.f0(2003593005, Boolean.valueOf(z1114));
                vy71 vy71VarF9 = dem0.f(48, (int) r2, x340Var, iu30Var9, z1114);
                x340Var.r((boolean) r2);
                int i218 = i18 >> 3;
                int i219 = (i18 << 6) & 896;
                d(scxVarM, vy71VarF9, function0, x340Var, (i218 & 14) | i219);
                scx scxVar12 = scxVarM;
                boolean z1115 = z6;
                boolean z216 = z7;
                boolean z217 = z15;
                g(new u390(vy71VarF9), z1114, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z216, z16, z217, vu30Var3, apo.r(-90113604, new tf(z1115, q811Var2, scxVar12, j2iVar, (byte) 8), x340Var), x340Var, (i218 & 234881024) | (458752 & i18) | i219 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                z11 = z216;
                z12 = z16;
                vu30Var2 = vu30Var3;
                z13 = z1115;
                bool3 = bool4;
                scxVar3 = scxVar12;
                mfxVar2 = mfxVar13;
                z14 = z17;
                z10 = z217;
            } else {
                x340Var.b0();
                mfxVar2 = mfxVar;
                z10 = z4;
                vu30Var2 = vu30Var;
                bool3 = bool2;
                scxVar3 = scxVar2;
                z11 = z7;
                f2 = f;
                z12 = z8;
                z13 = z6;
                z14 = z5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
            }
        }
        i4 |= 3072;
        z6 = z;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                z7 = z2;
                if (x340Var.h(z7)) {
                    i6 = TlsSocketProvider.READ_BUFFER_SIZE;
                } else {
                    i6 = SemanticState.Multiline;
                }
                i4 |= i6;
            }
            i7 = 196608 | i4;
            i8 = i3 & 64;
            if (i8 != 0) {
                if ((1572864 & i) == 0) {
                    z8 = z3;
                    if (x340Var.h(z8)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i7 |= i9;
                }
                i10 = i3 & SemanticState.Focused;
                if (i10 != 0) {
                    i7 |= 12582912;
                    bool2 = bool;
                } else {
                    bool2 = bool;
                    if ((i & 12582912) == 0) {
                        if (x340Var.g(bool2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i7 |= i11;
                    }
                }
                i12 = i3 & SemanticState.Hidden;
                if (i12 != 0) {
                    if ((i & 100663296) == 0) {
                        if (x340Var.h(z4)) {
                            i13 = 67108864;
                        } else {
                            i13 = 33554432;
                        }
                        i7 |= i13;
                    }
                    i14 = i7 | 805306368;
                    i15 = i3 & SemanticState.ReadOnly;
                    if (i15 != 0) {
                        i16 = 54;
                    } else if ((i2 & 6) == 0) {
                        if (x340Var.i(vu30Var)) {
                            i17 = 4;
                        } else {
                            i17 = 2;
                        }
                        i16 = i2 | i17;
                    } else {
                        i16 = i2;
                    }
                    if ((i14 & 306783379) == 306783378) {
                        z9 = true;
                    } else {
                        z9 = true;
                    }
                    if (x340Var.Y(i14 & 1, z9)) {
                        x340Var.d0();
                        if ((i & 1) != 0) {
                            if ((i3 & 2) != 0) {
                                scxVarM = pno1.m(x340Var);
                                i14 &= -113;
                            } else {
                                scxVarM = scxVar2;
                            }
                            if (i20 != 0) {
                                mfxVar3 = null;
                            } else {
                                mfxVar3 = mfxVar;
                            }
                            if (i21 != 0) {
                                z6 = true;
                            }
                            if (i5 != 0) {
                                z7 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            }
                            if (i10 != 0) {
                                bool2 = null;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            } else {
                                z15 = z4;
                            }
                            z16 = z8;
                            bool4 = bool2;
                            mfxVar4 = mfxVar3;
                            f2 = 640.0f;
                            i18 = i14;
                            z17 = true;
                            if (i15 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                        } else {
                            if ((i3 & 2) != 0) {
                                scxVarM = pno1.m(x340Var);
                                i14 &= -113;
                            } else {
                                scxVarM = scxVar2;
                            }
                            if (i20 != 0) {
                                mfxVar3 = null;
                            } else {
                                mfxVar3 = mfxVar;
                            }
                            if (i21 != 0) {
                                z6 = true;
                            }
                            if (i5 != 0) {
                                z7 = true;
                            }
                            if (i8 != 0) {
                                z8 = false;
                            }
                            if (i10 != 0) {
                                bool2 = null;
                            }
                            if (i12 != 0) {
                                z15 = true;
                            } else {
                                z15 = z4;
                            }
                            z16 = z8;
                            bool4 = bool2;
                            mfxVar4 = mfxVar3;
                            f2 = 640.0f;
                            i18 = i14;
                            z17 = true;
                            if (i15 != 0) {
                                vu30Var3 = null;
                            } else {
                                vu30Var3 = vu30Var;
                            }
                        }
                        x340Var.s();
                        objT = x340Var.T();
                        m4cVar = fkj0.X;
                        if (objT == m4cVar) {
                            objT = new q811();
                            x340Var.s0(objT);
                        }
                        q811Var = (q811) objT;
                        q811Var.a = Boolean.valueOf(z6);
                        objT2 = x340Var.T();
                        if (objT2 == m4cVar) {
                            objT2 = new q811();
                            x340Var.s0(objT2);
                        }
                        q811Var2 = (q811) objT2;
                        q811Var2.a = mfxVar4;
                        objT3 = x340Var.T();
                        if (objT3 == m4cVar) {
                            objT3 = new q811();
                            x340Var.s0(objT3);
                        }
                        q811Var3 = (q811) objT3;
                        q811Var3.a = scxVarM;
                        mfx mfxVar14 = mfxVar4;
                        objT4 = x340Var.T();
                        if (objT4 == m4cVar) {
                            objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                            x340Var.s0(objT4);
                        }
                        iu30 iu30Var10 = (iu30) objT4;
                        if (bool4 == null) {
                            x340Var.i0(2003585198);
                            uvb0Var = (crl1) x340Var.k(t4k.u);
                            hrr0VarQ = uvb0Var.b;
                            if (hrr0VarQ == null) {
                                function1 = uvb0Var.a;
                                if (function1 != null) {
                                    jdtVar = jdt.c;
                                } else {
                                    jdtVar = jdt.c;
                                }
                                hrr0VarQ = v8r.q(jdtVar);
                                uvb0Var.b = hrr0VarQ;
                                uvb0Var.a = null;
                            }
                            if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                            }
                            r2 = 0;
                            x340Var.r(false);
                        } else {
                            r2 = 0;
                            x340Var.i0(2003584423);
                            x340Var.r(false);
                            zBooleanValue = bool4.booleanValue();
                        }
                        boolean z1116 = zBooleanValue;
                        x340Var.f0(2003593005, Boolean.valueOf(z1116));
                        vy71 vy71VarF10 = dem0.f(48, (int) r2, x340Var, iu30Var10, z1116);
                        x340Var.r((boolean) r2);
                        int i2110 = i18 >> 3;
                        int i2111 = (i18 << 6) & 896;
                        d(scxVarM, vy71VarF10, function0, x340Var, (i2110 & 14) | i2111);
                        scx scxVar13 = scxVarM;
                        boolean z1117 = z6;
                        boolean z218 = z7;
                        boolean z219 = z15;
                        g(new u390(vy71VarF10), z1116, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z218, z16, z219, vu30Var3, apo.r(-90113604, new tf(z1117, q811Var2, scxVar13, j2iVar, (byte) 8), x340Var), x340Var, (i2110 & 234881024) | (458752 & i18) | i2111 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                        z11 = z218;
                        z12 = z16;
                        vu30Var2 = vu30Var3;
                        z13 = z1117;
                        bool3 = bool4;
                        scxVar3 = scxVar13;
                        mfxVar2 = mfxVar14;
                        z14 = z17;
                        z10 = z219;
                    } else {
                        x340Var.b0();
                        mfxVar2 = mfxVar;
                        z10 = z4;
                        vu30Var2 = vu30Var;
                        bool3 = bool2;
                        scxVar3 = scxVar2;
                        z11 = z7;
                        f2 = f;
                        z12 = z8;
                        z13 = z6;
                        z14 = z5;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                    }
                }
                i7 |= 100663296;
                i14 = i7 | 805306368;
                i15 = i3 & SemanticState.ReadOnly;
                if (i15 != 0) {
                    i16 = 54;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i14 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (x340Var.Y(i14 & 1, z9)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new q811();
                        x340Var.s0(objT);
                    }
                    q811Var = (q811) objT;
                    q811Var.a = Boolean.valueOf(z6);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = new q811();
                        x340Var.s0(objT2);
                    }
                    q811Var2 = (q811) objT2;
                    q811Var2.a = mfxVar4;
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = new q811();
                        x340Var.s0(objT3);
                    }
                    q811Var3 = (q811) objT3;
                    q811Var3.a = scxVarM;
                    mfx mfxVar15 = mfxVar4;
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                        x340Var.s0(objT4);
                    }
                    iu30 iu30Var11 = (iu30) objT4;
                    if (bool4 == null) {
                        x340Var.i0(2003585198);
                        uvb0Var = (crl1) x340Var.k(t4k.u);
                        hrr0VarQ = uvb0Var.b;
                        if (hrr0VarQ == null) {
                            function1 = uvb0Var.a;
                            if (function1 != null) {
                                jdtVar = jdt.c;
                            } else {
                                jdtVar = jdt.c;
                            }
                            hrr0VarQ = v8r.q(jdtVar);
                            uvb0Var.b = hrr0VarQ;
                            uvb0Var.a = null;
                        }
                        if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                        }
                        r2 = 0;
                        x340Var.r(false);
                    } else {
                        r2 = 0;
                        x340Var.i0(2003584423);
                        x340Var.r(false);
                        zBooleanValue = bool4.booleanValue();
                    }
                    boolean z1118 = zBooleanValue;
                    x340Var.f0(2003593005, Boolean.valueOf(z1118));
                    vy71 vy71VarF11 = dem0.f(48, (int) r2, x340Var, iu30Var11, z1118);
                    x340Var.r((boolean) r2);
                    int i2112 = i18 >> 3;
                    int i2113 = (i18 << 6) & 896;
                    d(scxVarM, vy71VarF11, function0, x340Var, (i2112 & 14) | i2113);
                    scx scxVar14 = scxVarM;
                    boolean z1119 = z6;
                    boolean z2110 = z7;
                    boolean z2111 = z15;
                    g(new u390(vy71VarF11), z1118, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z2110, z16, z2111, vu30Var3, apo.r(-90113604, new tf(z1119, q811Var2, scxVar14, j2iVar, (byte) 8), x340Var), x340Var, (i2112 & 234881024) | (458752 & i18) | i2113 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                    z11 = z2110;
                    z12 = z16;
                    vu30Var2 = vu30Var3;
                    z13 = z1119;
                    bool3 = bool4;
                    scxVar3 = scxVar14;
                    mfxVar2 = mfxVar15;
                    z14 = z17;
                    z10 = z2111;
                } else {
                    x340Var.b0();
                    mfxVar2 = mfxVar;
                    z10 = z4;
                    vu30Var2 = vu30Var;
                    bool3 = bool2;
                    scxVar3 = scxVar2;
                    z11 = z7;
                    f2 = f;
                    z12 = z8;
                    z13 = z6;
                    z14 = z5;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                }
            }
            i7 = 1769472 | i4;
            z8 = z3;
            i10 = i3 & SemanticState.Focused;
            if (i10 != 0) {
                i7 |= 12582912;
                bool2 = bool;
            } else {
                bool2 = bool;
                if ((i & 12582912) == 0) {
                    if (x340Var.g(bool2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i7 |= i11;
                }
            }
            i12 = i3 & SemanticState.Hidden;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (x340Var.h(z4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i7 |= i13;
                }
                i14 = i7 | 805306368;
                i15 = i3 & SemanticState.ReadOnly;
                if (i15 != 0) {
                    i16 = 54;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i14 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (x340Var.Y(i14 & 1, z9)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new q811();
                        x340Var.s0(objT);
                    }
                    q811Var = (q811) objT;
                    q811Var.a = Boolean.valueOf(z6);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = new q811();
                        x340Var.s0(objT2);
                    }
                    q811Var2 = (q811) objT2;
                    q811Var2.a = mfxVar4;
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = new q811();
                        x340Var.s0(objT3);
                    }
                    q811Var3 = (q811) objT3;
                    q811Var3.a = scxVarM;
                    mfx mfxVar16 = mfxVar4;
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                        x340Var.s0(objT4);
                    }
                    iu30 iu30Var12 = (iu30) objT4;
                    if (bool4 == null) {
                        x340Var.i0(2003585198);
                        uvb0Var = (crl1) x340Var.k(t4k.u);
                        hrr0VarQ = uvb0Var.b;
                        if (hrr0VarQ == null) {
                            function1 = uvb0Var.a;
                            if (function1 != null) {
                                jdtVar = jdt.c;
                            } else {
                                jdtVar = jdt.c;
                            }
                            hrr0VarQ = v8r.q(jdtVar);
                            uvb0Var.b = hrr0VarQ;
                            uvb0Var.a = null;
                        }
                        if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                        }
                        r2 = 0;
                        x340Var.r(false);
                    } else {
                        r2 = 0;
                        x340Var.i0(2003584423);
                        x340Var.r(false);
                        zBooleanValue = bool4.booleanValue();
                    }
                    boolean z11110 = zBooleanValue;
                    x340Var.f0(2003593005, Boolean.valueOf(z11110));
                    vy71 vy71VarF12 = dem0.f(48, (int) r2, x340Var, iu30Var12, z11110);
                    x340Var.r((boolean) r2);
                    int i2114 = i18 >> 3;
                    int i2115 = (i18 << 6) & 896;
                    d(scxVarM, vy71VarF12, function0, x340Var, (i2114 & 14) | i2115);
                    scx scxVar15 = scxVarM;
                    boolean z11111 = z6;
                    boolean z2112 = z7;
                    boolean z2113 = z15;
                    g(new u390(vy71VarF12), z11110, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z2112, z16, z2113, vu30Var3, apo.r(-90113604, new tf(z11111, q811Var2, scxVar15, j2iVar, (byte) 8), x340Var), x340Var, (i2114 & 234881024) | (458752 & i18) | i2115 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                    z11 = z2112;
                    z12 = z16;
                    vu30Var2 = vu30Var3;
                    z13 = z11111;
                    bool3 = bool4;
                    scxVar3 = scxVar15;
                    mfxVar2 = mfxVar16;
                    z14 = z17;
                    z10 = z2113;
                } else {
                    x340Var.b0();
                    mfxVar2 = mfxVar;
                    z10 = z4;
                    vu30Var2 = vu30Var;
                    bool3 = bool2;
                    scxVar3 = scxVar2;
                    z11 = z7;
                    f2 = f;
                    z12 = z8;
                    z13 = z6;
                    z14 = z5;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                }
            }
            i7 |= 100663296;
            i14 = i7 | 805306368;
            i15 = i3 & SemanticState.ReadOnly;
            if (i15 != 0) {
                i16 = 54;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(vu30Var)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            if ((i14 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (x340Var.Y(i14 & 1, z9)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        scxVarM = pno1.m(x340Var);
                        i14 &= -113;
                    } else {
                        scxVarM = scxVar2;
                    }
                    if (i20 != 0) {
                        mfxVar3 = null;
                    } else {
                        mfxVar3 = mfxVar;
                    }
                    if (i21 != 0) {
                        z6 = true;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    }
                    if (i10 != 0) {
                        bool2 = null;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    z16 = z8;
                    bool4 = bool2;
                    mfxVar4 = mfxVar3;
                    f2 = 640.0f;
                    i18 = i14;
                    z17 = true;
                    if (i15 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        scxVarM = pno1.m(x340Var);
                        i14 &= -113;
                    } else {
                        scxVarM = scxVar2;
                    }
                    if (i20 != 0) {
                        mfxVar3 = null;
                    } else {
                        mfxVar3 = mfxVar;
                    }
                    if (i21 != 0) {
                        z6 = true;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    }
                    if (i10 != 0) {
                        bool2 = null;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    z16 = z8;
                    bool4 = bool2;
                    mfxVar4 = mfxVar3;
                    f2 = 640.0f;
                    i18 = i14;
                    z17 = true;
                    if (i15 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                }
                x340Var.s();
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new q811();
                    x340Var.s0(objT);
                }
                q811Var = (q811) objT;
                q811Var.a = Boolean.valueOf(z6);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new q811();
                    x340Var.s0(objT2);
                }
                q811Var2 = (q811) objT2;
                q811Var2.a = mfxVar4;
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = new q811();
                    x340Var.s0(objT3);
                }
                q811Var3 = (q811) objT3;
                q811Var3.a = scxVarM;
                mfx mfxVar17 = mfxVar4;
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var13 = (iu30) objT4;
                if (bool4 == null) {
                    x340Var.i0(2003585198);
                    uvb0Var = (crl1) x340Var.k(t4k.u);
                    hrr0VarQ = uvb0Var.b;
                    if (hrr0VarQ == null) {
                        function1 = uvb0Var.a;
                        if (function1 != null) {
                            jdtVar = jdt.c;
                        } else {
                            jdtVar = jdt.c;
                        }
                        hrr0VarQ = v8r.q(jdtVar);
                        uvb0Var.b = hrr0VarQ;
                        uvb0Var.a = null;
                    }
                    if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                    }
                    r2 = 0;
                    x340Var.r(false);
                } else {
                    r2 = 0;
                    x340Var.i0(2003584423);
                    x340Var.r(false);
                    zBooleanValue = bool4.booleanValue();
                }
                boolean z11112 = zBooleanValue;
                x340Var.f0(2003593005, Boolean.valueOf(z11112));
                vy71 vy71VarF13 = dem0.f(48, (int) r2, x340Var, iu30Var13, z11112);
                x340Var.r((boolean) r2);
                int i2116 = i18 >> 3;
                int i2117 = (i18 << 6) & 896;
                d(scxVarM, vy71VarF13, function0, x340Var, (i2116 & 14) | i2117);
                scx scxVar16 = scxVarM;
                boolean z11113 = z6;
                boolean z2114 = z7;
                boolean z2115 = z15;
                g(new u390(vy71VarF13), z11112, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z2114, z16, z2115, vu30Var3, apo.r(-90113604, new tf(z11113, q811Var2, scxVar16, j2iVar, (byte) 8), x340Var), x340Var, (i2116 & 234881024) | (458752 & i18) | i2117 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                z11 = z2114;
                z12 = z16;
                vu30Var2 = vu30Var3;
                z13 = z11113;
                bool3 = bool4;
                scxVar3 = scxVar16;
                mfxVar2 = mfxVar17;
                z14 = z17;
                z10 = z2115;
            } else {
                x340Var.b0();
                mfxVar2 = mfxVar;
                z10 = z4;
                vu30Var2 = vu30Var;
                bool3 = bool2;
                scxVar3 = scxVar2;
                z11 = z7;
                f2 = f;
                z12 = z8;
                z13 = z6;
                z14 = z5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
            }
        }
        i4 |= 24576;
        z7 = z2;
        i7 = 196608 | i4;
        i8 = i3 & 64;
        if (i8 != 0) {
            if ((1572864 & i) == 0) {
                z8 = z3;
                if (x340Var.h(z8)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i7 |= i9;
            }
            i10 = i3 & SemanticState.Focused;
            if (i10 != 0) {
                i7 |= 12582912;
                bool2 = bool;
            } else {
                bool2 = bool;
                if ((i & 12582912) == 0) {
                    if (x340Var.g(bool2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i7 |= i11;
                }
            }
            i12 = i3 & SemanticState.Hidden;
            if (i12 != 0) {
                if ((i & 100663296) == 0) {
                    if (x340Var.h(z4)) {
                        i13 = 67108864;
                    } else {
                        i13 = 33554432;
                    }
                    i7 |= i13;
                }
                i14 = i7 | 805306368;
                i15 = i3 & SemanticState.ReadOnly;
                if (i15 != 0) {
                    i16 = 54;
                } else if ((i2 & 6) == 0) {
                    if (x340Var.i(vu30Var)) {
                        i17 = 4;
                    } else {
                        i17 = 2;
                    }
                    i16 = i2 | i17;
                } else {
                    i16 = i2;
                }
                if ((i14 & 306783379) == 306783378) {
                    z9 = true;
                } else {
                    z9 = true;
                }
                if (x340Var.Y(i14 & 1, z9)) {
                    x340Var.d0();
                    if ((i & 1) != 0) {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    } else {
                        if ((i3 & 2) != 0) {
                            scxVarM = pno1.m(x340Var);
                            i14 &= -113;
                        } else {
                            scxVarM = scxVar2;
                        }
                        if (i20 != 0) {
                            mfxVar3 = null;
                        } else {
                            mfxVar3 = mfxVar;
                        }
                        if (i21 != 0) {
                            z6 = true;
                        }
                        if (i5 != 0) {
                            z7 = true;
                        }
                        if (i8 != 0) {
                            z8 = false;
                        }
                        if (i10 != 0) {
                            bool2 = null;
                        }
                        if (i12 != 0) {
                            z15 = true;
                        } else {
                            z15 = z4;
                        }
                        z16 = z8;
                        bool4 = bool2;
                        mfxVar4 = mfxVar3;
                        f2 = 640.0f;
                        i18 = i14;
                        z17 = true;
                        if (i15 != 0) {
                            vu30Var3 = null;
                        } else {
                            vu30Var3 = vu30Var;
                        }
                    }
                    x340Var.s();
                    objT = x340Var.T();
                    m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = new q811();
                        x340Var.s0(objT);
                    }
                    q811Var = (q811) objT;
                    q811Var.a = Boolean.valueOf(z6);
                    objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = new q811();
                        x340Var.s0(objT2);
                    }
                    q811Var2 = (q811) objT2;
                    q811Var2.a = mfxVar4;
                    objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = new q811();
                        x340Var.s0(objT3);
                    }
                    q811Var3 = (q811) objT3;
                    q811Var3.a = scxVarM;
                    mfx mfxVar18 = mfxVar4;
                    objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                        x340Var.s0(objT4);
                    }
                    iu30 iu30Var14 = (iu30) objT4;
                    if (bool4 == null) {
                        x340Var.i0(2003585198);
                        uvb0Var = (crl1) x340Var.k(t4k.u);
                        hrr0VarQ = uvb0Var.b;
                        if (hrr0VarQ == null) {
                            function1 = uvb0Var.a;
                            if (function1 != null) {
                                jdtVar = jdt.c;
                            } else {
                                jdtVar = jdt.c;
                            }
                            hrr0VarQ = v8r.q(jdtVar);
                            uvb0Var.b = hrr0VarQ;
                            uvb0Var.a = null;
                        }
                        if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                        }
                        r2 = 0;
                        x340Var.r(false);
                    } else {
                        r2 = 0;
                        x340Var.i0(2003584423);
                        x340Var.r(false);
                        zBooleanValue = bool4.booleanValue();
                    }
                    boolean z11114 = zBooleanValue;
                    x340Var.f0(2003593005, Boolean.valueOf(z11114));
                    vy71 vy71VarF14 = dem0.f(48, (int) r2, x340Var, iu30Var14, z11114);
                    x340Var.r((boolean) r2);
                    int i2118 = i18 >> 3;
                    int i2119 = (i18 << 6) & 896;
                    d(scxVarM, vy71VarF14, function0, x340Var, (i2118 & 14) | i2119);
                    scx scxVar17 = scxVarM;
                    boolean z11115 = z6;
                    boolean z2116 = z7;
                    boolean z2117 = z15;
                    g(new u390(vy71VarF14), z11114, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z2116, z16, z2117, vu30Var3, apo.r(-90113604, new tf(z11115, q811Var2, scxVar17, j2iVar, (byte) 8), x340Var), x340Var, (i2118 & 234881024) | (458752 & i18) | i2119 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                    z11 = z2116;
                    z12 = z16;
                    vu30Var2 = vu30Var3;
                    z13 = z11115;
                    bool3 = bool4;
                    scxVar3 = scxVar17;
                    mfxVar2 = mfxVar18;
                    z14 = z17;
                    z10 = z2117;
                } else {
                    x340Var.b0();
                    mfxVar2 = mfxVar;
                    z10 = z4;
                    vu30Var2 = vu30Var;
                    bool3 = bool2;
                    scxVar3 = scxVar2;
                    z11 = z7;
                    f2 = f;
                    z12 = z8;
                    z13 = z6;
                    z14 = z5;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
                }
            }
            i7 |= 100663296;
            i14 = i7 | 805306368;
            i15 = i3 & SemanticState.ReadOnly;
            if (i15 != 0) {
                i16 = 54;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(vu30Var)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            if ((i14 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (x340Var.Y(i14 & 1, z9)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        scxVarM = pno1.m(x340Var);
                        i14 &= -113;
                    } else {
                        scxVarM = scxVar2;
                    }
                    if (i20 != 0) {
                        mfxVar3 = null;
                    } else {
                        mfxVar3 = mfxVar;
                    }
                    if (i21 != 0) {
                        z6 = true;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    }
                    if (i10 != 0) {
                        bool2 = null;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    z16 = z8;
                    bool4 = bool2;
                    mfxVar4 = mfxVar3;
                    f2 = 640.0f;
                    i18 = i14;
                    z17 = true;
                    if (i15 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        scxVarM = pno1.m(x340Var);
                        i14 &= -113;
                    } else {
                        scxVarM = scxVar2;
                    }
                    if (i20 != 0) {
                        mfxVar3 = null;
                    } else {
                        mfxVar3 = mfxVar;
                    }
                    if (i21 != 0) {
                        z6 = true;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    }
                    if (i10 != 0) {
                        bool2 = null;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    z16 = z8;
                    bool4 = bool2;
                    mfxVar4 = mfxVar3;
                    f2 = 640.0f;
                    i18 = i14;
                    z17 = true;
                    if (i15 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                }
                x340Var.s();
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new q811();
                    x340Var.s0(objT);
                }
                q811Var = (q811) objT;
                q811Var.a = Boolean.valueOf(z6);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new q811();
                    x340Var.s0(objT2);
                }
                q811Var2 = (q811) objT2;
                q811Var2.a = mfxVar4;
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = new q811();
                    x340Var.s0(objT3);
                }
                q811Var3 = (q811) objT3;
                q811Var3.a = scxVarM;
                mfx mfxVar19 = mfxVar4;
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var15 = (iu30) objT4;
                if (bool4 == null) {
                    x340Var.i0(2003585198);
                    uvb0Var = (crl1) x340Var.k(t4k.u);
                    hrr0VarQ = uvb0Var.b;
                    if (hrr0VarQ == null) {
                        function1 = uvb0Var.a;
                        if (function1 != null) {
                            jdtVar = jdt.c;
                        } else {
                            jdtVar = jdt.c;
                        }
                        hrr0VarQ = v8r.q(jdtVar);
                        uvb0Var.b = hrr0VarQ;
                        uvb0Var.a = null;
                    }
                    if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                    }
                    r2 = 0;
                    x340Var.r(false);
                } else {
                    r2 = 0;
                    x340Var.i0(2003584423);
                    x340Var.r(false);
                    zBooleanValue = bool4.booleanValue();
                }
                boolean z11116 = zBooleanValue;
                x340Var.f0(2003593005, Boolean.valueOf(z11116));
                vy71 vy71VarF15 = dem0.f(48, (int) r2, x340Var, iu30Var15, z11116);
                x340Var.r((boolean) r2);
                int i21110 = i18 >> 3;
                int i21111 = (i18 << 6) & 896;
                d(scxVarM, vy71VarF15, function0, x340Var, (i21110 & 14) | i21111);
                scx scxVar18 = scxVarM;
                boolean z11117 = z6;
                boolean z2118 = z7;
                boolean z2119 = z15;
                g(new u390(vy71VarF15), z11116, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z2118, z16, z2119, vu30Var3, apo.r(-90113604, new tf(z11117, q811Var2, scxVar18, j2iVar, (byte) 8), x340Var), x340Var, (i21110 & 234881024) | (458752 & i18) | i21111 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                z11 = z2118;
                z12 = z16;
                vu30Var2 = vu30Var3;
                z13 = z11117;
                bool3 = bool4;
                scxVar3 = scxVar18;
                mfxVar2 = mfxVar19;
                z14 = z17;
                z10 = z2119;
            } else {
                x340Var.b0();
                mfxVar2 = mfxVar;
                z10 = z4;
                vu30Var2 = vu30Var;
                bool3 = bool2;
                scxVar3 = scxVar2;
                z11 = z7;
                f2 = f;
                z12 = z8;
                z13 = z6;
                z14 = z5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
            }
        }
        i7 = 1769472 | i4;
        z8 = z3;
        i10 = i3 & SemanticState.Focused;
        if (i10 != 0) {
            i7 |= 12582912;
            bool2 = bool;
        } else {
            bool2 = bool;
            if ((i & 12582912) == 0) {
                if (x340Var.g(bool2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i7 |= i11;
            }
        }
        i12 = i3 & SemanticState.Hidden;
        if (i12 != 0) {
            if ((i & 100663296) == 0) {
                if (x340Var.h(z4)) {
                    i13 = 67108864;
                } else {
                    i13 = 33554432;
                }
                i7 |= i13;
            }
            i14 = i7 | 805306368;
            i15 = i3 & SemanticState.ReadOnly;
            if (i15 != 0) {
                i16 = 54;
            } else if ((i2 & 6) == 0) {
                if (x340Var.i(vu30Var)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            if ((i14 & 306783379) == 306783378) {
                z9 = true;
            } else {
                z9 = true;
            }
            if (x340Var.Y(i14 & 1, z9)) {
                x340Var.d0();
                if ((i & 1) != 0) {
                    if ((i3 & 2) != 0) {
                        scxVarM = pno1.m(x340Var);
                        i14 &= -113;
                    } else {
                        scxVarM = scxVar2;
                    }
                    if (i20 != 0) {
                        mfxVar3 = null;
                    } else {
                        mfxVar3 = mfxVar;
                    }
                    if (i21 != 0) {
                        z6 = true;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    }
                    if (i10 != 0) {
                        bool2 = null;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    z16 = z8;
                    bool4 = bool2;
                    mfxVar4 = mfxVar3;
                    f2 = 640.0f;
                    i18 = i14;
                    z17 = true;
                    if (i15 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                } else {
                    if ((i3 & 2) != 0) {
                        scxVarM = pno1.m(x340Var);
                        i14 &= -113;
                    } else {
                        scxVarM = scxVar2;
                    }
                    if (i20 != 0) {
                        mfxVar3 = null;
                    } else {
                        mfxVar3 = mfxVar;
                    }
                    if (i21 != 0) {
                        z6 = true;
                    }
                    if (i5 != 0) {
                        z7 = true;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    }
                    if (i10 != 0) {
                        bool2 = null;
                    }
                    if (i12 != 0) {
                        z15 = true;
                    } else {
                        z15 = z4;
                    }
                    z16 = z8;
                    bool4 = bool2;
                    mfxVar4 = mfxVar3;
                    f2 = 640.0f;
                    i18 = i14;
                    z17 = true;
                    if (i15 != 0) {
                        vu30Var3 = null;
                    } else {
                        vu30Var3 = vu30Var;
                    }
                }
                x340Var.s();
                objT = x340Var.T();
                m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = new q811();
                    x340Var.s0(objT);
                }
                q811Var = (q811) objT;
                q811Var.a = Boolean.valueOf(z6);
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new q811();
                    x340Var.s0(objT2);
                }
                q811Var2 = (q811) objT2;
                q811Var2.a = mfxVar4;
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = new q811();
                    x340Var.s0(objT3);
                }
                q811Var3 = (q811) objT3;
                q811Var3.a = scxVarM;
                mfx mfxVar110 = mfxVar4;
                objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var16 = (iu30) objT4;
                if (bool4 == null) {
                    x340Var.i0(2003585198);
                    uvb0Var = (crl1) x340Var.k(t4k.u);
                    hrr0VarQ = uvb0Var.b;
                    if (hrr0VarQ == null) {
                        function1 = uvb0Var.a;
                        if (function1 != null) {
                            jdtVar = jdt.c;
                        } else {
                            jdtVar = jdt.c;
                        }
                        hrr0VarQ = v8r.q(jdtVar);
                        uvb0Var.b = hrr0VarQ;
                        uvb0Var.a = null;
                    }
                    if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                    }
                    r2 = 0;
                    x340Var.r(false);
                } else {
                    r2 = 0;
                    x340Var.i0(2003584423);
                    x340Var.r(false);
                    zBooleanValue = bool4.booleanValue();
                }
                boolean z11118 = zBooleanValue;
                x340Var.f0(2003593005, Boolean.valueOf(z11118));
                vy71 vy71VarF16 = dem0.f(48, (int) r2, x340Var, iu30Var16, z11118);
                x340Var.r((boolean) r2);
                int i21112 = i18 >> 3;
                int i21113 = (i18 << 6) & 896;
                d(scxVarM, vy71VarF16, function0, x340Var, (i21112 & 14) | i21113);
                scx scxVar19 = scxVarM;
                boolean z11119 = z6;
                boolean z21110 = z7;
                boolean z21111 = z15;
                g(new u390(vy71VarF16), z11118, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z21110, z16, z21111, vu30Var3, apo.r(-90113604, new tf(z11119, q811Var2, scxVar19, j2iVar, (byte) 8), x340Var), x340Var, (i21112 & 234881024) | (458752 & i18) | i21113 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
                z11 = z21110;
                z12 = z16;
                vu30Var2 = vu30Var3;
                z13 = z11119;
                bool3 = bool4;
                scxVar3 = scxVar19;
                mfxVar2 = mfxVar110;
                z14 = z17;
                z10 = z21111;
            } else {
                x340Var.b0();
                mfxVar2 = mfxVar;
                z10 = z4;
                vu30Var2 = vu30Var;
                bool3 = bool2;
                scxVar3 = scxVar2;
                z11 = z7;
                f2 = f;
                z12 = z8;
                z13 = z6;
                z14 = z5;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
            }
        }
        i7 |= 100663296;
        i14 = i7 | 805306368;
        i15 = i3 & SemanticState.ReadOnly;
        if (i15 != 0) {
            i16 = 54;
        } else if ((i2 & 6) == 0) {
            if (x340Var.i(vu30Var)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i16 = i2 | i17;
        } else {
            i16 = i2;
        }
        if ((i14 & 306783379) == 306783378) {
            z9 = true;
        } else {
            z9 = true;
        }
        if (x340Var.Y(i14 & 1, z9)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if ((i3 & 2) != 0) {
                    scxVarM = pno1.m(x340Var);
                    i14 &= -113;
                } else {
                    scxVarM = scxVar2;
                }
                if (i20 != 0) {
                    mfxVar3 = null;
                } else {
                    mfxVar3 = mfxVar;
                }
                if (i21 != 0) {
                    z6 = true;
                }
                if (i5 != 0) {
                    z7 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                }
                if (i10 != 0) {
                    bool2 = null;
                }
                if (i12 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                z16 = z8;
                bool4 = bool2;
                mfxVar4 = mfxVar3;
                f2 = 640.0f;
                i18 = i14;
                z17 = true;
                if (i15 != 0) {
                    vu30Var3 = null;
                } else {
                    vu30Var3 = vu30Var;
                }
            } else {
                if ((i3 & 2) != 0) {
                    scxVarM = pno1.m(x340Var);
                    i14 &= -113;
                } else {
                    scxVarM = scxVar2;
                }
                if (i20 != 0) {
                    mfxVar3 = null;
                } else {
                    mfxVar3 = mfxVar;
                }
                if (i21 != 0) {
                    z6 = true;
                }
                if (i5 != 0) {
                    z7 = true;
                }
                if (i8 != 0) {
                    z8 = false;
                }
                if (i10 != 0) {
                    bool2 = null;
                }
                if (i12 != 0) {
                    z15 = true;
                } else {
                    z15 = z4;
                }
                z16 = z8;
                bool4 = bool2;
                mfxVar4 = mfxVar3;
                f2 = 640.0f;
                i18 = i14;
                z17 = true;
                if (i15 != 0) {
                    vu30Var3 = null;
                } else {
                    vu30Var3 = vu30Var;
                }
            }
            x340Var.s();
            objT = x340Var.T();
            m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = new q811();
                x340Var.s0(objT);
            }
            q811Var = (q811) objT;
            q811Var.a = Boolean.valueOf(z6);
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new q811();
                x340Var.s0(objT2);
            }
            q811Var2 = (q811) objT2;
            q811Var2.a = mfxVar4;
            objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new q811();
                x340Var.s0(objT3);
            }
            q811Var3 = (q811) objT3;
            q811Var3.a = scxVarM;
            mfx mfxVar111 = mfxVar4;
            objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = new m3n(q811Var3, q811Var2, q811Var, (byte) 28);
                x340Var.s0(objT4);
            }
            iu30 iu30Var17 = (iu30) objT4;
            if (bool4 == null) {
                x340Var.i0(2003585198);
                uvb0Var = (crl1) x340Var.k(t4k.u);
                hrr0VarQ = uvb0Var.b;
                if (hrr0VarQ == null) {
                    function1 = uvb0Var.a;
                    if (function1 != null) {
                        jdtVar = jdt.c;
                    } else {
                        jdtVar = jdt.c;
                    }
                    hrr0VarQ = v8r.q(jdtVar);
                    uvb0Var.b = hrr0VarQ;
                    uvb0Var.a = null;
                }
                if (p3v.b(s3v.a(((jdt) hrr0VarQ.getValue()).b), 480.0f) < 0) {
                }
                r2 = 0;
                x340Var.r(false);
            } else {
                r2 = 0;
                x340Var.i0(2003584423);
                x340Var.r(false);
                zBooleanValue = bool4.booleanValue();
            }
            boolean z111110 = zBooleanValue;
            x340Var.f0(2003593005, Boolean.valueOf(z111110));
            vy71 vy71VarF17 = dem0.f(48, (int) r2, x340Var, iu30Var17, z111110);
            x340Var.r((boolean) r2);
            int i21114 = i18 >> 3;
            int i21115 = (i18 << 6) & 896;
            d(scxVarM, vy71VarF17, function0, x340Var, (i21114 & 14) | i21115);
            scx scxVar110 = scxVarM;
            boolean z111111 = z6;
            boolean z21112 = z7;
            boolean z21113 = z15;
            g(new u390(vy71VarF17), z111110, function0, null, 0L, f2, false, ((Boolean) scxVarM.a.getValue()).booleanValue(), z17, z21112, z16, z21113, vu30Var3, apo.r(-90113604, new tf(z111111, q811Var2, scxVar110, j2iVar, (byte) 8), x340Var), x340Var, (i21114 & 234881024) | (458752 & i18) | i21115 | ((i18 << 15) & 1879048192), ((i18 >> 21) & ContentType.LONG_FORM_ON_DEMAND) | ((i18 >> 18) & 14) | 3072 | ((i16 << 6) & 896), 88);
            z11 = z21112;
            z12 = z16;
            vu30Var2 = vu30Var3;
            z13 = z111111;
            bool3 = bool4;
            scxVar3 = scxVar110;
            mfxVar2 = mfxVar111;
            z14 = z17;
            z10 = z21113;
        } else {
            x340Var.b0();
            mfxVar2 = mfxVar;
            z10 = z4;
            vu30Var2 = vu30Var;
            bool3 = bool2;
            scxVar3 = scxVar2;
            z11 = z7;
            f2 = f;
            z12 = z8;
            z13 = z6;
            z14 = z5;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ocx(function0, scxVar3, mfxVar2, z13, z11, f2, z12, bool3, z10, z14, vu30Var2, j2iVar, i, i2, i3);
        }
    }

    public static void f0(Resources.Theme theme) {
        theme.rebase();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:102:0x012e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0141  */
    /* JADX WARN: Code duplicated, block: B:111:0x0146  */
    /* JADX WARN: Code duplicated, block: B:114:0x014c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0154  */
    /* JADX WARN: Code duplicated, block: B:119:0x015b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:129:0x0180  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x01db  */
    /* JADX WARN: Code duplicated, block: B:158:0x0203  */
    /* JADX WARN: Code duplicated, block: B:160:0x020f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0225  */
    /* JADX WARN: Code duplicated, block: B:165:0x0228  */
    /* JADX WARN: Code duplicated, block: B:166:0x022b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0265  */
    /* JADX WARN: Code duplicated, block: B:173:0x0277  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:178:0x02da  */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x011d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final void g(u390 u390Var, boolean z, Function0 function0, qim0 qim0Var, long j, float f, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, vu30 vu30Var, j2i j2iVar, b0k b0kVar, int i, int i2, int i3) {
        int i4;
        long jA;
        int i5;
        boolean z8;
        int i6;
        int i7;
        boolean z9;
        int i8;
        int i9;
        int i10;
        boolean z10;
        b0k b0kVar2;
        boolean z11;
        long j2;
        qim0 qim0Var2;
        boolean z12;
        h311 h311VarV;
        int i11;
        qim0 qim0VarC;
        qim0 qim0Var3;
        long j3;
        boolean z13;
        boolean z14;
        View view;
        boolean zG;
        Object objT;
        hsl1 hsl1VarA;
        p3v p3vVar;
        float f2;
        nk80 nk80VarI;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(936901589);
        if ((i & 6) == 0) {
            i4 = (b0kVar3.i(u390Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= b0kVar3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= b0kVar3.i(function0) ? SemanticState.Hidden : SemanticState.Focused;
        }
        int i19 = i3 & 8;
        int i20 = SemanticState.ReadOnly;
        if (i19 == 0) {
            if ((i & 3072) == 0) {
                i4 |= b0kVar3.g(qim0Var) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                jA = j;
                if ((i3 & 16) == 0 || !b0kVar3.f(jA)) {
                    i18 = SemanticState.Multiline;
                } else {
                    i18 = TlsSocketProvider.READ_BUFFER_SIZE;
                }
                i4 |= i18;
            } else {
                jA = j;
            }
            if ((i & 196608) == 0) {
                if (b0kVar3.d(f)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i4 |= i17;
            }
            i5 = i3 & 64;
            if (i5 != 0) {
                i4 |= 1572864;
                z8 = z2;
            } else {
                z8 = z2;
                if ((i & 1572864) == 0) {
                    if (b0kVar3.h(z8)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i4 |= i6;
                }
            }
            i7 = i3 & SemanticState.Focused;
            if (i7 != 0) {
                i4 |= 12582912;
                z9 = z3;
            } else {
                z9 = z3;
                if ((i & 12582912) == 0) {
                    if (b0kVar3.h(z9)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
            }
            if ((i & 100663296) == 0) {
                if (b0kVar3.h(z4)) {
                    i16 = 67108864;
                } else {
                    i16 = 33554432;
                }
                i4 |= i16;
            }
            if ((i & 805306368) == 0) {
                int i21 = i4;
                if (b0kVar3.h(z5)) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i9 = i21 | i15;
            } else {
                i9 = i4;
            }
            if ((i2 & 6) == 0) {
                if (b0kVar3.h(z6)) {
                    i14 = 4;
                } else {
                    i14 = 2;
                }
                i10 = i2 | i14;
            } else {
                i10 = i2;
            }
            if ((i2 & 48) == 0) {
                if (b0kVar3.h(z7)) {
                    i13 = 32;
                } else {
                    i13 = 16;
                }
                i10 |= i13;
            }
            if ((i2 & 384) != 0) {
                if (b0kVar3.i(vu30Var)) {
                    i12 = SemanticState.Hidden;
                } else {
                    i12 = SemanticState.Focused;
                }
                i10 |= i12;
            }
            if ((i2 & 3072) != 0) {
                if (b0kVar3.i(j2iVar)) {
                    i20 = 2048;
                }
                i10 |= i20;
            }
            int i22 = i10;
            if ((i9 & 306783379) == 306783378 || (i22 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (b0kVar3.Y(i9 & 1, z10)) {
                b0kVar3.d0();
                i11 = i & 1;
                qim0VarC = nim0.a;
                if (i11 != 0 || b0kVar3.E()) {
                    if (i19 != 0) {
                        qim0Var3 = qim0VarC;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if ((i3 & 16) != 0) {
                        uwr uwrVar = cbx.a;
                        jA = cbx.a(b0kVar3).a.a.a();
                        i9 &= -57345;
                    }
                    boolean z15 = i5 == 0 ? z8 : true;
                    j3 = jA;
                    z13 = i7 == 0 ? z9 : false;
                    z14 = z15;
                } else {
                    b0kVar3.b0();
                    if ((i3 & 16) != 0) {
                        i9 &= -57345;
                    }
                    qim0Var3 = qim0Var;
                    z14 = z8;
                    j3 = jA;
                    z13 = z9;
                }
                b0kVar3.s();
                flb0 flb0Var = (flb0) b0kVar3.k(t4k.n);
                if (z6) {
                    qim0VarC = u291.c(qim0VarC, 1.0f);
                }
                qim0 qim0Var4 = qim0VarC;
                view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
                wat watVar = (wat) b0kVar3.k(t4k.h);
                zG = b0kVar3.g(view);
                objT = b0kVar3.T();
                if (zG || objT == fkj0.X) {
                    View rootView = view.getRootView();
                    WeakHashMap weakHashMap = b8k1.a;
                    hsl1VarA = s7k1.a(rootView);
                    if (hsl1VarA != null || (nk80VarI = hsl1VarA.a.i(519)) == null) {
                        p3vVar = null;
                    } else {
                        p3vVar = new p3v(watVar.M0(nk80VarI.b));
                    }
                    if (p3vVar != null) {
                        f2 = p3vVar.a;
                    } else {
                        f2 = 0.0f;
                    }
                    objT = ktd.k(f2, b0kVar3);
                }
                qim0 qim0VarThen = uyn1.B(qim0Var4, 0.0f, ((p3v) objT).a, 0.0f, 0.0f, 13).then(qim0Var3);
                vy71 vy71Var = u390Var.a;
                boolean z16 = !z13;
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                cua cuaVar2 = cbx.b(b0kVar3).f;
                b0kVar2 = b0kVar3;
                long j4 = j3;
                dem0.a(function0, qim0VarThen, vy71Var, f, z16, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12), j3, 0L, 0.0f, u7h.b(u7h.b, z4 ? 0.5f : 0.0f, 0.0f, 0.0f, 0.0f, 14), z14 ? xli.a : null, urw.N0, new eem0(2), apo.r(-369228489, new pcx(flb0Var, u390Var, j4, z13, z5, z6, z, z7, vu30Var, j2iVar), b0kVar2), b0kVar2, ((i9 >> 6) & 7182) | (3670016 & (i9 << 6)), 3456, 384);
                z12 = z13;
                z11 = z14;
                j2 = j4;
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                long j5 = jA;
                z11 = z8;
                j2 = j5;
                qim0Var2 = qim0Var;
                z12 = z9;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new qcx(u390Var, z, function0, qim0Var2, j2, f, z11, z12, z4, z5, z6, z7, vu30Var, j2iVar, i, i2, i3);
            }
        }
        i4 |= 3072;
        if ((i & 24576) == 0) {
            jA = j;
            if ((i3 & 16) == 0) {
                i18 = SemanticState.Multiline;
            } else {
                i18 = SemanticState.Multiline;
            }
            i4 |= i18;
        } else {
            jA = j;
        }
        if ((i & 196608) == 0) {
            if (b0kVar3.d(f)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i4 |= i17;
        }
        i5 = i3 & 64;
        if (i5 != 0) {
            i4 |= 1572864;
            z8 = z2;
        } else {
            z8 = z2;
            if ((i & 1572864) == 0) {
                if (b0kVar3.h(z8)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i4 |= i6;
            }
        }
        i7 = i3 & SemanticState.Focused;
        if (i7 != 0) {
            i4 |= 12582912;
            z9 = z3;
        } else {
            z9 = z3;
            if ((i & 12582912) == 0) {
                if (b0kVar3.h(z9)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
        }
        if ((i & 100663296) == 0) {
            if (b0kVar3.h(z4)) {
                i16 = 67108864;
            } else {
                i16 = 33554432;
            }
            i4 |= i16;
        }
        if ((i & 805306368) == 0) {
            int i23 = i4;
            if (b0kVar3.h(z5)) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i9 = i23 | i15;
        } else {
            i9 = i4;
        }
        if ((i2 & 6) == 0) {
            if (b0kVar3.h(z6)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i2 | i14;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (b0kVar3.h(z7)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i2 & 384) != 0) {
            if (b0kVar3.i(vu30Var)) {
                i12 = SemanticState.Hidden;
            } else {
                i12 = SemanticState.Focused;
            }
            i10 |= i12;
        }
        if ((i2 & 3072) != 0) {
            if (b0kVar3.i(j2iVar)) {
                i20 = 2048;
            }
            i10 |= i20;
        }
        int i24 = i10;
        if ((i9 & 306783379) == 306783378) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (b0kVar3.Y(i9 & 1, z10)) {
            b0kVar3.d0();
            i11 = i & 1;
            qim0VarC = nim0.a;
            if (i11 != 0) {
                if (i19 != 0) {
                    qim0Var3 = qim0VarC;
                } else {
                    qim0Var3 = qim0Var;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar3 = cbx.a;
                    jA = cbx.a(b0kVar3).a.a.a();
                    i9 &= -57345;
                }
                if (i5 == 0) {
                }
                j3 = jA;
                z13 = i7 == 0 ? z9 : false;
                z14 = z15;
            } else {
                if (i19 != 0) {
                    qim0Var3 = qim0VarC;
                } else {
                    qim0Var3 = qim0Var;
                }
                if ((i3 & 16) != 0) {
                    uwr uwrVar4 = cbx.a;
                    jA = cbx.a(b0kVar3).a.a.a();
                    i9 &= -57345;
                }
                if (i5 == 0) {
                }
                j3 = jA;
                z13 = i7 == 0 ? z9 : false;
                z14 = z15;
            }
            b0kVar3.s();
            flb0 flb0Var2 = (flb0) b0kVar3.k(t4k.n);
            if (z6) {
                qim0VarC = u291.c(qim0VarC, 1.0f);
            }
            qim0 qim0Var5 = qim0VarC;
            view = (View) b0kVar3.k(AndroidCompositionLocals_androidKt.f);
            wat watVar2 = (wat) b0kVar3.k(t4k.h);
            zG = b0kVar3.g(view);
            objT = b0kVar3.T();
            if (zG) {
                View rootView2 = view.getRootView();
                WeakHashMap weakHashMap2 = b8k1.a;
                hsl1VarA = s7k1.a(rootView2);
                if (hsl1VarA != null) {
                    p3vVar = null;
                } else {
                    p3vVar = null;
                }
                if (p3vVar != null) {
                    f2 = p3vVar.a;
                } else {
                    f2 = 0.0f;
                }
                objT = ktd.k(f2, b0kVar3);
            } else {
                View rootView3 = view.getRootView();
                WeakHashMap weakHashMap3 = b8k1.a;
                hsl1VarA = s7k1.a(rootView3);
                if (hsl1VarA != null) {
                    p3vVar = null;
                } else {
                    p3vVar = null;
                }
                if (p3vVar != null) {
                    f2 = p3vVar.a;
                } else {
                    f2 = 0.0f;
                }
                objT = ktd.k(f2, b0kVar3);
            }
            qim0 qim0VarThen2 = uyn1.B(qim0Var5, 0.0f, ((p3v) objT).a, 0.0f, 0.0f, 13).then(qim0Var3);
            vy71 vy71Var2 = u390Var.a;
            boolean z17 = !z13;
            uwr uwrVar5 = cbx.a;
            cua cuaVar3 = cbx.b(b0kVar3).f;
            cua cuaVar4 = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            long j6 = j3;
            dem0.a(function0, qim0VarThen2, vy71Var2, f, z17, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12), j3, 0L, 0.0f, u7h.b(u7h.b, z4 ? 0.5f : 0.0f, 0.0f, 0.0f, 0.0f, 14), z14 ? xli.a : null, urw.N0, new eem0(2), apo.r(-369228489, new pcx(flb0Var2, u390Var, j6, z13, z5, z6, z, z7, vu30Var, j2iVar), b0kVar2), b0kVar2, ((i9 >> 6) & 7182) | (3670016 & (i9 << 6)), 3456, 384);
            z12 = z13;
            z11 = z14;
            j2 = j6;
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            long j7 = jA;
            z11 = z8;
            j2 = j7;
            qim0Var2 = qim0Var;
            z12 = z9;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qcx(u390Var, z, function0, qim0Var2, j2, f, z11, z12, z4, z5, z6, z7, vu30Var, j2iVar, i, i2, i3);
        }
    }

    public static Intent g0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler, int i) {
        int i2 = i & 1;
        if (i2 != 0 && (i & 4) != 0) {
            hhg1.n("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
            return null;
        }
        if (i2 != 0) {
            i |= 2;
        }
        int i3 = i & 2;
        if (i3 == 0 && (i & 4) == 0) {
            hhg1.n("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            return null;
        }
        if (i3 != 0 && (i & 4) != 0) {
            hhg1.n("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            return null;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            return no80.F(context, broadcastReceiver, intentFilter, handler, i);
        }
        if (i4 >= 26) {
            return fpi1.I(context, broadcastReceiver, intentFilter, handler, i);
        }
        return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, b0(context), handler) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    public static void h(AudioAttributes.Builder builder, boolean z) {
        builder.setHapticChannelsMuted(z);
    }

    public static void h0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        g0(context, broadcastReceiver, intentFilter, null, 2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    public static int i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        boolean z;
        int i3;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            i15.o();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d);
            int i4 = 0;
            while (true) {
                z = true;
                if (i4 >= supportedPerformancePoints.size()) {
                    i3 = 1;
                    break;
                }
                if (swg0.d(supportedPerformancePoints.get(i4)).covers(performancePoint)) {
                    i3 = 2;
                    break;
                }
                i4++;
            }
            if (i3 == 1 && ajo1.c == null) {
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 37) {
                    z = false;
                } else {
                    int iA = A(true);
                    if (i5 < 35 ? !(A(false) != 2 || iA == 1) : iA != 1) {
                        z = false;
                    }
                }
                ajo1.c = Boolean.valueOf(z);
                if (z) {
                }
            }
            return i3;
        }
        return 0;
    }

    public static void i0(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static int j(Context context, String str) {
        n8p1.A(str, "permission must be non-null");
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return new vno0(context).b.areNotificationsEnabled() ? 0 : -1;
    }

    public static void j0(AudioAttributes.Builder builder, int i) {
        builder.setAllowedCapturePolicy(i);
    }

    public static final Notification k(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager.getNotificationChannel("spotify_updates_channel") == null) {
                wu7.m();
                notificationManager.createNotificationChannel(new NotificationChannel("spotify_updates_channel", "Spotify", 2));
            }
        }
        dko0 dko0Var = new dko0(context, "spotify_updates_channel");
        dko0Var.D.icon = context.getApplicationInfo().icon;
        dko0Var.j = -1;
        dko0Var.v = 1;
        return dko0Var.c();
    }

    public static void k0(p9b0 p9b0Var, Object obj) {
        p9b0Var.setBlendMode((BlendMode) obj);
    }

    public static LocusId l(String str) {
        return new LocusId(str);
    }

    public static void l0(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static ColorFilter m(int i, Object obj) {
        return new BlendModeColorFilter(i, (BlendMode) obj);
    }

    public static void m0(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static Context n(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static void n0(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(f4i1.c(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static MediaFormat o(ie30 ie30Var) {
        int i;
        MediaFormat mediaFormat = new MediaFormat();
        a0(mediaFormat, "bitrate", ie30Var.k);
        a0(mediaFormat, "max-bitrate", ie30Var.j);
        a0(mediaFormat, "channel-count", ie30Var.J);
        int iY = zoi1.y(ie30Var);
        if (iY != 0) {
            mediaFormat.setInteger("channel-mask", iY);
        }
        Z(mediaFormat, ie30Var.H);
        String str = ie30Var.f66p;
        if (str != null) {
            mediaFormat.setString("mime", str);
        }
        String str2 = ie30Var.l;
        if (str2 != null) {
            mediaFormat.setString("codecs-string", str2);
        }
        float f = ie30Var.B;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        a0(mediaFormat, "width", ie30Var.w);
        a0(mediaFormat, "height", ie30Var.x);
        n0(mediaFormat, ie30Var.s);
        int i2 = ie30Var.M;
        if (i2 != -1) {
            a0(mediaFormat, "exo-pcm-encoding-int", i2);
            if (i2 == 0) {
                i = 0;
            } else if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    i = 4;
                    if (i2 != 4) {
                        i = 21;
                        if (i2 != 21) {
                            i = 22;
                            if (i2 == 22) {
                            }
                        }
                    }
                }
            } else {
                i = 2;
            }
            mediaFormat.setInteger("pcm-encoding", i);
        }
        String str3 = ie30Var.d;
        if (str3 != null) {
            mediaFormat.setString("language", str3);
        }
        a0(mediaFormat, "max-input-size", ie30Var.q);
        a0(mediaFormat, "sample-rate", ie30Var.L);
        a0(mediaFormat, "caption-service-number", ie30Var.P);
        mediaFormat.setInteger("rotation-degrees", ie30Var.C);
        int i3 = ie30Var.e;
        int i4 = 1;
        mediaFormat.setInteger("is-autoselect", (i3 & 4) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-default", (i3 & 1) != 0 ? 1 : 0);
        mediaFormat.setInteger("is-forced-subtitle", (i3 & 2) != 0 ? 1 : 0);
        mediaFormat.setInteger("encoder-delay", ie30Var.N);
        mediaFormat.setInteger("encoder-padding", ie30Var.O);
        float f2 = ie30Var.E;
        mediaFormat.setFloat("exo-pixel-width-height-ratio-float", f2);
        int i5 = 1073741824;
        if (f2 < 1.0f) {
            i4 = (int) (f2 * 1.0737418E9f);
        } else if (f2 > 1.0f) {
            i5 = (int) (1.0737418E9f / f2);
            i4 = 1073741824;
        } else {
            i5 = 1;
        }
        mediaFormat.setInteger("sar-width", i4);
        mediaFormat.setInteger("sar-height", i5);
        String str4 = ie30Var.a;
        if (str4 != null) {
            try {
                mediaFormat.setInteger("track-id", Integer.parseInt(str4));
            } catch (NumberFormatException unused) {
            }
        }
        return mediaFormat;
    }

    public static void o0(ik5 ik5Var, Rect rect) {
        ik5Var.setEpicenterBounds(rect);
    }

    public static void p(Canvas canvas) {
        canvas.disableZ();
    }

    public static void p0(ik5 ik5Var) {
        ik5Var.setIsClippedToScreen(true);
    }

    public static void q(Canvas canvas, int i, BlendMode blendMode) {
        canvas.drawColor(i, blendMode);
    }

    public static void q0(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }

    public static void r(Canvas canvas, long j) {
        canvas.drawColor(j);
    }

    public static void r0(Context context, Intent intent) {
        context.startActivity(intent, null);
    }

    public static void s(Canvas canvas, long j, BlendMode blendMode) {
        canvas.drawColor(j, blendMode);
    }

    public static final void s0(Service service, int i, Integer num) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return;
        }
        Notification notificationK = k(service);
        if (num == null || i2 < 29) {
            service.startForeground(i, notificationK);
        } else {
            service.startForeground(i, notificationK, num.intValue());
        }
    }

    public static void t(Canvas canvas, RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
    }

    public static void u(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public static void u0(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            fpi1.R(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static void v(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static final BlendMode v0(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static void w(Canvas canvas, MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    public static final PorterDuff.Mode w0(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final void x(Window window) {
        nsl1 lsl1Var;
        d55.i(window, false);
        up41 up41Var = new up41(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            lsl1Var = new nsl1(window, up41Var);
        } else if (i >= 30) {
            lsl1Var = new msl1(window, up41Var);
        } else {
            lsl1Var = i >= 26 ? new lsl1(window, up41Var) : new ksl1(window, up41Var);
        }
        lsl1Var.J(false);
        lsl1Var.I(false);
        if (Build.VERSION.SDK_INT >= 29) {
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static long x0(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }

    public static void y(Canvas canvas) {
        canvas.enableZ();
    }

    public static void z(Canvas canvas, boolean z) {
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
