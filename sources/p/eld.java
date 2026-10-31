package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eld extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ fld b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eld(fld fldVar, onm onmVar) {
        super(onmVar);
        this.b = fldVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, this);
    }
}
