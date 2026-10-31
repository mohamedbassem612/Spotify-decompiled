package p;

import android.os.Bundle;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hxj0 extends hab0 implements iu30 {
    public static final hxj0 N0;
    public static final hxj0 O0;
    public static final hxj0 P0;
    public static final hxj0 Q0;
    public static final hxj0 R0;
    public static final hxj0 S0;
    public static final hxj0 T0;
    public static final hxj0 U0;
    public static final hxj0 V0;
    public static final hxj0 W0;
    public static final hxj0 X;
    public static final hxj0 X0;
    public static final hxj0 Y;
    public static final hxj0 Y0;
    public static final hxj0 Z;
    public static final hxj0 Z0;
    public static final hxj0 a1;
    public static final hxj0 b;
    public static final hxj0 b1;
    public static final hxj0 c;
    public static final hxj0 c1;
    public static final hxj0 d;
    public static final hxj0 d1;
    public static final hxj0 e;
    public static final hxj0 e1;
    public static final hxj0 f;
    public static final hxj0 g;
    public static final hxj0 h;
    public static final hxj0 i;
    public static final hxj0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new hxj0(i2, (byte) 0);
        c = new hxj0(i2, (byte) 1);
        d = new hxj0(i2, (byte) 2);
        e = new hxj0(i2, (byte) 3);
        f = new hxj0(i2, (byte) 4);
        g = new hxj0(i2, (byte) 5);
        h = new hxj0(i2, (byte) 6);
        i = new hxj0(i2, (byte) 7);
        t = new hxj0(i2, (byte) 8);
        X = new hxj0(i2, (byte) 9);
        Y = new hxj0(i2, (byte) 10);
        Z = new hxj0(i2, (byte) 11);
        N0 = new hxj0(i2, (byte) 12);
        O0 = new hxj0(i2, (byte) 13);
        P0 = new hxj0(i2, (byte) 14);
        Q0 = new hxj0(i2, (byte) 15);
        R0 = new hxj0(i2, (byte) 16);
        S0 = new hxj0(i2, (byte) 17);
        T0 = new hxj0(i2, (byte) 18);
        U0 = new hxj0(i2, (byte) 19);
        V0 = new hxj0(i2, (byte) 20);
        W0 = new hxj0(i2, (byte) 21);
        X0 = new hxj0(i2, (byte) 22);
        Y0 = new hxj0(i2, (byte) 23);
        Z0 = new hxj0(i2, (byte) 24);
        a1 = new hxj0(i2, (byte) 25);
        b1 = new hxj0(i2, (byte) 26);
        c1 = new hxj0(i2, (byte) 27);
        d1 = new hxj0(i2, (byte) 28);
        e1 = new hxj0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxj0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        zuc0 zuc0Var;
        Map map;
        String str;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        Float fB0 = null;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 1:
                return Boolean.valueOf(obj instanceof qxc0);
            case 2:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 3:
                Bundle bundle = new Bundle();
                bundle.putParcelable("mobius_model_key", (kak0) obj);
                return bundle;
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                return new d0l0((i3l0) obj);
            case 7:
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("mobius_model_key", (s5k0) obj);
                return bundle2;
            case 8:
                return new p6k0((o6k0) obj, false);
            case 9:
                return rih1Var;
            case 10:
                return "mixing-tools";
            case 11:
                return "type";
            case 12:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 14:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 16:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 18:
                return Boolean.valueOf(obj instanceof qxc0);
            case 19:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 20:
                return "mixing-tools";
            case 21:
                return "type";
            case 22:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 24:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 26:
                return Boolean.valueOf(obj instanceof qxc0);
            case 27:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 28:
                j7e0 j7e0Var = ((hwq) obj).g;
                String uri = j7e0Var.getUri();
                j7e0 j7e0Var2 = j7e0Var instanceof j7e0 ? j7e0Var : null;
                if (j7e0Var2 != null && (zuc0Var = j7e0Var2.a) != null && (map = zuc0Var.g) != null && (str = (String) map.get("item.speed")) != null) {
                    fB0 = nhc1.b0(str);
                }
                return new r7k0(uri, fB0);
            default:
                return new s7k0(null, null, (r7k0) obj, null, null, false, true, 0);
        }
    }
}
