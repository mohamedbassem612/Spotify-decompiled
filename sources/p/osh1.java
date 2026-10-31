package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class osh1 extends hab0 implements iu30 {
    public static final osh1 N0;
    public static final osh1 O0;
    public static final osh1 P0;
    public static final osh1 Q0;
    public static final osh1 R0;
    public static final osh1 S0;
    public static final osh1 T0;
    public static final osh1 U0;
    public static final osh1 V0;
    public static final osh1 W0;
    public static final osh1 X;
    public static final osh1 X0;
    public static final osh1 Y;
    public static final osh1 Y0;
    public static final osh1 Z;
    public static final osh1 Z0;
    public static final osh1 a1;
    public static final osh1 b;
    public static final osh1 b1;
    public static final osh1 c;
    public static final osh1 c1;
    public static final osh1 d;
    public static final osh1 d1;
    public static final osh1 e;
    public static final osh1 e1;
    public static final osh1 f;
    public static final osh1 g;
    public static final osh1 h;
    public static final osh1 i;
    public static final osh1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new osh1(i2, (byte) 0);
        c = new osh1(i2, (byte) 1);
        d = new osh1(i2, (byte) 2);
        e = new osh1(i2, (byte) 3);
        f = new osh1(i2, (byte) 4);
        g = new osh1(i2, (byte) 5);
        h = new osh1(i2, (byte) 6);
        i = new osh1(i2, (byte) 7);
        t = new osh1(i2, (byte) 8);
        X = new osh1(i2, (byte) 9);
        Y = new osh1(i2, (byte) 10);
        Z = new osh1(i2, (byte) 11);
        N0 = new osh1(i2, (byte) 12);
        O0 = new osh1(i2, (byte) 13);
        P0 = new osh1(i2, (byte) 14);
        Q0 = new osh1(i2, (byte) 15);
        R0 = new osh1(i2, (byte) 16);
        S0 = new osh1(i2, (byte) 17);
        T0 = new osh1(i2, (byte) 18);
        U0 = new osh1(i2, (byte) 19);
        V0 = new osh1(i2, (byte) 20);
        W0 = new osh1(i2, (byte) 21);
        X0 = new osh1(i2, (byte) 22);
        Y0 = new osh1(i2, (byte) 23);
        Z0 = new osh1(i2, (byte) 24);
        a1 = new osh1(i2, (byte) 25);
        b1 = new osh1(i2, (byte) 26);
        c1 = new osh1(i2, (byte) 27);
        d1 = new osh1(i2, (byte) 28);
        e1 = new osh1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ osh1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return (String) obj;
            case 1:
                return new rxc0((String) obj);
            case 2:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 4:
                return Boolean.valueOf((obj instanceof qxc0) || (obj instanceof rih1));
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 6:
                return Boolean.valueOf(obj instanceof jo70);
            case 7:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 8:
                ((a7m0) obj).a = lth1.a;
                return rih1Var;
            case 9:
                return "spotify:internal:magpie:update-cadence";
            case 10:
                return new wwh1(yk7.b, false, null);
            case 11:
                return (qxc0) obj;
            case 12:
                return Boolean.valueOf(obj instanceof qxc0);
            case 13:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 14:
                return new q2l0((i3l0) obj);
            case 15:
                return (mzh1) obj;
            case 16:
                return ((e6i1) obj).a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b261.d((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                b261.d((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Integer.valueOf(((q5t0) obj).X());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                b261.d((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((a7m0) obj).a = lbg1.d1;
                return rih1Var;
            case 22:
                return "spotify:internal:custom-feed:editor";
            case 23:
                return new lai1((spq0) obj, false);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new lai1((spq0) obj, true);
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return mno1.h(new mmr0[]{new mmr0("user_info_model_key", (zci1) obj)});
            case 27:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 28:
                return (mld) obj;
            default:
                return (nqm) obj;
        }
    }
}
