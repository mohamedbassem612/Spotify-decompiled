package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c380 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ l90 d;
    public final /* synthetic */ xtb0 e;
    public final /* synthetic */ vzq0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d90(c380 c380Var, qim0 qim0Var, l90 l90Var, xtb0 xtb0Var, vzq0 vzq0Var, int i, int i2, int i3, byte b) {
        super(2);
        this.a = b;
        this.b = c380Var;
        this.c = qim0Var;
        this.d = l90Var;
        this.e = xtb0Var;
        this.f = vzq0Var;
        this.g = i;
        this.h = i2;
        this.i = i3;
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
                m0p1.b(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.i;
                m0p1.b(this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP2, b3);
                break;
        }
        return rih1Var;
    }
}
