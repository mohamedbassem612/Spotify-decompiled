package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ki5 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ki5(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                ((kd31) obj).b(((Number) function0.invoke()).floatValue());
                return rih1Var;
            case 1:
                DrawScope.d0((DrawScope) obj, ((u7h) function0.invoke()).a, 0L, 0L, 0.0f, (phc1) null, (ColorFilter) null, 126);
                return rih1Var;
            case 2:
                function0.invoke();
                return rih1Var;
            case 3:
                function0.invoke();
                return rih1Var;
            case 4:
                function0.invoke();
                return rih1Var;
            case 5:
                e261 e261Var = (e261) obj;
                Object objInvoke = function0.invoke();
                Float f = (Float) (Float.isNaN(((Number) objInvoke).floatValue()) ? null : objInvoke);
                b261.w(e261Var, new vfx0(f != null ? f.floatValue() : 0.0f, new jsg(0.0f, 1.0f), 0));
                return rih1Var;
            case 6:
                e261 e261Var2 = (e261) obj;
                Object objInvoke2 = function0.invoke();
                Float f2 = (Float) (Float.isNaN(((Number) objInvoke2).floatValue()) ? null : objInvoke2);
                b261.w(e261Var2, new vfx0(f2 != null ? f2.floatValue() : 0.0f, new jsg(0.0f, 1.0f), 0));
                return rih1Var;
            case 7:
                return function0.invoke();
            case 8:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) function0.invoke()).floatValue());
            default:
                return (Offset) function0.invoke();
        }
    }
}
