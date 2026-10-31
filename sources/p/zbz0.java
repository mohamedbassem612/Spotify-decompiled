package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zbz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ibn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zbz0(ibn ibnVar, byte b) {
        super(1);
        this.a = b;
        this.b = ibnVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ibn ibnVar = this.b;
        switch (b) {
            case 0:
                ibnVar.accept(new f7z0(((rfg) obj).a));
                break;
            case 1:
                ibnVar.accept(new f7z0(((rfg) obj).a));
                break;
            case 2:
                ibnVar.accept(new i8z0(2));
                break;
            case 3:
                ibnVar.accept(new i8z0(1));
                break;
            case 4:
                ibnVar.accept(j7z0.a);
                break;
            case 5:
                ibnVar.accept(new d7z0(((apm0) obj).a));
                break;
            case 6:
                ibnVar.accept(new f8z0(((a621) obj).a));
                break;
            default:
                ibnVar.accept(v7z0.a);
                break;
        }
        return rih1Var;
    }
}
