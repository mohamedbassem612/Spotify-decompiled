package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class o0k extends hab0 implements iu30 {
    public static final o0k N0;
    public static final o0k O0;
    public static final o0k P0;
    public static final o0k Q0;
    public static final o0k R0;
    public static final o0k S0;
    public static final o0k T0;
    public static final o0k U0;
    public static final o0k V0;
    public static final o0k W0;
    public static final o0k X;
    public static final o0k X0;
    public static final o0k Y;
    public static final o0k Y0;
    public static final o0k Z;
    public static final o0k Z0;
    public static final o0k a1;
    public static final o0k b;
    public static final o0k b1;
    public static final o0k c;
    public static final o0k c1;
    public static final o0k d;
    public static final o0k d1;
    public static final o0k e;
    public static final o0k e1;
    public static final o0k f;
    public static final o0k g;
    public static final o0k h;
    public static final o0k i;
    public static final o0k t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new o0k(i2, (byte) 0);
        c = new o0k(i2, (byte) 1);
        d = new o0k(i2, (byte) 2);
        e = new o0k(i2, (byte) 3);
        f = new o0k(i2, (byte) 4);
        g = new o0k(i2, (byte) 5);
        h = new o0k(i2, (byte) 6);
        i = new o0k(i2, (byte) 7);
        t = new o0k(i2, (byte) 8);
        X = new o0k(i2, (byte) 9);
        Y = new o0k(i2, (byte) 10);
        Z = new o0k(i2, (byte) 11);
        N0 = new o0k(i2, (byte) 12);
        O0 = new o0k(i2, (byte) 13);
        P0 = new o0k(i2, (byte) 14);
        Q0 = new o0k(i2, (byte) 15);
        R0 = new o0k(i2, (byte) 16);
        S0 = new o0k(i2, (byte) 17);
        T0 = new o0k(i2, (byte) 18);
        U0 = new o0k(i2, (byte) 19);
        V0 = new o0k(i2, (byte) 20);
        W0 = new o0k(i2, (byte) 21);
        X0 = new o0k(i2, (byte) 22);
        Y0 = new o0k(i2, (byte) 23);
        Z0 = new o0k(i2, (byte) 24);
        a1 = new o0k(i2, (byte) 25);
        b1 = new o0k(i2, (byte) 26);
        c1 = new o0k(i2, (byte) 27);
        d1 = new o0k(i2, (byte) 28);
        e1 = new o0k(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0k(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return (String) obj;
            case 1:
                return (String) obj;
            case 2:
                String str = (String) obj;
                return new qvc0("spotify:list:popular-release-groups:artist_".concat(ihc1.V0(str, ':', str)), (c3d0) null, (Set) null, new iqz0(0, 6), 6);
            case 3:
                return (k1r) obj;
            case 4:
                return Boolean.valueOf(obj instanceof jo70);
            case 5:
                return (k1r) obj;
            case 6:
                return Boolean.valueOf(obj instanceof kl11);
            case 7:
                return (k1r) obj;
            case 8:
                return Boolean.valueOf(obj instanceof pnt);
            case 9:
                return (k1r) obj;
            case 10:
                return Boolean.valueOf(obj instanceof List);
            case 11:
                return (k1r) obj;
            case 12:
                return Boolean.valueOf(obj instanceof tdv0);
            case 13:
                return (k1r) obj;
            case 14:
                return Boolean.valueOf(obj instanceof s211);
            case 15:
                return (k1r) obj;
            case 16:
                return Boolean.valueOf(obj instanceof q2o);
            case 17:
                return (k1r) obj;
            case 18:
                return Boolean.valueOf(obj instanceof us6);
            case 19:
                return (k1r) obj;
            case 20:
                return Boolean.valueOf(obj instanceof ljh1);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                String str2 = ((t0k) obj).a;
                String strE = f4i1.e(str2, ":about");
                x0 x0Var = x0.b;
                return new c1(str2, new a1(strE, x0Var), new a1(strE, x0Var));
            case 22:
                return new hv70("composer-playlists", (x360) null, ((v0k) obj).a, false, (n1x) null, 112);
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new hv70("composer-fans-also-like", (x360) null, ((x0k) obj).a, false, (n1x) null, 112);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                z0k z0kVar = (z0k) obj;
                return new tcc0(z0kVar.a, z0kVar.b, true);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new hv70("composer-recommended-playlists", (x360) null, ((e1k) obj).a, false, (n1x) null, 112);
            case 26:
                return Boolean.FALSE;
            case 27:
                return ((b1k) obj).a;
            case 28:
                ovl1 ovl1Var = ((h1k) obj).a;
                return new uv11(ovl1Var.a, "", (Integer) null, (String) null, ovl1Var.b, (tv11) null, 0, 236);
            default:
                return end1.a;
        }
    }
}
