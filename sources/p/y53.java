package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y53 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final e5r e;
    public final List f = z6x.a;
    public final boolean g;
    public final boolean h;

    public y53(String str, String str2, String str3, String str4, e5r e5rVar, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = e5rVar;
        this.g = z;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y53)) {
            return false;
        }
        y53 y53Var = (y53) obj;
        return this.a.equals(y53Var.a) && this.b.equals(y53Var.b) && this.c.equals(y53Var.c) && this.d.equals(y53Var.d) && this.e.equals(y53Var.e) && this.f.equals(y53Var.f) && this.g == y53Var.g && this.h == y53Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g(f4i1.b((this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
    }
}
