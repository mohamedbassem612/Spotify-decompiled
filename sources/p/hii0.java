package p;

import android.view.KeyEvent;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hii0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hii0(Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                return qro1.o((oii0) obj, (lii0) function0.invoke());
            case 1:
                function0.invoke();
                return rih1Var;
            case 2:
                if (((aqm0) obj) instanceof aqm0) {
                    function0.invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                function0.invoke();
                return rih1Var;
            case 4:
                e261 e261Var = (e261) obj;
                u4m u4mVar = (u4m) function0.invoke();
                if (u4mVar != null) {
                    d261 d261Var = z0q0.b;
                    mma0 mma0Var = z0q0.a[0];
                    d261Var.getClass();
                    e261Var.b(d261Var, u4mVar);
                }
                return rih1Var;
            case 5:
                if (((wz20) obj).b()) {
                    function0.invoke();
                }
                return rih1Var;
            case 6:
                return (d0r) ((q7r0) function0.invoke()).e(d0r.class);
            case 7:
                zjy.l((Number) function0.invoke(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 8:
                zjy.m((Number) function0.invoke(), (kd31) obj, 2);
                return rih1Var;
            case 9:
                if (((wz20) obj).b()) {
                    function0.invoke();
                }
                return rih1Var;
            case 10:
                ((kd31) obj).b(yoi1.o(1.0f - (((Number) function0.invoke()).floatValue() * 1.3f), 0.0f, 1.0f));
                return rih1Var;
            case 11:
                function0.invoke();
                return rih1Var;
            case 12:
                ((kd31) obj).b(yoi1.o(1.0f - (((Number) function0.invoke()).floatValue() * 1.3f), 0.0f, 1.0f));
                return rih1Var;
            case 13:
                ((kd31) obj).b(yoi1.o(1.0f - (((Number) function0.invoke()).floatValue() * 1.3f), 0.0f, 1.0f));
                return rih1Var;
            case 14:
                ((kd31) obj).b(((Number) function0.invoke()).floatValue());
                return rih1Var;
            case 15:
                ((kd31) obj).b(((Number) function0.invoke()).floatValue());
                return rih1Var;
            case 16:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            case 17:
                function0.invoke();
                return rih1Var;
            case 18:
                function0.invoke();
                return rih1Var;
            case 19:
                KeyEvent keyEvent = ((cpa0) obj).a;
                if (toa0.a(mno1.d(keyEvent.getKeyCode()), toa0.s) && ern1.t(keyEvent) == 2) {
                    function0.invoke();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                if (((wz20) obj).b()) {
                    function0.invoke();
                }
                return rih1Var;
            case 21:
                long j = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 22:
                long j2 = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 23:
                long j3 = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 24:
                function0.invoke();
                return rih1Var;
            case 25:
                function0.invoke();
                return rih1Var;
            case 26:
                long j4 = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
            case 27:
                ((kd31) obj).b(((Number) function0.invoke()).floatValue());
                return rih1Var;
            case 28:
                ((Boolean) obj).booleanValue();
                function0.invoke();
                return rih1Var;
            default:
                long j5 = ((Offset) obj).a;
                function0.invoke();
                return rih1Var;
        }
    }
}
