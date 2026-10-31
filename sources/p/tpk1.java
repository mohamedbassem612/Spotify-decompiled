package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tpk1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ upk1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tpk1(upk1 upk1Var, byte b) {
        super(1);
        this.a = b;
        this.b = upk1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        upk1 upk1Var = this.b;
        switch (b) {
            case 0:
                if (((hxb) obj) instanceof gxb) {
                    qpj1 qpj1Var = upk1Var.e;
                    i8h1 i8h1Var = (i8h1) ((idd1) qpj1Var.c).getValue();
                    h7l0 h7l0Var = (h7l0) qpj1Var.b;
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), h7l0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                return rih1.a;
            default:
                return new hp0(upk1Var.f.c(new tpk1(upk1Var, (byte) 0)), (byte) 21);
        }
    }
}
