package p;

import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kud implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ vr20 c;

    public kud(vr20 vr20Var, vu30 vu30Var) {
        this.a = (byte) 1;
        this.b = vu30Var;
        this.c = vr20Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final Object emit(Object obj, lnm lnmVar) throws AbortFlowException {
        jud judVar;
        au20 au20Var;
        cu20 cu20Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.b;
        int i = 0;
        vr20 vr20Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof jud) {
                    judVar = (jud) lnmVar;
                    int i2 = judVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        judVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        judVar = new jud(this, lnmVar);
                    }
                } else {
                    judVar = new jud(this, lnmVar);
                }
                Object objInvoke = judVar.a;
                int i3 = judVar.b;
                if (i3 == 0) {
                    hm5.M(objInvoke);
                    judVar.c = vr20Var;
                    judVar.d = 0;
                    judVar.b = 1;
                    objInvoke = vu30Var.invoke(obj, judVar);
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
                i = judVar.d;
                vr20Var = judVar.c;
                hm5.M(objInvoke);
                if (objInvoke == null) {
                    return rih1Var;
                }
                judVar.c = null;
                judVar.d = i;
                judVar.b = 2;
                if (vr20Var.emit(objInvoke, judVar) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            case 1:
                if (lnmVar instanceof au20) {
                    au20Var = (au20) lnmVar;
                    int i4 = au20Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        au20Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        au20Var = new au20(this, lnmVar);
                    }
                } else {
                    au20Var = new au20(this, lnmVar);
                }
                Object objInvoke2 = au20Var.a;
                int i5 = au20Var.b;
                if (i5 == 0) {
                    hm5.M(objInvoke2);
                    au20Var.d = obj;
                    au20Var.e = 0;
                    au20Var.b = 1;
                    objInvoke2 = vu30Var.invoke(obj, au20Var);
                    if (objInvoke2 != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        hm5.M(objInvoke2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = au20Var.e;
                obj = au20Var.d;
                hm5.M(objInvoke2);
                if (!((Boolean) objInvoke2).booleanValue()) {
                    throw new AbortFlowException(this);
                }
                au20Var.d = null;
                au20Var.e = i;
                au20Var.b = 2;
                if (vr20Var.emit(obj, au20Var) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                if (lnmVar instanceof cu20) {
                    cu20Var = (cu20) lnmVar;
                    int i6 = cu20Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        cu20Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        cu20Var = new cu20(this, lnmVar);
                    }
                } else {
                    cu20Var = new cu20(this, lnmVar);
                }
                Object objInvoke3 = cu20Var.a;
                int i7 = cu20Var.b;
                if (i7 == 0) {
                    hm5.M(objInvoke3);
                    cu20Var.c = vr20Var;
                    cu20Var.d = 0;
                    cu20Var.b = 1;
                    objInvoke3 = vu30Var.invoke(obj, cu20Var);
                    if (objInvoke3 != d9nVar) {
                    }
                    return d9nVar;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        hm5.M(objInvoke3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = cu20Var.d;
                vr20Var = cu20Var.c;
                hm5.M(objInvoke3);
                cu20Var.c = null;
                cu20Var.d = i;
                cu20Var.b = 2;
                if (vr20Var.emit(objInvoke3, cu20Var) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }

    public /* synthetic */ kud(vr20 vr20Var, vu30 vu30Var, byte b) {
        this.a = b;
        this.c = vr20Var;
        this.b = vu30Var;
    }
}
