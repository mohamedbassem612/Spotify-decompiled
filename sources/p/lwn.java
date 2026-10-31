package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lwn extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ mwn b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lwn(mwn mwnVar, onm onmVar) {
        super(onmVar);
        this.b = mwnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((String) null, (String) null, (l24) null, this);
    }
}
