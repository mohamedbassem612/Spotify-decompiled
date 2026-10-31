package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vyx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ j2i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vyx(float f, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = f;
        this.c = qim0Var;
        this.d = j2iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.d;
        qim0 qim0Var = this.c;
        float f = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                dxo1.g(f, qim0Var, j2iVar, b0kVar, czo1.p(1));
                break;
            default:
                wqn1.e(f, qim0Var, j2iVar, b0kVar, czo1.p(385));
                break;
        }
        return rih1Var;
    }
}
