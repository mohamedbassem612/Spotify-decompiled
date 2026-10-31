package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wsh extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wsh(boolean z, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                return new wsh(z, ven0Var, lnmVar, (byte) 0);
            case 1:
                return new wsh(z, ven0Var, lnmVar, (byte) 1);
            case 2:
                return new wsh(z, ven0Var, lnmVar, (byte) 2);
            case 3:
                return new wsh(z, ven0Var, lnmVar, (byte) 3);
            case 4:
                return new wsh(z, ven0Var, lnmVar, (byte) 4);
            case 5:
                return new wsh(z, ven0Var, lnmVar, (byte) 5);
            case 6:
                return new wsh(z, ven0Var, lnmVar, (byte) 6);
            case 7:
                return new wsh(z, ven0Var, lnmVar, (byte) 7);
            default:
                return new wsh(z, ven0Var, lnmVar, (byte) 8);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        d9n d9nVar = d9n.a;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (hap1.i(1000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ceo ceoVar = bth.a;
                ven0Var.setValue(Boolean.valueOf(z));
                return rih1Var;
            case 1:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (!z) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(600L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 2:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (!z) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(250L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 3:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    if (!z) {
                        ven0Var.setValue(Boolean.FALSE);
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(300L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 4:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    if (!z || ((Boolean) ven0Var.getValue()).booleanValue()) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(3000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 5:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    if (z) {
                        int i = kv61.r;
                        ven0Var.setValue(Boolean.FALSE);
                        return rih1Var;
                    }
                    long j = kv61.q;
                    this.b = true;
                    if (hap1.j(j, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z7) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                int i2 = kv61.r;
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 6:
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    ven0Var.setValue(Boolean.FALSE);
                    if (!z) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(1000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 7:
                boolean z9 = this.b;
                if (!z9) {
                    hm5.M(obj);
                    if (!z) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(15000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z9) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            default:
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    if (!((Boolean) ven0Var.getValue()).booleanValue() || z) {
                        return rih1Var;
                    }
                    this.b = true;
                    if (hap1.i(2000L, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
        }
    }
}
