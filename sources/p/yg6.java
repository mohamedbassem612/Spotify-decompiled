package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yg6 implements PointerInputEventHandler {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ vu30 c;
    public final /* synthetic */ drr0 d;
    public final /* synthetic */ drr0 e;
    public final /* synthetic */ drr0 f;

    public yg6(boolean z, Function0 function0, vu30 vu30Var, drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3) {
        this.a = z;
        this.b = function0;
        this.c = vu30Var;
        this.d = drr0Var;
        this.e = drr0Var2;
        this.f = drr0Var3;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        if (this.a) {
            tui1 tui1Var = new tui1();
            xg6 xg6Var = new xg6(tui1Var, this.b, (byte) 0);
            vu30 vu30Var = this.c;
            Object objH = g5v.h(new nx2(tui1Var, vu30Var, (byte) 22), new i26(vu30Var, (byte) 5), lnmVar, xg6Var, new wb6(tui1Var, this.d, this.e, this.f, (byte) 2), nav0Var);
            if (objH == d9n.a) {
                return objH;
            }
        }
        return rih1.a;
    }
}
