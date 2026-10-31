package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b6e {
    public final String a;
    public final ArrayList b;
    public final List c;

    public b6e(String str, ArrayList arrayList, List list) {
        this.a = str;
        this.b = arrayList;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6e)) {
            return false;
        }
        b6e b6eVar = (b6e) obj;
        return this.a.equals(b6eVar.a) && this.b.equals(b6eVar.b) && u890.j(this.c, b6eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + p3d1.f(this.b, this.a.hashCode() * 31, 31);
    }
}
