package p;

import android.media.MediaCodecList;
import android.os.Build;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.spotify.base.java.logging.Logger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class g5b1 {
    public static final Set a = dm61.z0(new String[]{"video/mp2t", "audio/mp2t"});
    public static final List b = p7h.M(new String[]{"hev1", "hvc1"});

    public static final hwg a(qma qmaVar, boolean z) {
        int i;
        int i2;
        k89 k89Var = qmaVar.j1;
        boolean z2 = qmaVar.k1;
        int i3 = 3;
        try {
            bkh0 bkh0VarE = hkh0.e("video/av01");
            if (bkh0VarE == null) {
                i = 2;
                i2 = 3;
            } else if (bkh0VarE.g) {
                i = 2;
                i2 = 1;
            } else {
                i2 = 2;
                i = 2;
            }
        } catch (MediaCodecUtil$DecoderQueryException e) {
            Logger.e(e, "Failed to query device decoders", new Object[0]);
        }
        kr50 kr50Var = qmaVar.l1;
        boolean z3 = qmaVar.m1;
        try {
            bkh0 bkh0VarE2 = hkh0.e("video/hevc");
            if (bkh0VarE2 != null) {
                i3 = bkh0VarE2.g ? 1 : i;
            }
        } catch (MediaCodecUtil$DecoderQueryException e2) {
            Logger.e(e2, "Failed to query H.265 device decoders", new Object[0]);
        }
        boolean z4 = qmaVar.n1;
        boolean z5 = qmaVar.o1;
        int i4 = qmaVar.p1;
        int i5 = qmaVar.q1;
        int i6 = qmaVar.r1;
        int i7 = qmaVar.s1;
        boolean z6 = !qmaVar.k1;
        int i8 = Build.VERSION.SDK_INT;
        List listK0 = z6x.a;
        if (i8 >= 29) {
            try {
                listK0 = z561.k0(z561.X(v3b1.e, z561.T(v3b1.d, z561.T(new e5b1(z6), z561.T(dw81.t, f46.I(new MediaCodecList(0).getCodecInfos()))))));
            } catch (Exception e3) {
                Logger.e(e3, "Failed to query AV1 profile support", new Object[0]);
            }
        }
        return new hwg(k89Var, z2, i2, kr50Var, z3, i3, z4, z, z5, i4, i5, i6, i7, listK0);
    }

    public static final String b(String str, String str2) {
        if (asj0.k(str)) {
            return asj0.b(str2);
        }
        if (asj0.o(str)) {
            return asj0.j(str2);
        }
        if (asj0.n(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str)) {
            return str;
        }
        if ("application/mp4".equals(str)) {
            if (u890.j(str2, "stpp")) {
                return "application/ttml+xml";
            }
            if (u890.j(str2, "wvtt")) {
                return "application/x-mp4-vtt";
            }
        } else if ("application/x-rawcc".equals(str)) {
            if (str2 != null && ihc1.j0(str2, "cea708")) {
                return "application/cea-708";
            }
            if ((str2 != null && ihc1.j0(str2, "eia608")) || (str2 != null && ihc1.j0(str2, "cea608"))) {
                return "application/cea-608";
            }
        }
        return null;
    }

    public static final boolean c(String str) {
        List list = b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (nhc1.Y(str, (String) it.next(), true)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean d(String str) {
        return nhc1.Y(str, "vp09", true) || nhc1.Y(str, "vp9", true);
    }

    public static final String e(String str) {
        if (nhc1.Y(str, "av01", true)) {
            return "av1";
        }
        if (c(str)) {
            return "h265";
        }
        if (d(str)) {
            return "vp9";
        }
        if (nhc1.Y(str, "avc1", true)) {
            return "h264";
        }
        return null;
    }
}
