package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ovh extends hab0 implements iu30 {
    public static final ovh N0;
    public static final ovh O0;
    public static final ovh P0;
    public static final ovh Q0;
    public static final ovh R0;
    public static final ovh S0;
    public static final ovh T0;
    public static final ovh U0;
    public static final ovh V0;
    public static final ovh W0;
    public static final ovh X;
    public static final ovh X0;
    public static final ovh Y;
    public static final ovh Y0;
    public static final ovh Z;
    public static final ovh Z0;
    public static final ovh a1;
    public static final ovh b;
    public static final ovh b1;
    public static final ovh c;
    public static final ovh c1;
    public static final ovh d;
    public static final ovh d1;
    public static final ovh e;
    public static final ovh e1;
    public static final ovh f;
    public static final ovh g;
    public static final ovh h;
    public static final ovh i;
    public static final ovh t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ovh(i2, (byte) 0);
        c = new ovh(i2, (byte) 1);
        d = new ovh(i2, (byte) 2);
        e = new ovh(i2, (byte) 3);
        f = new ovh(i2, (byte) 4);
        g = new ovh(i2, (byte) 5);
        h = new ovh(i2, (byte) 6);
        i = new ovh(i2, (byte) 7);
        t = new ovh(i2, (byte) 8);
        X = new ovh(i2, (byte) 9);
        Y = new ovh(i2, (byte) 10);
        Z = new ovh(i2, (byte) 11);
        N0 = new ovh(i2, (byte) 12);
        O0 = new ovh(i2, (byte) 13);
        P0 = new ovh(i2, (byte) 14);
        Q0 = new ovh(i2, (byte) 15);
        R0 = new ovh(i2, (byte) 16);
        S0 = new ovh(i2, (byte) 17);
        T0 = new ovh(i2, (byte) 18);
        U0 = new ovh(i2, (byte) 19);
        V0 = new ovh(i2, (byte) 20);
        W0 = new ovh(i2, (byte) 21);
        X0 = new ovh(i2, (byte) 22);
        Y0 = new ovh(i2, (byte) 23);
        Z0 = new ovh(i2, (byte) 24);
        a1 = new ovh(i2, (byte) 25);
        b1 = new ovh(i2, (byte) 26);
        c1 = new ovh(i2, (byte) 27);
        d1 = new ovh(i2, (byte) 28);
        e1 = new ovh(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovh(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        z6x z6xVar = z6x.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 1:
                return Boolean.valueOf(obj instanceof jo70);
            case 2:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 3:
                return Boolean.valueOf(obj instanceof hll);
            case 4:
                if (obj != null) {
                    return (hll) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.consumptionexperiencetrait.ConsumptionExperienceTrait");
                return null;
            case 5:
                return new jwh((iwh) obj, z6xVar, 0);
            case 6:
                return new twh((swh) obj, z6xVar);
            case 7:
                qwh qwhVar = ((rwo0) obj).a;
                return new bwh(qwhVar.a, qwhVar.b, qwhVar.d, qwhVar.c);
            case 8:
                return w7x.a;
            case 9:
                glx glxVar = glx.c;
                d261 d261Var = jzd1.b;
                mma0 mma0Var = jzd1.a[0];
                d261Var.getClass();
                ((e261) obj).b(d261Var, glxVar);
                return rih1Var;
            case 10:
                elx elxVar = elx.c;
                d261 d261Var2 = jzd1.b;
                mma0 mma0Var2 = jzd1.a[0];
                d261Var2.getClass();
                ((e261) obj).b(d261Var2, elxVar);
                return rih1Var;
            case 11:
                b261.B((e261) obj, "comparison-test-tag");
                return rih1Var;
            case 12:
                rdh rdhVar = (rdh) obj;
                sc70 sc70Var = sc70.d;
                String str = rdhVar.a;
                if (str == null) {
                    str = "";
                }
                return wxo1.p(kyo1.v(rdhVar.b, true), str);
            case 13:
                return rih1Var;
            case 14:
                b261.c((e261) obj);
                return rih1Var;
            case 15:
                b261.c((e261) obj);
                return rih1Var;
            case 16:
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b261.x((e261) obj, 0);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.c((e261) obj);
                return rih1Var;
            case 22:
                b261.c((e261) obj);
                return rih1Var;
            case 23:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((n161) obj).b(lgo1.b, "TEST_TAG_UNAUTHENTICATED");
                return rih1Var;
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return rih1Var;
            case 27:
                ((Boolean) obj).getClass();
                return rih1Var;
            case 28:
                b261.d((e261) obj);
                return rih1Var;
            default:
                return rih1Var;
        }
    }
}
