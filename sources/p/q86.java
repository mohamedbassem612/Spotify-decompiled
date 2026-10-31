package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q86 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ x86 c;

    public /* synthetic */ q86(vr20 vr20Var, x86 x86Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = x86Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        p86 p86Var;
        s86 s86Var;
        t86 t86Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        x86 x86Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof p86) {
                    p86Var = (p86) lnmVar;
                    int i = p86Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        p86Var.b = i - Integer.MIN_VALUE;
                    } else {
                        p86Var = new p86(this, lnmVar);
                    }
                } else {
                    p86Var = new p86(this, lnmVar);
                }
                Object obj2 = p86Var.a;
                int i2 = p86Var.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    n76 n76Var = new n76((am10) obj, x86Var.c.g());
                    p86Var.b = 1;
                    return vr20Var.emit(n76Var, p86Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                n86 n86Var = x86Var.c;
                if (lnmVar instanceof s86) {
                    s86Var = (s86) lnmVar;
                    int i3 = s86Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        s86Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        s86Var = new s86(this, lnmVar);
                    }
                } else {
                    s86Var = new s86(this, lnmVar);
                }
                Object obj3 = s86Var.a;
                int i4 = s86Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    h76 h76Var = new h76(((Boolean) obj).booleanValue(), n86Var.b(), new z740(1, n86Var.g(), "generate"));
                    s86Var.b = 1;
                    return vr20Var.emit(h76Var, s86Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof t86) {
                    t86Var = (t86) lnmVar;
                    int i5 = t86Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        t86Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        t86Var = new t86(this, lnmVar);
                    }
                } else {
                    t86Var = new t86(this, lnmVar);
                }
                Object obj4 = t86Var.a;
                int i6 = t86Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    b86 b86Var = new b86(x86Var.d.a(), ((Boolean) obj).booleanValue());
                    t86Var.b = 1;
                    return vr20Var.emit(b86Var, t86Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i6 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
