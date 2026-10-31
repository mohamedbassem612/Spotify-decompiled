package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class co80 extends onm {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ekb c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co80(ekb ekbVar, onm onmVar) {
        super(onmVar);
        this.c = ekbVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((mj20) null, this);
    }
}
