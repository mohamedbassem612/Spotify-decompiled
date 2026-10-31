package p;

import android.content.Context;
import j$.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ahl1 implements xpw {
    public static final String h = nik1.b2 + "?displayReason=" + URLEncoder.encode("inline_upsell:download", StandardCharsets.UTF_8.name());
    public final Context a;
    public final los b;
    public final lzn0 c;
    public final ynb0 d;
    public final js20 e;
    public final ia00 f;
    public final f70 g;

    public ahl1(Context context, yo31 yo31Var, los losVar, lzn0 lzn0Var, ynb0 ynb0Var) {
        this.a = context;
        this.b = losVar;
        this.c = lzn0Var;
        this.d = ynb0Var;
        losVar.c(new tak1(this, (byte) 21));
        this.e = bzn1.w(this, new zgl1(1, this, ahl1.class, "defaultState", "defaultState(Lkotlin/Unit;)Lcom/spotify/reinventfree/upsellui/standardupsell/StandardUpsellState;", 0, (byte) 0), yo31Var, new bu51(this, (lnm) null, (byte) 22), new xx0(this, (lnm) null, (byte) 28));
        this.f = n3o1.q(this).a(cxj1.c1, cxj1.d1);
        this.g = new f70((byte) 19);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
