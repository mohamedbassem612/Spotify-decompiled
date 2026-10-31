package p;

import android.os.Bundle;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z860 extends hab0 implements iu30 {
    public static final z860 N0;
    public static final z860 O0;
    public static final z860 P0;
    public static final z860 Q0;
    public static final z860 R0;
    public static final z860 S0;
    public static final z860 T0;
    public static final z860 U0;
    public static final z860 V0;
    public static final z860 W0;
    public static final z860 X;
    public static final z860 X0;
    public static final z860 Y;
    public static final z860 Y0;
    public static final z860 Z;
    public static final z860 Z0;
    public static final z860 a1;
    public static final z860 b;
    public static final z860 b1;
    public static final z860 c;
    public static final z860 c1;
    public static final z860 d;
    public static final z860 d1;
    public static final z860 e;
    public static final z860 e1;
    public static final z860 f;
    public static final z860 g;
    public static final z860 h;
    public static final z860 i;
    public static final z860 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new z860(i2, (byte) 0);
        c = new z860(i2, (byte) 1);
        d = new z860(i2, (byte) 2);
        e = new z860(i2, (byte) 3);
        f = new z860(i2, (byte) 4);
        g = new z860(i2, (byte) 5);
        h = new z860(i2, (byte) 6);
        i = new z860(i2, (byte) 7);
        t = new z860(i2, (byte) 8);
        X = new z860(i2, (byte) 9);
        Y = new z860(i2, (byte) 10);
        Z = new z860(i2, (byte) 11);
        N0 = new z860(i2, (byte) 12);
        O0 = new z860(i2, (byte) 13);
        P0 = new z860(i2, (byte) 14);
        Q0 = new z860(i2, (byte) 15);
        R0 = new z860(i2, (byte) 16);
        S0 = new z860(i2, (byte) 17);
        T0 = new z860(i2, (byte) 18);
        U0 = new z860(i2, (byte) 19);
        V0 = new z860(i2, (byte) 20);
        W0 = new z860(i2, (byte) 21);
        X0 = new z860(i2, (byte) 22);
        Y0 = new z860(i2, (byte) 23);
        Z0 = new z860(i2, (byte) 24);
        a1 = new z860(i2, (byte) 25);
        b1 = new z860(i2, (byte) 26);
        c1 = new z860(i2, (byte) 27);
        d1 = new z860(i2, (byte) 28);
        e1 = new z860(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z860(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        z = true;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new n0l0((i3l0) obj);
            case 1:
                return rih1Var;
            case 2:
                b261.c((e261) obj);
                return rih1Var;
            case 3:
                return new ab60(ert0.a, (sa60) obj);
            case 4:
                return 2;
            case 5:
                b261.c((e261) obj);
                return rih1Var;
            case 6:
                b261.d((e261) obj);
                return rih1Var;
            case 7:
                return new nb60((mb60) obj, null);
            case 8:
                return mno1.h(new mmr0[]{new mmr0("focused_highlight_id", ((nb60) obj).b)});
            case 9:
                cmt cmtVar = new cmt(c471.a, 3);
                z6x z6xVar = z6x.a;
                return new nb60(new mb60(z6xVar, z6xVar, cmtVar, "listeningstats", "", ""), ((Bundle) obj).getString("focused_highlight_id"));
            case 10:
                b261.c((e261) obj);
                return rih1Var;
            case 11:
                return rih1Var;
            case 12:
                return new rd60((qd60) obj, false, false);
            case 13:
                return Integer.valueOf(((af) obj).a() ? 3 : 2);
            case 14:
                return rih1Var;
            case 15:
                return Integer.valueOf(((af) obj).a() ? 3 : 1);
            case 16:
                return Integer.valueOf(((af) obj).a() ? 3 : 2);
            case 17:
                return Integer.valueOf(((af) obj).a() ? 3 : 2);
            case 18:
                return epo1.I((te60) obj);
            case 19:
                return ((te60) obj).a;
            case 20:
                String str = ((te60) obj).a;
                Set set = alk1.a;
                return ihc1.Y0(str, '?');
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
                return Boolean.valueOf(obj instanceof gw81);
            case 24:
                if (obj != null) {
                    return (gw81) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.simplecardtrait.SimpleCardTrait");
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ue60 ue60Var = (ue60) obj;
                return new we60(ue60Var.a, ue60Var.b, ue60Var.c.size());
            case 26:
                return "promo-".concat(((kmx0) obj).a);
            case 27:
                return ((hd60) obj).a;
            case 28:
                return (qxc0) obj;
            default:
                return dh60.a;
        }
    }
}
