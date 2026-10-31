package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f0j1 extends a8d1 implements vu30 {
    public final /* synthetic */ l0j1 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0j1(l0j1 l0j1Var, int i, long j, String str, String str2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = l0j1Var;
        this.b = i;
        this.c = j;
        this.d = str;
        this.e = str2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new f0j1(this.a, this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        l0j1 l0j1Var = this.a;
        rok0 rok0Var = l0j1Var.e;
        int i = this.b;
        if (i > 0) {
            long jB = (((yqg) rok0Var.b).b() / 1000) / ((long) i);
            return jB != this.c ? new p0j1(l0j1Var.d.a(jB, this.d, this.e), jB) : q0j1.a;
        }
        hhg1.n("Time step must be positive");
        return null;
    }
}
