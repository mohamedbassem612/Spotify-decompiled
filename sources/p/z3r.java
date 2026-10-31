package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z3r extends hab0 implements iu30 {
    public static final z3r N0;
    public static final z3r O0;
    public static final z3r P0;
    public static final z3r Q0;
    public static final z3r R0;
    public static final z3r S0;
    public static final z3r T0;
    public static final z3r U0;
    public static final z3r V0;
    public static final z3r W0;
    public static final z3r X;
    public static final z3r X0;
    public static final z3r Y;
    public static final z3r Y0;
    public static final z3r Z;
    public static final z3r Z0;
    public static final z3r a1;
    public static final z3r b;
    public static final z3r b1;
    public static final z3r c;
    public static final z3r c1;
    public static final z3r d;
    public static final z3r d1;
    public static final z3r e;
    public static final z3r e1;
    public static final z3r f;
    public static final z3r g;
    public static final z3r h;
    public static final z3r i;
    public static final z3r t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new z3r(i2, (byte) 0);
        c = new z3r(i2, (byte) 1);
        d = new z3r(i2, (byte) 2);
        e = new z3r(i2, (byte) 3);
        f = new z3r(i2, (byte) 4);
        g = new z3r(i2, (byte) 5);
        h = new z3r(i2, (byte) 6);
        i = new z3r(i2, (byte) 7);
        t = new z3r(i2, (byte) 8);
        X = new z3r(i2, (byte) 9);
        Y = new z3r(i2, (byte) 10);
        Z = new z3r(i2, (byte) 11);
        N0 = new z3r(i2, (byte) 12);
        O0 = new z3r(i2, (byte) 13);
        P0 = new z3r(i2, (byte) 14);
        Q0 = new z3r(i2, (byte) 15);
        R0 = new z3r(i2, (byte) 16);
        S0 = new z3r(i2, (byte) 17);
        T0 = new z3r(i2, (byte) 18);
        U0 = new z3r(i2, (byte) 19);
        V0 = new z3r(i2, (byte) 20);
        W0 = new z3r(i2, (byte) 21);
        X0 = new z3r(i2, (byte) 22);
        Y0 = new z3r(i2, (byte) 23);
        Z0 = new z3r(i2, (byte) 24);
        a1 = new z3r(i2, (byte) 25);
        b1 = new z3r(i2, (byte) 26);
        c1 = new z3r(i2, (byte) 27);
        d1 = new z3r(i2, (byte) 28);
        e1 = new z3r(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z3r(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return ((uv11) obj).a;
            case 1:
                return ((uv11) obj).a;
            case 2:
                return ((uv11) obj).a;
            case 3:
                return new a2v(((uv11) obj).a, 1);
            case 4:
                return ((uv11) obj).a;
            case 5:
                return ((uv11) obj).a;
            case 6:
                return rih1Var;
            case 7:
                return ((uv11) obj).a;
            case 8:
                return ((uv11) obj).a;
            case 9:
                return ((uv11) obj).a;
            case 10:
                return ((uv11) obj).a;
            case 11:
                o3r o3rVar = e4r.a;
                Set set = s4b1.f;
                if (uic.h(((uv11) obj).b, blc0.ti, blc0.ui)) {
                    return "type";
                }
                return null;
            case 12:
                o3r o3rVar2 = e4r.a;
                Set set2 = s4b1.f;
                if (uic.h(((uv11) obj).b, blc0.ti, blc0.ui)) {
                    return "pick-and-shuffle";
                }
                return null;
            case 13:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 15:
                return Boolean.valueOf((obj instanceof mtl) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 17:
                return ((uv11) obj).a;
            case 18:
                return ((uv11) obj).a;
            case 19:
                return ((ho70) obj).a;
            case 20:
                return Boolean.valueOf((obj instanceof cob1) || (obj instanceof rih1));
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 22:
                uv11 uv11Var = (uv11) obj;
                String str = uv11Var.d;
                String str2 = uv11Var.b;
                if (str == null) {
                    str = "";
                }
                return new noa0(str2, uv11Var.a, str);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                cob1 cob1Var = (cob1) obj;
                if (cob1Var == null) {
                    return null;
                }
                o3r o3rVar3 = e4r.a;
                int iOrdinal = cob1Var.ordinal();
                if (iOrdinal == 0) {
                    return rrt0.b;
                }
                if (iOrdinal == 1) {
                    return rrt0.c;
                }
                if (iOrdinal == 2) {
                    return rrt0.a;
                }
                eg.o();
                return null;
            case 24:
                return Boolean.valueOf((obj instanceof h2v) || (obj instanceof rih1));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (h2v) obj;
            case 26:
                return Boolean.valueOf((obj instanceof uwz0) || (obj instanceof rih1));
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (uwz0) obj;
            case 28:
                return new a2v(((uv11) obj).a, 1);
            default:
                return rih1Var;
        }
    }
}
