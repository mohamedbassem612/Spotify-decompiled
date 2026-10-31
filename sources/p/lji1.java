package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lji1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ joo b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lji1(joo jooVar, onm onmVar) {
        super(onmVar);
        this.b = jooVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
