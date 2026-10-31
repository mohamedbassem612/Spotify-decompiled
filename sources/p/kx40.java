package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract /* synthetic */ class kx40 {
    public static int[] _values() {
        return l1d.H(7);
    }

    public static int a(int i) {
        switch (i) {
            case 0:
                return 7;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            default:
                return 0;
        }
    }

    public static final String b(int i) {
        return d(i);
    }

    public static final String c(int i) {
        if (i == 1) {
            return "none";
        }
        if (i == 2) {
            return "Android-GPBL-V1";
        }
        if (i == 3) {
            return "Android-GPBL-V2-V4";
        }
        if (i == 4) {
            return "Android-GPBL-V5-V7";
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        if (i == 1) {
            return "spotify:section:0JQ5DAroEmF9ANbLaiJ7XR";
        }
        if (i == 2) {
            return "spotify:section:0JQ5DAIiKWzVFULQfUm85Y";
        }
        throw null;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "success";
        }
        if (i == 2) {
            return "cancellation";
        }
        if (i == 3) {
            return "failure";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "webview_create";
        }
        if (i == 2) {
            return "page_load";
        }
        throw null;
    }

    public static Observable g(p6r0 p6r0Var, qir0 qir0Var, int i) {
        return Observable.just(new eir0(p6r0Var, qir0Var, i));
    }

    public static qim0 h(float f, qim0 qim0Var, boolean z) {
        return qim0Var.then(new wnb0(f, z));
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "SPOTIFY_GO_PARSE_ERROR";
        }
        if (i == 2) {
            return "SPOTIFY_GO_UNAUTHORIZED_COMMAND_TYPE";
        }
        if (i == 3) {
            return "SPOTIFY_GO_DISABLED_CLIENT_ID";
        }
        if (i == 4) {
            return "SPOTIFY_GO_UNAUTHORIZED_CLIENT_ID";
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "CACHE";
        }
        if (i == 2) {
            return "NETWORK";
        }
        throw null;
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "SHORTCUT";
        }
        if (i == 2) {
            return "HERO";
        }
        if (i == 3) {
            return "FEED";
        }
        if (i == 4) {
            return "UNKNOWN";
        }
        throw null;
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "GET";
            case 2:
                return "POST";
            case 3:
                return "PUT";
            case 4:
                return "PATCH";
            case 5:
                return "DELETE";
            case 6:
                return "HEAD";
            case 7:
                return "CONNECT";
            case 8:
                return "OPTIONS";
            case 9:
                return "TRACE";
            default:
                return "null";
        }
    }
}
