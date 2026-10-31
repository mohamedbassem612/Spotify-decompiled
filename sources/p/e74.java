package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e74 implements x310 {
    public final /* synthetic */ byte a;
    public final ynb0 b;

    public /* synthetic */ e74(ynb0 ynb0Var, byte b) {
        this.a = b;
        this.b = ynb0Var;
    }

    public final boolean a(r9c r9cVar) {
        switch (this.a) {
            case 0:
                return u890.j(r9cVar.b, "com.spotify.androidauto.offline.home");
            case 1:
                return nhc1.Y(r9cVar.b, "spotify_media_browser_root_android_auto", false);
            default:
                return "spotify_root_media_resumption".equals(r9cVar.b);
        }
    }

    public final w310 b(r9c r9cVar) {
        byte b = this.a;
        ynb0 ynb0Var = this.b;
        switch (b) {
            case 0:
                return (w310) ynb0Var.get();
            case 1:
                return (w310) ynb0Var.get();
            default:
                return (un01) ynb0Var.get();
        }
    }
}
