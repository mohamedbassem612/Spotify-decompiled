package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vwe implements nye {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final rqn d;
    public final tom e;
    public final tom f;

    public vwe(String str, ArrayList arrayList, String str2, rqn rqnVar, tom tomVar, tom tomVar2) {
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
        if (!(obj instanceof vwe)) {
            return false;
        }
        vwe vweVar = (vwe) obj;
        return u890.j(this.a, vweVar.a) && this.b.equals(vweVar.b) && u890.j(this.c, vweVar.c) && u890.j(this.d, vweVar.d) && u890.j(this.e, vweVar.e) && u890.j(this.f, vweVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + cy30.d(p3d1.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c)) * 31)) * 31);
    }
}
