package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pmk1 extends onm {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qmk1 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pmk1(qmk1 qmk1Var, onm onmVar) {
        super(onmVar);
        this.c = qmk1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(false, this);
    }
}
