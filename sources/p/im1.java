package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class im1 extends hab0 implements iu30 {
    public static final im1 N0;
    public static final im1 O0;
    public static final im1 P0;
    public static final im1 Q0;
    public static final im1 R0;
    public static final im1 S0;
    public static final im1 T0;
    public static final im1 U0;
    public static final im1 V0;
    public static final im1 W0;
    public static final im1 X;
    public static final im1 X0;
    public static final im1 Y;
    public static final im1 Y0;
    public static final im1 Z;
    public static final im1 Z0;
    public static final im1 a1;
    public static final im1 b;
    public static final im1 b1;
    public static final im1 c;
    public static final im1 c1;
    public static final im1 d;
    public static final im1 d1;
    public static final im1 e;
    public static final im1 e1;
    public static final im1 f;
    public static final im1 g;
    public static final im1 h;
    public static final im1 i;
    public static final im1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new im1(i2, (byte) 0);
        c = new im1(i2, (byte) 1);
        d = new im1(i2, (byte) 2);
        e = new im1(i2, (byte) 3);
        f = new im1(i2, (byte) 4);
        g = new im1(i2, (byte) 5);
        h = new im1(i2, (byte) 6);
        i = new im1(i2, (byte) 7);
        t = new im1(i2, (byte) 8);
        X = new im1(i2, (byte) 9);
        Y = new im1(i2, (byte) 10);
        Z = new im1(i2, (byte) 11);
        N0 = new im1(i2, (byte) 12);
        O0 = new im1(i2, (byte) 13);
        P0 = new im1(i2, (byte) 14);
        Q0 = new im1(i2, (byte) 15);
        R0 = new im1(i2, (byte) 16);
        S0 = new im1(i2, (byte) 17);
        T0 = new im1(i2, (byte) 18);
        U0 = new im1(i2, (byte) 19);
        V0 = new im1(i2, (byte) 20);
        W0 = new im1(i2, (byte) 21);
        X0 = new im1(i2, (byte) 22);
        Y0 = new im1(i2, (byte) 23);
        Z0 = new im1(i2, (byte) 24);
        a1 = new im1(i2, (byte) 25);
        b1 = new im1(i2, (byte) 26);
        c1 = new im1(i2, (byte) 27);
        d1 = new im1(i2, (byte) 28);
        e1 = new im1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new huz((bm1) obj, (byte) 10);
            case 1:
                am1 am1Var = (am1) obj;
                return new cm1(am1Var.c, am1Var.a, null, null, am1Var.d, false);
            case 2:
                return (bm1) obj;
            case 3:
                return ((am1) obj).a;
            case 4:
                return ((am1) obj).a;
            case 5:
                return ((am1) obj).a;
            case 6:
                return Boolean.valueOf((obj instanceof vnb1) || (obj instanceof rih1));
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 8:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 10:
                kby kbyVar = ((cxc0) obj).f;
                return new bm1(kbyVar.a, kbyVar.g);
            case 11:
                return Boolean.valueOf((obj instanceof qp31) || (obj instanceof rih1));
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qp31) obj;
            case 13:
                return Boolean.valueOf((obj instanceof vnb1) || (obj instanceof rih1));
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 15:
                return Boolean.valueOf(obj instanceof qxc0);
            case 16:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new r2l0((i3l0) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(((qtb0) obj).m == coc0.a);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((qtb0) obj).l.toString();
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((ot1) obj).a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new zyk0((i3l0) obj);
            case 22:
                return ((zyk0) obj).e();
            case 23:
                mu1 mu1Var = (mu1) obj;
                return new nu1(mu1Var.a, mu1Var.b, mu1Var.c, true);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "spotify:add-to-playlist";
            case 25:
                ((Number) obj).longValue();
                return rih1Var;
            case 26:
                ((Number) obj).longValue();
                return rih1Var;
            case 27:
                fu1 fu1Var = ((ww1) obj).a;
                return mno1.h(new mmr0[]{new mmr0("sessionChanges", ma61.a(fu1Var.h, (stu0) null, (ttu0) null, new hlg1(), (Set) null, (k031) null, (Set) null, (LinkedHashSet) null, 107)), new mmr0("curationContext", fu1Var.b), new mmr0("emptyLibraryRedirectInProgress", Boolean.valueOf(fu1Var.j))});
            case 28:
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}
