package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qgg1 implements mqw {
    public final /* synthetic */ mqw a;
    public final /* synthetic */ iu30 b;

    public qgg1(mqw mqwVar, iu30 iu30Var) {
        this.a = mqwVar;
        this.b = iu30Var;
    }

    @Override // p.mqw
    public final lqw a(Object obj, ipb1 ipb1Var) {
        iu30 iu30Var = this.b;
        return y9g1.p(this.a.a(iu30Var.invoke(obj), ipb1Var), iu30Var);
    }

    @Override // p.mqw
    public final ipb1 b(Object obj, dts dtsVar, String str) {
        return this.a.b(obj, dtsVar, str);
    }

    @Override // p.mqw
    public final mc41 c() {
        mc41 mc41VarC = this.a.c();
        return mc41VarC instanceof o7x ? new o7x() : new vnd1(mc41VarC, this.b, (byte) 14);
    }

    @Override // p.mqw
    public final Object d(Object obj) {
        return this.a.d(this.b.invoke(obj));
    }
}
