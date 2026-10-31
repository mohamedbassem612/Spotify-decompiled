package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vgf extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ j2i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgf(float f, j2i j2iVar, int i) {
        super(2);
        this.c = f;
        this.d = j2iVar;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        float f = this.c;
        int i = this.b;
        j2i j2iVar = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                cto1.e(f, j2iVar, (b0k) obj, czo1.p(i | 1));
                return rih1.a;
            default:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                q5t0 q5t0VarH = ((afh0) o7h.q0(tlc1Var.P("content", new j2i(-1684338059, new pu2(j2iVar, (byte) 28), true)))).H(j);
                int i2 = (int) (((q5t0VarH.b - i) * f) + i);
                if (i2 < 0) {
                    i2 = 0;
                }
                return tlc1Var.S(hjl.i(j), i2, b7x.a, new f2(q5t0VarH, (byte) 17));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgf(int i, float f, j2i j2iVar) {
        super(2);
        this.b = i;
        this.c = f;
        this.d = j2iVar;
    }
}
