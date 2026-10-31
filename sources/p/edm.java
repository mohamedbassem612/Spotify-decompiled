package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class edm extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ idm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edm(idm idmVar, onm onmVar) {
        super(onmVar);
        this.c = idmVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.e((String) null, this);
    }
}
