package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bwe extends onm {
    public gob a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cwe c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwe(cwe cweVar, onm onmVar) {
        super(onmVar);
        this.c = cweVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, this);
    }
}
