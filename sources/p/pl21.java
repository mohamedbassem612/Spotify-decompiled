package p;

import android.webkit.WebView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pl21 extends hab0 implements iu30 {
    public static final pl21 N0;
    public static final pl21 O0;
    public static final pl21 P0;
    public static final pl21 Q0;
    public static final pl21 R0;
    public static final pl21 S0;
    public static final pl21 T0;
    public static final pl21 U0;
    public static final pl21 V0;
    public static final pl21 W0;
    public static final pl21 X;
    public static final pl21 X0;
    public static final pl21 Y;
    public static final pl21 Y0;
    public static final pl21 Z;
    public static final pl21 Z0;
    public static final pl21 a1;
    public static final pl21 b;
    public static final pl21 b1;
    public static final pl21 c;
    public static final pl21 c1;
    public static final pl21 d;
    public static final pl21 d1;
    public static final pl21 e;
    public static final pl21 e1;
    public static final pl21 f;
    public static final pl21 g;
    public static final pl21 h;
    public static final pl21 i;
    public static final pl21 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new pl21(i2, (byte) 0);
        c = new pl21(i2, (byte) 1);
        d = new pl21(i2, (byte) 2);
        e = new pl21(i2, (byte) 3);
        f = new pl21(i2, (byte) 4);
        g = new pl21(i2, (byte) 5);
        h = new pl21(i2, (byte) 6);
        i = new pl21(i2, (byte) 7);
        t = new pl21(i2, (byte) 8);
        X = new pl21(i2, (byte) 9);
        Y = new pl21(i2, (byte) 10);
        Z = new pl21(i2, (byte) 11);
        N0 = new pl21(i2, (byte) 12);
        O0 = new pl21(i2, (byte) 13);
        P0 = new pl21(i2, (byte) 14);
        Q0 = new pl21(i2, (byte) 15);
        R0 = new pl21(i2, (byte) 16);
        S0 = new pl21(i2, (byte) 17);
        T0 = new pl21(i2, (byte) 18);
        U0 = new pl21(i2, (byte) 19);
        V0 = new pl21(i2, (byte) 20);
        W0 = new pl21(i2, (byte) 21);
        X0 = new pl21(i2, (byte) 22);
        Y0 = new pl21(i2, (byte) 23);
        Z0 = new pl21(i2, (byte) 24);
        a1 = new pl21(i2, (byte) 25);
        b1 = new pl21(i2, (byte) 26);
        c1 = new pl21(i2, (byte) 27);
        d1 = new pl21(i2, (byte) 28);
        e1 = new pl21(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl21(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((d2l0) obj).e();
            case 1:
                ((WebView) obj).destroy();
                return rih1Var;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                return (String) obj;
            case 4:
                return (String) obj;
            case 5:
                return (String) obj;
            case 6:
                return (String) obj;
            case 7:
                return (String) obj;
            case 8:
                return (String) obj;
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
                if (!(obj instanceof ydk) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ydk) obj;
            case 13:
                if (!(obj instanceof m6k) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (m6k) obj;
            case 15:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(obj instanceof j6k);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return (j6k) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concert.Concert");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(obj instanceof lhe0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (obj != null) {
                    return (lhe0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertlocation.Location");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                return ((ho70) obj).a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b261.c((e261) obj);
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return new vr21(((Boolean) obj).booleanValue());
            case 27:
                return ((ho70) obj).a;
            case 28:
                return Integer.valueOf(((Number) obj).intValue());
            default:
                return Integer.valueOf(((Number) obj).intValue());
        }
    }
}
