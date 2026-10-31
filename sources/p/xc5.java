package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xc5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zen0 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ bby d;
    public final /* synthetic */ ln00 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ j2i g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xc5(zen0 zen0Var, qim0 qim0Var, bby bbyVar, ln00 ln00Var, String str, j2i j2iVar, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = zen0Var;
        this.c = qim0Var;
        this.d = bbyVar;
        this.e = ln00Var;
        this.f = str;
        this.g = j2iVar;
        this.h = i;
        this.i = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.i;
                fq7.h(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.i;
                fq7.d(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
