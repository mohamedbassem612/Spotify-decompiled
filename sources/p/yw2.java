package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yw2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw2(String str, j2i j2iVar, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = j2iVar;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        qim0 qim0Var = this.d;
        j2i j2iVar = this.c;
        String str = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                sok.f(czo1.p(i | 1), str, j2iVar, b0kVar, qim0Var);
                break;
            default:
                r4o1.G(czo1.p(i | 1), str, j2iVar, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw2(String str, qim0 qim0Var, j2i j2iVar, int i) {
        super(2);
        this.b = str;
        this.d = qim0Var;
        this.c = j2iVar;
        this.e = i;
    }
}
