package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class rk00 implements iv30 {
    public final /* synthetic */ x0r a;

    public rk00(x0r x0rVar) {
        this.a = x0rVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rk00) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return new tv30(1, this.a, x0r.class, "consumePreloadedData", "consumePreloadedData(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
