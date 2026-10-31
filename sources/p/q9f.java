package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q9f {
    public final String a;
    public final String b;
    public final LinkedHashMap c;
    public final List d;
    public final List e;
    public final String f;

    public q9f(String str, String str2, LinkedHashMap linkedHashMap, List list, List list2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = linkedHashMap;
        this.d = list;
        this.e = list2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9f)) {
            return false;
        }
        q9f q9fVar = (q9f) obj;
        return u890.j(this.a, q9fVar.a) && u890.j(this.b, q9fVar.b) && this.c.equals(q9fVar.c) && this.d.equals(q9fVar.d) && this.e.equals(q9fVar.e) && u890.j(this.f, q9fVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iB = f4i1.b(f4i1.b((this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
        String str3 = this.f;
        return iB + (str3 != null ? str3.hashCode() : 0);
    }
}
