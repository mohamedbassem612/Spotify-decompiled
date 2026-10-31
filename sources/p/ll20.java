package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ll20 extends hab0 implements iu30 {
    public static final ll20 N0;
    public static final ll20 O0;
    public static final ll20 P0;
    public static final ll20 Q0;
    public static final ll20 R0;
    public static final ll20 S0;
    public static final ll20 T0;
    public static final ll20 U0;
    public static final ll20 V0;
    public static final ll20 W0;
    public static final ll20 X;
    public static final ll20 X0;
    public static final ll20 Y;
    public static final ll20 Y0;
    public static final ll20 Z;
    public static final ll20 Z0;
    public static final ll20 a1;
    public static final ll20 b;
    public static final ll20 b1;
    public static final ll20 c;
    public static final ll20 c1;
    public static final ll20 d;
    public static final ll20 d1;
    public static final ll20 e;
    public static final ll20 e1;
    public static final ll20 f;
    public static final ll20 g;
    public static final ll20 h;
    public static final ll20 i;
    public static final ll20 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ll20(i2, (byte) 0);
        c = new ll20(i2, (byte) 1);
        d = new ll20(i2, (byte) 2);
        e = new ll20(i2, (byte) 3);
        f = new ll20(i2, (byte) 4);
        g = new ll20(i2, (byte) 5);
        h = new ll20(i2, (byte) 6);
        i = new ll20(i2, (byte) 7);
        t = new ll20(i2, (byte) 8);
        X = new ll20(i2, (byte) 9);
        Y = new ll20(i2, (byte) 10);
        Z = new ll20(i2, (byte) 11);
        N0 = new ll20(i2, (byte) 12);
        O0 = new ll20(i2, (byte) 13);
        P0 = new ll20(i2, (byte) 14);
        Q0 = new ll20(i2, (byte) 15);
        R0 = new ll20(i2, (byte) 16);
        S0 = new ll20(i2, (byte) 17);
        T0 = new ll20(i2, (byte) 18);
        U0 = new ll20(i2, (byte) 19);
        V0 = new ll20(i2, (byte) 20);
        W0 = new ll20(i2, (byte) 21);
        X0 = new ll20(i2, (byte) 22);
        Y0 = new ll20(i2, (byte) 23);
        Z0 = new ll20(i2, (byte) 24);
        a1 = new ll20(i2, (byte) 25);
        b1 = new ll20(i2, (byte) 26);
        c1 = new ll20(i2, (byte) 27);
        d1 = new ll20(i2, (byte) 28);
        e1 = new ll20(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll20(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (zoy0) obj;
            case 1:
                if (!(obj instanceof ldj1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                return Boolean.valueOf(obj instanceof jo70);
            case 3:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 4:
                if (((dm20) obj).c == kl20.t) {
                    return "obfuscate-restricted-tracks";
                }
                return null;
            case 5:
                dm20 dm20Var = (dm20) obj;
                String str = dm20Var.a;
                if (dm20Var.c.g) {
                    return str;
                }
                return null;
            case 6:
                return ((dm20) obj).b;
            case 7:
                return ((dm20) obj).b;
            case 8:
                dm20 dm20Var2 = (dm20) obj;
                String str2 = dm20Var2.b;
                if (dm20Var2.c.d || dm20Var2.e.a != 1) {
                    return str2;
                }
                return null;
            case 9:
                dm20 dm20Var3 = (dm20) obj;
                String str3 = dm20Var3.b;
                hn21 hn21Var = dm20Var3.d;
                if (hn21Var.a != 0 || hn21Var.b || hn21Var.c) {
                    return str3;
                }
                return null;
            case 10:
                dm20 dm20Var4 = (dm20) obj;
                String str4 = dm20Var4.b;
                if (dm20Var4.c.e) {
                    return str4;
                }
                return null;
            case 11:
                dm20 dm20Var5 = (dm20) obj;
                String str5 = dm20Var5.b;
                if (dm20Var5.e.a == 1 || dm20Var5.i.a) {
                    return null;
                }
                return str5;
            case 12:
                dm20 dm20Var6 = (dm20) obj;
                String str6 = dm20Var6.b;
                if (dm20Var6.i.a) {
                    return str6;
                }
                return null;
            case 13:
                if (((dm20) obj).c.a) {
                    return "streaming-rules";
                }
                return null;
            case 14:
                if (((dm20) obj).c.g) {
                    return "filter-age-restricted-content";
                }
                return null;
            case 15:
                return Boolean.valueOf(obj instanceof t351);
            case 16:
                if (obj != null) {
                    return (t351) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.searchgenremetadata.SearchGenreMetadata");
                return null;
            case 17:
                return ((dm20) obj).a;
            case 18:
                return new q4r((jo70) null, (xkk1) null, (hll) null, (a7q0) null, (zoy0) null, (ldj1) null, (mtl) null, (String) null, (String) null, (String) null, (vnb1) null, false, (t351) obj, (qfd) null);
            case 19:
                return (tm20) obj;
            case 20:
                return (nnp0) obj;
            case 21:
                return Integer.valueOf(((nnp0) obj).a);
            case 22:
                ((Number) obj).intValue();
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return ((jvb1) obj).a;
            case 24:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return rih1Var;
            case 26:
                Object obj2 = ((e331) obj).a;
                return rih1Var;
            case 27:
                u7h u7hVar = (u7h) lcc.z((j4k) obj, py20.a);
                long j = u7hVar.a;
                return u7hVar;
            case 28:
                return new r2l0((i3l0) obj);
            default:
                return new r2l0((i3l0) obj);
        }
    }
}
