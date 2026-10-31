package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ia6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ja6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia6(ja6 ja6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = ja6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ja6 ja6Var = this.d;
        switch (b) {
            case 0:
                ia6 ia6Var = new ia6(ja6Var, lnmVar, (byte) 0);
                ia6Var.c = obj;
                return ia6Var;
            default:
                ia6 ia6Var2 = new ia6(ja6Var, lnmVar, (byte) 1);
                ia6Var2.c = obj;
                return ia6Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ab6 ab6Var = (ab6) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(ab6Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        ja6 ja6Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                ab6 ab6Var = (ab6) this.c;
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
                itz itzVar = ja6Var.b;
                String str = ab6Var.b;
                this.c = null;
                this.b = true;
                Object objA = itzVar.a(str, this);
                return objA == d9nVar ? d9nVar : objA;
            default:
                ab6 ab6Var2 = (ab6) this.c;
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
                itz itzVar2 = ja6Var.b;
                String str2 = ab6Var2.b;
                this.c = null;
                this.b = true;
                Object objB = itzVar2.b(str2, this);
                return objB == d9nVar ? d9nVar : objB;
        }
    }
}
