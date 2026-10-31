package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mv20 implements nv20 {
    public final List a;
    public final ekn b;

    public mv20(List list, ekn eknVar) {
        this.a = list;
        this.b = eknVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv20)) {
            return false;
        }
        mv20 mv20Var = (mv20) obj;
        return u890.j(this.a, mv20Var.a) && u890.j(this.b, mv20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final List w() {
        return this.a;
    }
}
