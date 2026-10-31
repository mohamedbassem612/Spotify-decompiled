package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fh1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yg1 b;
    public final /* synthetic */ af10 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh1(yg1 yg1Var, af10 af10Var, iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = yg1Var;
        this.c = af10Var;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                t6p1.a(this.b, this.c, this.d, qim0VarZ, (b0k) obj2, 0);
                break;
            default:
                ((Number) obj3).intValue();
                qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                r6p1.b(this.b, this.c, this.d, qim0VarZ2, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }
}
