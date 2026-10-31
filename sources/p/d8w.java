package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d8w extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8w b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d8w(c8w c8wVar, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = c8wVar;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        c8w c8wVar = this.b;
        switch (b) {
            case 0:
                c8wVar.b((String) obj);
                iu30Var.invoke(k8w.a);
                break;
            default:
                c8wVar.c((String) obj);
                iu30Var.invoke(l8w.a);
                break;
        }
        return rih1Var;
    }
}
