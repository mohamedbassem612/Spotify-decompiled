package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class utb0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utb0(o95 o95Var, int i, tr80 tr80Var, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.f = o95Var;
        this.b = i;
        this.e = tr80Var;
        this.d = i2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        int i = this.d;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                utb0 utb0Var = new utb0((xtb0) obj2, this.b, i, lnmVar);
                utb0Var.f = obj;
                return utb0Var;
            case 1:
                return new utb0(i, (xtb0) obj2, (ven0) this.f, lnmVar);
            case 2:
                Function0 function0 = (Function0) this.f;
                return new utb0(this.b, this.d, (xtb0) obj2, function0, lnmVar);
            default:
                return new utb0((o95) this.f, this.b, (tr80) obj2, this.d, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:78:0x015d  */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        f3a ij81Var;
        Object objF;
        byte b = this.a;
        int i3 = this.d;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.c;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xtb0 xtb0Var = (xtb0) obj2;
                opb0 opb0Var = new opb0((bs41) this.f, xtb0Var, (byte) 1);
                int i4 = this.b;
                wat watVar = ((ptb0) xtb0Var.f.getValue()).i;
                this.c = true;
                return o0c.e(opb0Var, i4, this.d, 100, watVar, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                ven0 ven0Var = (ven0) this.f;
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    i = i3 <= 0 ? 1 : 0;
                    if (((Boolean) ven0Var.getValue()).booleanValue() && i == 0) {
                        this.b = i;
                        this.c = true;
                        df41 df41Var = xtb0.y;
                        if (((xtb0) obj2).k(i3 - 1, 0, this) == d9nVar) {
                            return d9nVar;
                        }
                        i2 = i;
                    }
                    ven0Var.setValue(Boolean.valueOf(i != 0));
                    return rih1Var;
                }
                if (!z2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.b;
                hm5.M(obj);
                i = i2;
                ven0Var.setValue(Boolean.valueOf(i != 0));
                return rih1Var;
            case 2:
                boolean z3 = this.c;
                if (!z3) {
                    hm5.M(obj);
                    int i5 = this.b;
                    xtb0 xtb0Var2 = (xtb0) obj2;
                    int i6 = xtb0Var2.h().n + xtb0Var2.h().m;
                    qtb0 qtb0Var = (qtb0) o7h.C0(xtb0Var2.h().l);
                    if (qtb0Var == null || qtb0Var.a >= i5) {
                        qtb0 qtb0Var2 = (qtb0) o7h.C0(xtb0Var2.h().l);
                        f3a f3aVar = c2j0.a;
                        if (qtb0Var2 == null || qtb0Var2.a != i5) {
                            qtb0 qtb0Var3 = (qtb0) o7h.s0(xtb0Var2.h().l);
                            if (qtb0Var3 != null && qtb0Var3.a == i5) {
                                qtb0 qtb0Var4 = (qtb0) o7h.s0(xtb0Var2.h().l);
                                if (qtb0Var4 == null || qtb0Var4.p != 0) {
                                    ij81Var = new ij81(i5, (byte) 21);
                                } else {
                                    ij81Var = f3aVar;
                                }
                            } else if (i5 == 0) {
                                ij81Var = d2j0.a;
                            } else {
                                ij81Var = f3aVar;
                            }
                        } else {
                            qtb0 qtb0Var5 = (qtb0) o7h.C0(xtb0Var2.h().l);
                            if (qtb0Var5 != null && qtb0Var5.p + qtb0Var5.q <= i6) {
                                ij81Var = f3aVar;
                            } else {
                                ij81Var = ((qtb0) o7h.A0(xtb0Var2.h().l)).q <= i6 ? new f3a(i5, i6, i3) : new ij81(i5, (byte) 21);
                            }
                        }
                    } else {
                        ij81Var = new f3a(i5, i6, i3);
                    }
                    this.c = true;
                    if (!ij81Var.g() || (objF = xtb0Var2.f(ij81Var.f(), ij81Var.a(), this)) != d9nVar) {
                        objF = rih1Var;
                    }
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) this.f).invoke();
                return rih1Var;
            default:
                boolean z4 = this.c;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var = (o95) this.f;
                Float f = new Float((this.b - ((rr80) ((tr80) obj2)).a) / i3);
                this.c = true;
                return o95Var.g(f, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utb0(int i, xtb0 xtb0Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = i;
        this.e = xtb0Var;
        this.f = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utb0(int i, int i2, xtb0 xtb0Var, Function0 function0, lnm lnmVar) {
        super(2, lnmVar);
        this.b = i;
        this.d = i2;
        this.e = xtb0Var;
        this.f = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public utb0(xtb0 xtb0Var, int i, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.e = xtb0Var;
        this.b = i;
        this.d = i2;
    }
}
