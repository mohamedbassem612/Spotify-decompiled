package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class za80 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za80(iu30 iu30Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = iu30Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                return new za80(iu30Var, lnmVar, (byte) 0);
            default:
                return new za80(iu30Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objD = s110.h(getContext()).D(iu30Var, this);
                    return objD == d9nVar ? d9nVar : objD;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (iu30Var.invoke(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }
}
