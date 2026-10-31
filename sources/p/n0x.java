package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n0x extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0x(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        vr20 vr20Var = (vr20) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                n0x n0xVar = new n0x(i, (lnm) obj3, (byte) 0);
                n0xVar.c = vr20Var;
                n0xVar.d = zBooleanValue;
                return n0xVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                n0x n0xVar2 = new n0x(i, (lnm) obj3, (byte) 1);
                n0xVar2.c = vr20Var;
                n0xVar2.d = zBooleanValue2;
                return n0xVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                boolean z = this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.c = null;
                    this.d = z;
                    this.b = true;
                    if (vr20Var.emit(boolValueOf, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(z);
            default:
                vr20 vr20Var2 = this.c;
                boolean z3 = this.d;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    Boolean boolValueOf2 = Boolean.valueOf(z3);
                    this.c = null;
                    this.d = z3;
                    this.b = true;
                    if (vr20Var2.emit(boolValueOf2, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(z3);
        }
    }
}
