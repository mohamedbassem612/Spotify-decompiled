package p;

import com.spotify.player.model.PlayOrigin;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public interface suk {
    default Set a() {
        return uxh0.b;
    }

    boolean b(String str);

    default PlayOrigin c(String str) {
        return uxh0.a;
    }

    default vsr0 d(String str, uic uicVar) {
        return uic.d(str, f());
    }

    default fzc e() {
        return fzc.a;
    }

    default String f() {
        return "spotify_media_browser_root_default";
    }

    default ruk g(String str, String str2, tn31 tn31Var, uic uicVar) {
        return new ruk(str, tn31Var, d(str, uicVar), h(str, str2, tn31Var), a());
    }

    default m4e0 getExtras() {
        return new m4e0((byte) 6);
    }

    default m210 h(String str, String str2, tn31 tn31Var) {
        return new m210(214, "", (String) null, (String) null, "app_to_app", "app", (String) null, (String) null, str2, "media_session", str);
    }

    default String i(String str, tn31 tn31Var) {
        return null;
    }

    default hf61 j() {
        return hf61.a;
    }

    default tn31 k(String str, tn31 tn31Var) {
        return tn31Var;
    }
}
