package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class fa01 {
    public final List a;
    public final String b;
    public final String c;

    public fa01(String str, List list, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa01)) {
            return false;
        }
        fa01 fa01Var = (fa01) obj;
        return this.a.equals(fa01Var.a) && this.b.equals(fa01Var.b) && this.c.equals(fa01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
