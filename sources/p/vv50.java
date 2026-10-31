package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vv50 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ cv30 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv50(float f, float f2, tfx0 tfx0Var, j2i j2iVar, qim0 qim0Var, int i) {
        super(2);
        j2i j2iVar2 = caj.a;
        this.b = f;
        this.c = f2;
        this.f = tfx0Var;
        this.g = j2iVar;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        j2i j2iVar = this.g;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                float f = this.b;
                float f2 = this.c;
                q1o1.a((String) obj3, f, f2, (iu30) j2iVar, this.d, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                j2i j2iVar2 = caj.a;
                int iP2 = czo1.p(i | 1);
                float f3 = this.b;
                float f4 = this.c;
                aym.j(f3, f4, (tfx0) obj3, j2iVar, this.d, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv50(String str, float f, float f2, iu30 iu30Var, qim0 qim0Var, int i) {
        super(2);
        this.f = str;
        this.b = f;
        this.c = f2;
        this.g = iu30Var;
        this.d = qim0Var;
        this.e = i;
    }
}
