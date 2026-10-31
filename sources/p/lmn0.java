package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lmn0 extends nmn0 {
    public final /* synthetic */ byte b;

    @Override // p.nmn0
    public final String b() {
        switch (this.b) {
            case 0:
                return null;
            case 1:
                return "com.instagram.platform.AppAuthorizeActivity";
            case 2:
                return null;
            default:
                return "com.facebook.katana.ProxyAuth";
        }
    }

    @Override // p.nmn0
    public final String c() {
        switch (this.b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return "com.facebook.orca";
            default:
                return "com.facebook.wakizashi";
        }
    }

    @Override // p.nmn0
    public String d() {
        switch (this.b) {
            case 1:
                return "token,signed_request,graph_domain,granted_scopes";
            default:
                return super.d();
        }
    }
}
