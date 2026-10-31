package p;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class asw0 {
    public final Context a;
    public final UUID b;

    public asw0(Context context, UUID uuid) {
        this.a = context;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asw0)) {
            return false;
        }
        asw0 asw0Var = (asw0) obj;
        return u890.j(this.a, asw0Var.a) && this.b.equals(asw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
