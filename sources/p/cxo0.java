package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class cxo0 implements eyo0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d = z6x.a;

    public cxo0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final List a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxo0)) {
            return false;
        }
        cxo0 cxo0Var = (cxo0) obj;
        return this.a.equals(cxo0Var.a) && this.b.equals(cxo0Var.b) && this.c.equals(cxo0Var.c) && this.d.equals(cxo0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
