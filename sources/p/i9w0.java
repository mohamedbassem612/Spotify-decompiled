package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i9w0 implements k9w0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;
    public final h290 f;

    public i9w0(String str, String str2, String str3, String str4, ArrayList arrayList, h290 h290Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = arrayList;
        this.f = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9w0)) {
            return false;
        }
        i9w0 i9w0Var = (i9w0) obj;
        return this.a.equals(i9w0Var.a) && this.b.equals(i9w0Var.b) && this.c.equals(i9w0Var.c) && this.d.equals(i9w0Var.d) && this.e.equals(i9w0Var.e) && this.f.equals(i9w0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p3d1.f(this.e, cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }
}
