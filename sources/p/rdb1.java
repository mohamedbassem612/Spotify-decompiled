package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rdb1 extends hab0 implements iu30 {
    public static final rdb1 N0;
    public static final rdb1 O0;
    public static final rdb1 P0;
    public static final rdb1 Q0;
    public static final rdb1 R0;
    public static final rdb1 S0;
    public static final rdb1 T0;
    public static final rdb1 U0;
    public static final rdb1 V0;
    public static final rdb1 W0;
    public static final rdb1 X;
    public static final rdb1 X0;
    public static final rdb1 Y;
    public static final rdb1 Y0;
    public static final rdb1 Z;
    public static final rdb1 Z0;
    public static final rdb1 a1;
    public static final rdb1 b;
    public static final rdb1 b1;
    public static final rdb1 c;
    public static final rdb1 c1;
    public static final rdb1 d;
    public static final rdb1 d1;
    public static final rdb1 e;
    public static final rdb1 e1;
    public static final rdb1 f;
    public static final rdb1 g;
    public static final rdb1 h;
    public static final rdb1 i;
    public static final rdb1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rdb1(i2, (byte) 0);
        c = new rdb1(i2, (byte) 1);
        d = new rdb1(i2, (byte) 2);
        e = new rdb1(i2, (byte) 3);
        f = new rdb1(i2, (byte) 4);
        g = new rdb1(i2, (byte) 5);
        h = new rdb1(i2, (byte) 6);
        i = new rdb1(i2, (byte) 7);
        t = new rdb1(i2, (byte) 8);
        X = new rdb1(i2, (byte) 9);
        Y = new rdb1(i2, (byte) 10);
        Z = new rdb1(i2, (byte) 11);
        N0 = new rdb1(i2, (byte) 12);
        O0 = new rdb1(i2, (byte) 13);
        P0 = new rdb1(i2, (byte) 14);
        Q0 = new rdb1(i2, (byte) 15);
        R0 = new rdb1(i2, (byte) 16);
        S0 = new rdb1(i2, (byte) 17);
        T0 = new rdb1(i2, (byte) 18);
        U0 = new rdb1(i2, (byte) 19);
        V0 = new rdb1(i2, (byte) 20);
        W0 = new rdb1(i2, (byte) 21);
        X0 = new rdb1(i2, (byte) 22);
        Y0 = new rdb1(i2, (byte) 23);
        Z0 = new rdb1(i2, (byte) 24);
        a1 = new rdb1(i2, (byte) 25);
        b1 = new rdb1(i2, (byte) 26);
        c1 = new rdb1(i2, (byte) 27);
        d1 = new rdb1(i2, (byte) 28);
        e1 = new rdb1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rdb1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 1:
                l7e0 l7e0Var = ((hwq) obj).g;
                if (!(l7e0Var instanceof j7e0)) {
                    return new ndb1(l7e0Var.getUri(), false);
                }
                zuc0 zuc0Var = ((j7e0) l7e0Var).a;
                String str = zuc0Var.c;
                lkj0 lkj0Var = zuc0Var.p;
                fjf1 fjf1Var = lkj0Var instanceof fjf1 ? (fjf1) lkj0Var : null;
                return new ndb1(str, fjf1Var != null ? fjf1Var.h : false);
            case 2:
                return new beb1(new zdb1(""), false);
            case 3:
                return ((xdb1) obj).a;
            case 4:
                return ((xdb1) obj).a;
            case 5:
                return ((xdb1) obj).a;
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 7:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 9:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 11:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 13:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 15:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                return rc11.a.b(((aeb1) obj).getClass());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                llv llvVar = mlv.d;
                return hm5.P(xay.e(2, irn1.o0(0, 0, llvVar, 3)), xay.f(2, irn1.o0(0, 0, llvVar, 3)));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return rc11.a.b(((geb1) obj).getClass());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                llv llvVar2 = mlv.d;
                return hm5.P(xay.e(2, irn1.o0(0, 0, llvVar2, 3)), xay.f(2, irn1.o0(0, 0, llvVar2, 3)));
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((vhc1) obj).getUri();
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 23:
                return ((vhc1) obj).getUri();
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 26:
                return Boolean.valueOf(obj instanceof qxc0);
            case 27:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 28:
                return ((vhc1) obj).getUri();
            default:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
