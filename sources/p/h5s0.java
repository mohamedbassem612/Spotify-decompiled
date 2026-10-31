package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h5s0 extends a8d1 implements iu30 {
    public final /* synthetic */ i5s0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5s0(i5s0 i5s0Var, String str, iu30 iu30Var, lnm lnmVar) {
        super(1, lnmVar);
        this.a = i5s0Var;
        this.b = str;
        this.c = iu30Var;
    }

    public final lnm create(lnm lnmVar) {
        return new h5s0(this.a, this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj) {
        return create((lnm) obj).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        hm5.M(obj);
        d441 d441VarG1 = this.a.b.g1(this.b);
        try {
            Object objInvoke = this.c.invoke(d441VarG1);
            o0c.v(d441VarG1, (Throwable) null);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }
}
