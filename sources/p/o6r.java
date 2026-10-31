package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o6r extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ pe30 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6r(float f, pe30 pe30Var, float f2, float f3) {
        super(3);
        this.a = f;
        this.b = pe30Var;
        this.c = f2;
        this.d = f3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fD = i2cVar.d();
            float f = this.a;
            int iB = p3v.b(fD, f);
            pe30 pe30Var = this.b;
            if (iB < 0 || p3v.b(i2cVar.c(), f) < 0) {
                x340Var2.i0(-1502865798);
                r4p1.f(pe30Var, this.d, x340Var2, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1502930557);
                r4p1.d(pe30Var, this.c, x340Var2, 0);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
