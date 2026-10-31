package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uto0 extends omo1 {
    public final ujo0 c;
    public final String d;
    public final List e;
    public final cvy0 f;

    public uto0(ujo0 ujo0Var, String str, List list, cvy0 cvy0Var) {
        this.c = ujo0Var;
        this.d = str;
        this.e = list;
        this.f = cvy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uto0)) {
            return false;
        }
        uto0 uto0Var = (uto0) obj;
        return this.c.equals(uto0Var.c) && u890.j(this.d, uto0Var.d) && this.e.equals(uto0Var.e) && this.f.equals(uto0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f4i1.b(cy30.d(this.c.hashCode() * 31, 31, this.d), 31, this.e);
    }

    public final cvy0 o() {
        return this.f;
    }
}
