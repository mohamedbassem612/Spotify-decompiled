package p;

import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zr70 extends hab0 implements iu30 {
    public static final zr70 N0;
    public static final zr70 O0;
    public static final zr70 P0;
    public static final zr70 Q0;
    public static final zr70 R0;
    public static final zr70 S0;
    public static final zr70 T0;
    public static final zr70 U0;
    public static final zr70 V0;
    public static final zr70 W0;
    public static final zr70 X;
    public static final zr70 X0;
    public static final zr70 Y;
    public static final zr70 Y0;
    public static final zr70 Z;
    public static final zr70 Z0;
    public static final zr70 a1;
    public static final zr70 b;
    public static final zr70 b1;
    public static final zr70 c;
    public static final zr70 c1;
    public static final zr70 d;
    public static final zr70 d1;
    public static final zr70 e;
    public static final zr70 e1;
    public static final zr70 f;
    public static final zr70 g;
    public static final zr70 h;
    public static final zr70 i;
    public static final zr70 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new zr70(i2, (byte) 0);
        c = new zr70(i2, (byte) 1);
        d = new zr70(i2, (byte) 2);
        e = new zr70(i2, (byte) 3);
        f = new zr70(i2, (byte) 4);
        g = new zr70(i2, (byte) 5);
        h = new zr70(i2, (byte) 6);
        i = new zr70(i2, (byte) 7);
        t = new zr70(i2, (byte) 8);
        X = new zr70(i2, (byte) 9);
        Y = new zr70(i2, (byte) 10);
        Z = new zr70(i2, (byte) 11);
        N0 = new zr70(i2, (byte) 12);
        O0 = new zr70(i2, (byte) 13);
        P0 = new zr70(i2, (byte) 14);
        Q0 = new zr70(i2, (byte) 15);
        R0 = new zr70(i2, (byte) 16);
        S0 = new zr70(i2, (byte) 17);
        T0 = new zr70(i2, (byte) 18);
        U0 = new zr70(i2, (byte) 19);
        V0 = new zr70(i2, (byte) 20);
        W0 = new zr70(i2, (byte) 21);
        X0 = new zr70(i2, (byte) 22);
        Y0 = new zr70(i2, (byte) 23);
        Z0 = new zr70(i2, (byte) 24);
        a1 = new zr70(i2, (byte) 25);
        b1 = new zr70(i2, (byte) 26);
        c1 = new zr70(i2, (byte) 27);
        d1 = new zr70(i2, (byte) 28);
        e1 = new zr70(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zr70(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                xr70 xr70Var = (xr70) obj;
                return new yr70(xr70Var.a, xr70Var.b, xr70Var.c, xr70Var.d, xr70Var.e, xr70Var.f, xr70Var.g, true, xr70Var.h);
            case 1:
                return mno1.h(new mmr0[]{new mmr0("parcelable", (Parcelable) obj)});
            case 2:
                ((xas) obj).a(c, g070.e);
                return rih1Var;
            case 3:
                ys70 ys70Var = (ys70) obj;
                String str = ys70Var.a;
                ArrayList arrayList = ys70Var.b;
                int i2 = ys70Var.c;
                xfh0 xfh0Var = (xfh0) o7h.t0(i2, arrayList);
                String str2 = xfh0Var != null ? xfh0Var.f : null;
                if (str2 == null) {
                    str2 = "";
                }
                return new zs70(str, arrayList, i2, str2, null, ys70Var.e, true, true);
            case 4:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                xid.r(dhlVar.d, ihlVar.d, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.f, 0.0f, 6);
                return rih1Var;
            case 5:
                dhl dhlVar2 = (dhl) obj;
                ube ubeVar2 = dhlVar2.g;
                ihl ihlVar2 = dhlVar2.c;
                yf.p(ubeVar2, ihlVar2.g, 0.0f, 6);
                xid.r(dhlVar2.d, ihlVar2.d, 0.0f, 6);
                xid.r(dhlVar2.f, ihlVar2.f, 0.0f, 6);
                return rih1Var;
            case 6:
                return ((mu70) obj).a;
            case 7:
                String str3 = ((mu70) obj).a;
                Set set = s4b1.f;
                if (uic.g(str3, blc0.fh)) {
                    return str3;
                }
                return null;
            case 8:
                return ((mu70) obj).a;
            case 9:
                String str4 = ((mu70) obj).a;
                Set set2 = alk1.a;
                return ihc1.Y0(str4, '?');
            case 10:
                mu70 mu70Var = (mu70) obj;
                String str5 = mu70Var.a;
                if (!mu70Var.g) {
                    return null;
                }
                Set set3 = s4b1.f;
                if (uic.g(str5, blc0.fh)) {
                    return str5;
                }
                return null;
            case 11:
                mu70 mu70Var2 = (mu70) obj;
                String str6 = mu70Var2.a;
                if (mu70Var2.j) {
                    return str6;
                }
                return null;
            case 12:
                return ((mu70) obj).a;
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (m1b1) obj;
            case 14:
                if (!(obj instanceof w281) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 16:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 18:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 20:
                if (!(obj instanceof l98) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l98) obj;
            case 22:
                if (!(obj instanceof m1b1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf(obj instanceof gw81);
            case 24:
                if (obj != null) {
                    return (gw81) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.simplecardtrait.SimpleCardTrait");
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                hv70 hv70Var = (hv70) obj;
                String str7 = hv70Var.a;
                List<String> list = hv70Var.c;
                ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                for (String str8 : list) {
                    arrayList2.add(new lv70(str7));
                }
                return new pmb1(str7, arrayList2, hv70Var.b);
            case 26:
                return ((kv70) obj).a;
            case 27:
                kv70 kv70Var = (kv70) obj;
                return xcg1.i(kv70Var.b, "-", kv70Var.a.a);
            case 28:
                return new b491(i491.c);
            default:
                return ((lv70) obj).a;
        }
    }
}
