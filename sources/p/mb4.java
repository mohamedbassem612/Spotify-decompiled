package p;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.verify.domain.DomainVerificationManager;
import android.content.pm.verify.domain.DomainVerificationUserState;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.location.Location;
import android.media.AudioDescriptor;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.session.MediaSession;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.media3.common.ParserException;
import androidx.media3.session.legacy.MediaSessionCompat;
import androidx.media3.session.legacy.PlaybackStateCompat;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mb4 {
    public static float A(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void B(ob4 ob4Var, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (u890.j(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            j(ob4Var, longSparseArray);
        } else {
            ob4Var.a.post(new ny2((Object) ob4Var, (Object) longSparseArray, (byte) 2));
        }
    }

    public static final void C(View view) {
        Vibrator defaultVibrator;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            view.performHapticFeedback(1);
            return;
        }
        Context context = view.getContext();
        if (i >= 31) {
            defaultVibrator = tw20.m(context.getSystemService("vibrator_manager")).getDefaultVibrator();
            defaultVibrator.getClass();
        } else {
            defaultVibrator = (Vibrator) context.getSystemService("vibrator");
        }
        defaultVibrator.vibrate(VibrationEffect.createPredefined(0));
    }

    public static final void D(View view) {
        Vibrator defaultVibrator;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            view.performHapticFeedback(4);
            return;
        }
        Context context = view.getContext();
        if (i >= 31) {
            defaultVibrator = tw20.m(context.getSystemService("vibrator_manager")).getDefaultVibrator();
            defaultVibrator.getClass();
        } else {
            defaultVibrator = (Vibrator) context.getSystemService("vibrator");
        }
        defaultVibrator.vibrate(VibrationEffect.createPredefined(2));
    }

    public static boolean E(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static void F(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }

    public static void G(Notification.Builder builder, int i) {
        builder.setForegroundServiceBehavior(i);
    }

    public static void H(MediaDrm mediaDrm, byte[] bArr, dbu0 dbu0Var) {
        LogSessionId logSessionIdA = dbu0Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdA);
    }

    public static void I(MediaFormat mediaFormat, LogSessionId logSessionId) {
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        mediaFormat.setString("log-session-id", logSessionId.getStringId());
    }

    public static void J(g2z g2zVar, dbu0 dbu0Var) {
        LogSessionId logSessionIdA = dbu0Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) g2zVar.b).setString("log-session-id", logSessionIdA.getStringId());
    }

    public static void K(MediaSessionCompat mediaSessionCompat, ComponentName componentName) {
        try {
            Object mediaSession = mediaSessionCompat.getMediaSession();
            mediaSession.getClass();
            ((MediaSession) mediaSession).setMediaButtonBroadcastReceiver(componentName);
        } catch (IllegalArgumentException e) {
            if (!Build.MANUFACTURER.equals("motorola")) {
                throw e;
            }
            oon1.w("caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details.", e);
        }
    }

    public static void L(RenderNode renderNode, vc21 vc21Var) {
        renderNode.setRenderEffect(vc21Var != null ? vc21Var.a() : null);
    }

    public static void M(View view, vc21 vc21Var) {
        view.setRenderEffect(vc21Var != null ? vc21Var.a() : null);
    }

    public static int[] N(NetworkRequest networkRequest) {
        return networkRequest.getTransportTypes();
    }

    public static final n05 a(float f, float f2) {
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR);
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(1.8f);
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffectCreateBlurEffect);
        if (f2 <= 0.0f) {
            return new n05(renderEffectCreateColorFilterEffect);
        }
        float[] fArr = new float[9];
        for (int i = 0; i < 9; i++) {
            fArr[i] = i / 8.0f;
        }
        int[] iArr = new int[9];
        for (int i2 = 0; i2 < 9; i2++) {
            iArr[i2] = Color.argb(jch0.U(e4p1.k(fArr[i2]) * 255.0f), 0, 0, 0);
        }
        return new n05(RenderEffect.createBlendModeEffect(renderEffectCreateColorFilterEffect, RenderEffect.createShaderEffect(new LinearGradient(0.0f, 0.0f, 0.0f, f2, iArr, fArr, Shader.TileMode.CLAMP)), BlendMode.DST_IN));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0092  */
    public static final uqt b(Context context, String str) {
        String strY0;
        String str2;
        String[] strArr;
        String str3;
        Object systemService;
        ActivityManager activityManager;
        long j;
        String str4;
        String str5 = Build.VERSION.RELEASE;
        int i = Build.VERSION.SDK_INT;
        String str6 = "Android " + str5 + " (API " + i + ")";
        if (i < 31) {
            strY0 = Build.HARDWARE;
            if (strY0 == null) {
                str2 = "unknown";
            }
            strArr = Build.SUPPORTED_ABIS;
            if (strArr != null || (str4 = (String) f46.k0(strArr)) == null) {
                str3 = "unknown";
            } else {
                str3 = str4;
            }
            systemService = context.getSystemService("activity");
            if (systemService instanceof ActivityManager) {
                activityManager = (ActivityManager) systemService;
            } else {
                activityManager = null;
            }
            if (activityManager == null) {
                j = 0;
            } else {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                j = memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            }
            return new uqt(str6, str2, str3, str, j);
        }
        String str7 = Build.SOC_MANUFACTURER;
        str7.getClass();
        if (ihc1.y0(str7)) {
            str7 = null;
        }
        String str8 = Build.SOC_MODEL;
        str8.getClass();
        if (ihc1.y0(str8)) {
            str8 = null;
        }
        strY0 = o7h.y0(f46.i0(new String[]{str7, str8}), " ", (String) null, (String) null, (iu30) null, 62);
        if (ihc1.y0(strY0) && (strY0 = Build.HARDWARE) == null) {
            strY0 = "unknown";
        }
        str2 = strY0;
        strArr = Build.SUPPORTED_ABIS;
        if (strArr != null) {
            str3 = "unknown";
        } else {
            str3 = "unknown";
        }
        systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null) {
            j = 0;
        } else {
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo2);
            j = memoryInfo2.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        return new uqt(str6, str2, str3, str, j);
    }

    public static int c() {
        int i = Build.VERSION.SDK_INT >= 31 ? Build.VERSION.MEDIA_PERFORMANCE_CLASS : 0;
        HashMap map = dur.b;
        if (i < 30) {
            i = 0;
        }
        if (i > 0) {
            return i;
        }
        Integer num = (Integer) dur.b.get(Build.BRAND + '/' + ((Object) Build.PRODUCT) + '/' + ((Object) Build.DEVICE) + ':' + ((Object) Build.VERSION.RELEASE));
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue();
        if (iIntValue < 30) {
            return 0;
        }
        return iIntValue;
    }

    public static boolean d(Context context) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 31) {
            DomainVerificationUserState domainVerificationUserState = ((DomainVerificationManager) context.getSystemService(DomainVerificationManager.class)).getDomainVerificationUserState(context.getPackageName());
            if (domainVerificationUserState == null || !domainVerificationUserState.isLinkHandlingAllowed()) {
                return false;
            }
            Integer num = domainVerificationUserState.getHostToStateMap().get("www.spotify.com");
            if ((num == null || num.intValue() != 2) && (num == null || num.intValue() != 1)) {
                return false;
            }
        } else {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/api/payment-sdk/android/v3/proceed/redirect/")), 65536);
            if ((resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo : null) == null) {
                return false;
            }
        }
        return true;
    }

    public static int[] e(NetworkRequest networkRequest) {
        return networkRequest.getCapabilities();
    }

    public static EdgeEffect f(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RenderEffect g(int i, float f, float f2) {
        return (f == 0.0f && f2 == 0.0f) ? RenderEffect.createOffsetEffect(0.0f, 0.0f) : RenderEffect.createBlurEffect(f, f2, oon1.D(i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static Bitmap h(byte[] bArr, int i, BitmapFactory.Options options, int i2) throws ParserException, IOException {
        int i3 = 0;
        if (i2 != -1) {
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            sm00 sm00Var = new sm00(byteArrayInputStream);
            byteArrayInputStream.close();
            switch (sm00Var.i(1, "Orientation")) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static void i(Context context, v8o0 v8o0Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            t8o0 t8o0Var = new t8o0(v8o0Var);
            telephonyManager.registerTelephonyCallback((Executor) v8o0Var.c, t8o0Var);
            telephonyManager.unregisterTelephonyCallback(t8o0Var);
        } catch (RuntimeException unused) {
            v8o0Var.d(5);
        }
    }

    public static void j(ob4 ob4Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        x161 x161Var;
        v161 v161Var;
        iu30 iu30Var;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (x161Var = (x161) ob4Var.c().b((int) jKeyAt)) != null && (v161Var = x161Var.a) != null) {
                Object objG = v161Var.d.a.g(m161.l);
                if (objG == null) {
                    objG = null;
                }
                we weVar = (we) objG;
                if (weVar != null && (iu30Var = weVar.b) != null) {
                }
            }
        }
    }

    public static void k(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void l(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void m(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static b380 n(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            w280 w280Var = b380.b;
            return bg11.e;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new pt7((byte) 0)).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorC = um5.c(it.next());
            if (audioDescriptorC.getStandard() == 1) {
                byte[] descriptor = audioDescriptorC.getDescriptor();
                if (descriptor.length != 3) {
                    oon1.H("Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zoi1.x(i)));
                    }
                }
            }
        }
        return b380.p(treeSet);
    }

    public static Path o(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float p(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static final int q(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 31 || eg.b(context.getResources().getConfiguration()) == Integer.MAX_VALUE) {
            return 0;
        }
        return eg.b(context.getResources().getConfiguration());
    }

    public static Shader.TileMode r() {
        return Shader.TileMode.DECAL;
    }

    public static br31 s(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        hhg1.n(f4i1.c(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new br31(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int t(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i = SystemJobService.e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static Vibrator u(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            VibratorManager vibratorManager = systemService instanceof VibratorManager ? (VibratorManager) systemService : null;
            if (vibratorManager != null) {
                return vibratorManager.getDefaultVibrator();
            }
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            if (systemService2 instanceof Vibrator) {
                return (Vibrator) systemService2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025  */
    public static final Vibrator v(Context context) {
        Vibrator defaultVibrator;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && x74.j(context, "android.permission.VIBRATE") == 0) {
            if (i >= 31) {
                VibratorManager vibratorManagerM = tw20.m(context.getSystemService(VibratorManager.class));
                if (vibratorManagerM != null) {
                    defaultVibrator = vibratorManagerM.getDefaultVibrator();
                } else {
                    defaultVibrator = null;
                }
            } else {
                Object systemService = context.getSystemService("vibrator");
                if (systemService instanceof Vibrator) {
                    defaultVibrator = (Vibrator) systemService;
                } else {
                    defaultVibrator = null;
                }
            }
            if (defaultVibrator != null && defaultVibrator.hasVibrator()) {
                return defaultVibrator;
            }
        }
        return null;
    }

    public static boolean w(PendingIntent pendingIntent) {
        return pendingIntent.isActivity();
    }

    public static boolean x(Location location) {
        return location.isMock();
    }

    public static Bitmap y(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 31 ? bitmap.asShared() : bitmap;
    }

    public static void z(ob4 ob4Var, long[] jArr, Consumer consumer) {
        v161 v161Var;
        for (long j : jArr) {
            x161 x161Var = (x161) ob4Var.c().b((int) j);
            if (x161Var != null && (v161Var = x161Var.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(ob4Var.a.getAutofillId(), v161Var.f);
                Object objG = v161Var.d.a.g(z161.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new af5(p5d0.b(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }
}
