package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dwq {
    public final String a;
    public final String b;
    public final boolean c;
    public final Map d;

    public dwq(String str, String str2, boolean z, Map map) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwq)) {
            return false;
        }
        dwq dwqVar = (dwq) obj;
        return this.a.equals(dwqVar.a) && u890.j(this.b, dwqVar.b) && this.c == dwqVar.c && this.d.equals(dwqVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }
}
