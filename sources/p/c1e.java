package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class c1e extends hab0 implements iu30 {
    public final /* synthetic */ wat a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ hdn0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c1e(wat watVar, int i, hdn0 hdn0Var) {
        super(1);
        this.a = watVar;
        this.b = i;
        this.c = hdn0Var;
    }

    public final Object invoke(Object obj) {
        float f = this.b;
        wat watVar = this.a;
        float fX0 = watVar.X0(f);
        this.c.t(yoi1.p(jch0.U((((int) (((elb0) obj).b() >> 32)) - fX0) / (watVar.X0(96.0f) + fX0)), 3, 5));
        return rih1.a;
    }
}
