package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ved1 {
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;

    public ved1(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ved1)) {
            return false;
        }
        ved1 ved1Var = (ved1) obj;
        return this.a.equals(ved1Var.a) && this.b.equals(ved1Var.b) && this.c == ved1Var.c && this.d.equals(ved1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
