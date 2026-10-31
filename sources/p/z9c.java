package p;

import androidx.compose.ui.graphics.Brush;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z9c implements j8e1 {
    public final zv61 a;
    public final float b;

    public z9c(zv61 zv61Var, float f) {
        this.a = zv61Var;
        this.b = f;
    }

    @Override // p.j8e1
    public final long a() {
        int i = u7h.l;
        return nfb.p();
    }

    @Override // p.j8e1
    public final float b() {
        return this.b;
    }

    @Override // p.j8e1
    public final Brush c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9c)) {
            return false;
        }
        z9c z9cVar = (z9c) obj;
        return this.a.equals(z9cVar.a) && Float.compare(this.b, z9cVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
