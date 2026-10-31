package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ujl {
    public final String a;
    public final List b;

    public ujl(String str, smc0 smc0Var) {
        this.a = str;
        this.b = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujl)) {
            return false;
        }
        ujl ujlVar = (ujl) obj;
        return u890.j(this.a, ujlVar.a) && this.b.equals(ujlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
