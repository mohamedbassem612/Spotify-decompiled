package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class s5m extends e6m {
    public final String a;
    public final String b;
    public final ArrayList c;

    public s5m(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5m)) {
            return false;
        }
        s5m s5mVar = (s5m) obj;
        return this.a.equals(s5mVar.a) && u890.j(this.b, s5mVar.b) && this.c.equals(s5mVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
