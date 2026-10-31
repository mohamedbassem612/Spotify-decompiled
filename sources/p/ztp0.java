package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ztp0 extends onm {
    public Boolean a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bup0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztp0(bup0 bup0Var, onm onmVar) {
        super(onmVar);
        this.d = bup0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.setValue((Boolean) null, false, (tv80) null, (lnm) this);
    }
}
