package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qqo1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ yro1 b;
    public int c;
    public hql1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqo1(yro1 yro1Var, onm onmVar) {
        super(onmVar);
        this.b = yro1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return yro1.j(this.b, this);
    }
}
