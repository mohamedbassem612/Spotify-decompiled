package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cgd implements vu30 {
    public final /* synthetic */ byte a;
    public final yo2 b;

    public /* synthetic */ cgd(yo2 yo2Var, byte b) {
        this.a = b;
        this.b = yo2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(h0h0 h0h0Var, lnm lnmVar) {
        szb1 szb1Var;
        if (lnmVar instanceof szb1) {
            szb1Var = (szb1) lnmVar;
            int i = szb1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                szb1Var.c = i - Integer.MIN_VALUE;
            } else {
                szb1Var = new szb1(this, lnmVar);
            }
        } else {
            szb1Var = new szb1(this, lnmVar);
        }
        Object obj = szb1Var.a;
        int i2 = szb1Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            String str = h0h0Var.a;
            szb1Var.c = 1;
            Object objI = this.b.I(str, szb1Var, true);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(lnm lnmVar) {
        hou houVar;
        if (lnmVar instanceof hou) {
            houVar = (hou) lnmVar;
            int i = houVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                houVar.c = i - Integer.MIN_VALUE;
            } else {
                houVar = new hou(this, lnmVar);
            }
        } else {
            houVar = new hou(this, lnmVar);
        }
        Object objJ = houVar.a;
        int i2 = houVar.c;
        if (i2 == 0) {
            hm5.M(objJ);
            houVar.c = 1;
            objJ = this.b.j(houVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        return new r2h0(((Boolean) objJ).booleanValue());
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fq2 fq2Var = this.b;
        switch (b) {
            case 0:
                fq2Var.b();
                return rih1Var;
            case 1:
                return d((lnm) obj2);
            case 2:
                return a((h0h0) obj, (lnm) obj2);
            default:
                String str = ((zzg0) obj).a;
                fq2 fq2Var2 = fq2Var;
                if (!fq2Var2.p.r()) {
                    fq2Var2.o(str, false, new cq2(fq2Var2, (lnm) null, (byte) 0));
                }
                return rih1Var;
        }
    }
}
