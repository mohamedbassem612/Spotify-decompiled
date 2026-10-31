package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bz9 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wh71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bz9(wh71 wh71Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = wh71Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                bz9 bz9Var = new bz9(this.d, lnmVar, (byte) 0);
                bz9Var.c = obj;
                return bz9Var;
            case 1:
                bz9 bz9Var2 = new bz9(this.d, lnmVar, (byte) 1);
                bz9Var2.c = obj;
                return bz9Var2;
            case 2:
                bz9 bz9Var3 = new bz9(this.d, lnmVar, (byte) 2);
                bz9Var3.c = obj;
                return bz9Var3;
            default:
                bz9 bz9Var4 = new bz9(this.d, lnmVar, (byte) 3);
                bz9Var4.c = obj;
                return bz9Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iud iudVar = (iud) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return create(iudVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        wh71 wh71Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                iud iudVar = (iud) this.c;
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
                this.c = null;
                this.b = true;
                Object objA = jz9.b.a(iudVar, wh71Var, this);
                return objA == d9nVar ? d9nVar : objA;
            case 1:
                iud iudVar2 = (iud) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.b = true;
                Object objY = jwy.b.y(iudVar2, wh71Var, this);
                return objY == d9nVar ? d9nVar : objY;
            case 2:
                iud iudVar3 = (iud) this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.c = null;
                this.b = true;
                Object objS = v6n0.b.s(iudVar3, wh71Var, this);
                return objS == d9nVar ? d9nVar : objS;
            default:
                iud iudVar4 = (iud) this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    if (iudVar4 instanceof aud) {
                        return new sfm1(((aud) iudVar4).a);
                    }
                    if (iudVar4 instanceof ztd) {
                        ztd ztdVar = (ztd) iudVar4;
                        dlw0 dlw0Var = new dlw0(ztdVar.b, ztdVar.c);
                        this.c = null;
                        this.b = true;
                        if (wh71Var.a(dlw0Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else if (z4) {
                    hm5.M(obj);
                } else {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
