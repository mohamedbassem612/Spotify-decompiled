package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ri9 implements bj9 {
    public final String a;
    public final UUID b;
    public final String c;
    public final fi9 d;

    public ri9(String str, UUID uuid, String str2, fi9 fi9Var) {
        this.a = str;
        this.b = uuid;
        this.c = str2;
        this.d = fi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri9)) {
            return false;
        }
        ri9 ri9Var = (ri9) obj;
        return u890.j(this.a, ri9Var.a) && u890.j(this.b, ri9Var.b) && this.c.equals(ri9Var.c) && this.d == ri9Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
