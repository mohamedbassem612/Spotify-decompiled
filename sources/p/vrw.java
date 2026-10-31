package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vrw extends hab0 implements iu30 {
    public static final vrw N0;
    public static final vrw O0;
    public static final vrw P0;
    public static final vrw Q0;
    public static final vrw R0;
    public static final vrw S0;
    public static final vrw T0;
    public static final vrw U0;
    public static final vrw V0;
    public static final vrw W0;
    public static final vrw X;
    public static final vrw X0;
    public static final vrw Y;
    public static final vrw Y0;
    public static final vrw Z;
    public static final vrw Z0;
    public static final vrw a1;
    public static final vrw b;
    public static final vrw b1;
    public static final vrw c;
    public static final vrw c1;
    public static final vrw d;
    public static final vrw d1;
    public static final vrw e;
    public static final vrw e1;
    public static final vrw f;
    public static final vrw g;
    public static final vrw h;
    public static final vrw i;
    public static final vrw t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new vrw(i2, (byte) 0);
        c = new vrw(i2, (byte) 1);
        d = new vrw(i2, (byte) 2);
        e = new vrw(i2, (byte) 3);
        f = new vrw(i2, (byte) 4);
        g = new vrw(i2, (byte) 5);
        h = new vrw(i2, (byte) 6);
        i = new vrw(i2, (byte) 7);
        t = new vrw(i2, (byte) 8);
        X = new vrw(i2, (byte) 9);
        Y = new vrw(i2, (byte) 10);
        Z = new vrw(i2, (byte) 11);
        N0 = new vrw(i2, (byte) 12);
        O0 = new vrw(i2, (byte) 13);
        P0 = new vrw(i2, (byte) 14);
        Q0 = new vrw(i2, (byte) 15);
        R0 = new vrw(i2, (byte) 16);
        S0 = new vrw(i2, (byte) 17);
        T0 = new vrw(i2, (byte) 18);
        U0 = new vrw(i2, (byte) 19);
        V0 = new vrw(i2, (byte) 20);
        W0 = new vrw(i2, (byte) 21);
        X0 = new vrw(i2, (byte) 22);
        Y0 = new vrw(i2, (byte) 23);
        Z0 = new vrw(i2, (byte) 24);
        a1 = new vrw(i2, (byte) 25);
        b1 = new vrw(i2, (byte) 26);
        c1 = new vrw(i2, (byte) 27);
        d1 = new vrw(i2, (byte) 28);
        e1 = new vrw(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vrw(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        int i2;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                ((Number) obj).intValue();
                return null;
            case 3:
                ((Number) obj).intValue();
                return null;
            case 4:
                ((Number) obj).intValue();
                return null;
            case 5:
                return obj;
            case 6:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 7:
                b261.t((e261) obj, 0);
                return rih1Var;
            case 8:
                return "";
            case 9:
                return ((cyw) obj).a;
            case 10:
                return ((dyw) obj).a;
            case 11:
                return ((gyw) obj).a;
            case 12:
                return ((eyw) obj).a;
            case 13:
                return ((fyw) obj).a;
            case 14:
                ji0 ji0Var = (ji0) obj;
                return new mj0(ji0Var, new ij0(ji0Var.c, ji0Var.U0, ila0.r(ji0Var.g.a)), o2p1.j(ji0Var), ji0Var.b, new gj0(ji0Var.R0, ji0Var), ji0Var.i, ji0Var.Z.getValue(), ji0Var.W0, ji0Var.Y0.a);
            case 15:
                return Boolean.valueOf(((PlayerState) obj).isPaused());
            case 16:
                ContextTrack contextTrack = (ContextTrack) ((PlayerState) obj).track().h();
                if (contextTrack != null) {
                    return contextTrack.uri();
                }
                return null;
            case 17:
                ji0 ji0Var2 = (ji0) obj;
                return new diu(ji0Var2, ji0Var2.b, new biu(ji0Var2.c, ji0Var2.S0, ji0Var2.U0), new ciu(ji0Var2.R0, ji0Var2), ji0Var2.g.a, ji0Var2.i, ji0Var2.Z, ji0Var2.W0, ji0Var2.Y0.a);
            case 18:
                return Boolean.FALSE;
            case 19:
                ji0 ji0Var3 = (ji0) obj;
                String str = ji0Var3.a;
                zy60 zy60Var = (zy60) o7h.s0(ji0Var3.g.c);
                if (zy60Var == null) {
                    hhg1.f("Missing html payload for ad ".concat(gq0.d(str)));
                    return null;
                }
                String str2 = zy60Var.c;
                if (str2 != null) {
                    int i3 = zy60Var.a;
                    return new f070(ji0Var3, str2, (i3 <= 0 || (i2 = zy60Var.b) <= 0) ? 1.0f : i3 / i2);
                }
                hhg1.f("HTML content missing for ad ".concat(gq0.d(str)));
                return null;
            case 20:
                ji0 ji0Var4 = (ji0) obj;
                return new taj1(ji0Var4, ji0Var4.b, new raj1(ji0Var4.c, ji0Var4.S0, ji0Var4.U0), new saj1(ji0Var4.R0, ji0Var4), ji0Var4.g.b, ji0Var4.i, ji0Var4.Z.getValue(), ji0Var4.W0, ji0Var4.Y0.a);
            case 21:
                ji0 ji0Var5 = (ji0) obj;
                return new taj1(ji0Var5, ji0Var5.b, new raj1(ji0Var5.c, ji0Var5.S0, ji0Var5.U0), new saj1(ji0Var5.R0, ji0Var5), ji0Var5.g.b, ji0Var5.i, ji0Var5.Z.getValue(), ji0Var5.W0, ji0Var5.Y0.a);
            case 22:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return rih1Var;
            case 24:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((b5x) obj).setOnEmojiPickedListener((dkl) null);
                return rih1Var;
            case 26:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                return new uwl0(yon1.b5().c, nik1.h1.a);
            case 27:
                f6x f6xVar = (f6x) obj;
                return new bdo0(f6xVar.a, f6xVar.b);
            case 28:
                return null;
            default:
                ((n161) obj).b(lgo1.b, "TEST_TAG_EMPTY_RECOMMENDATIONS");
                return rih1Var;
        }
    }
}
