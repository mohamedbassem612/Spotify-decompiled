package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class amw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bmw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amw(bmw bmwVar, onm onmVar) {
        super(onmVar);
        this.c = bmwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
