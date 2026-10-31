package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qlb0 {
    public final UUID a;
    public final Integer b;

    public qlb0(UUID uuid, Integer num) {
        this.a = uuid;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlb0)) {
            return false;
        }
        qlb0 qlb0Var = (qlb0) obj;
        return this.a.equals(qlb0Var.a) && u890.j(this.b, qlb0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
