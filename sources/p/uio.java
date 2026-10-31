package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class uio implements ez00 {
    public final String a;
    public final two1 b;
    public final List c;

    public uio(String str, two1 two1Var, List list) {
        this.a = str;
        this.b = two1Var;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uio)) {
            return false;
        }
        uio uioVar = (uio) obj;
        return u890.j(this.a, uioVar.a) && this.b.equals(uioVar.b) && this.c.equals(uioVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
