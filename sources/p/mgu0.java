package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mgu0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ o9b b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgu0(o9b o9bVar, onm onmVar) {
        super(onmVar);
        this.b = o9bVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
