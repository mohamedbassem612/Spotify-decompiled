package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uwe implements nye {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final rqn d;
    public final tom e;
    public final tom f;

    public uwe(String str, ArrayList arrayList, String str2, rqn rqnVar, tom tomVar, tom tomVar2) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = rqnVar;
        this.e = tomVar;
        this.f = tomVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwe)) {
            return false;
        }
        uwe uweVar = (uwe) obj;
        return u890.j(this.a, uweVar.a) && this.b.equals(uweVar.b) && u890.j(this.c, uweVar.c) && u890.j(this.d, uweVar.d) && u890.j(this.e, uweVar.e) && u890.j(this.f, uweVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + cy30.d(p3d1.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c)) * 31)) * 31);
    }
}
