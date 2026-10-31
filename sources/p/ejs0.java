package p;

import androidx.compose.ui.geometry.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ejs0 implements k8n {
    public final float a;

    public ejs0(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            tf80.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // p.k8n
    public final float a(long j, wat watVar) {
        return (this.a / 100.0f) * Size.e(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejs0) && Float.compare(this.a, ((ejs0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return c13.h("CornerSize(size = ", this.a, "%)");
    }
}
