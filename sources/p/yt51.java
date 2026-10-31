package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class yt51 implements iv30 {
    public final /* synthetic */ ju51 a;

    public yt51(ju51 ju51Var) {
        this.a = ju51Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yt51) {
            return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
        }
        return false;
    }

    public final cv30 getFunctionDelegate() {
        return new tv30(2, this.a, ju51.class, "launchAddToPlaylist", "launchAddToPlaylist(Lcom/spotify/addtoplaylist/navigation/AddToPlaylistPageInput;Lcom/spotify/ubi/logger/InteractionLoggingResult;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
