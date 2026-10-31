package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class x4s0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ fn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4s0(byte b) {
        super(3, (lnm) null);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        vr20 vr20Var = (vr20) obj;
        fn0 fn0Var = (fn0) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                x4s0 x4s0Var = new x4s0(i, lnmVar, (byte) 0);
                x4s0Var.c = vr20Var;
                x4s0Var.d = fn0Var;
                return x4s0Var.invokeSuspend(rih1Var);
            case 1:
                x4s0 x4s0Var2 = new x4s0(i, lnmVar, (byte) 1);
                x4s0Var2.c = vr20Var;
                x4s0Var2.d = fn0Var;
                return x4s0Var2.invokeSuspend(rih1Var);
            default:
                x4s0 x4s0Var3 = new x4s0(i, lnmVar, (byte) 2);
                x4s0Var3.c = vr20Var;
                x4s0Var3.d = fn0Var;
                return x4s0Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                fn0 fn0Var = this.d;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.c = null;
                    this.d = fn0Var;
                    this.b = true;
                    if (vr20Var.emit(fn0Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(fn0Var.g == 3);
            case 1:
                vr20 vr20Var2 = this.c;
                fn0 fn0Var2 = this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.c = null;
                    this.d = fn0Var2;
                    this.b = true;
                    if (vr20Var2.emit(fn0Var2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(fn0Var2.g == 3);
            default:
                vr20 vr20Var3 = this.c;
                fn0 fn0Var3 = this.d;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.c = null;
                    this.d = fn0Var3;
                    this.b = true;
                    if (vr20Var3.emit(fn0Var3, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                int i = fn0Var3.g;
                return Boolean.valueOf(i == 3 || i == 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4s0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
