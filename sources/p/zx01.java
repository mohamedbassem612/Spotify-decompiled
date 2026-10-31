package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zx01 extends hab0 implements iu30 {
    public static final zx01 N0;
    public static final zx01 O0;
    public static final zx01 P0;
    public static final zx01 Q0;
    public static final zx01 R0;
    public static final zx01 S0;
    public static final zx01 T0;
    public static final zx01 U0;
    public static final zx01 V0;
    public static final zx01 W0;
    public static final zx01 X;
    public static final zx01 X0;
    public static final zx01 Y;
    public static final zx01 Y0;
    public static final zx01 Z;
    public static final zx01 Z0;
    public static final zx01 a1;
    public static final zx01 b;
    public static final zx01 b1;
    public static final zx01 c;
    public static final zx01 c1;
    public static final zx01 d;
    public static final zx01 d1;
    public static final zx01 e;
    public static final zx01 e1;
    public static final zx01 f;
    public static final zx01 g;
    public static final zx01 h;
    public static final zx01 i;
    public static final zx01 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zx01(i2, (byte) 0);
        c = new zx01(i2, (byte) 1);
        d = new zx01(i2, (byte) 2);
        e = new zx01(i2, (byte) 3);
        f = new zx01(i2, (byte) 4);
        g = new zx01(i2, (byte) 5);
        h = new zx01(i2, (byte) 6);
        i = new zx01(i2, (byte) 7);
        t = new zx01(i2, (byte) 8);
        X = new zx01(i2, (byte) 9);
        Y = new zx01(i2, (byte) 10);
        Z = new zx01(i2, (byte) 11);
        N0 = new zx01(i2, (byte) 12);
        O0 = new zx01(i2, (byte) 13);
        P0 = new zx01(i2, (byte) 14);
        Q0 = new zx01(i2, (byte) 15);
        R0 = new zx01(i2, (byte) 16);
        S0 = new zx01(i2, (byte) 17);
        T0 = new zx01(i2, (byte) 18);
        U0 = new zx01(i2, (byte) 19);
        V0 = new zx01(i2, (byte) 20);
        W0 = new zx01(i2, (byte) 21);
        X0 = new zx01(i2, (byte) 22);
        Y0 = new zx01(i2, (byte) 23);
        Z0 = new zx01(i2, (byte) 24);
        a1 = new zx01(i2, (byte) 25);
        b1 = new zx01(i2, (byte) 26);
        c1 = new zx01(i2, (byte) 27);
        d1 = new zx01(i2, (byte) 28);
        e1 = new zx01(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx01(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        t2b t2bVar = lgo1.b;
        int i2 = 1;
        switch (b2) {
            case 0:
                return (String) obj;
            case 1:
                return (String) obj;
            case 2:
                return Boolean.valueOf((obj instanceof gw81) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (gw81) obj;
            case 4:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 6:
                return Boolean.valueOf(obj instanceof jo70);
            case 7:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 8:
                return ((fy01) obj).d.b;
            case 9:
                return ((fy01) obj).d.b;
            case 10:
                return ((fy01) obj).d.b;
            case 11:
                return ((fy01) obj).d.b;
            case 12:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 14:
                return Boolean.valueOf((obj instanceof hll) || (obj instanceof rih1));
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 16:
                return Boolean.valueOf((obj instanceof qtt0) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qtt0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof jo70);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                af afVar = (af) obj;
                if ((afVar.compareTo(af.d) > 0 || afVar.compareTo(af.a) < 0) && afVar.compareTo(af.i) <= 0 && afVar.compareTo(af.e) >= 0) {
                    i2 = 2;
                }
                return Integer.valueOf(i2);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((n161) obj).b(t2bVar, "TEST_TAG_RECOMMENDATION_ITEM");
                return rih1Var;
            case 22:
                return o7h.d1(((sy01) obj).e, 3);
            case 23:
                ((n161) obj).b(t2bVar, "TEST_TAG_RECOMMENDATIONS_GRID");
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((n161) obj).b(t2bVar, "TEST_TAG_RECOMMENDATIONS_GRID_CONTENT");
                return rih1Var;
            case 25:
                return Integer.valueOf(((pg50) obj).e);
            case 26:
                return Integer.valueOf(((pg50) obj).a);
            case 27:
                return Float.valueOf(((pg50) obj).b);
            case 28:
                return Integer.valueOf(((pg50) obj).c);
            default:
                return Boolean.valueOf(((pg50) obj).d);
        }
    }
}
