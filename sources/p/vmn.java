package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vmn extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;
    public final /* synthetic */ hux c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vmn(ldo ldoVar, hux huxVar, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = ldoVar;
        this.c = huxVar;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        hux huxVar = this.c;
        ldo ldoVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                ldoVar.j(huxVar, qim0Var, b0kVar, czo1.p(9));
                break;
            default:
                ldoVar.n(huxVar, qim0Var, b0kVar, czo1.p(9));
                break;
        }
        return rih1Var;
    }
}
