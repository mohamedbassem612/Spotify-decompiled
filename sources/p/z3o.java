package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class z3o implements a4o {
    public final String a;
    public final String b;
    public final ArrayList c;

    public z3o(String str, String str2, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3o)) {
            return false;
        }
        z3o z3oVar = (z3o) obj;
        return u890.j(this.a, z3oVar.a) && u890.j(this.b, z3oVar.b) && this.c.equals(z3oVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
