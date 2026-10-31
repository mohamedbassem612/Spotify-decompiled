package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ddh extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ l811 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddh(Function0 function0, l811 l811Var) {
        super(1);
        this.c = function0;
        this.b = l811Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        l811 l811Var = this.b;
        switch (b) {
            case 0:
                long j = ((Offset) obj).a;
                function0.invoke();
                l811Var.a = true;
                break;
            default:
                long j2 = ((Offset) obj).a;
                if (!l811Var.a && function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddh(l811 l811Var, Function0 function0) {
        super(1);
        this.b = l811Var;
        this.c = function0;
    }
}
