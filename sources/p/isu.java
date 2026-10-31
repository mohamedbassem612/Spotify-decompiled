package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class isu extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ jsu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isu(jsu jsuVar, onm onmVar) {
        super(onmVar);
        this.c = jsuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
