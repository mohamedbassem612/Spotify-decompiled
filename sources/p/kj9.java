package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kj9 implements uj9 {
    public final String a;
    public final UUID b;
    public final String c;
    public final fi9 d;

    public kj9(String str, UUID uuid, String str2, fi9 fi9Var) {
        this.a = str;
        this.b = uuid;
        this.c = str2;
        this.d = fi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj9)) {
            return false;
        }
        kj9 kj9Var = (kj9) obj;
        return u890.j(this.a, kj9Var.a) && u890.j(this.b, kj9Var.b) && this.c.equals(kj9Var.c) && this.d == kj9Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }
}
