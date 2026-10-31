package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class lik0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wik0 b;
    public final /* synthetic */ kak0 c;
    public final /* synthetic */ vzq0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qim0 f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lik0(wik0 wik0Var, kak0 kak0Var, vzq0 vzq0Var, boolean z, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = wik0Var;
        this.c = kak0Var;
        this.d = vzq0Var;
        this.e = z;
        this.f = qim0Var;
        this.g = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                this.b.m(this.c, this.d, this.e, this.f, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                this.b.q(this.c, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
