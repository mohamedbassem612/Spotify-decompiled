package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sto0 extends omo1 {
    public final ujo0 c;
    public final List d;
    public final cvy0 e;

    public sto0(ujo0 ujo0Var, List list, cvy0 cvy0Var) {
        this.c = ujo0Var;
        this.d = list;
        this.e = cvy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sto0)) {
            return false;
        }
        sto0 sto0Var = (sto0) obj;
        return this.c.equals(sto0Var.c) && this.d.equals(sto0Var.d) && this.e.equals(sto0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f4i1.b(this.c.hashCode() * 31, 31, this.d);
    }

    public final cvy0 o() {
        return this.e;
    }
}
