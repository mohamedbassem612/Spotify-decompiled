package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vms extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ rjn b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vms(rjn rjnVar, onm onmVar) {
        super(onmVar);
        this.b = rjnVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f((tr31) null, (uio) null, this);
    }
}
