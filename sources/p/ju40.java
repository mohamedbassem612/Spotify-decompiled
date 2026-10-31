package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ju40 implements uxh0 {
    public static final PlayOrigin d;
    public final g8q c;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("xr-glasses");
        a690 a690Var = b690.a;
        d = builder.referrerIdentifier("xr-glasses").build();
    }

    public ju40(g8q g8qVar) {
        this.c = g8qVar;
    }

    @Override // p.uxh0
    public final m210 a(String str) {
        String str2;
        Object next;
        d7 d7Var = new d7(nkm1.b, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                str2 = str;
                next = null;
                break;
            }
            next = d7Var.next();
            ((nkm1) next).getClass();
            str2 = str;
        } while (!"com.google.android.glasses.core".equals(str2));
        nkm1 nkm1Var = (nkm1) next;
        String str3 = nkm1Var != null ? "Google" : null;
        String str4 = str3 == null ? "" : str3;
        String str5 = nkm1Var != null ? "AI Glasses" : null;
        return new m210(278, "xr_glasses", (String) null, (String) null, "app_to_app", "face_wearable", str4, str5 == null ? "" : str5, (String) null, "media_session", str2);
    }

    @Override // p.uxh0
    public final boolean b(String str) {
        t0z t0zVar = nkm1.b;
        if (!t0zVar.isEmpty()) {
            d7 d7Var = new d7(t0zVar, (byte) 0);
            while (d7Var.hasNext()) {
                ((nkm1) d7Var.next()).getClass();
                if ("com.google.android.glasses.core".equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p.uxh0
    public final lxh0 c(x610 x610Var, int i) {
        return this.c.b(x610Var, d, i);
    }
}
