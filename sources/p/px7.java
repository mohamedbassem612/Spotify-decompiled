package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class px7 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final po7 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public px7(ox7 ox7Var) {
        this.a = ox7Var.a;
        this.b = ox7Var.b;
        this.c = ox7Var.c;
        this.d = ox7Var.d;
        this.e = ox7Var.e;
        this.f = ox7Var.f;
        this.g = ox7Var.g;
        this.h = ox7Var.h;
        this.i = ox7Var.i;
        this.j = ox7Var.j;
        this.k = ox7Var.k;
    }

    public final ox7 a() {
        ox7 ox7Var = new ox7();
        ox7Var.a = this.a;
        ox7Var.b = this.b;
        ox7Var.c = this.c;
        ox7Var.d = this.d;
        ox7Var.e = this.e;
        ox7Var.f = this.f;
        ox7Var.g = this.g;
        ox7Var.h = this.h;
        ox7Var.i = this.i;
        ox7Var.j = this.j;
        ox7Var.k = this.k;
        return ox7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || px7.class != obj.getClass()) {
            return false;
        }
        px7 px7Var = (px7) obj;
        return this.a == px7Var.a && this.b == px7Var.b && this.c == px7Var.c && this.d == px7Var.d && this.e == px7Var.e && this.f == px7Var.f && this.h == px7Var.h && this.i == px7Var.i && this.j == px7Var.j && this.k == px7Var.k && this.g.equals(px7Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}
