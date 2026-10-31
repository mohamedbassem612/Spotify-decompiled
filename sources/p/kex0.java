package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kex0 extends hab0 implements iu30 {
    public static final kex0 N0;
    public static final kex0 O0;
    public static final kex0 P0;
    public static final kex0 Q0;
    public static final kex0 R0;
    public static final kex0 S0;
    public static final kex0 T0;
    public static final kex0 U0;
    public static final kex0 V0;
    public static final kex0 W0;
    public static final kex0 X;
    public static final kex0 X0;
    public static final kex0 Y;
    public static final kex0 Y0;
    public static final kex0 Z;
    public static final kex0 Z0;
    public static final kex0 a1;
    public static final kex0 b;
    public static final kex0 b1;
    public static final kex0 c;
    public static final kex0 c1;
    public static final kex0 d;
    public static final kex0 d1;
    public static final kex0 e;
    public static final kex0 e1;
    public static final kex0 f;
    public static final kex0 g;
    public static final kex0 h;
    public static final kex0 i;
    public static final kex0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new kex0(i2, (byte) 0);
        c = new kex0(i2, (byte) 1);
        d = new kex0(i2, (byte) 2);
        e = new kex0(i2, (byte) 3);
        f = new kex0(i2, (byte) 4);
        g = new kex0(i2, (byte) 5);
        h = new kex0(i2, (byte) 6);
        i = new kex0(i2, (byte) 7);
        t = new kex0(i2, (byte) 8);
        X = new kex0(i2, (byte) 9);
        Y = new kex0(i2, (byte) 10);
        Z = new kex0(i2, (byte) 11);
        N0 = new kex0(i2, (byte) 12);
        O0 = new kex0(i2, (byte) 13);
        P0 = new kex0(i2, (byte) 14);
        Q0 = new kex0(i2, (byte) 15);
        R0 = new kex0(i2, (byte) 16);
        S0 = new kex0(i2, (byte) 17);
        T0 = new kex0(i2, (byte) 18);
        U0 = new kex0(i2, (byte) 19);
        V0 = new kex0(i2, (byte) 20);
        W0 = new kex0(i2, (byte) 21);
        X0 = new kex0(i2, (byte) 22);
        Y0 = new kex0(i2, (byte) 23);
        Z0 = new kex0(i2, (byte) 24);
        a1 = new kex0(i2, (byte) 25);
        b1 = new kex0(i2, (byte) 26);
        c1 = new kex0(i2, (byte) 27);
        d1 = new kex0(i2, (byte) 28);
        e1 = new kex0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kex0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof qp31) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qp31) obj;
            case 2:
                return Boolean.valueOf(obj instanceof vnb1);
            case 3:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 4:
                return (String) obj;
            case 5:
                return (String) obj;
            case 6:
                ((kd31) obj).f(false);
                return rih1Var;
            case 7:
                Set set = (Set) obj;
                return Boolean.valueOf(!(set == null || set.isEmpty()));
            case 8:
                return new tgx0(ugx0.g);
            case 9:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
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
                return new kjx0(0L, 0L);
            case 14:
                return ((l1o) obj).a;
            case 15:
                return rih1Var;
            case 16:
                return Boolean.valueOf(obj instanceof jo70);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (List) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (!(obj instanceof ez00) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ez00) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(obj instanceof ez00);
            case 22:
                if (obj != null) {
                    return (ez00) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.plugin.Extension");
                return null;
            case 23:
                return ((l1o) obj).a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return ((l1o) obj).a;
            case 25:
                return ((u310) obj).a;
            case 26:
                String str = (String) obj;
                if (!nhc1.Y(str, "spotify:episode:", false) && !nhc1.Y(str, "spotify:show:", false)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                return (String) obj;
            case 28:
                return (iix0) obj;
            default:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
