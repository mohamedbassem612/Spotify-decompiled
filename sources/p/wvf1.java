package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wvf1 extends hab0 implements iu30 {
    public static final wvf1 N0;
    public static final wvf1 O0;
    public static final wvf1 P0;
    public static final wvf1 Q0;
    public static final wvf1 R0;
    public static final wvf1 S0;
    public static final wvf1 T0;
    public static final wvf1 U0;
    public static final wvf1 V0;
    public static final wvf1 W0;
    public static final wvf1 X;
    public static final wvf1 X0;
    public static final wvf1 Y;
    public static final wvf1 Y0;
    public static final wvf1 Z;
    public static final wvf1 Z0;
    public static final wvf1 a1;
    public static final wvf1 b;
    public static final wvf1 b1;
    public static final wvf1 c;
    public static final wvf1 c1;
    public static final wvf1 d;
    public static final wvf1 d1;
    public static final wvf1 e;
    public static final wvf1 e1;
    public static final wvf1 f;
    public static final wvf1 g;
    public static final wvf1 h;
    public static final wvf1 i;
    public static final wvf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new wvf1(i2, (byte) 0);
        c = new wvf1(i2, (byte) 1);
        d = new wvf1(i2, (byte) 2);
        e = new wvf1(i2, (byte) 3);
        f = new wvf1(i2, (byte) 4);
        g = new wvf1(i2, (byte) 5);
        h = new wvf1(i2, (byte) 6);
        i = new wvf1(i2, (byte) 7);
        t = new wvf1(i2, (byte) 8);
        X = new wvf1(i2, (byte) 9);
        Y = new wvf1(i2, (byte) 10);
        Z = new wvf1(i2, (byte) 11);
        N0 = new wvf1(i2, (byte) 12);
        O0 = new wvf1(i2, (byte) 13);
        P0 = new wvf1(i2, (byte) 14);
        Q0 = new wvf1(i2, (byte) 15);
        R0 = new wvf1(i2, (byte) 16);
        S0 = new wvf1(i2, (byte) 17);
        T0 = new wvf1(i2, (byte) 18);
        U0 = new wvf1(i2, (byte) 19);
        V0 = new wvf1(i2, (byte) 20);
        W0 = new wvf1(i2, (byte) 21);
        X0 = new wvf1(i2, (byte) 22);
        Y0 = new wvf1(i2, (byte) 23);
        Z0 = new wvf1(i2, (byte) 24);
        a1 = new wvf1(i2, (byte) 25);
        b1 = new wvf1(i2, (byte) 26);
        c1 = new wvf1(i2, (byte) 27);
        d1 = new wvf1(i2, (byte) 28);
        e1 = new wvf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wvf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 2:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 4:
                return ((uv11) obj).a;
            case 5:
                return Boolean.valueOf(!u890.j((Boolean) obj, Boolean.FALSE));
            case 6:
                return rih1.a;
            case 7:
                return Boolean.valueOf(!u890.j((Boolean) obj, Boolean.TRUE));
            case 8:
                uv11 uv11Var = (uv11) obj;
                return new uho(uv11Var.a, uv11Var.b, qho.a, (nho) null, (String) null, (Function0) null, 248);
            case 9:
                return new xzq(new hho((d0r) obj), t);
            case 10:
                uv11 uv11Var2 = (uv11) obj;
                return new rjo(uv11Var2.a, uv11Var2.b);
            case 11:
                return new xzq(new ujo((d0r) obj, (byte) 0), Y);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uwz0) obj;
            case 13:
                return Boolean.valueOf((obj instanceof String) || (obj instanceof rih1));
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 15:
                return Boolean.valueOf((obj instanceof String) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 17:
                return Boolean.valueOf((obj instanceof vnb1) || (obj instanceof rih1));
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 19:
                return Boolean.valueOf((obj instanceof vnb1) || (obj instanceof rih1));
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf((obj instanceof qfd) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf((obj instanceof h2v) || (obj instanceof rih1));
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf((obj instanceof uwz0) || (obj instanceof rih1));
            case 26:
                return ((uv11) obj).a;
            case 27:
                return ((uv11) obj).a;
            case 28:
                return ((uv11) obj).a;
            default:
                return new a2v(((uv11) obj).a, 1);
        }
    }
}
