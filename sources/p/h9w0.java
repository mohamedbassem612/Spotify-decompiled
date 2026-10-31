package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h9w0 implements k9w0 {
    public final String a;
    public final String b;
    public final ArrayList c;
    public final h290 d;

    public h9w0(String str, String str2, ArrayList arrayList, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9w0)) {
            return false;
        }
        h9w0 h9w0Var = (h9w0) obj;
        return this.a.equals(h9w0Var.a) && this.b.equals(h9w0Var.b) && this.c.equals(h9w0Var.c) && this.d.equals(h9w0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p3d1.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
