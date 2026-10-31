package p;

import android.media.MediaCodecInfo;
import androidx.car.app.model.Alert;
import app.p000rive.runtime.kotlin.RiveAnimationView;
import com.android.volley.VolleyError;
import com.spotify.interapp.service.IapException;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class hfr implements e9d0, rwr, Function, Predicate, e2i0, ky21 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;

    public /* synthetic */ hfr(String str, byte b) {
        this.a = b;
        this.b = str;
    }

    public int a(MediaCodecInfo mediaCodecInfo) {
        q36 q36Var = abx.a;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = mediaCodecInfo.getCapabilitiesForType(this.b).getEncoderCapabilities();
        encoderCapabilities.getClass();
        if (encoderCapabilities.isBitrateModeSupported(1)) {
            return 0;
        }
        return Alert.DURATION_SHOW_INDEFINITELY;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        String str = this.b;
        switch (b) {
            case 3:
                return (za2) ((List) obj).stream().filter(new ves(str)).findFirst().map(new pt7((byte) 1)).orElse(xa2.a);
            case 4:
                return (g3d0) jo31.t(igu.b, new f14((r3d0) obj, str, (byte) 20));
            case 5:
                PlayerState playerState = (PlayerState) obj;
                return Boolean.valueOf(u890.j(playerState.contextUri(), str) && (playerState.isPlaying() && !playerState.isPaused()));
            case 6:
                lxh0 lxh0Var = (lxh0) obj;
                return lxh0Var.f(str) ? Maybe.e(lxh0Var) : MaybeEmpty.a;
            case 7:
                return ((lxh0) obj).o(str);
            case 8:
            case 11:
            case 14:
            case 15:
            default:
                beh behVar = (feh) obj;
                behVar.getClass();
                if (behVar instanceof beh) {
                    throw ExceptionHelper.f(new IapException(new es5(String.format(str.concat(": [%s]"), oh61.e(t380.p(Arrays.asList(oh61.B.split(behVar.a)))))), "wamp.error"));
                }
                return cv5.a;
            case 9:
                return ((lxh0) obj).c(str);
            case 10:
                return ((lxh0) obj).k(str);
            case 12:
                return ((lxh0) obj).e(str);
            case 13:
                return ((lxh0) obj).p(str);
            case 16:
                return spq0.a((String) ((Map) obj).get(str));
            case 17:
                return spq0.a((String) ((Map) obj).get(str));
        }
    }

    @Override // p.ky21
    public void b(VolleyError volleyError) throws IOException {
        RiveAnimationView.loadFromNetwork$lambda$5(this.b, volleyError);
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        return ((iqh0) fzh0Var).L(ixh0Var, this.b);
    }

    public void invoke(Object obj) {
        byte b = this.a;
        String str = this.b;
        uz3 uz3Var = (uz3) obj;
        switch (b) {
            case 0:
                uz3Var.getClass();
                uz3Var.e(str);
                break;
            default:
                uz3Var.getClass();
                uz3Var.c(str);
                break;
        }
    }

    public boolean test(Object obj) {
        byte b = this.a;
        String str = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 8:
                hyh0.w(str, th);
                break;
            default:
                hyh0.w(str, th);
                break;
        }
        return true;
    }

    public /* synthetic */ hfr(tz3 tz3Var, String str, long j, long j2, byte b) {
        this.a = b;
        this.b = str;
    }
}
