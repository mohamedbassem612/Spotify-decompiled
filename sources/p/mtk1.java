package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mtk1 extends hab0 implements iu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ iu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mtk1(String str, String str2, float f, boolean z, iu30 iu30Var) {
        super(1);
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = z;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj) {
        e261 e261Var = (e261) obj;
        b261.B(e261Var, "volume-slider-row");
        b261.n(e261Var, this.a);
        b261.A(e261Var, this.b);
        jsg jsgVar = foo1.a;
        float f = this.c;
        b261.w(e261Var, new vfx0(f, jsgVar, 0));
        iu30 iu30Var = this.e;
        boolean z = this.d;
        b261.v(e261Var, new cre((byte) 1, f, iu30Var, z));
        if (z) {
            b261.a(e261Var);
        }
        return rih1.a;
    }
}
