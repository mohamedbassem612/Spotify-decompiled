package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ty9 {
    public final float a;
    public final float b;
    public final List c;

    public ty9(float f, float f2, List list) {
        this.a = f;
        this.b = f2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty9)) {
            return false;
        }
        ty9 ty9Var = (ty9) obj;
        return p3v.c(this.a, ty9Var.a) && p3v.c(this.b, ty9Var.b) && this.c.equals(ty9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
