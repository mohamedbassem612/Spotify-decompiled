package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q83 extends hab0 implements iu30 {
    public static final q83 N0;
    public static final q83 O0;
    public static final q83 P0;
    public static final q83 Q0;
    public static final q83 R0;
    public static final q83 S0;
    public static final q83 T0;
    public static final q83 U0;
    public static final q83 V0;
    public static final q83 W0;
    public static final q83 X;
    public static final q83 X0;
    public static final q83 Y;
    public static final q83 Y0;
    public static final q83 Z;
    public static final q83 Z0;
    public static final q83 a1;
    public static final q83 b;
    public static final q83 b1;
    public static final q83 c;
    public static final q83 c1;
    public static final q83 d;
    public static final q83 d1;
    public static final q83 e;
    public static final q83 e1;
    public static final q83 f;
    public static final q83 g;
    public static final q83 h;
    public static final q83 i;
    public static final q83 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new q83(i2, (byte) 0);
        c = new q83(i2, (byte) 1);
        d = new q83(i2, (byte) 2);
        e = new q83(i2, (byte) 3);
        f = new q83(i2, (byte) 4);
        g = new q83(i2, (byte) 5);
        h = new q83(i2, (byte) 6);
        i = new q83(i2, (byte) 7);
        t = new q83(i2, (byte) 8);
        X = new q83(i2, (byte) 9);
        Y = new q83(i2, (byte) 10);
        Z = new q83(i2, (byte) 11);
        N0 = new q83(i2, (byte) 12);
        O0 = new q83(i2, (byte) 13);
        P0 = new q83(i2, (byte) 14);
        Q0 = new q83(i2, (byte) 15);
        R0 = new q83(i2, (byte) 16);
        S0 = new q83(i2, (byte) 17);
        T0 = new q83(i2, (byte) 18);
        U0 = new q83(i2, (byte) 19);
        V0 = new q83(i2, (byte) 20);
        W0 = new q83(i2, (byte) 21);
        X0 = new q83(i2, (byte) 22);
        Y0 = new q83(i2, (byte) 23);
        Z0 = new q83(i2, (byte) 24);
        a1 = new q83(i2, (byte) 25);
        b1 = new q83(i2, (byte) 26);
        c1 = new q83(i2, (byte) 27);
        d1 = new q83(i2, (byte) 28);
        e1 = new q83(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q83(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        w7x w7xVar = w7x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return w7xVar;
            case 1:
                return o7h.p1(((t53) obj).a);
            case 2:
                return w7xVar;
            case 3:
                return new uho((String) obj, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254);
            case 4:
                return rih1Var;
            case 5:
                return w7xVar;
            case 6:
                return Boolean.valueOf((obj instanceof f7l1) || (obj instanceof rih1));
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (f7l1) obj;
            case 8:
                return (String) obj;
            case 9:
                return (f7l1) obj;
            case 10:
                return new a3q0((String) obj);
            case 11:
                return new n0q0((String) obj, l0q0.d);
            case 12:
                return new pc3((String) obj);
            case 13:
                return new t671(54, (String) obj, null, null, "AlbumPageHeader", null, false);
            case 14:
                return new ve81((String) obj);
            case 15:
                return new u70((mr20) obj, (byte) 11);
            case 16:
                return new t93(z6x.a);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 22:
                return new ia3((fa3) null, (String) null, 1);
            case 23:
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 26:
                return Boolean.valueOf(obj instanceof qxc0);
            case 27:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 28:
                return (String) obj;
            default:
                return (jo70) obj;
        }
    }
}
