package p;

import com.spotify.scrollsita.v1.Section;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r7a1 extends hab0 implements iu30 {
    public static final r7a1 N0;
    public static final r7a1 O0;
    public static final r7a1 P0;
    public static final r7a1 Q0;
    public static final r7a1 R0;
    public static final r7a1 S0;
    public static final r7a1 T0;
    public static final r7a1 U0;
    public static final r7a1 V0;
    public static final r7a1 W0;
    public static final r7a1 X;
    public static final r7a1 X0;
    public static final r7a1 Y;
    public static final r7a1 Y0;
    public static final r7a1 Z;
    public static final r7a1 Z0;
    public static final r7a1 a1;
    public static final r7a1 b;
    public static final r7a1 b1;
    public static final r7a1 c;
    public static final r7a1 c1;
    public static final r7a1 d;
    public static final r7a1 d1;
    public static final r7a1 e;
    public static final r7a1 e1;
    public static final r7a1 f;
    public static final r7a1 g;
    public static final r7a1 h;
    public static final r7a1 i;
    public static final r7a1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new r7a1(i2, (byte) 0);
        c = new r7a1(i2, (byte) 1);
        d = new r7a1(i2, (byte) 2);
        e = new r7a1(i2, (byte) 3);
        f = new r7a1(i2, (byte) 4);
        g = new r7a1(i2, (byte) 5);
        h = new r7a1(i2, (byte) 6);
        i = new r7a1(i2, (byte) 7);
        t = new r7a1(i2, (byte) 8);
        X = new r7a1(i2, (byte) 9);
        Y = new r7a1(i2, (byte) 10);
        Z = new r7a1(i2, (byte) 11);
        N0 = new r7a1(i2, (byte) 12);
        O0 = new r7a1(i2, (byte) 13);
        P0 = new r7a1(i2, (byte) 14);
        Q0 = new r7a1(i2, (byte) 15);
        R0 = new r7a1(i2, (byte) 16);
        S0 = new r7a1(i2, (byte) 17);
        T0 = new r7a1(i2, (byte) 18);
        U0 = new r7a1(i2, (byte) 19);
        V0 = new r7a1(i2, (byte) 20);
        W0 = new r7a1(i2, (byte) 21);
        X0 = new r7a1(i2, (byte) 22);
        Y0 = new r7a1(i2, (byte) 23);
        Z0 = new r7a1(i2, (byte) 24);
        a1 = new r7a1(i2, (byte) 25);
        b1 = new r7a1(i2, (byte) 26);
        c1 = new r7a1(i2, (byte) 27);
        d1 = new r7a1(i2, (byte) 28);
        e1 = new r7a1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7a1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof jo70);
            case 1:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof xkk1);
            case 3:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof f7a1);
            case 5:
                if (obj != null) {
                    return (f7a1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnacredits.SongDNACredits");
                return null;
            case 6:
                return ((l7a1) obj).a;
            case 7:
                return ((l7a1) obj).a;
            case 8:
                return ((l7a1) obj).a;
            case 9:
                return rih1.a;
            case 10:
                return new g8a1(false, ((f8a1) obj).b);
            case 11:
                return ((f8a1) obj).a;
            case 12:
                return Boolean.valueOf(!((f7a1) obj).a.isEmpty());
            case 13:
                return Boolean.valueOf(obj instanceof f7a1);
            case 14:
                if (obj != null) {
                    return (f7a1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnacredits.SongDNACredits");
                return null;
            case 15:
                return new o8a1();
            case 16:
                return ((m8a1) obj).a;
            case 17:
                return (f7a1) obj;
            case 18:
                return Boolean.valueOf(obj instanceof f7a1);
            case 19:
                if (obj != null) {
                    return (f7a1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnacredits.SongDNACredits");
                return null;
            case 20:
                return new u6a1(((w8a1) obj).a, u7h.j, (t6a1) null, 12);
            case 21:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 23:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 25:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            default:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
        }
    }
}
