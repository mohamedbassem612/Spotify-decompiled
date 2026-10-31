package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class da9 extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ aa9 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da9(boolean z, aa9 aa9Var, iu30 iu30Var, int i, boolean z2, boolean z3) {
        super(3);
        this.a = z;
        this.b = aa9Var;
        this.c = iu30Var;
        this.d = i;
        this.e = z2;
        this.f = z3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = 64 | ((((Number) obj3).intValue() << 21) & 29360128);
        u0p1.b(this.a, this.b, this.c, this.d, this.e, this.f, (vzq0) obj, (b0k) obj2, iIntValue);
        return rih1.a;
    }
}
