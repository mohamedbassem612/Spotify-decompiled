package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class afm extends hab0 implements iu30 {
    public static final afm N0;
    public static final afm O0;
    public static final afm P0;
    public static final afm Q0;
    public static final afm R0;
    public static final afm S0;
    public static final afm T0;
    public static final afm U0;
    public static final afm V0;
    public static final afm W0;
    public static final afm X;
    public static final afm X0;
    public static final afm Y;
    public static final afm Y0;
    public static final afm Z;
    public static final afm Z0;
    public static final afm a1;
    public static final afm b;
    public static final afm b1;
    public static final afm c;
    public static final afm c1;
    public static final afm d;
    public static final afm d1;
    public static final afm e;
    public static final afm e1;
    public static final afm f;
    public static final afm g;
    public static final afm h;
    public static final afm i;
    public static final afm t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new afm(i2, (byte) 0);
        c = new afm(i2, (byte) 1);
        d = new afm(i2, (byte) 2);
        e = new afm(i2, (byte) 3);
        f = new afm(i2, (byte) 4);
        g = new afm(i2, (byte) 5);
        h = new afm(i2, (byte) 6);
        i = new afm(i2, (byte) 7);
        t = new afm(i2, (byte) 8);
        X = new afm(i2, (byte) 9);
        Y = new afm(i2, (byte) 10);
        Z = new afm(i2, (byte) 11);
        N0 = new afm(i2, (byte) 12);
        O0 = new afm(i2, (byte) 13);
        P0 = new afm(i2, (byte) 14);
        Q0 = new afm(i2, (byte) 15);
        R0 = new afm(i2, (byte) 16);
        S0 = new afm(i2, (byte) 17);
        T0 = new afm(i2, (byte) 18);
        U0 = new afm(i2, (byte) 19);
        V0 = new afm(i2, (byte) 20);
        W0 = new afm(i2, (byte) 21);
        X0 = new afm(i2, (byte) 22);
        Y0 = new afm(i2, (byte) 23);
        Z0 = new afm(i2, (byte) 24);
        a1 = new afm(i2, (byte) 25);
        b1 = new afm(i2, (byte) 26);
        c1 = new afm(i2, (byte) 27);
        d1 = new afm(i2, (byte) 28);
        e1 = new afm(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ afm(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 2:
                return Boolean.valueOf((obj instanceof uwz0) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uwz0) obj;
            case 4:
                lem lemVar = (lem) obj;
                return new rem(lemVar.b, (String) null, lemVar.d);
            case 5:
                return ((lem) obj).a;
            case 6:
                return ((lem) obj).a;
            case 7:
                jo70 jo70Var = (jo70) obj;
                return new ffm(jo70Var != null ? jo70Var.a : null);
            case 8:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 10:
                return new kem(2);
            case 11:
                return rih1Var;
            case 12:
                return new o2l0((i3l0) obj);
            case 13:
                return (String) obj;
            case 14:
                return (ddz) obj;
            case 15:
                return Boolean.valueOf(obj instanceof ddz);
            case 16:
                if (obj != null) {
                    return (ddz) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.episodetranscripts.EpisodeTranscripts");
                return null;
            case 17:
                return rih1Var;
            case 18:
                return new zbm(2, ((uaz) obj).a);
            case 19:
                return new kem(1);
            case 20:
                return jhm.class.getCanonicalName();
            case 21:
                neg negVar = (neg) obj;
                neg.b(negVar, "video.subtitles", pma.b, 4);
                neg.b(negVar, "video.subtitles_cc", hma.b, 4);
                neg.b(negVar, "audio.episode.speed", mma.b, 4);
                return rih1Var;
            case 22:
                return ((vhc1) obj).getUri();
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf((obj instanceof zmm) || (obj instanceof rih1));
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zmm) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf(obj instanceof xmm);
            case 26:
                if (obj != null) {
                    return (xmm) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.contextualflairplaylist.ContextualFlairPlaylist");
                return null;
            case 27:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 28:
                return ((kb61) obj).j();
            default:
                return ((kb61) obj).j().b;
        }
    }
}
