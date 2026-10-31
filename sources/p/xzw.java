package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xzw extends onm {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ yzw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xzw(yzw yzwVar, onm onmVar) {
        super(onmVar);
        this.c = yzwVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= os00.INVALID_ID;
        return this.c.a(null, null, this);
    }
}
