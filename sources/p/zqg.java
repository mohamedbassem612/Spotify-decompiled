package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zqg implements suk {
    public final /* synthetic */ byte a;

    @Override // p.suk
    public final boolean b(String str) {
        switch (this.a) {
            case 0:
                return "com.spotify.clockexample".equals(str);
            default:
                return "com.android.deskclock".equals(str);
        }
    }

    @Override // p.suk
    public final fzc e() {
        byte b = this.a;
        return fzc.g;
    }

    @Override // p.suk
    public final String f() {
        switch (this.a) {
        }
        return "spotify_media_browser_root_wakeup";
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        switch (this.a) {
            case 0:
                return new m210(22, "Clock", (String) null, (String) null, "app_to_app", "app", "spotify", "MBS clock example", str2, "media_session", str);
            default:
                return new m210(22, "Clock", (String) null, (String) null, "app_to_app", "app", "vivo", "vivo clock", str2, "media_session", str);
        }
    }
}
