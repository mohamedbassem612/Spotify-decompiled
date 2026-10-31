package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i8e0 implements b8e0 {
    public final int a;
    public final tr80 b;
    public final ArrayList c;
    public final List d;
    public final List e;
    public final boolean f;
    public final int g;

    public i8e0(int i, tr80 tr80Var, ArrayList arrayList, List list, List list2, boolean z, int i2) {
        this.a = i;
        this.b = tr80Var;
        this.c = arrayList;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = i2;
    }

    @Override // p.b8e0
    public final tr80 a() {
        return this.b;
    }

    @Override // p.b8e0
    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8e0)) {
            return false;
        }
        i8e0 i8e0Var = (i8e0) obj;
        return this.a == i8e0Var.a && u890.j(this.b, i8e0Var.b) && this.c.equals(i8e0Var.c) && this.d.equals(i8e0Var.d) && u890.j(this.e, i8e0Var.e) && this.f == i8e0Var.f && this.g == i8e0Var.g;
    }

    @Override // p.b8e0
    public final List g() {
        return this.d;
    }

    @Override // p.b8e0
    public final int getCount() {
        return this.a;
    }

    @Override // p.b8e0
    public final List getFilters() {
        return this.e;
    }

    @Override // p.b8e0
    public final List getItems() {
        return this.c;
    }

    @Override // p.b8e0
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + xcg1.g(f4i1.b(f4i1.b(p3d1.f(this.c, lf51.e(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return ryo1.A(this);
    }
}
