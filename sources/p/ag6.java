package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ag6 extends hab0 implements iu30 {
    public static final ag6 N0;
    public static final ag6 O0;
    public static final ag6 P0;
    public static final ag6 Q0;
    public static final ag6 R0;
    public static final ag6 S0;
    public static final ag6 T0;
    public static final ag6 U0;
    public static final ag6 V0;
    public static final ag6 W0;
    public static final ag6 X;
    public static final ag6 X0;
    public static final ag6 Y;
    public static final ag6 Y0;
    public static final ag6 Z;
    public static final ag6 Z0;
    public static final ag6 a1;
    public static final ag6 b;
    public static final ag6 b1;
    public static final ag6 c;
    public static final ag6 c1;
    public static final ag6 d;
    public static final ag6 d1;
    public static final ag6 e;
    public static final ag6 e1;
    public static final ag6 f;
    public static final ag6 g;
    public static final ag6 h;
    public static final ag6 i;
    public static final ag6 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ag6(i2, (byte) 0);
        c = new ag6(i2, (byte) 1);
        d = new ag6(i2, (byte) 2);
        e = new ag6(i2, (byte) 3);
        f = new ag6(i2, (byte) 4);
        g = new ag6(i2, (byte) 5);
        h = new ag6(i2, (byte) 6);
        i = new ag6(i2, (byte) 7);
        t = new ag6(i2, (byte) 8);
        X = new ag6(i2, (byte) 9);
        Y = new ag6(i2, (byte) 10);
        Z = new ag6(i2, (byte) 11);
        N0 = new ag6(i2, (byte) 12);
        O0 = new ag6(i2, (byte) 13);
        P0 = new ag6(i2, (byte) 14);
        Q0 = new ag6(i2, (byte) 15);
        R0 = new ag6(i2, (byte) 16);
        S0 = new ag6(i2, (byte) 17);
        T0 = new ag6(i2, (byte) 18);
        U0 = new ag6(i2, (byte) 19);
        V0 = new ag6(i2, (byte) 20);
        W0 = new ag6(i2, (byte) 21);
        X0 = new ag6(i2, (byte) 22);
        Y0 = new ag6(i2, (byte) 23);
        Z0 = new ag6(i2, (byte) 24);
        a1 = new ag6(i2, (byte) 25);
        b1 = new ag6(i2, (byte) 26);
        c1 = new ag6(i2, (byte) 27);
        d1 = new ag6(i2, (byte) 28);
        e1 = new ag6(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag6(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                xua0 xua0Var = (xua0) obj;
                xua0Var.a = (short) 2000;
                Float fValueOf = Float.valueOf(1.0f);
                wua0 wua0VarA = xua0Var.a(fValueOf, 0);
                ilv.a.getClass();
                ceo ceoVar = flv.e;
                wua0VarA.b = ceoVar;
                xua0Var.a(Float.valueOf(0.0f), 1000).b = ceoVar;
                xua0Var.a(fValueOf, 2000);
                return rih1Var;
            case 1:
                kd31 kd31Var = (kd31) obj;
                kd31Var.q(2.0f);
                kd31Var.r(2.0f);
                return rih1Var;
            case 2:
                return rih1Var;
            case 3:
                return rih1Var;
            case 4:
                return rih1Var;
            case 5:
                return rih1Var;
            case 6:
                eqc eqcVar = (eqc) obj;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (eqcVar.a.j() & 4294967295L)))) & 4294967295L);
                return eqcVar.a(new n82(new qoz0(500.0f, jFloatToRawIntBits, p7h.M(new u7h[]{new u7h(z4p1.g(4288848887L)), new u7h(z4p1.e(10658807))}), (List) null), jFloatToRawIntBits, (byte) 1));
            case 7:
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                return rih1Var;
            case 10:
                ((lsl) obj).s1();
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((kd31) obj).n(180.0f);
                return rih1Var;
            case grn1.d /* 12 */:
                return ((cqm0) obj).b;
            case 13:
                return ((cqm0) obj).b;
            case 14:
                return ((cqm0) obj).b;
            case 15:
                return ((dl6) obj).a;
            case 16:
                return new qvc0(l1d.m("spotify:list:artist-connections:", blo1.l(((dl6) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 17:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 18:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 19:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 21:
                ol6 ol6Var = (ol6) obj;
                return new pl6(ol6Var.a, ol6Var.b, ol6Var.c, ol6Var.d, ol6Var.e, ol6Var.f, ol6Var.g, false, false, false, ol6Var.i, ol6Var.j, ol6Var.l, false, ol6Var.m, ol6Var.k);
            case 22:
                return rjo1.v((pl6) obj);
            case 23:
                return new qvc0(l1d.m("spotify:list:artist-connections:", blo1.l(((im6) obj).a)), (c3d0) null, (Set) null, (mqz0) null, 14);
            case 24:
                i1r i1rVar = (k1r) obj;
                if (!(i1rVar instanceof h1r)) {
                    if (i1rVar instanceof i1r) {
                        if (!((Collection) i1rVar.a).isEmpty()) {
                        }
                    } else if (!i1rVar.equals(j1r.a)) {
                        eg.o();
                        return null;
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 25:
                return ((im6) obj).a;
            case 26:
                return ((im6) obj).a;
            case 27:
                return (String) o7h.s0(((im6) obj).b);
            case 28:
                return (String) o7h.s0(((im6) obj).b);
            default:
                return new qvc0(l1d.m("spotify:list:popular-release-segments:artist_", blo1.l(((im6) obj).a)), (c3d0) null, Collections.singleton(yqc0.a), (mqz0) null, 10);
        }
    }
}
