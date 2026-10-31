package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zez0 {
    public final Context a;
    public final gw70 b;

    public zez0(Context context, gw70 gw70Var) {
        this.a = context;
        this.b = gw70Var;
    }

    public final Context a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zez0)) {
            return false;
        }
        zez0 zez0Var = (zez0) obj;
        return u890.j(this.a, zez0Var.a) && u890.j(this.b, zez0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
