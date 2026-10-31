package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j5w extends hab0 implements iu30 {
    public static final j5w N0;
    public static final j5w O0;
    public static final j5w P0;
    public static final j5w Q0;
    public static final j5w R0;
    public static final j5w S0;
    public static final j5w T0;
    public static final j5w U0;
    public static final j5w V0;
    public static final j5w W0;
    public static final j5w X;
    public static final j5w X0;
    public static final j5w Y;
    public static final j5w Y0;
    public static final j5w Z;
    public static final j5w Z0;
    public static final j5w a1;
    public static final j5w b;
    public static final j5w b1;
    public static final j5w c;
    public static final j5w c1;
    public static final j5w d;
    public static final j5w d1;
    public static final j5w e;
    public static final j5w e1;
    public static final j5w f;
    public static final j5w g;
    public static final j5w h;
    public static final j5w i;
    public static final j5w t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new j5w(i2, (byte) 0);
        c = new j5w(i2, (byte) 1);
        d = new j5w(i2, (byte) 2);
        e = new j5w(i2, (byte) 3);
        f = new j5w(i2, (byte) 4);
        g = new j5w(i2, (byte) 5);
        h = new j5w(i2, (byte) 6);
        i = new j5w(i2, (byte) 7);
        t = new j5w(i2, (byte) 8);
        X = new j5w(i2, (byte) 9);
        Y = new j5w(i2, (byte) 10);
        Z = new j5w(i2, (byte) 11);
        N0 = new j5w(i2, (byte) 12);
        O0 = new j5w(i2, (byte) 13);
        P0 = new j5w(i2, (byte) 14);
        Q0 = new j5w(i2, (byte) 15);
        R0 = new j5w(i2, (byte) 16);
        S0 = new j5w(i2, (byte) 17);
        T0 = new j5w(i2, (byte) 18);
        U0 = new j5w(i2, (byte) 19);
        V0 = new j5w(i2, (byte) 20);
        W0 = new j5w(i2, (byte) 21);
        X0 = new j5w(i2, (byte) 22);
        Y0 = new j5w(i2, (byte) 23);
        Z0 = new j5w(i2, (byte) 24);
        a1 = new j5w(i2, (byte) 25);
        b1 = new j5w(i2, (byte) 26);
        c1 = new j5w(i2, (byte) 27);
        d1 = new j5w(i2, (byte) 28);
        e1 = new j5w(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j5w(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return ((uv11) obj).a;
            case 1:
                return ((uv11) obj).a;
            case 2:
                return (String) obj;
            case 3:
                return (pnt) obj;
            case 4:
                if (!(obj instanceof pnt) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pnt) obj;
            case 6:
                return (String) obj;
            case 7:
                return (hzy) obj;
            case 8:
                return Boolean.valueOf(obj instanceof hzy);
            case 9:
                if (obj != null) {
                    return (hzy) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.entitytypetrait.EntityTypeTrait");
                return null;
            case 10:
                return h6w.t;
            case 11:
                x5w x5wVar = (x5w) obj;
                return new mqm(new jvm(x5wVar.b, x5wVar.a, (String) null), new lqm(Collections.singletonList(ovm.a), Collections.singletonList(cvm.b), (qle1) null, 4));
            case 12:
                return ((x5w) obj).b;
            case 13:
                return ((x5w) obj).b;
            case 14:
                return (String) obj;
            case 15:
                return (String) obj;
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 17:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 19:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 21:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                zwo0 zwo0Var = (zwo0) obj;
                return new x5w(zwo0Var.a, zwo0Var.b, zwo0Var.c, zwo0Var.d);
            case 27:
                return e7w.a;
            case 28:
                return new qvc0(((b7w) obj).a, (c3d0) null, (Set) null, (mqz0) null, 14);
            default:
                return (List) obj;
        }
    }
}
