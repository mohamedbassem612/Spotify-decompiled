package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ywe implements nye {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final rqn d;
    public final tom e;

    public ywe(String str, ArrayList arrayList, String str2, rqn rqnVar, tom tomVar) {
        this.a = str;
        this.b = arrayList;
        this.c = str2;
        this.d = rqnVar;
        this.e = tomVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywe)) {
            return false;
        }
        ywe yweVar = (ywe) obj;
        return u890.j(this.a, yweVar.a) && this.b.equals(yweVar.b) && u890.j(this.c, yweVar.c) && u890.j(this.d, yweVar.d) && u890.j(this.e, yweVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(p3d1.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c)) * 31);
    }
}
