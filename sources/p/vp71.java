package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vp71 implements wp71 {
    public final int a;
    public final List b;
    public final boolean c;
    public final int d;
    public final t7q0 e;
    public final String f;
    public final za21 g;
    public final String h;

    public vp71(int i, List list, boolean z, int i2, t7q0 t7q0Var, String str, za21 za21Var) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = i2;
        this.e = t7q0Var;
        this.f = str;
        this.g = za21Var;
        this.h = str;
    }

    @Override // p.wp71
    public final t7q0 a() {
        return this.e;
    }

    @Override // p.wp71
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp71)) {
            return false;
        }
        vp71 vp71Var = (vp71) obj;
        return this.a == vp71Var.a && u890.j(this.b, vp71Var.b) && this.c == vp71Var.c && this.d == vp71Var.d && u890.j(this.e, vp71Var.e) && u890.j(this.f, vp71Var.f) && this.g.equals(vp71Var.g);
    }

    @Override // p.wp71
    public final String getChatUri() {
        return this.f;
    }

    @Override // p.wp71
    public final String getDestination() {
        return this.h;
    }

    @Override // p.wp71
    public final boolean getEnabled() {
        return this.c;
    }

    @Override // p.wp71
    public final int getPosition() {
        return this.a;
    }

    public final int hashCode() {
        return this.g.hashCode() + cy30.d((this.e.hashCode() + ab80.k(this.d, xcg1.g(f4i1.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f);
    }
}
