package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xvf1 extends hab0 implements iu30 {
    public static final xvf1 N0;
    public static final xvf1 O0;
    public static final xvf1 P0;
    public static final xvf1 Q0;
    public static final xvf1 R0;
    public static final xvf1 S0;
    public static final xvf1 T0;
    public static final xvf1 U0;
    public static final xvf1 V0;
    public static final xvf1 W0;
    public static final xvf1 X;
    public static final xvf1 X0;
    public static final xvf1 Y;
    public static final xvf1 Y0;
    public static final xvf1 Z;
    public static final xvf1 Z0;
    public static final xvf1 a1;
    public static final xvf1 b;
    public static final xvf1 b1;
    public static final xvf1 c;
    public static final xvf1 c1;
    public static final xvf1 d;
    public static final xvf1 d1;
    public static final xvf1 e;
    public static final xvf1 e1;
    public static final xvf1 f;
    public static final xvf1 g;
    public static final xvf1 h;
    public static final xvf1 i;
    public static final xvf1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xvf1(i2, (byte) 0);
        c = new xvf1(i2, (byte) 1);
        d = new xvf1(i2, (byte) 2);
        e = new xvf1(i2, (byte) 3);
        f = new xvf1(i2, (byte) 4);
        g = new xvf1(i2, (byte) 5);
        h = new xvf1(i2, (byte) 6);
        i = new xvf1(i2, (byte) 7);
        t = new xvf1(i2, (byte) 8);
        X = new xvf1(i2, (byte) 9);
        Y = new xvf1(i2, (byte) 10);
        Z = new xvf1(i2, (byte) 11);
        N0 = new xvf1(i2, (byte) 12);
        O0 = new xvf1(i2, (byte) 13);
        P0 = new xvf1(i2, (byte) 14);
        Q0 = new xvf1(i2, (byte) 15);
        R0 = new xvf1(i2, (byte) 16);
        S0 = new xvf1(i2, (byte) 17);
        T0 = new xvf1(i2, (byte) 18);
        U0 = new xvf1(i2, (byte) 19);
        V0 = new xvf1(i2, (byte) 20);
        W0 = new xvf1(i2, (byte) 21);
        X0 = new xvf1(i2, (byte) 22);
        Y0 = new xvf1(i2, (byte) 23);
        Z0 = new xvf1(i2, (byte) 24);
        a1 = new xvf1(i2, (byte) 25);
        b1 = new xvf1(i2, (byte) 26);
        c1 = new xvf1(i2, (byte) 27);
        d1 = new xvf1(i2, (byte) 28);
        e1 = new xvf1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xvf1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                return "obfuscate-restricted-tracks";
            case 2:
                return "disable-blocked-content";
            case 3:
                return Boolean.valueOf((obj instanceof cob1) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 5:
                uv11 uv11Var = (uv11) obj;
                String str = uv11Var.b;
                String str2 = uv11Var.a;
                String str3 = uv11Var.d;
                if (str3 == null) {
                    str3 = "";
                }
                return new noa0(str, str2, str3);
            case 6:
                return Boolean.valueOf((obj instanceof vnb1) || (obj instanceof rih1));
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 8:
                return Boolean.valueOf((obj instanceof qtt0) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qtt0) obj;
            case 10:
                return ((uv11) obj).a;
            case 11:
                return ((uv11) obj).a;
            case 12:
                return Boolean.valueOf((obj instanceof cob1) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 14:
                return new moa0(((uv11) obj).a);
            case 15:
                return (String) obj;
            case 16:
                return "obfuscate-restricted-tracks";
            case 17:
                return "disable-blocked-content";
            case 18:
                return (String) obj;
            case 19:
                return (String) obj;
            case 20:
                return new a2v((String) obj, 1);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return rih1Var;
            case 22:
                return (k1r) obj;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf(obj instanceof h2v);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return (k1r) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return Boolean.valueOf(obj instanceof uwz0);
            case 26:
                return (k1r) obj;
            case 27:
                return Boolean.valueOf(obj instanceof qfd);
            case 28:
                return (k1r) obj;
            default:
                return Boolean.valueOf(obj instanceof String);
        }
    }
}
