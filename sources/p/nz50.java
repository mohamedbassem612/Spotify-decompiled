package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nz50 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pz50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz50(pz50 pz50Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pz50Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        pz50 pz50Var = this.c;
        switch (b) {
            case 0:
                return new nz50(pz50Var, lnmVar, (byte) 0);
            case 1:
                return new nz50(pz50Var, lnmVar, (byte) 1);
            case 2:
                return new nz50(pz50Var, lnmVar, (byte) 2);
            case 3:
                return new nz50(pz50Var, lnmVar, (byte) 3);
            case 4:
                return new nz50(pz50Var, lnmVar, (byte) 4);
            default:
                return new nz50(pz50Var, lnmVar, (byte) 5);
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
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        pz50 pz50Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var = pz50Var.a;
                Float f = new Float(0.0f);
                pxg1 pxg1Var = pz50Var.d;
                this.b = true;
                return o95.b(o95Var, f, pxg1Var, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var2 = pz50Var.b;
                Float f2 = new Float(-1.0f);
                pxg1 pxg1Var2 = pz50Var.d;
                this.b = true;
                return o95.b(o95Var2, f2, pxg1Var2, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var3 = pz50Var.c;
                Float f3 = new Float(0.0f);
                pxg1 pxg1Var3 = pz50Var.d;
                this.b = true;
                return o95.b(o95Var3, f3, pxg1Var3, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var4 = pz50Var.a;
                Float f4 = new Float(1.0f);
                pxg1 pxg1Var4 = pz50Var.d;
                this.b = true;
                return o95.b(o95Var4, f4, pxg1Var4, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var5 = pz50Var.b;
                Float f5 = new Float(0.0f);
                pxg1 pxg1Var5 = pz50Var.d;
                this.b = true;
                return o95.b(o95Var5, f5, pxg1Var5, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                o95 o95Var6 = pz50Var.c;
                Float f6 = new Float(-1.0f);
                pxg1 pxg1Var6 = pz50Var.d;
                this.b = true;
                return o95.b(o95Var6, f6, pxg1Var6, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
