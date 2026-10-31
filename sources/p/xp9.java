package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xp9 implements yp9 {
    public final ContextTrack a;
    public final String b;
    public final String c;
    public final boolean d;

    public xp9(ContextTrack contextTrack, String str, String str2, boolean z) {
        this.a = contextTrack;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // p.yp9
    public final ContextTrack a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp9)) {
            return false;
        }
        xp9 xp9Var = (xp9) obj;
        return this.a.equals(xp9Var.a) && this.b.equals(xp9Var.b) && u890.j(this.c, xp9Var.c) && this.d == xp9Var.d;
    }

    @Override // p.yp9
    public final String getContextUri() {
        return this.b;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
