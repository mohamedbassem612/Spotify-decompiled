package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m461 extends onm {
    public gxz0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tz01 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m461(tz01 tz01Var, onm onmVar) {
        super(onmVar);
        this.c = tz01Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objE = this.c.e(null, false, this);
        return objE == d9n.a ? objE : new e331(objE);
    }
}
