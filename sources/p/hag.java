package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hag extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ kag b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hag(kag kagVar, onm onmVar) {
        super(onmVar);
        this.b = kagVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
