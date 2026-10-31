package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class czm0 extends hab0 implements iu30 {
    public static final czm0 N0;
    public static final czm0 O0;
    public static final czm0 P0;
    public static final czm0 Q0;
    public static final czm0 R0;
    public static final czm0 S0;
    public static final czm0 T0;
    public static final czm0 U0;
    public static final czm0 V0;
    public static final czm0 W0;
    public static final czm0 X;
    public static final czm0 X0;
    public static final czm0 Y;
    public static final czm0 Y0;
    public static final czm0 Z;
    public static final czm0 Z0;
    public static final czm0 a1;
    public static final czm0 b;
    public static final czm0 b1;
    public static final czm0 c;
    public static final czm0 c1;
    public static final czm0 d;
    public static final czm0 d1;
    public static final czm0 e;
    public static final czm0 e1;
    public static final czm0 f;
    public static final czm0 g;
    public static final czm0 h;
    public static final czm0 i;
    public static final czm0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new czm0(i2, (byte) 0);
        c = new czm0(i2, (byte) 1);
        d = new czm0(i2, (byte) 2);
        e = new czm0(i2, (byte) 3);
        f = new czm0(i2, (byte) 4);
        g = new czm0(i2, (byte) 5);
        h = new czm0(i2, (byte) 6);
        i = new czm0(i2, (byte) 7);
        t = new czm0(i2, (byte) 8);
        X = new czm0(i2, (byte) 9);
        Y = new czm0(i2, (byte) 10);
        Z = new czm0(i2, (byte) 11);
        N0 = new czm0(i2, (byte) 12);
        O0 = new czm0(i2, (byte) 13);
        P0 = new czm0(i2, (byte) 14);
        Q0 = new czm0(i2, (byte) 15);
        R0 = new czm0(i2, (byte) 16);
        S0 = new czm0(i2, (byte) 17);
        T0 = new czm0(i2, (byte) 18);
        U0 = new czm0(i2, (byte) 19);
        V0 = new czm0(i2, (byte) 20);
        W0 = new czm0(i2, (byte) 21);
        X0 = new czm0(i2, (byte) 22);
        Y0 = new czm0(i2, (byte) 23);
        Z0 = new czm0(i2, (byte) 24);
        a1 = new czm0(i2, (byte) 25);
        b1 = new czm0(i2, (byte) 26);
        c1 = new czm0(i2, (byte) 27);
        d1 = new czm0(i2, (byte) 28);
        e1 = new czm0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ czm0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        int i2 = 1;
        switch (b2) {
            case 0:
                return (l270) obj;
            case 1:
                return Boolean.FALSE;
            case 2:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), ((c2m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 3:
                return null;
            case 4:
                return ((f2m0) obj).a(nik1.A1.a);
            case 5:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("quick_scroll", 1, b7xVar), ((g2m0) obj).a, r6h1.c, System.currentTimeMillis());
            case 6:
                return new g2n0(false, (f2n0) obj);
            case 7:
                return ((k2n0) obj).a;
            case 8:
                return Boolean.valueOf((obj instanceof mtl) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 10:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 12:
                return Boolean.valueOf(obj instanceof jo70);
            case 13:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 14:
                String uri = ((vhc1) obj).getUri();
                if (eqn1.N(uri)) {
                    return uri;
                }
                return null;
            case 15:
                return Boolean.valueOf((obj instanceof mtl) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 17:
                af afVar = (af) obj;
                if ((afVar.compareTo(af.d) > 0 || afVar.compareTo(af.a) < 0) && afVar.compareTo(af.i) <= 0 && afVar.compareTo(af.e) >= 0) {
                    i2 = 2;
                }
                return Integer.valueOf(i2);
            case 18:
                return ((u2n0) obj).b;
            case 19:
                return Boolean.valueOf((obj instanceof cob1) || (obj instanceof rih1));
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(obj instanceof jo70);
            case 22:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                String uri2 = ((vhc1) obj).getUri();
                if (eqn1.N(uri2)) {
                    return uri2;
                }
                return null;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf((obj instanceof mtl) || (obj instanceof rih1));
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 26:
                k3n0 k3n0Var = (k3n0) obj;
                return new l3n0(k3n0Var.a, k3n0Var.b, k3n0Var.c);
            case 27:
                return ((h4n0) obj).a;
            case 28:
                return ((h4n0) obj).b;
            default:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
        }
    }
}
