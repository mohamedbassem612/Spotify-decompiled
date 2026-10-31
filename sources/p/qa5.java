package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qa5 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ short d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qa5(int i, j2i j2iVar, qim0 qim0Var, boolean z) {
        super(2);
        this.a = z;
        this.b = qim0Var;
        this.c = j2iVar;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kqn1.b(czo1.p(this.d | 1), this.c, (b0k) obj, this.b, this.a);
        return rih1.a;
    }
}
