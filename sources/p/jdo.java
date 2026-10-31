package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jdo extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ldo b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdo(ldo ldoVar, onm onmVar) {
        super(onmVar);
        this.b = ldoVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.v(null, this);
    }
}
