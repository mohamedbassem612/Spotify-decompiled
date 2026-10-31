package p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class is11 extends a8d1 implements bv30 {
    public byte a;
    public /* synthetic */ uv11 b;
    public /* synthetic */ unb1 c;
    public /* synthetic */ fe00 d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ yt11 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ nu11 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is11(yt11 yt11Var, boolean z, nu11 nu11Var, lnm lnmVar) {
        super(5, lnmVar);
        this.f = yt11Var;
        this.g = z;
        this.h = nu11Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z = this.g;
        nu11 nu11Var = this.h;
        is11 is11Var = new is11(this.f, z, nu11Var, (lnm) obj5);
        is11Var.b = (uv11) obj;
        is11Var.c = (unb1) obj2;
        is11Var.d = (fe00) obj3;
        is11Var.e = (tqw) obj4;
        return is11Var.invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:148:0x01fa A[RETURN] */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        vu11 vu11VarB;
        vu11 vu11VarA;
        uv11 uv11Var = this.b;
        unb1 unb1Var = this.c;
        fe00 fe00Var = this.d;
        tqw tqwVar = this.e;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                boolean zJ = u890.j(fe00Var, be00.a);
                yt11 yt11Var = this.f;
                d9n d9nVar = d9n.a;
                if (zJ) {
                    if (yt11Var != null) {
                        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.a = (byte) 1;
                        if (yt11Var.a(unb1Var, tv80VarY, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (u890.j(fe00Var, ce00.a)) {
                    if (yt11Var != null) {
                        tv80 tv80VarY2 = tqwVar != null ? n3o1.y(tqwVar) : null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.a = (byte) 2;
                        if (yt11Var.c(unb1Var, tv80VarY2, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                boolean zJ2 = u890.j(fe00Var, de00.a);
                boolean z = this.g;
                if (zJ2) {
                    if (z) {
                        s9d1 s9d1VarB = yt11Var != null ? yt11Var.b() : null;
                        r9d1 r9d1Var = s9d1VarB instanceof r9d1 ? (r9d1) s9d1VarB : null;
                        if (r9d1Var != null) {
                            xu30 xu30VarA = r9d1Var.a().a();
                            tv80 tv80VarY3 = tqwVar != null ? n3o1.y(tqwVar) : null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.a = (byte) 3;
                            if (xu30VarA.invoke(uv11Var, tv80VarY3, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                        return rih1Var;
                    }
                    s9d1 s9d1VarB2 = yt11Var != null ? yt11Var.b() : null;
                    q9d1 q9d1Var = s9d1VarB2 instanceof q9d1 ? (q9d1) s9d1VarB2 : null;
                    if (q9d1Var != null && (vu11VarA = q9d1Var.a()) != null) {
                        xu30 xu30VarB = vu11VarA.b();
                        tv80 tv80VarY4 = tqwVar != null ? n3o1.y(tqwVar) : null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.a = (byte) 4;
                        if (xu30VarB.invoke(uv11Var, tv80VarY4, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (u890.j(fe00Var, ee00.a)) {
                    if (z) {
                        s9d1 s9d1VarB3 = yt11Var != null ? yt11Var.b() : null;
                        r9d1 r9d1Var2 = s9d1VarB3 instanceof r9d1 ? (r9d1) s9d1VarB3 : null;
                        if (r9d1Var2 != null) {
                            xu30 xu30VarA2 = r9d1Var2.b().a();
                            tv80 tv80VarY5 = tqwVar != null ? n3o1.y(tqwVar) : null;
                            this.b = null;
                            this.c = null;
                            this.d = null;
                            this.e = null;
                            this.a = (byte) 5;
                            if (xu30VarA2.invoke(uv11Var, tv80VarY5, this) == d9nVar) {
                                return d9nVar;
                            }
                        }
                        return rih1Var;
                    }
                    s9d1 s9d1VarB4 = yt11Var != null ? yt11Var.b() : null;
                    q9d1 q9d1Var2 = s9d1VarB4 instanceof q9d1 ? (q9d1) s9d1VarB4 : null;
                    if (q9d1Var2 != null && (vu11VarB = q9d1Var2.b()) != null) {
                        xu30 xu30VarB2 = vu11VarB.b();
                        tv80 tv80VarY6 = tqwVar != null ? n3o1.y(tqwVar) : null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.a = (byte) 6;
                        if (xu30VarB2.invoke(uv11Var, tv80VarY6, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (fe00Var instanceof yd00) {
                    yd00 yd00Var = (yd00) fe00Var;
                    String str = yd00Var.b;
                    xa4 xa4Var = yd00Var.a;
                    boolean z2 = xa4Var instanceof fve0;
                    nu11 nu11Var = this.h;
                    if (z2) {
                        if (nu11Var != null) {
                            nu11Var.e(((fve0) xa4Var).e, str);
                            return rih1Var;
                        }
                    } else if (xa4Var instanceof gve0) {
                        if (nu11Var != null) {
                            nu11Var.d(((gve0) xa4Var).e, str);
                            return rih1Var;
                        }
                    } else {
                        if (!(xa4Var instanceof hve0)) {
                            eg.o();
                            return null;
                        }
                        if (nu11Var != null) {
                            nu11Var.i(((hve0) xa4Var).e, str);
                            return rih1Var;
                        }
                    }
                } else if (u890.j(fe00Var, zd00.a)) {
                    if (yt11Var != null) {
                        tv80 tv80VarY7 = tqwVar != null ? n3o1.y(tqwVar) : null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.a = (byte) 7;
                        if (yt11Var.a(unb1Var, tv80VarY7, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (!u890.j(fe00Var, ae00.a)) {
                        eg.o();
                        return null;
                    }
                    if (yt11Var != null) {
                        tv80 tv80VarY8 = tqwVar != null ? n3o1.y(tqwVar) : null;
                        this.b = null;
                        this.c = null;
                        this.d = null;
                        this.e = null;
                        this.a = (byte) 8;
                        if (yt11Var.c(unb1Var, tv80VarY8, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return rih1Var;
            case 1:
                hm5.M(obj);
                return rih1Var;
            case 2:
                hm5.M(obj);
                return rih1Var;
            case 3:
                hm5.M(obj);
                return rih1Var;
            case 4:
                hm5.M(obj);
                return rih1Var;
            case 5:
                hm5.M(obj);
                return rih1Var;
            case 6:
                hm5.M(obj);
                return rih1Var;
            case 7:
                hm5.M(obj);
                return rih1Var;
            case 8:
                hm5.M(obj);
                return rih1Var;
            default:
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
