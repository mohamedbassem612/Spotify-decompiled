package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yls extends onm {
    public String a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ams d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yls(ams amsVar, onm onmVar) {
        super(onmVar);
        this.d = amsVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.j(null, null, this);
    }
}
