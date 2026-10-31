package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oah1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c9n b;
    public final /* synthetic */ obh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oah1(c9n c9nVar, obh1 obh1Var, byte b) {
        super(1);
        this.a = b;
        this.b = c9nVar;
        this.c = obh1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        obh1 obh1Var = this.c;
        c9n c9nVar = this.b;
        switch (b) {
            case 0:
                fn31.T(c9nVar, (o8n) null, 0, new nah1(obh1Var, (lbh1) obj, null, (byte) 0), 3);
                break;
            default:
                fn31.T(c9nVar, (o8n) null, 0, new nah1(obh1Var, (lbh1) obj, null, (byte) 1), 3);
                break;
        }
        return rih1Var;
    }
}
