package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l7x extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o0i b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l7x(o0i o0iVar, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = o0iVar;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        o0i o0iVar = this.b;
        switch (b) {
            case 0:
                return new l7x(o0iVar, ven0Var, lnmVar, (byte) 0);
            default:
                return new l7x(o0iVar, ven0Var, lnmVar, (byte) 1);
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
        ven0 ven0Var = this.c;
        o0i o0iVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                n2u0 n2u0Var = o0iVar.c.b;
                if (n2u0Var != null) {
                    n2u0Var.b(null);
                }
                ven0Var.setValue((Object) null);
                break;
            default:
                hm5.M(obj);
                dlg1 dlg1Var = o0iVar.d;
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.booleanValue();
                ((bpb1) dlg1Var.a).m((Object) null, bool);
                break;
        }
        return rih1Var;
    }
}
