package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ljs0 extends esz0 {
    public static final String c;
    public final float b;

    static {
        String str = zoi1.a;
        c = Integer.toString(1, 36);
    }

    public ljs0(float f) {
        dm5.n(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.b = f;
    }

    @Override // p.esz0
    public final boolean b() {
        return this.b != -1.0f;
    }

    @Override // p.esz0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(esz0.a, 1);
        bundle.putFloat(c, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ljs0) {
            return this.b == ((ljs0) obj).b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b));
    }

    public ljs0() {
        this.b = -1.0f;
    }
}
