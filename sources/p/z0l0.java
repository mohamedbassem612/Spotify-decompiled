package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract /* synthetic */ class z0l0 {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "default";
        }
        if (i == 2) {
            return "sometimes";
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "already_redeemed";
            case 2:
                return "input";
            case 3:
                return "invalid_code";
            case 4:
                return "loading";
            case 5:
                return "success";
            case 6:
                return "unable_to_verify";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "client_error";
        }
        if (i == 2) {
            return "offline";
        }
        if (i == 3) {
            return "server_error";
        }
        if (i == 4) {
            return "unexpected_response";
        }
        if (i == 5) {
            return "unknown";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "already_redeemed";
            case 2:
                return "input";
            case 3:
                return "invalid_code";
            case 4:
                return "loading";
            case 5:
                return "success";
            case 6:
                return "unable_to_verify";
            default:
                throw null;
        }
    }
}
