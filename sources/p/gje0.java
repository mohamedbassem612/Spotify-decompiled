package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gje0 extends hab0 implements iu30 {
    public static final gje0 N0;
    public static final gje0 O0;
    public static final gje0 P0;
    public static final gje0 Q0;
    public static final gje0 R0;
    public static final gje0 S0;
    public static final gje0 T0;
    public static final gje0 U0;
    public static final gje0 V0;
    public static final gje0 W0;
    public static final gje0 X;
    public static final gje0 X0;
    public static final gje0 Y;
    public static final gje0 Y0;
    public static final gje0 Z;
    public static final gje0 Z0;
    public static final gje0 a1;
    public static final gje0 b;
    public static final gje0 b1;
    public static final gje0 c;
    public static final gje0 c1;
    public static final gje0 d;
    public static final gje0 d1;
    public static final gje0 e;
    public static final gje0 e1;
    public static final gje0 f;
    public static final gje0 g;
    public static final gje0 h;
    public static final gje0 i;
    public static final gje0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new gje0(i2, (byte) 0);
        c = new gje0(i2, (byte) 1);
        d = new gje0(i2, (byte) 2);
        e = new gje0(i2, (byte) 3);
        f = new gje0(i2, (byte) 4);
        g = new gje0(i2, (byte) 5);
        h = new gje0(i2, (byte) 6);
        i = new gje0(i2, (byte) 7);
        t = new gje0(i2, (byte) 8);
        X = new gje0(i2, (byte) 9);
        Y = new gje0(i2, (byte) 10);
        Z = new gje0(i2, (byte) 11);
        N0 = new gje0(i2, (byte) 12);
        O0 = new gje0(i2, (byte) 13);
        P0 = new gje0(i2, (byte) 14);
        Q0 = new gje0(i2, (byte) 15);
        R0 = new gje0(i2, (byte) 16);
        S0 = new gje0(i2, (byte) 17);
        T0 = new gje0(i2, (byte) 18);
        U0 = new gje0(i2, (byte) 19);
        V0 = new gje0(i2, (byte) 20);
        W0 = new gje0(i2, (byte) 21);
        X0 = new gje0(i2, (byte) 22);
        Y0 = new gje0(i2, (byte) 23);
        Z0 = new gje0(i2, (byte) 24);
        a1 = new gje0(i2, (byte) 25);
        b1 = new gje0(i2, (byte) 26);
        c1 = new gje0(i2, (byte) 27);
        d1 = new gje0(i2, (byte) 28);
        e1 = new gje0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gje0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return rih1Var;
            case 1:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 2:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 3:
                return Integer.valueOf(((q5t0) obj).X() / 2);
            case 4:
                return ihc1.e1((String) obj).toString();
            case 5:
                return mno1.h(new mmr0[]{new mmr0("LocationSearchModel", (ume0) obj)});
            case 6:
                String str = nik1.y1.a;
                String str2 = ((fne0) obj).a;
                return str2 != null ? xcg1.i(str, "?pageState=", str2) : str;
            case 7:
                xoe0 xoe0Var = (xoe0) obj;
                return new are0(xoe0Var, jwq0.b, fap1.e(xoe0Var));
            case 8:
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                b261.c((e261) obj);
                return rih1Var;
            case 11:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 12:
                b261.c((e261) obj);
                return rih1Var;
            case 13:
                b261.c((e261) obj);
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
                ((r2t) obj).a().b();
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return t220.a((t220) obj, 1, 0.0d, 3071);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return t220.a((t220) obj, 3, 0.0d, 3071);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return t220.a((t220) obj, 3, 0.0d, 3071);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return t220.a((t220) obj, 1, 0.0d, 3071);
            case 22:
                return mno1.h(new mmr0[]{new mmr0("login_choice_page_model", (lye0) obj)});
            case 23:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return mno1.h(new mmr0[]{new mmr0("login_current_device_model", (qze0) obj)});
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return mno1.h(new mmr0[]{new mmr0("login_different_device_model", (r0f0) obj)});
            case 27:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                b261.t((e261) obj, 0);
                return rih1Var;
            default:
                cas casVar = (a7m0) obj;
                casVar.a = x5d0.X0;
                casVar.d = i0f0.c;
                return rih1Var;
        }
    }
}
