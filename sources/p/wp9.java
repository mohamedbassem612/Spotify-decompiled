package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wp9 implements yp9 {
    public final ContextTrack a;
    public final String b;
    public final boolean c;

    public wp9(ContextTrack contextTrack, String str, boolean z) {
        this.a = contextTrack;
        this.b = str;
        this.c = z;
    }

    @Override // p.yp9
    public final ContextTrack a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp9)) {
            return false;
        }
        wp9 wp9Var = (wp9) obj;
        return this.a.equals(wp9Var.a) && this.b.equals(wp9Var.b) && this.c == wp9Var.c;
    }

    @Override // p.yp9
    public final String getContextUri() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
