package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v7k0 extends hab0 implements iu30 {
    public static final v7k0 N0;
    public static final v7k0 O0;
    public static final v7k0 P0;
    public static final v7k0 Q0;
    public static final v7k0 R0;
    public static final v7k0 S0;
    public static final v7k0 T0;
    public static final v7k0 U0;
    public static final v7k0 V0;
    public static final v7k0 W0;
    public static final v7k0 X;
    public static final v7k0 X0;
    public static final v7k0 Y;
    public static final v7k0 Y0;
    public static final v7k0 Z;
    public static final v7k0 Z0;
    public static final v7k0 a1;
    public static final v7k0 b;
    public static final v7k0 b1;
    public static final v7k0 c;
    public static final v7k0 c1;
    public static final v7k0 d;
    public static final v7k0 d1;
    public static final v7k0 e;
    public static final v7k0 e1;
    public static final v7k0 f;
    public static final v7k0 g;
    public static final v7k0 h;
    public static final v7k0 i;
    public static final v7k0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new v7k0(i2, (byte) 0);
        c = new v7k0(i2, (byte) 1);
        d = new v7k0(i2, (byte) 2);
        e = new v7k0(i2, (byte) 3);
        f = new v7k0(i2, (byte) 4);
        g = new v7k0(i2, (byte) 5);
        h = new v7k0(i2, (byte) 6);
        i = new v7k0(i2, (byte) 7);
        t = new v7k0(i2, (byte) 8);
        X = new v7k0(i2, (byte) 9);
        Y = new v7k0(i2, (byte) 10);
        Z = new v7k0(i2, (byte) 11);
        N0 = new v7k0(i2, (byte) 12);
        O0 = new v7k0(i2, (byte) 13);
        P0 = new v7k0(i2, (byte) 14);
        Q0 = new v7k0(i2, (byte) 15);
        R0 = new v7k0(i2, (byte) 16);
        S0 = new v7k0(i2, (byte) 17);
        T0 = new v7k0(i2, (byte) 18);
        U0 = new v7k0(i2, (byte) 19);
        V0 = new v7k0(i2, (byte) 20);
        W0 = new v7k0(i2, (byte) 21);
        X0 = new v7k0(i2, (byte) 22);
        Y0 = new v7k0(i2, (byte) 23);
        Z0 = new v7k0(i2, (byte) 24);
        a1 = new v7k0(i2, (byte) 25);
        b1 = new v7k0(i2, (byte) 26);
        c1 = new v7k0(i2, (byte) 27);
        d1 = new v7k0(i2, (byte) 28);
        e1 = new v7k0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v7k0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return ((r7k0) obj).a;
            case 1:
                return ((r7k0) obj).a;
            case 2:
                return Boolean.valueOf(((r7k0) obj).e);
            case 3:
                return Boolean.valueOf(obj instanceof ro7);
            case 4:
                if (obj != null) {
                    return (ro7) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.audioattributesv2.AudioAttributesV2");
                return null;
            case 5:
                return Boolean.valueOf(obj instanceof hll);
            case 6:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 7:
                b261.d((e261) obj);
                return rih1.a;
            case 8:
                return new d8k0((c8k0) obj, "", false, false, (String) null, false, 72);
            case 9:
                if (!(obj instanceof mig1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mig1) obj;
            case 11:
                throw td6.k(obj);
            case 12:
                return new dak0((cak0) obj, 0, (zge1) null, (uia) null);
            case 13:
                return ((cak0) obj).b;
            case 14:
                return ((cak0) obj).b;
            case 15:
                if (!(obj instanceof uia) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uia) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (!(obj instanceof zge1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zge1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(obj instanceof hll);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return ((cak0) obj).b;
            case 22:
                return (zge1) obj;
            case 23:
                return new nak0((mak0) obj, (oak0) null, (oak0) null);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf(obj instanceof jo70);
            case 25:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof xkk1);
            case 27:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case 28:
                return (String) obj;
            default:
                return (String) obj;
        }
    }
}
