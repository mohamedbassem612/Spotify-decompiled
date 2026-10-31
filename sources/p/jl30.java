package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jl30 extends hab0 implements iu30 {
    public static final jl30 N0;
    public static final jl30 O0;
    public static final jl30 P0;
    public static final jl30 Q0;
    public static final jl30 R0;
    public static final jl30 S0;
    public static final jl30 T0;
    public static final jl30 U0;
    public static final jl30 V0;
    public static final jl30 W0;
    public static final jl30 X;
    public static final jl30 X0;
    public static final jl30 Y;
    public static final jl30 Y0;
    public static final jl30 Z;
    public static final jl30 Z0;
    public static final jl30 a1;
    public static final jl30 b;
    public static final jl30 b1;
    public static final jl30 c;
    public static final jl30 c1;
    public static final jl30 d;
    public static final jl30 d1;
    public static final jl30 e;
    public static final jl30 e1;
    public static final jl30 f;
    public static final jl30 g;
    public static final jl30 h;
    public static final jl30 i;
    public static final jl30 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new jl30(i2, (byte) 0);
        c = new jl30(i2, (byte) 1);
        d = new jl30(i2, (byte) 2);
        e = new jl30(i2, (byte) 3);
        f = new jl30(i2, (byte) 4);
        g = new jl30(i2, (byte) 5);
        h = new jl30(i2, (byte) 6);
        i = new jl30(i2, (byte) 7);
        t = new jl30(i2, (byte) 8);
        X = new jl30(i2, (byte) 9);
        Y = new jl30(i2, (byte) 10);
        Z = new jl30(i2, (byte) 11);
        N0 = new jl30(i2, (byte) 12);
        O0 = new jl30(i2, (byte) 13);
        P0 = new jl30(i2, (byte) 14);
        Q0 = new jl30(i2, (byte) 15);
        R0 = new jl30(i2, (byte) 16);
        S0 = new jl30(i2, (byte) 17);
        T0 = new jl30(i2, (byte) 18);
        U0 = new jl30(i2, (byte) 19);
        V0 = new jl30(i2, (byte) 20);
        W0 = new jl30(i2, (byte) 21);
        X0 = new jl30(i2, (byte) 22);
        Y0 = new jl30(i2, (byte) 23);
        Z0 = new jl30(i2, (byte) 24);
        a1 = new jl30(i2, (byte) 25);
        b1 = new jl30(i2, (byte) 26);
        c1 = new jl30(i2, (byte) 27);
        d1 = new jl30(i2, (byte) 28);
        e1 = new jl30(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jl30(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                b261.c((e261) obj);
                return rih1Var;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                return new p3a();
            case 4:
                return new k68((String) obj);
            case 5:
                return new euy(false);
            case 6:
                return new xsy((String) obj, false);
            case 7:
                return new qhl0((rhl0) obj, (byte) 3);
            case 8:
                return new qhl0((rhl0) obj, (byte) 1);
            case 9:
                return new qhl0((rhl0) obj, (byte) 4);
            case 10:
                return new qhl0((rhl0) obj, (byte) 2);
            case 11:
                return new qhl0((rhl0) obj, (byte) 0);
            case 12:
                return new om51(false);
            case 13:
                return new lo51(((Boolean) obj).booleanValue());
            case 14:
                return new c7v0(1, ((Boolean) obj).booleanValue());
            case 15:
                return new lo51(((Boolean) obj).booleanValue());
            case 16:
                return new sl1(true);
            case 17:
                return new sl1(true);
            case 18:
                jo30 jo30Var = (jo30) obj;
                return new bjs0(jo30Var.b, jo30Var.c, jo30Var.d, jo30Var.e, true, jo30Var.f ? uis0.b : null, 64);
            case 19:
                return new io30((zis0) obj);
            case 20:
                mmr0 mmr0Var = (mmr0) obj;
                Object obj2 = mmr0Var.b;
                if (obj2 != null) {
                    return new mmr0(mmr0Var.a, obj2);
                }
                return null;
            case 21:
                return gio1.b(rih1Var);
            case 22:
                cxo0 cxo0Var = (cxo0) obj;
                return new zo30(cxo0Var.a, cxo0Var.b, cxo0Var.c);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ((mp30) obj).a;
            case 24:
                return ((mp30) obj).a;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return ((mp30) obj).a;
            case 26:
                return ((mp30) obj).a;
            case 27:
                return (xkk1) obj;
            case 28:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
        }
    }
}
