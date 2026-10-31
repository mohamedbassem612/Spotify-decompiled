package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qlm implements ki0 {
    public final String a;
    public final String b;
    public final String c;

    public qlm(ContextTrack contextTrack) {
        String str;
        String str2 = (String) contextTrack.metadata().get("advertiser");
        this.a = str2 == null ? "" : str2;
        this.b = (!Boolean.parseBoolean((String) contextTrack.metadata().get("is_connect_cta_enabled")) || (str = (String) contextTrack.metadata().get("click_url")) == null) ? "" : str;
        String str3 = (String) contextTrack.metadata().get("ad_id");
        this.c = str3 != null ? str3 : "";
    }

    public final String a() {
        return this.c;
    }

    public final String g() {
        return this.b;
    }

    public final String h() {
        return "";
    }

    public final String j() {
        return this.a;
    }

    public final String k() {
        return "";
    }
}
