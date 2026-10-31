package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qey0 {
    public final ji0 a;
    public final ContextTrack b;
    public final ju0 c;
    public final boolean d;
    public final boolean e;

    public qey0(ji0 ji0Var, ContextTrack contextTrack, ju0 ju0Var, boolean z, boolean z2) {
        this.a = ji0Var;
        this.b = contextTrack;
        this.c = ju0Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qey0)) {
            return false;
        }
        qey0 qey0Var = (qey0) obj;
        return u890.j(this.a, qey0Var.a) && this.b.equals(qey0Var.b) && this.c == qey0Var.c && this.d == qey0Var.d && this.e == qey0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + xcg1.g((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }
}
