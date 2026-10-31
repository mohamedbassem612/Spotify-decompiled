package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tyd {
    public final List a;
    public final int b;
    public final boolean c;

    public tyd(int i, List list, boolean z) {
        this.a = list;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyd)) {
            return false;
        }
        tyd tydVar = (tyd) obj;
        return u890.j(this.a, tydVar.a) && this.b == tydVar.b && this.c == tydVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
