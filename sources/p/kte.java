package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kte extends onm {
    public String a;
    public String b;
    public String c;
    public String d;
    public fta e;
    public w4i1 f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ fta i;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kte(fta ftaVar, onm onmVar) {
        super(onmVar);
        this.i = ftaVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.t |= Integer.MIN_VALUE;
        Object objA = this.i.A(null, null, null, null, this);
        return objA == d9n.a ? objA : new e331(objA);
    }
}
