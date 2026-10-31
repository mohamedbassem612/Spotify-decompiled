package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ecd0 extends hab0 implements iu30 {
    public static final ecd0 N0;
    public static final ecd0 O0;
    public static final ecd0 P0;
    public static final ecd0 Q0;
    public static final ecd0 R0;
    public static final ecd0 S0;
    public static final ecd0 T0;
    public static final ecd0 U0;
    public static final ecd0 V0;
    public static final ecd0 W0;
    public static final ecd0 X;
    public static final ecd0 X0;
    public static final ecd0 Y;
    public static final ecd0 Y0;
    public static final ecd0 Z;
    public static final ecd0 Z0;
    public static final ecd0 a1;
    public static final ecd0 b;
    public static final ecd0 b1;
    public static final ecd0 c;
    public static final ecd0 c1;
    public static final ecd0 d;
    public static final ecd0 d1;
    public static final ecd0 e;
    public static final ecd0 e1;
    public static final ecd0 f;
    public static final ecd0 g;
    public static final ecd0 h;
    public static final ecd0 i;
    public static final ecd0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ecd0(i2, (byte) 0);
        c = new ecd0(i2, (byte) 1);
        d = new ecd0(i2, (byte) 2);
        e = new ecd0(i2, (byte) 3);
        f = new ecd0(i2, (byte) 4);
        g = new ecd0(i2, (byte) 5);
        h = new ecd0(i2, (byte) 6);
        i = new ecd0(i2, (byte) 7);
        t = new ecd0(i2, (byte) 8);
        X = new ecd0(i2, (byte) 9);
        Y = new ecd0(i2, (byte) 10);
        Z = new ecd0(i2, (byte) 11);
        N0 = new ecd0(i2, (byte) 12);
        O0 = new ecd0(i2, (byte) 13);
        P0 = new ecd0(i2, (byte) 14);
        Q0 = new ecd0(i2, (byte) 15);
        R0 = new ecd0(i2, (byte) 16);
        S0 = new ecd0(i2, (byte) 17);
        T0 = new ecd0(i2, (byte) 18);
        U0 = new ecd0(i2, (byte) 19);
        V0 = new ecd0(i2, (byte) 20);
        W0 = new ecd0(i2, (byte) 21);
        X0 = new ecd0(i2, (byte) 22);
        Y0 = new ecd0(i2, (byte) 23);
        Z0 = new ecd0(i2, (byte) 24);
        a1 = new ecd0(i2, (byte) 25);
        b1 = new ecd0(i2, (byte) 26);
        c1 = new ecd0(i2, (byte) 27);
        d1 = new ecd0(i2, (byte) 28);
        e1 = new ecd0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ecd0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 1:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", ccd0.class);
            case 2:
                return f4i1.c(((Number) obj).intValue(), "loading_");
            case 3:
                rtb0.b((rtb0) obj, 3, d, xvi.a, 4);
                return rih1Var;
            case 4:
                return qed0.a;
            case 5:
                return Integer.valueOf(((q5t0) obj).X());
            case 6:
                return Integer.valueOf(((q5t0) obj).X());
            case 7:
                return Integer.valueOf(((q5t0) obj).X());
            case 8:
                return (String) obj;
            case 9:
                return (xkk1) obj;
            case 10:
                String str = ((ufd0) obj).a;
                List list = cgd0.a;
                Set set = s4b1.f;
                String strS = uic.x(str).s();
                if (strS == null) {
                    strS = "";
                }
                return new vfd0((String) null, (String) null, strS);
            case 11:
                return ((ufd0) obj).a;
            case 12:
                return ((ufd0) obj).a;
            case 13:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
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
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "share-listening-activity";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((nwl0) obj).e();
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new gmd0(((fmd0) obj).a, b7x.a);
            case 25:
                return rih1Var;
            case 26:
                return rih1Var;
            case 27:
                return rih1Var;
            case 28:
                return new t0l0((i3l0) obj);
            default:
                return ((t0l0) obj).a("spotify:live-legal-disclosure");
        }
    }
}
