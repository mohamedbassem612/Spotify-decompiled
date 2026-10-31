package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.spotify.player.model.ContextTrack;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s8x extends hab0 implements iu30 {
    public static final s8x N0;
    public static final s8x O0;
    public static final s8x P0;
    public static final s8x Q0;
    public static final s8x R0;
    public static final s8x S0;
    public static final s8x T0;
    public static final s8x U0;
    public static final s8x V0;
    public static final s8x W0;
    public static final s8x X;
    public static final s8x X0;
    public static final s8x Y;
    public static final s8x Y0;
    public static final s8x Z;
    public static final s8x Z0;
    public static final s8x a1;
    public static final s8x b;
    public static final s8x b1;
    public static final s8x c;
    public static final s8x c1;
    public static final s8x d;
    public static final s8x d1;
    public static final s8x e;
    public static final s8x e1;
    public static final s8x f;
    public static final s8x g;
    public static final s8x h;
    public static final s8x i;
    public static final s8x t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new s8x(i2, (byte) 0);
        c = new s8x(i2, (byte) 1);
        d = new s8x(i2, (byte) 2);
        e = new s8x(i2, (byte) 3);
        f = new s8x(i2, (byte) 4);
        g = new s8x(i2, (byte) 5);
        h = new s8x(i2, (byte) 6);
        i = new s8x(i2, (byte) 7);
        t = new s8x(i2, (byte) 8);
        X = new s8x(i2, (byte) 9);
        Y = new s8x(i2, (byte) 10);
        Z = new s8x(i2, (byte) 11);
        N0 = new s8x(i2, (byte) 12);
        O0 = new s8x(i2, (byte) 13);
        P0 = new s8x(i2, (byte) 14);
        Q0 = new s8x(i2, (byte) 15);
        R0 = new s8x(i2, (byte) 16);
        S0 = new s8x(i2, (byte) 17);
        T0 = new s8x(i2, (byte) 18);
        U0 = new s8x(i2, (byte) 19);
        V0 = new s8x(i2, (byte) 20);
        W0 = new s8x(i2, (byte) 21);
        X0 = new s8x(i2, (byte) 22);
        Y0 = new s8x(i2, (byte) 23);
        Z0 = new s8x(i2, (byte) 24);
        a1 = new s8x(i2, (byte) 25);
        b1 = new s8x(i2, (byte) 26);
        c1 = new s8x(i2, (byte) 27);
        d1 = new s8x(i2, (byte) 28);
        e1 = new s8x(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8x(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b2 = this.a;
        cgz cgzVar = null;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                b261.c((e261) obj);
                return rih1Var;
            case 2:
                y8x y8xVar = (y8x) obj;
                String str2 = y8xVar.a;
                String str3 = y8xVar.b;
                String str4 = str3 == null ? "" : str3;
                boolean z = y8xVar.e;
                String str5 = y8xVar.c;
                if (str5 != null && (str = y8xVar.d) != null) {
                    cgzVar = new cgz(str5, str);
                }
                return new fgz(ggz.g, new dgz(str2, str4, cgzVar, z, 8), 2);
            case 3:
                if (((egz) obj) instanceof egz) {
                    return x8x.a;
                }
                eg.o();
                return null;
            case 4:
                b261.c((e261) obj);
                return rih1Var;
            case 5:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            case 6:
                return rih1Var;
            case 7:
                ((kd31) obj).i(1);
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                af afVar = (af) obj;
                return Integer.valueOf(((afVar.compareTo(af.d) <= 0 && afVar.compareTo(af.a) >= 0) || afVar.compareTo(af.i) > 0 || afVar.compareTo(af.e) < 0) ? 1 : 2);
            case 10:
                return rih1Var;
            case 11:
                return ((uyx) d7e.x((xos0) obj, nyx.c)).g;
            case 12:
                lsl lslVar = (lsl) obj;
                float fE = Size.e(lslVar.j()) * 0.07f;
                float fE2 = (Size.e(lslVar.j()) * 0.5f) + fE;
                if (Float.intBitsToFloat((int) (lslVar.j() >> 32)) == Float.intBitsToFloat((int) (lslVar.j() & 4294967295L))) {
                    DrawScope.b0(lslVar, u7h.b, fE2, 0L, 0.0f, (DrawStyle) null, 60);
                } else {
                    float f2 = -fE;
                    float f3 = 2.0f * fE;
                    DrawScope.g0(lslVar, u7h.b, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) + f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) + f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fE2)) << 32) | (((long) Float.floatToRawIntBits(fE2)) & 4294967295L), (DrawStyle) null, 0.0f, 0, 112);
                }
                lslVar.s1();
                return rih1Var;
            case 13:
                return ((eqc) obj).b(N0);
            case 14:
                ((kd31) obj).i(1);
                return rih1Var;
            case 15:
                ((kd31) obj).i(1);
                return rih1Var;
            case 16:
                return hm5.P(fd20.a, ln00.b);
            case 17:
                return new f2b(((u7h) obj).a, 5);
            case 18:
                return new i9h(((u7h) obj).a);
            case 19:
                return Float.valueOf(((Number) obj).floatValue() * 0.5f);
            case 20:
                return Integer.valueOf(((q5t0) obj).X() / 2);
            case 21:
                return Integer.valueOf(((q5t0) obj).X() / 2);
            case 22:
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new iem("", 0, false);
            case 24:
                return new lo51(true);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new sl1(true);
            case 26:
                return new sl1(true);
            case 27:
                return l4o1.b0((ContextTrack) obj);
            case 28:
                return new mhl0((nhl0) obj, (byte) 3);
            default:
                return new mhl0((nhl0) obj, (byte) 1);
        }
    }
}
