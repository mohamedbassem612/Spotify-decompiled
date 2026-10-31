package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rmc extends onm {
    public enc a;
    public vmc b;
    public enc c;
    public /* synthetic */ Object d;
    public final /* synthetic */ vmc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rmc(vmc vmcVar, onm onmVar) {
        super(onmVar);
        this.e = vmcVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a((enc) null, this);
    }
}
