package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vc61 {
    public final boolean a;
    public final crb b;
    public final List c;

    public vc61(boolean z, crb crbVar, List list) {
        this.a = z;
        this.b = crbVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc61)) {
            return false;
        }
        vc61 vc61Var = (vc61) obj;
        return this.a == vc61Var.a && this.b.equals(vc61Var.b) && u890.j(this.c, vc61Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }
}
