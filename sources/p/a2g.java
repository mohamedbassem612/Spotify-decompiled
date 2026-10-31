package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a2g implements n6r0 {
    public static final a2g b = new a2g(0);
    public static final a2g c = new a2g(1);
    public static final a2g d = new a2g(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ a2g(byte b2) {
        this.a = b2;
    }

    public final String a() {
        switch (this.a) {
            case 0:
                return "gen-alpha";
            case 1:
                return "webviewprod";
            case 2:
                return "world";
            case 3:
                return "audiobookseries";
            case 4:
                return "trending-near-you";
            default:
                return "chat";
        }
    }

    public final String path() {
        switch (this.a) {
            case 0:
                return "child-login";
            case 1:
                return "webview-prod-page";
            case 2:
                return "world-web-page";
            case 3:
                return "seriespage";
            case 4:
                return "trending-near-you/location-search";
            default:
                return "chat/trusted-circle";
        }
    }
}
