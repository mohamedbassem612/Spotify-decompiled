package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class pg9 extends qg9 {
    public final String a;
    public final int b;
    public final long c;
    public final Set d;

    public pg9(String str, int i, long j, Set set) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = set;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg9)) {
            return false;
        }
        pg9 pg9Var = (pg9) obj;
        return u890.j(this.a, pg9Var.a) && this.b == pg9Var.b && this.c == pg9Var.c && this.d.equals(pg9Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.f(kaa0.f(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }
}
