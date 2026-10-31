package p;

import android.view.View;
import android.view.ViewStub;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vm31 extends hab0 implements iu30 {
    public static final vm31 N0;
    public static final vm31 O0;
    public static final vm31 P0;
    public static final vm31 Q0;
    public static final vm31 R0;
    public static final vm31 S0;
    public static final vm31 T0;
    public static final vm31 U0;
    public static final vm31 V0;
    public static final vm31 W0;
    public static final vm31 X;
    public static final vm31 X0;
    public static final vm31 Y;
    public static final vm31 Y0;
    public static final vm31 Z;
    public static final vm31 Z0;
    public static final vm31 a1;
    public static final vm31 b;
    public static final vm31 b1;
    public static final vm31 c;
    public static final vm31 c1;
    public static final vm31 d;
    public static final vm31 d1;
    public static final vm31 e;
    public static final vm31 e1;
    public static final vm31 f;
    public static final vm31 g;
    public static final vm31 h;
    public static final vm31 i;
    public static final vm31 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new vm31(i2, (byte) 0);
        c = new vm31(i2, (byte) 1);
        d = new vm31(i2, (byte) 2);
        e = new vm31(i2, (byte) 3);
        f = new vm31(i2, (byte) 4);
        g = new vm31(i2, (byte) 5);
        h = new vm31(i2, (byte) 6);
        i = new vm31(i2, (byte) 7);
        t = new vm31(i2, (byte) 8);
        X = new vm31(i2, (byte) 9);
        Y = new vm31(i2, (byte) 10);
        Z = new vm31(i2, (byte) 11);
        N0 = new vm31(i2, (byte) 12);
        O0 = new vm31(i2, (byte) 13);
        P0 = new vm31(i2, (byte) 14);
        Q0 = new vm31(i2, (byte) 15);
        R0 = new vm31(i2, (byte) 16);
        S0 = new vm31(i2, (byte) 17);
        T0 = new vm31(i2, (byte) 18);
        U0 = new vm31(i2, (byte) 19);
        V0 = new vm31(i2, (byte) 20);
        W0 = new vm31(i2, (byte) 21);
        X0 = new vm31(i2, (byte) 22);
        Y0 = new vm31(i2, (byte) 23);
        Z0 = new vm31(i2, (byte) 24);
        a1 = new vm31(i2, (byte) 25);
        b1 = new vm31(i2, (byte) 26);
        c1 = new vm31(i2, (byte) 27);
        d1 = new vm31(i2, (byte) 28);
        e1 = new vm31(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vm31(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((tm31) obj).a;
            case 1:
                return ((tm31) obj).b;
            case 2:
                return ((tm31) obj).c;
            case 3:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 5:
                return Boolean.valueOf(obj instanceof f7a1);
            case 6:
                if (obj != null) {
                    return (f7a1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.songdnacredits.SongDNACredits");
                return null;
            case 7:
                return Boolean.valueOf(obj instanceof jo70);
            case 8:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 9:
                xa5 xa5Var = (xa5) obj;
                pxg1 pxg1Var = up31.b;
                bby bbyVarG = xa5Var.g(2, pxg1Var);
                pxg1 pxg1Var2 = up31.a;
                return xa5Var.a(hm5.P(bbyVarG.a(xay.e(2, pxg1Var2)), xa5Var.c(2, pxg1Var).a(xay.f(2, pxg1Var2))), hm5.h(2, (vu30) null));
            case 10:
                return mno1.h(new mmr0[]{new mmr0("ROUND_PLAY_MODEL", (rq31) obj)});
            case 11:
                return 0;
            case 12:
                return Boolean.TRUE;
            case 13:
                return 1;
            case 14:
                return 1;
            case 15:
                return Boolean.TRUE;
            case 16:
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                af afVar = (af) obj;
                return Integer.valueOf(((afVar.compareTo(af.d) <= 0 && afVar.compareTo(af.a) >= 0) || afVar.compareTo(af.i) > 0 || afVar.compareTo(af.e) < 0) ? 1 : 2);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new hu31((fu31) obj, null, false, 1, riw0.a);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((fu31) obj).b.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf((obj instanceof u061) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (u061) obj;
            case 23:
                return Boolean.valueOf((obj instanceof pjw0) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pjw0) obj;
            case 25:
                return Boolean.valueOf((obj instanceof cob1) || (obj instanceof rih1));
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 27:
                return Boolean.valueOf(!(((View) obj) instanceof ViewStub));
            case 28:
                return ((m0u0) obj).a.d;
            default:
                ((Number) obj).longValue();
                return rih1Var;
        }
    }
}
