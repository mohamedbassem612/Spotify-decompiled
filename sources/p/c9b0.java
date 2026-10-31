package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class c9b0 extends tv30 implements iu30 {
    public static final c9b0 a = new c9b0(1, nb51.class, "isAddToLibrarySwipeEnabledInCompose", "isAddToLibrarySwipeEnabledInCompose(Lcom/spotify/search/elements/recentrowelement/RecentRowElement$State;)Z", 1);

    public final Object invoke(Object obj) {
        vm01 vm01Var = (vm01) obj;
        String str = vm01Var.a;
        boolean zF = o0c.F(vm01Var.I, vm01Var.g, vm01Var.h);
        boolean z = false;
        boolean z2 = vm01Var.j && sgy.a(str) && !vm01Var.k;
        if (vm01Var.s && sgy.i(str) && !zF && !vm01Var.i && !z2 && !vm01Var.w) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
