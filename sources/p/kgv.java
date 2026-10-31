package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class kgv extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dma1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kgv(dma1 dma1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = dma1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                kgv kgvVar = new kgv(this.d, lnmVar, (byte) 0);
                kgvVar.c = obj;
                return kgvVar;
            case 1:
                kgv kgvVar2 = new kgv(this.d, lnmVar, (byte) 1);
                kgvVar2.c = obj;
                return kgvVar2;
            case 2:
                kgv kgvVar3 = new kgv(this.d, lnmVar, (byte) 2);
                kgvVar3.c = obj;
                return kgvVar3;
            case 3:
                kgv kgvVar4 = new kgv(this.d, lnmVar, (byte) 3);
                kgvVar4.c = obj;
                return kgvVar4;
            case 4:
                kgv kgvVar5 = new kgv(this.d, lnmVar, (byte) 4);
                kgvVar5.c = obj;
                return kgvVar5;
            default:
                kgv kgvVar6 = new kgv(this.d, lnmVar, (byte) 5);
                kgvVar6.c = obj;
                return kgvVar6;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
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
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dma1 dma1Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
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
                Boolean boolValueOf = Boolean.valueOf(dma1Var.h(lgv.a, false));
                this.c = null;
                this.b = true;
                return vr20Var.emit(boolValueOf, this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
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
                Boolean boolValueOf2 = Boolean.valueOf(dma1Var.h(n9r0.g, false));
                this.c = null;
                this.b = true;
                return vr20Var2.emit(boolValueOf2, this) == d9nVar ? d9nVar : rih1Var;
            case 2:
                vr20 vr20Var3 = (vr20) this.c;
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
                Integer num = new Integer(dma1Var.l(n9r0.h, -1));
                this.c = null;
                this.b = true;
                return vr20Var3.emit(num, this) == d9nVar ? d9nVar : rih1Var;
            case 3:
                vr20 vr20Var4 = (vr20) this.c;
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
                Long l = new Long(dma1Var.g(n9r0.i, -1L));
                this.c = null;
                this.b = true;
                return vr20Var4.emit(l, this) == d9nVar ? d9nVar : rih1Var;
            case 4:
                vr20 vr20Var5 = (vr20) this.c;
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
                Boolean boolValueOf3 = Boolean.valueOf(dma1Var.h(n9r0.f, false));
                this.c = null;
                this.b = true;
                return vr20Var5.emit(boolValueOf3, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var6 = (vr20) this.c;
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
                Boolean boolValueOf4 = Boolean.valueOf(dma1Var.h(n9r0.f, false));
                this.c = null;
                this.b = true;
                return vr20Var6.emit(boolValueOf4, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
