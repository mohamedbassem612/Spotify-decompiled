package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oye extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ pye c;
    public swe d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oye(pye pyeVar, onm onmVar) {
        super(onmVar);
        this.c = pyeVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
