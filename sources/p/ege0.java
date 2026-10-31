package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ege0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final ContextTrack d;

    public ege0(ContextTrack contextTrack, String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = contextTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ege0)) {
            return false;
        }
        ege0 ege0Var = (ege0) obj;
        return this.a.equals(ege0Var.a) && this.b == ege0Var.b && this.c.equals(ege0Var.c) && u890.j(this.d, ege0Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ContextTrack contextTrack = this.d;
        return iD + (contextTrack == null ? 0 : contextTrack.hashCode());
    }
}
