package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wtv extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ yzu b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wtv(yzu yzuVar, onm onmVar) {
        super(onmVar);
        this.b = yzuVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.A(this);
    }
}
