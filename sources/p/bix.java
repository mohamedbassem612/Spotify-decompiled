package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bix implements PointerInputEventHandler {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ ven0 g;
    public final /* synthetic */ xtb0 h;
    public final /* synthetic */ c9n i;

    public bix(Function0 function0, float f, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, ven0 ven0Var5, xtb0 xtb0Var, c9n c9nVar) {
        this.a = function0;
        this.b = f;
        this.c = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.f = ven0Var4;
        this.g = ven0Var5;
        this.h = xtb0Var;
        this.i = c9nVar;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        Function0 function0 = this.a;
        float f = this.b;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.d;
        ven0 ven0Var3 = this.e;
        ven0 ven0Var4 = this.f;
        bza bzaVar = new bza(function0, f, ven0Var, ven0Var2, ven0Var3, ven0Var4);
        ven0 ven0Var5 = this.g;
        Object objH = g5v.h(new aix(ven0Var5, ven0Var4, ven0Var, (byte) 0), new aix(ven0Var5, ven0Var4, ven0Var, (byte) 1), lnmVar, bzaVar, new xz2(f, this.h, this.i, ven0Var3, ven0Var4, ven0Var, ven0Var2), nav0Var);
        return objH == d9n.a ? objH : rih1.a;
    }
}
