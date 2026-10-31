package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eu20 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ vu30 c;

    public /* synthetic */ eu20(vr20 vr20Var, vu30 vu30Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = vu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    @Override // p.vr20
    public final Object emit(Object obj, lnm lnmVar) {
        du20 du20Var;
        uu20 uu20Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.c;
        int i = 0;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof du20) {
                    du20Var = (du20) lnmVar;
                    int i2 = du20Var.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        du20Var.b = i2 - Integer.MIN_VALUE;
                    } else {
                        du20Var = new du20(this, lnmVar);
                    }
                } else {
                    du20Var = new du20(this, lnmVar);
                }
                Object objInvoke = du20Var.a;
                int i3 = du20Var.b;
                if (i3 == 0) {
                    hm5.M(objInvoke);
                    du20Var.c = vr20Var;
                    du20Var.d = 0;
                    du20Var.b = 1;
                    objInvoke = vu30Var.invoke(obj, du20Var);
                    if (objInvoke != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        hm5.M(objInvoke);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = du20Var.d;
                vr20Var = du20Var.c;
                hm5.M(objInvoke);
                du20Var.c = null;
                du20Var.d = i;
                du20Var.b = 2;
                if (vr20Var.emit(objInvoke, du20Var) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                if (lnmVar instanceof uu20) {
                    uu20Var = (uu20) lnmVar;
                    int i4 = uu20Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        uu20Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        uu20Var = new uu20(this, lnmVar);
                    }
                } else {
                    uu20Var = new uu20(this, lnmVar);
                }
                Object obj2 = uu20Var.a;
                int i5 = uu20Var.b;
                if (i5 == 0) {
                    hm5.M(obj2);
                    uu20Var.d = obj;
                    uu20Var.e = vr20Var;
                    uu20Var.f = 0;
                    uu20Var.b = 1;
                    if (vu30Var.invoke(obj, uu20Var) != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = uu20Var.f;
                vr20Var = uu20Var.e;
                obj = uu20Var.d;
                hm5.M(obj2);
                uu20Var.d = null;
                uu20Var.e = null;
                uu20Var.f = i;
                uu20Var.b = 2;
                if (vr20Var.emit(obj, uu20Var) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }
}
