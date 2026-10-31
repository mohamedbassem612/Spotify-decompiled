package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uo91 {
    public final String a;
    public final String b;
    public final List c;

    public uo91(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo91)) {
            return false;
        }
        uo91 uo91Var = (uo91) obj;
        return this.a.equals(uo91Var.a) && this.b.equals(uo91Var.b) && this.c.equals(uo91Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
