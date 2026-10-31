package p;

import android.view.KeyEvent;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xet extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xet(Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                return rih1Var;
            case 1:
                function0.invoke();
                return rih1Var;
            case 2:
                function0.invoke();
                return rih1Var;
            case 3:
                function0.invoke();
                return rih1Var;
            case 4:
                xx10 xx10Var = (xx10) obj;
                if ((xx10Var instanceof sx10) || (xx10Var instanceof vx10) || (xx10Var instanceof wx10)) {
                    function0.invoke();
                } else if (!(xx10Var instanceof tx10) && !(xx10Var instanceof ux10) && !(xx10Var instanceof rx10)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 5:
                function0.invoke();
                return rih1Var;
            case 6:
                if (((xy71) obj) == xy71.a) {
                    function0.invoke();
                }
                return Boolean.TRUE;
            case 7:
                if (((wz20) obj).b()) {
                    function0.invoke();
                }
                return rih1Var;
            case 8:
                function0.invoke();
                return rih1Var;
            case 9:
                e261 e261Var = (e261) obj;
                b261.x(e261Var, 0);
                b261.g(e261Var, (String) null, new ivw(function0, (byte) 12));
                return rih1Var;
            case 10:
                function0.invoke();
                return rih1Var;
            case 11:
                long j = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 12:
                function0.invoke();
                return rih1Var;
            case 13:
                function0.invoke();
                return rih1Var;
            case 14:
                kd31 kd31Var = (kd31) obj;
                float fFloatValue = ((Number) function0.invoke()).floatValue();
                kd31Var.b(dm5.T(1.0f, 0.0f, fFloatValue));
                float fT = dm5.T(1.04f, 0.96f, fFloatValue);
                kd31Var.q(fT);
                kd31Var.r(fT);
                return rih1Var;
            case 15:
                ((kd31) obj).b(yoi1.o(((Number) function0.invoke()).floatValue() / 0.7f, 0.0f, 1.0f));
                return rih1Var;
            case 16:
                ((kd31) obj).b(yoi1.o(1.0f - ((Number) function0.invoke()).floatValue(), 0.0f, 1.0f));
                return rih1Var;
            case 17:
                ((kd31) obj).E(-((f260) function0.invoke()).b);
                return rih1Var;
            case 18:
                kd31 kd31Var2 = (kd31) obj;
                float fFloatValue2 = ((Number) function0.invoke()).floatValue();
                kd31Var2.b(yoi1.o(1.0f - fFloatValue2, 0.0f, 1.0f));
                float fO = 1.0f - yoi1.o(fFloatValue2, 0.0f, 0.5f);
                kd31Var2.q(fO);
                kd31Var2.r(fO);
                return rih1Var;
            case 19:
                KeyEvent keyEvent = ((cpa0) obj).a;
                if (toa0.a(mno1.d(keyEvent.getKeyCode()), toa0.s) && ern1.t(keyEvent) == 2) {
                    function0.invoke();
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 21:
                function0.invoke();
                return rih1Var;
            case 22:
                return new kac0(function0, (byte) 0);
            case 23:
                return new kac0(function0, (byte) 1);
            case 24:
                function0.invoke();
                return rih1Var;
            case 25:
                ((kd31) obj).b(((Number) function0.invoke()).floatValue());
                return rih1Var;
            case 26:
                function0.invoke();
                return rih1Var;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                function0.invoke();
                return rih1Var;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                function0.invoke();
                return rih1Var;
            default:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
        }
    }
}
