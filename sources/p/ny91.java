package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ny91 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        ytw0 ytw0Var = jfv.b;
        a = fdg1.k0(10, ngv.SECONDS);
    }

    public static final String a(ko90 ko90Var) {
        int iOrdinal = ko90Var.ordinal();
        if (iOrdinal == 0) {
            return "MDNS";
        }
        if (iOrdinal == 1) {
            return "CONNECT";
        }
        if (iOrdinal == 2) {
            return "SOCIAL_RADAR_NEARBY";
        }
        if (iOrdinal == 3) {
            return "LINK";
        }
        if (iOrdinal == 4) {
            return "LISTENING_ACTIVITY";
        }
        eg.o();
        return null;
    }
}
