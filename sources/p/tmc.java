package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tmc extends onm {
    public vmc a;
    public enc b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vmc d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tmc(vmc vmcVar, onm onmVar) {
        super(onmVar);
        this.d = vmcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c((enc) null, this);
    }
}
