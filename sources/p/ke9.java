package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ke9 extends ne9 {
    public final String c;
    public final UUID d;
    public final String e;

    public ke9(String str, UUID uuid, String str2) {
        this.c = str;
        this.d = uuid;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke9)) {
            return false;
        }
        ke9 ke9Var = (ke9) obj;
        return u890.j(this.c, ke9Var.c) && u890.j(this.d, ke9Var.d) && this.e.equals(ke9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
