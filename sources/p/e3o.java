package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e3o implements z0i {
    public final h290 a;
    public final ArrayList b;
    public final String c;
    public final String d;
    public final a3o e;
    public final c3o f;
    public final String g;

    public e3o(h290 h290Var, ArrayList arrayList, String str, String str2, a3o a3oVar, c3o c3oVar, String str3) {
        this.a = h290Var;
        this.b = arrayList;
        this.c = str;
        this.d = str2;
        this.e = a3oVar;
        this.f = c3oVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3o)) {
            return false;
        }
        e3o e3oVar = (e3o) obj;
        return this.a.equals(e3oVar.a) && this.b.equals(e3oVar.b) && this.c.equals(e3oVar.c) && this.d.equals(e3oVar.d) && u890.j(this.e, e3oVar.e) && this.f.equals(e3oVar.f) && this.g.equals(e3oVar.g);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        a3o a3oVar = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((iD + (a3oVar == null ? 0 : a3oVar.hashCode())) * 31)) * 31);
    }
}
