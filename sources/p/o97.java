package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o97 {
    public final String a;
    public final List b;
    public final int c;
    public final boolean d;

    public o97(int i, String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o97)) {
            return false;
        }
        o97 o97Var = (o97) obj;
        return this.a.equals(o97Var.a) && this.b.equals(o97Var.b) && this.c == o97Var.c && this.d == o97Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + kaa0.f(this.c, f4i1.b(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
