package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m5s0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ s5s0 c;

    public /* synthetic */ m5s0(vr20 vr20Var, s5s0 s5s0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = s5s0Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        l5s0 l5s0Var;
        o5s0 o5s0Var;
        q5s0 q5s0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s5s0 s5s0Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof l5s0) {
                    l5s0Var = (l5s0) lnmVar;
                    int i = l5s0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        l5s0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        l5s0Var = new l5s0(this, lnmVar);
                    }
                } else {
                    l5s0Var = new l5s0(this, lnmVar);
                }
                Object obj2 = l5s0Var.a;
                int i2 = l5s0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                x5s0 x5s0Var = (x5s0) obj;
                e901 e901Var = new e901(u890.j(x5s0Var.a, s5s0Var.a.a) && x5s0Var.b == 2);
                l5s0Var.b = 1;
                return vr20Var.emit(e901Var, l5s0Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof o5s0) {
                    o5s0Var = (o5s0) lnmVar;
                    int i3 = o5s0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        o5s0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        o5s0Var = new o5s0(this, lnmVar);
                    }
                } else {
                    o5s0Var = new o5s0(this, lnmVar);
                }
                Object obj3 = o5s0Var.a;
                int i4 = o5s0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                x5s0 x5s0Var2 = (x5s0) obj;
                if (!u890.j(x5s0Var2.a, s5s0Var.a.a) || x5s0Var2.b != 3) {
                    return rih1Var;
                }
                o5s0Var.b = 1;
                return vr20Var.emit(obj, o5s0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof q5s0) {
                    q5s0Var = (q5s0) lnmVar;
                    int i5 = q5s0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        q5s0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        q5s0Var = new q5s0(this, lnmVar);
                    }
                } else {
                    q5s0Var = new q5s0(this, lnmVar);
                }
                Object obj4 = q5s0Var.a;
                int i6 = q5s0Var.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                x5s0 x5s0Var3 = (x5s0) obj;
                if (!u890.j(x5s0Var3.a, s5s0Var.a.a) || x5s0Var3.b != 3) {
                    return rih1Var;
                }
                q5s0Var.b = 1;
                return vr20Var.emit(obj, q5s0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
