package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cv6 extends hab0 implements iu30 {
    public static final cv6 N0;
    public static final cv6 O0;
    public static final cv6 P0;
    public static final cv6 Q0;
    public static final cv6 R0;
    public static final cv6 S0;
    public static final cv6 T0;
    public static final cv6 U0;
    public static final cv6 V0;
    public static final cv6 W0;
    public static final cv6 X;
    public static final cv6 X0;
    public static final cv6 Y;
    public static final cv6 Y0;
    public static final cv6 Z;
    public static final cv6 Z0;
    public static final cv6 a1;
    public static final cv6 b;
    public static final cv6 b1;
    public static final cv6 c;
    public static final cv6 c1;
    public static final cv6 d;
    public static final cv6 d1;
    public static final cv6 e;
    public static final cv6 e1;
    public static final cv6 f;
    public static final cv6 g;
    public static final cv6 h;
    public static final cv6 i;
    public static final cv6 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new cv6(i2, (byte) 0);
        c = new cv6(i2, (byte) 1);
        d = new cv6(i2, (byte) 2);
        e = new cv6(i2, (byte) 3);
        f = new cv6(i2, (byte) 4);
        g = new cv6(i2, (byte) 5);
        h = new cv6(i2, (byte) 6);
        i = new cv6(i2, (byte) 7);
        t = new cv6(i2, (byte) 8);
        X = new cv6(i2, (byte) 9);
        Y = new cv6(i2, (byte) 10);
        Z = new cv6(i2, (byte) 11);
        N0 = new cv6(i2, (byte) 12);
        O0 = new cv6(i2, (byte) 13);
        P0 = new cv6(i2, (byte) 14);
        Q0 = new cv6(i2, (byte) 15);
        R0 = new cv6(i2, (byte) 16);
        S0 = new cv6(i2, (byte) 17);
        T0 = new cv6(i2, (byte) 18);
        U0 = new cv6(i2, (byte) 19);
        V0 = new cv6(i2, (byte) 20);
        W0 = new cv6(i2, (byte) 21);
        X0 = new cv6(i2, (byte) 22);
        Y0 = new cv6(i2, (byte) 23);
        Z0 = new cv6(i2, (byte) 24);
        a1 = new cv6(i2, (byte) 25);
        b1 = new cv6(i2, (byte) 26);
        c1 = new cv6(i2, (byte) 27);
        d1 = new cv6(i2, (byte) 28);
        e1 = new cv6(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cv6(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (xkk1) obj;
            case 1:
                return ((jv6) obj).d();
            case 2:
                hw11 hw11Var = (hw11) obj;
                return new n40(hw11Var.c, hw11Var.f);
            case 3:
                hw11 hw11Var2 = (hw11) obj;
                return new zth(hw11Var2.a, hw11Var2.b);
            case 4:
                wq11 wq11Var = (wq11) obj;
                return new mzg(wq11Var.a, wq11Var.b, wq11Var.c, Integer.valueOf(wq11Var.d));
            case 5:
                hw11 hw11Var3 = (hw11) obj;
                return new l8e(hw11Var3.d, hw11Var3.e);
            case 6:
                b261.c((e261) obj);
                return rih1.a;
            case 7:
                return ((tw6) obj).d();
            case 8:
                return new mx6(((gx6) obj).a, "", (String) null, (String) null);
            case 9:
                return ((gx6) obj).a;
            case 10:
                return ((gx6) obj).a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case grn1.d /* 12 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 13:
                return Boolean.valueOf(obj instanceof jo70);
            case 14:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 15:
                hx6 hx6Var = (hx6) obj;
                return new ajs0(hx6Var.b, hx6Var.c, hx6Var.d, hx6Var.e, hx6Var.f, true);
            case 16:
                ix6 ix6Var = (ix6) obj;
                return new ajs0(ix6Var.c, ix6Var.d, ix6Var.e, false, false, false);
            case 17:
                lx6 lx6Var = (lx6) obj;
                return new xx6(lx6Var.a, lx6Var.b, lx6Var.c, lx6Var.d, lx6Var.e, lx6Var.f, lx6Var.h, lx6Var.g, lx6Var.i);
            case 18:
                return new cx6((zis0) obj);
            case 19:
                return new bx6((zis0) obj);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                jx6 jx6Var = (jx6) obj;
                return new lx6(jx6Var.b, jx6Var.c, jx6Var.d, jx6Var.e, jx6Var.f, jx6Var.g, false, false, jx6Var.k);
            case 21:
                kx6 kx6Var = (kx6) obj;
                return new pq6(kx6Var.b, kx6Var.c);
            case 22:
                if (tx6.a[((oq6) obj).ordinal()] == 1) {
                    return ax6.a;
                }
                eg.o();
                return null;
            case 23:
                return new l2l0((i3l0) obj);
            case 24:
                return new zx6((r6h1) obj, (byte) 0);
            case 25:
                return String.format("%02x", Arrays.copyOf(new Object[]{(Byte) obj}, 1));
            case 26:
                return ((dz6) obj).a;
            case 27:
                return ((dz6) obj).a;
            case 28:
                return new rxc0(l1d.m("spotify:list:artist-connections:", blo1.l(((dz6) obj).a)));
            default:
                return new rxc0(l1d.m("spotify:list:popular-release-segments:artist_", blo1.l(((dz6) obj).a)));
        }
    }
}
