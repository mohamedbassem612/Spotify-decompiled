package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fv11 extends hab0 implements xu30 {
    public final /* synthetic */ cs11 a;
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fv11(cs11 cs11Var, int i) {
        super(3);
        this.a = cs11Var;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        String str = this.a.a;
        uwr uwrVar = cbx.a;
        uwo1.e(str, anm1.N("release_row_title", nim0.a), cbx.d(b0kVar).g, 0L, null, null, 2, false, new cjc0(this.b), 0, null, b0kVar, 0, 0, 1720);
        return rih1.a;
    }
}
