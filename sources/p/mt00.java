package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mt00 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ mt00(r6e1 r6e1Var, boolean z, idn0 idn0Var) {
        this.c = r6e1Var;
        this.b = z;
        this.d = idn0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        Object obj4 = this.d;
        boolean z = this.b;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ifh0 ifh0Var = (ifh0) obj;
                afh0 afh0Var = (afh0) obj2;
                hjl hjlVar = (hjl) obj3;
                int iG = jjl.g(((hdn0) obj5).s(), hjlVar.a);
                long j = hjlVar.a;
                int iF = jjl.f(((hdn0) obj4).s(), j);
                int iK = z ? iG : hjl.k(j);
                if (!z) {
                    iG = hjl.i(j);
                }
                q5t0 q5t0VarH = afh0Var.H(hjl.b(hjlVar.a, iK, iG, 0, iF, 4));
                return ifh0Var.S(q5t0VarH.a, q5t0VarH.b, b7x.a, new p6(q5t0VarH, (byte) 6));
            default:
                r6e1 r6e1Var = (r6e1) obj5;
                hrr0 hrr0Var = r6e1Var.f;
                idn0 idn0Var = (idn0) obj4;
                ((Integer) obj3).getClass();
                Object obj6 = fkj0.X;
                x340 x340Var = (b0k) obj2;
                x340Var.i0(-2137546592);
                boolean z2 = ((qqq0) hrr0Var.getValue()) == qqq0.a || !(x340Var.k(t4k.n) == flb0.b);
                boolean zG = x340Var.g(r6e1Var);
                Object objT = x340Var.T();
                if (zG || objT == obj6) {
                    objT = new w7d1(r6e1Var, (byte) 7);
                    x340Var.s0(objT);
                }
                ct41 ct41VarX = grn1.x((iu30) objT, x340Var, 0);
                boolean zG2 = x340Var.g(ct41VarX) | x340Var.g(r6e1Var);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == obj6) {
                    objT2 = new q6e1(ct41VarX, r6e1Var);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarA = ws41.a(nim0.a, (q6e1) objT2, (qqq0) hrr0Var.getValue(), (n201) null, z && r6e1Var.b.s() != 0.0f, z2, idn0Var, 160);
                x340Var.r(false);
                return qim0VarA;
        }
    }

    public /* synthetic */ mt00(boolean z, hdn0 hdn0Var, hdn0 hdn0Var2) {
        this.b = z;
        this.c = hdn0Var;
        this.d = hdn0Var2;
    }
}
