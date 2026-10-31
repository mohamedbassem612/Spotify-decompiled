package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cwf0 implements jbh0 {
    public final /* synthetic */ byte a;

    @Override // p.jbh0
    public final String description() {
        switch (this.a) {
            case 0:
                return "Matches against magic link URIs when user is already authenticated";
            case 1:
                return "of type NATURAL_LANGUAGE_URI";
            default:
                return "Matches against parental consent flow URLs";
        }
    }

    @Override // p.jbh0
    public final boolean match(Object obj) {
        Uri uri;
        String path;
        switch (this.a) {
            case 0:
                qs31 qs31Var = (qs31) ((js31) obj);
                String dataString = qs31Var.a.getDataString();
                if (dataString != null && nhc1.Y(dataString, "https://accounts.spotify.com/login/ott/music", false)) {
                    return qs31Var.b.b;
                }
                return false;
            case 1:
                String strZ = ((s4b1) obj).z();
                if (strZ == null || (uri = Uri.parse(strZ)) == null) {
                    return false;
                }
                return don1.x(uri);
            default:
                Uri data = ((qs31) ((js31) obj)).a.getData();
                if (data == null) {
                    return false;
                }
                if (!u890.j(data.getHost(), "www.spotify.com") && !u890.j(data.getHost(), "spotify.com")) {
                    return false;
                }
                String path2 = data.getPath();
                return (path2 != null && ihc1.h0(path2, "/account/parental-consent/create-managed-account", false)) || ((path = data.getPath()) != null && ihc1.h0(path, "/account/parental-consent/change-to-managed-account", false));
        }
    }
}
