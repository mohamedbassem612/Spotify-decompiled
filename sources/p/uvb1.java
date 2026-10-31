package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uvb1 implements PointerInputEventHandler {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ zu30 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ drr0 f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ drr0 i;
    public final /* synthetic */ ven0 j;
    public final /* synthetic */ iu30 k;
    public final /* synthetic */ float l;

    public uvb1(Function0 function0, zu30 zu30Var, iu30 iu30Var, float f, ven0 ven0Var, drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3, drr0 drr0Var4, ven0 ven0Var2, iu30 iu30Var2, float f2) {
        this.a = function0;
        this.b = zu30Var;
        this.c = iu30Var;
        this.d = f;
        this.e = ven0Var;
        this.f = drr0Var;
        this.g = drr0Var2;
        this.h = drr0Var3;
        this.i = drr0Var4;
        this.j = ven0Var2;
        this.k = iu30Var2;
        this.l = f2;
    }

    public final Object invoke(nav0 nav0Var, lnm lnmVar) {
        pt61 pt61Var = new pt61(this.a, (byte) 25);
        zu30 zu30Var = this.b;
        iu30 iu30Var = this.c;
        float f = this.d;
        ven0 ven0Var = this.e;
        drr0 drr0Var = this.f;
        drr0 drr0Var2 = this.g;
        drr0 drr0Var3 = this.h;
        drr0 drr0Var4 = this.i;
        ven0 ven0Var2 = this.j;
        Object objD = s9p1.D(nav0Var, new zvb1(new yf6(nav0Var, f, this.l, drr0Var3, (byte) 1), pt61Var, new svb1(zu30Var, iu30Var, f, ven0Var, drr0Var, drr0Var2, drr0Var3, drr0Var4, ven0Var2), new tvb1(f, iu30Var, this.k, drr0Var, drr0Var2, drr0Var3, ven0Var, ven0Var2), null), lnmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
