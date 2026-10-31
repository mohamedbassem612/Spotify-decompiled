package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sqs extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqs b;
    public final /* synthetic */ lr91 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sqs(uqs uqsVar, lr91 lr91Var, byte b) {
        super(1);
        this.a = b;
        this.b = uqsVar;
        this.c = lr91Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lr91 lr91Var = this.c;
        uqs uqsVar = this.b;
        switch (b) {
            case 0:
                uqsVar.b();
                mr91 mr91Var = new mr91("Failed to read SnackBar action text from SnackBarConfiguration.", (Throwable) obj, lr91Var);
                n57.g(mr91Var.a, mr91Var);
                break;
            default:
                uqsVar.b();
                mr91 mr91Var2 = new mr91("Failed to read SnackBar message from SnackBarConfiguration.", (Throwable) obj, lr91Var);
                n57.g(mr91Var2.a, mr91Var2);
                break;
        }
        return rih1Var;
    }
}
