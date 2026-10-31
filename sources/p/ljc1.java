package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ljc1 extends hab0 implements iu30 {
    public static final ljc1 N0;
    public static final ljc1 O0;
    public static final ljc1 P0;
    public static final ljc1 Q0;
    public static final ljc1 R0;
    public static final ljc1 S0;
    public static final ljc1 T0;
    public static final ljc1 U0;
    public static final ljc1 V0;
    public static final ljc1 W0;
    public static final ljc1 X;
    public static final ljc1 X0;
    public static final ljc1 Y;
    public static final ljc1 Y0;
    public static final ljc1 Z;
    public static final ljc1 Z0;
    public static final ljc1 a1;
    public static final ljc1 b;
    public static final ljc1 b1;
    public static final ljc1 c;
    public static final ljc1 c1;
    public static final ljc1 d;
    public static final ljc1 d1;
    public static final ljc1 e;
    public static final ljc1 e1;
    public static final ljc1 f;
    public static final ljc1 g;
    public static final ljc1 h;
    public static final ljc1 i;
    public static final ljc1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ljc1(i2, (byte) 0);
        c = new ljc1(i2, (byte) 1);
        d = new ljc1(i2, (byte) 2);
        e = new ljc1(i2, (byte) 3);
        f = new ljc1(i2, (byte) 4);
        g = new ljc1(i2, (byte) 5);
        h = new ljc1(i2, (byte) 6);
        i = new ljc1(i2, (byte) 7);
        t = new ljc1(i2, (byte) 8);
        X = new ljc1(i2, (byte) 9);
        Y = new ljc1(i2, (byte) 10);
        Z = new ljc1(i2, (byte) 11);
        N0 = new ljc1(i2, (byte) 12);
        O0 = new ljc1(i2, (byte) 13);
        P0 = new ljc1(i2, (byte) 14);
        Q0 = new ljc1(i2, (byte) 15);
        R0 = new ljc1(i2, (byte) 16);
        S0 = new ljc1(i2, (byte) 17);
        T0 = new ljc1(i2, (byte) 18);
        U0 = new ljc1(i2, (byte) 19);
        V0 = new ljc1(i2, (byte) 20);
        W0 = new ljc1(i2, (byte) 21);
        X0 = new ljc1(i2, (byte) 22);
        Y0 = new ljc1(i2, (byte) 23);
        Z0 = new ljc1(i2, (byte) 24);
        a1 = new ljc1(i2, (byte) 25);
        b1 = new ljc1(i2, (byte) 26);
        c1 = new ljc1(i2, (byte) 27);
        d1 = new ljc1(i2, (byte) 28);
        e1 = new ljc1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ljc1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 1:
                cxc0 cxc0Var = (cxc0) obj;
                return new sjc1(cxc0Var.b, cxc0Var.f.v);
            case 2:
                return ojc1.a;
            case 3:
                return Boolean.valueOf((obj instanceof w281) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 5:
                return (String) obj;
            case 6:
                w281 w281Var = (w281) obj;
                if (w281Var == null) {
                    return null;
                }
                if (!w281Var.c) {
                    w281Var = null;
                }
                if (w281Var != null) {
                    return w281Var.d;
                }
                return null;
            case 7:
                return ((bfo) obj).a;
            case 8:
                return ((xh90) obj).b;
            case 9:
                return new bsc1();
            case 10:
                return mno1.h(new mmr0[]{new mmr0("SubtitlesPageElementStateKey", (bsc1) obj)});
            case 11:
                ((xas) obj).a(Y, nva1.e1);
                return rih1Var;
            case 12:
                return new msc1((lsc1) obj, null, "", false);
            case 13:
                return ((lsc1) obj).b;
            case 14:
                return ((lsc1) obj).c;
            case 15:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(obj instanceof jo70);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                htc1 htc1Var = (htc1) obj;
                return new bjs0(htc1Var.b, htc1Var.c, htc1Var.d, htc1Var.e, true, itc1.a[l1d.C(htc1Var.f)] == 1 ? vis0.b : ris0.b, 64);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new ftc1((zis0) obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.c((e261) obj);
                return rih1Var;
            case 22:
                return rih1Var;
            case 23:
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((kd31) obj).i(1);
                return rih1Var;
            case 25:
                return rih1Var;
            case 26:
                return new n2l0((i3l0) obj);
            case 27:
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:supplementarymaterial")), ((n2l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 28:
                return new p3v(8.0f);
            default:
                return new p3v(8.0f);
        }
    }
}
