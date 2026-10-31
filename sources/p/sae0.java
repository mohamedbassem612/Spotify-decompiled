package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sae0 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sae0(float f, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.a = f;
        this.b = z;
        this.c = qim0Var;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.d | 1);
        o6p1.h(this.a, this.b, this.c, (b0k) obj, iP);
        return rih1.a;
    }
}
