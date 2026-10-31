package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vj31 {
    public static final vj31 f = new vj31();
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;

    public vj31() {
        b7x b7xVar = b7x.a;
        this.a = b7xVar;
        this.b = b7xVar;
        this.c = b7xVar;
        this.d = b7xVar;
        this.e = b7xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj31)) {
            return false;
        }
        vj31 vj31Var = (vj31) obj;
        return this.a.equals(vj31Var.a) && this.b.equals(vj31Var.b) && this.c.equals(vj31Var.c) && this.d.equals(vj31Var.d) && this.e.equals(vj31Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.e(cy30.e(cy30.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
