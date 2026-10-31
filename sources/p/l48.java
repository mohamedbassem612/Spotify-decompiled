package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l48 {
    public final ie30 a;
    public final u280 b;
    public final sqe1 c;
    public final p2i0 d;

    public l48(yu3 yu3Var) {
        this.a = (ie30) yu3Var.b;
        this.b = (u280) yu3Var.c;
        this.c = (sqe1) yu3Var.d;
        this.d = (p2i0) yu3Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l48)) {
            return false;
        }
        l48 l48Var = (l48) obj;
        return this.a.equals(l48Var.a) && Objects.equals(this.b, l48Var.b) && this.c.equals(l48Var.c) && Objects.equals(this.d, l48Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        u280 u280Var = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (u280Var == null ? 0 : u280Var.hashCode())) * 31)) * 31;
        p2i0 p2i0Var = this.d;
        return iHashCode2 + (p2i0Var != null ? p2i0Var.hashCode() : 0);
    }
}
