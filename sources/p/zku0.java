package p;

import android.content.res.Resources;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zku0 extends bey {
    public final zwm1 b;
    public final rpg c;
    public final rpg d;
    public final boolean e;
    public final i5y0 f;

    public zku0(wqg wqgVar, zwm1 zwm1Var, rpg rpgVar, rpg rpgVar2, boolean z, i5y0 i5y0Var) {
        super(aey.t);
        this.b = zwm1Var;
        this.c = rpgVar;
        this.d = rpgVar2;
        this.e = z;
        this.f = i5y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    @Override // p.bey
    public final String b(ttm1 ttm1Var, pey peyVar) {
        xlu0 xlu0Var;
        Set set = peyVar.e;
        String str = ttm1Var.a;
        if (u890.j(str, "spotify:playlist:37i9dQZF1FgnTBfUlzkeKt")) {
            return this.d.a(ttm1Var, peyVar);
        }
        if (str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD")) {
            return this.c.a(ttm1Var, peyVar);
        }
        boolean z = false;
        boolean z2 = (set.contains("playlists") || set.contains("downloaded_playlists") || peyVar.a) ? false : true;
        String string = null;
        if (u890.j(ttm1.i.get(ttm1Var.e), xlu0.class)) {
            nb10 nb10Var = ttm1Var.g;
            if (nb10Var == null) {
                bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.PlaylistExtraInfo");
                return null;
            }
            xlu0Var = (xlu0) nb10Var;
        } else {
            xlu0Var = null;
        }
        if (xlu0Var == null) {
            return null;
        }
        boolean z3 = xlu0Var.f;
        String str2 = xlu0Var.b;
        String str3 = xlu0Var.a;
        boolean zG = this.f.g();
        boolean z4 = this.e;
        zwm1 zwm1Var = this.b;
        if (!zG || !xlu0Var.h) {
            if (z3 && z4) {
                z = true;
            }
            return zwm1Var.e(str3, z2, str2, z);
        }
        int i = xlu0Var.g;
        Resources resources = zwm1Var.b;
        int iC = l1d.C(i);
        if (iC == 0) {
            if (str3 != null && str3.length() != 0) {
                if (z2) {
                    string = resources.getString(2131956866, str3);
                } else {
                    string = resources.getString(2131956865, str3);
                }
            }
        } else if (iC == 1) {
            string = str2.length() > 0 ? resources.getString(2131956863, str2) : resources.getString(2131956865, str3);
            string.getClass();
            if (z2 && str2.length() > 0) {
                string = resources.getString(2131956868, str2);
            } else if (z2 && str3 != null && str3.length() != 0) {
                string = resources.getString(2131956866, str3);
            } else if (z2) {
                string = resources.getString(2131956867);
            }
        } else if (iC == 2 || iC == 3) {
            string = resources.getString(2131956857);
        } else {
            if (iC != 4) {
                eg.o();
                return null;
            }
            if (str3 != null) {
                if (z2) {
                    string = resources.getString(2131956866, str3);
                } else {
                    string = resources.getString(2131956865, str3);
                }
            }
        }
        if (string != null) {
            return string;
        }
        if (z3 && z4) {
            z = true;
        }
        return zwm1Var.e(str3, z2, str2, z);
    }
}
