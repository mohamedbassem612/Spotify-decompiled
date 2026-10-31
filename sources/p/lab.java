package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lab implements v5b1 {
    public static final ll0 d = new ll0((byte) 20);
    public final Map a;
    public final String b;
    public final String c;

    public lab(String str, String str2, Map map) {
        this.a = map;
        this.b = str;
        this.c = str2;
    }

    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lab)) {
            return false;
        }
        lab labVar = (lab) obj;
        return u890.j(this.a, labVar.a) && u890.j(this.b, labVar.b) && u890.j(this.c, labVar.c);
    }

    public final b3i1 getType() {
        return d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
