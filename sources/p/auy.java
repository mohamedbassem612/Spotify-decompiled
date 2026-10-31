package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class auy extends hab0 implements iu30 {
    public static final auy N0;
    public static final auy O0;
    public static final auy P0;
    public static final auy Q0;
    public static final auy R0;
    public static final auy S0;
    public static final auy T0;
    public static final auy U0;
    public static final auy V0;
    public static final auy W0;
    public static final auy X;
    public static final auy X0;
    public static final auy Y;
    public static final auy Y0;
    public static final auy Z;
    public static final auy Z0;
    public static final auy a1;
    public static final auy b;
    public static final auy b1;
    public static final auy c;
    public static final auy c1;
    public static final auy d;
    public static final auy d1;
    public static final auy e;
    public static final auy e1;
    public static final auy f;
    public static final auy g;
    public static final auy h;
    public static final auy i;
    public static final auy t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new auy(i2, (byte) 0);
        c = new auy(i2, (byte) 1);
        d = new auy(i2, (byte) 2);
        e = new auy(i2, (byte) 3);
        f = new auy(i2, (byte) 4);
        g = new auy(i2, (byte) 5);
        h = new auy(i2, (byte) 6);
        i = new auy(i2, (byte) 7);
        t = new auy(i2, (byte) 8);
        X = new auy(i2, (byte) 9);
        Y = new auy(i2, (byte) 10);
        Z = new auy(i2, (byte) 11);
        N0 = new auy(i2, (byte) 12);
        O0 = new auy(i2, (byte) 13);
        P0 = new auy(i2, (byte) 14);
        Q0 = new auy(i2, (byte) 15);
        R0 = new auy(i2, (byte) 16);
        S0 = new auy(i2, (byte) 17);
        T0 = new auy(i2, (byte) 18);
        U0 = new auy(i2, (byte) 19);
        V0 = new auy(i2, (byte) 20);
        W0 = new auy(i2, (byte) 21);
        X0 = new auy(i2, (byte) 22);
        Y0 = new auy(i2, (byte) 23);
        Z0 = new auy(i2, (byte) 24);
        a1 = new auy(i2, (byte) 25);
        b1 = new auy(i2, (byte) 26);
        c1 = new auy(i2, (byte) 27);
        d1 = new auy(i2, (byte) 28);
        e1 = new auy(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ auy(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof List);
            case 1:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof qxc0);
            case 3:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 4:
                return new rxc0((String) obj);
            case 5:
                return (qxc0) obj;
            case 6:
                return new g4d0((String) obj);
            case 7:
                return (g3d0) obj;
            case 8:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 10:
                return Boolean.valueOf(obj instanceof g3d0);
            case 11:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 12:
                uv11 uv11Var = (uv11) obj;
                return new uho(uv11Var.a, uv11Var.b, (tho) null, (nho) null, (String) null, (Function0) null, 124);
            case 13:
                uv11 uv11Var2 = (uv11) obj;
                String str = uv11Var2.b;
                String str2 = uv11Var2.a;
                String str3 = uv11Var2.d;
                str3.getClass();
                return new o0q0(str, str2, 24, str3);
            case 14:
                return new py61(((uv11) obj).a);
            case 15:
                return new rxc0((String) obj);
            case 16:
                return (qxc0) obj;
            case 17:
                String uri = ((vhc1) obj).getUri();
                Set set = s4b1.f;
                if (uic.g(uri, blc0.ed)) {
                    return uri;
                }
                return null;
            case 18:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 20:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 22:
                return ((o3m0) obj).l();
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                twy twyVar = (twy) obj;
                return new xwy(twyVar.a, twyVar.b, twyVar.c, (wkt) null);
            case 24:
                g271 g271Var = (g271) obj;
                return new twy(g271Var.d, g271Var.a, g271Var.c);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return rih1Var;
            case 26:
                return rih1Var;
            case 27:
                return rih1Var;
            case 28:
                return rih1Var;
            default:
                return new mmr0(((vxy) obj).a, (Object) null);
        }
    }
}
