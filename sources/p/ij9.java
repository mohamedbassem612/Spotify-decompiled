package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ij9 implements uj9 {
    public final String a;
    public final UUID b;
    public final String c;
    public final fi9 d;

    public ij9(String str, UUID uuid, String str2, fi9 fi9Var) {
        this.a = str;
        this.b = uuid;
        this.c = str2;
        this.d = fi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij9)) {
            return false;
        }
        ij9 ij9Var = (ij9) obj;
        return u890.j(this.a, ij9Var.a) && u890.j(this.b, ij9Var.b) && this.c.equals(ij9Var.c) && this.d == ij9Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
