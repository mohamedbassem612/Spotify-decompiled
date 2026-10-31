package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ibo0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ g2z c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibo0(g2z g2zVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g2zVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        g2z g2zVar = this.c;
        switch (b) {
            case 0:
                ibo0 ibo0Var = new ibo0(g2zVar, lnmVar, (byte) 0);
                ibo0Var.b = ((Boolean) obj).booleanValue();
                return ibo0Var;
            default:
                return new ibo0(g2zVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((ibo0) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return ((ibo0) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        g2z g2zVar = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                hm5.M(obj);
                if (z) {
                    fn31.T((llm) g2zVar.e, (o8n) null, 0, new vse0(g2zVar, (lnm) null, (byte) 5), 3);
                } else {
                    ((fqz0) g2zVar.b).b = 0.0d;
                }
                return rih1Var;
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
                this.b = true;
                Object objO = g2zVar.O(this);
                d9n d9nVar = d9n.a;
                return objO == d9nVar ? d9nVar : rih1Var;
        }
    }
}
