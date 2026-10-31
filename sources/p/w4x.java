package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w4x extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b5x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w4x(b5x b5xVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = b5xVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        b5x b5xVar = this.b;
        switch (b) {
            case 0:
                return new w4x(b5xVar, lnmVar, (byte) 0);
            default:
                return new w4x(b5xVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b5x b5xVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                b5xVar.i = b5xVar.a();
                m4x m4xVar = b5xVar.t;
                if (m4xVar != null) {
                    m4xVar.h();
                    return rih1Var;
                }
                u890.C("bodyAdapter");
                throw null;
            default:
                hm5.M(obj);
                boolean z = b5x.O0;
                b5xVar.c();
                return rih1Var;
        }
    }
}
