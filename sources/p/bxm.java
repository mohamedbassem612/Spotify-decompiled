package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bxm extends hab0 implements iu30 {
    public static final bxm N0;
    public static final bxm O0;
    public static final bxm P0;
    public static final bxm Q0;
    public static final bxm R0;
    public static final bxm S0;
    public static final bxm T0;
    public static final bxm U0;
    public static final bxm V0;
    public static final bxm W0;
    public static final bxm X;
    public static final bxm X0;
    public static final bxm Y;
    public static final bxm Y0;
    public static final bxm Z;
    public static final bxm Z0;
    public static final bxm a1;
    public static final bxm b;
    public static final bxm b1;
    public static final bxm c;
    public static final bxm c1;
    public static final bxm d;
    public static final bxm d1;
    public static final bxm e;
    public static final bxm e1;
    public static final bxm f;
    public static final bxm g;
    public static final bxm h;
    public static final bxm i;
    public static final bxm t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new bxm(i2, (byte) 0);
        c = new bxm(i2, (byte) 1);
        d = new bxm(i2, (byte) 2);
        e = new bxm(i2, (byte) 3);
        f = new bxm(i2, (byte) 4);
        g = new bxm(i2, (byte) 5);
        h = new bxm(i2, (byte) 6);
        i = new bxm(i2, (byte) 7);
        t = new bxm(i2, (byte) 8);
        X = new bxm(i2, (byte) 9);
        Y = new bxm(i2, (byte) 10);
        Z = new bxm(i2, (byte) 11);
        N0 = new bxm(i2, (byte) 12);
        O0 = new bxm(i2, (byte) 13);
        P0 = new bxm(i2, (byte) 14);
        Q0 = new bxm(i2, (byte) 15);
        R0 = new bxm(i2, (byte) 16);
        S0 = new bxm(i2, (byte) 17);
        T0 = new bxm(i2, (byte) 18);
        U0 = new bxm(i2, (byte) 19);
        V0 = new bxm(i2, (byte) 20);
        W0 = new bxm(i2, (byte) 21);
        X0 = new bxm(i2, (byte) 22);
        Y0 = new bxm(i2, (byte) 23);
        Z0 = new bxm(i2, (byte) 24);
        a1 = new bxm(i2, (byte) 25);
        b1 = new bxm(i2, (byte) 26);
        c1 = new bxm(i2, (byte) 27);
        d1 = new bxm(i2, (byte) 28);
        e1 = new bxm(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bxm(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((uwm) obj).a;
            case 1:
                return ((uwm) obj).a;
            case 2:
                return ((uwm) obj).b;
            case 3:
                return new qvc0(l1d.m("spotify:list:artist-connections:", blo1.l(((uwm) obj).b)), null, null, null, 14);
            case 4:
                uwm uwmVar = (uwm) obj;
                return new qvc0(gvg.h("spotify:list:artists-popular-collaborations:", blo1.l(uwmVar.b), "_", blo1.l(uwmVar.a)), null, null, null, 14);
            case 5:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 7:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 9:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 11:
                return Boolean.valueOf(obj instanceof jo70);
            case 12:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 13:
                return Boolean.valueOf(obj instanceof jo70);
            case 14:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 15:
                return Boolean.valueOf(obj instanceof xkk1);
            case 16:
                return (k1r) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(obj instanceof xkk1);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (k1r) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (String) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (jo70) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return rih1Var;
            case 22:
                ((kd31) obj).i(1);
                return rih1Var;
            case 23:
                return new qvc0(l1d.m("spotify:list:artist-connections:", blo1.l(((ixm) obj).a)), null, null, null, 14);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (List) obj;
            case 25:
                return Boolean.valueOf(obj instanceof List);
            case 26:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 27:
                rtb0.b((rtb0) obj, 5, (iu30) null, kgi.a, 6);
                return rih1Var;
            case 28:
                return ((sxm) obj).a;
            default:
                return ((sxm) obj).a;
        }
    }
}
