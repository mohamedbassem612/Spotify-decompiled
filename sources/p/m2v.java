package p;

import android.content.Context;
import j$.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m2v implements xpw {
    public static final String g = nik1.b2 + "?displayReason=" + URLEncoder.encode("inline_upsell:download", StandardCharsets.UTF_8.name());
    public final Context a;
    public final los b;
    public final lzn0 c;
    public final js20 d;
    public final ia00 e = n3o1.q(this).a(riu.U0, riu.V0);
    public final f70 f = new f70(14);

    public m2v(Context context, yo31 yo31Var, los losVar, lzn0 lzn0Var) {
        this.a = context;
        this.b = losVar;
        this.c = lzn0Var;
        this.d = bzn1.w(this, new r1t(1, this, m2v.class, "defaultState", "defaultState(Lcom/spotify/reinventfree/downloadupsell/element/DownloadUpsellElement$Props;)Lcom/spotify/reinventfree/upsellui/standardupsell/StandardUpsellState;", 0, (byte) 7), yo31Var, new mnl(this, (lnm) null, (byte) 18), new xx0(this, (lnm) null, (byte) 7));
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
