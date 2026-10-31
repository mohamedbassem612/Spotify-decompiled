package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kob0 extends onm {
    public float a;
    public float b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pob0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kob0(pob0 pob0Var, onm onmVar) {
        super(onmVar);
        this.d = pob0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(0.0f, 0.0f, this);
    }
}
