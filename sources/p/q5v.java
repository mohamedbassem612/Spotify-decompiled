package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q5v {
    public final Map a;
    public final Map b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public q5v(dw91 dw91Var, dw91 dw91Var2, float f, float f2, float f3, float f4) {
        this.a = dw91Var;
        this.b = dw91Var2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5v)) {
            return false;
        }
        q5v q5vVar = (q5v) obj;
        return this.a.equals(q5vVar.a) && this.b.equals(q5vVar.b) && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.c, q5vVar.c) == 0 && Float.compare(this.d, q5vVar.d) == 0 && Float.compare(this.e, q5vVar.e) == 0 && Float.compare(this.f, q5vVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + x0d.f(x0d.f(x0d.f(x0d.f(cy30.e(this.a.hashCode() * 31, 31, this.b), 31, 0.0f), 31, this.c), 31, this.d), 31, this.e);
    }
}
