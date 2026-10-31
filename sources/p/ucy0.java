package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ucy0 extends hab0 implements iu30 {
    public static final ucy0 N0;
    public static final ucy0 O0;
    public static final ucy0 P0;
    public static final ucy0 Q0;
    public static final ucy0 R0;
    public static final ucy0 S0;
    public static final ucy0 T0;
    public static final ucy0 U0;
    public static final ucy0 V0;
    public static final ucy0 W0;
    public static final ucy0 X;
    public static final ucy0 X0;
    public static final ucy0 Y;
    public static final ucy0 Y0;
    public static final ucy0 Z;
    public static final ucy0 Z0;
    public static final ucy0 a1;
    public static final ucy0 b;
    public static final ucy0 b1;
    public static final ucy0 c;
    public static final ucy0 c1;
    public static final ucy0 d;
    public static final ucy0 d1;
    public static final ucy0 e;
    public static final ucy0 e1;
    public static final ucy0 f;
    public static final ucy0 g;
    public static final ucy0 h;
    public static final ucy0 i;
    public static final ucy0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ucy0(i2, (byte) 0);
        c = new ucy0(i2, (byte) 1);
        d = new ucy0(i2, (byte) 2);
        e = new ucy0(i2, (byte) 3);
        f = new ucy0(i2, (byte) 4);
        g = new ucy0(i2, (byte) 5);
        h = new ucy0(i2, (byte) 6);
        i = new ucy0(i2, (byte) 7);
        t = new ucy0(i2, (byte) 8);
        X = new ucy0(i2, (byte) 9);
        Y = new ucy0(i2, (byte) 10);
        Z = new ucy0(i2, (byte) 11);
        N0 = new ucy0(i2, (byte) 12);
        O0 = new ucy0(i2, (byte) 13);
        P0 = new ucy0(i2, (byte) 14);
        Q0 = new ucy0(i2, (byte) 15);
        R0 = new ucy0(i2, (byte) 16);
        S0 = new ucy0(i2, (byte) 17);
        T0 = new ucy0(i2, (byte) 18);
        U0 = new ucy0(i2, (byte) 19);
        V0 = new ucy0(i2, (byte) 20);
        W0 = new ucy0(i2, (byte) 21);
        X0 = new ucy0(i2, (byte) 22);
        Y0 = new ucy0(i2, (byte) 23);
        Z0 = new ucy0(i2, (byte) 24);
        a1 = new ucy0(i2, (byte) 25);
        b1 = new ucy0(i2, (byte) 26);
        c1 = new ucy0(i2, (byte) 27);
        d1 = new ucy0(i2, (byte) 28);
        e1 = new ucy0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ucy0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return mno1.h(new mmr0[]{new mmr0("STATE_KEY_PromptedWorldSectionElement", (tcy0) obj)});
            case 1:
                ((xas) obj).a(b, j8y0.X);
                return rih1Var;
            case 2:
                return ((zby0) obj).a;
            case 3:
                return b7x.a;
            case 4:
                return new g4d0((String) obj);
            case 5:
                return new rxc0((String) obj);
            case 6:
                return Boolean.valueOf(obj instanceof g3d0);
            case 7:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 8:
                return Boolean.valueOf(obj instanceof qxc0);
            case 9:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 10:
                return "listening-activity";
            case 11:
                return "publish-playlist";
            case 12:
                b261.c((e261) obj);
                return rih1Var;
            case 13:
                return new eoy0(0, false, false);
            case 14:
                return rih1Var;
            case 15:
                return rih1Var;
            case 16:
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                xid.r(dhlVar.d, ihlVar.d, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.f, 0.0f, 6);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                dhl dhlVar2 = (dhl) obj;
                ube ubeVar2 = dhlVar2.g;
                ihl ihlVar2 = dhlVar2.c;
                yf.p(ubeVar2, ihlVar2.g, 0.0f, 6);
                xid.r(dhlVar2.d, ihlVar2.d, 0.0f, 6);
                xid.r(dhlVar2.f, ihlVar2.f, 0.0f, 6);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.c((e261) obj);
                return rih1Var;
            case 22:
                return Integer.valueOf(((Number) obj).intValue());
            case 23:
                return Integer.valueOf(((Number) obj).intValue());
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b261.c((e261) obj);
                return rih1Var;
            case 25:
                return new uyk0((i3l0) obj);
            case 26:
                return (w6z0) obj;
            case 27:
                return (u6z0) obj;
            case 28:
                m9z0 m9z0Var = (m9z0) obj;
                return new p9z0("", "", (String) null, false, m9z0Var.a, m9z0Var.b, m9z0Var.c);
            default:
                return rih1Var;
        }
    }
}
