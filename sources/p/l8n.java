package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l8n extends onm {
    public py8 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tnm c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8n(tnm tnmVar, onm onmVar) {
        super(onmVar);
        this.c = tnmVar;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return tnm.d(this.c, (py8) null, this);
    }
}
