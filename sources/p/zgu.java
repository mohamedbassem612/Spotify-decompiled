package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zgu {
    public final String a;
    public final n1x b;
    public final ji0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public zgu(String str, n1x n1xVar, ji0 ji0Var, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = n1xVar;
        this.c = ji0Var;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    public final n1x a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zgu)) {
            return false;
        }
        zgu zguVar = (zgu) obj;
        return u890.j(this.a, zguVar.a) && this.b.equals(zguVar.b) && this.c.equals(zguVar.c) && u890.j(this.d, zguVar.d) && u890.j(this.e, zguVar.e) && u890.j(this.f, zguVar.f) && u890.j(this.g, zguVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d(cy30.d(cy30.d((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f);
    }
}
