package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rz31 extends hab0 implements iu30 {
    public static final rz31 N0;
    public static final rz31 O0;
    public static final rz31 P0;
    public static final rz31 Q0;
    public static final rz31 R0;
    public static final rz31 S0;
    public static final rz31 T0;
    public static final rz31 U0;
    public static final rz31 V0;
    public static final rz31 W0;
    public static final rz31 X;
    public static final rz31 X0;
    public static final rz31 Y;
    public static final rz31 Y0;
    public static final rz31 Z;
    public static final rz31 Z0;
    public static final rz31 a1;
    public static final rz31 b;
    public static final rz31 b1;
    public static final rz31 c;
    public static final rz31 c1;
    public static final rz31 d;
    public static final rz31 d1;
    public static final rz31 e;
    public static final rz31 e1;
    public static final rz31 f;
    public static final rz31 g;
    public static final rz31 h;
    public static final rz31 i;
    public static final rz31 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rz31(i2, (byte) 0);
        c = new rz31(i2, (byte) 1);
        d = new rz31(i2, (byte) 2);
        e = new rz31(i2, (byte) 3);
        f = new rz31(i2, (byte) 4);
        g = new rz31(i2, (byte) 5);
        h = new rz31(i2, (byte) 6);
        i = new rz31(i2, (byte) 7);
        t = new rz31(i2, (byte) 8);
        X = new rz31(i2, (byte) 9);
        Y = new rz31(i2, (byte) 10);
        Z = new rz31(i2, (byte) 11);
        N0 = new rz31(i2, (byte) 12);
        O0 = new rz31(i2, (byte) 13);
        P0 = new rz31(i2, (byte) 14);
        Q0 = new rz31(i2, (byte) 15);
        R0 = new rz31(i2, (byte) 16);
        S0 = new rz31(i2, (byte) 17);
        T0 = new rz31(i2, (byte) 18);
        U0 = new rz31(i2, (byte) 19);
        V0 = new rz31(i2, (byte) 20);
        W0 = new rz31(i2, (byte) 21);
        X0 = new rz31(i2, (byte) 22);
        Y0 = new rz31(i2, (byte) 23);
        Z0 = new rz31(i2, (byte) 24);
        a1 = new rz31(i2, (byte) 25);
        b1 = new rz31(i2, (byte) 26);
        c1 = new rz31(i2, (byte) 27);
        d1 = new rz31(i2, (byte) 28);
        e1 = new rz31(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rz31(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                u771 u771Var = ((g271) obj).a;
                return new nz31(u771Var.a.a.a, u771Var.b().a);
            case 1:
                lsl lslVar = (lsl) obj;
                if (lslVar.getLayoutDirection() == flb0.b) {
                    long jG1 = lslVar.g1();
                    cab cabVarA1 = lslVar.a1();
                    long jU = cabVarA1.u();
                    cabVarA1.p().q();
                    try {
                        ((dg8) cabVarA1.b).t(-1.0f, 1.0f, jG1);
                        lslVar.s1();
                    } finally {
                        i3a.n(cabVarA1, jU);
                    }
                } else {
                    lslVar.s1();
                }
                return rih1.a;
            case 2:
                return ((ho70) obj).a;
            case 3:
                return j82.C();
            case 4:
                return (String) obj;
            case 5:
                return (qtt0) obj;
            case 6:
                return ((p541) obj).a;
            case 7:
                return ((p541) obj).a;
            case 8:
                return ((p541) obj).a;
            case 9:
                return ((p541) obj).a;
            case 10:
                return ((p541) obj).a;
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (d7u0) obj;
            case 12:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 16:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 18:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 20:
                if (!(obj instanceof qtt0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qtt0) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 24:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 26:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 28:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
        }
    }
}
