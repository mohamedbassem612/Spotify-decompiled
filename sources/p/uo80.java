package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uo80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ short d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ cv30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uo80(vu30 vu30Var, qim0 qim0Var, boolean z, j2i j2iVar, int i, int i2) {
        super(2);
        this.f = vu30Var;
        this.b = qim0Var;
        this.c = z;
        this.g = j2iVar;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        short s = this.d;
        j2i j2iVar = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.e;
                p9p1.m((so80) obj3, (iu30) j2iVar, this.b, this.c, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.e;
                qim0 qim0Var = this.b;
                boolean z = this.c;
                aym.i((vu30) obj3, qim0Var, z, j2iVar, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uo80(so80 so80Var, iu30 iu30Var, qim0 qim0Var, boolean z, int i, int i2) {
        super(2);
        this.f = so80Var;
        this.g = iu30Var;
        this.b = qim0Var;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
