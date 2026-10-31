package p;

import android.graphics.Paint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q9v {
    public final Paint a;
    public final n511 b;
    public final float c;

    public q9v(Paint paint, n511 n511Var, float f) {
        this.a = paint;
        this.b = n511Var;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9v)) {
            return false;
        }
        q9v q9vVar = (q9v) obj;
        return this.a.equals(q9vVar.a) && this.b.equals(q9vVar.b) && Float.compare(this.c, q9vVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
