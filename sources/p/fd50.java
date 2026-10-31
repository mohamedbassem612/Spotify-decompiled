package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fd50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd50(float f, int i, qim0 qim0Var) {
        super(2);
        this.b = f;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        qim0 qim0Var = this.c;
        int i = this.d;
        float f = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                qon1.j(f, i, czo1.p(1), b0kVar, qim0Var);
                break;
            case 1:
                g3p1.b(f, czo1.p(i | 1), b0kVar, qim0Var);
                break;
            default:
                g3p1.k(f, i, czo1.p(1), b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd50(float f, int i, qim0 qim0Var, int i2) {
        super(2);
        this.b = f;
        this.d = i;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd50(int i, float f, qim0 qim0Var, int i2) {
        super(2);
        this.d = i;
        this.b = f;
        this.c = qim0Var;
    }
}
