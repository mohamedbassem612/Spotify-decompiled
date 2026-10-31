package p;

import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q3z extends hab0 implements iu30 {
    public static final q3z N0;
    public static final q3z O0;
    public static final q3z P0;
    public static final q3z Q0;
    public static final q3z R0;
    public static final q3z S0;
    public static final q3z T0;
    public static final q3z U0;
    public static final q3z V0;
    public static final q3z W0;
    public static final q3z X;
    public static final q3z X0;
    public static final q3z Y;
    public static final q3z Y0;
    public static final q3z Z;
    public static final q3z Z0;
    public static final q3z a1;
    public static final q3z b;
    public static final q3z b1;
    public static final q3z c;
    public static final q3z c1;
    public static final q3z d;
    public static final q3z d1;
    public static final q3z e;
    public static final q3z e1;
    public static final q3z f;
    public static final q3z g;
    public static final q3z h;
    public static final q3z i;
    public static final q3z t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new q3z(i2, (byte) 0);
        c = new q3z(i2, (byte) 1);
        d = new q3z(i2, (byte) 2);
        e = new q3z(i2, (byte) 3);
        f = new q3z(i2, (byte) 4);
        g = new q3z(i2, (byte) 5);
        h = new q3z(i2, (byte) 6);
        i = new q3z(i2, (byte) 7);
        t = new q3z(i2, (byte) 8);
        X = new q3z(i2, (byte) 9);
        Y = new q3z(i2, (byte) 10);
        Z = new q3z(i2, (byte) 11);
        N0 = new q3z(i2, (byte) 12);
        O0 = new q3z(i2, (byte) 13);
        P0 = new q3z(i2, (byte) 14);
        Q0 = new q3z(i2, (byte) 15);
        R0 = new q3z(i2, (byte) 16);
        S0 = new q3z(i2, (byte) 17);
        T0 = new q3z(i2, (byte) 18);
        U0 = new q3z(i2, (byte) 19);
        V0 = new q3z(i2, (byte) 20);
        W0 = new q3z(i2, (byte) 21);
        X0 = new q3z(i2, (byte) 22);
        Y0 = new q3z(i2, (byte) 23);
        Z0 = new q3z(i2, (byte) 24);
        a1 = new q3z(i2, (byte) 25);
        b1 = new q3z(i2, (byte) 26);
        c1 = new q3z(i2, (byte) 27);
        d1 = new q3z(i2, (byte) 28);
        e1 = new q3z(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3z(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (!(obj instanceof p6v0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (p6v0) obj;
            case 2:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 4:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 6:
                if (!(obj instanceof l1z) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                return Boolean.valueOf(obj instanceof mdz);
            case 8:
                if (obj != null) {
                    return (mdz) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.episodev4.EpisodeV4");
                return null;
            case 9:
                return (String) obj;
            case 10:
                return (String) obj;
            case 11:
                return (String) obj;
            case 12:
                return (String) obj;
            case 13:
                return (String) obj;
            case 14:
                return (String) obj;
            case 15:
                return (String) obj;
            case 16:
                return (String) obj;
            case 17:
                return (String) obj;
            case 18:
                return (String) obj;
            case 19:
                return (String) obj;
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l1z) obj;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 27:
                if (!(obj instanceof e2k1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (e2k1) obj;
            default:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
