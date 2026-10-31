package p;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pg6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public ven0 c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg6(boolean z, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                return new pg6(this.b, this.c, this.d, lnmVar, (byte) 0);
            case 1:
                return new pg6(this.c, ven0Var, lnmVar, (byte) 1);
            case 2:
                return new pg6(ven0Var, lnmVar);
            case 3:
                return new pg6(this.c, ven0Var, lnmVar, (byte) 3);
            case 4:
                return new pg6(this.c, ven0Var, lnmVar, (byte) 4);
            case 5:
                return new pg6(this.c, ven0Var, lnmVar, (byte) 5);
            case 6:
                return new pg6(this.b, this.c, this.d, lnmVar, (byte) 6);
            case 7:
                return new pg6(this.c, ven0Var, lnmVar, (byte) 7);
            case 8:
                return new pg6(this.c, ven0Var, lnmVar, (byte) 8);
            default:
                return new pg6(this.c, ven0Var, lnmVar, (byte) 9);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 5:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 6:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 8:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        bpb1 bpb1Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (((Boolean) this.c.getValue()).booleanValue() && !this.b) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 1:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(500L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0 ven0Var2 = this.c;
                ceo ceoVar = bth.a;
                Boolean bool = (Boolean) ven0Var2.getValue();
                bool.booleanValue();
                ven0Var.setValue(bool);
                return rih1Var;
            case 2:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    fns fnsVar = igu.a;
                    s55 s55Var = new s55(2, (lnm) null, (byte) 12);
                    this.c = ven0Var;
                    this.b = true;
                    obj = fn31.Y(fnsVar, s55Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var = this.c;
                    hm5.M(obj);
                }
                int i = gk30.b;
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 3:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (((Boolean) this.c.getValue()).booleanValue()) {
                        this.b = true;
                        if (hap1.i(200L, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (!z3) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 4:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r091 r091Var = (r091) this.c.getValue();
                if (r091Var == null || (bpb1Var = r091Var.g) == null) {
                    return rih1Var;
                }
                mp0 mp0Var = new mp0(ven0Var, (byte) 15);
                this.b = true;
                bpb1Var.collect(mp0Var, this);
                return d9nVar;
            case 5:
                ven0 ven0Var3 = this.c;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    if (((Boolean) ven0Var3.getValue()).booleanValue()) {
                        ven0Var.setValue(Boolean.TRUE);
                        this.b = true;
                        if (hap1.i(1200L, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (!z5) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ven0Var3.setValue(Boolean.FALSE);
                return rih1Var;
            case 6:
                hm5.M(obj);
                boolean z6 = this.b;
                ven0 ven0Var4 = this.c;
                if (z6) {
                    i3u i3uVar = ud11.a;
                    ven0Var4.setValue(Boolean.TRUE);
                } else {
                    i3u i3uVar2 = ud11.a;
                    if (((Boolean) ven0Var4.getValue()).booleanValue()) {
                        ((Function0) ven0Var.getValue()).invoke();
                    }
                }
                return rih1Var;
            case 7:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    if (!((Boolean) this.c.getValue()).booleanValue() && ((Boolean) ven0Var.getValue()).booleanValue()) {
                        this.b = true;
                        if (hap1.i(150L, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (!z7) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 8:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    if (((Boolean) this.c.getValue()).booleanValue()) {
                        ven0Var.setValue(Boolean.TRUE);
                    } else {
                        this.b = true;
                        if (hap1.i(200L, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                    return rih1Var;
                }
                if (!z8) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            default:
                ven0 ven0Var5 = this.c;
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(3100L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (((ckl1) ven0Var5.getValue()) == ckl1.a) {
                    ven0Var.setValue(Boolean.FALSE);
                    ven0Var5.setValue(ckl1.c);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg6(ven0 ven0Var, ven0 ven0Var2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = ven0Var;
        this.d = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg6(ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 2;
        this.d = ven0Var;
    }
}
