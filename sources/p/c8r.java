package p;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c8r {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final Map d;

    public c8r(String str, String str2, Map map, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8r)) {
            return false;
        }
        c8r c8rVar = (c8r) obj;
        return this.a.equals(c8rVar.a) && this.b.equals(c8rVar.b) && this.c.equals(c8rVar.c) && this.d.equals(c8rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
