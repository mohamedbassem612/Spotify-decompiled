package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fbe extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ float e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbe(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, float f, qim0 qim0Var, int i) {
        super(2);
        this.b = j2iVar;
        this.c = j2iVar2;
        this.d = j2iVar3;
        this.e = f;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ljo1.b(this.e, czo1.p(439), this.b, this.c, this.d, (b0k) obj, this.f);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                int iP = czo1.p(439);
                m87.b(this.e, iP, this.b, this.c, this.d, (b0k) obj, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbe(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, float f, int i) {
        super(2);
        this.b = j2iVar;
        this.c = j2iVar2;
        this.d = j2iVar3;
        this.f = qim0Var;
        this.e = f;
    }
}
