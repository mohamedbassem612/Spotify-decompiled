package p;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gql1 implements suk {
    public final Set a = f46.S0(new String[]{"com.spotify.music", "com.spotify.music.canary", "com.spotify.music.debug"});

    @Override // p.suk
    public final boolean b(String str) {
        return this.a.contains(str);
    }

    @Override // p.suk
    public final ruk g(String str, String str2, tn31 tn31Var, uic uicVar) {
        return new ruk(str, new tn31("default", (String) null, (String) null, false, false, (t380) null, (Bundle) null, 254), d(str, uicVar), h(str, str2, tn31Var), uxh0.b);
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        String str3 = tn31Var.a;
        String str4 = str3 != null ? (String) un31.a.get(str3) : null;
        if (str4 == null) {
            return new m210(470, "", (String) null, (String) null, "app_to_app", "app", (String) null, (String) null, (String) null, "media_session", str);
        }
        String str5 = tn31Var.c;
        if (str5 == null) {
            str5 = "";
        }
        return new m210(214, str4, (String) null, (String) null, "app_to_app", "widget", (String) null, (String) null, str5, "media_session", str);
    }
}
