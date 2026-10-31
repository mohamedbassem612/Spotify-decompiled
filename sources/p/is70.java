package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class is70 implements PointerInputEventHandler {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ drr0 i;

    public is70(Function0 function0, Function0 function1, Function0 function2, float f, float f2, float f3, drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3) {
        this.a = function0;
        this.b = function1;
        this.c = function2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = drr0Var;
        this.h = drr0Var2;
        this.i = drr0Var3;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        Object objD = s9p1.D(nav0Var, new mfg1(new hs70(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i), null), lnmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
