package p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qyn0 implements ryn0 {
    public final UUID a;
    public final bzn0 b;
    public final Map c;
    public final faa0 d;
    public final faa0 e;

    public qyn0(UUID uuid, bzn0 bzn0Var, Map map, faa0 faa0Var, faa0 faa0Var2) {
        this.a = uuid;
        this.b = bzn0Var;
        this.c = map;
        this.d = faa0Var;
        this.e = faa0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyn0)) {
            return false;
        }
        qyn0 qyn0Var = (qyn0) obj;
        return this.a.equals(qyn0Var.a) && this.b.equals(qyn0Var.b) && u890.j(this.c, qyn0Var.c) && this.d.equals(qyn0Var.d) && this.e.equals(qyn0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }
}
