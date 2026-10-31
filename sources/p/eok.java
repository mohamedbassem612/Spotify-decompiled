package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eok implements gok {
    public final String a;
    public final String b;
    public final List c;

    public eok(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    @Override // p.gok
    public final String a() {
        return this.a;
    }

    @Override // p.gok
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eok)) {
            return false;
        }
        eok eokVar = (eok) obj;
        return u890.j(this.a, eokVar.a) && u890.j(this.b, eokVar.b) && u890.j(this.c, eokVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
