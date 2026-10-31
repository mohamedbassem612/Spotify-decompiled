package p;

import android.app.UiModeManager;
import android.os.Bundle;
import com.spotify.player.model.PlayOrigin;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cmk1 implements suk {
    public static final Set d = f46.S0(new kxh0[]{kxh0.X, kxh0.Y, kxh0.N0, kxh0.f});
    public final a050 a;
    public final lxh1 b;
    public final bj4 c;

    public cmk1(a050 a050Var, lxh1 lxh1Var, bj4 bj4Var) {
        this.a = a050Var;
        this.b = lxh1Var;
        this.c = bj4Var;
    }

    @Override // p.suk
    public final Set a() {
        return dm61.y0(uxh0.b, d);
    }

    @Override // p.suk
    public final boolean b(String str) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((xkg0) this.b.b).keySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((roa0) it.next()).a);
        }
        return o7h.p1(linkedHashSet).contains(str);
    }

    @Override // p.suk
    public final PlayOrigin c(String str) {
        return PlayOrigin.create("voice-assistant");
    }

    @Override // p.suk
    public final fzc e() {
        return fzc.c;
    }

    @Override // p.suk
    public final String f() {
        return "spotify_media_browser_voice_assistant_root";
    }

    @Override // p.suk
    public final m210 h(String str, String str2, tn31 tn31Var) {
        return this.b.k(new roa0(str)).a();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:20:0x0044  */
    @Override // p.suk
    public final String i(String str, tn31 tn31Var) {
        boolean z = tn31Var.d;
        Bundle bundle = tn31Var.h;
        char c = 0;
        if (str.equals("com.google.android.googlequicksearchbox")) {
            if (((UiModeManager) this.a.a.getValue()).getCurrentModeType() != 3) {
                if (!(bundle != null ? bundle.getBoolean("android.media.browse.ASSISTANT_DRIVING_MODE", false) : false)) {
                    if (bundle != null ? bundle.getBoolean("android.media.browse.ASSISTANT_AT_A_GLANCE", false) : false) {
                        c = z ? (char) 3 : (char) 4;
                    }
                } else if (z) {
                    c = 1;
                } else {
                    c = 2;
                }
            } else if (z) {
                c = 1;
            } else {
                c = 2;
            }
        }
        if (c == 0) {
            return null;
        }
        if (c == 1) {
            return "com.google.android.googlequicksearchbox.drivingmode.onedimensional";
        }
        if (c == 2) {
            return "com.google.android.googlequicksearchbox.drivingmode";
        }
        if (c == 3) {
            return "com.google.android.googlequicksearchbox.smartspace.onedimensional";
        }
        if (c == 4) {
            return "com.google.android.googlequicksearchbox.smartspace";
        }
        throw null;
    }

    @Override // p.suk
    public final hf61 j() {
        return hf61.c;
    }

    @Override // p.suk
    public final tn31 k(String str, tn31 tn31Var) {
        if (this.c.a()) {
            return new tn31("empty", (String) null, (String) null, false, false, (t380) null, (Bundle) null, 254);
        }
        if (str.equals("com.google.android.googlequicksearchbox.drivingmode.onedimensional")) {
            return tn31.a(tn31Var, "gadm-1-dimensional", null, 254);
        }
        if (str.equals("com.google.android.googlequicksearchbox.drivingmode")) {
            return tn31.a(tn31Var, "gadm-default", null, 254);
        }
        if (str.equals("com.google.android.googlequicksearchbox.smartspace.onedimensional")) {
            return tn31.a(tn31Var, "smart-space-1-dimensional", null, 254);
        }
        return str.equals("com.google.android.googlequicksearchbox.smartspace") ? tn31.a(tn31Var, "smart-space-default", null, 254) : tn31Var;
    }
}
