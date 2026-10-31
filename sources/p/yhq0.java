package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yhq0 implements suk {
    public static final Set a = f46.S0(new String[]{"com.coloros.alarmclock", "com.oneplus.deskclock"});

    @Override // p.suk
    public final boolean b(String str) {
        return a.contains(str);
    }

    @Override // p.suk
    public final fzc e() {
        return fzc.g;
    }

    @Override // p.suk
    public final String f() {
        return "spotify_media_browser_root_wakeup";
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return new m210(22, "Clock", (String) null, (String) null, "app_to_app", "app", "oneplus", "oneplus clock", str2, "media_session", str);
    }
}
