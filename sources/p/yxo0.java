package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yxo0 implements eyo0 {
    public final String a;
    public final String b;
    public final List c;

    public yxo0(String str, List list, String str2) {
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
        if (!(obj instanceof yxo0)) {
            return false;
        }
        yxo0 yxo0Var = (yxo0) obj;
        return this.a.equals(yxo0Var.a) && this.b.equals(yxo0Var.b) && this.c.equals(yxo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
