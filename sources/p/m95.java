package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class m95 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m95(Object obj, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.b = obj;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new m95((o95) obj, lnmVar, (byte) 0);
            case 1:
                return new m95((String) obj, lnmVar, (byte) 1);
            case 2:
                return new m95((yqn1) obj, lnmVar, (byte) 2);
            default:
                return new m95((xrn1) obj, lnmVar, (byte) 3);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                m95 m95VarCreate = create(lnmVar);
                hm5.M(rih1Var);
                return (String) m95VarCreate.b;
            case 2:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create(lnmVar).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((o95) obj2).d();
                return rih1Var;
            case 1:
                hm5.M(obj);
                return (String) obj2;
            case 2:
                hm5.M(obj);
                ((yqn1) obj2).b();
                return rih1Var;
            default:
                hm5.M(obj);
                xrn1.c((xrn1) obj2);
                return rih1Var;
        }
    }
}
