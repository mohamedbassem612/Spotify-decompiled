package p;

import android.view.View;
import android.view.ViewStub;
import com.spotify.cosmos.util.proto.AlbumArtistMetadata;
import com.spotify.cosmos.util.proto.TrackArtistMetadata;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f9z extends hab0 implements iu30 {
    public static final f9z N0;
    public static final f9z O0;
    public static final f9z P0;
    public static final f9z Q0;
    public static final f9z R0;
    public static final f9z S0;
    public static final f9z T0;
    public static final f9z U0;
    public static final f9z V0;
    public static final f9z W0;
    public static final f9z X;
    public static final f9z X0;
    public static final f9z Y;
    public static final f9z Y0;
    public static final f9z Z;
    public static final f9z Z0;
    public static final f9z a1;
    public static final f9z b;
    public static final f9z b1;
    public static final f9z c;
    public static final f9z c1;
    public static final f9z d;
    public static final f9z d1;
    public static final f9z e;
    public static final f9z e1;
    public static final f9z f;
    public static final f9z g;
    public static final f9z h;
    public static final f9z i;
    public static final f9z t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new f9z(i2, (byte) 0);
        c = new f9z(i2, (byte) 1);
        d = new f9z(i2, (byte) 2);
        e = new f9z(i2, (byte) 3);
        f = new f9z(i2, (byte) 4);
        g = new f9z(i2, (byte) 5);
        h = new f9z(i2, (byte) 6);
        i = new f9z(i2, (byte) 7);
        t = new f9z(i2, (byte) 8);
        X = new f9z(i2, (byte) 9);
        Y = new f9z(i2, (byte) 10);
        Z = new f9z(i2, (byte) 11);
        N0 = new f9z(i2, (byte) 12);
        O0 = new f9z(i2, (byte) 13);
        P0 = new f9z(i2, (byte) 14);
        Q0 = new f9z(i2, (byte) 15);
        R0 = new f9z(i2, (byte) 16);
        S0 = new f9z(i2, (byte) 17);
        T0 = new f9z(i2, (byte) 18);
        U0 = new f9z(i2, (byte) 19);
        V0 = new f9z(i2, (byte) 20);
        W0 = new f9z(i2, (byte) 21);
        X0 = new f9z(i2, (byte) 22);
        Y0 = new f9z(i2, (byte) 23);
        Z0 = new f9z(i2, (byte) 24);
        a1 = new f9z(i2, (byte) 25);
        b1 = new f9z(i2, (byte) 26);
        c1 = new f9z(i2, (byte) 27);
        d1 = new f9z(i2, (byte) 28);
        e1 = new f9z(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9z(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        usp0 usp0Var;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 1:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 2:
                return ((uv11) obj).a;
            case 3:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 5:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 7:
                uv11 uv11Var = (uv11) obj;
                return new bio0(uv11Var.b, uv11Var.a, uv11Var.d);
            case 8:
                return ((uv11) obj).b;
            case 9:
                haz hazVar = (haz) obj;
                return new iaz(hazVar.a, hazVar.b, hazVar.c, hazVar.d, hazVar.e, hazVar.f, hazVar.j, hazVar.g, false, false, hazVar.i, hazVar.h, hazVar.k, false, 3, hazVar.l, hazVar.m, (Integer) null, hazVar.n);
            case 10:
                iaz iazVar = (iaz) obj;
                String str = iazVar.b;
                String str2 = iazVar.c;
                String str3 = iazVar.g;
                String str4 = iazVar.e;
                String str5 = iazVar.f;
                int i2 = iazVar.h;
                return new fbz(str, str2, str3, str4, oqn1.p(i2), o0c.F(i2, iazVar.i, iazVar.j), str5, iazVar.m, iazVar.n, iazVar.o, iazVar.p, iazVar.q, iazVar.s);
            case 11:
                return Boolean.valueOf(!(((View) obj) instanceof ViewStub));
            case 12:
                return ((ho70) obj).a;
            case 13:
                return Boolean.valueOf((obj instanceof mtl) || (obj instanceof rih1));
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 15:
                return Boolean.valueOf((obj instanceof Boolean) || (obj instanceof rih1));
            case 16:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 17:
                String uri = ((vhc1) obj).getUri();
                if (eqn1.N(uri)) {
                    return uri;
                }
                return null;
            case 18:
                return Boolean.valueOf((obj instanceof mtl) || (obj instanceof rih1));
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 20:
                return rih1Var;
            case 21:
                return rih1Var;
            case 22:
                return Boolean.valueOf(((zuc0) obj).b() == ltt0.b);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                zuc0 zuc0Var = (zuc0) obj;
                k1z k1zVar = zuc0Var.p;
                if (!(k1zVar instanceof k1z)) {
                    return null;
                }
                String str6 = zuc0Var.c;
                String str7 = zuc0Var.i;
                List listSingletonList = Collections.singletonList(zuc0Var.a(1));
                boolean zJ = u890.j(zuc0Var.n, iwp0.c);
                List listSingletonList2 = Collections.singletonList(tsp0.b);
                k1z k1zVar2 = k1zVar;
                int i3 = k1zVar2.h;
                String str8 = k1zVar2.n.b;
                Integer num = k1zVar2.i;
                int iIntValue = num != null ? num.intValue() : i3;
                try {
                    usp0Var = new usp0((i3 - iIntValue) / i3, iIntValue);
                } catch (Throwable unused) {
                    usp0Var = null;
                }
                Long l = k1zVar2.k;
                return new ssp0(str6, str7, listSingletonList, 4, zJ, (String) null, str8, 0, usp0Var, listSingletonList2, l != null ? l.longValue() : 0L, 2208);
            case 24:
                nwl0 nwl0Var = (nwl0) obj;
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL")), nwl0Var.a, nwl0Var.b.b.b, System.currentTimeMillis());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                xfz xfzVar = (xfz) obj;
                return new igz(xfzVar.a, xfzVar.b, xfzVar.c);
            case 26:
                if (bgz.a[((hgz) obj).ordinal()] == 1) {
                    return wfz.a;
                }
                eg.o();
                return null;
            case 27:
                b261.c((e261) obj);
                return rih1Var;
            case 28:
                return ((AlbumArtistMetadata) obj).getName();
            default:
                return ((TrackArtistMetadata) obj).getName();
        }
    }
}
