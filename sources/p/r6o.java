package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r6o {
    public final String a;
    public final ArrayList b;

    public r6o(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6o)) {
            return false;
        }
        r6o r6oVar = (r6o) obj;
        return this.a.equals(r6oVar.a) && this.b.equals(r6oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
