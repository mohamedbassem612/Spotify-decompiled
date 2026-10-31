package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j46 {
    public static final Map c;
    public final dma1 a;
    public final yqg b;

    static {
        nbc nbcVar = bma1.b;
        c = sqg0.J(new mmr0[]{new mmr0("prompted_playlists", nbcVar.u("artifact_disclosure_last_shown_prompted_playlists")), new mmr0("bluejay", nbcVar.u("artifact_disclosure_last_shown_bluejay")), new mmr0("bluejay_start", nbcVar.u("artifact_disclosure_last_shown_bluejay_start"))});
    }

    public j46(yqg yqgVar, dma1 dma1Var) {
        this.a = dma1Var;
        this.b = yqgVar;
    }

    public final boolean a(String str) {
        Object obj = c.get(str);
        if (obj == null) {
            bhn0.f("No disclosure key registered for content type: ".concat(str));
            return false;
        }
        long jG = this.a.g((bma1) obj, 0L);
        if (!str.equals("bluejay_start")) {
            long jB = (this.b.b() - jG) / 86400000;
            if (jG == 0 || jB >= 30) {
                return true;
            }
        } else if (jG == 0) {
            return true;
        }
        return false;
    }
}
