package p;

import android.graphics.Typeface;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yk5 {
    public final Typeface a;
    public final String b;
    public final int c;

    public yk5(Typeface typeface, String str, int i) {
        this.a = typeface;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yk5)) {
            return false;
        }
        yk5 yk5Var = (yk5) obj;
        return this.c == yk5Var.c && Objects.equals(this.a, yk5Var.a) && Objects.equals(this.b, yk5Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }
}
