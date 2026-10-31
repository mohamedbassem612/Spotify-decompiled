package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w2i1 implements djy0 {
    public final Uri a;

    public w2i1(String str) {
        this.a = Uri.parse(str);
    }

    public final String a() {
        String queryParameter = this.a.getQueryParameter("redirect_uri");
        return queryParameter != null ? queryParameter : "";
    }

    public final String d() {
        return this.a.getQueryParameter("code_challenge_method");
    }

    public final int e() {
        return 2;
    }

    public final boolean f() {
        return this.a.getBooleanQueryParameter("show_dialog", false);
    }

    public final String getClientId() {
        String queryParameter = this.a.getQueryParameter("client_id");
        return queryParameter != null ? queryParameter : "";
    }

    public final String getState() {
        return this.a.getQueryParameter("state");
    }

    public final String i() {
        return this.a.getQueryParameter("utm_campaign");
    }

    public final String j() {
        return this.a.getQueryParameter("utm_source");
    }

    public final String m() {
        return this.a.getQueryParameter("associated_content");
    }

    public final String n() {
        return this.a.getQueryParameter("code_challenge");
    }

    public final String[] q() {
        String queryParameter = this.a.getQueryParameter("scope");
        return queryParameter == null ? new String[0] : queryParameter.split(" ");
    }

    public final String r() {
        return this.a.getQueryParameter("utm_medium");
    }
}
