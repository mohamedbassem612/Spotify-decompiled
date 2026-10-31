package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l1d0 extends hab0 implements iu30 {
    public static final l1d0 N0;
    public static final l1d0 O0;
    public static final l1d0 P0;
    public static final l1d0 Q0;
    public static final l1d0 R0;
    public static final l1d0 S0;
    public static final l1d0 T0;
    public static final l1d0 U0;
    public static final l1d0 V0;
    public static final l1d0 W0;
    public static final l1d0 X;
    public static final l1d0 X0;
    public static final l1d0 Y;
    public static final l1d0 Y0;
    public static final l1d0 Z;
    public static final l1d0 Z0;
    public static final l1d0 a1;
    public static final l1d0 b;
    public static final l1d0 b1;
    public static final l1d0 c;
    public static final l1d0 c1;
    public static final l1d0 d;
    public static final l1d0 d1;
    public static final l1d0 e;
    public static final l1d0 e1;
    public static final l1d0 f;
    public static final l1d0 g;
    public static final l1d0 h;
    public static final l1d0 i;
    public static final l1d0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new l1d0(i2, (byte) 0);
        c = new l1d0(i2, (byte) 1);
        d = new l1d0(i2, (byte) 2);
        e = new l1d0(i2, (byte) 3);
        f = new l1d0(i2, (byte) 4);
        g = new l1d0(i2, (byte) 5);
        h = new l1d0(i2, (byte) 6);
        i = new l1d0(i2, (byte) 7);
        t = new l1d0(i2, (byte) 8);
        X = new l1d0(i2, (byte) 9);
        Y = new l1d0(i2, (byte) 10);
        Z = new l1d0(i2, (byte) 11);
        N0 = new l1d0(i2, (byte) 12);
        O0 = new l1d0(i2, (byte) 13);
        P0 = new l1d0(i2, (byte) 14);
        Q0 = new l1d0(i2, (byte) 15);
        R0 = new l1d0(i2, (byte) 16);
        S0 = new l1d0(i2, (byte) 17);
        T0 = new l1d0(i2, (byte) 18);
        U0 = new l1d0(i2, (byte) 19);
        V0 = new l1d0(i2, (byte) 20);
        W0 = new l1d0(i2, (byte) 21);
        X0 = new l1d0(i2, (byte) 22);
        Y0 = new l1d0(i2, (byte) 23);
        Z0 = new l1d0(i2, (byte) 24);
        a1 = new l1d0(i2, (byte) 25);
        b1 = new l1d0(i2, (byte) 26);
        c1 = new l1d0(i2, (byte) 27);
        d1 = new l1d0(i2, (byte) 28);
        e1 = new l1d0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1d0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return obj;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                return obj;
            case 3:
                ((Number) obj).intValue();
                return null;
            case 4:
                return nim0.a;
            case 5:
                yer0 yer0Var = (yer0) obj;
                return new h2d0(yer0Var.a, yer0Var.b, yer0Var.c);
            case 6:
                return w7x.a;
            case 7:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 8:
                return c4d0.b;
            case 9:
                return new g4d0((String) obj);
            case 10:
                return (g3d0) obj;
            case 11:
                return Boolean.valueOf(obj instanceof g3d0);
            case 12:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 13:
                return Boolean.FALSE;
            case 14:
                return Boolean.valueOf(obj instanceof Set);
            case 15:
                return (k1r) obj;
            case 16:
                return Boolean.valueOf(obj instanceof g3d0);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (k1r) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new e8d0(((cxc0) obj).f.a);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new f8d0(u2d0.a);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new g4d0((String) obj);
            case 22:
                return (g3d0) obj;
            case 23:
                return Boolean.valueOf(obj instanceof g3d0);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 25:
                ((Number) obj).intValue();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-listening-activity-audience-setting";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("listeningactivity/audiencesetting");
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            case 26:
                return new y9d0((uqo) obj, cj20.t, iax.a);
            case 27:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 28:
                return (Parcelable) jhc1.t((Bundle) obj, "parcelable", yad0.class);
            default:
                return ((xad0) obj).a.keySet();
        }
    }
}
