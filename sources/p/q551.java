package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q551 {
    public final String a;
    public final List b;
    public final ArrayList c;

    public q551(String str, ArrayList arrayList, List list) {
        this.a = str;
        this.b = list;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q551)) {
            return false;
        }
        q551 q551Var = (q551) obj;
        return this.a.equals(q551Var.a) && this.b.equals(q551Var.b) && this.c.equals(q551Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
