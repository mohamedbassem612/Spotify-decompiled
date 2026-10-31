package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wwe implements nye {
    public final String a;
    public final ArrayList b;
    public final String c;
    public final rqn d;
    public final tom e;

    public wwe(String str, ArrayList arrayList, String str2, rqn rqnVar, tom tomVar) {
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
        if (!(obj instanceof wwe)) {
            return false;
        }
        wwe wweVar = (wwe) obj;
        return u890.j(this.a, wweVar.a) && this.b.equals(wweVar.b) && u890.j(this.c, wweVar.c) && u890.j(this.d, wweVar.d) && u890.j(this.e, wweVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d(p3d1.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c)) * 31);
    }
}
