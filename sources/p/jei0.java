package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jei0 extends hab0 implements vu30 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ znb0 Y;
    public final /* synthetic */ i091 Z;
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ iuj e;
    public final /* synthetic */ idd1 f;
    public final /* synthetic */ idd1 g;
    public final /* synthetic */ idd1 h;
    public final /* synthetic */ idd1 i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jei0(Function0 function0, hob1 hob1Var, float f, iu30 iu30Var, iuj iujVar, idd1 idd1Var, idd1 idd1Var2, idd1 idd1Var3, idd1 idd1Var4, boolean z, boolean z2, znb0 znb0Var, i091 i091Var) {
        super(2);
        this.a = function0;
        this.b = hob1Var;
        this.c = f;
        this.d = iu30Var;
        this.e = iujVar;
        this.f = idd1Var;
        this.g = idd1Var2;
        this.h = idd1Var3;
        this.i = idd1Var4;
        this.t = z;
        this.X = z2;
        this.Y = znb0Var;
        this.Z = i091Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            rce0.a((tl7) this.a.invoke(), apo.r(-1565798851, new iei0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z), x340Var2), x340Var2, 48);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
