package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tuh0 implements suk {
    public static final Set b = f46.S0(new String[]{"com.android.systemui.aod", "com.android.systemui", "com.spotify.music.notification"});
    public final f831 a;

    public tuh0(f831 f831Var) {
        this.a = f831Var;
    }

    @Override // p.suk
    public final boolean b(String str) {
        return b.contains(str);
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return this.a.a(str);
    }

    @Override // p.suk
    public final String i(String str, tn31 tn31Var) {
        if (str.equals("com.android.systemui") && tn31Var.f) {
            return "com.android.systemui.recent";
        }
        return null;
    }
}
