package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yk71 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nk71 b;
    public final /* synthetic */ bb71 c;
    public final /* synthetic */ cfd d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yk71(nk71 nk71Var, bb71 bb71Var, cfd cfdVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = nk71Var;
        this.c = bb71Var;
        this.d = cfdVar;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        cfd cfdVar = this.d;
        bb71 bb71Var = this.c;
        nk71 nk71Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                c2p1.j(nk71Var, bb71Var, cfdVar, b0kVar, czo1.p(i | 1));
                break;
            default:
                c2p1.j(nk71Var, bb71Var, cfdVar, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
