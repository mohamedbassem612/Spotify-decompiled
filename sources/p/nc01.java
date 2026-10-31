package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nc01 implements PointerInputEventHandler {
    public final /* synthetic */ cde1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ z680 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;

    public nc01(cde1 cde1Var, int i, z680 z680Var, Function0 function0, ven0 ven0Var, ven0 ven0Var2) {
        this.a = cde1Var;
        this.b = i;
        this.c = z680Var;
        this.d = function0;
        this.e = ven0Var;
        this.f = ven0Var2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        Object objD = rqd1.d(nav0Var, (iu30) null, (iu30) null, (xu30) null, new pvj(this.a, this.b, this.c, this.d, this.e, this.f), lnmVar, 7);
        return objD == d9n.a ? objD : rih1.a;
    }
}
