package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l390 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ exs b;
    public final /* synthetic */ y1k1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l390(exs exsVar, y1k1 y1k1Var, byte b) {
        super(1);
        this.a = b;
        this.b = exsVar;
        this.c = y1k1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y1k1 y1k1Var = this.c;
        exs exsVar = this.b;
        switch (b) {
            case 0:
                yws ywsVarD = exsVar.d();
                int i = y1k1Var.a;
                int i2 = y1k1Var.b;
                ((j0g1) ywsVarD).a = i;
                ((j0g1) ywsVarD).b = i2;
                exsVar.p(new zws(ywsVarD));
                break;
            default:
                yws ywsVarD2 = exsVar.d();
                int i3 = y1k1Var.a;
                int i4 = y1k1Var.b;
                ((j0g1) ywsVarD2).e = i3;
                ((j0g1) ywsVarD2).f = i4;
                exsVar.p(new zws(ywsVarD2));
                break;
        }
        return rih1Var;
    }
}
