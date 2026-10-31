package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dzc extends onm {
    public ssw0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ezc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzc(ezc ezcVar, onm onmVar) {
        super(onmVar);
        this.c = ezcVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
