package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bxo0 implements eyo0 {
    public final String a;
    public final String b;
    public final List c;

    public bxo0(String str, List list, String str2) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final List a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxo0)) {
            return false;
        }
        bxo0 bxo0Var = (bxo0) obj;
        return this.a.equals(bxo0Var.a) && this.b.equals(bxo0Var.b) && this.c.equals(bxo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
