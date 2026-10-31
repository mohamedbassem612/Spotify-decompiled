package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jof1 {
    public final ContextTrack a;
    public final vof1 b;
    public final l4m c;
    public final boolean d;
    public final gqa1 e;

    public jof1(ContextTrack contextTrack, vof1 vof1Var, l4m l4mVar, boolean z, gqa1 gqa1Var) {
        this.a = contextTrack;
        this.b = vof1Var;
        this.c = l4mVar;
        this.d = z;
        this.e = gqa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jof1)) {
            return false;
        }
        jof1 jof1Var = (jof1) obj;
        return this.a.equals(jof1Var.a) && this.b.equals(jof1Var.b) && this.c == jof1Var.c && this.d == jof1Var.d && this.e.equals(jof1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
