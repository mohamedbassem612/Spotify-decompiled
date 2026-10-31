package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hw31 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;
    public final String e;

    public hw31(String str, List list, int i, int i2, String str2) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw31)) {
            return false;
        }
        hw31 hw31Var = (hw31) obj;
        return u890.j(this.a, hw31Var.a) && u890.j(this.b, hw31Var.b) && this.c == hw31Var.c && this.d == hw31Var.d && u890.j(this.e, hw31Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }
}
