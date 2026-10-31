package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class imv0 implements hmv0, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ imv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final boolean a(String str) {
        switch (this.a) {
            case 0:
                return str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
            case 1:
                return str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false));
            case 2:
                return upp0.b(str);
            default:
                return xrm1.a(str);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof hmv0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof hmv0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            case 2:
                if ((obj instanceof hmv0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof hmv0) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new tv30(1, (wqg) obj, wqg.class, "isClipsUri", "isClipsUri(Ljava/lang/String;)Z", 0);
            case 1:
                return new tv30(1, (agc0) obj, agc0.class, "isLikedSongsUri", "isLikedSongsUri(Ljava/lang/String;)Z", 0);
            case 2:
                return new tv30(1, (upp0) obj, upp0.class, "isOfflineBackupUri", "isOfflineBackupUri(Ljava/lang/String;)Z", 0);
            default:
                return new tv30(1, (xrm1) obj, xrm1.class, "isYourEpisodesUri", "isYourEpisodesUri(Ljava/lang/String;)Z", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
