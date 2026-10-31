package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t8s extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8s(Function0 function0, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = function0;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                if (Offset.c(((Offset) obj).a, 0L) && ((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.FALSE);
                    function0.invoke();
                }
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                break;
        }
        return rih1Var;
    }
}
