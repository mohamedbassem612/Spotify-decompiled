package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r90 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ r90(vr20 vr20Var, String str, boolean z, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = str;
        this.d = z;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    public final Object emit(Object obj, lnm lnmVar) {
        q90 q90Var;
        goj0 goj0VarA;
        f7l1 f7l1Var;
        a91 a91Var;
        j5g0 j5g0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        String str = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        Object oa1Var = null;
        switch (b) {
            case 0:
                if (lnmVar instanceof q90) {
                    q90Var = (q90) lnmVar;
                    int i = q90Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        q90Var.b = i - Integer.MIN_VALUE;
                    } else {
                        q90Var = new q90(this, lnmVar);
                    }
                } else {
                    q90Var = new q90(this, lnmVar);
                }
                Object obj2 = q90Var.a;
                int i2 = q90Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                hoj0 hoj0VarC = ((ioj0) obj).c(f7l1.class, str);
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && (f7l1Var = (f7l1) goj0VarA.a) != null) {
                    oa1Var = f7l1Var.a;
                }
                Boolean boolValueOf = Boolean.valueOf((oa1Var instanceof y6l1) == z);
                q90Var.b = 1;
                return vr20Var.emit(boolValueOf, q90Var) == d9nVar ? d9nVar : rih1Var;
            case 1:
                if (lnmVar instanceof a91) {
                    a91Var = (a91) lnmVar;
                    int i3 = a91Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        a91Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        a91Var = new a91(this, lnmVar);
                    }
                } else {
                    a91Var = new a91(this, lnmVar);
                }
                Object obj3 = a91Var.a;
                int i4 = a91Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    pr91 pr91Var = (pr91) obj;
                    if (pr91Var instanceof or91) {
                        oa1Var = new oa1(str, !z, false);
                    } else if (!(pr91Var instanceof nr91)) {
                        eg.o();
                    }
                    if (oa1Var == null) {
                        return rih1Var;
                    }
                    a91Var.b = 1;
                    return vr20Var.emit(oa1Var, a91Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof j5g0) {
                    j5g0Var = (j5g0) lnmVar;
                    int i5 = j5g0Var.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        j5g0Var.b = i5 - Integer.MIN_VALUE;
                    } else {
                        j5g0Var = new j5g0(this, lnmVar);
                    }
                } else {
                    j5g0Var = new j5g0(this, lnmVar);
                }
                Object obj4 = j5g0Var.a;
                int i6 = j5g0Var.b;
                if (i6 == 0) {
                    hm5.M(obj4);
                    pr91 pr91Var2 = (pr91) obj;
                    if (pr91Var2 instanceof or91) {
                        oa1Var = new c6g0(str, !z, false);
                    } else if (!(pr91Var2 instanceof nr91)) {
                        eg.o();
                    }
                    if (oa1Var == null) {
                        return rih1Var;
                    }
                    j5g0Var.b = 1;
                    return vr20Var.emit(oa1Var, j5g0Var) == d9nVar ? d9nVar : rih1Var;
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
