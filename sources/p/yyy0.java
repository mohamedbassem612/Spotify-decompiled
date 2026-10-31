package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yyy0 {
    public final String a;
    public final List b;
    public final String c;

    public yyy0(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyy0)) {
            return false;
        }
        yyy0 yyy0Var = (yyy0) obj;
        return this.a.equals(yyy0Var.a) && this.b.equals(yyy0Var.b) && this.c.equals(yyy0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f4i1.b(this.a.hashCode() * 31, 31, this.b);
    }
}
