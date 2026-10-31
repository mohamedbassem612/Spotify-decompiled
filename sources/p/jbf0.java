package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jbf0 extends a8d1 implements iu30 {
    public final /* synthetic */ kbf0 a;
    public final /* synthetic */ fcf0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbf0(kbf0 kbf0Var, fcf0 fcf0Var, float f, int i, boolean z, lnm lnmVar) {
        super(1, lnmVar);
        this.a = kbf0Var;
        this.b = fcf0Var;
        this.c = f;
        this.d = i;
        this.e = z;
    }

    public final lnm create(lnm lnmVar) {
        return new jbf0(this.a, this.b, this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj) {
        jbf0 jbf0VarCreate = create((lnm) obj);
        rih1 rih1Var = rih1.a;
        jbf0VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        fcf0 fcf0Var = this.b;
        kbf0 kbf0Var = this.a;
        kbf0Var.i.setValue(fcf0Var);
        kbf0Var.n(this.c);
        kbf0Var.l(this.d);
        kbf0Var.m(false);
        if (this.e) {
            kbf0Var.Y.setValue(Long.MIN_VALUE);
        }
        return rih1.a;
    }
}
