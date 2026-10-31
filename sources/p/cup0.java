package p;

import com.spotify.player.model.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cup0 {
    public final Context a;
    public final boolean b;

    public cup0(Context context, boolean z) {
        this.a = context;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cup0)) {
            return false;
        }
        cup0 cup0Var = (cup0) obj;
        return u890.j(this.a, cup0Var.a) && this.b == cup0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
