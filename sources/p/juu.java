package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class juu extends hab0 implements iu30 {
    public static final juu N0;
    public static final juu O0;
    public static final juu P0;
    public static final juu Q0;
    public static final juu R0;
    public static final juu S0;
    public static final juu T0;
    public static final juu U0;
    public static final juu V0;
    public static final juu W0;
    public static final juu X;
    public static final juu X0;
    public static final juu Y;
    public static final juu Y0;
    public static final juu Z;
    public static final juu Z0;
    public static final juu a1;
    public static final juu b;
    public static final juu b1;
    public static final juu c;
    public static final juu c1;
    public static final juu d;
    public static final juu d1;
    public static final juu e;
    public static final juu e1;
    public static final juu f;
    public static final juu g;
    public static final juu h;
    public static final juu i;
    public static final juu t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new juu(i2, (byte) 0);
        c = new juu(i2, (byte) 1);
        d = new juu(i2, (byte) 2);
        e = new juu(i2, (byte) 3);
        f = new juu(i2, (byte) 4);
        g = new juu(i2, (byte) 5);
        h = new juu(i2, (byte) 6);
        i = new juu(i2, (byte) 7);
        t = new juu(i2, (byte) 8);
        X = new juu(i2, (byte) 9);
        Y = new juu(i2, (byte) 10);
        Z = new juu(i2, (byte) 11);
        N0 = new juu(i2, (byte) 12);
        O0 = new juu(i2, (byte) 13);
        P0 = new juu(i2, (byte) 14);
        Q0 = new juu(i2, (byte) 15);
        R0 = new juu(i2, (byte) 16);
        S0 = new juu(i2, (byte) 17);
        T0 = new juu(i2, (byte) 18);
        U0 = new juu(i2, (byte) 19);
        V0 = new juu(i2, (byte) 20);
        W0 = new juu(i2, (byte) 21);
        X0 = new juu(i2, (byte) 22);
        Y0 = new juu(i2, (byte) 23);
        Z0 = new juu(i2, (byte) 24);
        a1 = new juu(i2, (byte) 25);
        b1 = new juu(i2, (byte) 26);
        c1 = new juu(i2, (byte) 27);
        d1 = new juu(i2, (byte) 28);
        e1 = new juu(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juu(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return rih1.a;
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (prl) obj;
            case 2:
                if (!(obj instanceof h2v) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case 4:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 6:
                if (!(obj instanceof l1z) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l1z) obj;
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
                if (!(obj instanceof prl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                return Boolean.valueOf(obj instanceof String);
            case 12:
                return (k1r) obj;
            case 13:
                return Boolean.valueOf(obj instanceof Integer);
            case 14:
                return (k1r) obj;
            case 15:
                return Boolean.valueOf(obj instanceof Boolean);
            case 16:
                return (k1r) obj;
            case 17:
                return Boolean.valueOf(obj instanceof gbl);
            case 18:
                return (k1r) obj;
            case 19:
                return ((znl) obj).b;
            case 20:
                return (evu) obj;
            case 21:
                return new hvu(new fvu("", (ai90) null, (fbp1) null, 30), false, false);
            case 22:
                return (String) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                g3v g3vVar = (g3v) obj;
                return g3vVar == null ? e3v.a : g3vVar;
            case 24:
                return ((fvu) obj).d.c();
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new g4d0((String) obj);
            case 26:
                return (g3d0) obj;
            case 27:
                if (!(obj instanceof g3v) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (g3v) obj;
            default:
                return Boolean.valueOf(obj instanceof g3d0);
        }
    }
}
