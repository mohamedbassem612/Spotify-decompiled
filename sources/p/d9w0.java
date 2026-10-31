package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d9w0 {
    public final e9w0 a;
    public final String b;
    public final ArrayList c;

    public d9w0(e9w0 e9w0Var, String str, ArrayList arrayList) {
        this.a = e9w0Var;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9w0)) {
            return false;
        }
        d9w0 d9w0Var = (d9w0) obj;
        return this.a.equals(d9w0Var.a) && this.b.equals(d9w0Var.b) && this.c.equals(d9w0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
