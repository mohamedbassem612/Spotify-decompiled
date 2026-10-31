package p;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c32 implements j8n {
    public final j8n a;
    public final float b;

    public c32(float f, j8n j8nVar) {
        while (j8nVar instanceof c32) {
            j8nVar = ((c32) j8nVar).a;
            f += ((c32) j8nVar).b;
        }
        this.a = j8nVar;
        this.b = f;
    }

    @Override // p.j8n
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c32)) {
            return false;
        }
        c32 c32Var = (c32) obj;
        return this.a.equals(c32Var.a) && this.b == c32Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
