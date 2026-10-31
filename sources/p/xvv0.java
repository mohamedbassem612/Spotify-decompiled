package p;

import j$.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xvv0 {
    public static final String d = "spotify:premium-destination?displayReason=".concat(URLEncoder.encode("shuffle_toggle_upsell", StandardCharsets.UTF_8.name()));
    public final lzn0 a;
    public final los b;
    public final q8n c;

    public xvv0(q8n q8nVar, los losVar, lzn0 lzn0Var) {
        this.a = lzn0Var;
        this.b = losVar;
        this.c = q8nVar;
    }
}
