package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class u6o {
    public final String a;
    public final ArrayList b;

    public u6o(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6o)) {
            return false;
        }
        u6o u6oVar = (u6o) obj;
        return u890.j(this.a, u6oVar.a) && this.b.equals(u6oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
