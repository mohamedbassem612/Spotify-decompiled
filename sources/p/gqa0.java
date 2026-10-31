package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gqa0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ bs91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqa0(bs91 bs91Var, c9n c9nVar) {
        super(1);
        this.a = (byte) 2;
        this.c = bs91Var;
        this.b = c9nVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = this.b;
        bs91 bs91Var = this.c;
        switch (b) {
            case 0:
                fn31.T(c9nVar, (o8n) null, 0, new duk(bs91Var, (String) obj, (lnm) null, (byte) 1), 3);
                break;
            case 1:
                fn31.T(c9nVar, (o8n) null, 0, new duk(bs91Var, (String) obj, (lnm) null, (byte) 2), 3);
                break;
            default:
                String str = (String) obj;
                wr91 wr91VarA = bs91Var.a();
                if (wr91VarA != null) {
                    wr91VarA.a();
                }
                fn31.T(c9nVar, (o8n) null, 0, new duk(bs91Var, str, (lnm) null, (byte) 3), 3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gqa0(c9n c9nVar, bs91 bs91Var, byte b) {
        super(1);
        this.a = b;
        this.b = c9nVar;
        this.c = bs91Var;
    }
}
