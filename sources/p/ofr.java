package p;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaRouter2;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.IapException;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.Function;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ofr implements e9d0, jl60, w5y, Function, hbe1, plj0, v0i, g4u, e9v {
    public final /* synthetic */ byte a;

    public /* synthetic */ ofr(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int deviceId = motionEvent.getDeviceId();
        int source = motionEvent.getSource();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            Method method = f8k1.a;
            scaledMinimumFlingVelocity = sf.w(viewConfiguration, deviceId, i, source);
        } else {
            Method method2 = f8k1.a;
            InputDevice device = InputDevice.getDevice(deviceId);
            if (device == null || device.getMotionRange(i, source) == null) {
                scaledMinimumFlingVelocity = Integer.MAX_VALUE;
            } else {
                Resources resources = context.getResources();
                int identifier = (source == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                Objects.requireNonNull(viewConfiguration);
                if (identifier == -1) {
                    scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                }
            }
        }
        iArr[0] = scaledMinimumFlingVelocity;
        int deviceId2 = motionEvent.getDeviceId();
        int source2 = motionEvent.getSource();
        if (i2 >= 34) {
            scaledMaximumFlingVelocity = sf.v(viewConfiguration, deviceId2, i, source2);
        } else {
            InputDevice device2 = InputDevice.getDevice(deviceId2);
            if (device2 == null || device2.getMotionRange(i, source2) == null) {
                scaledMaximumFlingVelocity = Integer.MIN_VALUE;
            } else {
                Resources resources2 = context.getResources();
                int identifier2 = (source2 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                Objects.requireNonNull(viewConfiguration);
                if (identifier2 == -1) {
                    scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                }
            }
        }
        iArr[1] = scaledMaximumFlingVelocity;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    public static float e(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        long j;
        int i2;
        float f;
        float fSqrt;
        float f2;
        float[] fArr;
        Map map = uui1.a;
        velocityTracker.addMovement(motionEvent);
        int i3 = 0;
        int i4 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = uui1.a;
            if (!map2.containsKey(velocityTracker)) {
                map2.put(velocityTracker, new vui1());
            }
            vui1 vui1Var = (vui1) map2.get(velocityTracker);
            long[] jArr = vui1Var.b;
            long eventTime = motionEvent.getEventTime();
            int i5 = vui1Var.d;
            if (i5 != 0 && eventTime - jArr[vui1Var.e] > 40) {
                vui1Var.d = 0;
                vui1Var.c = 0.0f;
                i5 = 0;
            }
            int i6 = (vui1Var.e + 1) % 20;
            vui1Var.e = i6;
            if (i5 != 20) {
                vui1Var.d = i5 + 1;
            }
            vui1Var.a[i6] = motionEvent.getAxisValue(26);
            jArr[vui1Var.e] = eventTime;
        }
        float f3 = Float.MAX_VALUE;
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        vui1 vui1Var2 = (vui1) uui1.a.get(velocityTracker);
        if (vui1Var2 != null) {
            float[] fArr2 = vui1Var2.a;
            long[] jArr2 = vui1Var2.b;
            int i7 = vui1Var2.d;
            if (i7 < 2) {
                fSqrt = 0.0f;
                f = Float.MAX_VALUE;
            } else {
                int i8 = vui1Var2.e;
                int i9 = ((i8 + 20) - (i7 - 1)) % 20;
                long j2 = jArr2[i8];
                while (true) {
                    j = jArr2[i9];
                    long j3 = j2 - j;
                    i2 = vui1Var2.d;
                    if (j3 <= 100) {
                        break;
                    }
                    vui1Var2.d = i2 - 1;
                    i9 = (i9 + 1) % 20;
                }
                if (i2 < 2) {
                    fSqrt = 0.0f;
                    f = Float.MAX_VALUE;
                } else if (i2 == 2) {
                    int i10 = (i9 + 1) % 20;
                    long j4 = jArr2[i10];
                    if (j == j4) {
                        fSqrt = 0.0f;
                    } else {
                        fSqrt = fArr2[i10] / (j4 - j);
                    }
                    f = Float.MAX_VALUE;
                } else {
                    int i11 = 0;
                    float fAbs = 0.0f;
                    while (true) {
                        if (i3 >= vui1Var2.d - 1) {
                            break;
                        }
                        int i12 = i3 + i9;
                        long j5 = jArr2[i12 % 20];
                        int i13 = (i12 + 1) % i4;
                        if (jArr2[i13] == j5) {
                            f2 = f3;
                            fArr = fArr2;
                        } else {
                            i11++;
                            f2 = f3;
                            fArr = fArr2;
                            float fSqrt2 = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f4 = fArr[i13] / (jArr2[i13] - j5);
                            fAbs += Math.abs(f4) * (f4 - fSqrt2);
                            if (i11 == 1) {
                                fAbs *= 0.5f;
                            }
                        }
                        i3++;
                        f3 = f2;
                        fArr2 = fArr;
                        i4 = 20;
                    }
                    f = f3;
                    fSqrt = (fAbs < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f5 = fSqrt * 1000.0f;
            vui1Var2.c = f5;
            if (f5 < (-Math.abs(f))) {
                vui1Var2.c = -Math.abs(f);
            } else if (vui1Var2.c > Math.abs(f)) {
                vui1Var2.c = Math.abs(f);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return sf.m(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        vui1 vui1Var3 = (vui1) uui1.a.get(velocityTracker);
        if (vui1Var3 == null || i != 26) {
            return 0.0f;
        }
        return vui1Var3.c;
    }

    public static /* bridge */ /* synthetic */ MediaRouter2.RoutingController f(Object obj) {
        return (MediaRouter2.RoutingController) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRouter2 g(Object obj) {
        return (MediaRouter2) obj;
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new i9n(str + obj + obj2 + obj3);
    }

    public Observable a(Object obj) {
        switch (this.a) {
            case 6:
                int i = AppProtocolRemoteService.f1;
                Pattern pattern = oh61.B;
                return Observable.error(new IapException(new es5("Operation is deprecated"), "wamp.error"));
            default:
                bs5 bs5Var = (bs5) obj;
                int i2 = AppProtocolRemoteService.f1;
                Pattern pattern2 = oh61.B;
                StringBuilder sb = new StringBuilder("Log from IAP:");
                String str = bs5Var.d;
                String str2 = bs5Var.b;
                String str3 = bs5Var.c;
                if (str != null && !str.isEmpty()) {
                    sb.append(' ');
                    sb.append(bs5Var.d);
                }
                if (str2 != null && !str2.isEmpty()) {
                    sb.append(' ');
                    sb.append(str2);
                }
                String string = sb.toString();
                if ("error".equals(str3)) {
                    Logger.d(string, new Object[0]);
                } else if ("warning".equals(str3)) {
                    Logger.k(string, new Object[0]);
                } else if ("info".equals(str3)) {
                    Logger.g(string, new Object[0]);
                }
                return Observable.just(cv5.a);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 11:
                return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
            case 12:
                return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
            case 13:
                return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
            case 14:
                return LoggingParams.builder().interactionId(((ou80) obj).a).build();
            case 15:
                return spq0.d(LoggingParams.builder().interactionId(((ou80) obj).a).build());
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            default:
                return abt.d(((Throwable) obj).getMessage());
            case 21:
                return new eeh(1, pzm.g("com.spotify.music.extra.IS_PACKAGE_NAME_DENIED", ((Boolean) obj).booleanValue()));
        }
    }

    public h1s b(nk60 nk60Var, ij81 ij81Var, il60 il60Var) {
        return new h1s(nk60Var, ij81Var, il60Var);
    }

    public Constructor d() {
        switch (this.a) {
            case 3:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(ec10.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(ec10.class).getConstructor(null);
        }
    }

    public void invoke(Object obj) {
        uz3 uz3Var = (uz3) obj;
        switch (this.a) {
            case 0:
                uz3Var.getClass();
                break;
            default:
                uz3Var.getClass();
                break;
        }
    }

    public Object m(dxy dxyVar) {
        Set setC = dxyVar.c(lzy0.a(h19.class));
        bv40 bv40Var = bv40.c;
        if (bv40Var == null) {
            synchronized (bv40.class) {
                try {
                    bv40Var = bv40.c;
                    if (bv40Var == null) {
                        bv40Var = new bv40((byte) 0);
                        bv40.c = bv40Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new gys(setC, bv40Var);
    }

    public void o(qeo qeoVar) {
    }

    @Override // p.e9v
    public void release() {
    }

    public boolean test(Object obj, Object obj2) {
        switch (this.a) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return !obj2.equals(obj);
            default:
                return false;
        }
    }

    public void u(hjj0 hjj0Var) {
    }
}
