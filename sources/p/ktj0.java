package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ktj0 extends hab0 implements iu30 {
    public static final ktj0 N0;
    public static final ktj0 O0;
    public static final ktj0 P0;
    public static final ktj0 Q0;
    public static final ktj0 R0;
    public static final ktj0 S0;
    public static final ktj0 T0;
    public static final ktj0 U0;
    public static final ktj0 V0;
    public static final ktj0 W0;
    public static final ktj0 X;
    public static final ktj0 X0;
    public static final ktj0 Y;
    public static final ktj0 Y0;
    public static final ktj0 Z;
    public static final ktj0 Z0;
    public static final ktj0 a1;
    public static final ktj0 b;
    public static final ktj0 b1;
    public static final ktj0 c;
    public static final ktj0 c1;
    public static final ktj0 d;
    public static final ktj0 d1;
    public static final ktj0 e;
    public static final ktj0 e1;
    public static final ktj0 f;
    public static final ktj0 g;
    public static final ktj0 h;
    public static final ktj0 i;
    public static final ktj0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ktj0(i2, (byte) 0);
        c = new ktj0(i2, (byte) 1);
        d = new ktj0(i2, (byte) 2);
        e = new ktj0(i2, (byte) 3);
        f = new ktj0(i2, (byte) 4);
        g = new ktj0(i2, (byte) 5);
        h = new ktj0(i2, (byte) 6);
        i = new ktj0(i2, (byte) 7);
        t = new ktj0(i2, (byte) 8);
        X = new ktj0(i2, (byte) 9);
        Y = new ktj0(i2, (byte) 10);
        Z = new ktj0(i2, (byte) 11);
        N0 = new ktj0(i2, (byte) 12);
        O0 = new ktj0(i2, (byte) 13);
        P0 = new ktj0(i2, (byte) 14);
        Q0 = new ktj0(i2, (byte) 15);
        R0 = new ktj0(i2, (byte) 16);
        S0 = new ktj0(i2, (byte) 17);
        T0 = new ktj0(i2, (byte) 18);
        U0 = new ktj0(i2, (byte) 19);
        V0 = new ktj0(i2, (byte) 20);
        W0 = new ktj0(i2, (byte) 21);
        X0 = new ktj0(i2, (byte) 22);
        Y0 = new ktj0(i2, (byte) 23);
        Z0 = new ktj0(i2, (byte) 24);
        a1 = new ktj0(i2, (byte) 25);
        b1 = new ktj0(i2, (byte) 26);
        c1 = new ktj0(i2, (byte) 27);
        d1 = new ktj0(i2, (byte) 28);
        e1 = new ktj0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ktj0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                a5j0 a5j0Var = (a5j0) ((mmr0) obj).b;
                return Boolean.valueOf(((a5j0Var instanceof y4j0) || (a5j0Var instanceof x4j0)) ? false : true);
            case 1:
                return Boolean.valueOf(((a5j0) ((mmr0) obj).b) instanceof x4j0);
            case 2:
                return new g4d0((String) obj);
            case 3:
                return (g3d0) obj;
            case 4:
                return Boolean.valueOf(obj instanceof g3d0);
            case 5:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 6:
                return new dnl0(new fjl0(((i3l0) obj).b(), (byte) 12));
            case 7:
                return rih1Var;
            case 8:
                return new dnl0(new fjl0(((i3l0) obj).b(), (byte) 12));
            case 9:
                return rih1Var;
            case 10:
                return new zzq0(12.0f, 4.0f, 12.0f, 4.0f);
            case 11:
                return ((n3l0) obj).a("spotify:new:playlist");
            case 12:
                return (List) obj;
            case 13:
                return Boolean.valueOf(obj instanceof List);
            case 14:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 15:
                return new wvj0((vvj0) obj, (Map) null);
            case 16:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : b8w0.N0) {
                    if (((b8w0) obj2) != b8w0.Y) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b7x b7xVar = (Map) obj;
                if (b7xVar == null) {
                    b7xVar = b7x.a;
                }
                return new xvj0(b7xVar);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (!(obj instanceof Map) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Map) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new owj0((nwj0) obj, 0, false, false, false, null, false, false, false, false, false, cug0.a, false, true);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new g4d0((String) obj);
            case 22:
                return (g3d0) obj;
            case 23:
                return Boolean.valueOf(obj instanceof g3d0);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 25:
                return "mixing-tools";
            case 26:
                return "type";
            case 27:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            default:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
