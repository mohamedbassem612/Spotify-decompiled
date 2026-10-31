package p;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class eo11 implements j8n {
    public final float a;

    public eo11(float f) {
        this.a = f;
    }

    @Override // p.j8n
    public final float a(RectF rectF) {
        return rectF.height() * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eo11) && this.a == ((eo11) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
