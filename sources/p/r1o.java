package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r1o extends hab0 implements iu30 {
    public static final r1o N0;
    public static final r1o O0;
    public static final r1o P0;
    public static final r1o Q0;
    public static final r1o R0;
    public static final r1o S0;
    public static final r1o T0;
    public static final r1o U0;
    public static final r1o V0;
    public static final r1o W0;
    public static final r1o X;
    public static final r1o X0;
    public static final r1o Y;
    public static final r1o Y0;
    public static final r1o Z;
    public static final r1o Z0;
    public static final r1o a1;
    public static final r1o b;
    public static final r1o b1;
    public static final r1o c;
    public static final r1o c1;
    public static final r1o d;
    public static final r1o d1;
    public static final r1o e;
    public static final r1o e1;
    public static final r1o f;
    public static final r1o g;
    public static final r1o h;
    public static final r1o i;
    public static final r1o t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new r1o(i2, (byte) 0);
        c = new r1o(i2, (byte) 1);
        d = new r1o(i2, (byte) 2);
        e = new r1o(i2, (byte) 3);
        f = new r1o(i2, (byte) 4);
        g = new r1o(i2, (byte) 5);
        h = new r1o(i2, (byte) 6);
        i = new r1o(i2, (byte) 7);
        t = new r1o(i2, (byte) 8);
        X = new r1o(i2, (byte) 9);
        Y = new r1o(i2, (byte) 10);
        Z = new r1o(i2, (byte) 11);
        N0 = new r1o(i2, (byte) 12);
        O0 = new r1o(i2, (byte) 13);
        P0 = new r1o(i2, (byte) 14);
        Q0 = new r1o(i2, (byte) 15);
        R0 = new r1o(i2, (byte) 16);
        S0 = new r1o(i2, (byte) 17);
        T0 = new r1o(i2, (byte) 18);
        U0 = new r1o(i2, (byte) 19);
        V0 = new r1o(i2, (byte) 20);
        W0 = new r1o(i2, (byte) 21);
        X0 = new r1o(i2, (byte) 22);
        Y0 = new r1o(i2, (byte) 23);
        Z0 = new r1o(i2, (byte) 24);
        a1 = new r1o(i2, (byte) 25);
        b1 = new r1o(i2, (byte) 26);
        c1 = new r1o(i2, (byte) 27);
        d1 = new r1o(i2, (byte) 28);
        e1 = new r1o(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1o(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (o2o) obj;
            case 1:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 3:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 5:
                return ((i2o) obj).a;
            case 6:
                return (xkk1) obj;
            case 7:
                return new i2o(((oer0) obj).a);
            case 8:
                return new i2o(((oer0) obj).a);
            case 9:
                return Collections.singleton(((oer0) obj).a);
            case 10:
                return new hv70("creator-playlists", (x360) null, ((per0) obj).a, false, (n1x) null, 112);
            case 11:
                return alk1.c(((per0) obj).a);
            case 12:
                return ((o3m0) obj).l();
            case 13:
                return l1d.m("spotify:user:", ((l3o) obj).a);
            case 14:
                return l1d.m("spotify:user:", ((l3o) obj).a);
            case 15:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 17:
                return Boolean.valueOf(obj instanceof jo70);
            case 18:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 19:
                ((kd31) obj).i(1);
                return rih1.a;
            case 20:
                return (String) obj;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return (String) obj;
            case 22:
                String str = (String) obj;
                if (str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    return new nwc0(str);
                }
                return null;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return (owc0) obj;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf((obj instanceof owc0) || (obj instanceof rih1));
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (owc0) obj;
            case 26:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 28:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
        }
    }
}
