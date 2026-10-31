package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ghh0 {
    public final boolean a;
    public final Map b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ktl f;
    public final boolean g;
    public final boolean h;

    public ghh0(boolean z, Map map, boolean z2, boolean z3, boolean z4, ktl ktlVar, boolean z5, boolean z6) {
        this.a = z;
        this.b = map;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = ktlVar;
        this.g = z5;
        this.h = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghh0)) {
            return false;
        }
        ghh0 ghh0Var = (ghh0) obj;
        return this.a == ghh0Var.a && this.b.equals(ghh0Var.b) && this.c == ghh0Var.c && this.d == ghh0Var.d && this.e == ghh0Var.e && this.f == ghh0Var.f && this.g == ghh0Var.g && this.h == ghh0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + xcg1.g((this.f.hashCode() + xcg1.g(xcg1.g(xcg1.g(cy30.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }
}
