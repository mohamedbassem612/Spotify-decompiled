package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o6v extends hab0 implements iu30 {
    public static final o6v N0;
    public static final o6v O0;
    public static final o6v P0;
    public static final o6v Q0;
    public static final o6v R0;
    public static final o6v S0;
    public static final o6v T0;
    public static final o6v U0;
    public static final o6v V0;
    public static final o6v W0;
    public static final o6v X;
    public static final o6v X0;
    public static final o6v Y;
    public static final o6v Y0;
    public static final o6v Z;
    public static final o6v Z0;
    public static final o6v a1;
    public static final o6v b;
    public static final o6v b1;
    public static final o6v c;
    public static final o6v c1;
    public static final o6v d;
    public static final o6v d1;
    public static final o6v e;
    public static final o6v e1;
    public static final o6v f;
    public static final o6v g;
    public static final o6v h;
    public static final o6v i;
    public static final o6v t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new o6v(i2, (byte) 0);
        c = new o6v(i2, (byte) 1);
        d = new o6v(i2, (byte) 2);
        e = new o6v(i2, (byte) 3);
        f = new o6v(i2, (byte) 4);
        g = new o6v(i2, (byte) 5);
        h = new o6v(i2, (byte) 6);
        i = new o6v(i2, (byte) 7);
        t = new o6v(i2, (byte) 8);
        X = new o6v(i2, (byte) 9);
        Y = new o6v(i2, (byte) 10);
        Z = new o6v(i2, (byte) 11);
        N0 = new o6v(i2, (byte) 12);
        O0 = new o6v(i2, (byte) 13);
        P0 = new o6v(i2, (byte) 14);
        Q0 = new o6v(i2, (byte) 15);
        R0 = new o6v(i2, (byte) 16);
        S0 = new o6v(i2, (byte) 17);
        T0 = new o6v(i2, (byte) 18);
        U0 = new o6v(i2, (byte) 19);
        V0 = new o6v(i2, (byte) 20);
        W0 = new o6v(i2, (byte) 21);
        X0 = new o6v(i2, (byte) 22);
        Y0 = new o6v(i2, (byte) 23);
        Z0 = new o6v(i2, (byte) 24);
        a1 = new o6v(i2, (byte) 25);
        b1 = new o6v(i2, (byte) 26);
        c1 = new o6v(i2, (byte) 27);
        d1 = new o6v(i2, (byte) 28);
        e1 = new o6v(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6v(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        int i2 = 1;
        switch (b2) {
            case 0:
                return Float.valueOf(((Number) obj).floatValue() * 0.5f);
            case 1:
                b261.F((e261) obj, true);
                return rih1Var;
            case 2:
                return new ouc0((String) obj);
            case 3:
                return (Set) obj;
            case 4:
                return new g4d0((String) obj);
            case 5:
                return (g3d0) obj;
            case 6:
                return Boolean.valueOf(obj instanceof Set);
            case 7:
                if (obj != null) {
                    return (Set) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.Set<com.spotify.listplatform.endpoints.ListEndpoint.Configuration.Filter>");
                return null;
            case 8:
                return Boolean.valueOf(obj instanceof g3d0);
            case 9:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case 10:
                return (qxc0) obj;
            case 11:
                return new yev(2131953862, 2131953860, amx.c);
            case 12:
                return Boolean.valueOf(obj instanceof qxc0);
            case 13:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 14:
                return ((lfv) obj).a;
            case 15:
                return ((sfv) obj).a;
            case 16:
                iix0 iix0Var = (iix0) obj;
                return iix0Var == null ? new hix0(false, 0L) : iix0Var;
            case 17:
                iix0 iix0Var2 = (iix0) obj;
                return iix0Var2 == null ? new hix0(false, 0L) : iix0Var2;
            case 18:
                return Boolean.valueOf((obj instanceof iix0) || (obj instanceof rih1));
            case 19:
                return Boolean.valueOf((obj instanceof iix0) || (obj instanceof rih1));
            case 20:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (iix0) obj;
            case 22:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                dhl dhlVar = (dhl) obj;
                dhl.b(dhlVar, dhlVar.c);
                return rih1Var;
            case 24:
                dhl dhlVar2 = (dhl) obj;
                xid xidVar = dhlVar2.f;
                ihl ihlVar = dhlVar2.c;
                xid.r(xidVar, ihlVar.f, 0.0f, 6);
                yf.p(dhlVar2.e, ihlVar.e, 0.0f, 6);
                yf.p(dhlVar2.g, ihlVar.g, 0.0f, 6);
                dhlVar2.f(new e5u((p3v) null, "spread"));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return rih1Var;
            case 26:
                af afVar = (af) obj;
                if ((afVar.compareTo(af.d) > 0 || afVar.compareTo(af.a) < 0) && afVar.compareTo(af.i) <= 0 && afVar.compareTo(af.e) >= 0) {
                    i2 = 2;
                }
                return Integer.valueOf(i2);
            case 27:
                l0l l0lVar = (l0l) obj;
                return new mmr0(Boolean.valueOf(l0lVar.F()), Integer.valueOf(l0lVar.A()));
            case 28:
                vhv vhvVar = (vhv) obj;
                return new whv(vhvVar.a, b7x.a, vhvVar.c);
            default:
                return Boolean.valueOf(((Number) obj).intValue() > 0);
        }
    }
}
