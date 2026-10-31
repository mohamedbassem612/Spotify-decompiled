package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zbc1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ q3e b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbc1(q3e q3eVar, onm onmVar) {
        super(onmVar);
        this.b = q3eVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
