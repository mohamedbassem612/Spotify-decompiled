package p;

import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rx70 implements sx70 {
    public final RectF a;

    public rx70(RectF rectF) {
        this.a = rectF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx70) && u890.j(this.a, ((rx70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
