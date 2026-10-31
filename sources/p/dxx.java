package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dxx extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ flb0 d;
    public final /* synthetic */ wat e;
    public final /* synthetic */ j2i f;
    public final /* synthetic */ float g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxx(int i, int i2, ven0 ven0Var, flb0 flb0Var, wat watVar, j2i j2iVar, float f) {
        super(2);
        this.a = i;
        this.b = i2;
        this.c = ven0Var;
        this.d = flb0Var;
        this.e = watVar;
        this.f = j2iVar;
        this.g = f;
    }

    public final Object invoke(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            gra graVar = een.d;
            ven0 ven0Var = this.c;
            sy4.b(graVar, (((long) this.a) << 32) | (((long) (this.b - ((int) (((yr80) ven0Var.getValue()).a & 4294967295L)))) & 4294967295L), (Function0) null, (nfv0) null, apo.r(-781526632, new e0a(this.d, this.e, ven0Var, this.f, this.g), x340Var2), x340Var2, 24576, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
