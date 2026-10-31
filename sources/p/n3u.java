package p;

import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n3u implements Serializable {
    public static final n3u b = new n3u("Generic");
    public static final n3u c = new n3u("NotAvailable");
    public static final n3u d = new n3u("Offline");
    public static final n3u e = new n3u("PremiumUpsell");
    public final String a;

    public n3u(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
