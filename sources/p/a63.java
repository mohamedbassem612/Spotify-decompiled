package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a63 {
    public final String a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public a63(String str, List list, String str2, String str3, String str4, boolean z, boolean z2, String str5) {
        this.a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a63)) {
            return false;
        }
        a63 a63Var = (a63) obj;
        return this.a.equals(a63Var.a) && this.b.equals(a63Var.b) && this.c.equals(a63Var.c) && this.d.equals(a63Var.d) && this.e.equals(a63Var.e) && this.f == a63Var.f && this.g == a63Var.g && this.h.equals(a63Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + xcg1.g(xcg1.g(cy30.d(cy30.d(cy30.d(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }
}
