package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jt01 extends hab0 implements iu30 {
    public static final jt01 N0;
    public static final jt01 O0;
    public static final jt01 P0;
    public static final jt01 Q0;
    public static final jt01 R0;
    public static final jt01 S0;
    public static final jt01 T0;
    public static final jt01 U0;
    public static final jt01 V0;
    public static final jt01 W0;
    public static final jt01 X;
    public static final jt01 X0;
    public static final jt01 Y;
    public static final jt01 Y0;
    public static final jt01 Z;
    public static final jt01 Z0;
    public static final jt01 a1;
    public static final jt01 b;
    public static final jt01 b1;
    public static final jt01 c;
    public static final jt01 c1;
    public static final jt01 d;
    public static final jt01 d1;
    public static final jt01 e;
    public static final jt01 e1;
    public static final jt01 f;
    public static final jt01 g;
    public static final jt01 h;
    public static final jt01 i;
    public static final jt01 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new jt01(i2, (byte) 0);
        c = new jt01(i2, (byte) 1);
        d = new jt01(i2, (byte) 2);
        e = new jt01(i2, (byte) 3);
        f = new jt01(i2, (byte) 4);
        g = new jt01(i2, (byte) 5);
        h = new jt01(i2, (byte) 6);
        i = new jt01(i2, (byte) 7);
        t = new jt01(i2, (byte) 8);
        X = new jt01(i2, (byte) 9);
        Y = new jt01(i2, (byte) 10);
        Z = new jt01(i2, (byte) 11);
        N0 = new jt01(i2, (byte) 12);
        O0 = new jt01(i2, (byte) 13);
        P0 = new jt01(i2, (byte) 14);
        Q0 = new jt01(i2, (byte) 15);
        R0 = new jt01(i2, (byte) 16);
        S0 = new jt01(i2, (byte) 17);
        T0 = new jt01(i2, (byte) 18);
        U0 = new jt01(i2, (byte) 19);
        V0 = new jt01(i2, (byte) 20);
        W0 = new jt01(i2, (byte) 21);
        X0 = new jt01(i2, (byte) 22);
        Y0 = new jt01(i2, (byte) 23);
        Z0 = new jt01(i2, (byte) 24);
        a1 = new jt01(i2, (byte) 25);
        b1 = new jt01(i2, (byte) 26);
        c1 = new jt01(i2, (byte) 27);
        d1 = new jt01(i2, (byte) 28);
        e1 = new jt01(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt01(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 1:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 3:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 5:
                return Boolean.valueOf((obj instanceof jv01) || (obj instanceof rih1));
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jv01) obj;
            case 7:
                return Boolean.valueOf((obj instanceof jw01) || (obj instanceof rih1));
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jw01) obj;
            case 9:
                return Boolean.valueOf((obj instanceof gv01) || (obj instanceof rih1));
            case 10:
                cu01 cu01Var = (cu01) obj;
                return new eu01(cu01Var.c, cu01Var.e);
            case 11:
                return new qvc0(((cu01) obj).d, null, null, null, 14);
            case 12:
                return new rxc0(((cu01) obj).d);
            case 13:
                return Boolean.valueOf(obj instanceof List);
            case 14:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 15:
                return Boolean.valueOf(obj instanceof qxc0);
            case 16:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return f4i1.c(((Number) obj).intValue(), "shimmer_");
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((m9m) obj).a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.d((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(!((Map) obj).isEmpty());
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((ho70) obj).a;
            case 22:
                return ((ho70) obj).a;
            case 23:
                return (qw01) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (qw01) obj;
            case 25:
                ((Number) obj).intValue();
                return null;
            case 26:
                return ax01.a;
            case 27:
                return ((zuc0) obj).e ? ax01.c : ax01.b;
            case 28:
                return rih1Var;
            default:
                return (String) obj;
        }
    }
}
