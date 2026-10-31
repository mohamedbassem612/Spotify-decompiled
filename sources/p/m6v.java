package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m6v extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ drr0 e;
    public final /* synthetic */ drr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6v(boolean z, boolean z2, boolean z3, boolean z4, drr0 drr0Var, drr0 drr0Var2) {
        super(1);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = drr0Var;
        this.f = drr0Var2;
    }

    public final Object invoke(Object obj) {
        z5v z5vVar = (z5v) obj;
        z5vVar.a(0.0f, ma80.a);
        if (this.a && this.b) {
            z5vVar.a(-this.e.s(), ma80.b);
        }
        if (this.c && this.d) {
            z5vVar.a(this.f.s(), ma80.c);
        }
        return rih1.a;
    }
}
