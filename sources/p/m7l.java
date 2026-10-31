package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class m7l implements v5b1 {
    public static final bgc e = new bgc((byte) 7);
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public m7l(String str, String str2, String str3, Map map) {
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
    }

    public final int a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7l)) {
            return false;
        }
        m7l m7lVar = (m7l) obj;
        return this.a.equals(m7lVar.a) && u890.j(this.b, m7lVar.b) && u890.j(this.c, m7lVar.c) && u890.j(this.d, m7lVar.d);
    }

    public final b3i1 getType() {
        return e;
    }

    public final int hashCode() {
        int iE = cy30.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31);
    }
}
