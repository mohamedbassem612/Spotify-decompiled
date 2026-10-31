package p;

import com.spotify.scrollsita.v1.Section;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cgb1 extends hab0 implements iu30 {
    public static final cgb1 N0;
    public static final cgb1 O0;
    public static final cgb1 P0;
    public static final cgb1 Q0;
    public static final cgb1 R0;
    public static final cgb1 S0;
    public static final cgb1 T0;
    public static final cgb1 U0;
    public static final cgb1 V0;
    public static final cgb1 W0;
    public static final cgb1 X;
    public static final cgb1 X0;
    public static final cgb1 Y;
    public static final cgb1 Y0;
    public static final cgb1 Z;
    public static final cgb1 Z0;
    public static final cgb1 a1;
    public static final cgb1 b;
    public static final cgb1 b1;
    public static final cgb1 c;
    public static final cgb1 c1;
    public static final cgb1 d;
    public static final cgb1 d1;
    public static final cgb1 e;
    public static final cgb1 e1;
    public static final cgb1 f;
    public static final cgb1 g;
    public static final cgb1 h;
    public static final cgb1 i;
    public static final cgb1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new cgb1(i2, (byte) 0);
        c = new cgb1(i2, (byte) 1);
        d = new cgb1(i2, (byte) 2);
        e = new cgb1(i2, (byte) 3);
        f = new cgb1(i2, (byte) 4);
        g = new cgb1(i2, (byte) 5);
        h = new cgb1(i2, (byte) 6);
        i = new cgb1(i2, (byte) 7);
        t = new cgb1(i2, (byte) 8);
        X = new cgb1(i2, (byte) 9);
        Y = new cgb1(i2, (byte) 10);
        Z = new cgb1(i2, (byte) 11);
        N0 = new cgb1(i2, (byte) 12);
        O0 = new cgb1(i2, (byte) 13);
        P0 = new cgb1(i2, (byte) 14);
        Q0 = new cgb1(i2, (byte) 15);
        R0 = new cgb1(i2, (byte) 16);
        S0 = new cgb1(i2, (byte) 17);
        T0 = new cgb1(i2, (byte) 18);
        U0 = new cgb1(i2, (byte) 19);
        V0 = new cgb1(i2, (byte) 20);
        W0 = new cgb1(i2, (byte) 21);
        X0 = new cgb1(i2, (byte) 22);
        Y0 = new cgb1(i2, (byte) 23);
        Z0 = new cgb1(i2, (byte) 24);
        a1 = new cgb1(i2, (byte) 25);
        b1 = new cgb1(i2, (byte) 26);
        c1 = new cgb1(i2, (byte) 27);
        d1 = new cgb1(i2, (byte) 28);
        e1 = new cgb1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cgb1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 2:
                if (!(obj instanceof uw9) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uw9) obj;
            case 4:
                xgb1 xgb1Var = (xgb1) obj;
                chb1.f.getClass();
                return new ahb1(xgb1Var.a, xgb1Var.b, xgb1Var.c, xgb1Var.d, null, xgb1Var.e);
            case 5:
                return new ugb1((wkt) obj);
            case 6:
                return new pgb1(((Boolean) obj).booleanValue());
            case 7:
                g271 g271Var = (g271) obj;
                int i2 = g271Var.c;
                u771 u771Var = g271Var.a;
                t771 t771Var = u771Var.a;
                z771 z771Var = t771Var.b;
                pz61 pz61Var = u771Var.b;
                ez61 ez61Var = pz61Var.c;
                wa71 wa71Var = t771Var.a;
                c871 c871Var = pz61Var.b;
                fhb1 fhb1Var = c871Var instanceof fhb1 ? (fhb1) c871Var : null;
                return new xgb1(i2, z771Var, ez61Var, wa71Var, fhb1Var != null && fhb1Var.a);
            case 8:
                b261.c((e261) obj);
                return rih1Var;
            case 9:
                qib1 qib1Var = (qib1) obj;
                return new rib1(qib1Var.a, qib1Var.b, false);
            case 10:
                return new m2l0((i3l0) obj);
            case 11:
                return rih1Var;
            case 12:
                return rih1Var;
            case 13:
                return rih1Var;
            case 14:
                Integer num = ((lsb1) obj).b;
                return mno1.h(new mmr0[]{new mmr0("active_listener_count", Integer.valueOf(num != null ? num.intValue() : 0))});
            case 15:
                return ((jvb1) obj).a;
            case 16:
                bwb1 bwb1Var = (bwb1) obj;
                return new ewb1(bwb1Var.a, (String) null, (String) null, (String) null, false, (cwb1) null, (iwb1) null, bwb1Var.b, 382);
            case 17:
                return mno1.h(new mmr0[]{new mmr0("stickers-element-state-key", (ewb1) obj)});
            case 18:
                return ((bwb1) obj).a;
            case 19:
                return "country_code";
            case 20:
                return ((ho70) obj).a;
            case 21:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 23:
                return Boolean.valueOf(obj instanceof pyb1);
            case 24:
                if (obj != null) {
                    return (pyb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.stickers.datasource.StickersTable.Item");
                return null;
            case 25:
                return new swb1((String) null, false);
            case 26:
                return ((rwb1) obj).a;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return (pyb1) obj;
            case 28:
                return Boolean.valueOf(obj instanceof pyb1);
            default:
                if (obj != null) {
                    return (pyb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.stickers.datasource.StickersTable.Item");
                return null;
        }
    }
}
