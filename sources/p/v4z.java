package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v4z extends onm {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uny c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4z(uny unyVar, onm onmVar) {
        super(onmVar);
        this.c = unyVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        Object objY = this.c.y(null, null, this);
        return objY == d9n.a ? objY : new e331(objY);
    }
}
