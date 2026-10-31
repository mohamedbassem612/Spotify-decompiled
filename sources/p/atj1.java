package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class atj1 {
    public final String a;
    public final List b;

    public atj1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atj1)) {
            return false;
        }
        atj1 atj1Var = (atj1) obj;
        return this.a.equals(atj1Var.a) && this.b.equals(atj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
