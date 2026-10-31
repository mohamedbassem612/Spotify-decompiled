package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l9n0 extends hab0 implements iu30 {
    public static final l9n0 N0;
    public static final l9n0 O0;
    public static final l9n0 P0;
    public static final l9n0 Q0;
    public static final l9n0 R0;
    public static final l9n0 S0;
    public static final l9n0 T0;
    public static final l9n0 U0;
    public static final l9n0 V0;
    public static final l9n0 W0;
    public static final l9n0 X;
    public static final l9n0 X0;
    public static final l9n0 Y;
    public static final l9n0 Y0;
    public static final l9n0 Z;
    public static final l9n0 Z0;
    public static final l9n0 a1;
    public static final l9n0 b;
    public static final l9n0 b1;
    public static final l9n0 c;
    public static final l9n0 c1;
    public static final l9n0 d;
    public static final l9n0 d1;
    public static final l9n0 e;
    public static final l9n0 e1;
    public static final l9n0 f;
    public static final l9n0 g;
    public static final l9n0 h;
    public static final l9n0 i;
    public static final l9n0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new l9n0(i2, (byte) 0);
        c = new l9n0(i2, (byte) 1);
        d = new l9n0(i2, (byte) 2);
        e = new l9n0(i2, (byte) 3);
        f = new l9n0(i2, (byte) 4);
        g = new l9n0(i2, (byte) 5);
        h = new l9n0(i2, (byte) 6);
        i = new l9n0(i2, (byte) 7);
        t = new l9n0(i2, (byte) 8);
        X = new l9n0(i2, (byte) 9);
        Y = new l9n0(i2, (byte) 10);
        Z = new l9n0(i2, (byte) 11);
        N0 = new l9n0(i2, (byte) 12);
        O0 = new l9n0(i2, (byte) 13);
        P0 = new l9n0(i2, (byte) 14);
        Q0 = new l9n0(i2, (byte) 15);
        R0 = new l9n0(i2, (byte) 16);
        S0 = new l9n0(i2, (byte) 17);
        T0 = new l9n0(i2, (byte) 18);
        U0 = new l9n0(i2, (byte) 19);
        V0 = new l9n0(i2, (byte) 20);
        W0 = new l9n0(i2, (byte) 21);
        X0 = new l9n0(i2, (byte) 22);
        Y0 = new l9n0(i2, (byte) 23);
        Z0 = new l9n0(i2, (byte) 24);
        a1 = new l9n0(i2, (byte) 25);
        b1 = new l9n0(i2, (byte) 26);
        c1 = new l9n0(i2, (byte) 27);
        d1 = new l9n0(i2, (byte) 28);
        e1 = new l9n0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l9n0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof qxc0);
            case 1:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof zoy0);
            case 3:
                if (obj != null) {
                    return (zoy0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.publishingmetadatatrait.PublishingMetadataTrait");
                return null;
            case 4:
                return (String) obj;
            case 5:
                return (zoy0) obj;
            case 6:
                return new s460(2, 974, ((r9n0) obj).c, (String) null, (String) null, (String) null, false);
            case 7:
                return w7x.a;
            case 8:
                return new ley0(((s9n0) obj).c);
            case 9:
                t9n0 t9n0Var = (t9n0) obj;
                ArrayList arrayList = t9n0Var.d;
                String str = t9n0Var.c;
                om11 om11Var = t9n0Var.e;
                return new hv70("related-releases", new hvl1(str, 242, (String) null, om11Var != null ? om11Var.a : null, false, om11Var != null ? om11Var.b : null), arrayList, false, (n1x) null, 112);
            case 10:
                return alk1.c(((t9n0) obj).d);
            case 11:
                return rih1.a;
            case 12:
                return new lob1(1, "", "", "", (String) null, false, false);
            case 13:
                return ((gey0) obj).a;
            case 14:
                return ((gey0) obj).a;
            case 15:
                return ((gey0) obj).a;
            case 16:
                return Boolean.valueOf(obj instanceof jo70);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof xkk1);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (xkk1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.visualidentitytrait.VisualIdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof hll);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 22:
                return ((ho70) obj).a;
            case 23:
                bbn0 bbn0Var = (bbn0) obj;
                return new rbn0(bbn0Var.a, bbn0Var.b);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((bbn0) obj).a;
            case 25:
                return ((bbn0) obj).a;
            case 26:
                return ((bbn0) obj).a;
            case 27:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            default:
                return Boolean.valueOf(obj instanceof jo70);
        }
    }
}
