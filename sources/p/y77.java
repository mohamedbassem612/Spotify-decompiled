package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y77 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o77 b;
    public final /* synthetic */ i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y77(o77 o77Var, i iVar, byte b) {
        super(1);
        this.a = b;
        this.b = o77Var;
        this.c = iVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i iVar = this.c;
        o77 o77Var = this.b;
        switch (b) {
            case 0:
                o77Var.o.invoke(new oa7(iVar, (tv80) obj));
                break;
            case 1:
                o77Var.o.invoke(new ua7(iVar, (tv80) obj));
                break;
            default:
                o77Var.o.invoke(new qa7(iVar, (tv80) obj));
                break;
        }
        return rih1Var;
    }
}
