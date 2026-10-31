package p;

import android.media.MediaCodecInfo;
import android.media.MediaRoute2Info;
import android.media.metrics.MediaMetricsManager;
import android.os.Build;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class swg0 implements cjh0, gkh0, f9d0, e9d0, wlh0, Function, Predicate {
    public final /* synthetic */ byte a;

    public /* synthetic */ swg0(rlh0 rlh0Var) {
        this.a = (byte) 5;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRoute2Info f(Object obj) {
        return (MediaRoute2Info) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager g(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ void h(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public void a(rlh0 rlh0Var) {
        switch (this.a) {
            case 8:
                if (rlh0Var.p()) {
                    tkh0 tkh0Var = rlh0Var.a;
                    tkh0Var.getClass();
                    dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
                    tkh0Var.d.getClass();
                    return;
                }
                return;
            case 9:
                rlh0Var.i.h(26, new n9v((byte) 14));
                return;
            case 10:
                tkh0 tkh0Var2 = rlh0Var.a;
                Objects.requireNonNull(tkh0Var2);
                tkh0Var2.g1(new gv40(tkh0Var2, (byte) 16));
                return;
            default:
                throw new ClassCastException();
        }
    }

    public Object apply(Object obj) {
        return ((vih0) obj).f();
    }

    public int b(Object obj) {
        String str = ((bkh0) obj).a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public void c() {
        int i = MediaButtonReceiver.h;
    }

    public void e(Object obj, ko20 ko20Var) {
        ((o8u0) obj).w0(new n8u0(ko20Var));
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 6:
                ((o8u0) obj).H(1);
                break;
            default:
                ((o8u0) obj).h0(0.0f);
                break;
        }
    }

    public boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 16:
                hyh0.w("PLAY", th);
                break;
            case 17:
                hyh0.w("SKIP_TO_PREVIOUS", th);
                break;
            case 18:
                hyh0.w("SKIP_TO_NEXT", th);
                break;
            case 19:
                hyh0.w("SEEK_TO", th);
                break;
            case 20:
                hyh0.w("PLAY_FROM_SEARCH", th);
                break;
            case 21:
                hyh0.w("SKIP_TO_QUEUE_ITEM", th);
                break;
            case 22:
                hyh0.w("PAUSE", th);
                break;
            case 23:
                hyh0.w("SET_REPEAT_MODE", th);
                break;
            case 24:
                hyh0.w("STOP", th);
                break;
            case 25:
                hyh0.w("PREPARE_FROM_URI", th);
                break;
            case 26:
                hyh0.w("PLAY_FROM_URI", th);
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                hyh0.w("SET_RATING", th);
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                hyh0.w("PLAY_FROM_MEDIA_ID", th);
                break;
            default:
                hyh0.w("SET_SHUFFLE_MODE", th);
                break;
        }
        return true;
    }

    public /* synthetic */ swg0(byte b) {
        this.a = b;
    }
}
