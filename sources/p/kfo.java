package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kfo extends hab0 implements iu30 {
    public static final kfo N0;
    public static final kfo O0;
    public static final kfo P0;
    public static final kfo Q0;
    public static final kfo R0;
    public static final kfo S0;
    public static final kfo T0;
    public static final kfo U0;
    public static final kfo V0;
    public static final kfo W0;
    public static final kfo X;
    public static final kfo X0;
    public static final kfo Y;
    public static final kfo Y0;
    public static final kfo Z;
    public static final kfo Z0;
    public static final kfo a1;
    public static final kfo b;
    public static final kfo b1;
    public static final kfo c;
    public static final kfo c1;
    public static final kfo d;
    public static final kfo d1;
    public static final kfo e;
    public static final kfo e1;
    public static final kfo f;
    public static final kfo g;
    public static final kfo h;
    public static final kfo i;
    public static final kfo t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new kfo(i2, (byte) 0);
        c = new kfo(i2, (byte) 1);
        d = new kfo(i2, (byte) 2);
        e = new kfo(i2, (byte) 3);
        f = new kfo(i2, (byte) 4);
        g = new kfo(i2, (byte) 5);
        h = new kfo(i2, (byte) 6);
        i = new kfo(i2, (byte) 7);
        t = new kfo(i2, (byte) 8);
        X = new kfo(i2, (byte) 9);
        Y = new kfo(i2, (byte) 10);
        Z = new kfo(i2, (byte) 11);
        N0 = new kfo(i2, (byte) 12);
        O0 = new kfo(i2, (byte) 13);
        P0 = new kfo(i2, (byte) 14);
        Q0 = new kfo(i2, (byte) 15);
        R0 = new kfo(i2, (byte) 16);
        S0 = new kfo(i2, (byte) 17);
        T0 = new kfo(i2, (byte) 18);
        U0 = new kfo(i2, (byte) 19);
        V0 = new kfo(i2, (byte) 20);
        W0 = new kfo(i2, (byte) 21);
        X0 = new kfo(i2, (byte) 22);
        Y0 = new kfo(i2, (byte) 23);
        Z0 = new kfo(i2, (byte) 24);
        a1 = new kfo(i2, (byte) 25);
        b1 = new kfo(i2, (byte) 26);
        c1 = new kfo(i2, (byte) 27);
        d1 = new kfo(i2, (byte) 28);
        e1 = new kfo(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfo(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return (gfo) obj;
            case 1:
                return Boolean.valueOf(obj instanceof gfo);
            case 2:
                if (obj != null) {
                    return (gfo) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.culturalmoments.culturalmomentsscrollcarddataelement.CulturalMomentsData");
                return null;
            case 3:
                return ((wwo0) obj).a;
            case 4:
                g271 g271Var = (g271) obj;
                u771 u771Var = g271Var.a;
                jgo jgoVar = (jgo) u771Var.b();
                String str = jgoVar.a;
                xn10 xn10Var = jgoVar.e;
                String str2 = jgoVar.c;
                String str3 = jgoVar.d;
                int i2 = g271Var.c;
                llw0 llw0Var = jgoVar.f;
                t771 t771Var = u771Var.a;
                return new dgo(str, t771Var.a.a, str2, str3, llw0Var, i2, xn10Var, t771Var.b);
            case 5:
                return new v2l0((i3l0) obj);
            case 6:
                return ((uho) obj).a;
            case 7:
                return ((uho) obj).a;
            case 8:
                uho uhoVar = (uho) obj;
                if (uhoVar.h) {
                    return new rxc0(uhoVar.b);
                }
                return null;
            case 9:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 11:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 13:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 15:
                uho uhoVar2 = (uho) obj;
                return new vho(false, uhoVar2.a, false, uhoVar2.c, uhoVar2.d, uhoVar2.e, uhoVar2.f, 129);
            case 16:
                return ((rjo) obj).a;
            case 17:
                return "disable-blocked-content";
            case 18:
                if (!(obj instanceof vnb1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (vnb1) obj;
            case 20:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 22:
                return (String) obj;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return (vnb1) obj;
            case 24:
                return Boolean.valueOf(obj instanceof vnb1);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (obj != null) {
                    return (vnb1) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.curation.state.State");
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof uio);
            case 27:
                if (obj != null) {
                    return (uio) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.curationexperiencetrait.CurationExperienceTrait");
                return null;
            case 28:
                return (String) obj;
            default:
                return (uio) obj;
        }
    }
}
