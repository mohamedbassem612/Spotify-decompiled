package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wee {
    public final yee a;
    public final ContextTrack b;
    public final qpu c;
    public final e090 d;

    public wee(yee yeeVar, ContextTrack contextTrack, qpu qpuVar, e090 e090Var) {
        this.a = yeeVar;
        this.b = contextTrack;
        this.c = qpuVar;
        this.d = e090Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wee)) {
            return false;
        }
        wee weeVar = (wee) obj;
        return this.a.equals(weeVar.a) && this.b.equals(weeVar.b) && this.c.equals(weeVar.c) && this.d.equals(weeVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
