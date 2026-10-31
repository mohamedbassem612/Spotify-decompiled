package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cvz extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ j3v b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvz(j3v j3vVar, onm onmVar) {
        super(onmVar);
        this.b = j3vVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, null, false, null, this);
    }
}
