package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rpf1 {
    public final ContextTrack a;
    public final l4m b;
    public final boolean c;
    public final c2l d;

    public rpf1(ContextTrack contextTrack, l4m l4mVar, boolean z, c2l c2lVar) {
        this.a = contextTrack;
        this.b = l4mVar;
        this.c = z;
        this.d = c2lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpf1)) {
            return false;
        }
        rpf1 rpf1Var = (rpf1) obj;
        return this.a.equals(rpf1Var.a) && this.b == rpf1Var.b && this.c == rpf1Var.c && this.d.equals(rpf1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
