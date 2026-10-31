package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class edh1 extends hab0 implements zu30 {
    public final /* synthetic */ iac0 N0;
    public final /* synthetic */ kkw0 O0;
    public final /* synthetic */ cm0 P0;
    public final /* synthetic */ mjm X;
    public final /* synthetic */ xyf1 Y;
    public final /* synthetic */ r6h1 Z;
    public final /* synthetic */ jm6 a;
    public final /* synthetic */ xzq b;
    public final /* synthetic */ d0r c;
    public final /* synthetic */ vzq0 d;
    public final /* synthetic */ fos e;
    public final /* synthetic */ kt91 f;
    public final /* synthetic */ xzq g;
    public final /* synthetic */ hw2 h;
    public final /* synthetic */ hvp0 i;
    public final /* synthetic */ wen0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edh1(cm0 cm0Var, hw2 hw2Var, jm6 jm6Var, mjm mjmVar, xzq xzqVar, xzq xzqVar2, d0r d0rVar, fos fosVar, iac0 iac0Var, wen0 wen0Var, hvp0 hvp0Var, vzq0 vzq0Var, kkw0 kkw0Var, kt91 kt91Var, xyf1 xyf1Var, r6h1 r6h1Var) {
        super(4);
        this.a = jm6Var;
        this.b = xzqVar;
        this.c = d0rVar;
        this.d = vzq0Var;
        this.e = fosVar;
        this.f = kt91Var;
        this.g = xzqVar2;
        this.h = hw2Var;
        this.i = hvp0Var;
        this.t = wen0Var;
        this.X = mjmVar;
        this.Y = xyf1Var;
        this.Z = r6h1Var;
        this.N0 = iac0Var;
        this.O0 = kkw0Var;
        this.P0 = cm0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        nbh nbhVar = (nbh) obj;
        long j = ((hjl) obj2).a;
        x340 x340Var = (b0k) obj3;
        int iIntValue = ((Number) obj4).intValue();
        jm6 jm6Var = this.a;
        c380 c380Var = jm6Var.b;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(nbhVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 131) != 130)) {
            lm6 lm6Var = jm6Var.c;
            if (c380Var.isEmpty()) {
                x340Var2.i0(1198207118);
                otw.c(this.b, new im6(jm6Var.a, c380Var, new u7h(jm6Var.g)), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1198378176);
                x340Var2.r(false);
            }
            boolean zIsEmpty = c380Var.isEmpty();
            xzq xzqVar = this.g;
            kt91 kt91Var = this.f;
            fos fosVar = this.e;
            vzq0 vzq0Var = this.d;
            d0r d0rVar = this.c;
            nim0 nim0Var = nim0.a;
            if (zIsEmpty || ((lm6Var instanceof lm6) && !lm6Var.a.isEmpty())) {
                boolean zIsEmpty2 = c380Var.isEmpty();
                hw2 hw2Var = this.h;
                if (zIsEmpty2 && (((lm6Var instanceof lm6) && lm6Var.a.isEmpty()) || (lm6Var instanceof km6))) {
                    x340Var2.i0(1199427929);
                    r4o1.b(jm6Var.a, jm6Var.c, d0rVar, hw2Var, kt91Var, vzq0Var, u291.d(nim0Var, 1.0f), x340Var2, 1572864);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(1200036924);
                    r4o1.A(vzq0Var, d0rVar, this.i, this.t, hw2Var, this.X, this.Y, this.Z, this.N0, this.O0, fosVar, this.P0, xzqVar, nbhVar.a(1.0f, nim0Var, true), x340Var2, 805306368);
                    x340Var2.r(false);
                }
            } else {
                x340Var2.i0(1198712418);
                r4o1.e(jm6Var.a, d0rVar, c380Var, jm6Var.c, vzq0Var, fosVar, kt91Var, xzqVar, u291.d(nim0Var, 1.0f), x340Var2, 100925440);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
