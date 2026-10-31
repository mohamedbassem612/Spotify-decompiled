package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nmg extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qmg c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmg(qmg qmgVar, onm onmVar) {
        super(onmVar);
        this.c = qmgVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
