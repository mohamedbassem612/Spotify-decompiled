package p;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jdz0 {
    public final UUID a;
    public final List b;

    public jdz0(UUID uuid, List list) {
        this.a = uuid;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdz0)) {
            return false;
        }
        jdz0 jdz0Var = (jdz0) obj;
        return u890.j(this.a, jdz0Var.a) && this.b.equals(jdz0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
