package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w7l1 {
    public final t7l1 a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final u7h g;

    public /* synthetic */ w7l1(t7l1 t7l1Var, String str, String str2, String str3, String str4, u7h u7hVar, int i) {
        this(t7l1Var, str, str2, str3, str4, UUID.randomUUID().toString(), (i & 64) != 0 ? null : u7hVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7l1)) {
            return false;
        }
        w7l1 w7l1Var = (w7l1) obj;
        return u890.j(this.a, w7l1Var.a) && u890.j(this.b, w7l1Var.b) && u890.j(this.c, w7l1Var.c) && u890.j(this.d, w7l1Var.d) && u890.j(this.e, w7l1Var.e) && u890.j(this.f, w7l1Var.f) && u890.j(this.g, w7l1Var.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        u7h u7hVar = this.g;
        return iD + (u7hVar == null ? 0 : z4h1.c(u7hVar.a));
    }

    public w7l1(t7l1 t7l1Var, String str, String str2, String str3, String str4, String str5, u7h u7hVar) {
        this.a = t7l1Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = u7hVar;
    }
}
