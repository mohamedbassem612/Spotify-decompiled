package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class udu0 {
    public final String a;
    public final ContextTrack b;
    public final String c;
    public final String d;
    public final boolean e;

    public udu0(String str, ContextTrack contextTrack, String str2, String str3, boolean z) {
        this.a = str;
        this.b = contextTrack;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udu0)) {
            return false;
        }
        udu0 udu0Var = (udu0) obj;
        return u890.j(this.a, udu0Var.a) && u890.j(this.b, udu0Var.b) && this.c.equals(udu0Var.c) && this.d.equals(udu0Var.d) && this.e == udu0Var.e;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ContextTrack contextTrack = this.b;
        return Boolean.hashCode(this.e) + cy30.d(cy30.d((iHashCode + (contextTrack != null ? contextTrack.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }
}
