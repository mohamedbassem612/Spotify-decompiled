package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ihf0 implements yhf0 {
    public final ContextTrack a;
    public final String b;
    public final String c;

    public ihf0(ContextTrack contextTrack, String str, String str2) {
        this.a = contextTrack;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihf0)) {
            return false;
        }
        ihf0 ihf0Var = (ihf0) obj;
        return this.a.equals(ihf0Var.a) && this.b.equals(ihf0Var.b) && u890.j(this.c, ihf0Var.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }
}
