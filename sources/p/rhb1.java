package p;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rhb1 extends esz0 {
    public static final String d;
    public static final String e;
    public final int b;
    public final float c;

    static {
        String str = zoi1.a;
        d = Integer.toString(1, 36);
        e = Integer.toString(2, 36);
    }

    public rhb1(int i, float f) {
        boolean z = false;
        dm5.n(i > 0, "maxStars must be a positive integer");
        if (f >= 0.0f && f <= i) {
            z = true;
        }
        dm5.n(z, "starRating is out of range [0, maxStars]");
        this.b = i;
        this.c = f;
    }

    @Override // p.esz0
    public final boolean b() {
        return this.c != -1.0f;
    }

    @Override // p.esz0
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(esz0.a, 2);
        bundle.putInt(d, this.b);
        bundle.putFloat(e, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rhb1)) {
            return false;
        }
        rhb1 rhb1Var = (rhb1) obj;
        return this.b == rhb1Var.b && this.c == rhb1Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), Float.valueOf(this.c));
    }

    public rhb1(int i) {
        dm5.n(i > 0, "maxStars must be a positive integer");
        this.b = i;
        this.c = -1.0f;
    }
}
