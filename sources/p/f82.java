package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class f82 extends tv30 implements iu30 {
    public static final f82 a = new f82(1, j82.class, "toPreviousPlaylistVisit", "toPreviousPlaylistVisit(Lcom/spotify/listuxplatform/component/PreviousVisit;)Lcom/spotify/agent/recentlyadded/PreviousPlaylistVisit;", 1);

    public final Object invoke(Object obj) {
        umw0 umw0Var = (umw0) obj;
        if (umw0Var.equals(tmw0.a)) {
            return kmw0.a;
        }
        if (umw0Var.equals(smw0.a)) {
            return jmw0.a;
        }
        if (umw0Var instanceof rmw0) {
            return do01.a(Long.valueOf(((rmw0) umw0Var).a));
        }
        eg.o();
        return null;
    }
}
