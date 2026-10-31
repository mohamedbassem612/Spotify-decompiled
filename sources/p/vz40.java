package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vz40 extends onm {
    public boolean a;
    public slc0 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ wz40 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz40(wz40 wz40Var, onm onmVar) {
        super(onmVar);
        this.d = wz40Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(false, this);
    }
}
