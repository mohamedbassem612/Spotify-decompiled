package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oug0 extends onm {
    public boolean a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pug0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oug0(pug0 pug0Var, onm onmVar) {
        super(onmVar);
        this.d = pug0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(false, null, null, null, this);
    }
}
