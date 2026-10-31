package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o461 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ y441 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o461(y441 y441Var, onm onmVar) {
        super(onmVar);
        this.b = y441Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        Object objZ = this.b.z((String) null, (String) null, (String) null, (sl01) null, this);
        return objZ == d9n.a ? objZ : new e331(objZ);
    }
}
