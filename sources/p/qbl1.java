package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qbl1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ylv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qbl1(boolean z, ylv ylvVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z;
        this.d = ylvVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new qbl1(this.c, this.d, lnmVar, (byte) 0);
            default:
                return new qbl1(this.c, this.d, lnmVar, (byte) 1);
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
        ylv ylvVar = this.d;
        boolean z = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    o95 o95Var = z ? ylvVar.a : ylvVar.b;
                    this.b = true;
                    Object objB = o95.b(o95Var, new Float(0.0f), irn1.o0(200, 0, (dlv) null, 6), (Float) null, (iu30) null, this, 12);
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
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    o95 o95Var2 = z ? ylvVar.a : ylvVar.b;
                    this.b = true;
                    Object objB2 = o95.b(o95Var2, new Float(0.1f), irn1.o0(200, 0, (dlv) null, 6), (Float) null, (iu30) null, this, 12);
                    if (objB2 != d9nVar) {
                        objB2 = rih1Var;
                    }
                    if (objB2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
