package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h3 extends hab0 implements iu30 {
    public static final h3 N0;
    public static final h3 O0;
    public static final h3 P0;
    public static final h3 Q0;
    public static final h3 R0;
    public static final h3 S0;
    public static final h3 T0;
    public static final h3 U0;
    public static final h3 V0;
    public static final h3 W0;
    public static final h3 X;
    public static final h3 X0;
    public static final h3 Y;
    public static final h3 Y0;
    public static final h3 Z;
    public static final h3 Z0;
    public static final h3 a1;
    public static final h3 b;
    public static final h3 b1;
    public static final h3 c;
    public static final h3 c1;
    public static final h3 d;
    public static final h3 d1;
    public static final h3 e;
    public static final h3 e1;
    public static final h3 f;
    public static final h3 g;
    public static final h3 h;
    public static final h3 i;
    public static final h3 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new h3(i2, (byte) 0);
        c = new h3(i2, (byte) 1);
        d = new h3(i2, (byte) 2);
        e = new h3(i2, (byte) 3);
        f = new h3(i2, (byte) 4);
        g = new h3(i2, (byte) 5);
        h = new h3(i2, (byte) 6);
        i = new h3(i2, (byte) 7);
        t = new h3(i2, (byte) 8);
        X = new h3(i2, (byte) 9);
        Y = new h3(i2, (byte) 10);
        Z = new h3(i2, (byte) 11);
        N0 = new h3(i2, (byte) 12);
        O0 = new h3(i2, (byte) 13);
        P0 = new h3(i2, (byte) 14);
        Q0 = new h3(i2, (byte) 15);
        R0 = new h3(i2, (byte) 16);
        S0 = new h3(i2, (byte) 17);
        T0 = new h3(i2, (byte) 18);
        U0 = new h3(i2, (byte) 19);
        V0 = new h3(i2, (byte) 20);
        W0 = new h3(i2, (byte) 21);
        X0 = new h3(i2, (byte) 22);
        Y0 = new h3(i2, (byte) 23);
        Z0 = new h3(i2, (byte) 24);
        a1 = new h3(i2, (byte) 25);
        b1 = new h3(i2, (byte) 26);
        c1 = new h3(i2, (byte) 27);
        d1 = new h3(i2, (byte) 28);
        e1 = new h3(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        io70 io70Var;
        byte b2 = this.a;
        String str = "";
        boolean z = true;
        byte b3 = 0;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 2:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 4:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 6:
                return ((s3) obj).a;
            case 7:
                jo70 jo70Var = (jo70) obj;
                if (jo70Var != null && (io70Var = jo70Var.e) != null) {
                    str = io70Var.b;
                }
                return new r3(str);
            case 8:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 10:
                return (String) obj;
            case 11:
                return (iix0) obj;
            case 12:
                if (!(obj instanceof iix0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 14:
                l4 l4Var = (l4) obj;
                return new m4(l4Var.a, l4Var.b, l4Var.c, "", "", "", -16777216, -16777216, null);
            case 15:
                return ((ho70) obj).a;
            case 16:
                u771 u771Var = ((g271) obj).a;
                e5 e5Var = (e5) u771Var.b();
                return new l4(u771Var.a.a.a, e5Var.b, e5Var.a);
            case 17:
                return new tyk0((i3l0) obj);
            case 18:
                return ((tyk0) obj).e();
            case 19:
                return rih1Var;
            case 20:
                String str2 = ((hi) obj).b;
                return sqg0.J(new mmr0[]{new mmr0("action", "enable"), new mmr0("device", str2 != null ? str2 : "")});
            case 21:
                return sqg0.J(new mmr0[]{new mmr0("tab", "service"), new mmr0("setting", "spotify"), new mmr0("key_assign", "enable")});
            case 22:
                String str3 = ((hi) obj).b;
                return sqg0.J(new mmr0[]{new mmr0("pageType", "gesture"), new mmr0("deviceName", str3 != null ? str3 : ""), new mmr0("src", "spotify")});
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return rih1Var;
            case 24:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return rih1Var;
            case 27:
                return rih1Var;
            case 28:
                return r6x.a;
            default:
                ((qtr) obj).b(new kr(5, lnmVar, b3));
                return rih1Var;
        }
    }
}
