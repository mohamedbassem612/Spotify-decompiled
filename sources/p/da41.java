package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class da41 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ wdm c;
    public final /* synthetic */ ca41 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da41(wdm wdmVar, ca41 ca41Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = wdmVar;
        this.d = ca41Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ca41 ca41Var = this.d;
        wdm wdmVar = this.c;
        switch (b) {
            case 0:
                return new da41(wdmVar, ca41Var, lnmVar, (byte) 0);
            default:
                return new da41(wdmVar, ca41Var, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        ca41 ca41Var = this.d;
        wdm wdmVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pp31 pp31Var = (op31) wdmVar.e;
                String str = ca41Var.d;
                this.b = true;
                Object objC = pp31Var.c(str, this);
                return objC == d9nVar ? d9nVar : objC;
            default:
                boolean z2 = this.b;
                rih1 rih1Var = rih1.a;
                if (!z2) {
                    hm5.M(obj);
                    rpv0 rpv0Var = (rpv0) wdmVar.c;
                    String str2 = ca41Var.d;
                    this.b = true;
                    Object objB = ccc0.b((ccc0) rpv0Var.b, str2, true, (ubc0) null, this, 4);
                    if (objB != d9nVar) {
                        objB = rih1Var;
                    }
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
