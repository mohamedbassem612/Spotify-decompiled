package p;

import android.media.MediaCodecInfo;
import android.util.Range;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class pwr implements rwr, e670, Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ pwr(String str, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = i;
    }

    public int a(MediaCodecInfo mediaCodecInfo) {
        q36 q36Var = abx.a;
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(this.b).getVideoCapabilities();
        videoCapabilities.getClass();
        Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
        int i = this.c;
        return Math.abs(((Integer) bitrateRange.clamp(Integer.valueOf(i))).intValue() - i);
    }

    public Object apply(Object obj) {
        y0i0 y0i0Var;
        byte b = this.a;
        int i = 2;
        int i2 = this.c;
        String str = this.b;
        lxh0 lxh0Var = (lxh0) obj;
        switch (b) {
            case 2:
                return lxh0Var.d(i2, str);
            case 3:
                if (i2 == 0) {
                    y0i0Var = y0i0.a;
                } else if (i2 == 1) {
                    y0i0Var = y0i0.b;
                } else {
                    if (i2 != 2) {
                        hhg1.h("Unsupported repeat mode");
                        return null;
                    }
                    y0i0Var = y0i0.c;
                }
                return lxh0Var.l(str, y0i0Var);
            case 4:
                return lxh0Var.h(i2, str);
            default:
                if (i2 == 0) {
                    i = 1;
                } else if (i2 != 1) {
                    hhg1.h("Unsupported shuffle mode");
                    return null;
                }
                return lxh0Var.n(i, str);
        }
    }

    public int h(y570 y570Var) {
        return d670.a(this.b, this.c, y570Var);
    }
}
