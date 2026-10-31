package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zss extends onm {
    public Object a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ats d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zss(ats atsVar, onm onmVar) {
        super(onmVar);
        this.d = atsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(false, this);
    }
}
