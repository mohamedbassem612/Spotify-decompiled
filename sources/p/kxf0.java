package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kxf0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mxf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kxf0(mxf0 mxf0Var, byte b) {
        super(3);
        this.a = b;
        this.b = mxf0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                jxf0 jxf0Var = (jxf0) obj;
                tqw tqwVar = (tqw) obj3;
                if (!((ixf0) obj2).equals(ixf0.a)) {
                    eg.o();
                    return null;
                }
                mxf0 mxf0Var = this.b;
                fn31.T(mxf0Var.e, (o8n) null, 0, new l4f0(mxf0Var, jxf0Var, tqwVar, (lnm) null, (byte) 1), 3);
                return rih1.a;
            default:
                qyl0 qyl0Var = (qyl0) this.b.i.getValue();
                qyl0Var.getClass();
                x6h1 x6h1VarC = qyl0Var.b.c();
                x6h1VarC.i.add(new a7h1("invite_link_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, qyl0Var.a, System.currentTimeMillis());
        }
    }
}
