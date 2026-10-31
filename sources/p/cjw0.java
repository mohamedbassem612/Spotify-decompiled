package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cjw0 {
    public final String a;
    public final List b;

    public cjw0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjw0)) {
            return false;
        }
        cjw0 cjw0Var = (cjw0) obj;
        return this.a.equals(cjw0Var.a) && this.b.equals(cjw0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
