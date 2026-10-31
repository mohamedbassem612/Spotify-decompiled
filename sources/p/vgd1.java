package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vgd1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ wgd1 c;
    public final /* synthetic */ lhd1 d;
    public final /* synthetic */ pxg1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgd1(wgd1 wgd1Var, lhd1 lhd1Var, pxg1 pxg1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = wgd1Var;
        this.d = lhd1Var;
        this.e = pxg1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new vgd1(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new vgd1(this.c, this.d, this.e, lnmVar, (byte) 1);
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
        Object objB;
        Object objB2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lhd1 lhd1Var = this.d;
        wgd1 wgd1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    o95 o95Var = wgd1Var.R0;
                    if (o95Var == null) {
                        return rih1Var;
                    }
                    p3v p3vVar = new p3v(lhd1Var.b);
                    this.b = true;
                    objB = o95.b(o95Var, p3vVar, this.e, (Float) null, (iu30) null, this, 12);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = obj;
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    o95 o95Var2 = wgd1Var.S0;
                    if (o95Var2 == null) {
                        return rih1Var;
                    }
                    p3v p3vVar2 = new p3v(lhd1Var.a);
                    this.b = true;
                    objB2 = o95.b(o95Var2, p3vVar2, this.e, (Float) null, (iu30) null, this, 12);
                    if (objB2 == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB2 = obj;
                }
                return rih1Var;
        }
    }
}
