package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class di0 extends hab0 implements iu30 {
    public static final di0 N0;
    public static final di0 O0;
    public static final di0 P0;
    public static final di0 Q0;
    public static final di0 R0;
    public static final di0 S0;
    public static final di0 T0;
    public static final di0 U0;
    public static final di0 V0;
    public static final di0 W0;
    public static final di0 X;
    public static final di0 X0;
    public static final di0 Y;
    public static final di0 Y0;
    public static final di0 Z;
    public static final di0 Z0;
    public static final di0 a1;
    public static final di0 b;
    public static final di0 b1;
    public static final di0 c;
    public static final di0 c1;
    public static final di0 d;
    public static final di0 d1;
    public static final di0 e;
    public static final di0 e1;
    public static final di0 f;
    public static final di0 g;
    public static final di0 h;
    public static final di0 i;
    public static final di0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new di0(i2, (byte) 0);
        c = new di0(i2, (byte) 1);
        d = new di0(i2, (byte) 2);
        e = new di0(i2, (byte) 3);
        f = new di0(i2, (byte) 4);
        g = new di0(i2, (byte) 5);
        h = new di0(i2, (byte) 6);
        i = new di0(i2, (byte) 7);
        t = new di0(i2, (byte) 8);
        X = new di0(i2, (byte) 9);
        Y = new di0(i2, (byte) 10);
        Z = new di0(i2, (byte) 11);
        N0 = new di0(i2, (byte) 12);
        O0 = new di0(i2, (byte) 13);
        P0 = new di0(i2, (byte) 14);
        Q0 = new di0(i2, (byte) 15);
        R0 = new di0(i2, (byte) 16);
        S0 = new di0(i2, (byte) 17);
        T0 = new di0(i2, (byte) 18);
        U0 = new di0(i2, (byte) 19);
        V0 = new di0(i2, (byte) 20);
        W0 = new di0(i2, (byte) 21);
        X0 = new di0(i2, (byte) 22);
        Y0 = new di0(i2, (byte) 23);
        Z0 = new di0(i2, (byte) 24);
        a1 = new di0(i2, (byte) 25);
        b1 = new di0(i2, (byte) 26);
        c1 = new di0(i2, (byte) 27);
        d1 = new di0(i2, (byte) 28);
        e1 = new di0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        mmr0 mmr0Var;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new ret0(((uv11) obj).a, 1);
            case 1:
                pk0 pk0Var = (pk0) obj;
                return new rk0(pk0Var.a, pk0Var.b, pk0Var.c, pk0Var.e, new gax(2131961690, (String) null));
            case 2:
                List<xk0> list = ((jk40) obj).a;
                if (list == null) {
                    return new ht61(2131961689, 0);
                }
                ArrayList arrayList = new ArrayList();
                for (xk0 xk0Var : list) {
                    String str = xk0Var.a;
                    if (str != null) {
                        String str2 = xk0Var.b;
                        mmr0Var = new mmr0(str, u890.j(str2, "INTEREST_LEVEL_SEE_MORE") ? bl0.b : u890.j(str2, "INTEREST_LEVEL_SEE_LESS") ? bl0.c : bl0.a);
                    } else {
                        mmr0Var = null;
                    }
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                return new it61(sqg0.T(arrayList));
            case 3:
                return Boolean.valueOf(u890.j(((jk40) obj).b, Boolean.TRUE));
            case 4:
                tl0 tl0Var = (tl0) obj;
                return new ul0(tl0Var.a, tl0Var.b, tl0Var.c, (Boolean) null, (Boolean) null, jmo1.f(new lax[]{tl0Var.d, new gax(2131961690, (String) null)}));
            case 5:
                return new fm0(false);
            case 6:
                return new fm0(false);
            case 7:
                return mm0.a;
            case 8:
                return new um0(false, false);
            case 9:
                return new eq0("", false);
            case 10:
                return new sm0("");
            case 11:
                return (sm0) obj;
            case 12:
                return null;
            case 13:
                b261.c((e261) obj);
                return rih1Var;
            case 14:
                return new zq0((ki0) null, (String) null, true, (String) null, (String) null, (i6h1) null);
            case 15:
                return new ugc1(poo1.H((PlayerState) obj, "advertiser"));
            case 16:
                return poo1.H((PlayerState) obj, "click_url");
            case 17:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                DrawScope.S0(lslVar, eu0.a, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return rih1Var;
            case 18:
                return new ept0("", false, (ipt0) null, 60);
            case 19:
                return new ept0("", false, (ipt0) null, 60);
            case 20:
                return new jw0((iw0) obj, false);
            case 21:
                return new nw0("", true);
            case 22:
                return new nw0("", true);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new sw0("", true);
            case 24:
                return new sw0("", true);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return rc2.a;
            case 26:
                return (j691) obj;
            case 27:
                return new t691("", true, new fvf1(0L, 0L));
            case 28:
                return new t691("", true, new fvf1(0L, 0L));
            default:
                return (t691) obj;
        }
    }
}
