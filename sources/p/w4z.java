package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w4z extends hab0 implements iu30 {
    public static final w4z N0;
    public static final w4z O0;
    public static final w4z P0;
    public static final w4z Q0;
    public static final w4z R0;
    public static final w4z S0;
    public static final w4z T0;
    public static final w4z U0;
    public static final w4z V0;
    public static final w4z W0;
    public static final w4z X;
    public static final w4z X0;
    public static final w4z Y;
    public static final w4z Y0;
    public static final w4z Z;
    public static final w4z Z0;
    public static final w4z a1;
    public static final w4z b;
    public static final w4z b1;
    public static final w4z c;
    public static final w4z c1;
    public static final w4z d;
    public static final w4z d1;
    public static final w4z e;
    public static final w4z e1;
    public static final w4z f;
    public static final w4z g;
    public static final w4z h;
    public static final w4z i;
    public static final w4z t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new w4z(i2, (byte) 0);
        c = new w4z(i2, (byte) 1);
        d = new w4z(i2, (byte) 2);
        e = new w4z(i2, (byte) 3);
        f = new w4z(i2, (byte) 4);
        g = new w4z(i2, (byte) 5);
        h = new w4z(i2, (byte) 6);
        i = new w4z(i2, (byte) 7);
        t = new w4z(i2, (byte) 8);
        X = new w4z(i2, (byte) 9);
        Y = new w4z(i2, (byte) 10);
        Z = new w4z(i2, (byte) 11);
        N0 = new w4z(i2, (byte) 12);
        O0 = new w4z(i2, (byte) 13);
        P0 = new w4z(i2, (byte) 14);
        Q0 = new w4z(i2, (byte) 15);
        R0 = new w4z(i2, (byte) 16);
        S0 = new w4z(i2, (byte) 17);
        T0 = new w4z(i2, (byte) 18);
        U0 = new w4z(i2, (byte) 19);
        V0 = new w4z(i2, (byte) 20);
        W0 = new w4z(i2, (byte) 21);
        X0 = new w4z(i2, (byte) 22);
        Y0 = new w4z(i2, (byte) 23);
        Z0 = new w4z(i2, (byte) 24);
        a1 = new w4z(i2, (byte) 25);
        b1 = new w4z(i2, (byte) 26);
        c1 = new w4z(i2, (byte) 27);
        d1 = new w4z(i2, (byte) 28);
        e1 = new w4z(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4z(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 1:
                if (!(obj instanceof zoy0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 3:
                return Boolean.valueOf(obj instanceof mdz);
            case 4:
                if (obj != null) {
                    return (mdz) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.episodev4.EpisodeV4");
                return null;
            case 5:
                Object objS0 = o7h.s0((List) obj);
                if (objS0 instanceof d7u0) {
                    return (d7u0) objS0;
                }
                return null;
            case 6:
                if (!(obj instanceof d7u0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (d7u0) obj;
            case 8:
                return (String) obj;
            case 9:
                return (Boolean) obj;
            case 10:
                return (String) obj;
            case 11:
                return (k1r) obj;
            case 12:
                return (String) obj;
            case 13:
                g3v g3vVar = (g3v) obj;
                return g3vVar == null ? e3v.a : g3vVar;
            case 14:
                return (String) obj;
            case 15:
                return (jo70) obj;
            case 16:
                return new rxc0((String) obj);
            case 17:
                return (qxc0) obj;
            case 18:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 20:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 22:
                if (!(obj instanceof g3v) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (g3v) obj;
            case 24:
                return Boolean.valueOf(obj instanceof qxc0);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof mtl);
            case 27:
                return (k1r) obj;
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (prl) obj;
            default:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
