package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zmc extends onm {
    public enc a;
    public String b;
    public dnc c;
    public /* synthetic */ Object d;
    public final /* synthetic */ dnc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmc(dnc dncVar, onm onmVar) {
        super(onmVar);
        this.e = dncVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b((enc) null, this);
    }
}
