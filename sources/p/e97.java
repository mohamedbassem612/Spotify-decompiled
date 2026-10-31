package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e97 {
    public final List a;
    public final ou80 b;

    public e97(List list, ou80 ou80Var) {
        this.a = list;
        this.b = ou80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e97)) {
            return false;
        }
        e97 e97Var = (e97) obj;
        return this.a.equals(e97Var.a) && u890.j(this.b, e97Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
