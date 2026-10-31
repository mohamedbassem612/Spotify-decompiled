package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p390 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ exs b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p390(exs exsVar, String str, byte b) {
        super(1);
        this.a = b;
        this.b = exsVar;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        exs exsVar = this.b;
        switch (b) {
            case 0:
                yws ywsVarD = exsVar.d();
                ywsVarD.k(str);
                exsVar.p(new zws(ywsVarD));
                break;
            default:
                yws ywsVarD2 = exsVar.d();
                ywsVarD2.l(str);
                exsVar.p(new zws(ywsVarD2));
                break;
        }
        return rih1Var;
    }
}
