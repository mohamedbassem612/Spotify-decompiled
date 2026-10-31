package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class seb1 extends hab0 implements iu30 {
    public static final seb1 N0;
    public static final seb1 O0;
    public static final seb1 P0;
    public static final seb1 Q0;
    public static final seb1 R0;
    public static final seb1 S0;
    public static final seb1 T0;
    public static final seb1 U0;
    public static final seb1 V0;
    public static final seb1 W0;
    public static final seb1 X;
    public static final seb1 X0;
    public static final seb1 Y;
    public static final seb1 Y0;
    public static final seb1 Z;
    public static final seb1 Z0;
    public static final seb1 a1;
    public static final seb1 b;
    public static final seb1 b1;
    public static final seb1 c;
    public static final seb1 c1;
    public static final seb1 d;
    public static final seb1 d1;
    public static final seb1 e;
    public static final seb1 e1;
    public static final seb1 f;
    public static final seb1 g;
    public static final seb1 h;
    public static final seb1 i;
    public static final seb1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new seb1(i2, (byte) 0);
        c = new seb1(i2, (byte) 1);
        d = new seb1(i2, (byte) 2);
        e = new seb1(i2, (byte) 3);
        f = new seb1(i2, (byte) 4);
        g = new seb1(i2, (byte) 5);
        h = new seb1(i2, (byte) 6);
        i = new seb1(i2, (byte) 7);
        t = new seb1(i2, (byte) 8);
        X = new seb1(i2, (byte) 9);
        Y = new seb1(i2, (byte) 10);
        Z = new seb1(i2, (byte) 11);
        N0 = new seb1(i2, (byte) 12);
        O0 = new seb1(i2, (byte) 13);
        P0 = new seb1(i2, (byte) 14);
        Q0 = new seb1(i2, (byte) 15);
        R0 = new seb1(i2, (byte) 16);
        S0 = new seb1(i2, (byte) 17);
        T0 = new seb1(i2, (byte) 18);
        U0 = new seb1(i2, (byte) 19);
        V0 = new seb1(i2, (byte) 20);
        W0 = new seb1(i2, (byte) 21);
        X0 = new seb1(i2, (byte) 22);
        Y0 = new seb1(i2, (byte) 23);
        Z0 = new seb1(i2, (byte) 24);
        a1 = new seb1(i2, (byte) 25);
        b1 = new seb1(i2, (byte) 26);
        c1 = new seb1(i2, (byte) 27);
        d1 = new seb1(i2, (byte) 28);
        e1 = new seb1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ seb1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        int i2 = 1;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 1:
                return Boolean.valueOf(obj instanceof qxc0);
            case 2:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 3:
                return ((vhc1) obj).getUri();
            case 4:
                return Boolean.valueOf((obj instanceof vnb1) || (obj instanceof rih1));
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 6:
                return Boolean.valueOf(obj instanceof qxc0);
            case 7:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 8:
                return ((web1) obj).a;
            case 9:
                return Boolean.valueOf((obj instanceof mtl) || (obj instanceof rih1));
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 11:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 13:
                return Boolean.valueOf(obj instanceof jo70);
            case 14:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 15:
                af afVar = (af) obj;
                if ((afVar.compareTo(af.d) > 0 || afVar.compareTo(af.a) < 0) && afVar.compareTo(af.i) <= 0 && afVar.compareTo(af.e) >= 0) {
                    i2 = 2;
                }
                return Integer.valueOf(i2);
            case 16:
                return ((jfb1) obj).b;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                jfb1 jfb1Var = (jfb1) obj;
                return new noa0(jfb1Var.c, jfb1Var.b, jfb1Var.a);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf((obj instanceof cob1) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof jo70);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 22:
                bhb1 bhb1Var = (bhb1) obj;
                return new xgb1(bhb1Var.h(), bhb1Var.g(), bhb1Var.a(), bhb1Var.j(), bhb1Var.b());
            case 23:
                return qgb1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf(!(((bhb1) obj) instanceof ygb1));
            case 25:
                return ((key0) obj).b.getUri();
            case 26:
                return ((key0) obj).a.g.a();
            case 27:
                return ((key0) obj).a.g.a();
            case 28:
                return Boolean.valueOf((obj instanceof qfd) || (obj instanceof rih1));
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
        }
    }
}
