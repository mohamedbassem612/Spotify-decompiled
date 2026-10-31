package p;

import android.view.View;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class em50 extends hab0 implements iu30 {
    public static final em50 N0;
    public static final em50 O0;
    public static final em50 P0;
    public static final em50 Q0;
    public static final em50 R0;
    public static final em50 S0;
    public static final em50 T0;
    public static final em50 U0;
    public static final em50 V0;
    public static final em50 W0;
    public static final em50 X;
    public static final em50 X0;
    public static final em50 Y;
    public static final em50 Y0;
    public static final em50 Z;
    public static final em50 Z0;
    public static final em50 a1;
    public static final em50 b;
    public static final em50 b1;
    public static final em50 c;
    public static final em50 c1;
    public static final em50 d;
    public static final em50 d1;
    public static final em50 e;
    public static final em50 e1;
    public static final em50 f;
    public static final em50 g;
    public static final em50 h;
    public static final em50 i;
    public static final em50 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new em50(i2, (byte) 0);
        c = new em50(i2, (byte) 1);
        d = new em50(i2, (byte) 2);
        e = new em50(i2, (byte) 3);
        f = new em50(i2, (byte) 4);
        g = new em50(i2, (byte) 5);
        h = new em50(i2, (byte) 6);
        i = new em50(i2, (byte) 7);
        t = new em50(i2, (byte) 8);
        X = new em50(i2, (byte) 9);
        Y = new em50(i2, (byte) 10);
        Z = new em50(i2, (byte) 11);
        N0 = new em50(i2, (byte) 12);
        O0 = new em50(i2, (byte) 13);
        P0 = new em50(i2, (byte) 14);
        Q0 = new em50(i2, (byte) 15);
        R0 = new em50(i2, (byte) 16);
        S0 = new em50(i2, (byte) 17);
        T0 = new em50(i2, (byte) 18);
        U0 = new em50(i2, (byte) 19);
        V0 = new em50(i2, (byte) 20);
        W0 = new em50(i2, (byte) 21);
        X0 = new em50(i2, (byte) 22);
        Y0 = new em50(i2, (byte) 23);
        Z0 = new em50(i2, (byte) 24);
        a1 = new em50(i2, (byte) 25);
        b1 = new em50(i2, (byte) 26);
        c1 = new em50(i2, (byte) 27);
        d1 = new em50(i2, (byte) 28);
        e1 = new em50(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em50(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((a7m0) obj).a = dm50.a;
                return rih1Var;
            case 1:
                return ((w4i1) obj).b;
            case 2:
                ((kd31) obj).i(1);
                return rih1Var;
            case 3:
                lsl lslVar = (lsl) obj;
                float fE = Size.e(lslVar.j()) * 0.07f;
                float fE2 = (Size.e(lslVar.j()) * 0.5f) + fE;
                if (Float.intBitsToFloat((int) (lslVar.j() >> 32)) == Float.intBitsToFloat((int) (lslVar.j() & 4294967295L))) {
                    DrawScope.b0(lslVar, u7h.b, fE2, 0L, 0.0f, (DrawStyle) null, 60);
                } else {
                    long j = u7h.b;
                    float f2 = -fE;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
                    float f3 = 2.0f * fE;
                    DrawScope.g0(lslVar, j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) + f3)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)) + f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fE2)) & 4294967295L) | (Float.floatToRawIntBits(fE2) << 32), (DrawStyle) null, 0.0f, 0, 112);
                }
                lslVar.s1();
                return rih1Var;
            case 4:
                return ((eqc) obj).b(e);
            case 5:
                b261.d((e261) obj);
                return rih1Var;
            case 6:
                b261.d((e261) obj);
                return rih1Var;
            case 7:
                b261.k((e261) obj, new d4h(0, 0));
                return rih1Var;
            case 8:
                return rih1Var;
            case 9:
                return ((mq50) obj).a;
            case 10:
                return (jo70) obj;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return Boolean.valueOf(obj instanceof jo70);
            case grn1.d /* 12 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 13:
                return new cjx((View) d7e.x((xos0) obj, AndroidCompositionLocals_androidKt.f));
            case 14:
                return Long.valueOf(((Number) obj).longValue());
            case 15:
                return rih1Var;
            case 16:
                b261.d((e261) obj);
                return rih1Var;
            case 17:
                String str = (String) obj;
                return new gcm(str, str, (ucm) null, h050.t, 12);
            case 18:
                return (String) obj;
            case 19:
                return new p330((String) obj);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                if (!(obj instanceof f7l1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 21:
                if (obj instanceof rih1) {
                    return null;
                }
                return (f7l1) obj;
            case 22:
                return (String) obj;
            case 23:
                return (f7l1) obj;
            case 24:
                return ((h3j1) obj).a;
            case 25:
                return (uxn) obj;
            case 26:
                return new xv50("", false, w2a.a, (qn30) null, z6x.a);
            case 27:
                return ((h3j1) obj).a;
            case 28:
                return (pn30) obj;
            default:
                return ((h3j1) obj).a;
        }
    }
}
