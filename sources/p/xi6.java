package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xi6 {
    public final String a;
    public final List b;
    public final String c;
    public final List d;

    public xi6(String str, String str2, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi6)) {
            return false;
        }
        xi6 xi6Var = (xi6) obj;
        return u890.j(this.a, xi6Var.a) && u890.j(this.b, xi6Var.b) && u890.j(this.c, xi6Var.c) && u890.j(this.d, xi6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
