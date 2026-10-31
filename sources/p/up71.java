package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class up71 implements wp71 {
    public final int a;
    public final List b;
    public final String c;
    public final boolean d;
    public final int e;
    public final t7q0 f;
    public final String g;
    public final int h;
    public final String i;

    public up71(int i, List list, String str, boolean z, int i2, t7q0 t7q0Var, String str2, int i3) {
        this.a = i;
        this.b = list;
        this.c = str;
        this.d = z;
        this.e = i2;
        this.f = t7q0Var;
        this.g = str2;
        this.h = i3;
        this.i = str2;
    }

    public final t7q0 a() {
        return this.f;
    }

    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up71)) {
            return false;
        }
        up71 up71Var = (up71) obj;
        return this.a == up71Var.a && u890.j(this.b, up71Var.b) && u890.j(this.c, up71Var.c) && this.d == up71Var.d && this.e == up71Var.e && u890.j(this.f, up71Var.f) && u890.j(this.g, up71Var.g) && this.h == up71Var.h;
    }

    public final String getChatUri() {
        return this.g;
    }

    public final String getDestination() {
        return this.i;
    }

    public final boolean getEnabled() {
        return this.d;
    }

    public final int getPosition() {
        return this.a;
    }

    public final int hashCode() {
        return l1d.C(this.h) + cy30.d((this.f.hashCode() + ab80.k(this.e, xcg1.g(cy30.d(f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31)) * 31, 31, this.g);
    }
}
