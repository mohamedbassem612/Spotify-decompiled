package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i6v implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ c9n e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ Function0 g;

    public i6v(boolean z, o9p1 o9p1Var, vu30 vu30Var, iu30 iu30Var, ven0 ven0Var, c9n c9nVar, ven0 ven0Var2, Function0 function0) {
        this.a = z;
        this.b = vu30Var;
        this.c = iu30Var;
        this.d = ven0Var;
        this.e = c9nVar;
        this.f = ven0Var2;
        this.g = function0;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        if (z) {
            iu30 iu30Var = this.c;
            ven0 ven0Var = this.d;
            c9n c9nVar = this.e;
            ven0 ven0Var2 = this.f;
            ggh gghVar = new ggh(iu30Var, ven0Var, c9nVar, ven0Var2);
            Function0 function0 = this.g;
            Object objH = g5v.h(new h6v(function0, ven0Var2, c9nVar, ven0Var, (byte) 0), new h6v(function0, ven0Var2, c9nVar, ven0Var, (byte) 1), lnmVar, gghVar, this.b, nav0Var);
            d9n d9nVar = d9n.a;
            if (objH != d9nVar) {
                objH = rih1Var;
            }
            if (objH == d9nVar) {
                return objH;
            }
        }
        return rih1Var;
    }
}
