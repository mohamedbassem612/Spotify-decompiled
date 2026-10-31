package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yzx extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ zzx b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzx(zzx zzxVar, onm onmVar) {
        super(onmVar);
        this.b = zzxVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
