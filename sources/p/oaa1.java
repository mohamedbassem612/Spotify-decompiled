package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oaa1 {
    public final String a;
    public final List b;

    public oaa1(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oaa1)) {
            return false;
        }
        oaa1 oaa1Var = (oaa1) obj;
        return u890.j(this.a, oaa1Var.a) && u890.j(this.b, oaa1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
