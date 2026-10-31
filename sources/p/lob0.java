package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lob0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ pob0 c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lob0(pob0 pob0Var, long j, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = pob0Var;
        this.d = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new lob0(this.c, this.d, lnmVar, (byte) 0);
            default:
                return new lob0(this.c, this.d, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        long j = this.d;
        pob0 pob0Var = this.c;
        d9n d9nVar = d9n.a;
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
                o95 o95Var = pob0Var.g;
                Float f = new Float(Float.intBitsToFloat((int) (j >> 32)));
                pxg1 pxg1VarO0 = irn1.o0(300, 0, mlv.b, 2);
                this.b = true;
                return o95.b(o95Var, f, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
            default:
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
                o95 o95Var2 = pob0Var.h;
                Float f2 = new Float(Float.intBitsToFloat((int) (j & 4294967295L)));
                pxg1 pxg1VarO1 = irn1.o0(300, 0, mlv.b, 2);
                this.b = true;
                return o95.b(o95Var2, f2, pxg1VarO1, (Float) null, (iu30) null, this, 12) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
