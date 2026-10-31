package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class we0 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we0(float f, float f2, boolean z, String str, int i) {
        super(3);
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = str;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        et40 et40Var = et40.a;
        float f = this.a;
        fc11.g(dm5.Q(et40Var, f), b0kVar, 0);
        jch0.f(obh.a(dm5.J(et40Var)), 0, apo.r(-583885922, new ve0(f, this.c, this.d, this.e), b0kVar), b0kVar, 3072, 6);
        fc11.g(dm5.Q(et40Var, this.b + f), b0kVar, 0);
        return rih1.a;
    }
}
