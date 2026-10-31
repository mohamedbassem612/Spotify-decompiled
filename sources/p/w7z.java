package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w7z extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ lhx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7z(p811 p811Var, lhx lhxVar, byte b) {
        super(1);
        this.a = b;
        this.b = p811Var;
        this.c = lhxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lhx lhxVar = this.c;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                c3z c3zVar = (c3z) obj;
                p811Var.a = c3zVar;
                lhxVar.invoke(c3zVar);
                break;
            default:
                c3z c3zVarA = c3z.a((c3z) p811Var.a, false, false, Integer.valueOf(((Number) obj).intValue()), 3);
                p811Var.a = c3zVarA;
                lhxVar.invoke(c3zVarA);
                break;
        }
        return rih1Var;
    }
}
