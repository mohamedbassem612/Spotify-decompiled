package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tlo {
    public final Set a;
    public final String b;
    public final Set c;
    public final uio d;

    public tlo(Set set, String str, Set set2, uio uioVar) {
        this.a = set;
        this.b = str;
        this.c = set2;
        this.d = uioVar;
    }

    public final Set a() {
        return this.c;
    }

    public final Set b() {
        return this.a;
    }

    public final uio c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlo)) {
            return false;
        }
        tlo tloVar = (tlo) obj;
        return u890.j(this.a, tloVar.a) && u890.j(this.b, tloVar.b) && u890.j(this.c, tloVar.c) && u890.j(this.d, tloVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iC = gvg.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        uio uioVar = this.d;
        return iC + (uioVar != null ? uioVar.hashCode() : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tlo() {
        w7x w7xVar = w7x.a;
        this(w7xVar, null, w7xVar, null);
    }
}
