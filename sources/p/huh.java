package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class huh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ huh(j2i j2iVar, j2i j2iVar2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = j2iVar2;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.d;
        j2i j2iVar = this.c;
        j2i j2iVar2 = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                v9p1.f(j2iVar2, j2iVar, qim0Var, b0kVar, czo1.p(55));
                break;
            case 1:
                rrn1.o(j2iVar2, j2iVar, qim0Var, b0kVar, czo1.p(55));
                break;
            case 2:
                uwo1.h(j2iVar2, j2iVar, qim0Var, b0kVar, czo1.p(55));
                break;
            default:
                sqe.o(j2iVar2, j2iVar, qim0Var, b0kVar, czo1.p(55));
                break;
        }
        return rih1Var;
    }
}
