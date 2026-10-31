package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xcb1 extends hab0 implements iu30 {
    public static final xcb1 N0;
    public static final xcb1 O0;
    public static final xcb1 P0;
    public static final xcb1 Q0;
    public static final xcb1 R0;
    public static final xcb1 S0;
    public static final xcb1 T0;
    public static final xcb1 U0;
    public static final xcb1 V0;
    public static final xcb1 W0;
    public static final xcb1 X;
    public static final xcb1 X0;
    public static final xcb1 Y;
    public static final xcb1 Y0;
    public static final xcb1 Z;
    public static final xcb1 Z0;
    public static final xcb1 a1;
    public static final xcb1 b;
    public static final xcb1 b1;
    public static final xcb1 c;
    public static final xcb1 c1;
    public static final xcb1 d;
    public static final xcb1 d1;
    public static final xcb1 e;
    public static final xcb1 e1;
    public static final xcb1 f;
    public static final xcb1 g;
    public static final xcb1 h;
    public static final xcb1 i;
    public static final xcb1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xcb1(i2, (byte) 0);
        c = new xcb1(i2, (byte) 1);
        d = new xcb1(i2, (byte) 2);
        e = new xcb1(i2, (byte) 3);
        f = new xcb1(i2, (byte) 4);
        g = new xcb1(i2, (byte) 5);
        h = new xcb1(i2, (byte) 6);
        i = new xcb1(i2, (byte) 7);
        t = new xcb1(i2, (byte) 8);
        X = new xcb1(i2, (byte) 9);
        Y = new xcb1(i2, (byte) 10);
        Z = new xcb1(i2, (byte) 11);
        N0 = new xcb1(i2, (byte) 12);
        O0 = new xcb1(i2, (byte) 13);
        P0 = new xcb1(i2, (byte) 14);
        Q0 = new xcb1(i2, (byte) 15);
        R0 = new xcb1(i2, (byte) 16);
        S0 = new xcb1(i2, (byte) 17);
        T0 = new xcb1(i2, (byte) 18);
        U0 = new xcb1(i2, (byte) 19);
        V0 = new xcb1(i2, (byte) 20);
        W0 = new xcb1(i2, (byte) 21);
        X0 = new xcb1(i2, (byte) 22);
        Y0 = new xcb1(i2, (byte) 23);
        Z0 = new xcb1(i2, (byte) 24);
        a1 = new xcb1(i2, (byte) 25);
        b1 = new xcb1(i2, (byte) 26);
        c1 = new xcb1(i2, (byte) 27);
        d1 = new xcb1(i2, (byte) 28);
        e1 = new xcb1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xcb1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 2:
                return Boolean.valueOf(obj instanceof qxc0);
            case 3:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 4:
                return new xxc0((String) obj);
            case 5:
                return (Integer) obj;
            case 6:
                return new xxc0((String) obj);
            case 7:
                return Integer.valueOf(((Number) obj).intValue());
            case 8:
                return (String) obj;
            case 9:
                return (iow0) obj;
            case 10:
                return (String) obj;
            case 11:
                return (iow0) obj;
            case 12:
                if (!(obj instanceof iow0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iow0) obj;
            case 14:
                if (!(obj instanceof Integer) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Integer) obj;
            case 16:
                return Boolean.valueOf(obj instanceof iow0);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj != null) {
                    return (iow0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.privacytrait.Privacy");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof Integer);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (Integer) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.Int");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new odb1(false, false, null, fg91.b);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                String str = ((ndb1) obj).a;
                if (str != null) {
                    return new a2v(str, 1);
                }
                return null;
            case 22:
                return ((ndb1) obj).a;
            case 23:
                if (!(obj instanceof h2v) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case 25:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 27:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            default:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
