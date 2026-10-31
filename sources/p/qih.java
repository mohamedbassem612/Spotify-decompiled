package p;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qih extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qih(Function0 function0, iu30 iu30Var, ven0 ven0Var) {
        super(0);
        this.c = function0;
        this.b = iu30Var;
        this.d = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        iu30 iu30Var = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                function0.invoke();
                Offset offset = (Offset) ven0Var.getValue();
                long j = offset.a;
                iu30Var.invoke(offset);
                break;
            default:
                gff0 gff0Var = (gff0) ven0Var.getValue();
                if (gff0Var == null) {
                    function0.invoke();
                } else {
                    iu30Var.invoke(gff0Var);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qih(iu30 iu30Var, Function0 function0, ven0 ven0Var) {
        super(0);
        this.b = iu30Var;
        this.c = function0;
        this.d = ven0Var;
    }
}
