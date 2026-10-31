package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yoy extends hab0 implements iu30 {
    public static final yoy N0;
    public static final yoy O0;
    public static final yoy P0;
    public static final yoy Q0;
    public static final yoy R0;
    public static final yoy S0;
    public static final yoy T0;
    public static final yoy U0;
    public static final yoy V0;
    public static final yoy W0;
    public static final yoy X;
    public static final yoy X0;
    public static final yoy Y;
    public static final yoy Y0;
    public static final yoy Z;
    public static final yoy Z0;
    public static final yoy a1;
    public static final yoy b;
    public static final yoy b1;
    public static final yoy c;
    public static final yoy c1;
    public static final yoy d;
    public static final yoy d1;
    public static final yoy e;
    public static final yoy e1;
    public static final yoy f;
    public static final yoy g;
    public static final yoy h;
    public static final yoy i;
    public static final yoy t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new yoy(i2, (byte) 0);
        c = new yoy(i2, (byte) 1);
        d = new yoy(i2, (byte) 2);
        e = new yoy(i2, (byte) 3);
        f = new yoy(i2, (byte) 4);
        g = new yoy(i2, (byte) 5);
        h = new yoy(i2, (byte) 6);
        i = new yoy(i2, (byte) 7);
        t = new yoy(i2, (byte) 8);
        X = new yoy(i2, (byte) 9);
        Y = new yoy(i2, (byte) 10);
        Z = new yoy(i2, (byte) 11);
        N0 = new yoy(i2, (byte) 12);
        O0 = new yoy(i2, (byte) 13);
        P0 = new yoy(i2, (byte) 14);
        Q0 = new yoy(i2, (byte) 15);
        R0 = new yoy(i2, (byte) 16);
        S0 = new yoy(i2, (byte) 17);
        T0 = new yoy(i2, (byte) 18);
        U0 = new yoy(i2, (byte) 19);
        V0 = new yoy(i2, (byte) 20);
        W0 = new yoy(i2, (byte) 21);
        X0 = new yoy(i2, (byte) 22);
        Y0 = new yoy(i2, (byte) 23);
        Z0 = new yoy(i2, (byte) 24);
        a1 = new yoy(i2, (byte) 25);
        b1 = new yoy(i2, (byte) 26);
        c1 = new yoy(i2, (byte) 27);
        d1 = new yoy(i2, (byte) 28);
        e1 = new yoy(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yoy(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof lhe0);
            case 1:
                if (obj != null) {
                    return (lhe0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertlocation.Location");
                return null;
            case 2:
                return rih1Var;
            case 3:
                return new loa0(((opy) obj).a);
            case 4:
                return rih1Var;
            case 5:
                return ((opy) obj).a;
            case 6:
                return rih1Var;
            case 7:
                if (((opy) obj).b) {
                    return rih1Var;
                }
                return null;
            case 8:
                opy opyVar = (opy) obj;
                String str = opyVar.a;
                if (opyVar.b) {
                    return str;
                }
                return null;
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (gz51) obj;
            case 10:
                if (!(obj instanceof u061) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 11:
                if (obj instanceof rih1) {
                    return null;
                }
                return (u061) obj;
            case 12:
                if (!(obj instanceof cob1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (cob1) obj;
            case 14:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 16:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 18:
                if (!(obj instanceof mum1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mum1) obj;
            case 20:
                if (!(obj instanceof gz51) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                return (String) obj;
            case 22:
                jo70 jo70Var = (jo70) obj;
                if (jo70Var != null) {
                    return jo70Var.a;
                }
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                y2 y2Var = (y2) obj;
                return new s3(y2Var.a, y2Var.b);
            case 24:
                return new wcm((String) obj, (String) null, (String) null, (ucm) null, (Function0) null, oxx.t, false, (String) null, (String) null, 990);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new uho((String) obj, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254);
            case 26:
                return new xq30(((uq30) obj).a);
            case 27:
                return new jou0((String) obj);
            case 28:
                return new n0q0((String) obj, l0q0.d);
            default:
                return new py61((String) obj);
        }
    }
}
