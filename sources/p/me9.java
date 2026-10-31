package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class me9 extends ne9 {
    public final String c;
    public final UUID d;

    public me9(String str, UUID uuid) {
        this.c = str;
        this.d = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me9)) {
            return false;
        }
        me9 me9Var = (me9) obj;
        return u890.j(this.c, me9Var.c) && u890.j(this.d, me9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
