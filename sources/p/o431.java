package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o431 implements q431 {
    public final String a;
    public final ArrayList b;
    public final boolean c;
    public final int d;
    public final String e;
    public final boolean f;

    public o431(String str, ArrayList arrayList, boolean z, int i, String str2, boolean z2) {
        this.a = str;
        this.b = arrayList;
        this.c = z;
        this.d = i;
        this.e = str2;
        this.f = z2;
    }

    public final String a() {
        return this.e;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o431)) {
            return false;
        }
        o431 o431Var = (o431) obj;
        return this.a.equals(o431Var.a) && this.b.equals(o431Var.b) && this.c == o431Var.c && this.d == o431Var.d && this.e.equals(o431Var.e) && this.f == o431Var.f;
    }

    public final String getUrl() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + cy30.d(kaa0.f(this.d, xcg1.g(p3d1.f(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e);
    }
}
