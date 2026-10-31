package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class puc0 extends hab0 implements iu30 {
    public static final puc0 N0;
    public static final puc0 O0;
    public static final puc0 P0;
    public static final puc0 Q0;
    public static final puc0 R0;
    public static final puc0 S0;
    public static final puc0 T0;
    public static final puc0 U0;
    public static final puc0 V0;
    public static final puc0 W0;
    public static final puc0 X;
    public static final puc0 X0;
    public static final puc0 Y;
    public static final puc0 Y0;
    public static final puc0 Z;
    public static final puc0 Z0;
    public static final puc0 a1;
    public static final puc0 b;
    public static final puc0 b1;
    public static final puc0 c;
    public static final puc0 c1;
    public static final puc0 d;
    public static final puc0 d1;
    public static final puc0 e;
    public static final puc0 e1;
    public static final puc0 f;
    public static final puc0 g;
    public static final puc0 h;
    public static final puc0 i;
    public static final puc0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new puc0(i2, (byte) 0);
        c = new puc0(i2, (byte) 1);
        d = new puc0(i2, (byte) 2);
        e = new puc0(i2, (byte) 3);
        f = new puc0(i2, (byte) 4);
        g = new puc0(i2, (byte) 5);
        h = new puc0(i2, (byte) 6);
        i = new puc0(i2, (byte) 7);
        t = new puc0(i2, (byte) 8);
        X = new puc0(i2, (byte) 9);
        Y = new puc0(i2, (byte) 10);
        Z = new puc0(i2, (byte) 11);
        N0 = new puc0(i2, (byte) 12);
        O0 = new puc0(i2, (byte) 13);
        P0 = new puc0(i2, (byte) 14);
        Q0 = new puc0(i2, (byte) 15);
        R0 = new puc0(i2, (byte) 16);
        S0 = new puc0(i2, (byte) 17);
        T0 = new puc0(i2, (byte) 18);
        U0 = new puc0(i2, (byte) 19);
        V0 = new puc0(i2, (byte) 20);
        W0 = new puc0(i2, (byte) 21);
        X0 = new puc0(i2, (byte) 22);
        Y0 = new puc0(i2, (byte) 23);
        Z0 = new puc0(i2, (byte) 24);
        a1 = new puc0(i2, (byte) 25);
        b1 = new puc0(i2, (byte) 26);
        c1 = new puc0(i2, (byte) 27);
        d1 = new puc0(i2, (byte) 28);
        e1 = new puc0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ puc0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        i3r i3rVar = i3r.a;
        boolean z = false;
        xlu0 xlu0Var = null;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (Set) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.Set<com.spotify.listplatform.endpoints.ListEndpoint.Configuration.Filter>");
                return null;
            case 1:
                return new ouc0((String) obj);
            case 2:
                return (Set) obj;
            case 3:
                return ((ho70) obj).a;
            case 4:
                return xsc0.d((wsc0) obj);
            case 5:
                return i3rVar;
            case 6:
                return (List) obj;
            case 7:
                return Boolean.valueOf(((ttm1) obj).e == aey.t);
            case 8:
                ttm1 ttm1Var = (ttm1) obj;
                if (u890.j(ttm1.i.get(ttm1Var.e), xlu0.class)) {
                    nb10 nb10Var = ttm1Var.g;
                    if (nb10Var == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.PlaylistExtraInfo");
                        return null;
                    }
                    xlu0Var = (xlu0) nb10Var;
                }
                if (xlu0Var != null) {
                    z = xlu0Var.d && xlu0Var.c;
                }
                return Boolean.valueOf(z);
            case 9:
                return new rxc0((String) obj);
            case 10:
                return (qxc0) obj;
            case 11:
                return Boolean.valueOf(obj instanceof qxc0);
            case 12:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 13:
                return xsc0.c((wsc0) obj);
            case 14:
                return i3rVar;
            case 15:
                return (qxc0) obj;
            case 16:
                return new rxc0((String) obj);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new rxc0((String) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                qxc0 qxc0Var = (qxc0) obj;
                return new aiu0(qxc0Var.a, qxc0Var.i, qxc0Var.e);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                qxc0 qxc0Var2 = (qxc0) obj;
                return new biu0(qxc0Var2.a, qxc0Var2.i, qxc0Var2.e);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case 22:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 23:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Integer num = ((wsc0) obj).h;
                return Integer.valueOf(num != null ? num.intValue() : 0);
            case 25:
                return rih1.a;
            case 26:
                return new z2l0((i3l0) obj);
            case 27:
                return "list-private-by-default";
            case 28:
                return new azk0((i3l0) obj);
            default:
                return Boolean.valueOf(((vl10) obj) instanceof ul10);
        }
    }
}
