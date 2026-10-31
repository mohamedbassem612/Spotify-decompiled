package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z5u extends onm {
    public boolean a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b6u d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5u(b6u b6uVar, onm onmVar) {
        super(onmVar);
        this.d = b6uVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.setValue((Boolean) null, false, (tv80) null, (lnm) this);
    }
}
